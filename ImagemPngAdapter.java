package br.edu.unifacisa.map.adapter;

public class ImagemPngAdapter extends ImagemPng implements ImagemTarget {

	@Override
	public void carregarImagem(String arquivo) {
		pngCarregarImagem(arquivo);
		
	}

	@Override
	public void desenharImagem(int posicaoA, int posicaoB, int largura, int altura) {
		pngDesenharImagem(posicaoA, posicaoB, largura, altura);
		
	}

}