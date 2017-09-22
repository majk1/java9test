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
        mosogato.elmos(pohar); // TODO: ha nem mosod el, kapsz egy exception-t !
        
        konyha.konyhaElhagyasa();

        System.out.println("\\o/");
    }

    // parts of a module can be really private
    // (io.codelens.fun.java9test.internal is not visible, java9test.def.impl does not export it)
    private static Konyha createKonyha() {
        // return new io.codelens.fun.java9test.internal.DefaultKonyha();
        return null;
    }

}
