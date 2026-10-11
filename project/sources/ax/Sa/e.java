package ax.Sa;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class e {
    private final Map<String, Object> a = new LinkedHashMap();
    private final String b;

    e(String str) {
        this.b = str;
    }

    private static String d(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    e a(String str, Boolean bool) {
        this.a.put(str, bool);
        return this;
    }

    e b(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    String c() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : this.a.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(d(entry.getKey()));
                sb.append("=");
                sb.append(d(value.toString()));
            }
        }
        return this.b + "?" + sb.toString();
    }
}
