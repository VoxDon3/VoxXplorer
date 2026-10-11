/*
 * Decompiled with CFR 0.152.
 */
package ax.kb;

import ax.kb.e;
import ax.kb.i;
import ax.lb.c;
import ax.lb.d;
import ax.lb.f;
import java.util.HashMap;

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
        HashMap<String, String> hashMap;
        h = hashMap = new HashMap<String, String>();
        hashMap.put("srvsvc", ax.lb.f.a());
        h.put("lsarpc", ax.lb.c.a());
        h.put("samr", ax.lb.e.a());
        h.put("netdfs", ax.lb.d.a());
    }

    b(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    Object a(String string) {
        if (string.equals("endpoint")) {
            return this.c;
        }
        HashMap hashMap = this.d;
        if (hashMap != null) {
            return hashMap.get(string);
        }
        return null;
    }

    void b(String charSequence, Object object) throws e {
        if (((String)charSequence).equals("endpoint")) {
            charSequence = object.toString();
            this.c = charSequence;
            if (((String)(charSequence = ((String)charSequence).toLowerCase())).startsWith("\\pipe\\") && (charSequence = (String)h.get(((String)charSequence).substring(6))) != null) {
                int n8 = ((String)charSequence).indexOf(58);
                int n9 = n8 + 1;
                int n10 = ((String)charSequence).indexOf(46, n9);
                this.e = new i(((String)charSequence).substring(0, n8));
                this.f = Integer.parseInt(((String)charSequence).substring(n9, n10));
                this.g = Integer.parseInt(((String)charSequence).substring(n10 + 1));
                return;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Bad endpoint: ");
            ((StringBuilder)charSequence).append(this.c);
            throw new e(((StringBuilder)charSequence).toString());
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(charSequence, object);
    }

    public String toString() {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(this.a);
        ((StringBuilder)charSequence).append(":");
        ((StringBuilder)charSequence).append(this.b);
        ((StringBuilder)charSequence).append("[");
        ((StringBuilder)charSequence).append(this.c);
        charSequence = ((StringBuilder)charSequence).toString();
        Object object = this.d;
        CharSequence charSequence2 = charSequence;
        if (object != null) {
            object = ((HashMap)object).keySet().iterator();
            while (true) {
                charSequence2 = charSequence;
                if (!object.hasNext()) break;
                Object e8 = object.next();
                Object v8 = this.d.get(e8);
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(",");
                ((StringBuilder)charSequence2).append(e8);
                ((StringBuilder)charSequence2).append("=");
                ((StringBuilder)charSequence2).append(v8);
                charSequence = ((StringBuilder)charSequence2).toString();
            }
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)charSequence2);
        ((StringBuilder)charSequence).append("]");
        return ((StringBuilder)charSequence).toString();
    }
}

