package abstractfactory;

public class MacBookScreen implements IScreen {
    @Override
    public String manufacture() {
        return "MacBook's screen is done.";
    }
}
