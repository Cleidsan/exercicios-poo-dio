package academia.aluno;

import java.util.Calendar;

public class Aluno {
    private String name;
    private int idade;
    private int ano;

    protected Double peso;
    protected Double altura ;
    Calendar cal = Calendar.getInstance();

    public void dataNasc(int dia, int mes, int ano) {
        this.ano = ano;
    }

    public void calcularIdade() {
        int year = cal.get(Calendar.YEAR);
        if (ano >= year) {
            System.err.println("Idade incorreta");
        }else {
            this.idade = year - ano;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

}
