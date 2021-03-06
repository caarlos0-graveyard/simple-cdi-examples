package cdi.example4;

public interface CreditCard {
    String getNumber();

    default String asString() {
        return getClass().getSimpleName() + " - " + getNumber();
    }
}
