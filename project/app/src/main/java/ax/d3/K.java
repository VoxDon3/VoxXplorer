/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.os.Bundle;
import ax.Q2.f;
import ax.d3.E;
import ax.i3.a;
import com.alphainventor.filemanager.file.q;

public class K
extends E {
    @Override
    protected String B7() {
        return q.z0(this.o3()).f(this.x3()).b();
    }

    @Override
    public boolean R7() {
        return !q.D0(this.x3());
    }

    @Override
    protected void m8(boolean bl, Object object) {
        a.e(this.o3()).p(this.V());
        if (!this.X0()) {
            return;
        }
        this.c9(bl, object, q.z0(this.o3()).f(this.x3()).f());
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        a.e(this.o3()).a(this);
    }

    @Override
    public void q() {
        new E.p0(this).i(new String[0]);
    }

    @Override
    public void v1() {
        super.v1();
        a.e(this.o3()).o(this);
    }

    @Override
    public f z3() {
        return f.H0;
    }
}

