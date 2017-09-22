package io.codelens.fun.java9test.internal;

import io.codelens.fun.java9test.api.Mosogato;

public class DefaultMosogato extends AbstractMosogatasraAlkalmasEszkoz implements Mosogato {

    private static final int MAX_SIZE = 10;

    @Override
    protected int getMaxSize() {
        return MAX_SIZE;
    }
    
}
