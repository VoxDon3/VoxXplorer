package com.voxdon.xplorer.file;

import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1826n;
import ax.c3.d0;
import com.voxdon.xplorer.file.AbstractC3594m;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.voxdon.xplorer.file.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3593l extends C3604x {
    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!d0.E(abstractC3595n)) {
            return super.C(abstractC3595n, fVar);
        }
        ax.T2.h S = ax.T2.h.S(ax.T2.h.q(t()));
        if (!S.m0()) {
            try {
                S.f(true, null, null);
            } catch (C1486a e) {
                throw new C1495j("Cancelled", e);
            }
        }
        ax.T2.j L = u() == ax.Q2.f.m1 ? S.L() : S.I();
        if (L == null) {
            throw new ax.b3.t();
        }
        ArrayList arrayList = new ArrayList();
        ax.c3.K q = ax.T2.h.q(abstractC3595n.L());
        ArrayList arrayList2 = new ArrayList(L.a());
        for (int i = 0; i < arrayList2.size(); i++) {
            ArrayList arrayList3 = new ArrayList(((ax.T2.k) arrayList2.get(i)).b());
            int i2 = 0;
            while (i2 < arrayList3.size()) {
                A a = (A) arrayList3.get(i2);
                if (a != null) {
                    C1826n c1826n = new C1826n(this, new File(a.a), q, i, i2 == 0);
                    if (c1826n.n()) {
                        arrayList.add(c1826n);
                    }
                }
                i2++;
            }
        }
        return arrayList;
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return null;
        }
        return C1809B.W(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        ax.T2.j L;
        super.P(abstractC3595n);
        ax.T2.h S = ax.T2.h.S(ax.T2.h.q(t()));
        if (S.m0() && (L = S.L()) != null) {
            L.e(abstractC3595n.E());
            ax.T2.j I = S.I();
            if (I == null) {
                return;
            }
            I.e(abstractC3595n.E());
        }
    }
}
