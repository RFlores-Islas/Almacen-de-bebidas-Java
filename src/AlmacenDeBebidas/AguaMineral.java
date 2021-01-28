package AlmacenDeBebidas;

public class AguaMineral extends Bebida{
	
	private String manantial;

	public AguaMineral(String manantial, double cantidadLitros, double precio, String marca) {
		super(cantidadLitros, precio, marca);
		this.manantial = manantial;
	}

	public String getManantial() {
		return manantial;
	}

	public void setManantial(String manantial) {
		this.manantial = manantial;
	}

	@Override
	public String toString() {
		return super.toString()+" Manantial = " + manantial;
	}

	
	
}
