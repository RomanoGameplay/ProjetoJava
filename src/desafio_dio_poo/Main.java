package desafio_dio_poo;

import desafio_dio_poo.dominio.Bootcamp;
import desafio_dio_poo.dominio.Curso;
import desafio_dio_poo.dominio.Dev;
import desafio_dio_poo.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+devCaio.getConteudosInscritos());
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos: "+devCaio.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+devCaio.getConteudosInscritos());
        System.out.println("XP: "+devCaio.calcularTotalXP());
        System.out.println("-------------");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos: "+devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+devJoao.getConteudosInscritos());
        System.out.println("XP: "+devJoao.calcularTotalXP());
    }
}
