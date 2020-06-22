package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;


public class Ejercicio3 {

	ArrayList<Codigo> lista=new ArrayList<Codigo>();
	
	
	public ArrayList<Codigo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Codigo> lista) {
		this.lista = lista;
	}

	public boolean agregarProducto(Codigo codigo) {
		return lista.add(codigo);
	}
	
	public boolean esPrioritario(Codigo codigo) {
			if(codigo.getXXX_NNNNN_Y().charAt(0)=='P'||codigo.getXXX_NNNNN_Y().charAt(0)=='W')
			return true;
			
			return false;
			
	}
	
	public	boolean verificar(Codigo codigo) {
		int pNumero=Character.getNumericValue(codigo.getXXX_NNNNN_Y().charAt(4));
		int sNumero=Character.getNumericValue(codigo.getXXX_NNNNN_Y().charAt(5));
		int tNumero=Character.getNumericValue(codigo.getXXX_NNNNN_Y().charAt(6));
		int cNumero=Character.getNumericValue(codigo.getXXX_NNNNN_Y().charAt(7));
		int qNumero=Character.getNumericValue(codigo.getXXX_NNNNN_Y().charAt(8));
		
		int y=Character.getNumericValue(codigo.getXXX_NNNNN_Y().charAt(10)); 
		
		int verificado=pNumero+sNumero+tNumero+cNumero+qNumero;
		
		if(Integer.toString(verificado).length()>1)
		{
			int primerN=verificado/10;
			int segundoN=verificado%10;
			int ultimoVerificado=primerN+segundoN;
			
			if(ultimoVerificado==y) {
				return true;
			}else {
				return false;
			}
			
		}else if(Integer.toString(verificado).length()==1)
		{
			if(verificado==y) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;
	}
	
	
	public ArrayList<Codigo> ordenarAlfabeticamente(ArrayList<Codigo> l){
		Collections.sort(l);
		return l;
	}
	
	public ArrayList<Codigo> unirLista(ArrayList<Codigo> l1, ArrayList<Codigo> l2){
		l1.addAll(l2);
		return l1;
	}
	
	public ArrayList<Codigo> interceptarLista(ArrayList<Codigo> l1, ArrayList<Codigo> l2){
		l1.retainAll(l2);
		l1= (ArrayList<Codigo>) l1.stream().distinct().collect(Collectors.toList());
		return l1;
	}
	
	
	
	public static void main(String args[]) {
		Ejercicio3 ej=new Ejercicio3();
		Ejercicio3 ej2=new Ejercicio3();
		Codigo producto=new Codigo("BBB-99999-9");
		Codigo producto2=new Codigo("AAA-12345-5");
		Codigo producto3=new Codigo("PZZ-12345-5");
		Codigo producto4=new Codigo("ABB-12345-5");
		
		ej.agregarProducto(producto);
		ej.agregarProducto(producto2);
		ej.agregarProducto(producto3);
		ej.agregarProducto(producto4);
		
		ej2.agregarProducto(producto);
		ej2.agregarProducto(producto2);

		System.out.println(ej.verificar(producto));
		System.out.println(ej.esPrioritario(producto3));
		System.out.println(ej.getLista());
		System.out.println(ej.ordenarAlfabeticamente(ej.getLista()));
		System.out.println(ej.unirLista(ej.getLista(),ej2.getLista()));
		System.out.println(ej.interceptarLista(ej.getLista(),ej2.getLista()));
	}
}
