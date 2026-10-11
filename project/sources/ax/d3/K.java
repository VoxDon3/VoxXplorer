package ax.d3;

import android.os.Bundle;
import ax.d3.E;
import ax.i3.C2265a;
import com.voxdon.xplorer.file.C3598q;

/* loaded from: classes.dex */
public class K extends E {
    @Override // ax.d3.E
    protected String B7() {
        return C3598q.z0(o3()).f(x3()).b();
    }

    @Override // ax.d3.E
    public boolean R7() {
        return !C3598q.D0(x3());
    }

    @Override // ax.d3.E
    protected void m8(boolean z, Object obj) {
        C2265a.e(o3()).p(V());
        if (X0()) {
            c9(z, obj, C3598q.z0(o3()).f(x3()).f());
        }
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        C2265a.e(o3()).a(this);
    }

    @Override // ax.d3.E, ax.g3.f
    public void q() {
        new E.p0().i(new String[0]);
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        C2265a.e(o3()).o(this);
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.H0;
    }
}
