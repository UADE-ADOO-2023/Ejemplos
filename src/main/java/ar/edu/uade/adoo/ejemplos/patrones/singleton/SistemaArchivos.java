package ar.edu.uade.adoo.ejemplos.patrones.singleton;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class SistemaArchivos {
    private static List<SistemaArchivos> instancias = new ArrayList<>();
    private static final Integer CANTIDAD_MAXIMA_INSTANCIAS = 3;
    private Boolean utilizada = false;

    private SistemaArchivos() {
    }

    public static Optional<SistemaArchivos> getInstancia() {
        Logger.getAnonymousLogger().log(Level.FINER, "Accedo a una instancia");
        if (instancias.size() < CANTIDAD_MAXIMA_INSTANCIAS) {
            SistemaArchivos nuevaInstancia = new SistemaArchivos();
            nuevaInstancia.setUtilizada(true);
            instancias.add(nuevaInstancia);
            return Optional.of(nuevaInstancia);
        }
        for (SistemaArchivos instancia: instancias) {
            if (!instancia.getUtilizada()) {
                instancia.setUtilizada(true);
                return Optional.of(instancia);
            }
        }
        return Optional.empty();
    }

    public File buscarArchivo(String path) {
        return new File(path);
    }

    public void setUtilizada(Boolean utilizada) {
        this.utilizada = utilizada;
    }

    public Boolean getUtilizada() {
        return utilizada;
    }
}
