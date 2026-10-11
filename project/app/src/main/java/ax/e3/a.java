/*
 * Decompiled with CFR 0.152.
 */
package ax.e3;

import java.util.HashMap;
import java.util.Map;

public class a {
    private final String a;

    public a(String string) {
        this.a = string;
    }

    public String a(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('.');
        stringBuilder.append(string);
        stringBuilder.append('.');
        stringBuilder.append(string2);
        stringBuilder.append('.');
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public Map<String, String> b(String string) throws ax.Ea.a {
        int n8 = this.a.length();
        if (n8 <= string.length()) {
            if (string.substring(0, n8).equals(this.a)) {
                int n9;
                if ((n9 = string.indexOf(46, ++n8)) != -1) {
                    String string2 = string.substring(n8, n9);
                    if ((n8 = string.indexOf(46, ++n9)) != -1) {
                        String string3 = string.substring(n9, n8);
                        string = string.substring(n8 + 1);
                        HashMap<String, String> hashMap = new HashMap<String, String>();
                        hashMap.put("category", string2);
                        hashMap.put("variation", string3);
                        hashMap.put("seqNo", string);
                        return hashMap;
                    }
                    throw new ax.Ea.a(string);
                }
                throw new ax.Ea.a(string);
            }
            throw new ax.Ea.a(string);
        }
        throw new ax.Ea.a(string);
    }
}

