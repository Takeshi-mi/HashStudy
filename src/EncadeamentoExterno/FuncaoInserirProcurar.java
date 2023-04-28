package EncadeamentoExterno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FuncaoInserirProcurar {
    public static void main(String[] args) {
        HashMap<Integer, List<String>> hashMap = new HashMap<Integer, List<String>>();

        Scanner scanner = new Scanner(System.in);

        // Adiciona nomes à tabela hash
        System.out.println("Digite um nome para inserir na tabela hash (ou digite 'fim' para sair): ");
        String nome = scanner.nextLine();
        while (!nome.equals("fim")) {
            int chave = nome.length();
            if (!hashMap.containsKey(chave)) {
                hashMap.put(chave, new ArrayList<String>());
            }
            hashMap.get(chave).add(nome);
            System.out.println("Digite outro nome para inserir na tabela hash (ou digite 'fim' para sair): ");
            nome = scanner.nextLine();
        }

        // Busca nomes na tabela hash
        System.out.println("Digite um nome para buscar na tabela hash (ou digite 'fim' para sair): ");
        nome = scanner.nextLine();
        while (!nome.equals("fim")) {
            int chave = nome.length();
            if (hashMap.containsKey(chave)) {
                List<String> nomes = hashMap.get(chave);
                if (nomes.contains(nome)) {
                    System.out.println("Nome encontrado na chave " + chave + ": " + nome);
                } else {
                    System.out.println("Nome não encontrado na chave " + chave + ".");
                }
            } else {
                System.out.println("Chave " + chave + " não encontrada na tabela hash.");
            }
            System.out.println("Digite outro nome para buscar na tabela hash (ou digite 'fim' para sair): ");
            nome = scanner.nextLine();
        }
    }
}