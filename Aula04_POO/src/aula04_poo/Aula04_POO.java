package aula04_poo;

public class Aula04_POO {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.5f, "Azul");        
        c1.status();
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de pontã " + c1.getPonta());
        
        System.out.println("-----------------------");
        
        Caneta c2 = new Caneta("NIC", 0.4f, "Amarelo");
        c2.status();
    }    
}
