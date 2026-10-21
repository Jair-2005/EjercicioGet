//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SensorTemperatura s1 = new SensorTemperatura("S-001", 24.5, "°C");
        SensorTemperatura s2 = new SensorTemperatura("S-002", 76.1, "°F");

        s1.mostrarLectura();
        s2.mostrarLectura();

        s1.setValorActual(26.0);
        System.out.println("Después de actualizar:");
        s1.mostrarLectura();
    }
}