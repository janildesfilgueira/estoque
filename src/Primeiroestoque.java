import Classe.Estoque;

public class Primeiroestoque {
    public static void main(String[] args) {
     Estoque estoque = new Estoque("Peledourada","m","Maiô");
     System.out.println(estoque.getMarca());
     System.out.println(estoque.getTamanho());
     System.out.println(estoque.getModelo());
    }
} 
