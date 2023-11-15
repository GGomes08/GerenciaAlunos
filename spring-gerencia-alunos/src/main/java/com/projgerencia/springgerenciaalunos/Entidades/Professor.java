package com.projgerencia.springgerenciaalunos.Entidades;

import com.projgerencia.springgerenciaalunos.Enums.Curso;
import com.projgerencia.springgerenciaalunos.Enums.StatusGeral;
import com.projgerencia.springgerenciaalunos.Enums.Turma;

public class Professor {

    private Integer idProf;
    private String nomeProf;
    private String cpfProf;
    private Curso formProf;
    private StatusGeral statusProf;
    private Turma turmaProf;
    private Usuario usuProf;
    private Mentoria mentProf;

    public Professor() {
    }
    
    public Professor(Integer idProf, String nomeProf, String cpfProf, Curso formProf, StatusGeral statusProf,
            Turma turmaProf, Usuario usuProf, Mentoria mentProf) {
        this.idProf = idProf;
        this.nomeProf = nomeProf;
        this.cpfProf = cpfProf;
        this.formProf = formProf;
        this.statusProf = statusProf;
        this.turmaProf = turmaProf;
        this.usuProf = usuProf;
        this.mentProf = mentProf;
    }

    public Integer getIdProf() {
        return idProf;
    }
    public void setIdProf(Integer idProf) {
        this.idProf = idProf;
    }
    public String getNomeProf() {
        return nomeProf;
    }
    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }
    public String getCpfProf() {
        return cpfProf;
    }
    public void setCpfProf(String cpfProf) {
        this.cpfProf = cpfProf;
    }
    public Curso getFormProf() {
        return formProf;
    }
    public void setFormProf(Curso formProf) {
        this.formProf = formProf;
    }
    public StatusGeral getStatusProf() {
        return statusProf;
    }
    public void setStatusProf(StatusGeral statusProf) {
        this.statusProf = statusProf;
    }
    public Turma getTurmaProf() {
        return turmaProf;
    }
    public void setTurmaProf(Turma turmaProf) {
        this.turmaProf = turmaProf;
    }
    public Usuario getUsuProf() {
        return usuProf;
    }
    public void setUsuProf(Usuario usuProf) {
        this.usuProf = usuProf;
    }
    public Mentoria getMentProf() {
        return mentProf;
    }
    public void setMentProf(Mentoria mentProf) {
        this.mentProf = mentProf;
    }

    
    
}
