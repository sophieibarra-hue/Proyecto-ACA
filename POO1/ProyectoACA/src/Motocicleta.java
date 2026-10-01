public class Motocicleta extends Vehiculo {

    public Motocicleta(String placa, String marca, String modelo) {
        super(placa, marca, modelo);
    }

    @Override
    public double calcularTarifaDiaria() {
        return 50000.0;
    }
}
