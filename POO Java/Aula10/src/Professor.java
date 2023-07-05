public class Professor extends Pessoa {
    private String especilaidade;
    private float salario;

    public void receberAumento (float aum){
        this.salario += aum;
    }

    public String getEspecilaidade() {
        return especilaidade;
    }

    public void setEspecilaidade(String especilaidade) {
        this.especilaidade = especilaidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
