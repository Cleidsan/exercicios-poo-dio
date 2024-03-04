package retangulo;

public class Quadrado extends Calcular{
    private Double tamLados;

    // Calculando a Area do Quadrado
    public void calcularArea() {
        base = tamLados;
        altura = tamLados;

        this.area = (base + altura) * 2;
    }
    public void setTamLados(Double tamLados) {
        this.tamLados = tamLados;
    }

    public Double getTamLados() {
        return tamLados;
    }
}
