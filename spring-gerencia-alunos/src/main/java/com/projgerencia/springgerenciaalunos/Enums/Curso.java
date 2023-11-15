package com.projgerencia.springgerenciaalunos.Enums;

public enum Curso {

    Informatica,
    Contabilidade,
    Medicina,
    Engenharia,
    Biologia,
    Administracao,
    Sociologia;

    private Integer idCurso;//Rever
    private String curso;

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
