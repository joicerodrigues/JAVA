package projetopolimorfismo;

public class Cachorro implements Animal {

    @Override
    public void comer() {
        System.out.println("Cachorro come 2 Kg de ração");
    }

    public void mover(String movimento) {
        System.out.println("O cachorro: " + movimento);
    }
        
    
}
