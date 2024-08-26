import java.util.ArrayList;
import java.util.List;

/**
 * Flyweight pattern minimizes memory usage
 * by sharing some of its data with other similar
 * objects.
 */
public class Main {

    private static List<Payload> payloads = new ArrayList<Payload>();
    public static void main(String[] args) {
        PayloadType payloadType = PayloadFactory.getPayloadType("MEDIUM_RANGE_PAYLOAD");
        // Instead of creating 1000s of payload instances,
        // share existing payload data with new payloads.
        Payload payload = new Payload(payloadType);
        payloads.add(payload);

        for (Payload p: payloads) {
            System.out.println(p.getPayload().getPayloadType());
        }
    }
}