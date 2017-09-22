package io.codelens.fun.java9test.impl;

import io.codelens.fun.java9test.api.Konyha;
import io.codelens.fun.java9test.internal.DefaultKonyha;

public final class KonyhaFactory {
    
    private static final Konyha KONYHA = new DefaultKonyha();
    
    public static Konyha getKonyha() {
        return KONYHA;
    }

}
