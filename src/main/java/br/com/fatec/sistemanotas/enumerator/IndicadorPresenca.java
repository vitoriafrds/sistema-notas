package br.com.fatec.sistemanotas.enumerator;

import lombok.Getter;

@Getter
public enum IndicadorPresenca {
    PRESENTE("P"),
    FALTOU("F");

    private String codigo;

    IndicadorPresenca(String codigo) {
        this.codigo = codigo;
    }

    public static String parse(boolean presenca) {
        if (presenca) {
            return PRESENTE.getCodigo();
        }

        return FALTOU.getCodigo();
    }
}
