/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import ax.Ha.c;
import ax.Q2.f;
import ax.b3.j;
import ax.c3.K;
import ax.d3.E;
import ax.t3.k;
import ax.u3.g;
import com.voxdon.xplorer.activity.b;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;

public class Q
extends E {
    f s2;
    boolean t2 = false;
    BroadcastReceiver u2 = new BroadcastReceiver(this){
        final Q a;
        {
            this.a = q8;
        }

        public void onReceive(Context context, Intent intent) {
            int n8 = this.a.z3() == f.v0 ? 0 : 1000;
            if (n8 > 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
                    final a q;
                    {
                        this.q = a8;
                    }

                    @Override
                    public void run() {
                        this.q.a.ta();
                    }
                }, (long)n8);
                return;
            }
            this.a.ta();
        }
    };

    private void ua() {
        if (this.A3().e() != null && x.C1(this.o3(), this.A3(), null) && (this.z3() != f.p0 || k.q(this.o3()) < 3)) {
            this.n9(this.A3(), true);
        }
    }

    @Override
    protected String B7() {
        return this.A3().f(this.b());
    }

    @Override
    protected boolean K6() {
        y y8 = (y)this.v7();
        if (y8 == null) {
            return false;
        }
        if (ax.Z2.j.F().E0(y8.B0()) && f.R(y8.R()) && y8.b1()) {
            return y8.j() || y8.d1();
            {
            }
        }
        return super.K6();
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.ua();
    }

    @Override
    public boolean N3() {
        if (!super.N3()) {
            return false;
        }
        y y8 = (y)this.v7();
        if (y8 == null) {
            return false;
        }
        if (y8.B0() == null) {
            ax.Ha.b b8 = c.h().b("BASE LOCATION UNIT NULL");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("loc:");
            stringBuilder.append(y8.R());
            stringBuilder.append(",path:");
            stringBuilder.append(y8.F());
            b8.g(stringBuilder.toString()).h();
            return false;
        }
        if (y8.B0() == K.h && !y8.j() && !ax.Z2.j.F().q()) {
            return false;
        }
        if (ax.Z2.j.F().E0(y8.B0()) && f.R(y8.R()) && y8.b1()) {
            return x.t0(this.o3(), y8);
        }
        return true;
    }

    @Override
    public void j1(Activity object) {
        super.j1((Activity)object);
        if (this.z3() == f.q0) {
            try {
                object = this.w7().z(this.A3().e());
                if (!object.n()) {
                    this.w7().k((n)object, true);
                }
            }
            catch (j j8) {
                j8.printStackTrace();
            }
        }
        if (this.z3() == f.v0 || this.z3() == f.u0) {
            g.a().d("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED", this.u2);
            this.t2 = true;
        }
    }

    void ta() {
        if (this.X0() && !ax.Z2.j.F().l0(this.A3())) {
            this.h3();
            ((b)this.f0()).a0(this.z3(), this.x3(), "usb_storage");
        }
    }

    @Override
    public void v1() {
        super.v1();
        if (this.t2) {
            g.a().h(this.u2);
            this.t2 = false;
        }
    }

    @Override
    public f z3() {
        if (this.s2 == null) {
            this.s2 = (f)((Object)this.j0().getSerializable("location"));
        }
        return this.s2;
    }
}

