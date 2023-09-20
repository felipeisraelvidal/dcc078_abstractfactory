package abstractfactory;

public class iPhoneFactory implements ProductFactory {

    @Override
    public IScreen manufactureScreen() {
        return new iPhoneScreen();
    }

    @Override
    public IChip manufactureChip() {
        return new iPhoneChip();
    }
}
