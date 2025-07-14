import br.com.anotacao.Tabela;
import br.com.anotacao.MinhaClasse;

public class Main {
    public static void main(String[] args) {
        // Pega a classe anotada
        Class<MinhaClasse> clazz = MinhaClasse.class;

        // Verifica se tem a anotação Tabela
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);

            // Imprime todos os valores definidos na anotação
            System.out.println("value: " + tabela.value());

            System.out.print("nomes: ");
            for (String nome : tabela.nomes()) {
                System.out.print(nome + " ");
            }
            System.out.println();

            System.out.print("value2 (RetentionPolicy[]): ");
            for (var pol : tabela.value2()) {
                System.out.print(pol + " ");
            }
            System.out.println();

            System.out.println("value3: " + tabela.value3());

            System.out.println("nomeDeFoult: " + tabela.nomeDeFoult());

        } else {
            System.out.println("A classe não possui a anotação @Tabela.");
        }
    }
}
