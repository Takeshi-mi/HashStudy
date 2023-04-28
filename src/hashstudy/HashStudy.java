/* Encadeamento Externo
   Encadeamento Interno Heterogênio e Homogênio
   HashMap
*/
package hashstudy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author Takeshi
 */
public class HashStudy {

    /**
     * @param args the command line arguments
     */
    static int cont = 5; // É igual a 5, pois eu sei que vou usar %5 no meu programa. Eu mudo de acordo com o mod que eu for usar
    // 
    public static void main(String[] args) {
        HashMap<Integer, Integer> tabela = new HashMap<>(10);
        
        tabela = addItens(tabela,13);
        tabela = addItens(tabela,15);
        tabela = addItens(tabela,17);
        tabela = addItens(tabela,21);
        tabela = addItens(tabela,39);
        tabela = addItens(tabela,10);
        tabela = addItens(tabela,12);
        
        /*List lista1 = new ArrayList();
        List lista2 = new ArrayList();
        List lista3 = new ArrayList();
        List lista4 = new ArrayList();
        List lista5 = new ArrayList();
        List lista6 = new ArrayList();
        List lista7 = new ArrayList();
        */
        for (Integer key: tabela.keySet()){
            System.out.println(key+"\t"+tabela.get(key));
        }
        
    }
    //Criando a função para adicionar os números de acordo com o módulo.
    public static HashMap addItens(HashMap hm, int numero){ //thread safe
        
        int resto = numero%5;
        if(!hm.containsKey(resto)){
            hm.put(resto,numero);
        }else{
            hm.put(cont, numero);
            cont++;
        }
        return hm;
    }
}
