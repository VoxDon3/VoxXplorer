/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import ax.Q2.f;
import ax.T2.h;
import ax.d3.E;
import com.alphainventor.filemanager.file.n;
import java.util.List;

public class z
extends E {
    f s2;

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
        return "None";
    }

    @Override
    protected boolean K8() {
        return false;
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.s7().t(2131361943, false);
        this.s7().t(2131361935, false);
        this.s7().t(2131361928, false);
        this.s7().t(2131361930, false);
        this.s7().d(2131361940, 2131952286, 2131231156, this.C1);
    }

    @Override
    public boolean N3() {
        return false;
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
    protected boolean ca() {
        return true;
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
    protected void k8(List<n> list) {
        super.k8(list);
        this.s7().o(2131361940, false);
    }

    @Override
    protected void l8(n n8) {
        super.l8(n8);
        this.s7().o(2131361940, true);
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
        if (this.s2 == null) {
            this.s2 = (f)((Object)this.j0().getSerializable("location"));
        }
        return this.s2;
    }
}

