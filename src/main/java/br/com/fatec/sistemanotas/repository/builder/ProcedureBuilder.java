package br.com.fatec.sistemanotas.repository.builder;

import br.com.fatec.sistemanotas.entity.RelacaoAlunosTurma;
import br.com.fatec.sistemanotas.entity.RelacaoFaltasTurma;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Component;

@Component
public class ProcedureBuilder {

  private static final String PROCEDURE_TURMA = "listarSituacaoTurma";
  private static final String PROCEDURE_FALTAS = "listarFaltasTurma";

  @PersistenceContext
  private EntityManager entityManager;

  public List<RelacaoAlunosTurma> chamarProcedureTurma() {
    StoredProcedureQuery query = entityManager.createStoredProcedureQuery(PROCEDURE_TURMA, RelacaoAlunosTurma.class);
    query.execute();

    List<RelacaoAlunosTurma> alunos = query.getResultList();

    return alunos.stream().map(aluno -> {
      RelacaoAlunosTurma turma = new RelacaoAlunosTurma();
      turma.setRa(aluno.getRa());
      turma.setNomeAluno(aluno.getNomeAluno());
      turma.setPrimeiraNota(aluno.getPrimeiraNota());
      turma.setSegundaNota(aluno.getSegundaNota());
      turma.setSituacao(aluno.getSituacao());
      turma.setMedia(aluno.getMedia());
      return turma;
    }).collect(Collectors.toList());
  }

  public List<RelacaoFaltasTurma> procedureFaltasTurma() {
    StoredProcedureQuery query = entityManager.createStoredProcedureQuery(PROCEDURE_FALTAS, RelacaoFaltasTurma.class);
    query.execute();

    List<RelacaoFaltasTurma> faltas = query.getResultList();

    return faltas.stream().map(falta -> {
      RelacaoFaltasTurma relacao = new RelacaoFaltasTurma();
      relacao.setRa(falta.getRa());
      relacao.setNome(falta.getNome());
      relacao.setDisciplina(falta.getDisciplina());
      relacao.setDataAula(falta.getDataAula());
      relacao.setTotalPresencas(falta.getTotalPresencas());
      relacao.setTotalFaltas(falta.getTotalFaltas());
      return relacao;
    }).collect(Collectors.toList());
  }
}
