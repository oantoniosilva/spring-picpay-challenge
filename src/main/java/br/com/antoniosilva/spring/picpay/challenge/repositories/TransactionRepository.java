package br.com.antoniosilva.spring.picpay.challenge.repositories;

import br.com.antoniosilva.spring.picpay.challenge.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
