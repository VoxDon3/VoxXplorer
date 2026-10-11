package ax.Y0;

import android.util.Pair;
import ax.P0.N;
import ax.S0.C0968a;
import ax.i1.g0;

/* renamed from: ax.Y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1175a extends ax.P0.N {
    private final int e;
    private final g0 f;
    private final boolean g;

    public AbstractC1175a(boolean z, g0 g0Var) {
        this.g = z;
        this.f = g0Var;
        this.e = g0Var.getLength();
    }

    private int B(int i, boolean z) {
        if (z) {
            return this.f.d(i);
        }
        if (i < this.e - 1) {
            return i + 1;
        }
        return -1;
    }

    private int C(int i, boolean z) {
        if (z) {
            return this.f.c(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    protected abstract int A(int i);

    protected abstract ax.P0.N D(int i);

    @Override // ax.P0.N
    public int a(boolean z) {
        if (this.e == 0) {
            return -1;
        }
        if (this.g) {
            z = false;
        }
        int b = z ? this.f.b() : 0;
        while (D(b).q()) {
            b = B(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return A(b) + D(b).a(z);
    }

    @Override // ax.P0.N
    public final int b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w = w(obj);
        Object v = v(obj);
        int s = s(w);
        if (s == -1 || (b = D(s).b(v)) == -1) {
            return -1;
        }
        return z(s) + b;
    }

    @Override // ax.P0.N
    public int c(boolean z) {
        int i = this.e;
        if (i == 0) {
            return -1;
        }
        if (this.g) {
            z = false;
        }
        int f = z ? this.f.f() : i - 1;
        while (D(f).q()) {
            f = C(f, z);
            if (f == -1) {
                return -1;
            }
        }
        return A(f) + D(f).c(z);
    }

    @Override // ax.P0.N
    public int e(int i, int i2, boolean z) {
        if (this.g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int u = u(i);
        int A = A(u);
        int e = D(u).e(i - A, i2 != 2 ? i2 : 0, z);
        if (e != -1) {
            return A + e;
        }
        int B = B(u, z);
        while (B != -1 && D(B).q()) {
            B = B(B, z);
        }
        if (B != -1) {
            return A(B) + D(B).a(z);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // ax.P0.N
    public final N.b g(int i, N.b bVar, boolean z) {
        int t = t(i);
        int A = A(t);
        D(t).g(i - z(t), bVar, z);
        bVar.c += A;
        if (z) {
            bVar.b = y(x(t), C0968a.e(bVar.b));
        }
        return bVar;
    }

    @Override // ax.P0.N
    public final N.b h(Object obj, N.b bVar) {
        Object w = w(obj);
        Object v = v(obj);
        int s = s(w);
        int A = A(s);
        D(s).h(v, bVar);
        bVar.c += A;
        bVar.b = obj;
        return bVar;
    }

    @Override // ax.P0.N
    public int l(int i, int i2, boolean z) {
        if (this.g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int u = u(i);
        int A = A(u);
        int l = D(u).l(i - A, i2 != 2 ? i2 : 0, z);
        if (l != -1) {
            return A + l;
        }
        int C = C(u, z);
        while (C != -1 && D(C).q()) {
            C = C(C, z);
        }
        if (C != -1) {
            return A(C) + D(C).c(z);
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // ax.P0.N
    public final Object m(int i) {
        int t = t(i);
        return y(x(t), D(t).m(i - z(t)));
    }

    @Override // ax.P0.N
    public final N.c o(int i, N.c cVar, long j) {
        int u = u(i);
        int A = A(u);
        int z = z(u);
        D(u).o(i - A, cVar, j);
        Object x = x(u);
        if (!N.c.q.equals(cVar.a)) {
            x = y(x, cVar.a);
        }
        cVar.a = x;
        cVar.n += z;
        cVar.o += z;
        return cVar;
    }

    protected abstract int s(Object obj);

    protected abstract int t(int i);

    protected abstract int u(int i);

    protected abstract Object x(int i);

    protected abstract int z(int i);
}
