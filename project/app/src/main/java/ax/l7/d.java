/*
 * Decompiled with CFR 0.152.
 */
package ax.l7;

import ax.l7.h;
import ax.m7.C;
import ax.m7.f;
import ax.m7.g;
import ax.m7.i;
import ax.m7.j;
import ax.m7.k;
import ax.m7.v;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public abstract class d
implements Closeable,
Flushable,
AutoCloseable {
    private void c(boolean bl, Object iterator) throws IOException {
        if (iterator == null) {
            return;
        }
        Object object = iterator.getClass();
        if (g.d(iterator)) {
            this.j();
            return;
        }
        if (iterator instanceof String) {
            this.H((String)((Object)iterator));
            return;
        }
        boolean bl2 = iterator instanceof Number;
        boolean bl3 = false;
        boolean bl4 = false;
        if (bl2) {
            if (bl) {
                this.H(iterator.toString());
                return;
            }
            if (iterator instanceof BigDecimal) {
                this.u((BigDecimal)((Object)iterator));
                return;
            }
            if (iterator instanceof BigInteger) {
                this.v((BigInteger)((Object)iterator));
                return;
            }
            if (iterator instanceof Long) {
                this.q((Long)((Object)iterator));
                return;
            }
            if (iterator instanceof Float) {
                float f8 = ((Number)((Object)iterator)).floatValue();
                bl = bl4;
                if (!Float.isInfinite(f8)) {
                    bl = bl4;
                    if (!Float.isNaN(f8)) {
                        bl = true;
                    }
                }
                v.a(bl);
                this.o(f8);
                return;
            }
            if (!(iterator instanceof Integer || iterator instanceof Short || iterator instanceof Byte)) {
                double d8 = ((Number)((Object)iterator)).doubleValue();
                bl = bl3;
                if (!Double.isInfinite(d8)) {
                    bl = bl3;
                    if (!Double.isNaN(d8)) {
                        bl = true;
                    }
                }
                v.a(bl);
                this.m(d8);
                return;
            }
            this.p(((Number)((Object)iterator)).intValue());
            return;
        }
        if (iterator instanceof Boolean) {
            this.d((Boolean)((Object)iterator));
            return;
        }
        if (iterator instanceof i) {
            this.H(((i)((Object)iterator)).e());
            return;
        }
        if ((iterator instanceof Iterable || ((Class)object).isArray()) && !(iterator instanceof Map) && !(iterator instanceof k)) {
            this.A();
            iterator = C.l(iterator).iterator();
            while (iterator.hasNext()) {
                this.c(bl, iterator.next());
            }
            this.e();
            return;
        }
        if (((Class)object).isEnum()) {
            if ((iterator = j.j((Enum)((Object)iterator)).e()) == null) {
                this.j();
                return;
            }
            this.H((String)((Object)iterator));
            return;
        }
        this.F();
        boolean bl5 = iterator instanceof Map && !(iterator instanceof k);
        object = bl5 ? null : f.e(object);
        for (Map.Entry entry : g.g(iterator).entrySet()) {
            Field field;
            Object v8 = entry.getValue();
            if (v8 == null) continue;
            String string = (String)entry.getKey();
            bl4 = bl5 ? bl : (field = ((f)object).a(string)) != null && field.getAnnotation(h.class) != null;
            this.g(string);
            this.c(bl4, v8);
        }
        this.f();
    }

    public abstract void A() throws IOException;

    public abstract void F() throws IOException;

    public abstract void H(String var1) throws IOException;

    public abstract void a() throws IOException;

    public final void b(Object object) throws IOException {
        this.c(false, object);
    }

    public abstract void d(boolean var1) throws IOException;

    public abstract void e() throws IOException;

    public abstract void f() throws IOException;

    @Override
    public abstract void flush() throws IOException;

    public abstract void g(String var1) throws IOException;

    public abstract void j() throws IOException;

    public abstract void m(double var1) throws IOException;

    public abstract void o(float var1) throws IOException;

    public abstract void p(int var1) throws IOException;

    public abstract void q(long var1) throws IOException;

    public abstract void u(BigDecimal var1) throws IOException;

    public abstract void v(BigInteger var1) throws IOException;
}

