package behavioral.strategy;

public class RenderScreenStrategy implements RenderStrategy {
    @Override
    public void render() {
        System.out.println("Rendering your desktop");
    }
}
