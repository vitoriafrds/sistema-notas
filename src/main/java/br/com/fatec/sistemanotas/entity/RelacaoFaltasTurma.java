package br.com.fatec.sistemanotas.entity;

import java.time.LocalDate;
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
@Table(name = "relacao_faltas_turma")
public class RelacaoFaltasTurma {

  @Id
  @Column(name = "RA")
  private String ra;

  @Column(name = "NOME")
  private String nome;

  @Column(name = "DISCIPLINA")
  private String disciplina;

  @Column(name = "DATA_AULA")
  private LocalDate dataAula;

  @Column(name = "TOTAL_PRESENCAS")
  private Integer totalPresencas;

  @Column(name = "TOTAL_FALTAS")
  private Integer totalFaltas;
}
