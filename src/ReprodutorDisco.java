public class ReprodutorDisco {

    private String modelo;
    private String marca;
    private Disco[] bandeija;
    private Integer volume;
    private Boolean ligado;
    private Integer lengthDiscoBandeija;
    private Integer discoSelecionado;
    private Integer faixaAtual;
    private Boolean pausa;

    public ReprodutorDisco(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
        this.bandeija = new Disco[3];
        this.volume = 50;
        this.ligado = false;
        this.lengthDiscoBandeija = 0;
        this.discoSelecionado = null;
        this.pausa = false;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public Integer almentarVolume(){
        if (ligado){
            if (this.volume < 100){
                this.volume += 2;
            }
            return  this.volume;
        }else{
            return null;
        }
    }

    public Integer deminuirVolume(){
        if (ligado) {
            if (this.volume > 0) {
                this.volume -= 2;
            }
            return this.volume;
        }
        else{
            return null;
        }
    }

    public void pausar(){
        if (this.pausa == false && ligado){
            this.pausa = true;
        }
    }

    public void play(){
        if (this.pausa == true && ligado){
            this.pausa = false;
        }
    }

    public Boolean colocarDiscoBandeija(Disco disco){
        if (ligado){
            if (this.lengthDiscoBandeija == 3)
                return false;
            if (this.lengthDiscoBandeija < 3 ){
                this.bandeija[this.lengthDiscoBandeija] = disco;
                this.lengthDiscoBandeija++;
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public Boolean removerDiscoBandeija(Integer indexDisco){
        if (ligado) {
            if (this.lengthDiscoBandeija == 0)
                return false;
            if (bandeija[indexDisco - 1] != null) {
                this.bandeija[indexDisco - 1] = null;
                this.lengthDiscoBandeija--;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Boolean selecionarDisco(Integer indexDisco){
        if (ligado) {
            if (bandeija[indexDisco] != null) {
                this.discoSelecionado = indexDisco;
                this.faixaAtual = 1;
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }

    public void avancar(){
        if (ligado){
            this.faixaAtual += 1;
            bandeija[discoSelecionado].lerFaixa(faixaAtual);
        }

    }

    public void voltar(){
        if (ligado){
            this.faixaAtual -= 1;
            bandeija[discoSelecionado].lerFaixa(faixaAtual);
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getInformacoes(){
        String informacoes = "informações do reprodutor:"+
                "\n\tModelo: "+getModelo()+
                "\n\tMarca: "+getMarca()+
                "\n\tBandeija: ";
        int i = 1;
        for (Disco disco : bandeija){
            if (disco != null){
                informacoes +="\n\t\tEspaço "+i+": "+disco.getNome();
            }else{
                informacoes +="\n\t\tEspaço "+i+": vazio";
            }
            i++;
        }
        return informacoes;
    }
}
