package br.edu.unichristus;

public enum Estado {

    REDIGINDO{
        @Override
        public String toString() {
            return "Redigindo";
        }
    }, FINALIZADO{
        @Override
        public String toString() {
            return "Finalizado";
        }
    };
}
