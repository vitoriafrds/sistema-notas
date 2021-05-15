package br.com.fatec.sistemanotas.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FALTAS")
public class Falta {

    @Id
    @Column(name = "RA_ALUNO")
    private String raAluno;

    @Column(name = "CODIGO_DISCIPLINA")
    private String codigoDisciplina;

    @Column(name = "DATA_AULA")
    private LocalDate dataAula;

    @Column(name = "PRESENCA")
    private String presenca;
}
