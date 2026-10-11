package ax.d3;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import ax.Q2.a;
import ax.c3.C1832u;
import ax.d3.E;
import ax.u3.C3197o;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.file.r;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public class L extends E {
    private boolean t2;
    private int u2;
    private Snackbar v2;
    boolean s2 = false;
    private Handler w2 = new Handler();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (L.this.X0()) {
                L.this.X6();
            }
        }
    }

    class b extends ax.g3.c {
        final /* synthetic */ boolean c;

        b(boolean z) {
            this.c = z;
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (this.c) {
                C3197o.m(L.this, 33);
            } else {
                C3197o.o(L.this, 22);
            }
        }
    }

    private void ta() {
        if (!ax.X2.Q.l0() || C3197o.f(o3())) {
            this.t2 = true;
        } else {
            C3197o.o(this, 22);
        }
    }

    private void ua() {
        this.t2 = true;
        if (X0()) {
            B9(true);
        }
        this.w2.postDelayed(new a(), 3000L);
    }

    private void wa(boolean z) {
        this.v2 = C3197o.n(f0().findViewById(R.id.content), com.voxdon.xplorer.R.string.request_account_permissions, new b(z));
    }

    @Override // ax.d3.E
    protected String B7() {
        return com.voxdon.xplorer.file.r.A0(o3()).f(x3()).b();
    }

    @Override // ax.d3.E
    protected void X6() {
        if (this.t2) {
            super.X6();
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void h1(Bundle bundle) {
        super.h1(bundle);
        ta();
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void i1(int i, int i2, Intent intent) {
        String str;
        super.i1(i, i2, intent);
        if (i == 11) {
            if (i2 == -1) {
                v9(E.k0.NOT_CONNECTED);
                X6();
                return;
            }
            B();
            if (intent != null && intent.getIntExtra("errorCode", -1) == 4 && ax.X2.J.D(o3())) {
                T(false, o3().getString(com.voxdon.xplorer.R.string.msg_googledrive_not_allowed_on_tv));
                return;
            } else {
                T(false, null);
                return;
            }
        }
        if (i != 12) {
            if (i == 33) {
                if (C3197o.f(o3())) {
                    ua();
                    str = "details_granted";
                } else {
                    wa(true);
                    str = "details_denied";
                }
                ax.Q2.a.i().m("permission", "account_permission_app_details").c("result", str).e();
                return;
            }
            return;
        }
        if (i2 != -1 || intent == null || intent.getExtras() == null) {
            String string = o3().getString(com.voxdon.xplorer.R.string.could_not_access_account);
            B();
            T(false, string);
            return;
        }
        String stringExtra = intent.getStringExtra("authAccount");
        if (stringExtra != null) {
            com.voxdon.xplorer.file.r.A0(o3()).p(x3(), stringExtra);
            v9(E.k0.NOT_CONNECTED);
            X6();
        } else {
            String string2 = o3().getString(com.voxdon.xplorer.R.string.could_not_access_account);
            B();
            T(false, string2);
        }
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        if (this.s2) {
            this.s2 = false;
            ((MainActivity) activity).i2(z3(), x3());
        }
    }

    @Override // ax.d3.E
    protected void m8(boolean z, Object obj) {
        String str;
        if (X0()) {
            if (z) {
                h9();
                str = "success";
            } else {
                if (obj instanceof Intent) {
                    try {
                        v9(E.k0.CONNECTING);
                        C1832u.r0(this, (Intent) obj, 11);
                    } catch (ActivityNotFoundException unused) {
                        J4(com.voxdon.xplorer.R.string.error, 1);
                        i3("on_connect_result");
                    }
                } else {
                    if (obj instanceof r.f) {
                        try {
                            v9(E.k0.CONNECTING);
                            C1832u.r0(this, com.voxdon.xplorer.file.r.A0(o3()).n(((r.f) obj).a), 12);
                        } catch (ActivityNotFoundException unused2) {
                            J4(com.voxdon.xplorer.R.string.error, 1);
                            i3("on_connect_result");
                        }
                    } else {
                        if (obj instanceof String) {
                            I4((String) obj, 1);
                        } else if ((obj instanceof Throwable) && ax.t3.j.o(o3())) {
                            I4(N0(com.voxdon.xplorer.R.string.msg_connection_failed, ax.Q2.f.O0) + " : " + ((Throwable) obj).getMessage(), 1);
                        } else {
                            K4(N0(com.voxdon.xplorer.R.string.msg_connection_failed, ax.Q2.f.O0), 1);
                        }
                        i3("on_connect_result");
                    }
                    str = "failure";
                }
                str = null;
            }
            if (str != null) {
                ax.Q2.a.i().m("network", "connect_cloud").c("loc", z3().I()).c("result", str).e();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str;
        if (i != 22) {
            return;
        }
        if (C3197o.g(iArr)) {
            ax.t3.k.y(b(), 1);
            ua();
            str = "granted";
        } else if (C3197o.j(this)) {
            ax.t3.k.y(b(), 2);
            wa(false);
            str = "denied";
        } else {
            if (ax.t3.k.d(b()) != 3) {
                ax.t3.k.y(b(), 3);
                str = "blocked";
            } else {
                str = null;
            }
            wa(true);
        }
        if (str != null) {
            a.b c = ax.Q2.a.i().m("permission", "account_permission").c("result", str);
            int i2 = this.u2;
            this.u2 = i2 + 1;
            c.b("count", i2).e();
        }
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        Snackbar snackbar = this.v2;
        if (snackbar != null) {
            snackbar.x();
            this.v2 = null;
        }
    }

    public void va() {
        this.W0.setRootTitle(B7());
        if (f0() != null) {
            ((MainActivity) f0()).i2(z3(), x3());
        } else {
            this.s2 = true;
        }
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void x1(boolean z) {
        super.x1(z);
        if (!z) {
            ta();
            return;
        }
        Snackbar snackbar = this.v2;
        if (snackbar != null) {
            snackbar.x();
            this.v2 = null;
        }
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.O0;
    }
}
