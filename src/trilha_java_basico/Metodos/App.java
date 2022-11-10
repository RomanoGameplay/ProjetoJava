package trilha_java_basico.Metodos;

public class App {
    public static void main(String[] args) {
        SmartTV smartv = new SmartTV();
        Usuario user = new Usuario();

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolume();
        System.out.println("Canal Atual: "+smartv.canal);
        smartv.mudarCanal(13);

        System.out.println("TV ligada? "+smartv.ligada);
        System.out.println("Novo Canal Atual: "+smartv.canal);
        System.out.println("Volume: "+smartv.volume);

        smartv.ligar();
        System.out.println("Novo Status -> TV ligada? "+smartv.ligada);
        smartv.desligar();
        System.out.println("Novo Status -> TV ligada? "+smartv.ligada);
    }
}
