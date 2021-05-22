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

  @Column(name = "")
  private String nome;

  @Column(name = "DATA_1")
  private LocalDate primeiraData;

  @Column(name = "DATE_2")
  private LocalDate segundaData;

  @Column(name = "TOTAL_FALTAS")
  private Integer totalFaltas;

  @Column(name = "TOTAL_PRESENCAS")
  private Integer totalPresencas;
}
