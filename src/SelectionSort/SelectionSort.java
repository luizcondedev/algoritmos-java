package SelectionSort;

public class SelectionSort {
    public static int[] ordenar(int[] lista){
         for(int i = 0; i < lista.length - 1; i++){//Laço for para percorrer toda a lista
             int menor = i;  //Guarda o valor atual a ser percorrido como o menor valor

             for(int j = i + 1; j < lista.length; j++){ //Laço for para comparar os valores da lista excluindo o de menor valor atual
                 if(lista[j] < lista[menor]){   //Comparando se o dado atual é menor que o valor alocado como menor
                     menor = j ;  //Caso seja menor, atualiza o valor de menor
                 }
             }

            int temp = lista[i];  //salva o que antes era o menor valor numa variável temporária
            lista[i] = lista[menor];  //Atribui o menor valor
            lista[menor] = temp;  //joga o valor que foi inicializado o primeiro for para onde foi encontrado o menor valor
        }

        return lista;
    }
}
