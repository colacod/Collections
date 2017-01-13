package br.com.alura.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercicio {

  public static void main(String[] args) {

    Map<Integer, String> pessoas = new HashMap<>();

    pessoas.put(21, "Leonardo Cordeiro");
    pessoas.put(27, "Fabio Pimentel");
    pessoas.put(19, "Silvio Mattos");
    pessoas.put(23, "Romulo Henrique");
    
    for (Integer key : pessoas.keySet()) {
     System.out.println(key); 
    }
    
    for (String value : pessoas.values()) {
      System.out.println(value); 
    }
    
    for (Entry<Integer, String> pessoa : pessoas.entrySet()) {
      System.out.println(pessoa.getKey()); 
      System.out.println(pessoa.getValue()); 
    }
  }
}
