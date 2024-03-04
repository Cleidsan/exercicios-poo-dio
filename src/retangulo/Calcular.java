package retangulo;

public class Calcular {

    protected Double area, perimetro;
    protected Double base;
    protected Double altura;

    // Calculando o Perímetro do Retangulo

    public void calcularPerimetro() {
        this.perimetro = (base + altura) * 2;
    }

    // Retornando o valor do Retangulo
    public void retornarValorLados() {
        System.out.printf("Base: " + base + ", Altura: " + altura);
    }

    // Mudando os valores dos lados
    public void novosLados(Double novaBase, Double novaAltura) {
        this.base = novaBase;
        this.altura = novaAltura;
        System.out.println("Mudando os valores dos lados Base: " + novaBase + ", Altura: " + novaAltura);
    }

    // Mudando de lados os valores
    public void mudarValorLados() {
        Double nvAltura = this.base;
        Double nvBase = this.altura;

        System.out.printf("Mudando de lados os valores Base: " + nvBase + ", Altura: " + nvAltura);
    }
    public void setBase(Double base) {
        this.base = base;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getArea() {
        return area;
    }

    public Double getPerimetro() {
        return perimetro;
    }
}
