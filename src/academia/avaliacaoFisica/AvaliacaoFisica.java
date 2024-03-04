package academia.avaliacaoFisica;

import academia.aluno.Aluno;

import java.time.LocalDateTime;

public class AvaliacaoFisica extends Aluno {

    private int id;
    private int matriculaAluno;
    private String nameAvaliador;
    private LocalDateTime dateAvaliacao;
    private String status;
    private Double imc;

    public void calcularImc() {
        this.imc = peso / (altura * altura);
        System.out.println(imc);
    }

    @Override
    public String toString() {
        return "AvaliacaoFisica{" +
                "\n ID da Avaliacao='" + id + '\'' +
                "\n nome do Avaliador='" + nameAvaliador + '\'' +
                "\n matricula do Aluno ='" + matriculaAluno + '\'' +
                "\n data da Avaliacao=" + dateAvaliacao +
                "\n status='" + status + '\'' +
                "\n imc=" + imc +
                '}';
    }

    public void retornaImc() {
        if (imc < 17) {
            System.out.println("RESULTADO" + " --- " + "SITUAÇÃO");
            System.out.println("Abaixo de 17" + " --- " + "Muito abaixo do peso");
        }else if (imc >= 17 && imc <= 18.49) {
            System.out.println("RESULTADO" + " --- " + "SITUAÇÃO");
            System.out.println("Entre 17 e 18,49" + " --- " + "Abaixo do peso)");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("RESULTADO" + " --- " + "SITUAÇÃO");
            System.out.println("Entre 18,5 e 24,99" + " --- " + "Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("RESULTADO" + " --- " + "SITUAÇÃO");
            System.out.println("Entre 25 e 29,99" + " --- " + "Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("RESULTADO" + " --- " + "SITUAÇÃO");
            System.out.println("Entre 30 e 34,99" + " --- " + "Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("RESULTADO" + " --- " + "SITUAÇÃO");
            System.out.println("Entre 35 e 39,99" + " --- " + "Obesidade II (severa)");
        }else {
            System.out.println("RESULTADO" + "   ---      " + "SITUAÇÃO");
            System.out.println("Acima de 40" + " --- " + "Obesidade III (mórbida)");
        }
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setNameAvaliador(String nameAvaliador) {
        this.nameAvaliador = nameAvaliador;
    }

    public void setDateAvaliacao(LocalDateTime dateAvaliacao) {
        this.dateAvaliacao = dateAvaliacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public void setId(int id) {
        this.id = id;
    }
}
