package repetitivas;

import java.util.Scanner;

public class ejerciciosWhile {
	
	/*
	public static void eje1() {
		int num=0;
		
		while(num<10){
			
			num++;
			System.out.println(num);
			
		}
		
		
	}
	*/
	/*
	public static void eje2() {
		int num=10;
		
		while(num>0){
			
			System.out.println(num);
			num--;
		}
		
		
	}
	
	*/
/*	
	public static void eje3() {
		
		Scanner lector=new Scanner(System.in);
		
		int flag=0;
		String clave;
		
		while(flag==0){
			
			System.out.println("ingrese clave: ");
			clave=lector.nextLine();
			
			if(clave.equals("utn750")){
				System.out.println("corecto");
				flag=1;
			}
			else{
				System.out.println("Error no es la clave");
			}
		}
		
		
	}
*/
/*	
	public static void eje4() {
		
		Scanner lector=new Scanner(System.in);
		
		String aux;
		int num;
		int flag=0;
		
		while(flag==0){
			
			System.out.println("ingrese un numero del 0 al 9: ");
			
			aux=lector.nextLine();
			num=Integer.parseInt(aux);
			
			
			if(num>=0&&num<=9){
				System.out.println("corecto");
				flag=1;
			}
			else{
				System.out.println("Error fuera de rango");
			}
		}
		
		
	}	
	*/
	/*
	public static void eje5() {
		
		Scanner lector=new Scanner(System.in);
		
		String sexo;
		int flag=0;
		
		while(flag==0){
			
			System.out.println("ingrese sexo [F/M]: ");
			
			sexo=lector.nextLine();
			
			if(sexo.equals("f")||sexo.equals("m")){
				System.out.println("corecto");
				flag=1;
			}
			else{
				System.out.println("Error fuera de rango");
			}
		}
		
		
	}
	*/
	/*
public static void eje6() {
		
		Scanner lector=new Scanner(System.in);
		
		String aux;
		int num;
		int contador=1;
		int acumulador=0;
		
		while(contador<=5){
			
			System.out.println(contador+" ingrese numero:");
			aux=lector.nextLine();
			num=Integer.parseInt(aux);
			acumulador+=num;
			contador++;
		}
		
		System.out.println("la suma es: "+acumulador);
	}
	*/
	/*
public static void eje7() {
		
		Scanner lector=new Scanner(System.in);
		
		String seguir="s";
		String aux;
		int num;
		int contador=1;
		int acumulador=0;
		
		while(seguir.equals("s")){
			
			System.out.println(contador+" ingrese numero:");
			aux=lector.nextLine();
			num=Integer.parseInt(aux);
			acumulador+=num;
			contador++;
			System.out.println("quiere continuar ingresando numero? [S/N]:");
			seguir=lector.nextLine();
		}
		
		System.out.println("la suma es: "+acumulador);
	}
	*/
	/*
public static void eje8() {
	
	Scanner lector=new Scanner(System.in);
	
	String seguir="s";
	String aux;
	int flag=0;
	int num;
	int contador=1;
	int acumuladorPositivo=0;
	int productoNegativos=0;
	
	while(seguir.equals("s")){
		
		System.out.println(contador+" ingrese numero:");
		aux=lector.nextLine();
		num=Integer.parseInt(aux);
		
		if(num>0){
			acumuladorPositivo+=num;
		}
		else{
			if(flag==0){
				productoNegativos=1;
				flag=1;
			}
			productoNegativos*=num;
		}
		contador++;
		System.out.println("quiere continuar ingresando numero? [S/N]:");
		seguir=lector.nextLine();
	}
	
	System.out.println("la suma positiva es: "+acumuladorPositivo);
	System.out.println("la el producto negativo es: "+productoNegativos);
}
*/
	/*
	public static void eje9() {
		
		Scanner lector=new Scanner(System.in);
		
		String seguir="s";
		String aux;
		int flag=0;
		int num;
		int max=0;
		int min=0;
		
		while(seguir.equals("s")){
			
			System.out.println("ingrese numero:");
			aux=lector.nextLine();
			num=Integer.parseInt(aux);
			
			if(flag==0){
				max=num;
				min=num;
				flag=1;
			}
			
			if(num>max){
				max=num;
			}
			
			if(num<min){
				min=num;
			}
			System.out.println("quiere continuar ingresando numero? [S/N]:");
			seguir=lector.nextLine();
		}
		
		System.out.println("el mumero ingresado mas chico es: "+min);
		System.out.println("el mumero ingresado mas alto es: "+max);
	}
	*/
	/*
	public static void eje10() {
		
		Scanner lector=new Scanner(System.in);
		
		String seguir="s";
		String aux;
		int num;
		int contadorPos=0;
		int contadorNeg=0;
		int contadorCero=0;
		int contadorPares=0;
		int sumaPos=0;
		int sumaNeg=0;
		int diferencia;
		int promedioNeg;
		int promedioPos;
		
		while(seguir.equals("s")){
			
			System.out.println("ingrese numero:");
			aux=lector.nextLine();
			num=Integer.parseInt(aux);
			
			if(num>0){
				contadorPos++;
				sumaPos+=num;
			}
			
			else if(num<0){
				contadorNeg++;
				sumaNeg+=num;
			}
			else{
				contadorCero++;
			}
			if(num/2==0){
				contadorPares++;
			}
			System.out.println("quiere continuar ingresando numero? [S/N]:");
			seguir=lector.nextLine();
		}
		
		System.out.println("\nla suma de negativos: "+sumaNeg);
		System.out.println("\nla suma de positivo: "+sumaPos);
		
		System.out.println("\ncantidad de positivo: "+contadorPos);
		System.out.println("\ncantidad de negativo: "+contadorNeg);
		System.out.println("\ncantidad de ceros: "+contadorCero);
		System.out.println("\ncantidad de pares: "+contadorPares);
		
		
		promedioNeg=sumaNeg/contadorNeg;
		promedioPos=sumaPos/contadorPos;
		
		System.out.println("\nel promedio de numeros positivos es: "+promedioPos);
		System.out.println("\nel promedio de numeros negativos es: "+promedioNeg);
		
		diferencia=contadorNeg-contadorPos;
		
		if(diferencia<0){
			diferencia=diferencia*(-1);
		}
		System.out.println("\nla diferencia entre positivos y negativos es: "+diferencia);
	}
	*/
}
