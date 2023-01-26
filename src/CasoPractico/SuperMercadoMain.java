package CasoPractico;

import java.util.Arrays;

public class SuperMercadoMain {

	public static void main(String[] args) {
		System.out.println("******Menu******");
		String [] productos = {"Tomate","Aceite","Pan","Leche","Yogur","Queso","Jamon","Harina","Champu","Manzana"};
		System.out.println(Arrays.toString(productos));
		System.out.println("******Menu Ordenado******");
		Arrays.sort(productos);
		System.out.println(Arrays.toString(productos));
		String cliente = "cantidad";
		String compra = cliente + productos;
		if (cliente==compra) {
			System.out.println("La cantidad de productos es: " + compra );
		}
	}

}
