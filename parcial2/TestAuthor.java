/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author alunos
 */
public class TestAuthor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome = "Manoelzinho";
        String email = "manoelzinho@contato.com";
        char gender = 'M';
        
        Author author1 = new Author(nome,email,gender);
        
        Book book = new Book("A arte do Java",author1, 15.00);
        System.out.println(book);
    }
    
}
