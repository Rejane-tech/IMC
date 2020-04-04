package Indice;

import java.util.Scanner;

	public class MassaCorporal {

		   public double peso;
		   public double altura;
	       public double imc;

	       public double CalculoIMC (double peso, double altura) {
	       imc = peso / (altura * altura);
	       return imc;
           }
	
           public void getTipo(){
    	   if ( this.imc < 18.5)  {
    	   System.out.println( "adulto com baixo peso ");
   		
    	   }	
    	   if (this.imc >= 18.5 && this.imc < 25.0) {
    	   System.out.println ( "adulto com peso adequado");
    	   }
    	   if (this.imc >= 25.0 && this.imc <30) {
    	   System.out.println ("adulto com sobrepeso");
    	
    	   }	 if (this.imc >= 30)  {
    	   System.out.println( "adulto com obesidade");
    	   }
           }   
           public static void main(String args []) {
    	   Scanner sc= new Scanner (System.in);
    	    
    	   System.out.println("Qual seu peso ? ");
    	   double peso= sc.nextDouble();
    	   System.out.println("Qual sua altura ? ");
    	   double altura=sc.nextDouble();
    	    
    	   MassaCorporal imc= new MassaCorporal();
    	   imc.CalculoIMC(peso, altura);
    	   System.out.println(imc.CalculoIMC(peso, altura));
    	   imc.getTipo();
    	    
    	   sc.close();
}
}