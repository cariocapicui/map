package br.edu.unifacisa.map.adapter;

public class ImagemJpegAdapter extends ImagemJpeg implements ImagemTarget {

	@Override
	public void carregarImagem(String arquivo) {
		jpegCarregarImagem(arquivo);
		
	}

	@Override
	public void desenharImagem(int posicaoA, int posicaoB, int largura, int altura) {
		jpegDesenharImagem(posicaoA, posicaoB, largura, altura);
		
	}

}