package Classe;

public class Estoque {

  protected String marca,tamanho,modelo;
  protected Integer quantidade;
  
  public Estoque (String marca,String tamanho,String modelo){
    this.marca= marca;
    this.tamanho=tamanho;
    this.modelo=modelo;    
  }
  
  public String getMarca(){
    return this.marca;
  }

  public void SetMarca(String marca){
    this.marca=marca; 
  }

  public String getTamanho(){
    return this.tamanho;
  }

  public void SetTamanho(String tamanho){
    this.tamanho= tamanho;
  }
  
  public String getModelo(){
    return this.modelo;
  } 
  
  public void setModelo(String modelo){
    this.modelo=modelo;
  }

}
  
  
    
    
  
