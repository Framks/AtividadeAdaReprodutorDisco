public class Disco {

    final private String nome;
    final private String autor;
    final private String genero;
    final private Integer anoLancamento;
    final private Integer numeroFaixas;
    final private String subtitulo;
    final private String participacoes;

    public Disco(String nome, String autor, String genero, Integer anoLancamento, Integer numeroFaixas, String subtitulo){
        this(nome, autor, genero, anoLancamento, numeroFaixas, subtitulo, null);
    }

    public Disco(String nome, String autor, String genero, Integer anoLancamento, Integer numeroFaixas, String subtitulo, String participacoes){
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.numeroFaixas = numeroFaixas;
        this.subtitulo = subtitulo;
        this.participacoes = participacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public Integer getAnoLancamento() {
        return this.anoLancamento;
    }

    public Integer getNumeroFaixas() {
        return this.numeroFaixas;
    }

    public String getSubtitulo() {
        return this.subtitulo;
    }

    public String getParticipacoes(){
        return this.participacoes;
    }
}
