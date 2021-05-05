package br.com.fatec.sistemanotas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "NOTA")
public class Nota {

    @Id
    @Column(name = "RA_ALUNO")
    private String ra;

    @Column(name = "CODIGO_DISCIPLINA")
    private String codigoDisciplina;

    @Column(name = "CODIGO_AVALIACAO")
    private Integer codigoAvaliacao;

    @Column(name = "NOTA")
    private float nota;
}
