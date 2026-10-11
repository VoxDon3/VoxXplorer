package ax.kb;

import ax.lb.C2497c;
import ax.lb.C2498d;
import ax.lb.C2499e;
import ax.lb.C2500f;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class b {
    private static HashMap h;
    String a;
    String b;
    String c = null;
    HashMap d = null;
    i e = null;
    int f;
    int g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("srvsvc", C2500f.a());
        h.put("lsarpc", C2497c.a());
        h.put("samr", C2499e.a());
        h.put("netdfs", C2498d.a());
    }

    b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    Object a(String str) {
        if (str.equals("endpoint")) {
            return this.c;
        }
        HashMap hashMap = this.d;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    void b(String str, Object obj) throws e {
        String str2;
        if (!str.equals("endpoint")) {
            if (this.d == null) {
                this.d = new HashMap();
            }
            this.d.put(str, obj);
            return;
        }
        String obj2 = obj.toString();
        this.c = obj2;
        String lowerCase = obj2.toLowerCase();
        if (!lowerCase.startsWith("\\pipe\\") || (str2 = (String) h.get(lowerCase.substring(6))) == null) {
            throw new e("Bad endpoint: " + this.c);
        }
        int indexOf = str2.indexOf(58);
        int i = indexOf + 1;
        int indexOf2 = str2.indexOf(46, i);
        this.e = new i(str2.substring(0, indexOf));
        this.f = Integer.parseInt(str2.substring(i, indexOf2));
        this.g = Integer.parseInt(str2.substring(indexOf2 + 1));
    }

    public String toString() {
        String str = this.a + ":" + this.b + "[" + this.c;
        HashMap hashMap = this.d;
        if (hashMap != null) {
            for (Object obj : hashMap.keySet()) {
                str = str + "," + obj + "=" + this.d.get(obj);
            }
        }
        return str + "]";
    }
}
