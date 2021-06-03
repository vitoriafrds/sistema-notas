package br.com.fatec.sistemanotas.service;

import br.com.fatec.sistemanotas.entity.dto.AlunoDTO;
import br.com.fatec.sistemanotas.repository.AlunoRepository;
import br.com.fatec.sistemanotas.util.AlunoUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class AlunoService {

  private AlunoRepository repository;

  public AlunoService(AlunoRepository repository) {
    this.repository = repository;
  }

  public List<AlunoDTO> listar() {
    return repository.findAll().stream().map(x -> {
      AlunoDTO aluno = new AlunoDTO();
      aluno.setRa(x.getRa());
      aluno.setNome(x.getNome());
      return aluno;
    }).collect(Collectors.toList());
  }

  public AlunoDTO detalhar(String ra) {
    return AlunoUtils.construirAluno(repository.findById(ra));
  }
}
