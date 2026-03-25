public class Consulta {
  
	private String fecha;      
    private String motivo;
    private String diagnostico;
    private double costo;
    private boolean requiereCirugia;

    public Consulta(String fecha, String motivo, String diagnostico, double costo, boolean requiereCirugia) {
        setFecha(fecha);
        setMotivo(motivo);
        setDiagnostico(diagnostico);
        setCosto(costo);
        this.requiereCirugia = requiereCirugia;
    }


    public void setFecha(String fecha) {
        if (fecha == null || fecha.trim().isEmpty()) {
            this.fecha = "01/01/2000";
        } else {
            this.fecha = fecha;             
        }
    }

    public void setMotivo(String motivo) {
        if (motivo == null || motivo.trim().isEmpty()) {
            this.motivo = "Sin motivo registrado";
        } else {
            this.motivo = motivo;
        }
    }

    public void setDiagnostico(String diagnostico) {
        if (diagnostico == null || diagnostico.trim().isEmpty()) {
            this.diagnostico = "Pendiente de diagnóstico";
        } else {
            this.diagnostico = diagnostico;
        }
    }

    public void setCosto(double costo) {
        if (costo <= 0) {
            this.costo = 1.0;
        } else {
            this.costo = costo;
        }
    }

    public void setRequiereCirugia(boolean requiereCirugia) {
        this.requiereCirugia = requiereCirugia;
    }


    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public double getCosto() {
        return costo;
    }

    public boolean isRequiereCirugia() {
        return requiereCirugia;
    }



    public String calcularCategoriaCosto() {
        if (costo < 50) {
            return "Bajo";
        } else if (costo < 150) {
            return "Medio";
        } else {
            return "Alto";
        }
    }

    public boolean esCritica() {
        return requiereCirugia && costo > 200;
    }

    public String toString() {
        return "Consulta{" +
                "fecha='" + fecha + '\'' +
                ", motivo='" + motivo + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", costo=" + costo +
                ", requiereCirugia=" + requiereCirugia +
                '}';
    }

}

    
