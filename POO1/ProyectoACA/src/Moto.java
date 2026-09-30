public class Motocicleta extends Vehiculo {
    public Moto(String placa, String marca, String modelo) {
        super(placa, marca, modelo);
    }

    public double calcularTarifaDiaria() {
        return 50000.0;
    }
}