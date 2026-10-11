package androidx.media3.exoplayer;

import ax.P0.C0893b;
import ax.P0.N;
import ax.Y0.AbstractC1175a;
import ax.i1.AbstractC2232w;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class L0 extends AbstractC1175a {
    private final int h;
    private final int i;
    private final int[] j;
    private final int[] k;
    private final ax.P0.N[] l;
    private final Object[] m;
    private final HashMap<Object, Integer> n;

    class a extends AbstractC2232w {
        private final N.c f;

        a(ax.P0.N n) {
            super(n);
            this.f = new N.c();
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public N.b g(int i, N.b bVar, boolean z) {
            N.b g = super.g(i, bVar, z);
            if (super.n(g.c, this.f).f()) {
                g.u(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, C0893b.g, true);
                return g;
            }
            g.f = true;
            return g;
        }
    }

    public L0(Collection<? extends InterfaceC0627u0> collection, ax.i1.g0 g0Var) {
        this(G(collection), H(collection), g0Var);
    }

    private static ax.P0.N[] G(Collection<? extends InterfaceC0627u0> collection) {
        ax.P0.N[] nArr = new ax.P0.N[collection.size()];
        Iterator<? extends InterfaceC0627u0> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            nArr[i] = it.next().r();
            i++;
        }
        return nArr;
    }

    private static Object[] H(Collection<? extends InterfaceC0627u0> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends InterfaceC0627u0> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().q();
            i++;
        }
        return objArr;
    }

    @Override // ax.Y0.AbstractC1175a
    protected int A(int i) {
        return this.k[i];
    }

    @Override // ax.Y0.AbstractC1175a
    protected ax.P0.N D(int i) {
        return this.l[i];
    }

    public L0 E(ax.i1.g0 g0Var) {
        ax.P0.N[] nArr = new ax.P0.N[this.l.length];
        int i = 0;
        while (true) {
            ax.P0.N[] nArr2 = this.l;
            if (i >= nArr2.length) {
                return new L0(nArr, this.m, g0Var);
            }
            nArr[i] = new a(nArr2[i]);
            i++;
        }
    }

    List<ax.P0.N> F() {
        return Arrays.asList(this.l);
    }

    @Override // ax.P0.N
    public int i() {
        return this.i;
    }

    @Override // ax.P0.N
    public int p() {
        return this.h;
    }

    @Override // ax.Y0.AbstractC1175a
    protected int s(Object obj) {
        Integer num = this.n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // ax.Y0.AbstractC1175a
    protected int t(int i) {
        return ax.S0.d0.g(this.j, i + 1, false, false);
    }

    @Override // ax.Y0.AbstractC1175a
    protected int u(int i) {
        return ax.S0.d0.g(this.k, i + 1, false, false);
    }

    @Override // ax.Y0.AbstractC1175a
    protected Object x(int i) {
        return this.m[i];
    }

    @Override // ax.Y0.AbstractC1175a
    protected int z(int i) {
        return this.j[i];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private L0(ax.P0.N[] nArr, Object[] objArr, ax.i1.g0 g0Var) {
        super(false, g0Var);
        int i = 0;
        int length = nArr.length;
        this.l = nArr;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap<>();
        int length2 = nArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            ax.P0.N n = nArr[i];
            this.l[i4] = n;
            this.k[i4] = i2;
            this.j[i4] = i3;
            i2 += n.p();
            i3 += this.l[i4].i();
            this.n.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.h = i2;
        this.i = i3;
    }
}
