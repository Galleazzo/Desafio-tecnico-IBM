package br.com.ibm.desafio.banco.controller;

import br.com.ibm.desafio.banco.model.Transaction;
import br.com.ibm.desafio.banco.model.dto.TransactionDTO;
import br.com.ibm.desafio.banco.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public TransactionDTO save(@RequestBody TransactionDTO transactionDTO) {
        return this.transactionService.save(transactionDTO);
    }

    @GetMapping("/getByClientId/{clienteId}")
    public List<Transaction> getByClientId(@PathVariable Long clientId) {
        return this.transactionService.listByClient(clientId);
    }
}
