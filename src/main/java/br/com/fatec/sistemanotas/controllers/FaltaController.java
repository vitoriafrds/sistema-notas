package br.com.fatec.sistemanotas.controllers;

import br.com.fatec.sistemanotas.entity.dto.FaltaDTO;
import br.com.fatec.sistemanotas.entity.dto.NotaDTO;
import br.com.fatec.sistemanotas.service.FaltaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/faltas")
public class FaltaController {

  private FaltaService service;

  @Autowired
  public FaltaController(FaltaService service) {
        this.service = service;
    }

  @PostMapping
  public ResponseEntity<Void> registrar(@RequestBody FaltaDTO falta) {
      service.registrarFaltas(falta);
  return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
