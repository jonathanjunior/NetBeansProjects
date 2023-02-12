package aula12_poo;
public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando um osso");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo...");
    }
    
}
