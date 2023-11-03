public abstract class TransmissionWrapper implements Transmission {
    private Transmission transmission;

    public TransmissionWrapper(Transmission transmission) {
        this.transmission = transmission;
    }
}
