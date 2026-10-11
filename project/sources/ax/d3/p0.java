package ax.d3;

import android.os.Bundle;
import android.widget.Toast;
import ax.a3.C1359o;
import ax.d3.E;
import ax.i3.C2265a;
import com.voxdon.xplorer.file.L;

/* loaded from: classes.dex */
public class p0 extends E {

    class a implements C1359o.e {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;
        final /* synthetic */ Object c;
        final /* synthetic */ ax.Z2.s d;

        a(String str, boolean z, Object obj, ax.Z2.s sVar) {
            this.a = str;
            this.b = z;
            this.c = obj;
            this.d = sVar;
        }

        @Override // ax.a3.C1359o.e
        public void a(boolean z) {
            if (p0.this.f0() == null) {
                return;
            }
            if (!z) {
                p0.this.c9(this.b, this.c, this.d.f());
            } else {
                com.voxdon.xplorer.file.L.A0(p0.this.o3()).p(p0.this.x3(), this.a);
                p0.this.X6();
            }
        }
    }

    @Override // ax.d3.E
    protected String B7() {
        return com.voxdon.xplorer.file.L.A0(o3()).f(x3()).b();
    }

    @Override // ax.d3.E
    protected void m8(boolean z, Object obj) {
        C2265a.e(o3()).p(V());
        if (X0()) {
            ax.Z2.s f = com.voxdon.xplorer.file.L.A0(o3()).f(x3());
            if (z || !(obj instanceof L.f)) {
                c9(z, obj, f.f());
                return;
            }
            L.f fVar = (L.f) obj;
            String e = fVar.e();
            String g = fVar.g();
            String f2 = fVar.f();
            if (!f1()) {
                C1359o l3 = C1359o.l3(f.c(), g, f2);
                l3.c3(A0(), "save_confirm");
                l3.m3(new a(e, z, obj, f));
            } else {
                String k3 = C1359o.k3(g, f2);
                if (f0() != null) {
                    Toast.makeText(f0(), k3, 1).show();
                }
            }
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
        return ax.Q2.f.I0;
    }
}
