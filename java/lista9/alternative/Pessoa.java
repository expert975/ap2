/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author aluno
 */
public class Pessoa
{
    private String cpf;
    private String nome;
    
    public Pessoa(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    
    public String getCpf()
    {
        return this.cpf;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getName()
    {
        return this.nome;
    }
}
