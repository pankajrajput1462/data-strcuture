package designpattern.behave.cor.one;

public class Dispense20ChainImpl implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void dispense(Currency currency) {
        {
            if (currency.getAmount() >= 20) {
                int num = currency.getAmount() / 20;
                int remainder = currency.getAmount() % 20;
                System.out.println("Dispensing " + num + " 20$ note");
                if (remainder != 0) {
                    this.nextChain.dispense(new Currency(remainder));
                }
            } else {
                this.nextChain.dispense(currency);
            }
        }

    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;

    }
}
