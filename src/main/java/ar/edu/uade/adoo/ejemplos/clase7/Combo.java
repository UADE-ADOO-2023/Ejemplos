package ar.edu.uade.adoo.ejemplos.clase7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Combo extends Item {

    /**
     * Default constructor
     */
    public Combo() {
        this.items = new ArrayList<>();
    }

    /**
     *
     */
    private List<Item> items;

    /**
     * @return
     */
    public Float calcularPrecio() {
        Float total = 0f;
        for (Item item: items) {
            total += item.calcularPrecio();
        }
        return total;
    }

    @Override
    public void agregarItem(Item item) {
        this.items.add(item);
    }

}
