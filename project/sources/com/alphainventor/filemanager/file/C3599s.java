package com.voxdon.xplorer.file;

import ax.T2.h;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.d0;
import com.voxdon.xplorer.file.AbstractC3594m;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.voxdon.xplorer.file.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3599s extends C3604x {
    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!d0.E(abstractC3595n)) {
            return super.C(abstractC3595n, fVar);
        }
        ax.T2.h T = ax.T2.h.T(abstractC3595n);
        if (!T.m0()) {
            try {
                T.f(true, null, null);
            } catch (C1486a e) {
                throw new C1495j("Cancelled", e);
            }
        }
        ArrayList arrayList = new ArrayList(T.V());
        ArrayList arrayList2 = new ArrayList();
        ax.c3.K q = ax.T2.h.q(abstractC3595n.L());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C3605y c3605y = new C3605y(this, new File(T.z(((h.C0194h) obj).a())), q);
            if (c3605y.n()) {
                arrayList2.add(c3605y);
            }
        }
        return arrayList2;
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
        long p = abstractC3595n.p();
        super.P(abstractC3595n);
        ax.T2.h S = ax.T2.h.S(ax.T2.h.q(t()));
        if (S.m0()) {
            List<h.C0194h> V = S.V();
            for (int i = 0; i < V.size(); i++) {
                if (S.z(V.get(i).a()).equals(abstractC3595n.E())) {
                    V.remove(i);
                    S.O0(p);
                    return;
                }
            }
        }
    }
}
