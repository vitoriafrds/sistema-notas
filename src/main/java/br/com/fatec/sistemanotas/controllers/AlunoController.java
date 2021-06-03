package br.com.fatec.sistemanotas.controllers;

import br.com.fatec.sistemanotas.entity.dto.AlunoDTO;
import br.com.fatec.sistemanotas.service.AlunoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/alunos")
public class AlunoController {

  private AlunoService service;

  @Autowired
  public AlunoController(AlunoService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<AlunoDTO>> listar() {
    return ResponseEntity.ok().body(service.listar());
  }

  @GetMapping("/{ra}")
  public ResponseEntity<AlunoDTO> detalhar(@PathVariable String ra) {
    return ResponseEntity.ok().body(service.detalhar(ra));
  }

}
