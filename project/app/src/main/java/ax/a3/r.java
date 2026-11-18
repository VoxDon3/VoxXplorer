/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import ax.Ha.c;
import ax.Q.b;
import ax.W2.h;
import ax.W2.i;
import ax.W2.o;
import ax.X2.Q;
import ax.a3.I;
import ax.a3.t;
import ax.c3.B;
import ax.c3.K;
import ax.u3.q;
import com.voxdon.xplorer.file.f;
import com.voxdon.xplorer.file.j;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class r
extends I {
    private DialogInterface.OnCancelListener A0;
    private com.voxdon.xplorer.file.o B0;
    private List<n> C0;
    private com.voxdon.xplorer.file.f D0;
    private int E0;
    private int F0;
    private boolean G0;
    private boolean H0;
    private o I0;
    private boolean J0;
    private K K0;
    private TextView t0;
    private TextView u0;
    private CheckBox v0;
    private ColorStateList w0;
    private Button x0;
    private Button y0;
    private f z0;

    public static r A3(o o8, K k8, int n8, int n9, boolean bl, boolean bl2) {
        r r8 = new r();
        Bundle bundle = new Bundle();
        bundle.putLong("command_id", o8.e());
        bundle.putSerializable("location", (Serializable)((Object)k8.d()));
        bundle.putInt("location_key", k8.b());
        if (n8 != 0) {
            bundle.putInt("custom_title", n8);
        }
        if (n9 != 0) {
            bundle.putInt("custom_message", n9);
        }
        bundle.putBoolean("default_move_to_recycle_bin", bl);
        bundle.putBoolean("show_recycle_checkbox", bl2);
        r8.v2(bundle);
        return r8;
    }

    private String B3(boolean bl) {
        if (this.C0.size() == 1) {
            Resources resources = this.f0().getResources();
            int n8 = bl ? 2131951789 : 2131951787;
            return resources.getString(n8, new Object[]{this.C0.get(0).B()});
        }
        Resources resources = this.f0().getResources();
        int n9 = bl ? 2131820545 : 2131820544;
        return resources.getQuantityString(n9, this.C0.size(), new Object[]{this.C0.size()});
    }

    private int C3(boolean bl) {
        if (bl) {
            return 2131952275;
        }
        return 2131951891;
    }

    private void D3(a a8) {
        if (this.I0 != null) {
            if (this.x0 == null) {
                Button button;
                this.x0 = button = a8.i(-1);
                button.setVisibility(8);
            }
            if (this.y0 == null) {
                a8 = a8.i(-2);
                this.y0 = a8;
                a8.setVisibility(8);
            }
            if (!this.J0) {
                if (this.I0.s()) {
                    new g(this).i(new Void[0]);
                } else if (this.I0.u()) {
                    new h(this).i(new Void[0]);
                } else {
                    this.E3();
                }
                this.J0 = true;
            }
        }
    }

    private void E3() {
        com.voxdon.xplorer.file.f f8;
        this.D0 = f8 = new com.voxdon.xplorer.file.f(f.c.q, this.B0, this.I0.q(), this.I0.u(), new f.b(this){
            final r a;
            {
                this.a = r8;
            }

            @Override
            public void a(int n8, int n9, long l8, Map<String, f.a> object) {
                if (this.a.X0() && this.a.f0() != null) {
                    this.a.I0.z(n9);
                    this.a.I0.A(l8);
                    this.a.I0.w((Map<String, f.a>)object);
                    if (this.a.F0 != 0) {
                        this.a.t0.setText(this.a.F0);
                    } else {
                        TextView textView = this.a.t0;
                        object = this.a;
                        textView.setText((CharSequence)((r)object).B3(((r)object).I0.p()));
                    }
                    this.a.x0.setVisibility(0);
                    this.a.y0.setVisibility(0);
                    this.a.x0.requestFocus();
                }
            }

            @Override
            public void b(int n8, int n9, long l8) {
                if (this.a.X0() && this.a.f0() != null) {
                    this.a.u0.setText((CharSequence)this.a.N0(2131951802, n8, n9, B.k((Context)this.a.f0(), l8)));
                }
            }
        });
        f8.i(new Void[0]);
    }

    private void H3(Context context) {
        CheckBox checkBox = this.v0;
        if (checkBox != null) {
            if (checkBox.isChecked()) {
                this.v0.setTextColor(b.c(context, 2131100861));
                return;
            }
            this.v0.setTextColor(this.w0);
        }
    }

    static /* synthetic */ com.voxdon.xplorer.file.o p3(r r8, com.voxdon.xplorer.file.o o8) {
        r8.B0 = o8;
        return o8;
    }

    static /* synthetic */ List q3(r r8, List list) {
        r8.C0 = list;
        return list;
    }

    public static r z3(o o8, K k8) {
        r r8 = new r();
        Bundle bundle = new Bundle();
        bundle.putLong("command_id", o8.e());
        if (k8 != null) {
            bundle.putSerializable("location", (Serializable)((Object)k8.d()));
            bundle.putInt("location_key", k8.b());
        }
        bundle.putInt("custom_title", 2131952261);
        bundle.putInt("custom_message", 2131951924);
        r8.v2(bundle);
        return r8;
    }

    public void F3(f f8) {
        this.z0 = f8;
    }

    public void G3(DialogInterface.OnCancelListener onCancelListener) {
        this.A0 = onCancelListener;
    }

    @Override
    public void J1() {
        super.J1();
    }

    @Override
    public void f3() {
        Object object;
        super.f3();
        this.I0 = object = (o)i.c(this.j0().getLong("command_id"));
        if (object == null) {
            c.h().f().b("not existing command id").h();
            this.Z2(false);
            this.N2();
            return;
        }
        if (object.s()) {
            object = (ax.Q2.f)((Object)this.j0().getSerializable("location"));
            this.K0 = object == null ? null : K.a((ax.Q2.f)((Object)object), this.j0().getInt("location_key"));
        } else {
            this.C0 = this.I0.q();
            this.B0 = ax.c3.x.d((ax.Q2.f)((Object)this.j0().getSerializable("location")), this.j0().getInt("location_key"));
        }
        this.E0 = this.j0().getInt("custom_title");
        this.F0 = this.j0().getInt("custom_message");
        this.G0 = this.j0().getBoolean("default_move_to_recycle_bin", false);
        this.H0 = this.j0().getBoolean("show_recycle_checkbox", false);
    }

    @Override
    public Dialog g3() {
        View view = ((LayoutInflater)this.f0().getSystemService("layout_inflater")).inflate(2131558499, null, false);
        this.t0 = (TextView)view.findViewById(2131362106);
        this.u0 = (TextView)view.findViewById(2131362105);
        Object object = (CheckBox)view.findViewById(2131362027);
        this.v0 = object;
        if (this.H0) {
            object.setVisibility(0);
        }
        this.v0.setChecked(this.G0 ^ true);
        this.w0 = this.v0.getTextColors();
        this.H3((Context)this.f0());
        this.v0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this){
            final r a;
            {
                this.a = r8;
            }

            public void onCheckedChanged(CompoundButton object, boolean bl) {
                this.a.I0.y(bl ^ true);
                this.a.t0.setText((CharSequence)this.a.B3(bl ^ true));
                this.a.Q2().setTitle(this.a.C3(bl ^ true));
                object = this.a;
                ((r)object).H3(((r)object).v0.getContext());
            }
        });
        object = ax.u3.h.a((Context)this.f0());
        int n8 = this.E0;
        object = n8 != 0 ? ((a.a)object).p(n8) : ((a.a)object).p(this.C3(this.G0));
        this.t0.setText(2131951875);
        ((a.a)object).b(true);
        ((a.a)object).setView(view);
        ((a.a)object).setNegativeButton(0x1040000, new t(this){
            final r b;
            {
                this.b = r8;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                if (this.b.A0 != null) {
                    this.b.A0.onCancel(dialogInterface);
                }
            }
        });
        ((a.a)object).setPositiveButton(17039370, new t(this){
            final r b;
            {
                this.b = r8;
            }

            @Override
            public void a(DialogInterface dialogInterface, int n8) {
                if (this.b.z0 != null) {
                    this.b.z0.a(true);
                }
            }
        });
        object = ((a.a)object).create();
        object.setCanceledOnTouchOutside(true);
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final r b;
            {
                this.b = r8;
                this.a = a8;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.b.D3(this.a);
            }
        });
        return object;
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public void v1() {
        com.voxdon.xplorer.file.f f8 = this.D0;
        if (f8 != null) {
            f8.e();
        }
        super.v1();
    }

    public static interface f {
        public void a(boolean var1);
    }

    class g
    extends q<Void, Void, List<n>> {
        com.voxdon.xplorer.file.o h;
        Exception i;
        Context j;
        final r k;

        g(r r8) {
            this.k = r8;
            super(q.e.e0);
            this.h = ax.c3.x.e(ax.T2.h.b0(r8.K0));
            this.j = r8.b();
        }

        protected List<n> w(Void ... object) {
            try {
                object = this.h;
                object = ((com.voxdon.xplorer.file.o)object).z(((com.voxdon.xplorer.file.o)object).V());
                object = this.h.f0((n)object);
                return object;
            }
            catch (ax.b3.j j8) {
                this.i = j8;
                return null;
            }
        }

        protected void x(List<n> serializable) {
            h.a a8 = this.k.I0.f();
            if (serializable != null) {
                j j8 = x.R0(this.h.t(), serializable);
                if (j8 != null) {
                    if (j8.a != K.f && !Q.L()) {
                        ax.Ha.b b8 = c.h().f().b("RECYCLEBIN EMPTY PERMISION NOT SDCARD");
                        serializable = new StringBuilder();
                        ((StringBuilder)serializable).append("location:");
                        ((StringBuilder)serializable).append(j8.a);
                        b8.g(((StringBuilder)serializable).toString()).h();
                    }
                    serializable = new ArrayList<String>();
                    ((ArrayList)serializable).add(j8.a.k());
                    ((ArrayList)serializable).add(j8.b);
                    a8.a(h.b.d0, "NEED_STORAGE_PERMISSION", null, (ArrayList<String>)serializable, null);
                    this.k.O2();
                    return;
                }
                r.p3(this.k, this.h);
                r.q3(this.k, serializable);
                this.k.I0.o(this.h, (List<n>)((Object)serializable), true, a8);
                new h(this.k).i(new Void[0]);
                return;
            }
            c.h().d("EMPTY_RECYCLE BIN").l(this.i).h();
            serializable = this.j.getString(2131952335);
            Toast.makeText((Context)this.j, (int)2131951927, (int)1).show();
            a8.a(h.b.d0, (String)((Object)serializable), null, null, null);
            this.k.O2();
        }
    }

    class h
    extends q<Void, Void, Void> {
        final r h;

        h(r r8) {
            this.h = r8;
            super(q.e.f0);
        }

        protected Void w(Void ... voidArray) {
            this.h.I0.k();
            return null;
        }

        protected void x(Void void_) {
            this.h.E3();
        }
    }
}

