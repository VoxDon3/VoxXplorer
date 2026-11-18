/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.T2.h;
import ax.b3.a;
import ax.b3.j;
import ax.c3.B;
import ax.c3.d0;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class t
extends x {
    @Override
    public List<n> C(n object, m.f object2) throws j {
        if (d0.E((n)object)) {
            Object object3;
            if (!((h)(object = h.T((n)object))).m0()) {
                try {
                    ((h)object).f(true, null, null);
                }
                catch (a a8) {
                    throw new j("Cancelled", a8);
                }
            }
            if ((object3 = ((h)object).U()) != null) {
                object2 = new ArrayList();
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    object2.add(this.z(((h)object).z(((h.h)object3.next()).a())));
                }
                return object2;
            }
            throw new ax.b3.t();
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
        super.P(n8);
        h h8 = h.S(h.q(this.t()));
        if (h8.m0()) {
            List<h.h> list = h8.U();
            for (int i8 = 0; i8 < list.size(); ++i8) {
                if (!h8.z(list.get(i8).a()).equals(n8.E())) continue;
                list.remove(i8);
                return;
            }
        }
    }

    @Override
    public n z(String string) {
        return new y((x)this, new File(string), null);
    }
}

