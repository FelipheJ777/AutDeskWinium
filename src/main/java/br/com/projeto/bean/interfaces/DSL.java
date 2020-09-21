package br.com.projeto.bean.interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public interface DSL {

    void limpar(By by);
    void clicar(By by);
    void escrever(By by, Keys key);
    void escrever(By by, String txt);
    boolean estaVisivel(By by);
    boolean estaPresente(By by);
}
