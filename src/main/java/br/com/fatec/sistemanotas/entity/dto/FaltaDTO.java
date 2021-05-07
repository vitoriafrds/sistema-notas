package br.com.fatec.sistemanotas.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FaltaDTO {
    private String ra;
    private String codigoDisciplina;
    private LocalDate data;
    private boolean presenca;
}
