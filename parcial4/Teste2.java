
package parcial4;

/**
 *
 * @author Meireles
 */
public class Teste2 {
    public static void main(String[] args) {

        //Usando o vetor e alocando os autores
        Author useACabecaJava[] = new Author[2];
        useACabecaJava[0] = new Author("Kathy Sierra", "kathysierra@contato.com", 'F');
        useACabecaJava[1] = new Author("Bert Bates", "bertbates@contato.com", 'M');
        
        Author java8[] = new Author[2];
        java8[0] = new Author ("Paulo Silveira", "paulosilveira@contato.com", 'M');
        java8[1] = new Author ("Rodrigo Turini", "rodrigoturini@contato.com", 'M');
        
        Author dsoo[] = new Author[1];
        dsoo[0] = new Author ("Rodrigo Turini","rodrigoturini@contato.com",'M');
        
        Book book[] = new Book[3];
        book[0] = new Book("Use A Cabeça! Java", useACabecaJava, 99.90);
        book[1] = new Book("Java 8 prático", java8, 17.80);
        book[2] = new Book("Desbravando Java e Orientação a Objetos", dsoo, 40.0);

        //Definindo o preço e a quantidade
        book[0].setPrice(99.90);
        book[0].setQtdInStock(10);
        book[1].setPrice(29.90);
        book[1].setQtdInStock(10);
        book[2].setPrice(29.99);
        book[2].setQtdInStock(10);
        
        for (int i = 0; i < book.length; i++) {
            try {
                System.out.println("Livro " + (i + 1) + "");
                System.out.println("Título: " + book[i].getName());
                System.out.printf("Preço: R$ %.2f \n", book[i].getPrice());
                System.out.println("Estoque: " + book[i].getQtdInStock());
                System.out.println(book[i].toString());
                System.out.println("-------------------------");
             

            } catch (java.lang.NullPointerException erro) {
                System.out.println("Nada!\n");
            }

        }

        //Imprime todos os autores do livro.
        System.out.println("Autores");
        book[0].printAuthors();
        book[1].printAuthors();
        book[2].printAuthors();
    }
}
