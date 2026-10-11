package ax.d3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import ax.a3.C1348d;
import ax.u3.C3184b;
import com.voxdon.xplorer.RadioGroupPreference;
import com.voxdon.xplorer.R;
import java.util.UnknownFormatConversionException;

/* loaded from: classes.dex */
public class T extends androidx.preference.d implements SharedPreferences.OnSharedPreferenceChangeListener {
    private CheckBoxPreference A0;
    private CheckBoxPreference B0;
    private boolean C0;
    private ax.Q2.f m0;
    private int n0;
    private ax.c3.K o0;
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

    class a implements Preference.d {
        a() {
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference, Object obj) {
            if (T.this.b() == null || !(obj instanceof Boolean) || !T.this.D3()) {
                return true;
            }
            T.this.C0 = true;
            ax.t3.e.a(T.this.b(), T.this.m0, T.this.n0, T.this.q0, "show_hidden");
            ax.t3.e.n(T.this.b(), T.this.m0, T.this.n0, null, T.this.q0, ((Boolean) obj).booleanValue());
            T.this.C0 = false;
            Fragment z0 = T.this.z0();
            if (z0 instanceof C1348d) {
                ((C1348d) z0).S();
            }
            return false;
        }
    }

    class b implements Preference.d {
        b() {
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference, Object obj) {
            if (T.this.b() == null || !(obj instanceof Boolean) || !T.this.D3()) {
                return true;
            }
            T.this.C0 = true;
            ax.t3.e.a(T.this.b(), T.this.m0, T.this.n0, T.this.q0, "show_thumbnails");
            ax.t3.e.o(T.this.b(), T.this.m0, T.this.n0, null, T.this.q0, ((Boolean) obj).booleanValue());
            T.this.C0 = false;
            Fragment z0 = T.this.z0();
            if (z0 instanceof C1348d) {
                ((C1348d) z0).S();
            }
            return false;
        }
    }

    class c implements RadioGroupPreference.a {
        c() {
        }

        @Override // com.voxdon.xplorer.RadioGroupPreference.a
        public void a(androidx.preference.h hVar) {
            T.this.C3(hVar);
        }
    }

    class d implements RadioGroupPreference.a {
        d() {
        }

        @Override // com.voxdon.xplorer.RadioGroupPreference.a
        public void a(androidx.preference.h hVar) {
            T.this.y3(hVar);
        }
    }

