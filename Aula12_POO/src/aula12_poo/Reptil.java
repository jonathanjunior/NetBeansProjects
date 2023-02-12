package aula12_poo;
public class Reptil extends Animal{
    private String corEscama;
    
    @Override
    public void locomover() {
        System.out.println("Rstejando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }

    //Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
