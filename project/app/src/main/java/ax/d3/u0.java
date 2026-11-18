/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ax.Q2.f;
import ax.Q2.o;
import ax.Z2.j;
import ax.d3.E;
import ax.u3.g;
import com.voxdon.xplorer.activity.b;
import com.voxdon.xplorer.file.n;

public class u0
extends E {
    BroadcastReceiver s2;

    @Override
    protected String B7() {
        return this.A3().f(this.b());
    }

    @Override
    public void H1() {
        o.i().n();
        super.H1();
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        this.s2 = new BroadcastReceiver(this){
            final u0 a;
            {
                this.a = u02;
            }

            public void onReceive(Context context, Intent intent) {
                if (!j.F().l0(this.a.A3()) && this.a.X0()) {
                    this.a.h3();
                    ((b)this.a.f0()).a0(this.a.z3(), this.a.x3(), "usb_storage");
                }
            }
        };
        g.a().d("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED", this.s2);
    }

    @Override
    protected void l8(n n8) {
        super.l8(n8);
        this.s7().t(2131362504, false);
    }

    @Override
    protected void m8(boolean bl, Object object) {
        if (!this.X0()) {
            return;
        }
        if (bl) {
            this.h9();
            return;
        }
        if (object instanceof String) {
            this.K4((String)object, 1);
        } else {
            this.K4(this.N0(2131952325, this.A3().f((Context)this.f0())), 1);
        }
        this.i3("on_connect_result");
    }

    @Override
    public void v1() {
        super.v1();
        if (this.s2 != null) {
            g.a().h(this.s2);
            this.s2 = null;
        }
    }

    @Override
    public f z3() {
        return f.b1;
    }
}

