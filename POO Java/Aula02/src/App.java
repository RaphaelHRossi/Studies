public class App {
    public static void main(String[] args) throws Exception {
        //Instanciação de Caneta
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;

        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
