package aula07_poo;
public class Aula07_POO {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "M", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "M","Brasil", 29, 1.68f, 57.8f, 14, 2, 1);
        l[2] = new Lutador("Snapshadow", "M","EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "M","Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "M","Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdart", "M","EUA", 30, 1.81f, 105.7f, 12, 2, 4);          
         
        //l[3].setPeso(10f);
        //l[3].ganharLuta();
        //l[3].empatarLuta();
        //l[3].perderLuta();
        //l[3].status();
        
        /*
        for (Lutador lutador: l){
            lutador.apresentar();            
        }
        */
        
        /*
        l[5].apresentar();
        l[5].status();
        */        
        
        Luta UEC01 = new Luta();
        //System.out.println(l[2].getPeso());
        //l[2].setCategoria();
        //l[3].setCategoria();
        // System.out.println(l[2].getCategoria());
        UEC01.marcarLuta(l[2], l[3]);
        //l[4].apresentar();
        //l[5].apresentar();
        //UEC01.lutar();
        //System.out.println(UEC01.isAprovada());                          
    }    
}