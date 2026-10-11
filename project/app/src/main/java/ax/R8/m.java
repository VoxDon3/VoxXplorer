/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.g;
import ax.Q8.k;
import ax.Q8.q;
import ax.S8.c;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class m
extends q {
    private int e;
    private g f;
    private UUID g;
    private Set<k> h = EnumSet.noneOf(k.class);
    private int i;
    private int j;
    private int k;
    private ax.J8.b l;
    private ax.J8.b m;
    private byte[] n;
    private List<c> o;

    private int w(a<?> a8) throws a.b {
        if (this.f == ax.Q8.g.i0) {
            return a8.J();
        }
        a8.U(2);
        return 0;
    }

    private List<c> x(b b8, int n8, int n9) {
        if (this.f == ax.Q8.g.i0) {
            a.b b92;
            block5: {
                b8.T(n8);
                ArrayList<c> arrayList = new ArrayList<c>();
                for (n8 = 0; n8 < n9; ++n8) {
                    try {
                        arrayList.add(ax.S8.c.a(b8));
                        continue;
                    }
                    catch (a.b b92) {
                        break block5;
                    }
                }
                return arrayList;
            }
            throw new IllegalArgumentException("unknown error when parse negotiateContext", b92);
        }
        return Collections.EMPTY_LIST;
    }

    private int y(b b8) throws a.b {
        if (this.f == ax.Q8.g.i0) {
            return b8.J();
        }
        b8.U(2);
        return 0;
    }

    private byte[] z(b b8, int n8, int n9) throws a.b {
        if (n9 > 0) {
            b8.T(n8);
            return b8.G(n9);
        }
        return new byte[0];
    }

    @Override
    protected void j(b b8) throws a.b {
        b8.U(2);
        this.e = b8.J();
        this.f = ax.Q8.g.l(b8.J());
        int n8 = this.w(b8);
        this.g = ax.J8.c.d(b8);
        this.h = c.a.d(b8.N(), k.class);
        this.i = b8.P();
        this.j = b8.P();
        this.k = b8.P();
        this.l = ax.J8.c.c(b8);
        this.m = ax.J8.c.c(b8);
        int n9 = b8.J();
        int n10 = b8.J();
        int n11 = this.y(b8);
        this.n = this.z(b8, n9, n10);
        this.o = this.x(b8, n11, n8);
    }

    public Set<k> n() {
        return this.h;
    }

    public g o() {
        return this.f;
    }

    public int p() {
        return this.j;
    }

    public int q() {
        return this.i;
    }

    public int r() {
        return this.k;
    }

    public List<c> s() {
        return this.o;
    }

    public int t() {
        return this.e;
    }

    public UUID u() {
        return this.g;
    }

    public ax.J8.b v() {
        return this.l;
    }
}

