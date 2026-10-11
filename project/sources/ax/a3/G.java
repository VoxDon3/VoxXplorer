package ax.a3;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import ax.c3.C1832u;
import ax.u3.C3180B;
import ax.u3.C3184b;
import com.voxdon.xplorer.R;

@TargetApi(21)
/* loaded from: classes.dex */
public class G extends androidx.fragment.app.e {
    private boolean t0;
    private int u0;
    private ax.c3.K v0;
    private String w0;

    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        final /* synthetic */ boolean b;

        a(boolean z) {
            this.b = z;
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            if (this.b) {
                ax.t3.k.s(G.this.b());
            }
        }
    }

    class b implements DialogInterface.OnShowListener {
        final /* synthetic */ androidx.appcompat.app.a a;

        class a extends ax.g3.c {
            a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                if (G.this.f0() != null && !((com.voxdon.xplorer.activity.a) G.this.f0()).U(G.this.v0, G.this.w0)) {
                    G g = G.this;
                    if (!g.f3(g.f0())) {
                        G g2 = G.this;
                        g2.i3(g2.f0());
                        return;
                    }
                }
                G.this.O2();
            }
        }

        b(androidx.appcompat.app.a aVar) {
            this.a = aVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.a.i(-1).setOnClickListener(new a());
        }
    }

    private boolean g3() {
        ax.c3.K k = this.v0;
        if (k == null) {
            return true;
        }
        return ax.Q2.f.t0(k.d());
    }

    private boolean h3() {
        ax.c3.K k = this.v0;
        if (k == null) {
            return false;
        }
        return ax.Q2.f.x0(k.d());
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        View findViewById;
        super.H1();
        if (Q2() == null || Q2().getWindow() == null || (findViewById = Q2().getWindow().findViewById(R.id.hint_steps_0)) == null || findViewById.getVisibility() != 0 || !f3(f0())) {
            return;
        }
        findViewById.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0227  */
    @Override // androidx.fragment.app.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Dialog T2(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a3.G.T2(android.os.Bundle):android.app.Dialog");
    }

    boolean f3(Context context) {
        if (ax.X2.Q.L0()) {
            try {
                return context.getPackageManager().getApplicationInfo("com.google.android.documentsui", 0).enabled;
            } catch (Exception unused) {
            }
        }
        try {
            return context.getPackageManager().getApplicationInfo("com.android.documentsui", 0).enabled;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    void i3(Context context) {
        String str = null;
        if (ax.X2.Q.L0()) {
            try {
                str = context.getPackageManager().getApplicationInfo("com.google.android.documentsui", 0).enabled ? null : "com.google.android.documentsui";
            } catch (Exception unused) {
            }
        }
        if (str == null) {
            str = "com.android.documentsui";
        }
        try {
            C1832u.p0(this, C1832u.d(str));
        } catch (ActivityNotFoundException unused2) {
            C3180B.S(f0().findViewById(android.R.id.content), R.string.no_application, 0).a0();
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        ax.Q2.f fVar;
        super.n1(bundle);
        int i = 0;
        if (j0() != null) {
            this.u0 = j0().getInt("ERROR_CAUSE", 0);
            this.t0 = j0().getBoolean("SHOW_CANCEL", true);
            fVar = (ax.Q2.f) j0().getSerializable("LOCATION");
            i = j0().getInt("LOCATION_KEY");
            this.w0 = j0().getString("TREE_PATH");
            if (fVar == null) {
                ax.Ha.c.h().b("INVALID DOCUMENT TREE LOCATION").g("location:" + fVar).h();
            }
        } else {
            this.u0 = 0;
            fVar = ax.Q2.f.p0;
        }
        if (fVar != null) {
            this.v0 = ax.c3.K.a(fVar, i);
        } else {
            C3184b.f();
        }
    }
}
