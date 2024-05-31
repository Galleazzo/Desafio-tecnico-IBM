package br.com.ibm.desafio.banco.repository;

import br.com.ibm.desafio.banco.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM client WHERE id = :id")
    Client getById(@Param("id") Long id);

}