package br.com.antoniosilva.spring.picpay.challenge.dtos;

import br.com.antoniosilva.spring.picpay.challenge.domain.user.UserType;

import java.math.BigDecimal;

public record UserPostDTO(
        String name,
        String document,
        String email,
        String password,
        BigDecimal balance,
        UserType userType
) {
}
