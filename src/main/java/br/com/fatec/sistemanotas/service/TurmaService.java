package br.com.fatec.sistemanotas.service;

import br.com.fatec.sistemanotas.entity.RelacaoAlunosTurma;
import br.com.fatec.sistemanotas.entity.RelacaoFaltasTurma;
import br.com.fatec.sistemanotas.repository.builder.ProcedureBuilder;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService {

  private ProcedureBuilder builder;

  @Autowired
  public TurmaService(ProcedureBuilder builder) {
    this.builder = builder;
  }

  public List<RelacaoAlunosTurma> listarSituacaoTurma() {
    return builder.chamarProcedureTurma();
  }

  public List<RelacaoFaltasTurma> listarFaltasTurma() {
    return builder.procedureFaltasTurma();
  }

}
