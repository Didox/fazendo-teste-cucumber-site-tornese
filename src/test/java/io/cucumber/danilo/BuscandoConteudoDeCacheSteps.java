package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracao;
import io.cucumber.java.pt.*;

public class BuscandoConteudoDeCacheSteps {
  @Dada("cliquei no curso de cache")
  public void cliquei_no_curso_de_cache() {
    Configuracao.seletorQueryCss("a[href='/aulas/cache'] img").click();
  }

  @Entao("devo clicar no curso de varnish para poder assistir")
  public void devo_clicar_no_curso_de_varnish_para_poder_assistir() {
    Configuracao.seletorQueryCss(".div-card-aulas:last-child").click();
    Configuracao.fechar();
  }
}
