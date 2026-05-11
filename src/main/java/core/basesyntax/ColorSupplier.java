package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {

        Random rand = new Random();

        ColorsEnum[] array = ColorsEnum.values();

        int randomcolor = rand.nextInt(array.length);

        return array[randomcolor].name();

    }

}
