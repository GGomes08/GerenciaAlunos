package com.projgerencia.springgerenciaalunos.Entidades;

import com.projgerencia.springgerenciaalunos.Enums.Turma;
import com.projgerencia.springgerenciaalunos.Enums.Curso;
import com.projgerencia.springgerenciaalunos.Enums.StatusGeral;
public class Aluno {
    
    private Integer idAluno;
    private String nomeAluno;
    //Ser o ano no começo + 6 digitos
    private String matAluno;
    private String cpfAluno;
    private Usuario usuAluno;
    private Turma turmaAluno;
    private Curso cursoAluno;
    private Professor profAluno;
    private Mentoria mentAluno;
    private StatusGeral statusAluno;

    public Aluno() {
    }

    public Aluno(Integer idAluno, String nomeAluno, String matAluno, String cpfAluno, Usuario usuAluno,
            Turma turmaAluno, Curso cursoAluno, Professor profAluno, Mentoria mentAluno, StatusGeral statusAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.matAluno = matAluno;
        this.cpfAluno = cpfAluno;
        this.usuAluno = usuAluno;
        this.turmaAluno = turmaAluno;
        this.cursoAluno = cursoAluno;
        this.profAluno = profAluno;
        this.mentAluno = mentAluno;
        this.statusAluno = statusAluno;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatAluno() {
        return matAluno;
    }

    public void setMatAluno(String matAluno) {
        this.matAluno = matAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public Usuario getUsuAluno() {
        return usuAluno;
    }

    public void setUsuAluno(Usuario usuAluno) {
        this.usuAluno = usuAluno;
    }

    public Turma getTurmaAluno() {
        return turmaAluno;
    }

    public void setTurmaAluno(Turma turmaAluno) {
        this.turmaAluno = turmaAluno;
    }

    public Curso getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(Curso cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    public Professor getProfAluno() {
        return profAluno;
    }

    public void setProfAluno(Professor profAluno) {
        this.profAluno = profAluno;
    }

    public Mentoria getMentAluno() {
        return mentAluno;
    }

    public void setMentAluno(Mentoria mentAluno) {
        this.mentAluno = mentAluno;
    }

    public StatusGeral getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(StatusGeral statusAluno) {
        this.statusAluno = statusAluno;
    }

    
    
}
