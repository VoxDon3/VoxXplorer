/*
 * Decompiled with CFR 0.152.
 */
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.t;
import ax.G0.h;
import ax.G0.m;
import ax.G0.w;
import ax.G0.x;
import ax.i.n;

public class e
extends Fragment
implements DialogInterface.OnCancelListener,
DialogInterface.OnDismissListener {
    private Handler d0;
    private Runnable e0 = new Runnable(this){
        final e q;
        {
            this.q = e8;
        }

        @Override
        @SuppressLint(value={"SyntheticAccessor"})
        public void run() {
            this.q.g0.onDismiss((DialogInterface)this.q.o0);
        }
    };
    private DialogInterface.OnCancelListener f0 = new DialogInterface.OnCancelListener(this){
        final e a;
        {
            this.a = e8;
        }

        @SuppressLint(value={"SyntheticAccessor"})
        public void onCancel(DialogInterface object) {
            if (this.a.o0 != null) {
                object = this.a;
                ((e)object).onCancel((DialogInterface)((e)object).o0);
            }
        }
    };
    private DialogInterface.OnDismissListener g0 = new DialogInterface.OnDismissListener(this){
        final e a;
        {
            this.a = e8;
        }

        @SuppressLint(value={"SyntheticAccessor"})
        public void onDismiss(DialogInterface object) {
            if (this.a.o0 != null) {
                object = this.a;
                ((e)object).onDismiss((DialogInterface)((e)object).o0);
            }
        }
    };
    private int h0 = 0;
    private int i0 = 0;
    private boolean j0 = true;
    private boolean k0 = true;
    private int l0 = -1;
    private boolean m0;
    private m<h> n0 = new m<h>(this){
        final e a;
        {
            this.a = e8;
        }

        @SuppressLint(value={"SyntheticAccessor"})
        public void b(h h8) {
            if (h8 != null && this.a.k0) {
                h8 = this.a.q2();
                if (h8.getParent() == null) {
                    if (this.a.o0 != null) {
                        if (FragmentManager.J0(3)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("DialogFragment ");
                            stringBuilder.append(this);
                            stringBuilder.append(" setting the content view on ");
                            stringBuilder.append(this.a.o0);
                            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
                        }
                        this.a.o0.setContentView((View)h8);
                        return;
                    }
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
        }
    };
    private Dialog o0;
    private boolean p0;
    private boolean q0;
    private boolean r0;
    private boolean s0 = false;

    private void P2(boolean bl, boolean bl2, boolean bl3) {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        this.r0 = false;
        Object object = this.o0;
        if (object != null) {
            object.setOnDismissListener(null);
            this.o0.dismiss();
            if (!bl2) {
                if (Looper.myLooper() == this.d0.getLooper()) {
                    this.onDismiss((DialogInterface)this.o0);
                } else {
                    this.d0.post(this.e0);
                }
            }
        }
        this.p0 = true;
        if (this.l0 >= 0) {
            if (bl3) {
                this.A0().a1(this.l0, 1);
            } else {
                this.A0().Y0(this.l0, 1, bl);
            }
            this.l0 = -1;
            return;
        }
        object = this.A0().o();
        ((t)object).u(true);
        ((t)object).q(this);
        if (bl3) {
            ((t)object).k();
            return;
        }
        if (bl) {
            ((t)object).j();
            return;
        }
        ((t)object).i();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void W2(Bundle bundle) {
        Throwable throwable2;
        block5: {
            block6: {
                block3: {
                    block4: {
                        if (!this.k0) {
                            return;
                        }
                        if (this.s0) return;
                        try {
                            this.m0 = true;
                            bundle = this.T2(bundle);
                            this.o0 = bundle;
                            if (!this.k0) break block3;
                            this.a3((Dialog)bundle, this.h0);
                            bundle = this.b();
                            if (!(bundle instanceof Activity)) break block4;
                            this.o0.setOwnerActivity((Activity)bundle);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.o0.setCancelable(this.j0);
                    this.o0.setOnCancelListener(this.f0);
                    this.o0.setOnDismissListener(this.g0);
                    this.s0 = true;
                    break block6;
                }
                this.o0 = null;
            }
            this.m0 = false;
            return;
        }
        this.m0 = false;
        throw throwable2;
    }

    @Override
    public void I1(Bundle bundle) {
        boolean bl;
        int n8;
        super.I1(bundle);
        Dialog dialog = this.o0;
        if (dialog != null) {
            dialog = dialog.onSaveInstanceState();
            dialog.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", (Bundle)dialog);
        }
        if ((n8 = this.h0) != 0) {
            bundle.putInt("android:style", n8);
        }
        if ((n8 = this.i0) != 0) {
            bundle.putInt("android:theme", n8);
        }
        if (!(bl = this.j0)) {
            bundle.putBoolean("android:cancelable", bl);
        }
        if (!(bl = this.k0)) {
            bundle.putBoolean("android:showsDialog", bl);
        }
        if ((n8 = this.l0) != -1) {
            bundle.putInt("android:backStackId", n8);
        }
    }

    @Override
    public void J1() {
        super.J1();
        Dialog dialog = this.o0;
        if (dialog != null) {
            this.p0 = false;
            dialog.show();
            dialog = this.o0.getWindow().getDecorView();
            ax.G0.w.a((View)dialog, this);
            ax.G0.x.a((View)dialog, this);
            ax.n2.e.a((View)dialog, this);
        }
    }

    @Override
    public void K1() {
        super.K1();
        Dialog dialog = this.o0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override
    public void M1(Bundle bundle) {
        super.M1(bundle);
        if (this.o0 != null && bundle != null && (bundle = bundle.getBundle("android:savedDialogState")) != null) {
            this.o0.onRestoreInstanceState(bundle);
        }
    }

    public void N2() {
        this.P2(false, false, false);
    }

    public void O2() {
        this.P2(true, false, false);
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

    @Override
    void T1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.T1(layoutInflater, viewGroup, bundle);
        if (this.I == null && this.o0 != null && bundle != null && (layoutInflater = bundle.getBundle("android:savedDialogState")) != null) {
            this.o0.onRestoreInstanceState((Bundle)layoutInflater);
        }
    }

    public Dialog T2(Bundle object) {
        if (FragmentManager.J0(3)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("onCreateDialog called for DialogFragment ");
            ((StringBuilder)object).append(this);
            Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        return new n(this.p2(), this.S2());
    }

    View U2(int n8) {
        Dialog dialog = this.o0;
        if (dialog != null) {
            return dialog.findViewById(n8);
        }
        return null;
    }

    boolean V2() {
        return this.s0;
    }

    public final Dialog X2() {
        Object object = this.Q2();
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("DialogFragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" does not have a Dialog.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public void Y2(boolean bl) {
        this.j0 = bl;
        Dialog dialog = this.o0;
        if (dialog != null) {
            dialog.setCancelable(bl);
        }
    }

    public void Z2(boolean bl) {
        this.k0 = bl;
    }

    public void a3(Dialog dialog, int n8) {
        if (n8 != 1 && n8 != 2) {
            if (n8 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override
    ax.A0.e b0() {
        return new ax.A0.e(this, super.b0()){
            final ax.A0.e a;
            final e b;
            {
                this.b = e8;
                this.a = e9;
            }

            @Override
            public View c(int n8) {
                if (this.a.d()) {
                    return this.a.c(n8);
                }
                return this.b.U2(n8);
            }

            @Override
            public boolean d() {
                return this.a.d() || this.b.V2();
                {
                }
            }
        };
    }

    public int b3(t t8, String string) {
        int n8;
        this.q0 = false;
        this.r0 = true;
        t8.e(this, string);
        this.p0 = false;
        this.l0 = n8 = t8.i();
        return n8;
    }

    public void c3(FragmentManager object, String string) {
        this.q0 = false;
        this.r0 = true;
        object = ((FragmentManager)object).o();
        ((t)object).u(true);
        ((t)object).e(this, string);
        ((t)object).i();
    }

    @Override
    @Deprecated
    public void h1(Bundle bundle) {
        super.h1(bundle);
    }

    @Override
    public void k1(Context context) {
        super.k1(context);
        this.T0().i(this.n0);
        if (!this.r0) {
            this.q0 = false;
        }
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        this.d0 = new Handler();
        boolean bl = this.y == 0;
        this.k0 = bl;
        if (bundle != null) {
            this.h0 = bundle.getInt("android:style", 0);
            this.i0 = bundle.getInt("android:theme", 0);
            this.j0 = bundle.getBoolean("android:cancelable", true);
            this.k0 = bundle.getBoolean("android:showsDialog", this.k0);
            this.l0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface object) {
        if (!this.p0) {
            if (FragmentManager.J0(3)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("onDismiss called for DialogFragment ");
                ((StringBuilder)object).append(this);
                Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
            }
            this.P2(true, true, false);
        }
    }

    @Override
    public void u1() {
        super.u1();
        Dialog dialog = this.o0;
        if (dialog != null) {
            this.p0 = true;
            dialog.setOnDismissListener(null);
            this.o0.dismiss();
            if (!this.q0) {
                this.onDismiss((DialogInterface)this.o0);
            }
            this.o0 = null;
            this.s0 = false;
        }
    }

    @Override
    public void v1() {
        super.v1();
        if (!this.r0 && !this.q0) {
            this.q0 = true;
        }
        this.T0().m(this.n0);
    }

    @Override
    public LayoutInflater w1(Bundle object) {
        LayoutInflater layoutInflater = super.w1((Bundle)object);
        if (this.k0 && !this.m0) {
            this.W2((Bundle)object);
            if (FragmentManager.J0(2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("get layout inflater for DialogFragment ");
                ((StringBuilder)object).append(this);
                ((StringBuilder)object).append(" from dialog context");
                Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
            }
            if ((object = this.o0) != null) {
                return layoutInflater.cloneInContext(object.getContext());
            }
        } else if (FragmentManager.J0(2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("getting layout inflater for DialogFragment ");
            ((StringBuilder)object).append(this);
            object = ((StringBuilder)object).toString();
            if (!this.k0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("mShowsDialog = false: ");
                stringBuilder.append((String)object);
                Log.d((String)"FragmentManager", (String)stringBuilder.toString());
                return layoutInflater;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mCreatingDialog = true: ");
            stringBuilder.append((String)object);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        return layoutInflater;
    }
}

