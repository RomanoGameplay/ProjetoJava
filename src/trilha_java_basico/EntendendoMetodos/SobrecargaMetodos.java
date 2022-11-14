package trilha_java_basico.EntendendoMetodos;

public class SobrecargaMetodos {
    public static void main(String[] args) {
        areaQuadrado(3);
        areaQuadrado(5.5);
        System.out.println();
        areaRetangulo(2, 4);
        areaRetangulo(2, 4.6);
        areaRetangulo(2.3, 2.4);
        areaRetangulo(2.1, 2);
        System.out.println();
        areaTrapezio(1, 4, 2);
        areaTrapezio(3.4, 4.5, 6);
        areaTrapezio(2, 4, 5.4);
        areaTrapezio(1.2, 3.4, 2.3);

    }
    public static void areaQuadrado(int lado) {
        System.out.println("Área do Quadrado: "+lado*lado);
    }
    public static void areaQuadrado(double lado){
        System.out.println("Área do Quadrado: "+lado*lado);
    }

    public static void areaRetangulo(int base, int altura){
        System.out.println("Área do Retângulo: "+(base*altura));
    }
    public static void areaRetangulo(double base, int altura){
        System.out.println("Área do Retângulo: "+(base*altura));
    }
    public static void areaRetangulo(int base, double altura){
        System.out.println("Área do Retângulo: "+(base*altura));
    }
    public static void areaRetangulo(double base, double altura){
        System.out.println("Área do Retângulo: "+(base*altura));
    }

    public static void areaTrapezio(int baseMaior, int baseMenor, int altura){
        System.out.println("Área do Trapézio: "+(((baseMaior+baseMenor)*altura) / 2));
    }
    public static void areaTrapezio(double baseMaior, double baseMenor, int altura){
        System.out.println("Área do Trapézio: "+(((baseMaior+baseMenor)*altura) / 2));
    }
    public static void areaTrapezio(int baseMaior, int baseMenor, double altura){
        System.out.println("Área do Trapézio: "+(((baseMaior+baseMenor)*altura) / 2));
    }
    public static void areaTrapezio(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do Trapézio: "+(((baseMaior+baseMenor)*altura) / 2));
    }
}
