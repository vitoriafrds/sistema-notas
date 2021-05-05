package br.com.fatec.sistemanotas.service;

import br.com.fatec.sistemanotas.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaService {

    private NotaRepository repository;

    @Autowired
    public NotaService(NotaRepository repository) {
        this.repository = repository;
    }

    public void registrarNotas() {
        //TODO:CONTINUAR...
    }
}
