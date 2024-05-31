package br.com.ibm.desafio.banco.service;

import br.com.ibm.desafio.banco.model.Client;
import br.com.ibm.desafio.banco.model.Transaction;
import br.com.ibm.desafio.banco.model.dto.TransactionDTO;
import br.com.ibm.desafio.banco.repository.ClientRepository;
import br.com.ibm.desafio.banco.repository.TransactionRepository;
import br.com.ibm.desafio.banco.type.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private ClientRepository clientRepository;

    public TransactionDTO save(TransactionDTO transactionDTO) {
        Transaction transaction = new Transaction();
        Client client = this.clientRepository.getById(transactionDTO.getClientId());
        LocalDateTime now = LocalDateTime.now();
        Date date = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());

        transaction.setValue(transactionDTO.getValue());
        transaction.setType(TransactionType.getByValue(transactionDTO.getType()));
        transaction.setClient(client);
        transaction.setDate(date);

        this.transactionRepository.save(transaction);

        return transactionDTO;
    }

    public List<Transaction> listByClient(Long clientId) {
        return this.transactionRepository.findByClientId(clientId);
    }
}
