package prectica1;

import java.awt.FlowLayout;
import java.util.Scanner;

public class ClassEjercicios {
	/*
	public static void ejercicio1(){//funciones
		
		System.out.println("ejercicio 1");
	}
	public static void ejercicio2(){//funciones
		
		System.out.println("ejercisio 2");
	}
	*/
	/*
	public static void calculadora(){
		
		Scanner s=new Scanner(System.in);//pedir numero
		
		//declaracion de la variable
		String num1;
		String num2;
		int n1;
		int n2;
		int resultado;
		
		System.out.println("ingrese numero 1: ");
		num1=s.nextLine();
		
		System.out.println("ingrese numero 2: ");
		num2=s.nextLine();
		
		n1=Integer.parseInt(num1);
		n2=Integer.parseInt(num2);
		
		if(n2!=0){
		
		// parsear el string para hacer el calculo ( Integer.parseInt(nombre de la variable) )
		resultado=Integer.parseInt(num1)/Integer.parseInt(num2);
		System.out.println("la divicion es: "+resultado);
		}
		else{
			
			System.out.println("Error ne se puede dividir por 0 ");
		}
	}
*/
	/*
	public static void eje1(){
		
		Scanner s=new Scanner(System.in);
		
		String edad;
		int N;
		
		System.out.println("ingrese edad");
		edad=s.nextLine();
		
		N=Integer.parseInt(edad);
		
		if(N==15){
			
			System.out.println("niña bonita");
		}
		else{
			System.out.println("no es una quinseañera");
		}
	}
*/
	/*
	public static void eje2(){
		
		Scanner s=new Scanner(System.in);
		
		String edad;
		int N;
		
		System.out.println("ingrese edad");
		edad=s.nextLine();
		
		N=Integer.parseInt(edad);
		
		if(N>=18){
			
			System.out.println("es mayor de edad");
		}
	}
*/
	/*
	public static void eje3(){
		
		Scanner s=new Scanner(System.in);
		
		String edad;
		int N;
		
		System.out.println("ingrese edad");
		edad=s.nextLine();
		
		N=Integer.parseInt(edad);
		
		if(N>=18){
			
			System.out.println("es mayor de edad");
		}
		else{
			
			System.out.println("es menor de edad");
		}
	}
*/	
	/*
	public static void eje4(){
		
		Scanner s=new Scanner(System.in);
		
		String edad;
		int N;
		
		System.out.println("ingrese edad");
		edad=s.nextLine();
		
		N=Integer.parseInt(edad);
		
		if(N>=13&&N<=17){
			
			System.out.println("es un adolecente");
		}
	}
*/
	/*
	public static void eje5(){
	
	Scanner s=new Scanner(System.in);
	
	String edad;
	int N;
	
	System.out.println("ingrese edad");
	edad=s.nextLine();
	
	N=Integer.parseInt(edad);
	
	if(!(N>=13&&N<=17)){
		
		System.out.println("no es un adolecente");
	}
	
}
*/
	/*
	public static void eje6(){
		
	Scanner s=new Scanner(System.in);
	
	String edad;
	int N;
	
	System.out.println("ingrese edad");
	edad=s.nextLine();
	
	N=Integer.parseInt(edad);
	
	if(N>=18){
		
		System.out.println("es mayor de edad");
	}
	else if(N>=13){
		
		System.out.println("es un adolecente");
	}
	else {
		
		System.out.println("es un niño");
	}
	
}
*/
	
/*
	public static void eje7(){
		
		Scanner s=new Scanner(System.in);
		
		String edad;
		String opcion;
		int N;
		int O;
		
		System.out.println("ingrese edad");
		edad=s.nextLine();
		
		N=Integer.parseInt(edad);
		
		System.out.println("1_soltero");
		System.out.println("2_casado");
		System.out.println("3_divorciado");
		System.out.println("eleguir estado");
		
		opcion=s.nextLine();
		O=Integer.parseInt(opcion);
		
		switch(O){
		
		case 1:
			break;
		case 2:
		if(N<=18)
				System.out.println("Es muy pequeño para NO ser soltero");
			break;
		case 3:
		if(N<=18)
				System.out.println("Es muy pequeño para NO ser soltero");
			break;		
		}
	}
*/
	
/*	
	public static void eje8(){
		
		Scanner s=new Scanner(System.in);
		
		String edad;
		String opcion;
		int N;
		int O;
		
		System.out.println("ingrese edad");
		edad=s.nextLine();
		
		N=Integer.parseInt(edad);
		
		System.out.println("1_soltero");
		System.out.println("2_casado");
		System.out.println("3_divorciado");
		System.out.println("eleguir estado");
		
		opcion=s.nextLine();
		O=Integer.parseInt(opcion);
		
		switch(O){
		
		case 1:
			if(N>=18)
				System.out.println("Es soltero y no es menor");
			break;
		case 2:
			break;
		case 3:
			break;		
		}
	}
*/
	
}
