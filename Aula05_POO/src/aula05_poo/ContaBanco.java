package aula05_poo;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }    
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true); //this.status = true;
        
        if ("CC".equals(t)) { //t == "CC"
            this.setSaldo(50); //this.saldo = 50;            
        } else if ("CP".equals(t)) { //t == "CP"
            this.setSaldo(150); //this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com saldo positivo, não pode ser fechada.");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta com saldo negativo, não pode ser fechada.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + v); //this.saldo = this.saldo + v;
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else{
                System.out.println("Saldo insufuciente!");
            }
        }else{
            System.out.println("Impossível realizar saque, conta inativa.");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if("CC".equals(this.getTipo())) { //this.getTipo() == "CC"
            v = 12;
        }else if("CP".equals(this.getTipo())) {
            v = 20;
        }
        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Mensalidae paga com sucesso por " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Conta inativa, impossivel pagar mensalidade!");
        }
    }
    
    //Método Construtor
    public ContaBanco(){
        this.saldo = 0; //this.setSaldo(0);
        this.status = false; //this.setStatus(false);
    }
    
    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }    
}
