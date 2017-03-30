package br.edu.unifacisa.map.adapter;

public class ImagemBmp {
	public void bmpCarregarImagem (String arquivo) {
		System.out.println("Imagem" + arquivo + "carregada.");
	}
	
	public void bmpDesenharImagem (int posicaoA, int posicaoB, int largura, int altura) {
		System.out.println("ImagemBmp desenhada");
	}
}
