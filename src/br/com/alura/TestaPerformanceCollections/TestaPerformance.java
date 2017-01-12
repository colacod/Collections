package br.com.alura.TestaPerformanceCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

  public static void main(String[] args) {

    // --------------------- ArrayList ---------------------

    Collection<Integer> numerosList = new ArrayList<Integer>();

    long inicioList = System.currentTimeMillis();

    for (int i = 1; i <= 50000; i++) {
      numerosList.add(i);
    }

    for (Integer numero : numerosList) {
      numerosList.contains(numero);
    }

    long fimList = System.currentTimeMillis();

    long tempoDeExecucaoList = fimList - inicioList;

    System.out.println("Tempo gasto List: " + tempoDeExecucaoList);

    // --------------------- HashSet ---------------------

    Collection<Integer> numerosHash = new HashSet<Integer>();

    long inicioHash = System.currentTimeMillis();

    for (int i = 1; i <= 50000; i++) {
      numerosHash.add(i);
    }

    for (Integer numero : numerosHash) {
      numerosHash.contains(numero);
    }

    long fimHash = System.currentTimeMillis();

    long tempoDeExecucaoHash = fimHash - inicioHash;

    System.out.println("Tempo gasto Hash: " + tempoDeExecucaoHash);
  }
}
