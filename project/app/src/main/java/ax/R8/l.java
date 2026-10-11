/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.Q8.D;
import ax.Q8.E;
import ax.Q8.g;
import ax.Q8.k;
import ax.Q8.m;
import ax.Q8.q;
import ax.S8.c;
import ax.S8.f;
import ax.Y8.c;
import ax.h9.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class l
extends q {
    private Set<g> e;
    private UUID f;
    private boolean g;
    private Set<k> h;
    private List<c> i;

    public l(Set<g> set, UUID uUID, boolean bl, Set<k> set2, byte[] byArray) {
        super(36, ax.Q8.g.c0, m.c0, 0L, 0L);
        this.e = set;
        this.f = uUID;
        this.g = bl;
        this.h = set2;
        this.i = this.n(byArray);
    }

    private List<c> n(byte[] byArray) {
        if (this.e.contains((Object)ax.Q8.g.i0)) {
            ArrayList<c> arrayList = new ArrayList<c>();
            arrayList.add(new f(Arrays.asList(E.d0), byArray));
            if (this.h.contains(k.i0)) {
                arrayList.add(new ax.S8.b(Arrays.asList(D.f0, D.e0)));
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    private void o(b b8) {
        if (ax.Q8.g.n(this.e)) {
            b8.u(c.a.e(this.h));
            return;
        }
        b8.Y();
    }

    private void p(b b8) {
        Iterator<g> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            b8.s(iterator.next().h());
        }
    }

    private void q(b b8) {
        if (this.e.contains((Object)ax.Q8.g.i0)) {
            for (int i8 = 0; i8 < this.i.size(); ++i8) {
                int n8 = this.i.get(i8).f(b8);
                if (i8 >= this.i.size() - 1 || (n8 %= 8) == 0) continue;
                b8.W(8 - n8);
            }
        }
    }

    private void r(b b8) {
        if (this.e.contains((Object)ax.Q8.g.i0)) {
            int n8 = this.c;
            int n9 = this.e.size();
            b8.u(this.c + 64 + this.e.size() * 2 + (8 - (n8 + n9 * 2) % 8));
            b8.s(this.i.size());
            b8.X();
            return;
        }
        b8.W(8);
    }

    private int s() {
        if (this.g) {
            return 2;
        }
        return 1;
    }

    @Override
    protected void m(b b8) {
        b8.s(this.c);
        b8.s(this.e.size());
        b8.s(this.s());
        b8.W(2);
        this.o(b8);
        ax.J8.c.b(this.f, b8);
        this.r(b8);
        this.p(b8);
        int n8 = (this.c + this.e.size() * 2) % 8;
        if (n8 > 0) {
            b8.W(8 - n8);
        }
        this.q(b8);
    }
}

