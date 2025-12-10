package com.chess.xadrez;

import org.mozilla.javascript.Context;

public class AndroidRhinoContext {
    /**
     * Retorna um Contexto Rhino simples.
     * Para o Xadrez não há suporte a mods/scripts,
     * então apenas retorna o contexto padrão.
     */
    public static Context enter() {
        return Context.enter();
    }
}