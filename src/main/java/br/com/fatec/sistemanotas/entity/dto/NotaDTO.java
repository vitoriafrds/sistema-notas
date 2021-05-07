package br.com.fatec.sistemanotas.entity.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class NotaDTO {
    private String ra;
    private String disciplina;
    private Integer codigoAvaliacao;
    private double nota;

}
