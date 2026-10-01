public class Cliente {
    private String documento;
    private String nombre;
    private String telefono;

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente(String documento, String nombre, String telefono) {
        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    @Override 
    public String toString() {
        return nombre + " (Doc: " + documento + ", Tel: " + telefono + ")";
    }
}
