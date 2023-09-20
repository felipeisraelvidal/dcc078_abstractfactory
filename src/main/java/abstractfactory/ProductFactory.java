package abstractfactory;

public interface ProductFactory {
    IScreen manufactureScreen();
    IChip manufactureChip();
}
