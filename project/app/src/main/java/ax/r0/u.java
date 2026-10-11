/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.D;
import ax.r0.S;
import ax.r0.h;
import ax.r0.k;
import ax.r0.k0;
import ax.r0.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class u<T extends b<T>> {
    private static final u d = new u(true);
    private final k0<T, Object> a;
    private boolean b;
    private boolean c;

    private u() {
        this.a = k0.r(16);
    }

    private u(k0<T, Object> k02) {
        this.a = k02;
        this.t();
    }

    private u(boolean bl) {
        this(k0.r(0));
        this.t();
    }

    static void A(k k8, u0.b b8, Object object) throws IOException {
        switch (ax.r0.u$a.b[b8.ordinal()]) {
            default: {
                return;
            }
            case 18: {
                if (object instanceof A.c) {
                    k8.t0(((A.c)object).g());
                    return;
                }
                k8.t0((Integer)object);
                return;
            }
            case 17: {
                k8.T0((Long)object);
                return;
            }
            case 16: {
                k8.R0((Integer)object);
                return;
            }
            case 15: {
                k8.P0((Long)object);
                return;
            }
            case 14: {
                k8.N0((Integer)object);
                return;
            }
            case 13: {
                k8.Y0((Integer)object);
                return;
            }
            case 12: {
                if (object instanceof h) {
                    k8.p0((h)object);
                    return;
                }
                k8.m0((byte[])object);
                return;
            }
            case 11: {
                if (object instanceof h) {
                    k8.p0((h)object);
                    return;
                }
                k8.V0((String)object);
                return;
            }
            case 10: {
                k8.J0((S)object);
                return;
            }
            case 9: {
                k8.C0((S)object);
                return;
            }
            case 8: {
                k8.l0((Boolean)object);
                return;
            }
            case 7: {
                k8.v0((Integer)object);
                return;
            }
            case 6: {
                k8.x0((Long)object);
                return;
            }
            case 5: {
                k8.F0((Integer)object);
                return;
            }
            case 4: {
                k8.a1((Long)object);
                return;
            }
            case 3: {
                k8.H0((Long)object);
                return;
            }
            case 2: {
                k8.z0(((Float)object).floatValue());
                return;
            }
            case 1: 
        }
        k8.r0((Double)object);
    }

    private static Object c(Object object) {
        if (object instanceof byte[]) {
            object = (byte[])object;
            byte[] byArray = new byte[((Object)object).length];
            System.arraycopy(object, 0, byArray, 0, ((Object)object).length);
            return byArray;
        }
        return object;
    }

    static int d(u0.b b8, int n8, Object object) {
        int n9;
        n8 = n9 = k.V(n8);
        if (b8 == u0.b.m0) {
            n8 = n9 * 2;
        }
        return n8 + u.e(b8, object);
    }

    static int e(u0.b b8, Object object) {
        switch (ax.r0.u$a.b[b8.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (object instanceof A.c) {
                    return k.l(((A.c)object).g());
                }
                return k.l((Integer)object);
            }
            case 17: {
                return k.S((Long)object);
            }
            case 16: {
                return k.Q((Integer)object);
            }
            case 15: {
                return k.O((Long)object);
            }
            case 14: {
                return k.M((Integer)object);
            }
            case 13: {
                return k.X((Integer)object);
            }
            case 12: {
                if (object instanceof h) {
                    return k.h((h)object);
                }
                return k.f((byte[])object);
            }
            case 11: {
                if (object instanceof h) {
                    return k.h((h)object);
                }
                return k.U((String)object);
            }
            case 10: {
                if (object instanceof D) {
                    return k.B((D)object);
                }
                return k.G((S)object);
            }
            case 9: {
                return k.t((S)object);
            }
            case 8: {
                return k.e((Boolean)object);
            }
            case 7: {
                return k.n((Integer)object);
            }
            case 6: {
                return k.p((Long)object);
            }
            case 5: {
                return k.w((Integer)object);
            }
            case 4: {
                return k.Z((Long)object);
            }
            case 3: {
                return k.y((Long)object);
            }
            case 2: {
                return k.r(((Float)object).floatValue());
            }
            case 1: 
        }
        return k.j((Double)object);
    }

    public static int f(b<?> iterator, Object object) {
        u0.b b8 = iterator.m();
        int n8 = iterator.g();
        if (iterator.k()) {
            boolean bl = iterator.z();
            int n9 = 0;
            int n10 = 0;
            if (bl) {
                iterator = ((List)object).iterator();
                n9 = n10;
                while (iterator.hasNext()) {
                    n9 += u.e(b8, iterator.next());
                }
                return k.V(n8) + n9 + k.K(n9);
            }
            iterator = ((List)object).iterator();
            while (iterator.hasNext()) {
                n9 += u.d(b8, n8, iterator.next());
            }
            return n9;
        }
        return u.d(b8, n8, object);
    }

    public static <T extends b<T>> u<T> h() {
        return d;
    }

    private int k(Map.Entry<T, Object> entry) {
        b b8 = (b)entry.getKey();
        Object object = entry.getValue();
        if (b8.y() == u0.c.k0 && !b8.k() && !b8.z()) {
            if (object instanceof D) {
                return k.z(((b)entry.getKey()).g(), (D)object);
            }
            return k.D(((b)entry.getKey()).g(), (S)object);
        }
        return u.f(b8, object);
    }

    static int m(u0.b b8, boolean bl) {
        if (bl) {
            return 2;
        }
        return b8.h();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> iterator) {
        b b8 = (b)iterator.getKey();
        if (b8.y() == u0.c.k0) {
            if (b8.k()) {
                iterator = ((List)iterator.getValue()).iterator();
                while (iterator.hasNext()) {
                    if (((S)iterator.next()).b()) continue;
                    return false;
                }
            } else if ((iterator = iterator.getValue()) instanceof S) {
                if (!((S)((Object)iterator)).b()) {
                    return false;
                }
            } else {
                if (iterator instanceof D) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static boolean r(u0.b b8, Object object) {
        A.a(object);
        switch (ax.r0.u$a.a[b8.d().ordinal()]) {
            default: {
                return false;
            }
            case 9: {
                return object instanceof S || object instanceof D;
                {
                }
            }
            case 8: {
                return object instanceof Integer || object instanceof A.c;
                {
                }
            }
            case 7: {
                return object instanceof h || object instanceof byte[];
                {
                }
            }
            case 6: {
                return object instanceof String;
            }
            case 5: {
                return object instanceof Boolean;
            }
            case 4: {
                return object instanceof Double;
            }
            case 3: {
                return object instanceof Float;
            }
            case 2: {
                return object instanceof Long;
            }
            case 1: 
        }
        return object instanceof Integer;
    }

    private void v(Map.Entry<T, Object> object3) {
        b b8 = (b)object3.getKey();
        Object object2 = object3.getValue();
        object3 = object2;
        if (object2 instanceof D) {
            object3 = ((D)object2).f();
        }
        if (b8.k()) {
            Iterator iterator = this.i(b8);
            object2 = iterator;
            if (iterator == null) {
                object2 = new ArrayList();
            }
            for (Object object3 : (List)object3) {
                ((List)object2).add(u.c(object3));
            }
            this.a.s(b8, object2);
            return;
        }
        if (b8.y() == u0.c.k0) {
            object2 = this.i(b8);
            if (object2 == null) {
                this.a.s(b8, u.c(object3));
                return;
            }
            object3 = b8.i(((S)object2).d(), (S)object3).g();
            this.a.s(b8, object3);
            return;
        }
        this.a.s(b8, u.c(object3));
    }

    public static <T extends b<T>> u<T> w() {
        return new u<T>();
    }

    private void y(u0.b b8, Object object) {
        if (u.r(b8, object)) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    static void z(k k8, u0.b b8, int n8, Object object) throws IOException {
        if (b8 == u0.b.m0) {
            k8.A0(n8, (S)object);
            return;
        }
        k8.W0(n8, u.m(b8, false));
        u.A(k8, b8, object);
    }

    public void a(T object, Object object2) {
        if (object.k()) {
            this.y(object.m(), object2);
            ArrayList arrayList = this.i(object);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.s(object, arrayList);
                object = arrayList;
            } else {
                object = arrayList;
            }
            object.add((Object)object2);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public u<T> b() {
        u<b> u8 = u.w();
        for (int i8 = 0; i8 < this.a.l(); ++i8) {
            Map.Entry<T, Object> entry = this.a.k(i8);
            u8.x((b)entry.getKey(), entry.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            u8.x((b)entry.getKey(), entry.getValue());
        }
        u8.c = this.c;
        return u8;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof u)) {
            return false;
        }
        object = (u)object;
        return this.a.equals(((u)object).a);
    }

    Iterator<Map.Entry<T, Object>> g() {
        if (this.c) {
            return new D.c(this.a.i().iterator());
        }
        return this.a.i().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i(T object) {
        Object object2 = this.a.get(object);
        object = object2;
        if (object2 instanceof D) {
            object = ((D)object2).f();
        }
        return object;
    }

    public int j() {
        int n8 = 0;
        for (int i8 = 0; i8 < this.a.l(); ++i8) {
            n8 += this.k(this.a.k(i8));
        }
        Iterator<Map.Entry<T, Object>> iterator = this.a.n().iterator();
        while (iterator.hasNext()) {
            n8 += this.k(iterator.next());
        }
        return n8;
    }

    public int l() {
        int n8 = 0;
        for (int i8 = 0; i8 < this.a.l(); ++i8) {
            Map.Entry<T, Object> entry = this.a.k(i8);
            n8 += u.f((b)entry.getKey(), entry.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            n8 += u.f((b)entry.getKey(), entry.getValue());
        }
        return n8;
    }

    boolean n() {
        return this.a.isEmpty();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        for (int i8 = 0; i8 < this.a.l(); ++i8) {
            if (u.q(this.a.k(i8))) continue;
            return false;
        }
        Iterator<Map.Entry<T, Object>> iterator = this.a.n().iterator();
        while (iterator.hasNext()) {
            if (u.q(iterator.next())) continue;
            return false;
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        if (this.c) {
            return new D.c(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void t() {
        if (this.b) {
            return;
        }
        this.a.q();
        this.b = true;
    }

    public void u(u<T> object) {
        for (int i8 = 0; i8 < ((u)object).a.l(); ++i8) {
            this.v(((u)object).a.k(i8));
        }
        object = ((u)object).a.n().iterator();
        while (object.hasNext()) {
            this.v((Map.Entry)object.next());
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void x(T t8, Object arrayList) {
        Object var2_6;
        if (t8.k()) {
            if (!(arrayList instanceof List)) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            int n8 = arrayList2.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object e8 = arrayList2.get(i8);
                this.y(t8.m(), e8);
            }
            ArrayList arrayList3 = arrayList2;
        } else {
            this.y(t8.m(), arrayList);
        }
        if (var2_6 instanceof D) {
            this.c = true;
        }
        this.a.s(t8, var2_6);
    }

    public static interface b<T extends b<T>>
    extends Comparable<T> {
        public int g();

        public S.a i(S.a var1, S var2);

        public boolean k();

        public u0.b m();

        public u0.c y();

        public boolean z();
    }
}

