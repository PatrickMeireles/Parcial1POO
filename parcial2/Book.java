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
public class Book {
    private String nome;
    private Author author;
    private double price;
    private int qtInStock = 0; 
    
    
    public Book (String nome, Author author, double price) {
        this.nome = nome;
        this.author = author;
        this.price = price;
        
    }
    
     public Book (String nome, Author author, double price, int qtInStock) {
        this.nome = nome;
        this.author = author;
        this.price = price;
        this.qtInStock = qtInStock;
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }
    public String getAuthorName() {
        return author.getName();
        
    }
    public String getAuthorEmail() { 
        return author.getEmail();
    }
    public char getAuthorGender() {
        return author.getGender();
    }
    /**
     * @param author the author to set
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the qtInStock
     */
    public int getQtInStock() {
        return qtInStock;
    }

    /**
     * @param qtInStock the qtInStock to set
     */
    public void setQtInStock(int qtInStock) {
        this.qtInStock = qtInStock;
    }

    @Override
    public String toString() {
        return "Livro: "+getNome()+"\nEscrito por: "+getAuthorName()+"\nMeu Contato: "+ getAuthorEmail(); 
    }
    
    
    
}
