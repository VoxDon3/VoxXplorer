package com.voxdon.xplorer.file;

import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.d0;
import com.voxdon.xplorer.file.AbstractC3594m;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class B extends C3601u {
    @Override // com.voxdon.xplorer.file.C3601u, com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!d0.E(abstractC3595n)) {
            ax.Ha.c.h().d("NF3L:").g(abstractC3595n.E()).h();
            throw new C1495j("New files not reachable");
        }
        try {
            C3603w C = C3603w.C(p(), null);
            if (C == null) {
                throw new C1495j("New files exception : scanTask");
            }
            C.l();
            return ax.Z2.b.k().g(abstractC3595n);
        } catch (InterruptedException e) {
            e.printStackTrace();
            ax.Ha.c.h().d("NF1L").l(e).h();
            throw new C1495j("New files exception 1");
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            ax.Ha.c.h().d("NF2L").l(e2).h();
            throw new C1495j("New files exception 2");
        }
    }

    @Override // com.voxdon.xplorer.file.C3601u, com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return null;
        }
        return C1809B.W(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.C3601u, com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        super.P(abstractC3595n);
        C3601u.V1(this, abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.C3601u
    protected boolean T1(AbstractC3595n abstractC3595n) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.C3601u, com.voxdon.xplorer.file.C3604x, com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) {
        return new C(this, new File(str), null);
    }

    @Override // com.voxdon.xplorer.file.C3601u, com.voxdon.xplorer.file.C3604x
    public C3605y z0(File file, ax.c3.K k, boolean z) {
        return new C(this, file, k);
    }
}
