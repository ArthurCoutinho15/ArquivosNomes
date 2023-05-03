import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;


public class Arquivos {
    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void escritor(String path) throws IOException {


        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

    public static void nomeSobrenome(String path1, String path2, String path3) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path1));
        String linha = "";
        while(true){
            if(linha != null){
                System.out.println(linha);
            }
            else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();

      //  BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
      //  linha = "";
      //  Scanner in = new Scanner(System.in);
      //  System.out.println("Escreva algo");
      //  linha = in.nextLine();
      //  buffWrite.append(linha + "\n");
      //  buffWrite.close();
    }


}
