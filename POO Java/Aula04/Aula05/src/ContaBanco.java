public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.isStatus());
        System.out.println("----------------------------------");
    }
    
    //Metodos
    public void abrirConta (String p){
        this.setStatus(true);
        this.setTipo(p);

        if (p == "CC"){
            this.setSaldo(50);
        } else if (p == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com Sucesso!");
    }

    public void fecharConta (){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem saldo.");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser feechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fecahda com Sucesso!");
        }
    }

    public void depositar (float d){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Deposisito realizado na conda de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em conta fechada");
        }
    }

    public void sacar (float s){
        if (this.isStatus()){
            if (this.getSaldo() >= s){
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de conta fechada!");
        }
    }

    public void pagarMensal (){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }

    //Metotos Especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(status);
    }
    
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
