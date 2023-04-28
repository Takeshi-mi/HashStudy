/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncadeamentoExterno;

/**
 *
 * @author Takeshi
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListaEncadeadaExterna {
    public static void main(String[] args) {
        HashMap<Integer, List<String>> hashMap = new HashMap<Integer, List<String>>();

        // Adiciona elementos na tabela hash
        hashMap.put(1, new ArrayList<String>());
        hashMap.get(1).add("um");
        hashMap.get(1).add("primeiro");

        hashMap.put(2, new ArrayList<String>());
        hashMap.get(2).add("dois");
        hashMap.get(2).add("segundo");

        hashMap.put(3, new ArrayList<String>());
        hashMap.get(3).add("três");
        hashMap.get(3).add("terceiro");

        // Recupera valores associados às chaves
        List<String> valores1 = hashMap.get(1);
        System.out.println("Valores associados à chave 1: " + valores1);

        List<String> valores2 = hashMap.get(2);
        System.out.println("Valores associados à chave 2: " + valores2);

        List<String> valores3 = hashMap.get(3);
        System.out.println("Valores associados à chave 3: " + valores3);

        // Itera sobre todas as chaves e seus valores associados
        for (Integer chave : hashMap.keySet()) {
            List<String> valores = hashMap.get(chave);
            System.out.println("Chave: " + chave + ", valores: " + valores);
        }
    }
}
