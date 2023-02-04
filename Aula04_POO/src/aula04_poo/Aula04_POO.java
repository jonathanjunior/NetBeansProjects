package aula04_poo;

public class Aula04_POO {
    
    public static void main(String[] args) {
       /* Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.status();
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + 
                c1.getPonta());
        */
        System.out.println("-----------------------");
        
        Caneta c2 = new Caneta("NIC", 0.4f, "Amarelo");
        c2.status();
    }    
}
