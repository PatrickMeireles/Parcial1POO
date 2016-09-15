/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial4;

/**
 *
 * @author Meireles
 */
public class Author {
    private String nome;
    private String email;
    private char gender;

    public Author(String nome, String email, char gender) {
        this.nome = nome;
        this.email = email;
        this.gender = gender;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        return ("Autor: " + nome + "(" + gender + ")" + "\nContato: " + email);
    }
}
