package ax.e3;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ax.e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1974a {
    private final String a;

    public C1974a(String str) {
        this.a = str;
    }

    public String a(String str, String str2, String str3) {
        return this.a + '.' + str + '.' + str2 + '.' + str3;
    }

    public Map<String, String> b(String str) throws ax.Ea.a {
        int length = this.a.length();
        if (length > str.length()) {
            throw new ax.Ea.a(str);
        }
        if (!str.substring(0, length).equals(this.a)) {
            throw new ax.Ea.a(str);
        }
        int i = length + 1;
        int indexOf = str.indexOf(46, i);
        if (indexOf == -1) {
            throw new ax.Ea.a(str);
        }
        String substring = str.substring(i, indexOf);
        int i2 = indexOf + 1;
        int indexOf2 = str.indexOf(46, i2);
        if (indexOf2 == -1) {
            throw new ax.Ea.a(str);
        }
        String substring2 = str.substring(i2, indexOf2);
        String substring3 = str.substring(indexOf2 + 1);
        HashMap hashMap = new HashMap();
        hashMap.put("category", substring);
        hashMap.put("variation", substring2);
        hashMap.put("seqNo", substring3);
        return hashMap;
    }
}
