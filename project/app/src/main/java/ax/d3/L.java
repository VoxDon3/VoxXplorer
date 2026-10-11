/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import ax.Q2.a;
import ax.Q2.f;
import ax.X2.J;
import ax.X2.Q;
import ax.c3.u;
import ax.d3.E;
import ax.g3.c;
import ax.t3.j;
import ax.t3.k;
import ax.u3.o;
import com.alphainventor.filemanager.activity.MainActivity;
import com.alphainventor.filemanager.file.r;
import com.google.android.material.snackbar.Snackbar;

public class L
extends E {
    boolean s2 = false;
    private boolean t2;
    private int u2;
    private Snackbar v2;
    private Handler w2 = new Handler();

    private void ta() {
        if (Q.l0() && !o.f(this.o3())) {
            o.o(this, 22);
            return;
        }
        this.t2 = true;
    }

    private void ua() {
        this.t2 = true;
        if (this.X0()) {
            this.B9(true);
        }
        this.w2.postDelayed(new Runnable(this){
            final L q;
            {
                this.q = l8;
            }

            @Override
            public void run() {
                if (!this.q.X0()) {
                    return;
                }
                this.q.X6();
            }
        }, 3000L);
    }

    private void wa(boolean bl) {
        this.v2 = o.n(this.f0().findViewById(0x1020002), 2131952542, new c(this, bl){
            final boolean c;
            final L d;
            {
                this.d = l8;
                this.c = bl;
            }

            @Override
            public void a(View view) {
                if (!this.c) {
                    o.o(this.d, 22);
                    return;
                }
                o.m(this.d, 33);
            }
        });
    }

    @Override
    protected String B7() {
        return r.A0(this.o3()).f(this.x3()).b();
    }

    @Override
    protected void X6() {
        if (this.t2) {
            super.X6();
        }
    }

    @Override
    public void h1(Bundle bundle) {
        super.h1(bundle);
        this.ta();
    }

    @Override
    public void i1(int n8, int n9, Intent object) {
        super.i1(n8, n9, (Intent)object);
        if (n8 == 11) {
            if (n9 == -1) {
                this.v9(E.k0.q);
                this.X6();
                return;
            }
            this.B();
            if (object != null && object.getIntExtra("errorCode", -1) == 4 && J.D(this.o3())) {
                this.T(false, this.o3().getString(2131952345));
                return;
            }
            this.T(false, null);
            return;
        }
        if (n8 == 12) {
            if (n9 == -1 && object != null && object.getExtras() != null) {
                if ((object = object.getStringExtra("authAccount")) != null) {
                    r.A0(this.o3()).p(this.x3(), (String)object);
                    this.v9(E.k0.q);
                    this.X6();
                    return;
                }
                object = this.o3().getString(2131951797);
                this.B();
                this.T(false, object);
                return;
            }
            object = this.o3().getString(2131951797);
            this.B();
            this.T(false, object);
            return;
        }
        if (n8 == 33) {
            if (o.f(this.o3())) {
                this.ua();
                object = "details_granted";
            } else {
                this.wa(true);
                object = "details_denied";
            }
            a.i().m("permission", "account_permission_app_details").c("result", (String)object).e();
        }
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        if (this.s2) {
            this.s2 = false;
            ((MainActivity)activity).i2(this.z3(), this.x3());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void m8(boolean var1_1, Object var2_2) {
        block12: {
            block14: {
                block11: {
                    block13: {
                        if (!this.X0()) {
                            return;
                        }
                        if (!var1_1) break block13;
                        this.h9();
                        var2_2 = "success";
                        break block12;
                    }
                    if (var2_2 instanceof Intent) {
                        try {
                            this.v9(E.k0.c0);
                            u.r0(this, (Intent)var2_2, 11);
                            break block11;
                        }
                        catch (ActivityNotFoundException var2_3) {
                            this.J4(2131951927, 1);
                            this.i3("on_connect_result");
lbl16:
                            // 3 sources

                            while (true) {
                                var2_2 = "failure";
                                break block12;
                                break;
                            }
                        }
                    }
                    if (!(var2_2 instanceof r.f)) break block14;
                    try {
                        var2_2 = (r.f)var2_2;
                        this.v9(E.k0.c0);
                        u.r0(this, r.A0(this.o3()).n(var2_2.a), 12);
                    }
                    catch (ActivityNotFoundException var2_4) {
                        this.J4(2131951927, 1);
                        this.i3("on_connect_result");
                        ** GOTO lbl16
                    }
                }
                var2_2 = null;
                break block12;
            }
            if (var2_2 instanceof String) {
                this.I4((String)var2_2, 1);
            } else if (var2_2 instanceof Throwable && j.o(this.o3())) {
                var2_2 = (Throwable)var2_2;
                var3_5 = new StringBuilder();
                var3_5.append(this.N0(2131952325, new Object[]{f.O0}));
                var3_5.append(" : ");
                var3_5.append(var2_2.getMessage());
                this.I4(var3_5.toString(), 1);
            } else {
                this.K4(this.N0(2131952325, new Object[]{f.O0}), 1);
            }
            this.i3("on_connect_result");
            ** while (true)
        }
        if (var2_2 == null) return;
        a.i().m("network", "connect_cloud").c("loc", this.z3().I()).c("result", (String)var2_2).e();
    }

    @Override
    public void onRequestPermissionsResult(int n8, String[] object, int[] nArray) {
        if (n8 == 22) {
            if (o.g(nArray)) {
                k.y(this.b(), 1);
                this.ua();
                object = "granted";
            } else if (o.j(this)) {
                k.y(this.b(), 2);
                this.wa(false);
                object = "denied";
            } else {
                if (k.d(this.b()) != 3) {
                    k.y(this.b(), 3);
                    object = "blocked";
                } else {
                    object = null;
                }
                this.wa(true);
            }
            if (object != null) {
                object = a.i().m("permission", "account_permission").c("result", (String)object);
                n8 = this.u2;
                this.u2 = n8 + 1;
                ((a.b)object).b("count", n8).e();
            }
        }
    }

    @Override
    public void v1() {
        super.v1();
        Snackbar snackbar = this.v2;
        if (snackbar != null) {
            snackbar.x();
            this.v2 = null;
        }
    }

    public void va() {
        this.W0.setRootTitle(this.B7());
        if (this.f0() != null) {
            ((MainActivity)this.f0()).i2(this.z3(), this.x3());
            return;
        }
        this.s2 = true;
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (!bl) {
            this.ta();
            return;
        }
        Snackbar snackbar = this.v2;
        if (snackbar != null) {
            snackbar.x();
            this.v2 = null;
        }
    }

    @Override
    public f z3() {
        return f.O0;
    }
}

