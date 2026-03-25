public class Dueno {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String cedula;

    public Dueno(String nombre, String apellido, String telefono, String email, String cedula) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setEmail(email);
        setCedula(cedula);
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre == null || nombre.trim().isEmpty()) 
            ? "Desconocido" : nombre.trim();
    }

    public void setApellido(String apellido) {
        this.apellido = (apellido == null || apellido.trim().isEmpty()) 
            ? "Desconocido" : apellido.trim();
    }

    public void setTelefono(String telefono) {
        boolean valido = telefono != null && telefono.matches("\\d{10}");
        this.telefono = valido ? telefono : "0000000000";
    }

    public void setEmail(String email) {
        boolean valido = email != null && email.contains("@") && email.indexOf(".") > email.indexOf("@");
        this.email = valido ? email.trim() : "sin@email.com";
    }

    public void setCedula(String cedula) {
        this.cedula = (cedula == null || cedula.trim().isEmpty()) 
            ? "0000000000" : cedula.trim();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getCedula() {
        return cedula;
    }

    // nombre completo
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    // email
    public boolean tieneEmailValido() {
        return email != null && email.contains("@") && email.indexOf(".") > email.indexOf("@");
    }

    @Override
    public String toString() {
        return "=== Datos del Dueño ===\n" +
               "Nombre completo: " + getNombreCompleto() + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Email: " + email + "\n" +
               "Cédula: " + cedula;
    }
}