public class App {
    public static void main(String[] args) throws Exception {
        //Instanciação de Caneta
        Caneta c1 = new Caneta();

        c1.modelo = "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5;
        c1.carga = 80;
        c1.tampada = false;
        c1.rabiscar();
        c1.status();
    }
}
