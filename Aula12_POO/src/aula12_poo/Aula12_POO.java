package aula12_poo;
public class Aula12_POO {
    public static void main(String[] args) {
      //Animal n = new Animal();
      Mamifero m = new Mamifero();
      Reptil r = new Reptil();
      Peixe p = new Peixe();
      Ave a = new Ave();
      Canguru c = new Canguru();
      Cachorro k = new Cachorro();
      Cobra j = new Cobra();
      Tartaruga t = new Tartaruga();
      GoldFish g = new GoldFish();
      Arara e = new Arara();
          
      
      /*
      m.setPeso(35.3f);
        System.out.println(m.getPeso());
      m.setCorPelo("Marron");
         System.out.println(m.getCorPelo());
      m.alimentar();      
      m.emitirSom();*/
      
      /*
      m.locomover();
      a.locomover();
      p.locomover();
      r.locomover();*/
      
      c.locomover();
      c.usarBolsa();
      k.locomover();
      c.emitirSom();
      k.emitirSom();
      k.enterrarOsso();
      k.abanarRabo();
      
      g.soltarBolha();
      t.locomover();
      
    }    
}
