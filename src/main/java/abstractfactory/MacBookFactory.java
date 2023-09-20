package abstractfactory;

public class MacBookFactory implements ProductFactory {
    @Override
    public IScreen manufactureScreen() {
        return new MacBookScreen();
    }

    @Override
    public IChip manufactureChip() {
        return new MacBookChip();
    }
}
