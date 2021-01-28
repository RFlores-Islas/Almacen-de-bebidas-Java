package AlmacenDeBebidas;

public class BebidaApp {
	public static void main(String []args) {
		
		Almacen a = new Almacen();
		Bebida b;
		
		for(int i=0; i<10; i++) {
			switch(i%2) {
			case 0: 
				b=new AguaMineral("Manantial1", 1.5, 5, "bezoya");
				a.agregarBebida(b);
				break;
			case 1:
                b=new BebidaAzucarada(0.2, true, 1.5, 10, "Coca Cola");
                a.agregarBebida(b);
                break;
			}
		}
		 //Muestro las bebidas
        a.mostrarBebida();
        
        //Calculo el precio de todas las bebidas
        System.out.println("Precio de todas las bebidas "+a.calcularPrecioBebida());
        
        //Elimino una bebida en concreto
        a.eleminarBebida(4);
        
        //Muestro las bebidas
        a.mostrarBebida();
        
        //
        System.out.println("Precio de todas las bebidas"+a.calcularPrecioBebida());
        
        System.out.println("Precio de todas las bebidas de la marca bezoya" +a.calcularPrecioBebida("bezoya"));
        
        System.out.println("Calcular el precio de la columna 0: "+a.calcularPrecioBebida(0));
        
    }
	

}
