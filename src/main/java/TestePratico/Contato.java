/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestePratico;

/**
 *
 * @author Desenvolvimento
 */

public class Contato {
    private int idcontato;
    private String Nome;
    private String sobrenome;
    private String telefone1;
    private String telefone2;
   
   


public Contato () {
 
}

public Contato(int idcontato, String NomeContato){
    this.idcontato = idcontato;
    this.Nome = NomeContato;
       
}

    Contato(int id, String text, String text0, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdcontato() {
        return idcontato;
    }

    public void setIdcontato(int idcontato) {
        this.idcontato = idcontato;
    }

    public String getNomeContato() {
        return Nome;
    }

    public void setNomeContato(String NomeContato) {
        this.Nome = NomeContato;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }


}
