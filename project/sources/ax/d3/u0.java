package ax.d3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ax.u3.C3189g;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class u0 extends E {
    BroadcastReceiver s2;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ax.Z2.j.F().l0(u0.this.A3()) || !u0.this.X0()) {
                return;
            }
            u0.this.h3();
            ((com.voxdon.xplorer.activity.b) u0.this.f0()).a0(u0.this.z3(), u0.this.x3(), "usb_storage");
        }
    }

    @Override // ax.d3.E
    protected String B7() {
        return A3().f(b());
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        ax.Q2.o.i().n();
        super.H1();
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.s2 = new a();
        C3189g.a().d("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED", this.s2);
    }

    @Override // ax.d3.E
    protected void l8(AbstractC3595n abstractC3595n) {
        super.l8(abstractC3595n);
        s7().t(R.id.menu_bookmark, false);
    }

    @Override // ax.d3.E
    protected void m8(boolean z, Object obj) {
        if (X0()) {
            if (z) {
                h9();
                return;
            }
            if (obj instanceof String) {
                K4((String) obj, 1);
            } else {
                K4(N0(R.string.msg_connection_failed, A3().f(f0())), 1);
            }
            i3("on_connect_result");
        }
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (this.s2 != null) {
            C3189g.a().h(this.s2);
            this.s2 = null;
        }
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.b1;
    }
}
