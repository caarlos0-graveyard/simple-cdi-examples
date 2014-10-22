package example4;

@Visa
public class VisaImpl implements CreditCard {
    @Override
    public String getNumber() {
        return "22222-1234-1233";
    }
}
