/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.O5;
import ax.b6.S3;
import ax.b6.U4;
import ax.b6.W4;
import ax.b6.Y4;
import ax.b6.Y5;
import ax.b6.c4;
import ax.b6.f4;
import ax.b6.k4;
import ax.b6.m4;
import ax.b6.m5;
import ax.b6.p4;
import ax.b6.p5;
import ax.b6.x4;
import ax.b6.y4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class d4<T extends f4<T>> {
    private static final d4 d = new d4(true);
    final m5<T, Object> a;
    private boolean b;
    private boolean c;

    private d4() {
        this.a = new p5();
    }

    private d4(m5<T, Object> m52) {
        this.a = m52;
        this.q();
    }

    private d4(boolean bl) {
        this(new p5());
        this.q();
    }

    public static int b(f4<?> iterator, Object object) {
        O5 o52 = iterator.b();
        int n8 = iterator.a();
        if (iterator.f()) {
            object = (List)object;
            boolean bl = iterator.e();
            int n9 = 0;
            int n10 = 0;
            if (bl) {
                if (object.isEmpty()) {
                    return 0;
                }
                iterator = object.iterator();
                while (iterator.hasNext()) {
                    n10 += d4.d(o52, iterator.next());
                }
                return S3.w0(n8) + n10 + S3.z0(n10);
            }
            iterator = object.iterator();
            n10 = n9;
            while (iterator.hasNext()) {
                n10 += d4.c(o52, n8, iterator.next());
            }
            return n10;
        }
        return d4.c(o52, n8, object);
    }

    static int c(O5 o52, int n8, Object object) {
        int n9;
        n8 = n9 = S3.w0(n8);
        if (o52 == O5.m0) {
            m4.g((U4)object);
            n8 = n9 << 1;
        }
        return n8 + d4.d(o52, object);
    }

    private static int d(O5 o52, Object object) {
        switch (c4.b[o52.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (object instanceof p4) {
                    return S3.b0(((p4)object).a());
                }
                return S3.b0((Integer)object);
            }
            case 17: {
                return S3.n0((Long)object);
            }
            case 16: {
                return S3.s0((Integer)object);
            }
            case 15: {
                return S3.j0((Long)object);
            }
            case 14: {
                return S3.o0((Integer)object);
            }
            case 13: {
                return S3.z0((Integer)object);
            }
            case 12: {
                if (object instanceof B3) {
                    return S3.E((B3)object);
                }
                return S3.k((byte[])object);
            }
            case 11: {
                if (object instanceof B3) {
                    return S3.E((B3)object);
                }
                return S3.G((String)object);
            }
            case 10: {
                if (object instanceof x4) {
                    return S3.h((x4)object);
                }
                return S3.X((U4)object);
            }
            case 9: {
                return S3.F((U4)object);
            }
            case 8: {
                return S3.j((Boolean)object);
            }
            case 7: {
                return S3.g0((Integer)object);
            }
            case 6: {
                return S3.W((Long)object);
            }
            case 5: {
                return S3.k0((Integer)object);
            }
            case 4: {
                return S3.r0((Long)object);
            }
            case 3: {
                return S3.e0((Long)object);
            }
            case 2: {
                return S3.d(((Float)object).floatValue());
            }
            case 1: 
        }
        return S3.c((Double)object);
    }

    private static int e(Map.Entry<T, Object> entry) {
        f4 f42 = (f4)entry.getKey();
        Object object = entry.getValue();
        if (f42.c() == Y5.j0 && !f42.f() && !f42.e()) {
            if (object instanceof x4) {
                return S3.g(((f4)entry.getKey()).a(), (x4)object);
            }
            return S3.A(((f4)entry.getKey()).a(), (U4)object);
        }
        return d4.b(f42, object);
    }

    private final Object f(T object) {
        if (!((object = this.a.get(object)) instanceof x4)) {
            return object;
        }
        throw new NoSuchMethodError();
    }

    private static Object g(Object object) {
        if (object instanceof Y4) {
            return ((Y4)object).a();
        }
        if (object instanceof byte[]) {
            byte[] byArray = (byte[])object;
            object = new byte[byArray.length];
            System.arraycopy(byArray, 0, object, 0, byArray.length);
            return object;
        }
        return object;
    }

    public static <T extends f4<T>> d4<T> i() {
        return d;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void j(T t8, Object arrayList) {
        Object var2_6;
        if (t8.f()) {
            if (!(arrayList instanceof List)) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            int n8 = arrayList2.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object e8 = arrayList2.get(i8);
                d4.n(t8, e8);
            }
            ArrayList arrayList3 = arrayList2;
        } else {
            d4.n(t8, arrayList);
        }
        if (var2_6 instanceof x4) {
            this.c = true;
        }
        this.a.d(t8, var2_6);
    }

    private final void k(Map.Entry<T, Object> object) {
        f4 f42 = (f4)object.getKey();
        Object object22 = object.getValue();
        boolean bl = object22 instanceof x4;
        if (f42.f()) {
            if (!bl) {
                Iterator iterator = this.f(f42);
                object = iterator;
                if (iterator == null) {
                    object = new ArrayList();
                }
                for (Object object22 : (List)object22) {
                    ((List)object).add(d4.g(object22));
                }
                this.a.d(f42, object);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (f42.c() == Y5.j0) {
            object = this.f(f42);
            if (object == null) {
                this.a.d(f42, d4.g(object22));
                if (bl) {
                    this.c = true;
                }
                return;
            }
            if (!bl) {
                object = object instanceof Y4 ? f42.v((Y4)object, (Y4)object22) : f42.o(((U4)object).f(), (U4)object22).q();
                this.a.d(f42, object);
                return;
            }
            throw new NoSuchMethodError();
        }
        if (!bl) {
            this.a.d(f42, d4.g(object22));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    private static boolean l(Object object) {
        if (object instanceof W4) {
            return ((W4)object).c();
        }
        if (object instanceof x4) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /*
     * Unable to fully structure code
     */
    private static void n(T var0, Object var1_1) {
        var3_2 = var0.b();
        m4.e(var1_1);
        block0 : switch (c4.a[var3_2.d().ordinal()]) lbl-1000:
        // 4 sources

        {
            default: {
                var2_3 = false;
                break;
            }
            case 9: {
                if (!(var1_1 instanceof U4) && !(var1_1 instanceof x4)) ** GOTO lbl-1000
lbl10:
                // 3 sources

                while (true) {
                    var2_3 = true;
                    break block0;
                    break;
                }
            }
            case 8: {
                if (!(var1_1 instanceof Integer) && !(var1_1 instanceof p4)) ** GOTO lbl-1000
                ** GOTO lbl10
            }
            case 7: {
                if (!(var1_1 instanceof B3) && !(var1_1 instanceof byte[])) ** GOTO lbl-1000
                ** continue;
            }
            case 6: {
                var2_3 = var1_1 instanceof String;
                break;
            }
            case 5: {
                var2_3 = var1_1 instanceof Boolean;
                break;
            }
            case 4: {
                var2_3 = var1_1 instanceof Double;
                break;
            }
            case 3: {
                var2_3 = var1_1 instanceof Float;
                break;
            }
            case 2: {
                var2_3 = var1_1 instanceof Long;
                break;
            }
            case 1: {
                var2_3 = var1_1 instanceof Integer;
            }
        }
        if (var2_3) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{var0.a(), var0.b().d(), var1_1.getClass().getName()}));
    }

    private static <T extends f4<T>> boolean o(Map.Entry<T, Object> object) {
        f4 f42 = (f4)object.getKey();
        if (f42.c() == Y5.j0) {
            if (f42.f()) {
                object = ((List)object.getValue()).iterator();
                while (object.hasNext()) {
                    if (d4.l(object.next())) continue;
                    return false;
                }
            } else {
                return d4.l(object.getValue());
            }
        }
        return true;
    }

    public final int a() {
        int n8 = 0;
        for (int i8 = 0; i8 < this.a.a(); ++i8) {
            n8 += d4.e(this.a.f(i8));
        }
        Iterator<Map.Entry<T, Object>> iterator = this.a.g().iterator();
        while (iterator.hasNext()) {
            n8 += d4.e(iterator.next());
        }
        return n8;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        d4<T> d42 = new d4<T>();
        for (int i8 = 0; i8 < this.a.a(); ++i8) {
            Map.Entry<T, Object> entry = this.a.f(i8);
            super.j((f4)entry.getKey(), entry.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.g()) {
            super.j((f4)entry.getKey(), entry.getValue());
        }
        d42.c = this.c;
        return d42;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d4)) {
            return false;
        }
        object = (d4)object;
        return this.a.equals(((d4)object).a);
    }

    public final void h(d4<T> object) {
        for (int i8 = 0; i8 < ((d4)object).a.a(); ++i8) {
            this.k(((d4)object).a.f(i8));
        }
        object = ((d4)object).a.g().iterator();
        while (object.hasNext()) {
            this.k((Map.Entry)object.next());
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    final Iterator<Map.Entry<T, Object>> m() {
        if (this.a.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.c) {
            return new y4(this.a.l().iterator());
        }
        return this.a.l().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        if (this.a.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.c) {
            return new y4(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final void q() {
        if (this.b) {
            return;
        }
        for (int i8 = 0; i8 < this.a.a(); ++i8) {
            Map.Entry<T, Object> entry = this.a.f(i8);
            if (!(entry.getValue() instanceof k4)) continue;
            ((k4)entry.getValue()).F();
        }
        this.a.m();
        this.b = true;
    }

    public final boolean r() {
        return this.b;
    }

    public final boolean s() {
        for (int i8 = 0; i8 < this.a.a(); ++i8) {
            if (d4.o(this.a.f(i8))) continue;
            return false;
        }
        Iterator<Map.Entry<T, Object>> iterator = this.a.g().iterator();
        while (iterator.hasNext()) {
            if (d4.o(iterator.next())) continue;
            return false;
        }
        return true;
    }
}

