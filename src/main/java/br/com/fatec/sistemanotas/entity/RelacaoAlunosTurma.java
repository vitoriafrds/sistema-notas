package br.com.fatec.sistemanotas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RELACAO_ALUNOS_TURMA")
public class RelacaoAlunosTurma {

  @Id
  @Column(name = "RA_ALUNO")
  private String ra;

  @Column(name = "NOME_ALUNO")
  private String nomeAluno;

  @Column(name = "NOTA_1")
  private double primeiraNota;

  @Column(name = "MEDIA")
  private double media;

  @Column(name = "SITUACAO")
  private String situacao;

  @Column(name = "NOTA_2")
  private double segundaNota;
}
