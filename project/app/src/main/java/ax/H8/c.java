/*
 * Decompiled with CFR 0.152.
 */
package ax.H8;

import ax.I8.a;
import ax.I8.f;
import ax.Y8.c;
import java.util.List;
import java.util.Map;

public class c {
    private Map<String, a> a = new j.ConcurrentHashMap();

    public a a(String string) {
        return this.a.get(string);
    }

    public void b(a a8) {
        this.a.put(a8.a, a8);
    }

    public static class a {
        String a;
        String b;
        List<String> c;

        public a(f object) {
            if (((f)object).a().size() == 1) {
                if (c.a.c(((ax.I8.a)(object = ((f)object).a().get(0))).e(), a.a.c0)) {
                    this.a = ((ax.I8.a)object).g();
                    this.b = ((ax.I8.a)object).c().get(0);
                    this.c = ((ax.I8.a)object).c();
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Referral Entry for '");
                stringBuilder.append(((ax.I8.a)object).g());
                stringBuilder.append("' does not have NameListReferral bit set.");
                throw new IllegalStateException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expecting exactly 1 referral for a domain referral, found: ");
            stringBuilder.append(((f)object).a().size());
            throw new IllegalStateException(stringBuilder.toString());
        }

        public String a() {
            return this.b;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("->");
            stringBuilder.append(this.b);
            stringBuilder.append(", ");
            stringBuilder.append(this.c);
            return stringBuilder.toString();
        }
    }
}

