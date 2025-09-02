package mamiferos;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico,
            String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public String comer() {
        return "El Perro salvaje africano caza con mordida de " + fuerzaMordida + " psi";
    }

    public String dormir() {
        return "El Perro " + color + " duerme en madrigueras de " + habitat;
    }

    public String correr() {
        return "El Perro corre en manada por " + habitat;
    }

    public String comunicarse() {
        return "El Perro se comunica con chillidos y ladridos";
    }
}