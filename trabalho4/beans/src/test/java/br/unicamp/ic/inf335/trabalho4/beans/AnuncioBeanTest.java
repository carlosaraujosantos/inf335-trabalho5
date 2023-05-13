package br.unicamp.ic.inf335.trabalho4.beans;

import static org.junit.jupiter.api.Assertions.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AnuncioBeanTest {

	@Test
	void testGetMethods() throws MalformedURLException {
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		URL url = new URL("https://www.unicamp.br/unicamp/");
		fotosUrl.add(url);
		ProdutoBean nProd = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo.");
		AnuncioBean anuncioBean = new AnuncioBean(nProd,fotosUrl,0.0);
		assertAll("anuncioBean",
				() -> assertEquals(nProd,anuncioBean.getProduto()),
				() -> assertEquals(fotosUrl,anuncioBean.getFotosUrl()),
				() -> assertEquals(nProd.getValor(),anuncioBean.getValor())
				);
	}
	
	@Test
	void testGetMethods100() throws MalformedURLException {
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
		URL url = new URL("https://www.unicamp.br/unicamp/");
		fotosUrl.add(url);
		ProdutoBean nProd = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo.");
		AnuncioBean anuncioBean = new AnuncioBean(nProd,fotosUrl,1.0);
		assertAll("anuncioBean",
				() -> assertEquals(nProd,anuncioBean.getProduto()),
				() -> assertEquals(fotosUrl,anuncioBean.getFotosUrl()),
				() -> assertEquals(0.0,anuncioBean.getValor())
				);
	}
}
