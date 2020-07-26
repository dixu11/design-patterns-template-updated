package behavioral.strategy;

public class RenderNothingStrategy implements RenderStrategy {
    @Override
    public void render() {
        System.out.println("NULL!");
    }
}
