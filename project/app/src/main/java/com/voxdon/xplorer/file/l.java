/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.Q2.f;
import ax.T2.h;
import ax.T2.j;
import ax.T2.k;
import ax.b3.a;
import ax.b3.t;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import com.voxdon.xplorer.file.A;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class l
extends x {
    @Override
    public List<n> C(n object, m.f object2) throws ax.b3.j {
        if (d0.E((n)object)) {
            object2 = h.S(h.q(this.t()));
            if (!((h)object2).m0()) {
                try {
                    ((h)object2).f(true, null, null);
                }
                catch (a a8) {
                    throw new ax.b3.j("Cancelled", a8);
                }
            }
            if ((object2 = this.u() == f.m1 ? ((h)object2).L() : ((h)object2).I()) != null) {
                ArrayList<n> arrayList = new ArrayList<n>();
                object = h.q(((n)object).L());
                ArrayList<k> arrayList2 = new ArrayList<k>(((j)object2).a());
                for (int i8 = 0; i8 < arrayList2.size(); ++i8) {
                    object2 = new ArrayList<A>(((k)arrayList2.get(i8)).b());
                    for (int i9 = 0; i9 < object2.size(); ++i9) {
                        Object object3 = (A)object2.get(i9);
                        if (object3 == null) continue;
                        object3 = new File(((A)object3).a);
                        boolean bl = i9 == 0;
                        object3 = new ax.c3.n(this, (File)object3, (K)object, i8, bl);
                        if (!((y)object3).n()) continue;
                        arrayList.add((n)object3);
                    }
                }
                return arrayList;
            }
            throw new t();
        }
        return super.C((n)object, (m.f)((Object)object2));
    }

    @Override
    public String H(n n8) {
        if (n8 == null) {
            return null;
        }
        return B.W(n8);
    }

    @Override
    public void P(n n8) throws ax.b3.j {
        Object object;
        block3: {
            block2: {
                j j8;
                super.P(n8);
                object = h.S(h.q(this.t()));
                if (!((h)object).m0() || (j8 = ((h)object).L()) == null) break block2;
                j8.e(n8.E());
                object = ((h)object).I();
                if (object != null) break block3;
            }
            return;
        }
        ((j)object).e(n8.E());
    }
}

