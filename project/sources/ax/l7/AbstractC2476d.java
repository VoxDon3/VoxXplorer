package ax.l7;

import ax.m7.C2524C;
import ax.m7.C2531f;
import ax.m7.C2532g;
import ax.m7.C2534i;
import ax.m7.C2535j;
import ax.m7.k;
import ax.m7.v;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ax.l7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2476d implements Closeable, Flushable, AutoCloseable {
    private void c(boolean z, Object obj) throws IOException {
        boolean z2;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (C2532g.d(obj)) {
            j();
            return;
        }
        if (obj instanceof String) {
            H((String) obj);
            return;
        }
        boolean z3 = false;
        if (obj instanceof Number) {
            if (z) {
                H(obj.toString());
                return;
            }
            if (obj instanceof BigDecimal) {
                u((BigDecimal) obj);
                return;
            }
            if (obj instanceof BigInteger) {
                v((BigInteger) obj);
                return;
            }
            if (obj instanceof Long) {
                q(((Long) obj).longValue());
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Number) obj).floatValue();
                if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue)) {
                    z3 = true;
                }
                v.a(z3);
                o(floatValue);
                return;
            }
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                p(((Number) obj).intValue());
                return;
            }
            double doubleValue = ((Number) obj).doubleValue();
            if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
                z3 = true;
            }
            v.a(z3);
            m(doubleValue);
            return;
        }
        if (obj instanceof Boolean) {
            d(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof C2534i) {
            H(((C2534i) obj).e());
            return;
        }
        if (((obj instanceof Iterable) || cls.isArray()) && !(obj instanceof Map) && !(obj instanceof k)) {
            A();
            Iterator it = C2524C.l(obj).iterator();
            while (it.hasNext()) {
                c(z, it.next());
            }
            e();
            return;
        }
        if (cls.isEnum()) {
            String e = C2535j.j((Enum) obj).e();
            if (e == null) {
                j();
                return;
            } else {
                H(e);
                return;
            }
        }
        F();
        boolean z4 = (obj instanceof Map) && !(obj instanceof k);
        C2531f e2 = z4 ? null : C2531f.e(cls);
        for (Map.Entry<String, Object> entry : C2532g.g(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (z4) {
                    z2 = z;
                } else {
                    Field a = e2.a(key);
                    z2 = (a == null || a.getAnnotation(InterfaceC2480h.class) == null) ? false : true;
                }
                g(key);
                c(z2, value);
            }
        }
        f();
    }

    public abstract void A() throws IOException;

    public abstract void F() throws IOException;

    public abstract void H(String str) throws IOException;

    public abstract void a() throws IOException;

    public final void b(Object obj) throws IOException {
        c(false, obj);
    }

    public abstract void d(boolean z) throws IOException;

    public abstract void e() throws IOException;

    public abstract void f() throws IOException;

    public abstract void flush() throws IOException;

    public abstract void g(String str) throws IOException;

    public abstract void j() throws IOException;

    public abstract void m(double d) throws IOException;

    public abstract void o(float f) throws IOException;

    public abstract void p(int i) throws IOException;

    public abstract void q(long j) throws IOException;

    public abstract void u(BigDecimal bigDecimal) throws IOException;

    public abstract void v(BigInteger bigInteger) throws IOException;
}
