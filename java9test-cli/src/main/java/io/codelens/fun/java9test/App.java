package io.codelens.fun.java9test;

import io.codelens.fun.java9test.api.Konyha;
import io.codelens.fun.java9test.api.Mosogato;
import io.codelens.fun.java9test.api.Mosogatogep;
import io.codelens.fun.java9test.api.exception.MosogatasException;
import io.codelens.fun.java9test.elmosando.Bogre;
import io.codelens.fun.java9test.elmosando.Pohar;
import io.codelens.fun.java9test.elmosando.Tanyer;
import io.codelens.fun.java9test.impl.KonyhaFactory;

public class App {

    public static void main(String[] args) throws MosogatasException {
        
        Pohar pohar = new Pohar();
        Bogre bogre = new Bogre();
        Tanyer tanyer = new Tanyer();
        
        Konyha konyha = KonyhaFactory.getKonyha();

        Mosogatogep mosogatogep = konyha.getMosogatogep();
        
        mosogatogep.belehelyez(tanyer);
        mosogatogep.belehelyez(bogre);
        
        Mosogato mosogato = konyha.getMosogato();
        mosogato.belehelyez(pohar);
        
        konyha.konyhaElhagyasa();
        
    }

}
