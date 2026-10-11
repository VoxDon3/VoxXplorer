/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.u0;
import ax.P0.N;
import ax.P0.b;
import ax.S0.d0;
import ax.Y0.a;
import ax.i1.g0;
import ax.i1.w;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

final class L0
extends a {
    private final int h;
    private final int i;
    private final int[] j;
    private final int[] k;
    private final N[] l;
    private final Object[] m;
    private final HashMap<Object, Integer> n;

    public L0(Collection<? extends u0> collection, g0 g02) {
        this(L0.G(collection), L0.H(collection), g02);
    }

    private L0(N[] nArray, Object[] objectArray, g0 object) {
        int n8 = 0;
        super(false, (g0)object);
        int n9 = nArray.length;
        this.l = nArray;
        this.j = new int[n9];
        this.k = new int[n9];
        this.m = objectArray;
        this.n = new HashMap();
        int n10 = nArray.length;
        int n11 = 0;
        int n12 = 0;
        n9 = 0;
        while (n8 < n10) {
            this.l[n9] = object = nArray[n8];
            this.k[n9] = n11;
            this.j[n9] = n12;
            n11 += ((N)object).p();
            n12 += this.l[n9].i();
            this.n.put(objectArray[n9], n9);
            ++n8;
            ++n9;
        }
        this.h = n11;
        this.i = n12;
    }

    private static N[] G(Collection<? extends u0> object) {
        N[] nArray = new N[object.size()];
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            nArray[n8] = ((u0)object.next()).r();
            ++n8;
        }
        return nArray;
    }

    private static Object[] H(Collection<? extends u0> object) {
        Object[] objectArray = new Object[object.size()];
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            objectArray[n8] = ((u0)object.next()).q();
            ++n8;
        }
        return objectArray;
    }

    @Override
    protected int A(int n8) {
        return this.k[n8];
    }

    @Override
    protected N D(int n8) {
        return this.l[n8];
    }

    public L0 E(g0 g02) {
        N[] nArray;
        N[] nArray2 = new N[this.l.length];
        for (int i8 = 0; i8 < (nArray = this.l).length; ++i8) {
            nArray2[i8] = new w(this, nArray[i8]){
                private final N.c f;
                final L0 g;
                {
                    this.g = l02;
                    super(n8);
                    this.f = new N.c();
                }

                @Override
                public N.b g(int n8, N.b b8, boolean bl) {
                    N.b b9 = super.g(n8, b8, bl);
                    if (super.n(b9.c, this.f).f()) {
                        b9.u(b8.a, b8.b, b8.c, b8.d, b8.e, b.g, true);
                        return b9;
                    }
                    b9.f = true;
                    return b9;
                }
            };
        }
        return new L0(nArray2, this.m, g02);
    }

    List<N> F() {
        return Arrays.asList(this.l);
    }

    @Override
    public int i() {
        return this.i;
    }

    @Override
    public int p() {
        return this.h;
    }

    @Override
    protected int s(Object object) {
        if ((object = this.n.get(object)) == null) {
            return -1;
        }
        return (Integer)object;
    }

    @Override
    protected int t(int n8) {
        return d0.g(this.j, n8 + 1, false, false);
    }

    @Override
    protected int u(int n8) {
        return d0.g(this.k, n8 + 1, false, false);
    }

    @Override
    protected Object x(int n8) {
        return this.m[n8];
    }

    @Override
    protected int z(int n8) {
        return this.j[n8];
    }
}

