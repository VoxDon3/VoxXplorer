package com.voxdon.xplorer.file;

import android.content.Context;
import ax.T2.h;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.d0;
import com.voxdon.xplorer.file.AbstractC3594m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.voxdon.xplorer.file.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3582a extends C3604x {
    ax.T2.h A;
    ax.c3.K z;

    public static boolean U1(AbstractC3595n abstractC3595n) {
        return ax.U2.d.Q(d0.v(ax.T2.h.q(abstractC3595n.L()), abstractC3595n.E(), Boolean.TRUE));
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!d0.E(abstractC3595n)) {
            return super.C(abstractC3595n, fVar);
        }
        if (!this.A.m0()) {
            try {
                this.A.f(true, null, null);
            } catch (C1486a e) {
                throw new C1495j("Cancelled", e);
            }
        }
        ArrayList arrayList = new ArrayList(this.A.N());
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h.C0194h c0194h = (h.C0194h) obj;
            if (c0194h.b() != 0) {
                arrayList2.add(z(this.A.z(c0194h.a())));
            }
        }
        return arrayList2;
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return null;
        }
        return (abstractC3595n.isDirectory() && T1(abstractC3595n)) ? C1809B.S(this.z, abstractC3595n) : C1809B.W(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        long j;
        boolean isDirectory = abstractC3595n.isDirectory();
        List<h.C0194h> N = this.A.N();
        boolean T1 = isDirectory ? T1(abstractC3595n) : false;
        if (T1 && this.A.m0() && N != null) {
            for (int i = 0; i < N.size(); i++) {
                h.C0194h c0194h = N.get(i);
                if (this.A.z(c0194h.a()).equals(abstractC3595n.E())) {
                    j = c0194h.b();
                    break;
                }
            }
        }
        j = 0;
        super.P(abstractC3595n);
        if (T1 && this.A.m0() && N != null) {
            for (int i2 = 0; i2 < N.size(); i2++) {
                if (this.A.z(N.get(i2).a()).equals(abstractC3595n.E())) {
                    N.remove(i2);
                    this.A.N0(j);
                    return;
                }
            }
        }
    }

    boolean T1(AbstractC3595n abstractC3595n) {
        return ax.U2.d.Q(d0.v(this.z, abstractC3595n.E(), Boolean.TRUE));
    }

    @Override // com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.AbstractC3594m
    public void W(Context context, ax.c3.K k) {
        super.W(context, k);
        ax.c3.K q = ax.T2.h.q(t());
        this.z = q;
        this.A = ax.T2.h.S(q);
    }
}
