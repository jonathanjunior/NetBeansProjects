package aula13_poo;

public class Aula13_POO {
    public static void main(String[] args) {
        Mamifero x = new Mamifero();
        x.emitirSom();
        
        Lobo l = new Lobo();
        l.emitirSom();
        
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir("olá");
        c.reagir("vai apanhar");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
       
    }
}
