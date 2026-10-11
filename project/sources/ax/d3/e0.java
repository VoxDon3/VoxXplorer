package ax.d3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Q2.i;
import ax.Y6.b;
import ax.c3.C1832u;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3189g;
import ax.u3.C3195m;
import ax.u3.C3197o;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.activity.UsbAttachActivity;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class e0 extends Fragment implements Y {
    private int d0;
    private View e0;
    private View f0;
    private View g0;
    private View h0;
    private View i0;
    private View j0;
    private View k0;
    private View l0;
    private TextView m0;
    private TextView n0;
    private ax.Q2.i o0;
    private C3195m p0;
    private TextView q0;
    private boolean r0;
    private ax.Y6.c t0;
    private boolean s0 = false;
    private boolean u0 = false;
    private boolean v0 = true;

    class a implements C3195m.c {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // ax.u3.C3195m.c
        public void a() {
            if (e0.this.b() != null) {
                e0.this.F2(C1832u.E(e0.this.b(), null, null));
                return;
            }
            ax.Ha.c.h().f().b("ALL FILES ACCESS MON").j().g("PremissionGranted:" + e0.this.r0).h();
            this.a.startActivity(C1832u.E(this.a, null, null));
        }
    }

    class b implements i.a {
        b() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
            C3184b.f();
        }

        @Override // ax.Q2.i.a
        public void b() {
            e0.this.m3();
        }

        @Override // ax.Q2.i.a
        public void c() {
            e0.this.l3();
        }
    }

    class c implements i.a {
        c() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
            C3184b.f();
        }

        @Override // ax.Q2.i.a
        public void b() {
            e0.this.m3();
        }

        @Override // ax.Q2.i.a
        public void c() {
            e0.this.l3();
        }
    }

    class d implements i.a {
        d() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
            if (z) {
                e0.this.g3();
            } else {
                e0.this.l3();
            }
        }

        @Override // ax.Q2.i.a
        public void b() {
            e0.this.m3();
        }

        @Override // ax.Q2.i.a
        public void c() {
            e0.this.l3();
        }
    }

    class e implements i.a {
        e() {
        }

        @Override // ax.Q2.i.a
        public void a(boolean z) {
            e0.this.Z2();
        }

        @Override // ax.Q2.i.a
        public void b() {
            ax.s3.u.j(e0.this.b());
            e0.this.Z2();
        }

        @Override // ax.Q2.i.a
        public void c() {
            if (e0.this.b() == null) {
                return;
            }
            TextView textView = e0.this.n0;
            e0 e0Var = e0.this;
            textView.setTextColor(e0Var.X2(e0Var.b()));
        }
    }

    class f extends ax.g3.c {
        f() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            e0.this.Z2();
        }
    }

    class g extends ax.g3.c {
        g() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            e0.this.i3();
        }
    }

    class h extends ax.g3.c {
        h() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            e0.this.h3();
        }
    }

    class i extends ax.g3.c {
        i() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            e0.this.k3();
        }
    }

    class j extends ax.g3.c {
        j() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            try {
                C1832u.p0(e0.this, C3180B.C("https://www.alphainventor.com/cx-file-explorer-privacy-policy"));
            } catch (ActivityNotFoundException | SecurityException unused) {
                Toast.makeText(e0.this.f0(), R.string.error, 1).show();
            }
        }
    }

    public static /* synthetic */ void K2(e0 e0Var, ax.Y6.e eVar) {
        if (e0Var.t0.a()) {
            ax.t3.k.H(true);
            e0Var.Z2();
        }
        e0Var.Z2();
    }

    public static e0 V2(boolean z) {
        e0 e0Var = new e0();
        Bundle bundle = new Bundle();
        bundle.putBoolean("first_launch", z);
        e0Var.v2(bundle);
        return e0Var;
    }

    private void W2() {
        if (f0() != null) {
            ((MainActivity) f0()).o2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int X2(Context context) {
        TypedArray typedArray = null;
        try {
            typedArray = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.colorError});
            int color = typedArray.getColor(0, -5242848);
            typedArray.recycle();
            return color;
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    private void Y2(View view) {
        this.d0 = 1;
        this.e0.setOnClickListener(new f());
        this.f0.setOnClickListener(new g());
        this.g0.setOnClickListener(new h());
        this.h0.setOnClickListener(new i());
        TextView textView = this.q0;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        this.q0.setOnClickListener(new j());
        if (f0() == null) {
            return;
        }
        long h2 = ax.t3.k.h();
        if (C3197o.h(f0()) || !this.v0) {
            b3();
            return;
        }
        if (h2 != 0 && System.currentTimeMillis() - h2 > 86400000) {
            b3();
        } else if (ax.X2.J.D(f0()) && ax.t3.j.b(f0())) {
            ax.t3.j.p(f0(), false);
            C3180B.c0(f0(), UsbAttachActivity.class, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z2() {
        int i2 = this.d0;
        if (i2 == 1) {
            b3();
            o3();
            return;
        }
        if (i2 == 2) {
            if (!ax.X2.Q.e0() || C3197o.i(b())) {
                d3();
                return;
            } else {
                c3();
                return;
            }
        }
        if (i2 == 3) {
            d3();
        } else if (i2 == 4) {
            W2();
        }
    }

    private void a3() {
        this.d0 = 1;
        this.i0.setVisibility(0);
        this.j0.setVisibility(8);
        this.k0.setVisibility(8);
        this.l0.setVisibility(8);
        n3();
    }

    private void b3() {
        this.d0 = 2;
        this.i0.setVisibility(8);
        this.j0.setVisibility(0);
        this.k0.setVisibility(8);
        this.l0.setVisibility(8);
        if (ax.X2.Q.z0()) {
            this.m0.setText(R.string.request_all_files_access_permissions);
        } else {
            this.m0.setText(R.string.request_storage_permissions);
        }
        n3();
    }

    private void c3() {
        this.d0 = 3;
        this.i0.setVisibility(8);
        this.j0.setVisibility(8);
        this.k0.setVisibility(0);
        this.l0.setVisibility(8);
        n3();
        h3();
    }

    private void d3() {
        this.d0 = 4;
        if (!this.u0 || !ax.t3.c.n().D()) {
            Z2();
            return;
        }
        this.i0.setVisibility(8);
        this.j0.setVisibility(8);
        this.k0.setVisibility(8);
        this.l0.setVisibility(0);
        n3();
        k3();
    }

    private void f3() {
        if (b() == null) {
            return;
        }
        Context applicationContext = b().getApplicationContext();
        this.o0.g();
        this.p0.e(new a(applicationContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3() {
        this.o0.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h3() {
        if (!ax.X2.Q.e0() || C3197o.i(b())) {
            return false;
        }
        this.o0.j();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        if (b() == null) {
            return;
        }
        if (ax.X2.Q.z0()) {
            f3();
        } else if (C3197o.k(this) || ax.t3.k.g(b()) != 3) {
            j3();
        } else {
            g3();
        }
    }

    private void j3() {
        this.o0.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        if (f0() == null) {
            return;
        }
        if (this.t0 == null) {
            Z2();
            C3184b.g("why enter this?");
        } else if (ax.t3.g.c()) {
            Z2();
        } else {
            ax.Y6.f.a(f0(), new b.a() { // from class: ax.d3.d0
                @Override // ax.Y6.b.a
                public final void a(ax.Y6.e eVar) {
                    e0.K2(e0.this, eVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3() {
        if (b() == null) {
            return;
        }
        this.m0.setTextColor(X2(b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        this.r0 = true;
        if (f0() == null) {
            return;
        }
        C3189g.a().f("local.intent.action.STORAGE_GRANTED");
        Z2();
    }

    private void n3() {
        int i2 = this.d0;
        if (i2 == 1) {
            this.e0.requestFocus();
            return;
        }
        if (i2 == 2) {
            this.f0.requestFocus();
        } else if (i2 == 3) {
            this.g0.requestFocus();
        } else if (i2 == 4) {
            this.h0.requestFocus();
        }
    }

    private void o3() {
        f0();
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        n3();
    }

    public boolean e3() {
        if (f0() == null) {
            return false;
        }
        int i2 = this.d0;
        if (i2 == 1) {
            if (f0() != null) {
                f0().finish();
            }
            return true;
        }
        if (i2 == 2) {
            a3();
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return true;
        }
        C3184b.f();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(int i2, int i3, Intent intent) {
        if (b() == null) {
            return;
        }
        this.p0.d(i2, i3, intent);
        this.o0.b(b(), i2, i3, intent, new b(), new c());
    }

    @Override // androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        this.o0 = new ax.Q2.i(this);
        this.p0 = new C3195m();
        Bundle j0 = j0();
        if (j0 != null) {
            this.v0 = j0.getBoolean("first_launch");
        }
        o3();
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        if (R0() == null || z) {
            return;
        }
        View R0 = R0();
        R0.setPadding(R0.getPaddingLeft(), R0.getPaddingTop(), R0.getPaddingRight(), bVar.d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.o0.c(i2, strArr, iArr, new d(), new e());
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_permission_screen, viewGroup, false);
        this.e0 = inflate.findViewById(R.id.step1_next);
        this.f0 = inflate.findViewById(R.id.step2_next);
        this.g0 = inflate.findViewById(R.id.step3_next);
        this.h0 = inflate.findViewById(R.id.step4_next);
        this.i0 = inflate.findViewById(R.id.layout_step1);
        this.j0 = inflate.findViewById(R.id.layout_step2);
        this.k0 = inflate.findViewById(R.id.layout_step3);
        this.l0 = inflate.findViewById(R.id.layout_step4);
        this.m0 = (TextView) inflate.findViewById(R.id.step2description);
        this.n0 = (TextView) inflate.findViewById(R.id.step3description);
        this.q0 = (TextView) inflate.findViewById(R.id.privacy_policy);
        Y2(inflate);
        n3();
        return inflate;
    }
}
