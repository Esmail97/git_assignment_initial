class TwoPowerN implements ISubscriber{

    private int _2powerN(final int n) {
        return (int)Math.pow(2, n);
    }

    @Override
    public void notifySubscriber(final String input) {
        System.out.printf("2^%s = %d \n", input, _2powerN(Integer.parseInt(input)));
    }
}