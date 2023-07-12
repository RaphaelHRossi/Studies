public class App {
    public static void main(String[] args) throws Exception {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Professor p1 = new Professor();

        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");

        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Infomática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        p1.setNome("Roberto");
        p1.setSexo("M");
        p1.setIdade(55);
        //p1.receberAumento(500.0f);

        System.out.println(p1.toString());
    }
}
