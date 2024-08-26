public class Main {
    public static void main(String[] args) {
        Transmission radioTx = new RadioTransmission();
        radioTx.getTransmission();
        radioTx = new EncryptedRadioTransmission(radioTx);
        radioTx.getTransmission();
    }
}