package Listas;
import java.util.ArrayList;

public class LIstaEjemplo {
	public static void main(String[]args) {
		ArrayList <String> coches= new ArrayList<String>();
		//ArrayList <Integer> numeros= new ArrayList<Integer>();
		
		coches.add("Audi");
		coches.add("seat");
		coches.add("citroen");
		coches.add("BMW");
		coches.remove(2);
		System.out.println(coches);
		int tam=coches.size();
		System.out.println(tam);
		for (int i = 0; i <coches.size(); i++) {
			System.out.println(coches.get(i));
			
		}
		for(String i: coches)
		
	}
}
