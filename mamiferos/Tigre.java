package mamiferos;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico,
            float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String comer() {
        return "El Tigre de especie " + especieTigre + " caza solo en " + habitat;
    }

    public String dormir() {
        return "El Tigre duerme en su territorio de " + habitat;
    }

    public String correr() {
        return "El Tigre corre a " + velocidad + " km/h entre la selva";
    }

    public String comunicarse() {
        return "El Tigre se comunica con gruñidos fuertes";
    }
}