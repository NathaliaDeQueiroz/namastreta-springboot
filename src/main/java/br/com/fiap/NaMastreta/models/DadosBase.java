package br.com.fiap.namastreta.models;

public abstract class DadosBase {
     private String foto;
     private String nome;
     private String descricao;

    
    public DadosBase(String foto, String nome, String descricao) {
        this.foto = foto;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    
    public DadosBase() {
    }


    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
  

}
