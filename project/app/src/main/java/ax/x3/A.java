/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.view.View;
import ax.n.c;
import ax.x3.d;

public class A
extends d {
    private View o;
    private View p;
    private View q;
    private View r;

    public A(c c8, View view, View view2) {
        super(c8, view, view2);
    }

    public int C() {
        View view = this.g(0);
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    public void D() {
        this.o = this.d(2131361926, 0x1040000, 2131231111, null);
        this.p = this.d(2131361938, 2131952283, 2131231117, null);
        this.q = this.d(2131361946, 2131952296, 2131231212, null);
        this.r = this.d(2131361947, 2131952299, 2131231127, null);
    }

    public void E(boolean bl, boolean bl2) {
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        if (bl) {
            this.q.setVisibility(0);
            if (bl2) {
                this.o(this.q.getId(), true);
                return;
            }
            this.o(this.q.getId(), false);
            return;
        }
        this.p.setVisibility(0);
        if (bl2) {
            this.o(this.p.getId(), true);
            return;
        }
        this.o(this.p.getId(), false);
    }

    public void F(boolean bl) {
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.r.setVisibility(0);
        if (bl) {
            this.o(this.r.getId(), true);
            return;
        }
        this.o(this.r.getId(), false);
    }
}

