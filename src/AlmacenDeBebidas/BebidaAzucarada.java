package AlmacenDeBebidas;

public class BebidaAzucarada extends Bebida{

	private double porcentajeAzucar;
	private boolean promocion;
	
	public BebidaAzucarada(double porcentajeAzucar, boolean promocion, double cantidadLitros, double precio, String marca) {
		super(cantidadLitros, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}

	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean getPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	public double getPrecio() {
		if(getPromocion()) {
			return super.getPrecio()*0.9;
		}else {
			return super.getPrecio();
		}
		
	}

	@Override
	public String toString() {
		return super.toString()+" Porcentaje de Azucar = " + porcentajeAzucar + ", Promocion=" + promocion;
	}
	
	

}
