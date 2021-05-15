package br.com.fatec.sistemanotas.service;

import br.com.fatec.sistemanotas.entity.Falta;
import br.com.fatec.sistemanotas.entity.dto.FaltaDTO;
import br.com.fatec.sistemanotas.enumerator.IndicadorPresenca;
import br.com.fatec.sistemanotas.repository.FaltaRepository;
import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FaltaService {
  private FaltaRepository repository;

  @Autowired
  public FaltaService(FaltaRepository repository) {
      this.repository = repository;
    }

  public void registrarFaltas(FaltaDTO request) {
    log.info("Registrando faltas para o aluno: [{}] na disciplina [{}]", request.getRa(), request.getCodigoDisciplina());
    repository.save(Falta.builder().raAluno(request.getRa()).codigoDisciplina(request.getCodigoDisciplina())
        .dataAula(LocalDate.now())
        .presenca(IndicadorPresenca.parse(request.isPresenca())).build());
    }
}
