import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/12116681/IdeaProjects/ManipuladorArquivo/nomes.txt";
        String path2 = "C:/Users/12116681/IdeaProjects/ManipuladorArquivo/Sobrenomes.txt";

        Arquivos.leitor(path);
        Arquivos.escritor(path);

        Arquivos.leitor(path2);
        Arquivos.escritor(path2);

    }
}
