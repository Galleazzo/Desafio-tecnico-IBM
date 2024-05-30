package br.com.ibm.desafio.banco.controller;

import br.com.ibm.desafio.banco.model.Client;
import br.com.ibm.desafio.banco.model.dto.ClientDTO;
import br.com.ibm.desafio.banco.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ClientDTO save(@RequestBody ClientDTO clientDTO) {
        return this.clientService.save(clientDTO);
    }

    @GetMapping
    public List<Client> getAll() {
        return this.clientService.getAllClients();
    }
}
