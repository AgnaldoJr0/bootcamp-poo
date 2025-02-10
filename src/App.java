import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println("\n");
        System.out.println(curso2);
        System.out.println("\n");
        System.out.println(mentoria);

    }
}
