import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static List<Disco> discos;
    public static ReprodutorDisco reprodutorDisco;

    public Menu(){
        discos = new ArrayList<Disco>();
        discos.add(new Disco("Álbum 1", "Autor 1", "Rock", 2000, 10, "Subtítulo 1", "Participações 1"));
        discos.add(new Disco("Álbum 2", "Autor 2", "Pop", 2005, 12, "Subtítulo 2", "Participações 2"));
        discos.add(new Disco("Álbum 3", "Autor 3", "Jazz", 2010, 8, "Subtítulo 3", "Participações 3"));
        discos.add(new Disco("Álbum 4", "Autor 4", "Eletrônica", 2015, 15, "Subtítulo 4", "Participações 4"));
        discos.add(new Disco("Álbum 5", "Autor 5", "Hip Hop", 2020, 14, "Subtítulo 5", "Participações 5"));
        reprodutorDisco = new ReprodutorDisco("Som","Philco");
    }

    public void imprimirOpcoesMenuPrincipal(){
        System.out.println("#### Menu ####");
        System.out.println("");
    }
}
