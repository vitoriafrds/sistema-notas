package br.com.fatec.sistemanotas.controllers;

import br.com.fatec.sistemanotas.entity.dto.NotaDTO;
import br.com.fatec.sistemanotas.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/notas")
public class NotaController {

    private NotaService service;

    @Autowired
    public NotaController(NotaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> registrar(@RequestBody NotaDTO nota) {
        service.registrarNotas(nota);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
