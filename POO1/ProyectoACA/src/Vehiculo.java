public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private EstadoVehiculo estado;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = EstadoVehiculo.DISPONIBLE;
    }

    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public EstadoVehiculo getEstado() { return estado; }
    public void setEstado(EstadoVehiculo estado) { this.estado = estado; }

    public abstract double calcularTarifaDiaria();

    public double calcularCostoAlquiler(int dias) {
        return calcularTarifaDiaria() * dias;
    }
 
    @Override 
    public String toString() {
        return "[" + getClass().getSimpleName() + "] " + marca + " " + modelo +
               " (Placa: " + placa + ") - Estado: " + estado +
               " - Tarifa/Dia: $" + calcularTarifaDiaria();
    }
}
