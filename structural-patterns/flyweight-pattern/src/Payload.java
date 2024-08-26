public class Payload {
    private PayloadType payloadType;

    public Payload(PayloadType payloadType) {
        this.payloadType = payloadType;
    }

    public PayloadType getPayload() {
        return this.payloadType;
    }
}
