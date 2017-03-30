package br.edu.unifacisa.map.adapter;

public class ImagemBmpAdapter extends ImagemBmp implements ImagemTarget {

	@Override
	public void carregarImagem(String arquivo) {
		bmpCarregarImagem(arquivo);
		
	}

	@Override
	public void desenharImagem(int posicaoA, int posicaoB, int largura, int altura) {
		bmpDesenharImagem(posicaoA, posicaoB, largura, altura);
		
	}

}
