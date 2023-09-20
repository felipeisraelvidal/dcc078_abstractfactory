package abstractfactory;

public class iPhoneChip implements IChip {
    @Override
    public String manufacture() {
        return "iPhone's chip is done";
    }
}
