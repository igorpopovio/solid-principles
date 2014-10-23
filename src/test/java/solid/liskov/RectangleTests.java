package solid.liskov;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class RectangleTests {
    @Test
    public void areaCalculation() throws Exception {
        assertEquals(1000, createRectangle(10, 100).getArea());
    }

    @Test
    public void perimeterCalculation() throws Exception {
        assertEquals(220, createRectangle(10, 100).getPerimeter());
    }

    public Rectangle createRectangle(int width, int height) {
        Rectangle rectangle = createRectangle();
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        return rectangle;
    }

    public Rectangle createRectangle() {
        return new Rectangle();
    }
}
