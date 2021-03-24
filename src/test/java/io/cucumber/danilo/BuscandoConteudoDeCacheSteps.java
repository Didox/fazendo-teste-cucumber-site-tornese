package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracao;
import io.cucumber.java.pt.*;

public class BuscandoConteudoDeCacheSteps {
  @Dada("cliquei no curso de cache")
  public void clicarNoCursoDeCache() {
    Configuracao.seletorQueryCss("a[href='/aulas/cache'] img").click();
  }

  @Entao("devo clicar no curso de varnish para poder assistir")
  public void clicarNoCacheVarnish() {
    Configuracao.seletorQueryCss(".div-card-aulas:last-child").click();
    Configuracao.fechar();
  }
}
