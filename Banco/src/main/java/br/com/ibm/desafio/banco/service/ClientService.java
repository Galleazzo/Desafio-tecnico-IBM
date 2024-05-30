package br.com.ibm.desafio.banco.service;

import br.com.ibm.desafio.banco.model.Client;
import br.com.ibm.desafio.banco.model.dto.ClientDTO;
import br.com.ibm.desafio.banco.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientDTO save(ClientDTO clienteDTO) {
        Client client = new Client();

        client.setName(clienteDTO.getName());
        client.setAge(clienteDTO.getAge());
        client.setAddress(clienteDTO.getAddress());
        client.setEmail(clienteDTO.getEmail());
        client.setAccountNumber(clienteDTO.getAccountNumber());

        this.clientRepository.save(client);
        return clienteDTO;
    }

    public List<Client> getAllClients() {
        return this.clientRepository.findAll();
    }

}