    class e implements Preference.d {
        e() {
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference, Object obj) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    T.this.H3(true);
                } else {
                    T.this.H3(false);
                }
            }
            return true;
        }
    }

    class f extends ax.g3.c {
        final /* synthetic */ Context c;

        f(Context context) {
            this.c = context;
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (T.this.w0 == view.getId() && T.this.D3()) {
                T t = T.this;
                t.I3(this.c, t.s3(view.getId()));
            }
        }
    }

    class g implements RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ Context a;

        g(Context context) {
            this.a = context;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            T t = T.this;
            t.I3(this.a, t.s3(i));
        }
    }

    class h extends ax.g3.c {
        final /* synthetic */ Context c;

        h(Context context) {
            this.c = context;
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (T.this.t0 == view.getId() && T.this.D3()) {
                T t = T.this;
                t.J3(this.c, t.t3(view.getId()));
            }
        }
    }

    class i implements RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ Context a;

        i(Context context) {
            this.a = context;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            T t = T.this;
            t.J3(this.a, t.t3(i));
        }
    }

    class j implements Preference.d {
        j() {
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference, Object obj) {
            if (T.this.b() == null || !(obj instanceof String) || !T.this.D3()) {
                return true;
            }
            T.this.C0 = true;
            ax.t3.e.a(T.this.b(), T.this.m0, T.this.n0, T.this.q0, "sort_type");
            ax.t3.e.p(T.this.b(), T.this.m0, T.this.n0, null, T.this.q0, (String) obj);
            T.this.C0 = false;
            Fragment z0 = T.this.z0();
            if (z0 instanceof C1348d) {
                ((C1348d) z0).S();
            }
            return false;
        }
    }

    class k implements Preference.d {
        k() {
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference, Object obj) {
            if (T.this.b() == null || !(obj instanceof Boolean) || !T.this.D3()) {
                return true;
            }
            T.this.C0 = true;
            ax.t3.e.a(T.this.b(), T.this.m0, T.this.n0, T.this.q0, "hide_grid_filename");
            ax.t3.e.l(T.this.b(), T.this.m0, T.this.n0, null, T.this.q0, ((Boolean) obj).booleanValue());
            T.this.C0 = false;
            Fragment z0 = T.this.z0();
            if (z0 instanceof C1348d) {
                ((C1348d) z0).S();
            }
            return false;
        }
    }

    private void A3() {
        if (!ax.Q2.f.C0(this.m0)) {
            this.A0.N0(false);
            return;
        }
        if (D3()) {
            C3184b.f();
            this.A0.U0(ax.t3.e.i(f0(), this.m0, this.n0, null, this.q0));
        } else {
            this.A0.U0(ax.t3.e.i(f0(), this.m0, this.n0, this.p0, this.q0));
        }
        this.A0.G0(new b());
    }

    private void B3() {
        String j2;
        if (this.m0 == ax.Q2.f.z0) {
            this.x0.f1(R.array.settings_image_sort_method_entries);
            this.x0.h1(R.array.settings_image_sort_method_values);
        } else {
            this.x0.f1(R.array.settings_sort_method_entries);
            this.x0.h1(R.array.settings_sort_method_values);
        }
        if (D3()) {
            C3184b.f();
            j2 = ax.t3.e.j(f0(), this.m0, this.n0, null, this.q0);
        } else {
            j2 = ax.t3.e.j(f0(), this.m0, this.n0, this.p0, this.q0);
        }
        this.x0.j1(j2);
        this.x0.G0(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(androidx.preference.h hVar) {
        Context applicationContext = f0().getApplicationContext();
        hVar.a.setFocusable(false);
        hVar.a.setClickable(false);
        int k2 = ax.t3.e.k(applicationContext, this.m0, this.n0, this.p0, this.q0);
        RadioGroup T0 = this.r0.T0();
        this.s0 = T0;
        if (T0 == null) {
            ax.Ha.c.h().f().b("CRITICAL: onBindRadioGroup").h();
            return;
        }
        final RecyclerView N2 = N2();
        final RecyclerView.m mVar = null;
        if (N2 != null) {
            RecyclerView.m itemAnimator = N2.getItemAnimator();
            N2.setItemAnimator(null);
            mVar = itemAnimator;
        }
        if (k2 == 0) {
            this.s0.check(R.id.view_list);
            this.t0 = R.id.view_list;
            this.z0.N0(false);
        } else if (k2 == 2) {
            this.s0.check(R.id.view_grid);
            this.t0 = R.id.view_grid;
            if (E3()) {
                this.z0.N0(false);
            } else {
                this.z0.N0(true);
            }
        } else if (k2 == 1) {
            this.s0.check(R.id.view_details);
            this.t0 = R.id.view_details;
            this.z0.N0(false);
        }
        RadioButton radioButton = (RadioButton) this.s0.findViewById(R.id.view_list);
        RadioButton radioButton2 = (RadioButton) this.s0.findViewById(R.id.view_grid);
        RadioButton radioButton3 = (RadioButton) this.s0.findViewById(R.id.view_details);
        ax.X2.Q.o(radioButton);
        ax.X2.Q.o(radioButton2);
        ax.X2.Q.o(radioButton3);
        h hVar2 = new h(applicationContext);
        radioButton.setOnClickListener(hVar2);
        radioButton2.setOnClickListener(hVar2);
        radioButton3.setOnClickListener(hVar2);
        this.s0.setOnCheckedChangeListener(new i(applicationContext));
        if (N2 != null) {
            N2.post(new Runnable() { // from class: ax.d3.S
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerView.this.setItemAnimator(mVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D3() {
        return this.B0.T0();
    }

    private boolean E3() {
        if (ax.Q2.f.g0(this.m0)) {
            return ax.c3.d0.D(this.o0, this.p0);
        }
        return false;
    }

    private void F3() {
        if (this.m0 == ax.Q2.f.V0) {
            PreferenceScreen P2 = P2();
            Preference a2 = O2().a("settings_etc");
            if (a2 != null) {
                P2.c1(a2);
            }
        }
    }

    private void G3() {
        if (this.q0) {
            P2().c1(O2().a("settings_view"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H3(boolean z) {
        if (!u3()) {
            C3184b.f();
            v3(null);
            this.B0.N0(false);
        } else if (z) {
            v3(null);
        } else {
            v3(this.p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I3(Context context, int i2) {
        if (!D3()) {
            ax.t3.e.m(context, this.m0, this.n0, this.p0, this.q0, i2);
            return;
        }
        this.C0 = true;
        ax.t3.e.a(b(), this.m0, this.n0, this.q0, "icon_size");
        ax.t3.e.m(context, this.m0, this.n0, null, this.q0, i2);
        this.C0 = false;
        Fragment z0 = z0();
        if (z0 instanceof C1348d) {
            ((C1348d) z0).S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J3(Context context, int i2) {
        if (!D3()) {
            ax.t3.e.q(context, this.m0, this.n0, this.p0, this.q0, i2);
            return;
        }
        this.C0 = true;
        ax.t3.e.a(b(), this.m0, this.n0, this.q0, "view_type");
        ax.t3.e.q(context, this.m0, this.n0, null, this.q0, i2);
        this.C0 = false;
        Fragment z0 = z0();
        if (z0 instanceof C1348d) {
            ((C1348d) z0).S();
        }
    }

    private void K3() {
        try {
            ListPreference listPreference = this.x0;
            listPreference.M0(listPreference.b1());
        } catch (UnknownFormatConversionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s3(int i2) {
        if (i2 == R.id.icon_medium) {
            return 2;
        }
        if (i2 == R.id.icon_large) {
            return 4;
        }
        C3184b.f();
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t3(int i2) {
        if (i2 == R.id.view_list) {
            return 0;
        }
        if (i2 == R.id.view_details) {
            return 1;
        }
        if (i2 == R.id.view_grid) {
            return 2;
        }
        C3184b.f();
        return 0;
    }

    private boolean u3() {
        return (this.p0 == null || this.q0) ? false : true;
    }

    private void v3(String str) {
        this.r0.D0(ax.t3.e.e("view_type", str, this.q0));
        this.u0.D0(ax.t3.e.e("icon_size", str, this.q0));
        this.x0.D0(ax.t3.e.e("sort_type", str, this.q0));
        this.y0.D0(ax.t3.e.e("show_hidden", str, this.q0));
        this.z0.D0(ax.t3.e.e("hide_grid_filename", str, this.q0));
        this.A0.D0(ax.t3.e.e("show_thumbnails", str, this.q0));
    }

    private void w3() {
        Bundle j0 = j0();
        if (j0 == null) {
            f0().finish();
            return;
        }
        ax.Q2.f fVar = (ax.Q2.f) j0.getSerializable("location");
        this.m0 = fVar;
        int F = ax.Q2.f.F(fVar, j0.getInt("locationKey"));
        this.n0 = F;
        this.o0 = ax.c3.K.a(this.m0, F);
        this.p0 = j0.getString("folderPath");
        this.q0 = j0.getBoolean("show_analysis", false);
        O2().s(ax.t3.e.f(this.m0, this.n0, this.q0));
        K2(R.xml.location_settings);
        this.B0 = (CheckBoxPreference) n("apply_to_all");
        this.r0 = (RadioGroupPreference) n("view_type");
        this.u0 = (RadioGroupPreference) n("icon_size");
        this.x0 = (ListPreference) n("sort_type");
        this.y0 = (CheckBoxPreference) n("show_hidden");
        this.z0 = (CheckBoxPreference) n("hide_grid_filename");
        this.A0 = (CheckBoxPreference) n("show_thumbnails");
        if (u3()) {
            v3(this.p0);
        } else {
            this.B0.N0(false);
        }
        B3();
        z3();
        A3();
        x3();
        this.r0.U0(new c());
        this.u0.U0(new d());
        this.B0.G0(new e());
        F3();
        G3();
    }

    private void x3() {
        if (D3()) {
            C3184b.f();
            this.z0.U0(ax.t3.e.c(f0(), this.m0, this.n0, null, this.q0));
        } else {
            this.z0.U0(ax.t3.e.c(f0(), this.m0, this.n0, this.p0, this.q0));
        }
        this.z0.G0(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y3(androidx.preference.h hVar) {
        Context applicationContext = f0().getApplicationContext();
        hVar.a.setFocusable(false);
        hVar.a.setClickable(false);
        int d2 = ax.t3.e.d(applicationContext, this.m0, this.n0, this.p0, this.q0);
        RadioGroup T0 = this.u0.T0();
        this.v0 = T0;
        if (T0 == null) {
            ax.Ha.c.h().f().b("CRITICAL: onBindRadioGroup 2").h();
            return;
        }
        if (d2 == 4) {
            T0.check(R.id.icon_large);
            this.w0 = R.id.icon_large;
        } else {
            T0.check(R.id.icon_medium);
            this.w0 = R.id.icon_medium;
        }
        RadioButton radioButton = (RadioButton) this.v0.findViewById(R.id.icon_medium);
        RadioButton radioButton2 = (RadioButton) this.v0.findViewById(R.id.icon_large);
        ax.X2.Q.o(radioButton);
        ax.X2.Q.o(radioButton2);
        f fVar = new f(applicationContext);
        radioButton.setOnClickListener(fVar);
        radioButton2.setOnClickListener(fVar);
        this.v0.setOnCheckedChangeListener(new g(applicationContext));
    }

    private void z3() {
        if (D3()) {
            C3184b.f();
            this.y0.U0(ax.t3.e.h(f0(), this.m0, this.n0, null, this.q0));
        } else {
            this.y0.U0(ax.t3.e.h(f0(), this.m0, this.n0, this.p0, this.q0));
        }
        this.y0.G0(new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void D1() {
        P2().L().unregisterOnSharedPreferenceChangeListener(this);
        super.D1();
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        K3();
        P2().L().registerOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.preference.d
    public void T2(Bundle bundle, String str) {
        w3();
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.C0) {
            return;
        }
        K3();
        Fragment z0 = z0();
        if (z0 instanceof C1348d) {
            if (D3()) {
                this.C0 = true;
                ax.t3.e.a(b(), this.m0, this.n0, this.q0, str);
                this.C0 = false;
            }
            ((C1348d) z0).S();
        }
    }
}
