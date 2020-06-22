package ejercicios;

public class Ejercicio1 {
	private byte [] myArray={1,2,1,3,3,1,2,1,5,1};
	
	public String histograma() {
		String histograma="";
		for (byte numero : myArray) {
			switch(numero) {
				case 1: histograma+="1:*****\n"; break;
				case 2: histograma+="2:**\n"; break;
				case 3: histograma+="3:**\n"; break;
				case 4: histograma+="4:\n"; break;
				case 5: histograma+="5:*\n"; break;
				default: break;
			}
		}
		return histograma;
	}
	
	public static void main(String []args){
		Ejercicio1 ej = new Ejercicio1();
		System.out.println(ej.histograma());
	}
}
