package br.com.fatec.sistemanotas.repository;

import br.com.fatec.sistemanotas.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String> {

}
