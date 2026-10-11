package ax.R8;

import ax.Q8.D;
import ax.Q8.E;
import ax.Y8.c;
import ax.h9.C2171b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public class l extends ax.Q8.q {
    private Set<ax.Q8.g> e;
    private UUID f;
    private boolean g;
    private Set<ax.Q8.k> h;
    private List<ax.S8.c> i;

    public l(Set<ax.Q8.g> set, UUID uuid, boolean z, Set<ax.Q8.k> set2, byte[] bArr) {
        super(36, ax.Q8.g.UNKNOWN, ax.Q8.m.SMB2_NEGOTIATE, 0L, 0L);
        this.e = set;
        this.f = uuid;
        this.g = z;
        this.h = set2;
        this.i = n(bArr);
    }

    private List<ax.S8.c> n(byte[] bArr) {
        if (!this.e.contains(ax.Q8.g.SMB_3_1_1)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ax.S8.f(Arrays.asList(E.SHA_512), bArr));
        if (this.h.contains(ax.Q8.k.SMB2_GLOBAL_CAP_ENCRYPTION)) {
            arrayList.add(new ax.S8.b(Arrays.asList(D.AES_128_GCM, D.AES_128_CCM)));
        }
        return arrayList;
    }

    private void o(C2171b c2171b) {
        if (ax.Q8.g.n(this.e)) {
            c2171b.u(c.a.e(this.h));
        } else {
            c2171b.Y();
        }
    }

    private void p(C2171b c2171b) {
        Iterator<ax.Q8.g> it = this.e.iterator();
        while (it.hasNext()) {
            c2171b.s(it.next().h());
        }
    }

    private void q(C2171b c2171b) {
        int i;
        if (this.e.contains(ax.Q8.g.SMB_3_1_1)) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                int f = this.i.get(i2).f(c2171b);
                if (i2 < this.i.size() - 1 && (i = f % 8) != 0) {
                    c2171b.W(8 - i);
                }
            }
        }
    }

    private void r(C2171b c2171b) {
        if (!this.e.contains(ax.Q8.g.SMB_3_1_1)) {
            c2171b.W(8);
            return;
        }
        c2171b.u(this.c + 64 + (this.e.size() * 2) + (8 - ((this.c + (this.e.size() * 2)) % 8)));
        c2171b.s(this.i.size());
        c2171b.X();
    }

    private int s() {
        return this.g ? 2 : 1;
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        c2171b.s(this.e.size());
        c2171b.s(s());
        c2171b.W(2);
        o(c2171b);
        ax.J8.c.b(this.f, c2171b);
        r(c2171b);
        p(c2171b);
        int size = (this.c + (this.e.size() * 2)) % 8;
        if (size > 0) {
            c2171b.W(8 - size);
        }
        q(c2171b);
    }
}
