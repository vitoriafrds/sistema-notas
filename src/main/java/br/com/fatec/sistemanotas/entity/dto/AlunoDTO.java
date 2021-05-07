package br.com.fatec.sistemanotas.entity.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDTO {
    private String ra;
    private String nome;
}
