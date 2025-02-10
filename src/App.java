import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo(" Curso Java");
        curso1.setDescricao(" descricao sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo(" Curso JS");
        curso2.setDescricao(" descricao sobre JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" titulo");
        mentoria.setDescricao(" descricao");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAgnaldo = new Dev();
        devAgnaldo.setNome("Agnaldo");
        devAgnaldo.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Agnaldo: " + devAgnaldo.getConteudosIncritos());
        devAgnaldo.progredir();
        devAgnaldo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Agnaldo: " + devAgnaldo.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Agnaldo: " + devAgnaldo.getConteudosConcluidos());
        System.out.println("XP " + devAgnaldo.calcularTotalXp());

        System.out.println("---------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosIncritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP " + devCamila.calcularTotalXp());

    }
}
