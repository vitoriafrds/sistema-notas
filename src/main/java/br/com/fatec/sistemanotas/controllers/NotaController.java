package br.com.fatec.sistemanotas.controllers;

import br.com.fatec.sistemanotas.entity.dto.NotaDTO;
import br.com.fatec.sistemanotas.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/notas")
public class NotaController {

    private NotaService service;

    @Autowired
    public NotaController(NotaService service) {
        this.service = service;
    }

    @PostMapping("/p1")
    public ResponseEntity<Void> registrarPrimeiraNota(@RequestBody NotaDTO nota) {
        service.registrarNotaPrimeiraAvaliacao(nota);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/p2/{ra}")
    public ResponseEntity<Void> registrarSegundaNota(@PathVariable String ra, @RequestParam double nota) {
        service.registrarNotaSegundaAvaliacao(ra, nota);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
