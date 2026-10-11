package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import ax.u3.C3190h;
import ax.x3.C3420f;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.R;

/* renamed from: ax.a3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1353i extends androidx.fragment.app.e {
    private ax.Q2.f t0;

    /* renamed from: ax.a3.i$a */
    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        final /* synthetic */ C3420f b;

        a(C3420f c3420f) {
            this.b = c3420f;
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            if (C1353i.this.X0()) {
                C3420f.a item = this.b.getItem(i);
                if (C1353i.this.f0() instanceof MainActivity) {
                    ((MainActivity) C1353i.this.f0()).v1().a(item.a, item.b);
                }
            }
        }
    }

    public static C1353i d3() {
        C1353i c1353i = new C1353i();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", ax.Q2.f.M0);
        c1353i.v2(bundle);
        return c1353i;
    }

    public static C1353i e3() {
        C1353i c1353i = new C1353i();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LOCATION", ax.Q2.f.G0);
        c1353i.v2(bundle);
        return c1353i;
    }

    @Override // androidx.fragment.app.e
    public Dialog T2(Bundle bundle) {
        a.C0006a a2 = C3190h.a(f0());
        ax.Q2.f fVar = this.t0;
        ax.Q2.f fVar2 = ax.Q2.f.M0;
        C3420f a3 = fVar == fVar2 ? C3420f.a(a2.getContext()) : C3420f.b(a2.getContext());
        a2.a(a3, new a(a3));
        if (this.t0 == fVar2) {
            a2.p(R.string.dialog_title_add_cloud);
        } else {
            a2.p(R.string.dialog_title_add_remote);
        }
        a2.b(true);
        androidx.appcompat.app.a create = a2.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.t0 = (ax.Q2.f) j0().getSerializable("LOCATION");
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }
}
