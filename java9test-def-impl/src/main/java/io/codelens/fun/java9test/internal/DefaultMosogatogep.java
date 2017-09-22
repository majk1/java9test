package io.codelens.fun.java9test.internal;

import io.codelens.fun.java9test.api.Mosogatogep;

public class DefaultMosogatogep extends AbstractMosogatasraAlkalmasEszkoz implements Mosogatogep {
    
    private static final int MAX_SIZE = 10;
    
    @Override
    protected int getMaxSize() {
        return MAX_SIZE;
    }

    @Override
    public synchronized void elmosogat() {
        getElmosandok().forEach(this::elmos);
    }
    
}
