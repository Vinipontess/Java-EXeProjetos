import java.util.ArrayList;
import java.util.List;

public class ArrayListTarefas{
     public static void main (String [] args){
          List <String> tarefas = new ArrayList <>();
          
          tarefas.add("Estudar Java");
          tarefas.add("Fazer exercicio do Java");
          tarefas.add("Fazer commit no git");
          
          System.out.println("O array de tarefas tem um total de " + tarefas.size() + " itens");
          System.out.println("A tarefa '" + tarefas.get(1) + "' foi concluida");
          tarefas.remove(1);
          System.out.println("---TAREFAS---");
          for(String tarefa : tarefas){
              System.out.println(" - " + tarefa);
          }
     }
}
