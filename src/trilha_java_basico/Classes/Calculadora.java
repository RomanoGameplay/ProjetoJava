package trilha_java_basico.Classes;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println(operando1+" + "+operando2+" = "+(operando1+operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println(operando1+" - "+operando2+" = "+(operando1-operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println(operando1+" X "+operando2+" = "+(operando1*operando2));
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println(operando1+" / "+operando2+" = "+(operando1/operando2));
    }
}
