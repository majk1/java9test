package io.codelens.fun.java9test.api;

import io.codelens.fun.java9test.api.exception.MosogatasException;

import java.util.Set;

public interface MosogatasraAlkalmasEszkoz {
    
    boolean isTelevan();
    
    boolean isMukodokepes();
    
    void elmos(Elmosando elmosando);
    
    void belehelyez(Elmosando elmosando) throws MosogatasException;
    
    Set<Elmosando> getElmosandok();

}
