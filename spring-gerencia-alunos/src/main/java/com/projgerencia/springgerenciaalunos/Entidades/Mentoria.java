package com.projgerencia.springgerenciaalunos.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import com.projgerencia.springgerenciaalunos.Enums.StatusMentoria;

public class Mentoria {
    
    private Integer idMent;
    private Professor profMent;
    private Aluno alunoMent;
    private StatusMentoria statusMent;
    private LocalDate dataMent;
    private LocalTime horaMent;

    public Mentoria() {
    }

    public Mentoria(Integer idMent, Professor profMent, Aluno alunoMent, StatusMentoria statusMent, LocalDate dataMent,
            LocalTime horaMent) {
        this.idMent = idMent;
        this.profMent = profMent;
        this.alunoMent = alunoMent;
        this.statusMent = statusMent;
        this.dataMent = dataMent;
        this.horaMent = horaMent;
    }

    public Integer getIdMent() {
        return idMent;
    }

    public void setIdMent(Integer idMent) {
        this.idMent = idMent;
    }

    public Professor getProfMent() {
        return profMent;
    }

    public void setProfMent(Professor profMent) {
        this.profMent = profMent;
    }

    public Aluno getAlunoMent() {
        return alunoMent;
    }

    public void setAlunoMent(Aluno alunoMent) {
        this.alunoMent = alunoMent;
    }

    public StatusMentoria getStatusMent() {
        return statusMent;
    }

    public void setStatusMent(StatusMentoria statusMent) {
        this.statusMent = statusMent;
    }

    public LocalDate getDataMent() {
        return dataMent;
    }

    public void setDataMent(LocalDate dataMent) {
        this.dataMent = dataMent;
    }

    public LocalTime getHoraMent() {
        return horaMent;
    }

    public void setHoraMent(LocalTime horaMent) {
        this.horaMent = horaMent;
    }

    

    

}
