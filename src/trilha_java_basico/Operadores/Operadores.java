package trilha_java_basico.Operadores;

public class Operadores {
    public static void main(String[] args) {
        System.out.println("LINGUAGEM"+"JAVA");

        int num = 5;
        num = - num;
        System.out.println(num);
        num = - num;
        System.out.println(num);

        num = 7;
//        num++;
//        System.out.println(num+2);
        System.out.println(num);
        System.out.println(++num);
//        System.out.println(num);

        boolean variavel = true;

        System.out.println(!variavel);

        int a,b;
        a = 6;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
    }
}
