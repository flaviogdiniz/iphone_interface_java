package iphone;
public class Iphone {
    public static void main(String[] args) throws Exception {
        SistemaOperacional iphone = new SistemaOperacional();
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		
		iphone.adicionarNovaAba();
		iphone.exibirPagina();
		iphone.atualizarPagina();
		
		iphone.iniciarCorreiodeVoz();
		iphone.ligar();
		iphone.atender();

    }
}
