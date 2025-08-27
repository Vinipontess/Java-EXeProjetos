import java.io.File;
import java.io.FileWriter;  
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class ManipulacaodeArquivos{
    public static void main(String[] args) {
        System.out.println("Manipulação de arquivos em Java");
        List<String> logs = new ArrayList<>();
        logs.add("INFO: 2025-08-27 08:15:00 - Aplicação iniciada.")
        logs.add("WARN: 2025-08-27 08:16:00 - Uso de memória alto.");
        logs.add("ERROR: 2025-08-27 08:17:00 - Falha ao conectar ao banco de dados.");

        Path path = Paths.get("logs.txt");
        try {
            Files.write(path, logs);
            System.out.println("Arquivo 'logs.txt' criado com sucesso.");
        }
        catch(IOException e){
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        } 
        System.out.println("-------------------------------")


        //ler arquivo agora
        System.out.println("~~~~~~~~Conteúdo dos logs~~~~~~~~~");
        try{
            List<String> linhasLidas = Files.readAllLines(path);
            System.out.println("Conteúdo do arquivo 'logs.txt':");
            for(String linha : linhasLidas){
                System.out.println(linha);
            }
            catch(IOException e){
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
