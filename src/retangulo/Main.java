package retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo rect = new Retangulo();
        rect.setBase(7d);
        rect.setAltura(5.5);

        rect.calcularArea();
        System.out.printf("A àrea do Retangulo é: " + rect.getArea() + "%n");

        rect.calcularPerimetro();
        System.out.println("O perimetro é: " + rect.getPerimetro());

        // Retornando o valor dos lados do Retangulo

        rect.retornarValorLados();
        System.out.println();
        rect.mudarValorLados();
        System.out.println();

        rect.novosLados(15d,10d);

        rect.calcularArea();
        System.out.printf("A àrea do Retangulo é: " + rect.getArea() + "%n");

        // ***********************************

        Quadrado quadr = new Quadrado();
        quadr.setTamLados(3d);

        quadr.calcularArea();
        System.out.printf("A àrea do Quadrado é: " + quadr.getArea() + "%n");

        quadr.calcularPerimetro();
        System.out.println("O perimetro é: " + quadr.getPerimetro());

        // Retornando o valor dos lados do Quadrado

        quadr.retornarValorLados();
        System.out.println();
        quadr.mudarValorLados();
        System.out.println();

        quadr.novosLados(30d,30d);

        quadr.calcularArea();
        System.out.printf("A àrea do Quadrado é: " + quadr.getArea() + "%n");
    }
}
