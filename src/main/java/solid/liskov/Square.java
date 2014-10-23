package solid.liskov;

public class Square extends Rectangle {
    @Override
    public int getHeight() {
        return getWidth();
    }

    @Override
    public void setHeight(int height) {
        setWidth(height);
    }
}
