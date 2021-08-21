package conversãodetemperatura;

import java.util.Scanner;


public class ConversãoDeTemperatura {

    public static void main(String[] args) {
        //Escreva um programa em Java que converta temperaturas em Fahrenheit (F) para Celcius (C). 
        //Sabendo que a temperatura em Celcius é 22 e a fórmula para conversão é F = C * 1.8 *;
      
        System.out.println("Qual a temperatura em Fahrenheit? ");
        Scanner input = new Scanner(System.in);
        
        float Fahrenheit = input.nextFloat();
        float Celcius = Fahrenheit * 1.8F;
        
        System.out.println("A temperatura em Celcius é: " + Celcius + " oC");
        
     
        
        
    }
    
}
