package structural.decorator;

public class TreeWithLightsDecorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public TreeWithLightsDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String getDecoratedTree() {
        return christmasTree.getDecoratedTree() + " ze światełkami";
    }
}
