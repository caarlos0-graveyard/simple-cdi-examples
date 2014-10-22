package cdi.example4;

import static java.util.stream.StreamSupport.stream;

import java.util.stream.Collectors;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class Example4 {
    @Inject
    @MasterCard
    private CreditCard master;

    @Visa
    @Inject
    private CreditCard visa;

    @Any
    @Inject
    private Instance<CreditCard> creditCards;

    public String visa() {
        return visa.asString();
    }

    public String master() {
        return master.asString();
    }

    public String creditCards() {
        return stream(creditCards.spliterator(), false)
                .map(card -> card.asString())
                .collect(Collectors.joining("\n"));
    }

}
