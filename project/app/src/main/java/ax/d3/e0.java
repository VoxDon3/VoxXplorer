/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Q2.i;
import ax.T.b;
import ax.X2.J;
import ax.X2.Q;
import ax.Y6.e;
import ax.Y6.f;
import ax.c3.u;
import ax.d3.Y;
import ax.d3.d0;
import ax.t3.c;
import ax.t3.j;
import ax.t3.k;
import ax.u3.B;
import ax.u3.g;
import ax.u3.m;
import ax.u3.o;
import com.alphainventor.filemanager.activity.MainActivity;
import com.alphainventor.filemanager.activity.UsbAttachActivity;

public class e0
extends Fragment
implements Y {
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
    private i o0;
    private m p0;
    private TextView q0;
    private boolean r0;
    private boolean s0 = false;
    private ax.Y6.c t0;
    private boolean u0 = false;
    private boolean v0 = true;

    public static /* synthetic */ void K2(e0 e02, e e8) {
        if (e02.t0.a()) {
            k.H(true);
            e02.Z2();
        }
        e02.Z2();
    }

    public static e0 V2(boolean bl) {
        e0 e02 = new e0();
        Bundle bundle = new Bundle();
        bundle.putBoolean("first_launch", bl);
        e02.v2(bundle);
        return e02;
    }

    private void W2() {
        if (this.f0() != null) {
            ((MainActivity)this.f0()).o2();
        }
    }

    private int X2(Context context) {
        TypedValue typedValue = new TypedValue();
        Context context2 = null;
        try {
            context2 = context = context.obtainStyledAttributes(typedValue.data, new int[]{2130968863});
        }
        catch (Throwable throwable) {
            if (context2 != null) {
                context2.recycle();
            }
            throw throwable;
        }
        int n8 = context.getColor(0, -5242848);
        context.recycle();
        return n8;
    }

    private void Y2(View view) {
        block6: {
            block5: {
                this.d0 = 1;
                this.e0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final e0 c;
                    {
                        this.c = e02;
                    }

                    @Override
                    public void a(View view) {
                        this.c.Z2();
                    }
                });
                this.f0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final e0 c;
                    {
                        this.c = e02;
                    }

                    @Override
                    public void a(View view) {
                        this.c.i3();
                    }
                });
                this.g0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final e0 c;
                    {
                        this.c = e02;
                    }

                    @Override
                    public void a(View view) {
                        this.c.h3();
                    }
                });
                this.h0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final e0 c;
                    {
                        this.c = e02;
                    }

                    @Override
                    public void a(View view) {
                        this.c.k3();
                    }
                });
                view = this.q0;
                view.setPaintFlags(view.getPaintFlags() | 8);
                this.q0.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final e0 c;
                    {
                        this.c = e02;
                    }

                    @Override
                    public void a(View view) {
                        try {
                            view = B.C("https://www.alphainventor.com/cx-file-explorer-privacy-policy");
                            u.p0(this.c, (Intent)view);
                            return;
                        }
                        catch (ActivityNotFoundException | SecurityException throwable) {
                            Toast.makeText((Context)this.c.f0(), (int)2131951927, (int)1).show();
                            return;
                        }
                    }
                });
                if (this.f0() == null) break block5;
                long l8 = k.h();
                if (o.h((Context)this.f0()) || !this.v0) break block6;
                if (l8 != 0L && System.currentTimeMillis() - l8 > 86400000L) {
                    this.b3();
                    return;
                }
                if (J.D((Context)this.f0()) && j.b((Context)this.f0())) {
                    j.p((Context)this.f0(), false);
                    B.c0((Context)this.f0(), UsbAttachActivity.class, false);
                }
            }
            return;
        }
        this.b3();
    }

    private void Z2() {
        int n8 = this.d0;
        if (n8 == 1) {
            this.b3();
            this.o3();
            return;
        }
        if (n8 == 2) {
            if (Q.e0() && !o.i(this.b())) {
                this.c3();
                return;
            }
            this.d3();
            return;
        }
        if (n8 == 3) {
            this.d3();
            return;
        }
        if (n8 == 4) {
            this.W2();
        }
    }

    private void a3() {
        this.d0 = 1;
        this.i0.setVisibility(0);
        this.j0.setVisibility(8);
        this.k0.setVisibility(8);
        this.l0.setVisibility(8);
        this.n3();
    }

    private void b3() {
        this.d0 = 2;
        this.i0.setVisibility(8);
        this.j0.setVisibility(0);
        this.k0.setVisibility(8);
        this.l0.setVisibility(8);
        if (Q.z0()) {
            this.m0.setText(2131952543);
        } else {
            this.m0.setText(2131952546);
        }
        this.n3();
    }

    private void c3() {
        this.d0 = 3;
        this.i0.setVisibility(8);
        this.j0.setVisibility(8);
        this.k0.setVisibility(0);
        this.l0.setVisibility(8);
        this.n3();
        this.h3();
    }

    private void d3() {
        this.d0 = 4;
        if (this.u0 && c.n().D()) {
            this.i0.setVisibility(8);
            this.j0.setVisibility(8);
            this.k0.setVisibility(8);
            this.l0.setVisibility(0);
            this.n3();
            this.k3();
            return;
        }
        this.Z2();
    }

    private void f3() {
        if (this.b() == null) {
            return;
        }
        Context context = this.b().getApplicationContext();
        this.o0.g();
        this.p0.e(new m.c(){
            final Context a;
            final e0 b;
            {
                this.b = e02;
                this.a = context;
            }

            @Override
            public void a() {
                if (this.b.b() == null) {
                    ax.Ha.b b8 = ax.Ha.c.h().f().b("ALL FILES ACCESS MON").j();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("PremissionGranted:");
                    stringBuilder.append(this.b.r0);
                    b8.g(stringBuilder.toString()).h();
                    b8 = u.E(this.a, null, null);
                    this.a.startActivity((Intent)b8);
                    return;
                }
                Intent intent = u.E(this.b.b(), null, null);
                this.b.F2(intent);
            }
        });
    }

    private void g3() {
        this.o0.h();
    }

    private boolean h3() {
        if (Q.e0() && !o.i(this.b())) {
            this.o0.j();
            return true;
        }
        return false;
    }

    private void i3() {
        if (this.b() == null) {
            return;
        }
        if (Q.z0()) {
            this.f3();
            return;
        }
        if (!o.k(this) && k.g(this.b()) == 3) {
            this.g3();
            return;
        }
        this.j3();
    }

    private void j3() {
        this.o0.i();
    }

    private void k3() {
        if (this.f0() == null) {
            return;
        }
        if (this.t0 == null) {
            this.Z2();
            ax.u3.b.g("why enter this?");
            return;
        }
        if (ax.t3.g.c()) {
            this.Z2();
            return;
        }
        f.a(this.f0(), new d0(this));
    }

    private void l3() {
        if (this.b() == null) {
            return;
        }
        this.m0.setTextColor(this.X2(this.b()));
    }

    private void m3() {
        this.r0 = true;
        if (this.f0() == null) {
            return;
        }
        g.a().f("local.intent.action.STORAGE_GRANTED");
        this.Z2();
    }

    private void n3() {
        int n8 = this.d0;
        if (n8 == 1) {
            this.e0.requestFocus();
            return;
        }
        if (n8 == 2) {
            this.f0.requestFocus();
            return;
        }
        if (n8 == 3) {
            this.g0.requestFocus();
            return;
        }
        if (n8 == 4) {
            this.h0.requestFocus();
        }
    }

    private void o3() {
        this.f0();
    }

    @Override
    public void H1() {
        super.H1();
        this.n3();
    }

    public boolean e3() {
        if (this.f0() == null) {
            return false;
        }
        int n8 = this.d0;
        if (n8 == 1) {
            if (this.f0() != null) {
                this.f0().finish();
            }
            return true;
        }
        if (n8 == 2) {
            this.a3();
            return true;
        }
        if (n8 == 3) {
            return true;
        }
        if (n8 == 4) {
            return true;
        }
        ax.u3.b.f();
        return false;
    }

    @Override
    public void i1(int n8, int n9, Intent intent) {
        if (this.b() == null) {
            return;
        }
        this.p0.d(n8, n9, intent);
        this.o0.b(this.b(), n8, n9, intent, new i.a(this){
            final e0 a;
            {
                this.a = e02;
            }

            @Override
            public void a(boolean bl) {
                ax.u3.b.f();
            }

            @Override
            public void b() {
                this.a.m3();
            }

            @Override
            public void c() {
                this.a.l3();
            }
        }, new i.a(this){
            final e0 a;
            {
                this.a = e02;
            }

            @Override
            public void a(boolean bl) {
                ax.u3.b.f();
            }

            @Override
            public void b() {
                this.a.m3();
            }

            @Override
            public void c() {
                this.a.l3();
            }
        });
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        this.o0 = new i(this);
        this.p0 = new m();
        bundle = this.j0();
        if (bundle != null) {
            this.v0 = bundle.getBoolean("first_launch");
        }
        this.o3();
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        if (this.R0() != null && !bl) {
            View view = this.R0();
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), b8.d);
        }
    }

    @Override
    public void onRequestPermissionsResult(int n8, String[] stringArray, int[] nArray) {
        this.o0.c(n8, stringArray, nArray, new i.a(this){
            final e0 a;
            {
                this.a = e02;
            }

            @Override
            public void a(boolean bl) {
                if (bl) {
                    this.a.g3();
                    return;
                }
                this.a.l3();
            }

            @Override
            public void b() {
                this.a.m3();
            }

            @Override
            public void c() {
                this.a.l3();
            }
        }, new i.a(this){
            final e0 a;
            {
                this.a = e02;
            }

            @Override
            public void a(boolean bl) {
                this.a.Z2();
            }

            @Override
            public void b() {
                ax.s3.u.j(this.a.b());
                this.a.Z2();
            }

            @Override
            public void c() {
                if (this.a.b() == null) {
                    return;
                }
                TextView textView = this.a.n0;
                e0 e02 = this.a;
                textView.setTextColor(e02.X2(e02.b()));
            }
        });
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131558555, viewGroup, false);
        this.e0 = layoutInflater.findViewById(2131362886);
        this.f0 = layoutInflater.findViewById(2131362888);
        this.g0 = layoutInflater.findViewById(2131362891);
        this.h0 = layoutInflater.findViewById(2131362894);
        this.i0 = layoutInflater.findViewById(2131362438);
        this.j0 = layoutInflater.findViewById(2131362439);
        this.k0 = layoutInflater.findViewById(2131362440);
        this.l0 = layoutInflater.findViewById(2131362441);
        this.m0 = (TextView)layoutInflater.findViewById(2131362890);
        this.n0 = (TextView)layoutInflater.findViewById(2131362893);
        this.q0 = (TextView)layoutInflater.findViewById(2131362711);
        this.Y2((View)layoutInflater);
        this.n3();
        return layoutInflater;
    }
}

