package br.com.ibm.desafio.banco.repository;

import br.com.ibm.desafio.banco.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}