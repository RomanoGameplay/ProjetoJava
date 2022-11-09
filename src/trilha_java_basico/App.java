package trilha_java_basico;

public class App {
    public static void main(String [] args){
        System.out.println("olá, mundo!");
        String primeiroNome = "Caio";
        String segundoNome = "Sampaio";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
