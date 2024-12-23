import one.digitalInnovation.dominio.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Curso cursoJv = new Curso();
        cursoJv.setTitulo("Java Avançado");
        cursoJv.setDescricao("Conceitos Basicos Java");
        cursoJv.setCargaHoraria(20);

        Curso cursojs = new Curso();
        cursojs.setTitulo("JavaScript Avançado");
        cursojs.setDescricao("Conceitos Basicos JavaScript");
        cursojs.setCargaHoraria(70);

        Curso cursoHtml = new Curso();
        cursoHtml.setTitulo("HTML Avançado");
        cursoHtml.setDescricao("Conceitos Basicos HTML");
        cursoHtml.setCargaHoraria(80);

        System.out.println("\nCurso: " + cursoJv.getTitulo() + "\nDescrição: "+ cursoJv.getDescricao()+ "\nCarga Horaria: "+ cursoJv.getCargaHoraria()+"\n");
        System.out.println("Curso: " + cursojs.getTitulo() + "\nDescrição: "+ cursojs.getDescricao()+ "\nCarga Horaria: "+ cursojs.getCargaHoraria()+"\n");
        System.out.println("Curso: " + cursoHtml.getTitulo() + "\nDescrição: "+ cursoHtml.getDescricao()+ "\nCarga Horaria: "+ cursoHtml.getCargaHoraria());

        Mentoria mentoriajs = new Mentoria();
        mentoriajs.setTitulo("JavaScript Avançado");
        mentoriajs.setDescricao("Conceitos Basicos JavaScript");
        mentoriajs.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT Imersão Java");
        bootcamp.setInicio((LocalDate.now()));
        bootcamp.setFim(bootcamp.getInicio().plusDays(60));

        List<ConteudosEducacional> conteudosBootcamp = Arrays.asList(cursoJv,cursojs,cursoHtml);
        bootcamp.setConteudos(conteudosBootcamp);


        Dev serjola = new Dev();
        serjola.setNome("SerjolaDF");

        serjola.inscrever(cursoJv);
        serjola.inscrever(bootcamp);
        serjola.progredir();

        Dev marcola = new Dev();
        marcola.setNome("Marcola");

        marcola.inscrever(bootcamp);
        marcola.progredir();
        marcola.progredir();
        marcola.progredir();
        
        System.out.println(marcola.calcularTotalXP());
        System.out.println(serjola.calcularTotalXP());

        List<Dev> ranking = Arrays.asList(serjola,marcola).stream()
                .sorted((dev1,dev2) -> Double.compare(dev1.calcularTotalXP(),dev2.calcularTotalXP()))
                .collect(Collectors.toList());

        for(Dev dev: ranking){
            System.out.printf(dev.getNome()+"\n");
        }

    }
}
