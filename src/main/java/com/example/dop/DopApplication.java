package com.example.dop;

public class DopApplication {

    String displayMessageForLoan(Loan loan) {
        return switch (loan) {
            case SecuredLoan sl -> "good job! nice loan.";
            case UnsecuredLoan(var interest) -> "ouch! that " + interest + "% is going to hurt!";
        };
    }
}

sealed interface Loan permits SecuredLoan, UnsecuredLoan {
}

final class SecuredLoan implements Loan {
}

record UnsecuredLoan(float interest) implements Loan {
}






