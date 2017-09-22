package io.codelens.fun.java9test.internal;

import io.codelens.fun.java9test.api.Konyha;
import io.codelens.fun.java9test.api.Mosogato;
import io.codelens.fun.java9test.api.Mosogatogep;
import io.codelens.fun.java9test.api.exception.MosogatasException;

public class DefaultKonyha implements Konyha {

    private Mosogato mosogato;
    private Mosogatogep mosogatogep;

    public DefaultKonyha() {
        mosogato = new DefaultMosogato();
        mosogatogep = new DefaultMosogatogep();
    }

    @Override
    public Mosogato getMosogato() {
        return mosogato;
    }

    @Override
    public Mosogatogep getMosogatogep() {
        return mosogatogep;
    }

    @Override
    public void konyhaElhagyasa() throws MosogatasException {
        if (mosogatogep.isMukodokepes() && mosogatogep.isTelevan()) {
            throw new MosogatasException("Inditsd el a mosogatogepet!");
        }
        if (mosogato.isMukodokepes() && !mosogato.getElmosandok().isEmpty()) {
            throw new MosogatasException("Mosd el a mosatlant!");
        }
    }
}
