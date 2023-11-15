package com.projgerencia.springgerenciaalunos.Enums;

public enum Turma {
    
    Matutino,
    Vespertino,
    Noturno;

    private String horario;
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
