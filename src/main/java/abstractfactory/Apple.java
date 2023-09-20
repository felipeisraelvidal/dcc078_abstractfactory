package abstractfactory;

public class Apple {

    private final IScreen screen;
    private final IChip chip;

    public Apple(ProductFactory factory) {
        this.screen = factory.manufactureScreen();
        this.chip = factory.manufactureChip();
    }

    public String manufactureScreen() {
        return this.screen.manufacture();
    }

    public String manufactureChip() {
        return this.chip.manufacture();
    }
}
