public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diasAlquiler;
    private double costoTotal;
    private boolean activo;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, int diasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diasAlquiler = diasAlquiler;
        this.costoTotal = vehiculo.calcularCostoAlquiler(diasAlquiler);
        this.activo = true;
        
        this.vehiculo.setEstado(EstadoVehiculo.ALQUILADO);
    }

    public void finalizarAlquiler() {
        if (activo) {
            this.activo = false;
            this.vehiculo.setEstado(EstadoVehiculo.DISPONIBLE);
        }
    }

    public double getCostoTotal() { return costoTotal; }
    public Cliente getCliente() { return cliente; }
    public Vehiculo getVehiculo() { return vehiculo; }
    public boolean isActivo() { return activo; }

    public String toString() {
        return "Alquiler [Cliente: " + cliente.getNombre() +
               " | Vehículo: " + vehiculo.getPlaca() +
               " | Días: " + diasAlquiler +
               " | Total: $" + costoTotal +
               " | Activo: " + activo + "]";
    }
}