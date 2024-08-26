import java.util.HashMap;
import java.util.Map;

public class PayloadFactory {
    static Map<String, PayloadType> payloadTypes = new HashMap<>();

    public static PayloadType getPayloadType(String payloadType) {
        PayloadType payload = payloadTypes.get(payloadType);
        if (payload == null) {
            payload = new PayloadType(payloadType);
            payloadTypes.put(payloadType, payload);
        }
        return payload;
    }
}
