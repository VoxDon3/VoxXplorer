package ax.a3;

import android.app.Dialog;
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
import ax.Q2.i;
import ax.a3.C1358n;
import ax.a3.DialogC1343B;
import ax.c3.C1809B;
import ax.u3.C3180B;
import com.voxdon.xplorer.R;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class y extends androidx.fragment.app.e implements C1358n.c {
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
    private ax.W2.j L0;
    private long M0;
    private long O0;
    private long P0;
    private C1358n Q0;
    private int R0;
    private ax.Q2.i S0;
    private LinearLayout t0;
    private TextView u0;
    private TextView v0;
    private TextView w0;
    private TextView x0;
    private TextView y0;
    private TextView z0;
    private Handler N0 = new Handler(Looper.getMainLooper());
    Runnable T0 = new d();

    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            y.this.H3();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.M3();
            y.this.N0.postDelayed(this, 1000L);
        }
    }

    class e implements Runnable {
        final /* synthetic */ ax.W2.v q;

        e(ax.W2.v vVar) {
            this.q = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (y.this.X0()) {
                if (y.this.F0 != null) {
                    long l = this.q.l();
                    y.this.O0 = l;
                    y.this.C3(l);
                }
                boolean R = this.q.R();
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (R || this.q.Q()) {
                    int q = this.q.q();
                    if (y.this.R0 != q) {
                        y.this.R0 = q;
                        y.this.H0.setMax(q);
                    }
                    y.this.H0.setProgress(this.q.o());
                    y.this.w0.setText(this.q.i());
                    y.this.y0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                    y.this.B0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                    y.this.A0.setText("99%");
                    y.this.C0.setText(y.this.N0(R.string.progress_count, this.q.p()));
                    if (y.this.D0 != null) {
                        y.this.D0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                    if (y.this.E0 != null) {
                        y.this.F3(0L);
                        return;
                    }
                    return;
                }
                y.this.B0.setText(this.q.A(y.this.b()));
                y.this.A0.setText(this.q.w());
                y.this.C0.setText(y.this.N0(R.string.progress_count, this.q.y()));
                y.this.H0.setProgress(this.q.t());
                if (y.this.D0 != null && !this.q.s()) {
                    y.this.D0.setText(C1809B.k(y.this.b(), this.q.P()) + "/s");
                }
                if (y.this.E0 != null) {
                    long B = this.q.B();
                    y.this.P0 = B;
                    y.this.F3(B);
                }
                switch (y.this.I0) {
                    case 0:
                    case 1:
                    case 8:
                    case 12:
                        ax.c3.K E = this.q.E();
                        ax.c3.K J = this.q.J();
                        if (E != null) {
                            str = E.f(y.this.b()) + " ";
                        } else {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (J != null) {
                            str2 = J.f(y.this.b()) + " ";
                        }
                        y.this.w0.setText(str + this.q.G());
                        y.this.y0.setText(str2 + this.q.L());
                        break;
                    case 2:
                        y.this.w0.setText(this.q.F());
                        y.this.y0.setText(this.q.K());
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 9:
                    case 10:
                    case 11:
                        y.this.w0.setText(this.q.v());
                        break;
                    case 7:
                        y.this.w0.setText(this.q.L());
                        break;
                }
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.this.X0()) {
                int max = y.this.H0.getMax();
                y.this.C0.setText(y.this.N0(R.string.progress_count, String.valueOf(max)));
                y.this.H0.setProgress(max);
                y.this.O2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(long j) {
        this.F0.setText(N0(R.string.progress_elapsed_time, j < 0 ? HttpUrl.FRAGMENT_ENCODE_SET : C3180B.m(j)));
    }

    private void E3(String str) {
        this.u0.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(long j) {
        this.E0.setText(N0(R.string.progress_remaining_time, j < 0 ? HttpUrl.FRAGMENT_ENCODE_SET : C3180B.m(j)));
    }

    private void G3(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 8:
            case 12:
                this.x0.setText(N0(R.string.from, HttpUrl.FRAGMENT_ENCODE_SET));
                this.z0.setText(N0(R.string.to, HttpUrl.FRAGMENT_ENCODE_SET));
                break;
            case 3:
            case 4:
            case 5:
            case 7:
            case 9:
            case 10:
            case 11:
                this.y0.setVisibility(8);
                this.z0.setVisibility(8);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3() {
        if (X0()) {
            this.L0.d0();
            C1358n l3 = C1358n.l3(0, R.string.msg_confirm_cancel, R.string.yes, R.string.no, false, true);
            this.Q0 = l3;
            l3.D2(this, 0);
            C3180B.d0(A0(), this.Q0, "confirmcancel", true);
        }
    }

    private void I3() {
        this.t0.setVisibility(8);
        this.v0.setVisibility(0);
        N3();
        int i = this.I0;
        if (i == 0 || i == 1) {
            this.v0.setText(R.string.prepare_paste_information);
        } else {
            this.v0.setText(R.string.preparing);
        }
    }

    private void J3() {
        this.t0.setVisibility(0);
        this.v0.setVisibility(8);
        N3();
        G3(this.I0);
        this.H0.setMax(this.L0.w().u());
        B3(this.L0, true);
        K3();
    }

    private void K3() {
        if (f0() == null) {
            return;
        }
        this.N0.removeCallbacks(this.T0);
        this.N0.postDelayed(this.T0, 1000L);
    }

    private void L3() {
        this.N0.removeCallbacks(this.T0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M3() {
        if (this.M0 == 0) {
            return;
        }
        long uptimeMillis = (SystemClock.uptimeMillis() - this.M0) / 1000;
        if (uptimeMillis <= 0) {
            return;
        }
        if (this.F0 != null) {
            long j = this.O0;
            if (j >= 0) {
                C3(j + uptimeMillis);
            }
        }
        if (this.E0 != null) {
            long j2 = this.P0;
            if (j2 >= 0) {
                long j3 = j2 - uptimeMillis;
                F3(j3 >= 0 ? j3 : 0L);
            }
        }
    }

    private void N3() {
        if (this.L0.w().r()) {
            this.G0.setVisibility(8);
        } else {
            this.G0.setVisibility(0);
        }
    }

    private void w3() {
        this.L0.i();
    }

    public static y x3() {
        return new y();
    }

    public void A3(ax.W2.j jVar) {
        this.J0 = true;
        if (X0()) {
            J3();
        }
    }

    public void B3(ax.W2.j jVar, boolean z) {
        androidx.fragment.app.f f0 = f0();
        if (f0 == null) {
            return;
        }
        ax.W2.v w = jVar.w();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (z || uptimeMillis - this.M0 > 100) {
            this.M0 = uptimeMillis;
            f0.runOnUiThread(new e(w));
        }
    }

    public void D3(boolean z) {
        this.K0 = z;
    }

    @Override // ax.a3.C1358n.c
    public void G(C1358n c1358n) {
        this.Q0 = null;
        this.L0.m0();
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        if (this.K0) {
            this.K0 = false;
            N2();
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        if (this.K0) {
            this.K0 = false;
            N2();
        }
    }

    @Override // ax.a3.C1358n.c
    public void P(C1358n c1358n) {
        w3();
        this.Q0 = null;
        this.L0.m0();
    }

    @Override // androidx.fragment.app.e
    public Dialog T2(Bundle bundle) {
        this.K0 = false;
        Y2(false);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_file_progress, (ViewGroup) null, false);
        this.t0 = (LinearLayout) inflate.findViewById(R.id.file_progress_ll_file_path);
        this.v0 = (TextView) inflate.findViewById(R.id.file_progress_tv_prepare);
        this.w0 = (TextView) inflate.findViewById(R.id.file_progress_tv_from);
        this.y0 = (TextView) inflate.findViewById(R.id.file_progress_tv_to);
        this.A0 = (TextView) inflate.findViewById(R.id.file_progress_tv_progress_percent);
        this.B0 = (TextView) inflate.findViewById(R.id.file_progress_tv_progress_size);
        this.C0 = (TextView) inflate.findViewById(R.id.file_progress_tv_progress_count);
        this.H0 = (ProgressBar) inflate.findViewById(R.id.file_progress_pb_total_progress);
        this.D0 = (TextView) inflate.findViewById(R.id.file_progress_tv_transfer_rate);
        this.u0 = (TextView) inflate.findViewById(R.id.file_progress_tv_title);
        this.E0 = (TextView) inflate.findViewById(R.id.file_progress_tv_remaining_time);
        this.F0 = (TextView) inflate.findViewById(R.id.file_progress_tv_elapsed_time);
        this.x0 = (TextView) inflate.findViewById(R.id.file_progress_tv_from_label);
        this.z0 = (TextView) inflate.findViewById(R.id.file_progress_tv_to_label);
        this.G0 = inflate.findViewById(R.id.file_progress_size_container);
        DialogC1343B dialogC1343B = new DialogC1343B(b(), DialogC1343B.l(f0()) ? DialogC1343B.b.FULLSCREEN_BACKGROUND : DialogC1343B.b.FULLSCREEN_FIXED_SIZE);
        dialogC1343B.n(inflate);
        inflate.findViewById(R.id.cancel).setOnClickListener(new a());
        dialogC1343B.setCanceledOnTouchOutside(false);
        dialogC1343B.getWindow().addFlags(128);
        return dialogC1343B;
    }

    @Override // ax.a3.C1358n.c
    public void Z(C1358n c1358n) {
        this.Q0 = null;
        this.L0.m0();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1358n c1358n = this.Q0;
        if (c1358n == null || !c1358n.X0()) {
            return;
        }
        this.Q0.O2();
        this.Q0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.S0.c(i, strArr, iArr, new b(), new c());
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ax.W2.j jVar = this.L0;
        if (jVar == null) {
            this.K0 = true;
            return null;
        }
        E3(jVar.C());
        if (this.J0) {
            J3();
        } else {
            I3();
        }
        return super.r1(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void s1() {
        super.s1();
        L3();
    }

    public void y3(ax.W2.j jVar) {
        B3(jVar, true);
        L3();
        if (f1() || f0() == null) {
            this.K0 = true;
        } else {
            f0().runOnUiThread(new f());
        }
    }

    public void z3(ax.W2.j jVar) {
        this.J0 = false;
        this.L0 = jVar;
        this.I0 = jVar.B();
    }

    class b implements i.a {
        b() {
        }

        @Override // ax.Q2.i.a
        public void b() {
        }

        @Override // ax.Q2.i.a
        public void c() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
        }
    }

    class c implements i.a {
        c() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
            Button i;
            if (y.this.Q2() == null || (i = ((androidx.appcompat.app.a) y.this.Q2()).i(-3)) == null) {
                return;
            }
            i.setVisibility(8);
        }

        @Override // ax.Q2.i.a
        public void b() {
        }

        @Override // ax.Q2.i.a
        public void c() {
        }
    }
}
