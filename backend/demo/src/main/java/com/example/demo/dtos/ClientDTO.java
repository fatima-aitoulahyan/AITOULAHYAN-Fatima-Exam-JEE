package com.example.demo.dtos;

import lombok.Data;
import java.util.List;

@Data
public class ClientDTO {

    private Long id;
    private String name;
    private String email;

    private List<ContratDTO> contrats;
}