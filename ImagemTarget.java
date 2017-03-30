package br.edu.unifacisa.map.adapter;

public interface ImagemTarget {
	void carregarImagem(String arquivo);
	void desenharImagem (int posicaoA, int posicaoB, int largura, int altura);

}