package ax.r0;

import ax.r0.C2904A;
import ax.r0.C2907D;
import ax.r0.C2933u.b;
import ax.r0.S;
import ax.r0.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ax.r0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2933u<T extends b<T>> {
    private static final C2933u d = new C2933u(true);
    private final k0<T, Object> a;
    private boolean b;
    private boolean c;

    /* renamed from: ax.r0.u$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[u0.b.values().length];
            b = iArr;
            try {
                iArr[u0.b.d0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[u0.b.e0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[u0.b.f0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[u0.b.g0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[u0.b.h0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[u0.b.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[u0.b.j0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[u0.b.k0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[u0.b.m0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[u0.b.n0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[u0.b.l0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[u0.b.o0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[u0.b.p0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[u0.b.r0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[u0.b.s0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[u0.b.t0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[u0.b.u0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[u0.b.q0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[u0.c.values().length];
            a = iArr2;
            try {
                iArr2[u0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[u0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[u0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[u0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[u0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[u0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[u0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[u0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[u0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: ax.r0.u$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        int g();

        S.a i(S.a aVar, S s);

        boolean k();

        u0.b m();

        u0.c y();

        boolean z();
    }

    private C2933u() {
        this.a = k0.r(16);
    }

    static void A(AbstractC2924k abstractC2924k, u0.b bVar, Object obj) throws IOException {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                abstractC2924k.r0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC2924k.z0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC2924k.H0(((Long) obj).longValue());
                break;
            case 4:
                abstractC2924k.a1(((Long) obj).longValue());
                break;
            case 5:
                abstractC2924k.F0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC2924k.x0(((Long) obj).longValue());
                break;
            case 7:
                abstractC2924k.v0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC2924k.l0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC2924k.C0((S) obj);
                break;
            case 10:
                abstractC2924k.J0((S) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC2921h)) {
                    abstractC2924k.V0((String) obj);
                    break;
                } else {
                    abstractC2924k.p0((AbstractC2921h) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC2921h)) {
                    abstractC2924k.m0((byte[]) obj);
                    break;
                } else {
                    abstractC2924k.p0((AbstractC2921h) obj);
                    break;
                }
            case 13:
                abstractC2924k.Y0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC2924k.N0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC2924k.P0(((Long) obj).longValue());
                break;
            case 16:
                abstractC2924k.R0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC2924k.T0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof C2904A.c)) {
                    abstractC2924k.t0(((Integer) obj).intValue());
                    break;
                } else {
                    abstractC2924k.t0(((C2904A.c) obj).g());
                    break;
                }
        }
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(u0.b bVar, int i, Object obj) {
        int V = AbstractC2924k.V(i);
        if (bVar == u0.b.m0) {
            V *= 2;
        }
        return V + e(bVar, obj);
    }

    static int e(u0.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return AbstractC2924k.j(((Double) obj).doubleValue());
            case 2:
                return AbstractC2924k.r(((Float) obj).floatValue());
            case 3:
                return AbstractC2924k.y(((Long) obj).longValue());
            case 4:
                return AbstractC2924k.Z(((Long) obj).longValue());
            case 5:
                return AbstractC2924k.w(((Integer) obj).intValue());
            case 6:
                return AbstractC2924k.p(((Long) obj).longValue());
            case 7:
                return AbstractC2924k.n(((Integer) obj).intValue());
            case 8:
                return AbstractC2924k.e(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC2924k.t((S) obj);
            case 10:
                return obj instanceof C2907D ? AbstractC2924k.B((C2907D) obj) : AbstractC2924k.G((S) obj);
            case 11:
                return obj instanceof AbstractC2921h ? AbstractC2924k.h((AbstractC2921h) obj) : AbstractC2924k.U((String) obj);
            case 12:
                return obj instanceof AbstractC2921h ? AbstractC2924k.h((AbstractC2921h) obj) : AbstractC2924k.f((byte[]) obj);
            case 13:
                return AbstractC2924k.X(((Integer) obj).intValue());
            case 14:
                return AbstractC2924k.M(((Integer) obj).intValue());
            case 15:
                return AbstractC2924k.O(((Long) obj).longValue());
            case 16:
                return AbstractC2924k.Q(((Integer) obj).intValue());
            case 17:
                return AbstractC2924k.S(((Long) obj).longValue());
            case 18:
                return obj instanceof C2904A.c ? AbstractC2924k.l(((C2904A.c) obj).g()) : AbstractC2924k.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        u0.b m = bVar.m();
        int g = bVar.g();
        if (!bVar.k()) {
            return d(m, g, obj);
        }
        int i = 0;
        if (bVar.z()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i += e(m, it.next());
            }
            return AbstractC2924k.V(g) + i + AbstractC2924k.K(i);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i += d(m, g, it2.next());
        }
        return i;
    }

    public static <T extends b<T>> C2933u<T> h() {
        return d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.y() != u0.c.MESSAGE || key.k() || key.z()) ? f(key, value) : value instanceof C2907D ? AbstractC2924k.z(entry.getKey().g(), (C2907D) value) : AbstractC2924k.D(entry.getKey().g(), (S) value);
    }

    static int m(u0.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.h();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.y() == u0.c.MESSAGE) {
            if (key.k()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((S) it.next()).b()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof S)) {
                    if (value instanceof C2907D) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((S) value).b()) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean r(u0.b bVar, Object obj) {
        C2904A.a(obj);
        switch (a.a[bVar.d().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC2921h) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C2904A.c)) {
                }
                break;
            case 9:
                if ((obj instanceof S) || (obj instanceof C2907D)) {
                }
                break;
        }
        return false;
    }

    private void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C2907D) {
            value = ((C2907D) value).f();
        }
        if (key.k()) {
            Object i = i(key);
            if (i == null) {
                i = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) i).add(c(it.next()));
            }
            this.a.put(key, i);
            return;
        }
        if (key.y() != u0.c.MESSAGE) {
            this.a.put(key, c(value));
            return;
        }
        Object i2 = i(key);
        if (i2 == null) {
            this.a.put(key, c(value));
        } else {
            this.a.put(key, key.i(((S) i2).d(), (S) value).g());
        }
    }

    public static <T extends b<T>> C2933u<T> w() {
        return new C2933u<>();
    }

    private void y(u0.b bVar, Object obj) {
        if (!r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void z(AbstractC2924k abstractC2924k, u0.b bVar, int i, Object obj) throws IOException {
        if (bVar == u0.b.m0) {
            abstractC2924k.A0(i, (S) obj);
        } else {
            abstractC2924k.W0(i, m(bVar, false));
            A(abstractC2924k, bVar, obj);
        }
    }

    public void a(T t, Object obj) {
        List list;
        if (!t.k()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t.m(), obj);
        Object i = i(t);
        if (i == null) {
            list = new ArrayList();
            this.a.put(t, list);
        } else {
            list = (List) i;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2933u<T> clone() {
        C2933u<T> w = w();
        for (int i = 0; i < this.a.l(); i++) {
            Map.Entry<T, Object> k = this.a.k(i);
            w.x(k.getKey(), k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            w.x(entry.getKey(), entry.getValue());
        }
        w.c = this.c;
        return w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2933u) {
            return this.a.equals(((C2933u) obj).a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        return this.c ? new C2907D.c(this.a.i().iterator()) : this.a.i().iterator();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Object i(T t) {
        Object obj = this.a.get(t);
        return obj instanceof C2907D ? ((C2907D) obj).f() : obj;
    }

    public int j() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.l(); i2++) {
            i += k(this.a.k(i2));
        }
        Iterator<Map.Entry<T, Object>> it = this.a.n().iterator();
        while (it.hasNext()) {
            i += k(it.next());
        }
        return i;
    }

    public int l() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.l(); i2++) {
            Map.Entry<T, Object> k = this.a.k(i2);
            i += f(k.getKey(), k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.n()) {
            i += f(entry.getKey(), entry.getValue());
        }
        return i;
    }

    boolean n() {
        return this.a.isEmpty();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        for (int i = 0; i < this.a.l(); i++) {
            if (!q(this.a.k(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.a.n().iterator();
        while (it.hasNext()) {
            if (!q(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.c ? new C2907D.c(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public void t() {
        if (this.b) {
            return;
        }
        this.a.q();
        this.b = true;
    }

    public void u(C2933u<T> c2933u) {
        for (int i = 0; i < c2933u.a.l(); i++) {
            v(c2933u.a.k(i));
        }
        Iterator<Map.Entry<T, Object>> it = c2933u.a.n().iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public void x(T t, Object obj) {
        if (!t.k()) {
            y(t.m(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                y(t.m(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C2907D) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    private C2933u(boolean z) {
        this(k0.r(0));
        t();
    }

    private C2933u(k0<T, Object> k0Var) {
        this.a = k0Var;
        t();
    }
}
