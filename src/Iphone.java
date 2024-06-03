public class Iphone {
    public static void main(String[] args) throws Exception {
        System.out.println("Iphone iniciado");

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica("Leonard Cohen - Hallelujah");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.exibirPagina("https://web.dio.me");
        navegadorInternet.atualizarPagina();

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar("9123456789");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }
}
