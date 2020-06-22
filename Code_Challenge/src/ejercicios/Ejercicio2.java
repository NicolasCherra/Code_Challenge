package ejercicios;

public class Ejercicio2 {
		char [][] area = new char[4][4];
		byte [][] myArray= {{1,2},{-1,1},{0,1},{2,-1},{-1,-2}};
		
		public char[][] crearArea()
		{
			for(int i=0; i<4; i++)
			{
				for(int j=0; j<4; j++)
				{
					if(i==0 && j==0)
					{
						area[i][j]='X';
						j++;
					}
					area[i][j]='O';
				}
			}
			return area;
		}
		
		
		public void moverX() {
			
			byte unidadFila=0;
			byte unidadColumna=0;
			byte ultimoLugarXColumna=0;
			byte ultimoLugarXFila=0;
			
			
			for(int i=0; i<5; i++) {
				
				for(int j=0; j<1; j++) {
					// un movimiento
					area[ultimoLugarXColumna][ultimoLugarXFila]='O';
					Boolean desbordeColumna=false;
					Boolean desbordeFila=false;
					unidadColumna=myArray[i][1];
					unidadFila=myArray[i][0];
					
					//Desborde columna
					if(ultimoLugarXColumna==3 && unidadColumna>0){
						
					;
						ultimoLugarXColumna=3;
						desbordeColumna=true;
					}else if(ultimoLugarXColumna==0 && unidadColumna<0) {
						
			
						ultimoLugarXColumna=0;
						desbordeColumna=true;
					}else if(unidadColumna>3){
		
						ultimoLugarXColumna=3;
						desbordeColumna=true;
					}else if(unidadColumna<-3) {
						
				
						ultimoLugarXColumna=0;
						desbordeColumna=true;
					}else if(ultimoLugarXColumna==2 && unidadColumna>1) {
						
	
						ultimoLugarXColumna=3;
						desbordeColumna=true;
					}else if(ultimoLugarXColumna==1 && unidadColumna<-1) {
						
						ultimoLugarXColumna=0;
						desbordeColumna=true;
					}
					
					
					//Desborde Fila
					if(ultimoLugarXFila==3 && unidadFila>0){
						
						ultimoLugarXFila=3;
						desbordeFila=true;
					}else if(ultimoLugarXFila==0 && unidadFila<0) {
						
						ultimoLugarXFila=0;
						desbordeFila=true;
					}else if(unidadFila>3){

						ultimoLugarXFila=3;
						desbordeFila=true;
					}else if(unidadFila<-3) {
						ultimoLugarXFila=0;
						desbordeFila=true;
					}else if(ultimoLugarXFila==2 && unidadFila>1) {
						
						ultimoLugarXFila=3;
						desbordeFila=true;
					}else if(ultimoLugarXFila==1 && unidadFila<-1) {
						
						ultimoLugarXFila=0;
						desbordeFila=true;
					}
					
					//Mover
					if(desbordeColumna==true && desbordeFila==false) {
						
						area[ultimoLugarXColumna][ultimoLugarXFila+unidadFila]='X';
						ultimoLugarXFila+=unidadFila;
					}else if(desbordeColumna==false && desbordeFila==true) {
						
						
						area[ultimoLugarXColumna+unidadColumna][ultimoLugarXFila]='X';
						ultimoLugarXColumna+=unidadColumna;
					}else if(desbordeColumna==false && desbordeFila==false) {
						
						area[ultimoLugarXColumna+unidadColumna][ultimoLugarXFila+unidadFila]='X';
						ultimoLugarXFila+=unidadFila;
						ultimoLugarXColumna+=unidadColumna;
					}

						
				}
				
			}
			
			
			
		}
		
		
		public String dibujarArea()
		{
			String areaD="";
			for(int i=0; i<4; i++)
			{
				
				for(int j=0; j<4; j++)
				{
					areaD+=area[i][j];
				}
				areaD+="\n";
			}
			return areaD;
		}
		
		public static void main(String []args){
			Ejercicio2 ejercicio2=new Ejercicio2();
			ejercicio2.crearArea();
			ejercicio2.moverX();
			System.out.println(ejercicio2.dibujarArea());
		}
}
