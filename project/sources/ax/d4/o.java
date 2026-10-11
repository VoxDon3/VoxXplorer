package ax.d4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashSet;

/* loaded from: classes.dex */
public class o extends Fragment {
    private final C1939a d0;
    private final m e0;
    private final HashSet<o> f0;
    private o g0;
    private ax.J3.j h0;
    private Fragment i0;

    private class a implements m {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new C1939a());
    }

    private void K2(o oVar) {
        this.f0.add(oVar);
    }

    private Fragment M2() {
        Fragment z0 = z0();
        return z0 != null ? z0 : this.i0;
    }

    private void P2(androidx.fragment.app.f fVar) {
        T2();
        o h = ax.J3.c.c(fVar).k().h(fVar.getSupportFragmentManager(), null);
        this.g0 = h;
        if (h != this) {
            h.K2(this);
        }
    }

    private void Q2(o oVar) {
        this.f0.remove(oVar);
    }

    private void T2() {
        o oVar = this.g0;
        if (oVar != null) {
            oVar.Q2(this);
            this.g0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        this.d0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void K1() {
        super.K1();
        this.d0.e();
    }

    C1939a L2() {
        return this.d0;
    }

    public ax.J3.j N2() {
        return this.h0;
    }

    public m O2() {
        return this.e0;
    }

    void R2(Fragment fragment) {
        this.i0 = fragment;
        if (fragment == null || fragment.f0() == null) {
            return;
        }
        P2(fragment.f0());
    }

    public void S2(ax.J3.j jVar) {
        this.h0 = jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void k1(Context context) {
        super.k1(context);
        try {
            P2(f0());
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        this.d0.c();
        T2();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + M2() + "}";
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        this.i0 = null;
        T2();
    }

    @SuppressLint({"ValidFragment"})
    public o(C1939a c1939a) {
        this.e0 = new a();
        this.f0 = new HashSet<>();
        this.d0 = c1939a;
    }
}
