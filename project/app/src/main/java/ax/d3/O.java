/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import ax.Q2.f;
import ax.T2.h;
import ax.d3.E;

public class O
extends E {
    @Override
    protected String B7() {
        return this.A3().f(this.b());
    }

    @Override
    protected boolean C7() {
        return false;
    }

    @Override
    protected String G7(String string) {
        return "RecursiveDown";
    }

    @Override
    protected boolean K8() {
        return false;
    }

    @Override
    public boolean N3() {
        return false;
    }

    @Override
    protected boolean R9() {
        return true;
    }

    @Override
    protected boolean Y9(String string) {
        return true;
    }

    @Override
    public void c4(boolean bl) {
        this.ta().n();
        super.c4(bl);
    }

    @Override
    protected boolean fa() {
        return true;
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        this.ta().J0();
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689500);
    }

    h ta() {
        return h.S(h.q(this.x3()));
    }

    @Override
    public void v1() {
        super.v1();
        this.ta().G0();
    }

    @Override
    public f z3() {
        return f.k1;
    }
}

