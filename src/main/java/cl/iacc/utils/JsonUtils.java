package cl.iacc.utils;

import org.apache.logging.log4j.core.jackson.Log4jJsonObjectMapper;
import org.json.JSONObject;

public class JsonUtils {

    public static String objectToJsonString(Object object) {
        return new JSONObject(object).toString();
    }
}
