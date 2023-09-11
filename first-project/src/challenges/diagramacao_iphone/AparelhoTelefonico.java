package challenges.diagramacao_iphone;

public class AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {
    public void ligar() { System.out.println("FAZENDO LIGAÇÃO"); }   
    public void atender() { System.out.println("ATENDENDO UMA LIGAÇÃO"); }
    public void iniciarCorreioVoz() { System.out.println("INICIANDO CORREIO VOZ"); }
        //Métodos da interface Reprodutor Musical
    @Override
    public void tocar() { System.out.println("A MÚSICA ESTÁ TOCANDO"); }
    @Override
    public void pausar() { System.out.println("A MÚSICA ESTÁ PAUSADA"); }
    @Override
    public void selecionarMusica() { System.out.println("SELECIONANDO MÚSICA"); }
        //Fim dos métodos da interface Reprodutor Musical

        //Métodos da interface Navegador Internet
    @Override
    public void exibirPagina() { System.out.println("EXIBINDO PÁGINA"); }
    @Override
    public void adicionarNovaAba() { System.out.println("ADICIONANDO NOVA ABA"); }
    @Override
    public void atualizarPagina() { System.out.println("ATUALIZANDO PÁGINA"); }
        //Fim dos métodos da interface Navegador Internet    
}