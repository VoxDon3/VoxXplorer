package ax.H8;

import ax.I8.a;
import ax.I8.f;
import ax.Y8.c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {
    private Map<String, a> a = new ConcurrentHashMap();

    public static class a {
        String a;
        String b;
        List<String> c;

        public a(f fVar) {
            if (fVar.a().size() != 1) {
                throw new IllegalStateException("Expecting exactly 1 referral for a domain referral, found: " + fVar.a().size());
            }
            ax.I8.a aVar = fVar.a().get(0);
            if (c.a.c(aVar.e(), a.EnumC0092a.NameListReferral)) {
                this.a = aVar.g();
                this.b = aVar.c().get(0);
                this.c = aVar.c();
            } else {
                throw new IllegalStateException("Referral Entry for '" + aVar.g() + "' does not have NameListReferral bit set.");
            }
        }

        public String a() {
            return this.b;
        }

        public String toString() {
            return this.a + "->" + this.b + ", " + this.c;
        }
    }

    public a a(String str) {
        return this.a.get(str);
    }

    public void b(a aVar) {
        this.a.put(aVar.a, aVar);
    }
}
