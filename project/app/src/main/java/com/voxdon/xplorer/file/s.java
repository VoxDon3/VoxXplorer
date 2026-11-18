/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.T2.h;
import ax.b3.a;
import ax.b3.j;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class s
extends x {
    @Override
    public List<n> C(n object, m.f object2) throws j {
        if (d0.E((n)object)) {
            object2 = h.T((n)object);
            if (!((h)object2).m0()) {
                try {
                    ((h)object2).f(true, null, null);
                }
                catch (a a8) {
                    throw new j("Cancelled", a8);
                }
            }
            ArrayList<h.h> arrayList = new ArrayList<h.h>(((h)object2).V());
            ArrayList<n> arrayList2 = new ArrayList<n>();
            object = h.q(((n)object).L());
            int n8 = arrayList.size();
            int n9 = 0;
            while (n9 < n8) {
                Object object3 = arrayList.get(n9);
                int n10 = n9 + 1;
                object3 = new y((x)this, new File(((h)object2).z(((h.h)object3).a())), (K)object);
                n9 = n10;
                if (!((y)object3).n()) continue;
                arrayList2.add((n)object3);
                n9 = n10;
            }
            return arrayList2;
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
    public void P(n n8) throws j {
        long l8 = n8.p();
        super.P(n8);
        h h8 = h.S(h.q(this.t()));
        if (h8.m0()) {
            List<h.h> list = h8.V();
            for (int i8 = 0; i8 < list.size(); ++i8) {
                if (!h8.z(list.get(i8).a()).equals(n8.E())) continue;
                list.remove(i8);
                h8.O0(l8);
                return;
            }
        }
    }
}

