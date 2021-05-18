package br.com.fatec.sistemanotas.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FaltaDTO {
    private String ra;
    private String codigoDisciplina;
    private boolean presenca;
}
