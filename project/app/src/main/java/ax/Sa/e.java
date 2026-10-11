/*
 * Decompiled with CFR 0.152.
 */
package ax.Sa;

import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

class e {
    private final Map<String, Object> a;
    private final String b;

    e(String string) {
        this.b = string;
        this.a = new LinkedHashMap<String, Object>();
    }

    private static String d(String string) {
        try {
            string = j.URLEncoder.encode((String)string, (String)"UTF-8");
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new UnsupportedOperationException(unsupportedEncodingException);
        }
    }

    e a(String string, Boolean bl) {
        this.a.put(string, bl);
        return this;
    }

    e b(String string, String string2) {
        this.a.put(string, string2);
        return this;
    }

    String c() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Object> entry : this.a.entrySet()) {
            object = entry.getValue();
            if (object == null) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append(e.d(entry.getKey()));
            stringBuilder.append("=");
            stringBuilder.append(e.d(object.toString()));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append("?");
        ((StringBuilder)object).append(stringBuilder.toString());
        return ((StringBuilder)object).toString();
    }
}

