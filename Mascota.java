public class Mascota {
    private String nombre;
	private String especie;
	private String raza;
	private int edad;
	private double peso;
	


	public Mascota(String nombre, String especie,int edad, String raza,  double peso) {
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre==null) {
          this.nombre="SIN NOMBRE";
		}else {
			this.nombre = nombre;
		}
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		if(especie==null) {
		      System.out.println("DESCONICIDA");
					
				}else {
					this.especie = especie;
				}
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		if(raza==null) {
		      System.out.println("MESTIZO");
					
				}else {
					this.raza = raza;
				}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		
		
		if(edad<=0) {
		      this.edad=0;
					
				}else {
					this.edad=edad;
				}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso<=0) {
		       setPeso(0.1);
					
				}else {
					this.peso = peso;
				}
	

	}
	
	public  boolean esAdulto() {
		
		if( edad>=3) {
		return true;
		}else {
			return false;
		}
		
	}
	public boolean esPesoNormal(double pesoMin, double pesoMax) {
		
		if(pesoMin>pesoMax) {
		  System.out.println("El peso minimo no puede ser mayor al peso Maximo");
		}
		
		return peso>=pesoMin && peso<=pesoMax;
	}
		
  
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + ", edad=" + edad + ", peso="
				+ peso + "]";
	}
	
	
}