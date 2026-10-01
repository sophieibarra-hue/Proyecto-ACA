public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diasAlquiler;
    private double costoTotal;
    private boolean activo;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

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

    @Override 
    public String toString() {
        return "Alquiler [Cliente: " + cliente.getNombre() +
               " | Vehículo: " + vehiculo.getPlaca() +
               " | Días: " + diasAlquiler +
               " | Total: $" + costoTotal +
               " | Activo: " + activo + "]";
    }
}
