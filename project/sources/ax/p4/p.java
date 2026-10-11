package ax.p4;

import ax.p4.C2765b;
import ax.s4.AbstractC3046a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class p extends Exception {
    private final String c0;
    private final s d0;
    private final Object q;

    public p(Object obj, String str, s sVar) {
        this.q = obj;
        this.c0 = str;
        this.d0 = sVar;
    }

    public static <T> void a(ax.A4.a aVar, String str, T t) {
        if (aVar != null) {
            aVar.a(str, t);
        }
    }

    public static void b(ax.A4.a aVar, String str, Object obj) {
        try {
            String str2 = obj.getClass().getMethod("tag", null).invoke(obj, null).toString().toLowerCase() + "value";
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field.getName().equalsIgnoreCase(str2)) {
                    field.setAccessible(true);
                    a(aVar, str, field.get(obj));
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static <T> p c(AbstractC3276c<T> abstractC3276c, AbstractC3046a.b bVar, String str) throws IOException, ax.T4.i {
        String q = n.q(bVar);
        C2765b<T> b = new C2765b.a(abstractC3276c).b(bVar.b());
        T a = b.a();
        a(null, str, a);
        b(null, str, a);
        return new p(a, q, b.b());
    }

    public Object d() {
        return this.q;
    }

    public String e() {
        return this.c0;
    }

    public s f() {
        return this.d0;
    }
}
