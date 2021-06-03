package br.com.fatec.sistemanotas.util;

import br.com.fatec.sistemanotas.entity.Aluno;
import br.com.fatec.sistemanotas.entity.dto.AlunoDTO;
import java.util.Optional;

public class AlunoUtils {

  public static AlunoDTO construirAluno(Optional<Aluno> entidade) {
    AlunoDTO aluno = new AlunoDTO();

    if (entidade.isPresent()) {
      aluno.setRa(entidade.get().getRa());
      aluno.setNome(entidade.get().getNome());
    }

    return aluno;
  }
}
