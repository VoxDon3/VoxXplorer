/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.Ha.c;
import ax.Z2.b;
import ax.b3.j;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.q;
import com.voxdon.xplorer.file.C;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.u;
import com.voxdon.xplorer.file.w;
import com.voxdon.xplorer.file.y;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class B
extends u {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<n> C(n object, m.f object2) throws j {
        InterruptedException interruptedException2;
        block6: {
            ExecutionException executionException2;
            block5: {
                if (!d0.E((n)object)) {
                    c.h().d("NF3L:").g(((n)object).E()).h();
                    throw new j("New files not reachable");
                }
                try {
                    object2 = w.C(this.p(), null);
                    if (object2 != null) {
                        ((q)object2).l();
                        return b.k().g((n)object);
                    }
                }
                catch (ExecutionException executionException2) {
                    break block5;
                }
                catch (InterruptedException interruptedException2) {
                    break block6;
                }
                object = new j("New files exception : scanTask");
                throw object;
            }
            executionException2.printStackTrace();
            c.h().d("NF2L").l(executionException2).h();
            throw new j("New files exception 2");
        }
        interruptedException2.printStackTrace();
        c.h().d("NF1L").l(interruptedException2).h();
        throw new j("New files exception 1");
    }

    @Override
    public String H(n n8) {
        if (n8 == null) {
            return null;
        }
        return ax.c3.B.W(n8);
    }

    @Override
    public void P(n n8) throws j {
        super.P(n8);
        u.V1(this, n8);
    }

    @Override
    protected boolean T1(n n8) {
        return true;
    }

    @Override
    public n z(String string) {
        return new C(this, new File(string), null);
    }

    @Override
    public y z0(File file, K k8, boolean bl) {
        return new C(this, file, k8);
    }
}

