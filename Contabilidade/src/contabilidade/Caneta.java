package contabilidade;

public class Caneta {
    String modelo;
    String cor;
    int capacidade;
    String rabiscar;
 
    public String getCor(){
    return this.cor;
    }
    public void setCor(String c){
    this.cor = c;
    }
    public String getModelo(){
    return this.modelo;
    }
    public void setModelo(String m){
    this.modelo = m;
    }
    public void setCapacidade (int p){
    this.capacidade = p;
    }
    public int getCapacidade(){
    return this.capacidade;
    }
     public void status(){
         System.out.println("A cor da sua caneta é : "+ this.getCor());
         System.out.println("O modelo da sua caneta é : " + this.getModelo());
         System.out.println("A capacidade da sua caneta é : " + this.getCapacidade());
     }
     public void rabiscar(){
         if (capacidade>= 1) {
             System.out.println("Estou rabiscando!");
         } else if(capacidade<= 0) {
             System.out.println("Não consigo rabiscar!");
         }
         
         
     }
}
