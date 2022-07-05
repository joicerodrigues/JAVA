package projetopolimorfismo;

public class ProjetoPolimorfismo {

    public static void main(String[] args) {

            Animal cachorro = new Cachorro();
            Animal gato = new Gato();
            
            cachorro.comer();
            cachorro.mover("Correr");
            
            gato.comer();
            gato.mover("Dormir");
            
    }
    
}
