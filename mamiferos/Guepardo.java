package mamiferos;

class Guepardo extends Felino {
    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico,
            float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    public String comer() {
        return "El Guepardo caza gracias a su gran velocidad de " + velocidad + " km/h";
    }

    public String dormir() {
        return "El Guepardo duerme bajo los arbustos de " + habitat;
    }

    public String correr() {
        return "El Guepardo alcanza hasta " + velocidad + " km/h en persecución";
    }

    public String comunicarse() {
        return "El Guepardo se comunica con chillidos cortos";
    }
}