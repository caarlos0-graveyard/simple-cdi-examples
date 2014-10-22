package example4;

@MasterCard
public class MasterCardImpl implements CreditCard {
    @Override
    public String getNumber() {
        return "1111-1111-1111";
    }
}
