package br.com.soulcode.aula1803;
//Arrays

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //Declarando o array
        ArrayList<String> listadenomes = new ArrayList<>();


        //Adicionando valores para o array  (elementos)
        listadenomes.add("Rafael");
        listadenomes.add("Jéssica");
        listadenomes.add("Érica");


        //Mostrar os valores do Array (Elementos)
        System.out.println("Lista de nomes " + listadenomes);


        //Acessando o elemento por indice
        String nome1 = listadenomes.get(0);
        System.out.println("Primeiro Elemento " + nome1);


        //Mostrando array inteiro
        System.out.println("Mostrando todos os elementos");
        for (String nome : listadenomes) {
            System.out.println(nome);
        }


        //Remover um elemtno
        listadenomes.remove(1);


        //Mostrando novamente
        System.out.println("Mostrando com elementro excluido");
        for (String nome : listadenomes) {
            System.out.println(nome);
        }
    }
}

        /*
        public class Main {

          public static void main(String[] args) {
           Scanner leitura = new Scanner(System.in);
           ArrayList<String> nomes = new ArrayList<>();
           String nome = "teste";
           System.out.println("Digite nomes e digite 'sair' para finalizar a operacao");
           while (!nome.equals("sair")){
           System.out.println("Digite o nome");
           nome = leitura.nextLine();
           nomes.add(nome);
       }
       while (true){
               System.out.println("Digite o nome");
                nome = leitura.nextLine();
           if (nome.equals("sair")){
        break;
        }
        nomes.add(nome);
       }

               for(String nomelista : nomes){
        System.out.println(nomelista);
       }


    }
}

 */

/*
 import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner leitura = new Scanner(System.in);
       ArrayList<String> nomes = new ArrayList<>();
       String nome = "teste";
       System.out.println("Digite nomes e digite 'sair' para finalizar a operacao");
      // while (!nome.equals("sair")){
         //  System.out.println("Digite o nome");
          // nome = leitura.nextLine();
          // nomes.add(nome);

       while (true){
               System.out.println("Digite o nome");
nome = leitura.nextLine();
           if (nome.equalsIgnoreCase("sair")){
        break;
        }
        nomes.add(nome);
       }


String procurarnome = "Rafael";
       if(nomes.contains(procurarnome)){
        System.out.println("Sim o nome existe no array");
       }else{
               System.out.println("o nome NÃO existe no array");
       }


               //nome.toLowerCase(); //deixa a string em minusculo
               // nome.toUpperCase(); // deixa a string em maiusculo

               for(String nomelista : nomes){
        System.out.println(nomelista);
       }


     }
}
*/


/*
    Scanner leitura = new Scanner(System.in);
Set<String> nomes = new LinkedHashSet<>();

nomes.add("Rafael");
nomes.add("Ludmila");
nomes.add("RAFAEL");
nomes.add("Anna Paula");
nomes.add("Rafael");
nomes.add("Lays");
nomes.add("O");

System.out.println("Nomes "+ nomes);

 */
/*
     opcaomenu = leitura.nextInt();


           switch (opcaomenu){
               case 1:
                   leitura.nextLine();
                   System.out.println("Entrei no adicionar");
                   System.out.println("Digite a tarefa que voce completou");
                   tarefas.add(leitura.nextLine());
                   System.out.println("Cadastrado com Sucesso");
                   break;
               case 2 :
                   System.out.println("Excluir tarefa");


                   for(int i = 0 ; i < tarefas.size() ; i++){
                       System.out.println(" Indice "+ (i+1) + " Tarefa : "+ tarefas.get(i));
                   }
                   System.out.println("Digite o numero da tarefa que quer apagar");
                   int apagar = leitura.nextInt();
                   tarefas.remove((apagar-1));
                   System.out.println("Tarefa apagada com sucesso");
                   break;
               case 3:
                   System.out.println("Mostrando as tarefas cadastradas");
                   for (String tarefasMostrar : tarefas){
                       System.out.println(tarefasMostrar);
                   }
                   System.out.println("Mostrar");
                   break;
               case 4:
                   System.out.println("Sair");
                   return;
               default:
                   System.out.println("Digite uma opcao valida ");
           }
       }


   }
}
 */