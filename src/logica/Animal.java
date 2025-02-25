package logica;

public class Animal implements Somn {
    public void mananca(){
        System.out.println("logica.Animal");
    }
    @Override
    public void dorm() {
        System.out.println("Dorm");
    }
}
