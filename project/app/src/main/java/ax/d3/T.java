/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.d;
import androidx.preference.h;
import androidx.recyclerview.widget.RecyclerView;
import ax.Ha.c;
import ax.Q2.f;
import ax.X2.Q;
import ax.c3.K;
import ax.c3.d0;
import ax.d3.S;
import ax.t3.e;
import ax.u3.b;
import com.voxdon.xplorer.RadioGroupPreference;
import java.util.UnknownFormatConversionException;

public class T
extends d
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private CheckBoxPreference A0;
    private CheckBoxPreference B0;
    private boolean C0;
    private f m0;
    private int n0;
    private K o0;
    private String p0;
    private boolean q0;
    private RadioGroupPreference r0;
    private RadioGroup s0;
    private int t0;
    private RadioGroupPreference u0;
    private RadioGroup v0;
    private int w0;
    private ListPreference x0;
    private CheckBoxPreference y0;
    private CheckBoxPreference z0;

    private void A3() {
        if (!f.C0(this.m0)) {
            this.A0.N0(false);
            return;
        }
        if (!this.D3()) {
            this.A0.U0(e.i((Context)this.f0(), this.m0, this.n0, this.p0, this.q0));
        } else {
            b.f();
            this.A0.U0(e.i((Context)this.f0(), this.m0, this.n0, null, this.q0));
        }
        this.A0.G0(new Preference.d(this){
            final T a;
            {
                this.a = t8;
            }

            @Override
            public boolean a(Preference object, Object object2) {
                if (this.a.b() == null) {
                    return true;
                }
                if (!(object2 instanceof Boolean)) {
                    return true;
                }
                if (this.a.D3()) {
                    T.g3(this.a, true);
                    e.a(this.a.b(), this.a.m0, this.a.n0, this.a.q0, "show_thumbnails");
                    e.o(this.a.b(), this.a.m0, this.a.n0, null, this.a.q0, (Boolean)object2);
                    T.g3(this.a, false);
                    object = this.a.z0();
                    if (object instanceof ax.a3.d) {
                        ((ax.a3.d)object).S();
                    }
                    return false;
                }
                return true;
            }
        });
    }

    private void B3() {
        String string;
        if (this.m0 == f.z0) {
            this.x0.f1(2130903065);
            this.x0.h1(2130903066);
        } else {
            this.x0.f1(2130903067);
            this.x0.h1(2130903068);
        }
        if (!this.D3()) {
            string = e.j((Context)this.f0(), this.m0, this.n0, this.p0, this.q0);
        } else {
            b.f();
            string = e.j((Context)this.f0(), this.m0, this.n0, null, this.q0);
        }
        this.x0.j1(string);
        this.x0.G0(new Preference.d(this){
            final T a;
            {
                this.a = t8;
            }

            @Override
            public boolean a(Preference object, Object object2) {
                if (this.a.b() == null) {
                    return true;
                }
                if (!(object2 instanceof String)) {
                    return true;
                }
                if (this.a.D3()) {
                    T.g3(this.a, true);
                    e.a(this.a.b(), this.a.m0, this.a.n0, this.a.q0, "sort_type");
                    e.p(this.a.b(), this.a.m0, this.a.n0, null, this.a.q0, (String)object2);
                    T.g3(this.a, false);
                    object = this.a.z0();
                    if (object instanceof ax.a3.d) {
                        ((ax.a3.d)object).S();
                    }
                    return false;
                }
                return true;
            }
        });
    }

    private void C3(h object) {
        Context context = this.f0().getApplicationContext();
        ((RecyclerView.F)object).a.setFocusable(false);
        ((RecyclerView.F)object).a.setClickable(false);
        int n8 = e.k(context, this.m0, this.n0, this.p0, this.q0);
        object = this.r0.T0();
        this.s0 = object;
        if (object == null) {
            c.h().f().b("CRITICAL: onBindRadioGroup").h();
            return;
        }
        RecyclerView recyclerView = this.N2();
        object = null;
        if (recyclerView != null) {
            object = recyclerView.getItemAnimator();
            recyclerView.setItemAnimator(null);
        }
        if (n8 == 0) {
            this.s0.check(2131363036);
            this.t0 = 2131363036;
            this.z0.N0(false);
        } else if (n8 == 2) {
            this.s0.check(2131363035);
            this.t0 = 2131363035;
            if (this.E3()) {
                this.z0.N0(false);
            } else {
                this.z0.N0(true);
            }
        } else if (n8 == 1) {
            this.s0.check(2131363034);
            this.t0 = 2131363034;
            this.z0.N0(false);
        }
        RadioButton radioButton = (RadioButton)this.s0.findViewById(2131363036);
        RadioButton radioButton2 = (RadioButton)this.s0.findViewById(2131363035);
        RadioButton radioButton3 = (RadioButton)this.s0.findViewById(2131363034);
        Q.o(radioButton);
        Q.o(radioButton2);
        Q.o(radioButton3);
        ax.g3.c c8 = new ax.g3.c(this, context){
            final Context c;
            final T d;
            {
                this.d = t8;
                this.c = context;
            }

            @Override
            public void a(View view) {
                if (this.d.t0 == view.getId() && this.d.D3()) {
                    T t8 = this.d;
                    t8.J3(this.c, t8.t3(view.getId()));
                }
            }
        };
        radioButton.setOnClickListener((View.OnClickListener)c8);
        radioButton2.setOnClickListener((View.OnClickListener)c8);
        radioButton3.setOnClickListener((View.OnClickListener)c8);
        this.s0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            final Context a;
            final T b;
            {
                this.b = t8;
                this.a = context;
            }

            public void onCheckedChanged(RadioGroup object, int n8) {
                object = this.b;
                ((T)object).J3(this.a, ((T)object).t3(n8));
            }
        });
        if (recyclerView != null) {
            recyclerView.post(new S(recyclerView, (RecyclerView.m)object));
        }
    }

    private boolean D3() {
        return this.B0.T0();
    }

    private boolean E3() {
        if (!f.g0(this.m0)) {
            return false;
        }
        return d0.D(this.o0, this.p0);
    }

    private void F3() {
        if (this.m0 == f.V0) {
            PreferenceScreen preferenceScreen = this.P2();
            Object t8 = this.O2().a("settings_etc");
            if (t8 != null) {
                preferenceScreen.c1((Preference)t8);
            }
        }
    }

    private void G3() {
        if (this.q0) {
            this.P2().c1((Preference)this.O2().a("settings_view"));
        }
    }

    private void H3(boolean bl) {
        if (!this.u3()) {
            b.f();
            this.v3(null);
            this.B0.N0(false);
            return;
        }
        if (bl) {
            this.v3(null);
            return;
        }
        this.v3(this.p0);
    }

    private void I3(Context object, int n8) {
        if (this.D3()) {
            this.C0 = true;
            e.a(this.b(), this.m0, this.n0, this.q0, "icon_size");
            e.m(object, this.m0, this.n0, null, this.q0, n8);
            this.C0 = false;
            object = this.z0();
            if (object instanceof ax.a3.d) {
                ((ax.a3.d)object).S();
            }
            return;
        }
        e.m(object, this.m0, this.n0, this.p0, this.q0, n8);
    }

    private void J3(Context object, int n8) {
        if (this.D3()) {
            this.C0 = true;
            e.a(this.b(), this.m0, this.n0, this.q0, "view_type");
            e.q(object, this.m0, this.n0, null, this.q0, n8);
            this.C0 = false;
            object = this.z0();
            if (object instanceof ax.a3.d) {
                ((ax.a3.d)object).S();
            }
            return;
        }
        e.q(object, this.m0, this.n0, this.p0, this.q0, n8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void K3() {
        try {
            ListPreference listPreference = this.x0;
            listPreference.M0(listPreference.b1());
            return;
        }
        catch (UnknownFormatConversionException unknownFormatConversionException) {
            return;
        }
    }

    public static /* synthetic */ void d3(RecyclerView recyclerView, RecyclerView.m m8) {
        recyclerView.setItemAnimator(m8);
    }

    static /* synthetic */ boolean g3(T t8, boolean bl) {
        t8.C0 = bl;
        return bl;
    }

    private int s3(int n8) {
        if (n8 == 2131362388) {
            return 2;
        }
        if (n8 == 2131362387) {
            return 4;
        }
        b.f();
        return 2;
    }

    private int t3(int n8) {
        if (n8 == 2131363036) {
            return 0;
        }
        if (n8 == 2131363034) {
            return 1;
        }
        if (n8 == 2131363035) {
            return 2;
        }
        b.f();
        return 0;
    }

    private boolean u3() {
        return this.p0 != null && !this.q0;
    }

    private void v3(String string) {
        this.r0.D0(e.e("view_type", string, this.q0));
        this.u0.D0(e.e("icon_size", string, this.q0));
        this.x0.D0(e.e("sort_type", string, this.q0));
        this.y0.D0(e.e("show_hidden", string, this.q0));
        this.z0.D0(e.e("hide_grid_filename", string, this.q0));
        this.A0.D0(e.e("show_thumbnails", string, this.q0));
    }

    private void w3() {
        int n8;
        f f8;
        Bundle bundle = this.j0();
        if (bundle == null) {
            this.f0().finish();
            return;
        }
        this.m0 = f8 = (f)((Object)bundle.getSerializable("location"));
        this.n0 = n8 = f.F(f8, bundle.getInt("locationKey"));
        this.o0 = K.a(this.m0, n8);
        this.p0 = bundle.getString("folderPath");
        this.q0 = bundle.getBoolean("show_analysis", false);
        this.O2().s(e.f(this.m0, this.n0, this.q0));
        this.K2(2132148234);
        this.B0 = (CheckBoxPreference)this.n("apply_to_all");
        this.r0 = (RadioGroupPreference)this.n("view_type");
        this.u0 = (RadioGroupPreference)this.n("icon_size");
        this.x0 = (ListPreference)this.n("sort_type");
        this.y0 = (CheckBoxPreference)this.n("show_hidden");
        this.z0 = (CheckBoxPreference)this.n("hide_grid_filename");
        this.A0 = (CheckBoxPreference)this.n("show_thumbnails");
        if (this.u3()) {
            this.v3(this.p0);
        } else {
            this.B0.N0(false);
        }
        this.B3();
        this.z3();
        this.A3();
        this.x3();
        this.r0.U0(new RadioGroupPreference.a(this){
            final T a;
            {
                this.a = t8;
            }

            @Override
            public void a(h h8) {
                this.a.C3(h8);
            }
        });
        this.u0.U0(new RadioGroupPreference.a(this){
            final T a;
            {
                this.a = t8;
            }

            @Override
            public void a(h h8) {
                this.a.y3(h8);
            }
        });
        this.B0.G0(new Preference.d(this){
            final T a;
            {
                this.a = t8;
            }

            @Override
            public boolean a(Preference preference, Object object) {
                if (object instanceof Boolean) {
                    if (((Boolean)object).booleanValue()) {
                        this.a.H3(true);
                    } else {
                        this.a.H3(false);
                    }
                }
                return true;
            }
        });
        this.F3();
        this.G3();
    }

    private void x3() {
        if (!this.D3()) {
            this.z0.U0(e.c((Context)this.f0(), this.m0, this.n0, this.p0, this.q0));
        } else {
            b.f();
            this.z0.U0(e.c((Context)this.f0(), this.m0, this.n0, null, this.q0));
        }
        this.z0.G0(new Preference.d(this){
            final T a;
            {
                this.a = t8;
            }

            @Override
            public boolean a(Preference object, Object object2) {
                if (this.a.b() == null) {
                    return true;
                }
                if (!(object2 instanceof Boolean)) {
                    return true;
                }
                if (this.a.D3()) {
                    T.g3(this.a, true);
                    e.a(this.a.b(), this.a.m0, this.a.n0, this.a.q0, "hide_grid_filename");
                    e.l(this.a.b(), this.a.m0, this.a.n0, null, this.a.q0, (Boolean)object2);
                    T.g3(this.a, false);
                    object = this.a.z0();
                    if (object instanceof ax.a3.d) {
                        ((ax.a3.d)object).S();
                    }
                    return false;
                }
                return true;
            }
        });
    }

    private void y3(h object) {
        Context context = this.f0().getApplicationContext();
        ((RecyclerView.F)object).a.setFocusable(false);
        ((RecyclerView.F)object).a.setClickable(false);
        int n8 = e.d(context, this.m0, this.n0, this.p0, this.q0);
        object = this.u0.T0();
        this.v0 = object;
        if (object == null) {
            c.h().f().b("CRITICAL: onBindRadioGroup 2").h();
            return;
        }
        if (n8 == 4) {
            object.check(2131362387);
            this.w0 = 2131362387;
        } else {
            object.check(2131362388);
            this.w0 = 2131362388;
        }
        RadioButton radioButton = (RadioButton)this.v0.findViewById(2131362388);
        RadioButton radioButton2 = (RadioButton)this.v0.findViewById(2131362387);
        Q.o(radioButton);
        Q.o(radioButton2);
        object = new ax.g3.c(this, context){
            final Context c;
            final T d;
            {
                this.d = t8;
                this.c = context;
            }

            @Override
            public void a(View view) {
                if (this.d.w0 == view.getId() && this.d.D3()) {
                    T t8 = this.d;
                    t8.I3(this.c, t8.s3(view.getId()));
                }
            }
        };
        radioButton.setOnClickListener((View.OnClickListener)object);
        radioButton2.setOnClickListener((View.OnClickListener)object);
        this.v0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            final Context a;
            final T b;
            {
                this.b = t8;
                this.a = context;
            }

            public void onCheckedChanged(RadioGroup object, int n8) {
                object = this.b;
                ((T)object).I3(this.a, ((T)object).s3(n8));
            }
        });
    }

    private void z3() {
        if (!this.D3()) {
            this.y0.U0(e.h((Context)this.f0(), this.m0, this.n0, this.p0, this.q0));
        } else {
            b.f();
            this.y0.U0(e.h((Context)this.f0(), this.m0, this.n0, null, this.q0));
        }
        this.y0.G0(new Preference.d(this){
            final T a;
            {
                this.a = t8;
            }

            @Override
            public boolean a(Preference object, Object object2) {
                if (this.a.b() == null) {
                    return true;
                }
                if (!(object2 instanceof Boolean)) {
                    return true;
                }
                if (this.a.D3()) {
                    T.g3(this.a, true);
                    e.a(this.a.b(), this.a.m0, this.a.n0, this.a.q0, "show_hidden");
                    e.n(this.a.b(), this.a.m0, this.a.n0, null, this.a.q0, (Boolean)object2);
                    T.g3(this.a, false);
                    object = this.a.z0();
                    if (object instanceof ax.a3.d) {
                        ((ax.a3.d)object).S();
                    }
                    return false;
                }
                return true;
            }
        });
    }

    @Override
    public void D1() {
        this.P2().L().unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
        super.D1();
    }

    @Override
    public void H1() {
        super.H1();
        this.K3();
        this.P2().L().registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }

    @Override
    public void T2(Bundle bundle, String string) {
        this.w3();
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    public void onSharedPreferenceChanged(SharedPreferences object, String string) {
        if (!this.C0) {
            this.K3();
            object = this.z0();
            if (object instanceof ax.a3.d) {
                if (this.D3()) {
                    this.C0 = true;
                    e.a(this.b(), this.m0, this.n0, this.q0, string);
                    this.C0 = false;
                }
                ((ax.a3.d)object).S();
            }
        }
    }
}

