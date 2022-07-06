public class Main {
    public static void main(String[] args) {
        System.out.println("El valor de la suma es: " + suma(40, 40, 9));

        Coche Micoche = new Coche();
        Micoche.ColocarPuerta();
        Micoche.ColocarPuerta();
        System.out.println("Se agrego en su coche: " + Micoche.Puerta + " puerta/s");

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    public int Puerta = 0;

    public void ColocarPuerta() {
        this.Puerta++;
    }

}