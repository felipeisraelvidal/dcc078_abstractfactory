package abstractfactory;

public class MacBookChip implements IChip {
    @Override
    public String manufacture() {
        return "MacBook's chip is done.";
    }
}
