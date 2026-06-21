package br.com.sttalis.fronteirapp.api.dto;

import br.com.sttalis.fronteirapp.domain.model.Country;
import br.com.sttalis.fronteirapp.domain.model.UserRole;
import java.time.LocalDateTime;
import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String name,
        String email,
        UserRole role,
        Country country,
        LocalDateTime createdAt
){}