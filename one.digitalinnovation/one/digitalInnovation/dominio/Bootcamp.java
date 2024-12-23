package one.digitalInnovation.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private String nome;
    private LocalDate inicio;
    private LocalDate fim;
    private List<ConteudosEducacional> conteudos = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();;

    public List<ConteudosEducacional> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<ConteudosEducacional> conteudos) {
        this.conteudos = conteudos;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate setInicio(LocalDate inicio) {
        this.inicio = inicio;
        return inicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }
}
