package core.basesyntax;

import java.util.Random;

public class Lottery {

    public String getRandomBall() {

        Ball ball = new Ball();

        Random random = new Random();

        ball.number = random.nextInt(100);

        ColorSupplier colorSupplier = new ColorSupplier();

        ball.color = colorSupplier.getRandomColor();

        return ball.toString();

    }

}
