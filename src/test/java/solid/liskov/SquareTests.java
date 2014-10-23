package solid.liskov;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SquareTests extends RectangleTests {
    @Override
    public Rectangle createRectangle() {
        return new Square();
    }
}
