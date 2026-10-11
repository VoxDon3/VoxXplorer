package ax.d3;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import ax.u3.C3189g;
import com.voxdon.xplorer.file.C3588g;
import com.voxdon.xplorer.R;

@TargetApi(23)
/* renamed from: ax.d3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1932t extends E {
    private int s2;
    BroadcastReceiver t2;

    /* renamed from: ax.d3.t$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC1932t.this.wa();
        }
    }

    /* renamed from: ax.d3.t$b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC1932t.this.s2 = 0;
            AbstractC1932t.this.za();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wa() {
        if (X0() && !xa()) {
            h3();
            ((com.voxdon.xplorer.activity.b) f0()).a0(z3(), x3(), z3().name());
        }
    }

    private boolean xa() {
        return ax.Z2.j.F().l0(A3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void za() {
        if (this.s2 < 5) {
            ya();
        } else {
            ((com.voxdon.xplorer.activity.a) f0()).L();
            i3("etc");
        }
    }

    @Override // ax.d3.E
    protected String B7() {
        return null;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void k1(Context context) {
        super.k1(context);
        this.t2 = new a();
        C3189g.a().d("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED", this.t2);
    }

    @Override // ax.d3.E
    protected void m8(boolean z, Object obj) {
        if (z) {
            h9();
            x9(null);
        } else {
            T9(R.string.error_access_denied, 0);
            x9(new b());
            za();
        }
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (this.t2 != null) {
            C3189g.a().h(this.t2);
            this.t2 = null;
        }
    }

    protected void ya() {
        if (((com.voxdon.xplorer.activity.a) f0()).M()) {
            return;
        }
        this.s2++;
        if (v3().d0() != this) {
            return;
        }
        if (ax.Q2.f.c0(z3())) {
            if (ax.Z2.j.F().Z(A3()) == null || C3588g.C(o3(), A3(), null)) {
                return;
            }
            n9(A3(), false);
            return;
        }
        if (ax.Q2.f.h1 != z3() || C3588g.C(o3(), A3(), null)) {
            return;
        }
        n9(A3(), false);
    }
}
