package br.com.ibm.desafio.banco.repository;

import br.com.ibm.desafio.banco.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM transaction t WHERE t.client_id = :clientId")
    List<Transaction> findByClientId(@Param("clientId") Long clientId);
}
