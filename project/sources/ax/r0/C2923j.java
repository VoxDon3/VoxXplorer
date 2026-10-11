package ax.r0;

import ax.r0.u0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.IOException;
import java.util.List;

/* renamed from: ax.r0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2923j implements g0 {
    private final AbstractC2922i a;
    private int b;
    private int c;
    private int d = 0;

    /* renamed from: ax.r0.j$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u0.b.values().length];
            a = iArr;
            try {
                iArr[u0.b.k0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u0.b.o0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u0.b.d0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u0.b.q0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u0.b.j0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u0.b.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u0.b.e0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u0.b.h0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u0.b.f0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u0.b.n0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u0.b.r0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u0.b.s0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u0.b.t0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u0.b.u0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u0.b.l0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u0.b.p0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u0.b.g0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C2923j(AbstractC2922i abstractC2922i) {
        AbstractC2922i abstractC2922i2 = (AbstractC2922i) C2904A.b(abstractC2922i, "input");
        this.a = abstractC2922i2;
        abstractC2922i2.d = this;
    }

    public static C2923j Q(AbstractC2922i abstractC2922i) {
        C2923j c2923j = abstractC2922i.d;
        return c2923j != null ? c2923j : new C2923j(abstractC2922i);
    }

    private Object R(u0.b bVar, Class<?> cls, C2929p c2929p) throws IOException {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(m());
            case 2:
                return G();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(w());
            case 5:
                return Integer.valueOf(k());
            case 6:
                return Long.valueOf(e());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(I());
            case 9:
                return Long.valueOf(N());
            case 10:
                return x(cls, c2929p);
            case 11:
                return Integer.valueOf(K());
            case 12:
                return Long.valueOf(n());
            case 13:
                return Integer.valueOf(z());
            case 14:
                return Long.valueOf(A());
            case 15:
                return O();
            case 16:
                return Integer.valueOf(p());
            case 17:
                return Long.valueOf(d());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(h0<T> h0Var, C2929p c2929p) throws IOException {
        int i = this.c;
        this.c = u0.c(u0.a(this.b), 4);
        try {
            T g = h0Var.g();
            h0Var.h(g, this, c2929p);
            h0Var.b(g);
            if (this.b == this.c) {
                return g;
            }
            throw C2905B.g();
        } finally {
            this.c = i;
        }
    }

    private <T> T T(h0<T> h0Var, C2929p c2929p) throws IOException {
        int C = this.a.C();
        AbstractC2922i abstractC2922i = this.a;
        if (abstractC2922i.a >= abstractC2922i.b) {
            throw C2905B.h();
        }
        int l = abstractC2922i.l(C);
        T g = h0Var.g();
        this.a.a++;
        h0Var.h(g, this, c2929p);
        h0Var.b(g);
        this.a.a(0);
        r5.a--;
        this.a.k(l);
        return g;
    }

    private void V(int i) throws IOException {
        if (this.a.d() != i) {
            throw C2905B.k();
        }
    }

    private void W(int i) throws IOException {
        if (u0.b(this.b) != i) {
            throw C2905B.d();
        }
    }

    private void X(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C2905B.g();
        }
    }

    private void Y(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C2905B.g();
        }
    }

    @Override // ax.r0.g0
    public long A() throws IOException {
        W(0);
        return this.a.y();
    }

    @Override // ax.r0.g0
    public void B(List<Boolean> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2919f)) {
            int b = u0.b(this.b);
            if (b == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.m()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int d = this.a.d() + this.a.C();
            do {
                list.add(Boolean.valueOf(this.a.m()));
            } while (this.a.d() < d);
            V(d);
            return;
        }
        C2919f c2919f = (C2919f) list;
        int b2 = u0.b(this.b);
        if (b2 == 0) {
            do {
                c2919f.k(this.a.m());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int d2 = this.a.d() + this.a.C();
        do {
            c2919f.k(this.a.m());
        } while (this.a.d() < d2);
        V(d2);
    }

    @Override // ax.r0.g0
    public String C() throws IOException {
        W(2);
        return this.a.z();
    }

    @Override // ax.r0.g0
    public int D() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        int i2 = this.b;
        return (i2 == 0 || i2 == this.c) ? SubsamplingScaleImageView.TILE_SIZE_AUTO : u0.a(i2);
    }

    @Override // ax.r0.g0
    public void E(List<String> list) throws IOException {
        U(list, false);
    }

    @Override // ax.r0.g0
    public void F(List<String> list) throws IOException {
        U(list, true);
    }

    @Override // ax.r0.g0
    public AbstractC2921h G() throws IOException {
        W(2);
        return this.a.n();
    }

    @Override // ax.r0.g0
    public void H(List<Float> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2935w)) {
            int b = u0.b(this.b);
            if (b == 2) {
                int C = this.a.C();
                X(C);
                int d = this.a.d() + C;
                do {
                    list.add(Float.valueOf(this.a.s()));
                } while (this.a.d() < d);
                return;
            }
            if (b != 5) {
                throw C2905B.d();
            }
            do {
                list.add(Float.valueOf(this.a.s()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        C2935w c2935w = (C2935w) list;
        int b2 = u0.b(this.b);
        if (b2 == 2) {
            int C2 = this.a.C();
            X(C2);
            int d2 = this.a.d() + C2;
            do {
                c2935w.i(this.a.s());
            } while (this.a.d() < d2);
            return;
        }
        if (b2 != 5) {
            throw C2905B.d();
        }
        do {
            c2935w.i(this.a.s());
            if (this.a.e()) {
                return;
            } else {
                B2 = this.a.B();
            }
        } while (B2 == this.b);
        this.d = B2;
    }

    @Override // ax.r0.g0
    public int I() throws IOException {
        W(0);
        return this.a.t();
    }

    @Override // ax.r0.g0
    public boolean J() throws IOException {
        int i;
        if (this.a.e() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.E(i);
    }

    @Override // ax.r0.g0
    public int K() throws IOException {
        W(5);
        return this.a.v();
    }

    @Override // ax.r0.g0
    public void L(List<AbstractC2921h> list) throws IOException {
        int B;
        if (u0.b(this.b) != 2) {
            throw C2905B.d();
        }
        do {
            list.add(G());
            if (this.a.e()) {
                return;
            } else {
                B = this.a.B();
            }
        } while (B == this.b);
        this.d = B;
    }

    @Override // ax.r0.g0
    public void M(List<Double> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2926m)) {
            int b = u0.b(this.b);
            if (b == 1) {
                do {
                    list.add(Double.valueOf(this.a.o()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int C = this.a.C();
            Y(C);
            int d = this.a.d() + C;
            do {
                list.add(Double.valueOf(this.a.o()));
            } while (this.a.d() < d);
            return;
        }
        C2926m c2926m = (C2926m) list;
        int b2 = u0.b(this.b);
        if (b2 == 1) {
            do {
                c2926m.i(this.a.o());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int C2 = this.a.C();
        Y(C2);
        int d2 = this.a.d() + C2;
        do {
            c2926m.i(this.a.o());
        } while (this.a.d() < d2);
    }

    @Override // ax.r0.g0
    public long N() throws IOException {
        W(0);
        return this.a.u();
    }

    @Override // ax.r0.g0
    public String O() throws IOException {
        W(2);
        return this.a.A();
    }

    @Override // ax.r0.g0
    public void P(List<Long> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2912I)) {
            int b = u0.b(this.b);
            if (b == 1) {
                do {
                    list.add(Long.valueOf(this.a.r()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int C = this.a.C();
            Y(C);
            int d = this.a.d() + C;
            do {
                list.add(Long.valueOf(this.a.r()));
            } while (this.a.d() < d);
            return;
        }
        C2912I c2912i = (C2912I) list;
        int b2 = u0.b(this.b);
        if (b2 == 1) {
            do {
                c2912i.k(this.a.r());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int C2 = this.a.C();
        Y(C2);
        int d2 = this.a.d() + C2;
        do {
            c2912i.k(this.a.r());
        } while (this.a.d() < d2);
    }

    public void U(List<String> list, boolean z) throws IOException {
        int B;
        int B2;
        if (u0.b(this.b) != 2) {
            throw C2905B.d();
        }
        if (!(list instanceof InterfaceC2910G) || z) {
            do {
                list.add(z ? O() : C());
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        InterfaceC2910G interfaceC2910G = (InterfaceC2910G) list;
        do {
            interfaceC2910G.C0(G());
            if (this.a.e()) {
                return;
            } else {
                B2 = this.a.B();
            }
        } while (B2 == this.b);
        this.d = B2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.r0.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void a(java.util.Map<K, V> r8, ax.r0.K.a<K, V> r9, ax.r0.C2929p r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            ax.r0.i r1 = r7.a
            int r1 = r1.C()
            ax.r0.i r2 = r7.a
            int r1 = r2.l(r1)
            K r2 = r9.b
            V r3 = r9.d
        L14:
            int r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            ax.r0.i r5 = r7.a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.J()     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            ax.r0.B r4 = new ax.r0.B     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            ax.r0.u0$b r4 = r9.c     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
            V r5 = r9.d     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
            goto L14
        L49:
            ax.r0.u0$b r4 = r9.a     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a ax.r0.C2905B.a -> L51
            goto L14
        L51:
            boolean r4 = r7.J()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            ax.r0.B r8 = new ax.r0.B     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            ax.r0.i r8 = r7.a
            r8.k(r1)
            return
        L67:
            ax.r0.i r9 = r7.a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.r0.C2923j.a(java.util.Map, ax.r0.K$a, ax.r0.p):void");
    }

    @Override // ax.r0.g0
    public <T> T b(h0<T> h0Var, C2929p c2929p) throws IOException {
        W(3);
        return (T) S(h0Var, c2929p);
    }

    @Override // ax.r0.g0
    public void c(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2938z)) {
            int b = u0.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.a.x()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int d = this.a.d() + this.a.C();
            do {
                list.add(Integer.valueOf(this.a.x()));
            } while (this.a.d() < d);
            V(d);
            return;
        }
        C2938z c2938z = (C2938z) list;
        int b2 = u0.b(this.b);
        if (b2 == 0) {
            do {
                c2938z.i(this.a.x());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int d2 = this.a.d() + this.a.C();
        do {
            c2938z.i(this.a.x());
        } while (this.a.d() < d2);
        V(d2);
    }

    @Override // ax.r0.g0
    public long d() throws IOException {
        W(0);
        return this.a.D();
    }

    @Override // ax.r0.g0
    public long e() throws IOException {
        W(1);
        return this.a.r();
    }

    @Override // ax.r0.g0
    public <T> T f(h0<T> h0Var, C2929p c2929p) throws IOException {
        W(2);
        return (T) T(h0Var, c2929p);
    }

    @Override // ax.r0.g0
    public void g(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2938z)) {
            int b = u0.b(this.b);
            if (b == 2) {
                int C = this.a.C();
                X(C);
                int d = this.a.d() + C;
                do {
                    list.add(Integer.valueOf(this.a.v()));
                } while (this.a.d() < d);
                return;
            }
            if (b != 5) {
                throw C2905B.d();
            }
            do {
                list.add(Integer.valueOf(this.a.v()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        C2938z c2938z = (C2938z) list;
        int b2 = u0.b(this.b);
        if (b2 == 2) {
            int C2 = this.a.C();
            X(C2);
            int d2 = this.a.d() + C2;
            do {
                c2938z.i(this.a.v());
            } while (this.a.d() < d2);
            return;
        }
        if (b2 != 5) {
            throw C2905B.d();
        }
        do {
            c2938z.i(this.a.v());
            if (this.a.e()) {
                return;
            } else {
                B2 = this.a.B();
            }
        } while (B2 == this.b);
        this.d = B2;
    }

    @Override // ax.r0.g0
    public void h(List<Long> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2912I)) {
            int b = u0.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.a.y()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int d = this.a.d() + this.a.C();
            do {
                list.add(Long.valueOf(this.a.y()));
            } while (this.a.d() < d);
            V(d);
            return;
        }
        C2912I c2912i = (C2912I) list;
        int b2 = u0.b(this.b);
        if (b2 == 0) {
            do {
                c2912i.k(this.a.y());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int d2 = this.a.d() + this.a.C();
        do {
            c2912i.k(this.a.y());
        } while (this.a.d() < d2);
        V(d2);
    }

    @Override // ax.r0.g0
    public void i(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2938z)) {
            int b = u0.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.a.C()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int d = this.a.d() + this.a.C();
            do {
                list.add(Integer.valueOf(this.a.C()));
            } while (this.a.d() < d);
            V(d);
            return;
        }
        C2938z c2938z = (C2938z) list;
        int b2 = u0.b(this.b);
        if (b2 == 0) {
            do {
                c2938z.i(this.a.C());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int d2 = this.a.d() + this.a.C();
        do {
            c2938z.i(this.a.C());
        } while (this.a.d() < d2);
        V(d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.r0.g0
    public <T> void j(List<T> list, h0<T> h0Var, C2929p c2929p) throws IOException {
        int B;
        if (u0.b(this.b) != 3) {
            throw C2905B.d();
        }
        int i = this.b;
        do {
            list.add(S(h0Var, c2929p));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                B = this.a.B();
            }
        } while (B == i);
        this.d = B;
    }

    @Override // ax.r0.g0
    public int k() throws IOException {
        W(5);
        return this.a.q();
    }

    @Override // ax.r0.g0
    public int l() {
        return this.b;
    }

    @Override // ax.r0.g0
    public boolean m() throws IOException {
        W(0);
        return this.a.m();
    }

    @Override // ax.r0.g0
    public long n() throws IOException {
        W(1);
        return this.a.w();
    }

    @Override // ax.r0.g0
    public void o(List<Long> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2912I)) {
            int b = u0.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.a.D()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int d = this.a.d() + this.a.C();
            do {
                list.add(Long.valueOf(this.a.D()));
            } while (this.a.d() < d);
            V(d);
            return;
        }
        C2912I c2912i = (C2912I) list;
        int b2 = u0.b(this.b);
        if (b2 == 0) {
            do {
                c2912i.k(this.a.D());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int d2 = this.a.d() + this.a.C();
        do {
            c2912i.k(this.a.D());
        } while (this.a.d() < d2);
        V(d2);
    }

    @Override // ax.r0.g0
    public int p() throws IOException {
        W(0);
        return this.a.C();
    }

    @Override // ax.r0.g0
    public <T> T q(Class<T> cls, C2929p c2929p) throws IOException {
        W(3);
        return (T) S(d0.a().d(cls), c2929p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.r0.g0
    public <T> void r(List<T> list, h0<T> h0Var, C2929p c2929p) throws IOException {
        int B;
        if (u0.b(this.b) != 2) {
            throw C2905B.d();
        }
        int i = this.b;
        do {
            list.add(T(h0Var, c2929p));
            if (this.a.e() || this.d != 0) {
                return;
            } else {
                B = this.a.B();
            }
        } while (B == i);
        this.d = B;
    }

    @Override // ax.r0.g0
    public double readDouble() throws IOException {
        W(1);
        return this.a.o();
    }

    @Override // ax.r0.g0
    public float readFloat() throws IOException {
        W(5);
        return this.a.s();
    }

    @Override // ax.r0.g0
    public void s(List<Long> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2912I)) {
            int b = u0.b(this.b);
            if (b == 0) {
                do {
                    list.add(Long.valueOf(this.a.u()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int d = this.a.d() + this.a.C();
            do {
                list.add(Long.valueOf(this.a.u()));
            } while (this.a.d() < d);
            V(d);
            return;
        }
        C2912I c2912i = (C2912I) list;
        int b2 = u0.b(this.b);
        if (b2 == 0) {
            do {
                c2912i.k(this.a.u());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int d2 = this.a.d() + this.a.C();
        do {
            c2912i.k(this.a.u());
        } while (this.a.d() < d2);
        V(d2);
    }

    @Override // ax.r0.g0
    public void t(List<Long> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2912I)) {
            int b = u0.b(this.b);
            if (b == 1) {
                do {
                    list.add(Long.valueOf(this.a.w()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int C = this.a.C();
            Y(C);
            int d = this.a.d() + C;
            do {
                list.add(Long.valueOf(this.a.w()));
            } while (this.a.d() < d);
            return;
        }
        C2912I c2912i = (C2912I) list;
        int b2 = u0.b(this.b);
        if (b2 == 1) {
            do {
                c2912i.k(this.a.w());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int C2 = this.a.C();
        Y(C2);
        int d2 = this.a.d() + C2;
        do {
            c2912i.k(this.a.w());
        } while (this.a.d() < d2);
    }

    @Override // ax.r0.g0
    public void u(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2938z)) {
            int b = u0.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.a.t()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int d = this.a.d() + this.a.C();
            do {
                list.add(Integer.valueOf(this.a.t()));
            } while (this.a.d() < d);
            V(d);
            return;
        }
        C2938z c2938z = (C2938z) list;
        int b2 = u0.b(this.b);
        if (b2 == 0) {
            do {
                c2938z.i(this.a.t());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int d2 = this.a.d() + this.a.C();
        do {
            c2938z.i(this.a.t());
        } while (this.a.d() < d2);
        V(d2);
    }

    @Override // ax.r0.g0
    public void v(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2938z)) {
            int b = u0.b(this.b);
            if (b == 0) {
                do {
                    list.add(Integer.valueOf(this.a.p()));
                    if (this.a.e()) {
                        return;
                    } else {
                        B = this.a.B();
                    }
                } while (B == this.b);
                this.d = B;
                return;
            }
            if (b != 2) {
                throw C2905B.d();
            }
            int d = this.a.d() + this.a.C();
            do {
                list.add(Integer.valueOf(this.a.p()));
            } while (this.a.d() < d);
            V(d);
            return;
        }
        C2938z c2938z = (C2938z) list;
        int b2 = u0.b(this.b);
        if (b2 == 0) {
            do {
                c2938z.i(this.a.p());
                if (this.a.e()) {
                    return;
                } else {
                    B2 = this.a.B();
                }
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        if (b2 != 2) {
            throw C2905B.d();
        }
        int d2 = this.a.d() + this.a.C();
        do {
            c2938z.i(this.a.p());
        } while (this.a.d() < d2);
        V(d2);
    }

    @Override // ax.r0.g0
    public int w() throws IOException {
        W(0);
        return this.a.p();
    }

    @Override // ax.r0.g0
    public <T> T x(Class<T> cls, C2929p c2929p) throws IOException {
        W(2);
        return (T) T(d0.a().d(cls), c2929p);
    }

    @Override // ax.r0.g0
    public void y(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (!(list instanceof C2938z)) {
            int b = u0.b(this.b);
            if (b == 2) {
                int C = this.a.C();
                X(C);
                int d = this.a.d() + C;
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.d() < d);
                return;
            }
            if (b != 5) {
                throw C2905B.d();
            }
            do {
                list.add(Integer.valueOf(this.a.q()));
                if (this.a.e()) {
                    return;
                } else {
                    B = this.a.B();
                }
            } while (B == this.b);
            this.d = B;
            return;
        }
        C2938z c2938z = (C2938z) list;
        int b2 = u0.b(this.b);
        if (b2 == 2) {
            int C2 = this.a.C();
            X(C2);
            int d2 = this.a.d() + C2;
            do {
                c2938z.i(this.a.q());
            } while (this.a.d() < d2);
            return;
        }
        if (b2 != 5) {
            throw C2905B.d();
        }
        do {
            c2938z.i(this.a.q());
            if (this.a.e()) {
                return;
            } else {
                B2 = this.a.B();
            }
        } while (B2 == this.b);
        this.d = B2;
    }

    @Override // ax.r0.g0
    public int z() throws IOException {
        W(0);
        return this.a.x();
    }
}
