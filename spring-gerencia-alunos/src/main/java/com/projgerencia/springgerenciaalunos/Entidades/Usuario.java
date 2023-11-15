package com.projgerencia.springgerenciaalunos.Entidades;
public class Usuario {
    
    private Integer idUsu;
    private String emailUsu;
    private String senhaUsu;

    public Usuario() {
    }

    public Usuario(Integer idUsu, String emailUsu, String senhaUsu) {
        this.idUsu = idUsu;
        this.emailUsu = emailUsu;
        this.senhaUsu = senhaUsu;
    }

    public Integer getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(Integer idUsu) {
        this.idUsu = idUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }
    
}
