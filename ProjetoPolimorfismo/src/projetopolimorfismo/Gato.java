package projetopolimorfismo;

public class Gato implements Animal {

    @Override
    public void comer() {
        System.out.println("Gato come apenas 200g de ração");
    }
    
    @Override
    public void mover(String movimento) {
        System.out.println("O gato: " + movimento);
    }
    
    
}
