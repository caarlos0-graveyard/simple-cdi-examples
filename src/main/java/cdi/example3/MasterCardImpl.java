package cdi.example3;

@MasterCard
public class MasterCardImpl implements CreditCard {
    @Override
    public String getNumber() {
        return "1111-1111-1111";
    }
}
