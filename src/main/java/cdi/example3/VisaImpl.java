package cdi.example3;

import javax.inject.Named;

@Named("visa")
public class VisaImpl implements CreditCard {
    @Override
    public String getNumber() {
        return "22222-1234-1233";
    }
}
