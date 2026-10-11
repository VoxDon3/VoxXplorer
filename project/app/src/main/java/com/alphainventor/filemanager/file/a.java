/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.content.Context;
import ax.T2.h;
import ax.U2.d;
import ax.b3.j;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.x;
import java.util.ArrayList;
import java.util.List;

public class a
extends x {
    h A;
    K z;

    public static boolean U1(n n8) {
        return d.Q(d0.v(h.q(n8.L()), n8.E(), Boolean.TRUE));
    }

    @Override
    public List<n> C(n object, m.f object2) throws j {
        if (d0.E((n)object)) {
            if (!this.A.m0()) {
                try {
                    this.A.f(true, null, null);
                }
                catch (ax.b3.a a8) {
                    throw new j("Cancelled", a8);
                }
            }
            object2 = new ArrayList<h.h>(this.A.N());
            object = new ArrayList();
            int n8 = ((ArrayList)object2).size();
            int n9 = 0;
            while (n9 < n8) {
                Object object3 = ((ArrayList)object2).get(n9);
                int n10 = n9 + 1;
                object3 = (h.h)object3;
                n9 = n10;
                if (((h.h)object3).b() == 0L) continue;
                object.add(this.z(this.A.z(((h.h)object3).a())));
                n9 = n10;
            }
            return object;
        }
        return super.C((n)object, (m.f)((Object)object2));
    }

    @Override
    public String H(n n8) {
        if (n8 == null) {
            return null;
        }
        if (n8.isDirectory() && this.T1(n8)) {
            return B.S(this.z, n8);
        }
        return B.W(n8);
    }

    @Override
    public void P(n n8) throws j {
        long l8;
        int n9;
        boolean bl = n8.isDirectory();
        List<h.h> list = this.A.N();
        int n10 = 0;
        if ((bl = bl ? this.T1(n8) : false) && this.A.m0() && list != null) {
            for (n9 = 0; n9 < list.size(); ++n9) {
                h.h h8 = list.get(n9);
                if (!this.A.z(h8.a()).equals(n8.E())) continue;
                l8 = h8.b();
                break;
            }
        } else {
            l8 = 0L;
        }
        super.P(n8);
        if (bl && this.A.m0() && list != null) {
            for (n9 = n10; n9 < list.size(); ++n9) {
                if (!this.A.z(list.get(n9).a()).equals(n8.E())) continue;
                list.remove(n9);
                this.A.N0(l8);
                return;
            }
        }
    }

    boolean T1(n n8) {
        return d.Q(d0.v(this.z, n8.E(), Boolean.TRUE));
    }

    @Override
    public void W(Context object, K k8) {
        super.W((Context)object, k8);
        object = h.q(this.t());
        this.z = object;
        this.A = h.S((K)object);
    }
}

