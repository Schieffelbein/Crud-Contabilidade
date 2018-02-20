package contabilidade;

import java.util.Scanner;

public class Contabilidade {

 
    public static void main(String[] args) {
       Caneta c = new Caneta();
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite o modelo");
       c.modelo = ler.nextLine();
       System.out.println("Digite a cor");
       c.cor = ler.nextLine();
       System.out.println("Digite a capacidade");
       c.capacidade = ler.nextInt();
       c.status();
       c.rabiscar();
    }
    
}
