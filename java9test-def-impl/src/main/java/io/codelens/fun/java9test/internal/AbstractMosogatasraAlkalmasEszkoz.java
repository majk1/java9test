package io.codelens.fun.java9test.internal;

import io.codelens.fun.java9test.api.Elmosando;
import io.codelens.fun.java9test.api.MosogatasraAlkalmasEszkoz;
import io.codelens.fun.java9test.api.exception.MosogatasException;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMosogatasraAlkalmasEszkoz implements MosogatasraAlkalmasEszkoz {
    
    private Set<Elmosando> elmosandok = new HashSet<>();
    
    protected abstract int getMaxSize();

    @Override
    public synchronized boolean isTelevan() {
        return elmosandok.size() >= getMaxSize();
    }

    @Override
    public boolean isMukodokepes() {
        return true;
    }

    @Override
    public synchronized void elmos(Elmosando elmosando) {
        elmosandok.remove(elmosando);
    }

    @Override
    public synchronized void belehelyez(Elmosando elmosando) throws MosogatasException {
        if (!isTelevan()) {
            elmosandok.add(elmosando);
        } else {
            throw new MosogatasException("Tele van!");
        }
    }

    @Override
    public Set<Elmosando> getElmosandok() {
        return new HashSet<>(elmosandok);
    }
    
    

}
