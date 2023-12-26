package br.com.antoniosilva.spring.picpay.challenge.repositories;

import br.com.antoniosilva.spring.picpay.challenge.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
