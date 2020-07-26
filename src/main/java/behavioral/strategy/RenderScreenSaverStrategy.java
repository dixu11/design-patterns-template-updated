package behavioral.strategy;

public class RenderScreenSaverStrategy implements RenderStrategy {
    @Override
    public void render() {
        System.out.println("Nice looking Screen Saver :D");
    }
}
