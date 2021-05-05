package br.com.fatec.sistemanotas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FALTA")
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
