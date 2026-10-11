package ax.a3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import ax.u3.C3190h;

/* renamed from: ax.a3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1358n extends I {
    int t0;
    int u0;
    int v0;
    int w0;
    boolean x0;
    boolean y0;
    c z0;

    /* renamed from: ax.a3.n$a */
    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        a() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            c m3 = C1358n.this.m3();
            if (m3 != null) {
                m3.P(C1358n.this);
            }
        }
    }

    /* renamed from: ax.a3.n$b */
    class b extends AbstractDialogInterfaceOnClickListenerC1363t {
        b() {
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            c m3 = C1358n.this.m3();
            if (m3 != null) {
                m3.Z(C1358n.this);
            }
        }
    }

    /* renamed from: ax.a3.n$c */
    public interface c {
        void G(C1358n c1358n);

        void P(C1358n c1358n);

        void Z(C1358n c1358n);
    }

    private Dialog j3(Context context) {
        a.C0006a a2 = C3190h.a(context);
        int i = this.t0;
        if (i != 0) {
            a2.p(i);
        }
        a2.e(this.u0);
        a2.setPositiveButton(this.v0, new a());
        int i2 = this.w0;
        if (i2 != 0) {
            a2.setNegativeButton(i2, new b());
        }
        androidx.appcompat.app.a create = a2.create();
        create.setCanceledOnTouchOutside(this.x0);
        create.setCancelable(this.y0);
        Y2(this.y0);
        return create;
    }

    public static C1358n k3(int i, int i2, int i3, int i4) {
        return l3(i, i2, i3, i4, true, true);
    }

    public static C1358n l3(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putInt("TITLE", i);
        bundle.putInt("MESSAGE", i2);
        bundle.putInt("POSITIVE", i3);
        bundle.putInt("NEGATIVE", i4);
        bundle.putBoolean("CANCELED_ON_TOUCHOUTSIDE", z);
        bundle.putBoolean("CANCELABLE", z2);
        C1358n c1358n = new C1358n();
        c1358n.v2(bundle);
        return c1358n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c m3() {
        c cVar = this.z0;
        if (cVar != null) {
            return cVar;
        }
        if (P0() instanceof c) {
            return (c) P0();
        }
        if (f0() instanceof c) {
            return (c) f0();
        }
        return null;
    }

    @Override // ax.a3.I
    public Dialog g3() {
        return j3(f0());
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.t0 = j0().getInt("TITLE");
        this.u0 = j0().getInt("MESSAGE");
        this.v0 = j0().getInt("POSITIVE");
        this.w0 = j0().getInt("NEGATIVE");
        this.x0 = j0().getBoolean("CANCELED_ON_TOUCHOUTSIDE", true);
        this.y0 = j0().getBoolean("CANCELABLE", true);
    }

    public void n3(c cVar) {
        this.z0 = cVar;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        c m3 = m3();
        if (m3 != null) {
            m3.G(this);
        }
    }
}
