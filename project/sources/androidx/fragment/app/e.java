package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ax.i.DialogC2198n;

/* loaded from: classes.dex */
public class e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler d0;
    private boolean m0;
    private Dialog o0;
    private boolean p0;
    private boolean q0;
    private boolean r0;
    private Runnable e0 = new a();
    private DialogInterface.OnCancelListener f0 = new b();
    private DialogInterface.OnDismissListener g0 = new c();
    private int h0 = 0;
    private int i0 = 0;
    private boolean j0 = true;
    private boolean k0 = true;
    private int l0 = -1;
    private ax.G0.m<ax.G0.h> n0 = new d();
    private boolean s0 = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            e.this.g0.onDismiss(e.this.o0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (e.this.o0 != null) {
                e eVar = e.this;
                eVar.onCancel(eVar.o0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (e.this.o0 != null) {
                e eVar = e.this;
                eVar.onDismiss(eVar.o0);
            }
        }
    }

    class d implements ax.G0.m<ax.G0.h> {
        d() {
        }

        @Override // ax.G0.m
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ax.G0.h hVar) {
            if (hVar == null || !e.this.k0) {
                return;
            }
            View q2 = e.this.q2();
            if (q2.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (e.this.o0 != null) {
                if (FragmentManager.J0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + e.this.o0);
                }
                e.this.o0.setContentView(q2);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    class C0018e extends ax.A0.e {
        final /* synthetic */ ax.A0.e a;

        C0018e(ax.A0.e eVar) {
            this.a = eVar;
        }

        @Override // ax.A0.e
        public View c(int i) {
            return this.a.d() ? this.a.c(i) : e.this.U2(i);
        }

        @Override // ax.A0.e
        public boolean d() {
            return this.a.d() || e.this.V2();
        }
    }

    private void P2(boolean z, boolean z2, boolean z3) {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        this.r0 = false;
        Dialog dialog = this.o0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.o0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.d0.getLooper()) {
                    onDismiss(this.o0);
                } else {
                    this.d0.post(this.e0);
                }
            }
        }
        this.p0 = true;
        if (this.l0 >= 0) {
            if (z3) {
                A0().a1(this.l0, 1);
            } else {
                A0().Y0(this.l0, 1, z);
            }
            this.l0 = -1;
            return;
        }
        t o = A0().o();
        o.u(true);
        o.q(this);
        if (z3) {
            o.k();
        } else if (z) {
            o.j();
        } else {
            o.i();
        }
    }

    private void W2(Bundle bundle) {
        if (this.k0 && !this.s0) {
            try {
                this.m0 = true;
                Dialog T2 = T2(bundle);
                this.o0 = T2;
                if (this.k0) {
                    a3(T2, this.h0);
                    Context b2 = b();
                    if (b2 instanceof Activity) {
                        this.o0.setOwnerActivity((Activity) b2);
                    }
                    this.o0.setCancelable(this.j0);
                    this.o0.setOnCancelListener(this.f0);
                    this.o0.setOnDismissListener(this.g0);
                    this.s0 = true;
                } else {
                    this.o0 = null;
                }
                this.m0 = false;
            } catch (Throwable th) {
                this.m0 = false;
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        Dialog dialog = this.o0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.h0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.i0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.j0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.k0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.l0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        Dialog dialog = this.o0;
        if (dialog != null) {
            this.p0 = false;
            dialog.show();
            View decorView = this.o0.getWindow().getDecorView();
            ax.G0.w.a(decorView, this);
            ax.G0.x.a(decorView, this);
            ax.n2.e.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void K1() {
        super.K1();
        Dialog dialog = this.o0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M1(Bundle bundle) {
        Bundle bundle2;
        super.M1(bundle);
        if (this.o0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.o0.onRestoreInstanceState(bundle2);
    }

    public void N2() {
        P2(false, false, false);
    }

    public void O2() {
        P2(true, false, false);
    }

    public Dialog Q2() {
        return this.o0;
    }

    public boolean R2() {
        return this.k0;
    }

    public int S2() {
        return this.i0;
    }

    @Override // androidx.fragment.app.Fragment
    void T1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.T1(layoutInflater, viewGroup, bundle);
        if (this.I != null || this.o0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.o0.onRestoreInstanceState(bundle2);
    }

    public Dialog T2(Bundle bundle) {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC2198n(p2(), S2());
    }

    View U2(int i) {
        Dialog dialog = this.o0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    boolean V2() {
        return this.s0;
    }

    public final Dialog X2() {
        Dialog Q2 = Q2();
        if (Q2 != null) {
            return Q2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void Y2(boolean z) {
        this.j0 = z;
        Dialog dialog = this.o0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void Z2(boolean z) {
        this.k0 = z;
    }

    public void a3(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    ax.A0.e b0() {
        return new C0018e(super.b0());
    }

    public int b3(t tVar, String str) {
        this.q0 = false;
        this.r0 = true;
        tVar.e(this, str);
        this.p0 = false;
        int i = tVar.i();
        this.l0 = i;
        return i;
    }

    public void c3(FragmentManager fragmentManager, String str) {
        this.q0 = false;
        this.r0 = true;
        t o = fragmentManager.o();
        o.u(true);
        o.e(this, str);
        o.i();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void h1(Bundle bundle) {
        super.h1(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void k1(Context context) {
        super.k1(context);
        T0().i(this.n0);
        if (this.r0) {
            return;
        }
        this.q0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        this.d0 = new Handler();
        this.k0 = this.y == 0;
        if (bundle != null) {
            this.h0 = bundle.getInt("android:style", 0);
            this.i0 = bundle.getInt("android:theme", 0);
            this.j0 = bundle.getBoolean("android:cancelable", true);
            this.k0 = bundle.getBoolean("android:showsDialog", this.k0);
            this.l0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.p0) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        P2(true, true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void u1() {
        super.u1();
        Dialog dialog = this.o0;
        if (dialog != null) {
            this.p0 = true;
            dialog.setOnDismissListener(null);
            this.o0.dismiss();
            if (!this.q0) {
                onDismiss(this.o0);
            }
            this.o0 = null;
            this.s0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (!this.r0 && !this.q0) {
            this.q0 = true;
        }
        T0().m(this.n0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater w1(Bundle bundle) {
        LayoutInflater w1 = super.w1(bundle);
        if (this.k0 && !this.m0) {
            W2(bundle);
            if (FragmentManager.J0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.o0;
            if (dialog != null) {
                return w1.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.J0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.k0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return w1;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return w1;
    }
}
