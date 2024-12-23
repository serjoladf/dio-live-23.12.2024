package one.digitalInnovation.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
    private String nome;
    private List<ConteudosEducacional> conteudosInscritos = new ArrayList<>();
    private List<ConteudosEducacional> conteudosConcluidos = new ArrayList<>();

    // Methodos
    public void inscrever(ConteudosEducacional conteudosEducacional){
        if(conteudosInscritos.contains(conteudosEducacional)){
            System.err.println("Você já esta escrito neste Curso");
        }else{
            conteudosInscritos.add(conteudosEducacional);
        }

    }
    public void inscrever(Bootcamp bootcamp){
        //Alternativa 1: For each Tradicional
        for(ConteudosEducacional conteudosEducacional: bootcamp.getConteudos()){
            inscrever(conteudosEducacional);
        }
        bootcamp.getDevs().add(this);
        //Alternativa 1: API de Strenm
        // bootcamp.getConteudos().stream().forEach(this::inscrever);

    }
    public void progredir(){
        Optional<ConteudosEducacional> conteudosEducacional = conteudosInscritos.stream().findFirst();
        if(conteudosEducacional.isPresent()){
            conteudosConcluidos.add(conteudosEducacional.get());
            conteudosInscritos.remove(conteudosEducacional.get());
        }else{
            System.err.println("Você não tem mais Conteúdo;");
        }
    }
    public double calcularTotalXP(){
        return conteudosConcluidos.stream()
                .mapToDouble(conteudosEducacional-> conteudosEducacional.calcularXp())
                .sum();
    }
    // Getters e Setters
    public List<ConteudosEducacional> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
