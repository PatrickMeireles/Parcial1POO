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
public class Book {
    private String name;
    private Author[] author; //Tratando o autor em um vetor
    private double price;
    private int qtdInStock = 0;
    private Author autor;
    private String listaAuthor = ""; 
    
    
    protected Book (String name, Author[] autor, double price) {
        this.name = name;
        this.author = autor;
        this.price = price;
    }
    
    public Book (String name, Author[] author, double price, int qtdInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtdInStock = qtdInStock;
    }
   
    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return author;
    }
   
    public String getAuthorName() {
        return autor.getNome();
    }
    
    public String getAuthorEmail() {
        return autor.getEmail();
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtdInStock() {
        return qtdInStock;
    }

    public void setQtdInStock(int qtdInStock) {
        this.qtdInStock = qtdInStock;
    }
    
    @Override
    public String toString() {
            //Estrutura foreach pra percorrer o vetor de autores
        for (Author autor0 : this.author) {
            try {

                this.listaAuthor += "\n" + autor0.getNome();
                

            } catch (java.lang.NullPointerException erro) {
                
            }
        }
         return "Livro:" + this.name + " \nEscrito Por :" + this.listaAuthor;
    }

    //Estrutura de foreach para ter a saída dos autores
    public void printAuthors() {
        for (Author autor1 : this.getAuthor()) {
            try {

                System.out.println(autor1.toString());
                
            } catch (java.lang.NullPointerException erro) {

            }
        }
    }
}
