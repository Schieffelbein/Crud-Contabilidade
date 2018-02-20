package Cont;

import java.util.Scanner;

public class Regras {
   
    public static void main(String[] args) {
        
        System.out.println("Digite o salario: ");
        Regras regras = new Regras();
        Scanner ler = new Scanner(System.in);
        double salario;
        salario = 0.0;
        salario = ler.nextDouble();
    System.out.println("salario: " + regras.calcularImposto(salario));
    
    }
    public double calcularImposto(double salario) {
        if (salario <= 1903.98) {
            return salario;

        }
        if ((salario >= 1903.99) && (salario <= 2826.65)) {
            return salario*0.925;

        }    if ((salario >= 2826.66) && (salario <= 3751.05)) {
            return salario*0.85;
            }

            if ((salario >= 3751.06) && (salario <= 4664.68)) {
                return salario*0.775;
                
        }else{
                return salario*0.725;
        }                 
    }
}
