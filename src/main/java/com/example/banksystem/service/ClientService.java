package com.example.banksystem.service;

import com.example.banksystem.entity.Client;

public interface ClientService {

    Client register(Client client);

    Client update(Long clientId, Client client);

    Client findByCpf(String cpf);

    Client authenticate(String cpf, String password);
}
