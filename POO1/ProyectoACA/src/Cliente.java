public class Cliente {
    private String documento;
    private String nombre;
    private String telefono;

    public Cliente(String documento, String nombre, String telefono) {
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    public String toString() {
        return nombre + " (Doc: " + documento + ", Tel: " + telefono + ")";
    }
}