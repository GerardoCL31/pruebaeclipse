package Listas;

import java.util.ArrayList;
import java.util.Collections;


public class ListaEjemploInteger {
public static void main(String[]args) {
	ArrayList<Integer> numeros= new ArrayList<Integer>();
	numeros.add(19);
	numeros.add(69);
	numeros.add(11);
	
Collections.sort(numeros);
for(int i: numeros) {
System.out.println(i);
}

Collections.reverse(numeros);
for(int i: numeros) {
	System.out.println(i);
}
for(int i=1;i<20;i++) {
	ArrayList<Integer> numerosA = null;
	numerosA.add(i);
}


}
}
