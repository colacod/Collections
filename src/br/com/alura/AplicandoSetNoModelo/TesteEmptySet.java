package br.com.alura.AplicandoSetNoModelo;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

  public static void main(String[] args) {

    Set<String> nomes = Collections.emptySet();
    nomes.add("Paulo");

    // o que acontece aqui?
    /*
     * Exception in thread "main" java.lang.UnsupportedOperationException at
     * java.util.AbstractCollection.add(Unknown Source) at
     * br.com.alura.AplicandoSetNoModelo.TesteEmptySet.main(TesteEmptySet.java:11)
     */
  }
}
