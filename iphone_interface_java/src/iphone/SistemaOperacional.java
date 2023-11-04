package iphone;

public class SistemaOperacional implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet{
    @Override
	public void tocar() {
		System.out.println("Tocando musica. ");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a musica " );
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica " );
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página ");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba ");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página ");
		
	}

	@Override
	public void ligar() {
		System.out.println("Realizando chamada ");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada ");
		
	}

	@Override
	public void iniciarCorreiodeVoz() {
		System.out.println("Iniciando correio de voz ");
		
	}
}
