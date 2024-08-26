public class EncryptedRadioTransmission extends TransmissionWrapper {
    public EncryptedRadioTransmission(Transmission transmission) {
        super(transmission);
    }

    @Override
    public void getTransmission() {
        System.out.println("Getting encrypted radio transmission..");
    }
}
