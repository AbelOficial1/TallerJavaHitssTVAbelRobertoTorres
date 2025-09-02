package mamiferos;

public class Leon extends Felino {
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico,
            float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en " + habitat;
    }

    public String dormir() {
        return "El León duerme en las sabanas de " + habitat;
    }

    public String correr() {
        return "El León corre a una velocidad de " + velocidad + " km/h";
    }

    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugidoDecibel + " decibeles";
    }
}