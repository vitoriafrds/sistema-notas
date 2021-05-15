package br.com.fatec.sistemanotas.service;

import br.com.fatec.sistemanotas.entity.Nota;
import br.com.fatec.sistemanotas.entity.dto.NotaDTO;
import br.com.fatec.sistemanotas.repository.NotaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotaService {

  private NotaRepository repository;

  @Autowired
  public NotaService(NotaRepository repository) {
      this.repository = repository;
    }

  public void registrarNotaPrimeiraAvaliacao(NotaDTO nota) {
    registrarNotas(nota);
  }

  public void registrarNotaSegundaAvaliacao(String aluno, double nota) {
    repository.registrarNota(aluno, nota);
  }

  public void registrarNotas(NotaDTO request) {
   log.info("Registrando nota para o aluno [{}] para a disciplina [{}]", request.getRa(), request.getDisciplina());
   repository.save(Nota.builder().ra(request.getRa()).codigoAvaliacao(request.getCodigoAvaliacao())
       .codigoDisciplina(request.getDisciplina())
       .primeiraNota(request.getNota()).build());
    }
}
