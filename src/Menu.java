import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static List<Disco> discos;
    private static ReprodutorDisco reprodutorDisco;
    private Integer numOpcoes;

    public Menu(){
        this.discos = new ArrayList<Disco>();
        this.discos.add(new Disco("Álbum 1", "Autor 1", "Rock", 2000, 10, "Subtítulo 1", "Participações 1"));
        this.discos.add(new Disco("Álbum 2", "Autor 2", "Pop", 2005, 12, "Subtítulo 2", "Participações 2"));
        discos.add(new Disco("Álbum 3", "Autor 3", "Jazz", 2010, 8, "Subtítulo 3", "Participações 3"));
        discos.add(new Disco("Álbum 4", "Autor 4", "Eletrônica", 2015, 15, "Subtítulo 4", "Participações 4"));
        discos.add(new Disco("Álbum 5", "Autor 5", "Hip Hop", 2020, 14, "Subtítulo 5", "Participações 5"));
        reprodutorDisco = new ReprodutorDisco("Som","Philco");
        this.numOpcoes = 15;
    }

    public Boolean validarOpcao(Integer opcao){
        if (opcao > 0 && opcao <= numOpcoes){
            return true;
        }
        return false;
    }

    public void imprimirOpcoesMenuPrincipal(){
        System.out.println("#### Menu ####");
        System.out.println("1: ligar Reprodutor              9: diminuir Volume");
        System.out.println("2: Desligar Reprodutor           10: play");
        System.out.println("3: Ver Meus Discos              11: pause");
        System.out.println("4: Ver Informações Reprodutor   12: Voltar Faixa");
        System.out.println("5: Colocar Disco da Bandeija    13: Avançar Faixa");
        System.out.println("6: Remover Disco da Bandeija    14: Adicionar Disco");
        System.out.println("7: Selecionar Disco             15: Exit");
        System.out.println("8: aumentar Volume");
    }

    public void ligarReprodutor(){
        reprodutorDisco.ligar();
    }

    public void desligarReprodutor(){
        reprodutorDisco.desligar();
    }

    public void imprimirDiscos(){
        int i = 1;
        for (Disco disco : this.discos){
            System.out.print("index: "+i+" "+disco.getInformacoesDisco());
            i++;
        }
    }

    public void imprimirReprodutor(){
        System.out.println(reprodutorDisco.getInformacoes());
    }

    public void colocarDiscoEmReprodutor(Integer disco){

    }
}