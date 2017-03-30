package br.edu.unifacisa.map.adapter;

public class ImagemJpeg {
	public void jpegCarregarImagem(String arquivo)
	{
		System.out.println("Imagem" + arquivo + "carregada.");
	}
	
	public void jpegDesenharImagem(int posicaoA, int posicaoB, int largura, int altura) {
		System.out.println("ImagemJpeg desenhada");
	}
}

