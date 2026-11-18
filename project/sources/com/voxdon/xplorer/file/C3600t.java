package com.voxdon.xplorer.file;

import ax.T2.h;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.d0;
import com.voxdon.xplorer.file.AbstractC3594m;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.voxdon.xplorer.file.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3600t extends C3604x {
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
        List<h.C0194h> U = T.U();
        if (U == null) {
            throw new ax.b3.t();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<h.C0194h> it = U.iterator();
        while (it.hasNext()) {
            arrayList.add(z(T.z(it.next().a())));
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
        super.P(abstractC3595n);
        ax.T2.h S = ax.T2.h.S(ax.T2.h.q(t()));
        if (S.m0()) {
            List<h.C0194h> U = S.U();
            for (int i = 0; i < U.size(); i++) {
                if (S.z(U.get(i).a()).equals(abstractC3595n.E())) {
                    U.remove(i);
                    return;
                }
            }
        }
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) {
        return new C3605y(this, new File(str), (ax.c3.K) null);
    }
}
