package academia;

import academia.aluno.Aluno;
import academia.avaliacaoFisica.AvaliacaoFisica;

import java.time.LocalDateTime;

public class Academia {
    public static void main(String[] args) {
        Aluno freire = new Aluno();
        freire.setName("Freire");
        freire.dataNasc(7,3,2000);
        freire.calcularIdade();

        System.out.println("O Aluno: "+ freire.getName() + " tem " + freire.getIdade() + " anos.");


        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        avaliacao.setId(5678);
        avaliacao.setMatriculaAluno(443834);
        avaliacao.setNameAvaliador("Luki");
        avaliacao.setDateAvaliacao(LocalDateTime.now());
        avaliacao.setStatus("Em avalicaçao");
        avaliacao.setPeso(63d);
        avaliacao.setAltura(1.72d);
        avaliacao.calcularImc();

        avaliacao.retornaImc();

        System.out.println(avaliacao);
    }
}
