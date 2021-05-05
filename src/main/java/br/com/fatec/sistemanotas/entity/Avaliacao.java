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
@Table(name = "AVALIACAO")
public class Avaliacao {

    @Id
    @Column(name = "CODIGO")
    private int codigo;

    @Column(name = "TIPO")
    private String tipo;
}
