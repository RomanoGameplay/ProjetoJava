package trilha_java_basico.EntendendoMetodos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio1 {
    public static void main(String[] args) throws ParseException {
        somar(2, 3);
        subtrair(2, 3);
        multiplicar(2, 3);
        dividir(2, 3);
        hora_dia();
        valorEmprestimo(25000);
    }
    public static void valorEmprestimo(double valor){
        double taxa = 0.15;
        double parcelas = 12;

        double emprestimoFinal = (valor - (valor*taxa))/parcelas;
        if (!(emprestimoFinal <= 0)){
            System.out.println("O empréstimo final será de: "+emprestimoFinal);
        }else{
            System.out.println("Nao é possível realizar empréstimo!");
            System.out.println(emprestimoFinal);
        }
    }
    public static void hora_dia() throws ParseException {
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
        Date hora = new Date();
        Date hora_manha_limite = formatador.parse("12:00");
        Date hora_tarde_limite = formatador.parse("18:00");
        Date hora_noite_limite = formatador.parse("06:00");

        if(hora.getTime() <= hora_manha_limite.getTime() && hora.getTime() >= hora_noite_limite.getTime()){
            System.out.println("Bom dia!");
        }
        if (hora.getTime() >= hora_manha_limite.getTime() && hora.getTime() <= hora_tarde_limite.getTime()){
            System.out.println("Boa tarde!");
        } else{
            System.out.println("Boa noite!");
        }
    }
    public static void somar(int num1, int num2){
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
    }
    public static void subtrair(int num1, int num2){
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
    public static void multiplicar(int num1, int num2){
        System.out.println(num1+" X "+num2+" = "+(num1*num2));
    }
    public static void dividir(double num1, double num2){
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
    }
}
