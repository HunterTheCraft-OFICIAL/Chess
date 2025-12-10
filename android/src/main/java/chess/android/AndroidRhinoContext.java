package chess.android;

import org.mozilla.javascript.Context;

/**
 * Classe utilitária para inicializar o contexto Rhino.
 * Atualmente não há suporte a mods/scripts,
 * então apenas retorna o contexto padrão.
 */
public class AndroidRhinoContext {

    /**
     * Entra em um contexto Rhino padrão.
     * @return Contexto Rhino ativo
     */
    public static Context enter() {
        return Context.enter();
    }
}