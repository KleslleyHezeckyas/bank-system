package com.example.banksystem.service.impl;

import com.example.banksystem.entity.Client;
import com.example.banksystem.repository.ClientRepository;
import com.example.banksystem.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client register(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Long clientId, Client client) {
        Client existing = clientRepository.findById(clientId).orElseThrow();
        existing.setName(client.getName());
        existing.setCpf(client.getCpf());
        existing.setPhone(client.getPhone());
        existing.setAddress(client.getAddress());
        existing.setPassword(client.getPassword());
        return clientRepository.save(existing);
    }

    @Override
    public Client findByCpf(String cpf) {
        return clientRepository.findByCpf(cpf).orElseThrow();
    }

    @Override
    public Client authenticate(String cpf, String password) {
        Client client = clientRepository.findByCpf(cpf).orElseThrow();
        if (!client.getPassword().equals(password)) {
            throw new RuntimeException();
        }
        return client;
    }
}
