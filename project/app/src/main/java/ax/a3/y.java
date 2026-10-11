/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import ax.Q2.i;
import ax.W2.j;
import ax.W2.v;
import ax.a3.B;
import ax.a3.n;
import ax.c3.K;
import ax.g3.c;
import java.util.logging.Logger;

public class y
extends e
implements n.c {
    private static final Logger U0 = Logger.getLogger("FileManager.FileProgressDialog");
    private TextView A0;
    private TextView B0;
    private TextView C0;
    private TextView D0;
    private TextView E0;
    private TextView F0;
    private View G0;
    private ProgressBar H0;
    private int I0;
    private boolean J0;
    private boolean K0;
    private j L0;
    private long M0;
    private Handler N0 = new Handler(Looper.getMainLooper());
    private long O0;
    private long P0;
    private n Q0;
    private int R0;
    private i S0;
    Runnable T0 = new Runnable(this){
        final y q;
        {
            this.q = y8;
        }

        @Override
        public void run() {
            this.q.M3();
            this.q.N0.postDelayed((Runnable)this, 1000L);
        }
    };
    private LinearLayout t0;
    private TextView u0;
    private TextView v0;
    private TextView w0;
    private TextView x0;
    private TextView y0;
    private TextView z0;

    private void C3(long l8) {
        String string = l8 < 0L ? "" : ax.u3.B.m(l8);
        this.F0.setText((CharSequence)this.N0(2131952516, string));
    }

    private void E3(String string) {
        this.u0.setText((CharSequence)string);
    }

    private void F3(long l8) {
        String string = l8 < 0L ? "" : ax.u3.B.m(l8);
        this.E0.setText((CharSequence)this.N0(2131952521, string));
    }

    private void G3(int n8) {
        switch (n8) {
            default: {
                return;
            }
            case 3: 
            case 4: 
            case 5: 
            case 7: 
            case 9: 
            case 10: 
            case 11: {
                this.y0.setVisibility(8);
                this.z0.setVisibility(8);
                return;
            }
            case 0: 
            case 1: 
            case 2: 
            case 8: 
            case 12: 
        }
        this.x0.setText((CharSequence)this.N0(2131952077, ""));
        this.z0.setText((CharSequence)this.N0(2131952663, ""));
    }

    private void H3() {
        n n8;
        if (!this.X0()) {
            return;
        }
        this.L0.d0();
        this.Q0 = n8 = n.l3(0, 2131952324, 2131952696, 2131952447, false, true);
        n8.D2(this, 0);
        ax.u3.B.d0(this.A0(), this.Q0, "confirmcancel", true);
    }

    private void I3() {
        this.t0.setVisibility(8);
        this.v0.setVisibility(0);
        this.N3();
        int n8 = this.I0;
        if (n8 != 0 && n8 != 1) {
            this.v0.setText(2131952509);
            return;
        }
        this.v0.setText(2131952508);
    }

    private void J3() {
        this.t0.setVisibility(0);
        this.v0.setVisibility(8);
        this.N3();
        this.G3(this.I0);
        this.H0.setMax(this.L0.w().u());
        this.B3(this.L0, true);
        this.K3();
    }

    private void K3() {
        if (this.f0() == null) {
            return;
        }
        this.N0.removeCallbacks(this.T0);
        this.N0.postDelayed(this.T0, 1000L);
    }

    private void L3() {
        this.N0.removeCallbacks(this.T0);
    }

    private void M3() {
        long l8 = this.M0;
        long l9 = 0L;
        if (l8 != 0L && (l8 = (SystemClock.uptimeMillis() - this.M0) / 1000L) > 0L) {
            long l10;
            if (this.F0 != null && (l10 = this.O0) >= 0L) {
                this.C3(l10 + l8);
            }
            if (this.E0 != null && (l10 = this.P0) >= 0L) {
                if ((l8 = l10 - l8) >= 0L) {
                    l9 = l8;
                }
                this.F3(l9);
            }
        }
    }

    private void N3() {
        if (this.L0.w().r()) {
            this.G0.setVisibility(8);
            return;
        }
        this.G0.setVisibility(0);
    }

    static /* synthetic */ long l3(y y8, long l8) {
        y8.P0 = l8;
        return l8;
    }

    static /* synthetic */ long p3(y y8, long l8) {
        y8.O0 = l8;
        return l8;
    }

    static /* synthetic */ int s3(y y8, int n8) {
        y8.R0 = n8;
        return n8;
    }

    private void w3() {
        this.L0.i();
    }

    public static y x3() {
        return new y();
    }

    public void A3(j j8) {
        this.J0 = true;
        if (this.X0()) {
            this.J3();
        }
    }

    public void B3(j object, boolean bl) {
        long l8;
        f f8;
        block3: {
            block2: {
                f8 = this.f0();
                if (f8 == null) break block2;
                object = ((j)object).w();
                l8 = SystemClock.uptimeMillis();
                if (bl || l8 - this.M0 > 100L) break block3;
            }
            return;
        }
        this.M0 = l8;
        f8.runOnUiThread(new Runnable(){
            final y c0;
            final v q;
            {
                this.c0 = y8;
                this.q = v8;
            }

            @Override
            public void run() {
                block15: {
                    block16: {
                        CharSequence charSequence;
                        long l8;
                        if (!this.c0.X0()) break block15;
                        if (this.c0.F0 != null) {
                            l8 = this.q.l();
                            y.p3(this.c0, l8);
                            this.c0.C3(l8);
                        }
                        boolean bl = this.q.R();
                        CharSequence charSequence2 = "";
                        if (bl || this.q.Q()) break block16;
                        this.c0.B0.setText((CharSequence)this.q.A(this.c0.b()));
                        this.c0.A0.setText((CharSequence)this.q.w());
                        this.c0.C0.setText((CharSequence)this.c0.N0(2131952513, this.q.y()));
                        this.c0.H0.setProgress(this.q.t());
                        if (this.c0.D0 != null && !this.q.s()) {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append(ax.c3.B.k(this.c0.b(), this.q.P()));
                            ((StringBuilder)charSequence).append("/s");
                            charSequence = ((StringBuilder)charSequence).toString();
                            this.c0.D0.setText(charSequence);
                        }
                        if (this.c0.E0 != null) {
                            l8 = this.q.B();
                            y.l3(this.c0, l8);
                            this.c0.F3(l8);
                        }
                        switch (this.c0.I0) {
                            default: {
                                break block15;
                            }
                            case 7: {
                                this.c0.w0.setText((CharSequence)this.q.L());
                                return;
                            }
                            case 3: 
                            case 4: 
                            case 5: 
                            case 9: 
                            case 10: 
                            case 11: {
                                this.c0.w0.setText((CharSequence)this.q.v());
                                return;
                            }
                            case 2: {
                                this.c0.w0.setText((CharSequence)this.q.F());
                                this.c0.y0.setText((CharSequence)this.q.K());
                                return;
                            }
                            case 0: 
                            case 1: 
                            case 8: 
                            case 12: {
                                Object object = this.q.E();
                                K k8 = this.q.J();
                                if (object != null) {
                                    charSequence = new StringBuilder();
                                    ((StringBuilder)charSequence).append(((K)object).f(this.c0.b()));
                                    ((StringBuilder)charSequence).append(" ");
                                    charSequence = ((StringBuilder)charSequence).toString();
                                } else {
                                    charSequence = "";
                                }
                                if (k8 != null) {
                                    charSequence2 = new StringBuilder();
                                    ((StringBuilder)charSequence2).append(k8.f(this.c0.b()));
                                    ((StringBuilder)charSequence2).append(" ");
                                    charSequence2 = ((StringBuilder)charSequence2).toString();
                                }
                                k8 = this.c0.w0;
                                object = new StringBuilder();
                                ((StringBuilder)object).append((String)charSequence);
                                ((StringBuilder)object).append(this.q.G());
                                k8.setText(((StringBuilder)object).toString());
                                k8 = this.c0.y0;
                                charSequence = new StringBuilder();
                                ((StringBuilder)charSequence).append((String)charSequence2);
                                ((StringBuilder)charSequence).append(this.q.L());
                                k8.setText(((StringBuilder)charSequence).toString());
                                return;
                            }
                        }
                    }
                    int n8 = this.q.q();
                    if (this.c0.R0 != n8) {
                        y.s3(this.c0, n8);
                        this.c0.H0.setMax(n8);
                    }
                    this.c0.H0.setProgress(this.q.o());
                    this.c0.w0.setText(this.q.i());
                    this.c0.y0.setText((CharSequence)"");
                    this.c0.B0.setText((CharSequence)"");
                    this.c0.A0.setText((CharSequence)"99%");
                    this.c0.C0.setText((CharSequence)this.c0.N0(2131952513, this.q.p()));
                    if (this.c0.D0 != null) {
                        this.c0.D0.setText((CharSequence)"");
                    }
                    if (this.c0.E0 != null) {
                        this.c0.F3(0L);
                    }
                }
            }
        });
    }

    public void D3(boolean bl) {
        this.K0 = bl;
    }

    @Override
    public void G(n n8) {
        this.Q0 = null;
        this.L0.m0();
    }

    @Override
    public void H1() {
        super.H1();
        if (this.K0) {
            this.K0 = false;
            this.N2();
        }
    }

    @Override
    public void J1() {
        super.J1();
        if (this.K0) {
            this.K0 = false;
            this.N2();
        }
    }

    @Override
    public void P(n n8) {
        this.w3();
        this.Q0 = null;
        this.L0.m0();
    }

    @Override
    public Dialog T2(Bundle object) {
        this.K0 = false;
        this.Y2(false);
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558504, null, false);
        this.t0 = (LinearLayout)view.findViewById(2131362285);
        this.v0 = (TextView)view.findViewById(2131362293);
        this.w0 = (TextView)view.findViewById(2131362291);
        this.y0 = (TextView)view.findViewById(2131362299);
        this.A0 = (TextView)view.findViewById(2131362295);
        this.B0 = (TextView)view.findViewById(2131362296);
        this.C0 = (TextView)view.findViewById(2131362294);
        this.H0 = (ProgressBar)view.findViewById(2131362287);
        this.D0 = (TextView)view.findViewById(2131362301);
        this.u0 = (TextView)view.findViewById(2131362298);
        this.E0 = (TextView)view.findViewById(2131362297);
        this.F0 = (TextView)view.findViewById(2131362289);
        this.x0 = (TextView)view.findViewById(2131362292);
        this.z0 = (TextView)view.findViewById(2131362300);
        this.G0 = view.findViewById(2131362288);
        boolean bl = B.l(this.f0());
        Context context = this.b();
        object = bl ? B.b.q : B.b.d0;
        object = new B(context, (B.b)((Object)object));
        object.n(view);
        view.findViewById(2131361999).setOnClickListener((View.OnClickListener)new c(this){
            final y c;
            {
                this.c = y8;
            }

            @Override
            public void a(View view) {
                this.c.H3();
            }
        });
        object.setCanceledOnTouchOutside(false);
        object.getWindow().addFlags(128);
        return object;
    }

    @Override
    public void Z(n n8) {
        this.Q0 = null;
        this.L0.m0();
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    @Override
    public void onDismiss(DialogInterface object) {
        super.onDismiss((DialogInterface)object);
        object = this.Q0;
        if (object != null && ((Fragment)object).X0()) {
            this.Q0.O2();
            this.Q0 = null;
        }
    }

    @Override
    public void onRequestPermissionsResult(int n8, String[] stringArray, int[] nArray) {
        this.S0.c(n8, stringArray, nArray, new i.a(this){
            final y a;
            {
                this.a = y8;
            }

            @Override
            public void a(boolean bl) {
            }

            @Override
            public void b() {
            }

            @Override
            public void c() {
            }
        }, new i.a(this){
            final y a;
            {
                this.a = y8;
            }

            @Override
            public void a(boolean bl) {
                Button button;
                if (this.a.Q2() != null && (button = ((a)this.a.Q2()).i(-3)) != null) {
                    button.setVisibility(8);
                }
            }

            @Override
            public void b() {
            }

            @Override
            public void c() {
            }
        });
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j j8 = this.L0;
        if (j8 == null) {
            this.K0 = true;
            return null;
        }
        this.E3(j8.C());
        if (!this.J0) {
            this.I3();
        } else {
            this.J3();
        }
        return super.r1(layoutInflater, viewGroup, bundle);
    }

    @Override
    public void s1() {
        super.s1();
        this.L3();
    }

    public void y3(j j8) {
        this.B3(j8, true);
        this.L3();
        if (!this.f1() && this.f0() != null) {
            this.f0().runOnUiThread(new Runnable(this){
                final y q;
                {
                    this.q = y8;
                }

                @Override
                public void run() {
                    if (this.q.X0()) {
                        int n8 = this.q.H0.getMax();
                        this.q.C0.setText((CharSequence)this.q.N0(2131952513, String.valueOf(n8)));
                        this.q.H0.setProgress(n8);
                        this.q.O2();
                    }
                }
            });
            return;
        }
        this.K0 = true;
    }

    public void z3(j j8) {
        this.J0 = false;
        this.L0 = j8;
        this.I0 = j8.B();
    }
}

