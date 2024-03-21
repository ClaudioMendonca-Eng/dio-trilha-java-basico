public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? : " + smartTv.ligada);
        System.out.println("Volume atual? : " + smartTv.volume);
        System.out.println("Canal atual? : " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? : " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume atual? : " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume atual? : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume atual? : " + smartTv.volume);

        smartTv.mudarCanal(10);
        System.out.println("Novo status -> Canal atual? : " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual? : " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo status -> Canal atual? : " + smartTv.canal);
        

    }
}
