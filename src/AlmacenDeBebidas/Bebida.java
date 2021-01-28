package AlmacenDeBebidas;

public class Bebida {

	private static int idActual=1;
	
	private int id;
	private double cantidadLitros;
	private double precio;
	private String marca;
	
	public Bebida(double cantidadLitros, double precio, String marca) {
		this.id=idActual++;
		this.cantidadLitros=cantidadLitros;
		this.precio=precio;
		this.marca=marca;
	}

	public static int getIdActual() {
		return idActual;
	}

	public static void setIdActual(int idActual) {
		Bebida.idActual = idActual;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCantidadLitros() {
		return cantidadLitros;
	}

	public void setCantidadLitros(double cantidadLitros) {
		this.cantidadLitros= cantidadLitros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Id=" + id + ", Cantidad de Litros= " + cantidadLitros + ", Precio= " + precio + ", Marca= " + marca + " ";
	}
	
	
	
}
