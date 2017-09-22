package io.codelens.fun.java9test.api;

import io.codelens.fun.java9test.api.exception.MosogatasException;

public interface Konyha {

    Mosogato getMosogato();

    Mosogatogep getMosogatogep();
    
    void konyhaElhagyasa() throws MosogatasException;

}
