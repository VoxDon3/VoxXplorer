/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.E.c;
import ax.H.e;
import java.util.ArrayList;

public class m
extends e {
    public ArrayList<e> L0 = new ArrayList();

    public void c(e e8) {
        this.L0.add(e8);
        if (e8.K() != null) {
            ((m)e8.K()).t1(e8);
        }
        e8.c1(this);
    }

    public ArrayList<e> r1() {
        return this.L0;
    }

    public void s1() {
        Object object = this.L0;
        if (object != null) {
            int n8 = ((ArrayList)object).size();
            for (int i8 = 0; i8 < n8; ++i8) {
                object = this.L0.get(i8);
                if (!(object instanceof m)) continue;
                ((m)object).s1();
            }
        }
    }

    @Override
    public void t0() {
        this.L0.clear();
        super.t0();
    }

    public void t1(e e8) {
        this.L0.remove(e8);
        e8.t0();
    }

    public void u1() {
        this.L0.clear();
    }

    @Override
    public void w0(c c8) {
        super.w0(c8);
        int n8 = this.L0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.L0.get(i8).w0(c8);
        }
    }
}

