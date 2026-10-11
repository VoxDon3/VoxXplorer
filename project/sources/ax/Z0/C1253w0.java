package ax.Z0;

import android.util.Base64;
import ax.P0.N;
import ax.S0.C0968a;
import ax.Z0.F1;
import ax.Z0.InterfaceC1206c;
import ax.i1.InterfaceC2209F;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: ax.Z0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1253w0 implements F1 {
    public static final ax.q7.u<String> i = new ax.q7.u() { // from class: ax.Z0.v0
        @Override // ax.q7.u
        public final Object get() {
            String m;
            m = C1253w0.m();
            return m;
        }
    };
    private static final Random j = new Random();
    private final N.c a;
    private final N.b b;
    private final HashMap<String, a> c;
    private final ax.q7.u<String> d;
    private F1.a e;
    private ax.P0.N f;
    private String g;
    private long h;

    /* renamed from: ax.Z0.w0$a */
    private final class a {
        private final String a;
        private int b;
        private long c;
        private InterfaceC2209F.b d;
        private boolean e;
        private boolean f;

        public a(String str, int i, InterfaceC2209F.b bVar) {
            this.a = str;
            this.b = i;
            this.c = bVar == null ? -1L : bVar.d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.d = bVar;
        }

        private int l(ax.P0.N n, ax.P0.N n2, int i) {
            if (i >= n.p()) {
                if (i < n2.p()) {
                    return i;
                }
                return -1;
            }
            n.n(i, C1253w0.this.a);
            for (int i2 = C1253w0.this.a.n; i2 <= C1253w0.this.a.o; i2++) {
                int b = n2.b(n.m(i2));
                if (b != -1) {
                    return n2.f(b, C1253w0.this.b).c;
                }
            }
            return -1;
        }

        public boolean i(int i, InterfaceC2209F.b bVar) {
            if (bVar == null) {
                return i == this.b;
            }
            InterfaceC2209F.b bVar2 = this.d;
            return bVar2 == null ? !bVar.b() && bVar.d == this.c : bVar.d == bVar2.d && bVar.b == bVar2.b && bVar.c == bVar2.c;
        }

        public boolean j(InterfaceC1206c.a aVar) {
            InterfaceC2209F.b bVar = aVar.d;
            if (bVar == null) {
                return this.b != aVar.c;
            }
            long j = this.c;
            if (j == -1) {
                return false;
            }
            if (bVar.d > j) {
                return true;
            }
            if (this.d == null) {
                return false;
            }
            int b = aVar.b.b(bVar.a);
            int b2 = aVar.b.b(this.d.a);
            InterfaceC2209F.b bVar2 = aVar.d;
            if (bVar2.d < this.d.d || b < b2) {
                return false;
            }
            if (b > b2) {
                return true;
            }
            if (!bVar2.b()) {
                int i = aVar.d.e;
                return i == -1 || i > this.d.b;
            }
            InterfaceC2209F.b bVar3 = aVar.d;
            int i2 = bVar3.b;
            int i3 = bVar3.c;
            InterfaceC2209F.b bVar4 = this.d;
            int i4 = bVar4.b;
            return i2 > i4 || (i2 == i4 && i3 > bVar4.c);
        }

        public void k(int i, InterfaceC2209F.b bVar) {
            if (this.c != -1 || i != this.b || bVar == null || bVar.d < C1253w0.this.n()) {
                return;
            }
            this.c = bVar.d;
        }

        public boolean m(ax.P0.N n, ax.P0.N n2) {
            int l = l(n, n2, this.b);
            this.b = l;
            if (l == -1) {
                return false;
            }
            InterfaceC2209F.b bVar = this.d;
            return bVar == null || n2.b(bVar.a) != -1;
        }
    }

    public C1253w0() {
        this(i);
    }

    private void l(a aVar) {
        if (aVar.c != -1) {
            this.h = aVar.c;
        }
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = this.c.get(this.g);
        return (aVar == null || aVar.c == -1) ? this.h + 1 : aVar.c;
    }

    private a o(int i2, InterfaceC2209F.b bVar) {
        a aVar = null;
        long j2 = Long.MAX_VALUE;
        for (a aVar2 : this.c.values()) {
            aVar2.k(i2, bVar);
            if (aVar2.i(i2, bVar)) {
                long j3 = aVar2.c;
                if (j3 == -1 || j3 < j2) {
                    aVar = aVar2;
                    j2 = j3;
                } else if (j3 == j2 && ((a) ax.S0.d0.i(aVar)).d != null && aVar2.d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.d.get();
        a aVar3 = new a(str, i2, bVar);
        this.c.put(str, aVar3);
        return aVar3;
    }

    private void p(InterfaceC1206c.a aVar) {
        if (aVar.b.q()) {
            String str = this.g;
            if (str != null) {
                l((a) C0968a.e(this.c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = this.c.get(this.g);
        a o = o(aVar.c, aVar.d);
        this.g = o.a;
        b(aVar);
        InterfaceC2209F.b bVar = aVar.d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.c == aVar.d.d && aVar2.d != null && aVar2.d.b == aVar.d.b && aVar2.d.c == aVar.d.c) {
            return;
        }
        InterfaceC2209F.b bVar2 = aVar.d;
        this.e.o(aVar, o(aVar.c, new InterfaceC2209F.b(bVar2.a, bVar2.d)).a, o.a);
    }

    @Override // ax.Z0.F1
    public synchronized String a() {
        return this.g;
    }

    @Override // ax.Z0.F1
    public synchronized void b(InterfaceC1206c.a aVar) {
        C0968a.e(this.e);
        if (aVar.b.q()) {
            return;
        }
        InterfaceC2209F.b bVar = aVar.d;
        if (bVar != null) {
            if (bVar.d < n()) {
                return;
            }
            a aVar2 = this.c.get(this.g);
            if (aVar2 != null && aVar2.c == -1 && aVar2.b != aVar.c) {
                return;
            }
        }
        a o = o(aVar.c, aVar.d);
        if (this.g == null) {
            this.g = o.a;
        }
        InterfaceC2209F.b bVar2 = aVar.d;
        if (bVar2 != null && bVar2.b()) {
            InterfaceC2209F.b bVar3 = aVar.d;
            InterfaceC2209F.b bVar4 = new InterfaceC2209F.b(bVar3.a, bVar3.d, bVar3.b);
            a o2 = o(aVar.c, bVar4);
            if (!o2.e) {
                o2.e = true;
                aVar.b.h(aVar.d.a, this.b);
                this.e.J(new InterfaceC1206c.a(aVar.a, aVar.b, aVar.c, bVar4, Math.max(0L, ax.S0.d0.E1(this.b.f(aVar.d.b)) + this.b.n()), aVar.f, aVar.g, aVar.h, aVar.i, aVar.j), o2.a);
            }
        }
        if (!o.e) {
            o.e = true;
            this.e.J(aVar, o.a);
        }
        if (o.a.equals(this.g) && !o.f) {
            o.f = true;
            this.e.H(aVar, o.a);
        }
    }

    @Override // ax.Z0.F1
    public void c(F1.a aVar) {
        this.e = aVar;
    }

    @Override // ax.Z0.F1
    public synchronized void d(InterfaceC1206c.a aVar, int i2) {
        try {
            C0968a.e(this.e);
            boolean z = i2 == 0;
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(aVar)) {
                    it.remove();
                    if (next.e) {
                        boolean equals = next.a.equals(this.g);
                        boolean z2 = z && equals && next.f;
                        if (equals) {
                            l(next);
                        }
                        this.e.y(aVar, next.a, z2);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.Z0.F1
    public synchronized void e(InterfaceC1206c.a aVar) {
        F1.a aVar2;
        try {
            String str = this.g;
            if (str != null) {
                l((a) C0968a.e(this.c.get(str)));
            }
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.e && (aVar2 = this.e) != null) {
                    aVar2.y(aVar, next.a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.Z0.F1
    public synchronized void f(InterfaceC1206c.a aVar) {
        try {
            C0968a.e(this.e);
            ax.P0.N n = this.f;
            this.f = aVar.b;
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.m(n, this.f) && !next.j(aVar)) {
                }
                it.remove();
                if (next.e) {
                    if (next.a.equals(this.g)) {
                        l(next);
                    }
                    this.e.y(aVar, next.a, false);
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.Z0.F1
    public synchronized String g(ax.P0.N n, InterfaceC2209F.b bVar) {
        return o(n.h(bVar.a, this.b).c, bVar).a;
    }

    public C1253w0(ax.q7.u<String> uVar) {
        this.d = uVar;
        this.a = new N.c();
        this.b = new N.b();
        this.c = new HashMap<>();
        this.f = ax.P0.N.a;
        this.h = -1L;
    }
}
