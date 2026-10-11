package ax.d3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import ax.b3.C1495j;
import ax.u3.C3189g;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;

/* loaded from: classes.dex */
public class Q extends E {
    ax.Q2.f s2;
    boolean t2 = false;
    BroadcastReceiver u2 = new a();

    class a extends BroadcastReceiver {

        /* renamed from: ax.d3.Q$a$a, reason: collision with other inner class name */
        class RunnableC0277a implements Runnable {
            RunnableC0277a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Q.this.ta();
            }
        }

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i = Q.this.z3() == ax.Q2.f.v0 ? 0 : 1000;
            if (i > 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0277a(), i);
            } else {
                Q.this.ta();
            }
        }
    }

    private void ua() {
        if (A3().e() == null || !C3604x.C1(o3(), A3(), null)) {
            return;
        }
        if (z3() != ax.Q2.f.p0 || ax.t3.k.q(o3()) < 3) {
            n9(A3(), true);
        }
    }

    @Override // ax.d3.E
    protected String B7() {
        return A3().f(b());
    }

    @Override // ax.d3.E
    protected boolean K6() {
        C3605y c3605y = (C3605y) v7();
        if (c3605y == null) {
            return false;
        }
        return (ax.Z2.j.F().E0(c3605y.B0()) && ax.Q2.f.R(c3605y.R()) && c3605y.b1()) ? c3605y.j() || c3605y.d1() : super.K6();
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        ua();
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public boolean N3() {
        C3605y c3605y;
        if (!super.N3() || (c3605y = (C3605y) v7()) == null) {
            return false;
        }
        if (c3605y.B0() != null) {
            if (c3605y.B0() != ax.c3.K.h || c3605y.j() || ax.Z2.j.F().q()) {
                return (ax.Z2.j.F().E0(c3605y.B0()) && ax.Q2.f.R(c3605y.R()) && c3605y.b1() && !C3604x.t0(o3(), c3605y)) ? false : true;
            }
            return false;
        }
        ax.Ha.c.h().b("BASE LOCATION UNIT NULL").g("loc:" + c3605y.R() + ",path:" + c3605y.F()).h();
        return false;
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        if (z3() == ax.Q2.f.q0) {
            try {
                AbstractC3595n z = w7().z(A3().e());
                if (!z.n()) {
                    w7().k(z, true);
                }
            } catch (C1495j e) {
                e.printStackTrace();
            }
        }
        if (z3() == ax.Q2.f.v0 || z3() == ax.Q2.f.u0) {
            C3189g.a().d("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED", this.u2);
            this.t2 = true;
        }
    }

    void ta() {
        if (!X0() || ax.Z2.j.F().l0(A3())) {
            return;
        }
        h3();
        ((com.voxdon.xplorer.activity.b) f0()).a0(z3(), x3(), "usb_storage");
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (this.t2) {
            C3189g.a().h(this.u2);
            this.t2 = false;
        }
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        if (this.s2 == null) {
            this.s2 = (ax.Q2.f) j0().getSerializable("location");
        }
        return this.s2;
    }
}
