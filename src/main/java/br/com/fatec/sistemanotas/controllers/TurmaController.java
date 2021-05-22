package br.com.fatec.sistemanotas.controllers;

import br.com.fatec.sistemanotas.entity.RelacaoAlunosTurma;
import br.com.fatec.sistemanotas.entity.RelacaoFaltasTurma;
import br.com.fatec.sistemanotas.service.TurmaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/turmas")
public class TurmaController {

  private TurmaService service;

  @Autowired
  public TurmaController(TurmaService service) {
    this.service = service;
  }

  @GetMapping("/situacao")
  public ResponseEntity<List<RelacaoAlunosTurma>> listarSituacaoTurma() {
    return ResponseEntity.ok().body(service.listarSituacaoTurma());
  }

  @GetMapping("/faltas")
  public ResponseEntity<List<RelacaoFaltasTurma>> listarFaltasTurma() {
    return ResponseEntity.ok().body(service.listarFaltasTurma());
  }
}
