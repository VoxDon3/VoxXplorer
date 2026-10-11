/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.f;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import ax.T.b;
import ax.U2.d;
import ax.W2.h;
import ax.W2.o;
import ax.X2.J;
import ax.X2.Q;
import ax.Z2.a;
import ax.Z2.j;
import ax.a3.n;
import ax.b3.c;
import ax.c3.B;
import ax.c3.K;
import ax.c3.t;
import ax.d3.Y;
import ax.d3.m0;
import ax.d3.s;
import ax.u3.g;
import ax.u3.r;
import ax.u3.z;
import com.alphainventor.filemanager.activity.DefaultsSettingsActivity;
import com.alphainventor.filemanager.activity.PaymentActivity;
import com.alphainventor.filemanager.activity.UsbAttachActivity;
import com.alphainventor.filemanager.file.f;
import com.alphainventor.filemanager.file.x;
import com.alphainventor.filemanager.file.y;
import com.alphainventor.filemanager.service.CommandService;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class n0
extends androidx.preference.d
implements s,
SharedPreferences.OnSharedPreferenceChangeListener,
Y {
    private boolean m0 = false;
    private ax.i.r n0;
    private PreferenceScreen o0;

    private void g3(PreferenceScreen preferenceScreen, ArrayList<com.alphainventor.filemanager.file.n> arrayList, int n8) {
        o.l(this, ax.c3.x.e(K.e), arrayList, 1, false, false, n8, 2131952655, new h.a(){
            final PreferenceScreen a;
            final n0 b;
            {
                this.b = n02;
                this.a = preferenceScreen;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                if (this.b.X0() && this.b.b() != null) {
                    this.b.q3(this.a);
                    this.a.H0(null);
                }
            }

            @Override
            public void b() {
            }
        }, null);
    }

    private boolean i3() {
        PreferenceGroup preferenceGroup = this.P2();
        if (preferenceGroup != null) {
            for (preferenceGroup = preferenceGroup.E(); preferenceGroup != null; preferenceGroup = preferenceGroup.E()) {
                if (!(preferenceGroup instanceof PreferenceScreen)) continue;
                this.a3((PreferenceScreen)preferenceGroup);
                this.u3();
                return true;
            }
        }
        return false;
    }

    private void j3(PreferenceScreen preferenceScreen, ArrayList<com.alphainventor.filemanager.file.n> arrayList, int n8) {
        com.alphainventor.filemanager.file.o o8 = ax.c3.x.e(K.e);
        new com.alphainventor.filemanager.file.f(f.c.q, o8, arrayList, false, new f.b(){
            final PreferenceScreen a;
            final ArrayList b;
            final int c;
            final n0 d;
            {
                this.d = n02;
                this.a = preferenceScreen;
                this.b = arrayList;
                this.c = n8;
            }

            @Override
            public void a(int n8, int n9, long l8, Map<String, f.a> context) {
                PreferenceScreen preferenceScreen;
                context = this.d.b();
                if (this.d.X0() && context != null && (preferenceScreen = this.a) != null) {
                    preferenceScreen.J0(B.i(context, l8));
                    if (l8 == 0L) {
                        this.a.H0(null);
                        return;
                    }
                    this.a.H0(new Preference.e(this){
                        final e a;
                        {
                            this.a = e8;
                        }

                        @Override
                        public boolean a(Preference object) {
                            object = this.a;
                            object.d.g3(object.a, object.b, object.c);
                            return true;
                        }
                    });
                }
            }

            @Override
            public void b(int n8, int n9, long l8) {
                PreferenceScreen preferenceScreen;
                Context context = this.d.b();
                if (this.d.X0() && context != null && (preferenceScreen = this.a) != null) {
                    preferenceScreen.J0(B.i(context, l8));
                }
            }
        }).i(new Void[0]);
    }

    private void k3() {
        ArrayList<com.alphainventor.filemanager.file.n> arrayList;
        if (this.b() == null) {
            return;
        }
        y y8 = x.O0(a.k(this.b()));
        PreferenceScreen preferenceScreen = (PreferenceScreen)this.o0.V0("clear_network_storage_cache");
        if (!y8.n()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<com.alphainventor.filemanager.file.n>();
            arrayList.add(y8);
        }
        this.m3(preferenceScreen, arrayList, 2131952056);
    }

    private void l3() {
        ArrayList<com.alphainventor.filemanager.file.n> arrayList;
        if (this.b() == null) {
            return;
        }
        y y8 = x.O0(a.n(this.b()));
        PreferenceScreen preferenceScreen = (PreferenceScreen)this.o0.V0("clear_other_temporary_files");
        if (!y8.n()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<com.alphainventor.filemanager.file.n>();
            arrayList.add(y8);
        }
        this.m3(preferenceScreen, arrayList, 2131952057);
    }

    private void m3(PreferenceScreen preferenceScreen, ArrayList<com.alphainventor.filemanager.file.n> arrayList, int n8) {
        preferenceScreen.H0(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.j3(preferenceScreen, arrayList, n8);
            return;
        }
        this.q3(preferenceScreen);
    }

    private void n3() {
        this.k3();
        this.o3();
        this.l3();
    }

    private void o3() {
        ArrayList<com.alphainventor.filemanager.file.n> arrayList;
        if (this.b() == null) {
            return;
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen)this.o0.V0("clear_thumbnails");
        ArrayList<File> arrayList2 = a.o(this.b());
        if (arrayList2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<com.alphainventor.filemanager.file.n>();
            int n8 = arrayList2.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                File file = arrayList2.get(i8);
                arrayList.add(x.O0(file));
            }
        }
        this.m3(preferenceScreen, arrayList, 2131952058);
    }

    private void p3(Context context) {
        ListPreference listPreference = (ListPreference)this.o0.V0("list_date_format");
        if (listPreference != null) {
            long l8 = System.currentTimeMillis();
            listPreference.g1(new String[]{t.c(context, l8), t.d(context, l8), t.e(context, l8)});
        }
    }

    private void q3(PreferenceScreen preferenceScreen) {
        preferenceScreen.J0(B.i(this.b(), 0L));
    }

    private void r3() {
        Object t8 = this.o0.V0("app_backup_storage");
        if (t8 != null) {
            ((Preference)t8).N0(d.T());
        }
    }

    private void s3() {
        Object t8 = this.o0.V0("settings_payment");
        Object t9 = this.o0.V0("payment_screen");
        ListPreference listPreference = (ListPreference)this.o0.V0("night_mode");
        if (!ax.t3.c.n().m() && !ax.t3.c.n().o()) {
            ((Preference)t8).N0(false);
            ((Preference)t9).N0(false);
            listPreference.N0(false);
        } else if (ax.t3.g.c() && this.b() != null) {
            if (ax.t3.g.e()) {
                ((Preference)t9).L0(2131952657);
            } else {
                ((Preference)t9).M0(this.N0(2131952507, ax.t3.g.a(this.b())));
            }
        }
        if (!ax.t3.g.c()) {
            listPreference.N0(false);
            return;
        }
        listPreference.N0(true);
        if (ax.t3.j.i(this.b()) != 0) {
            listPreference.f1(2130903060);
            listPreference.h1(2130903062);
        }
    }

    private void t3(String string) {
        ((ListPreference)this.o0.V0(string)).J0("%s");
    }

    private void u3() {
        PreferenceScreen preferenceScreen = this.P2();
        if (preferenceScreen != null) {
            if ("root".equals(preferenceScreen.B())) {
                this.n0.j(false);
                return;
            }
            this.n0.j(true);
        }
    }

    private void v3() {
        if (ax.t3.j.l(this.b()) > 100) {
            this.t3("storage_full_threshold");
            return;
        }
        ((ListPreference)this.o0.V0("storage_full_threshold")).J0(this.M0(2131952631));
    }

    private void w3(String string) {
        if (string.equals("storage_full_threshold") || string.equals("ALL")) {
            this.v3();
        }
        if (string.equals("file_size_unit") || string.equals("ALL")) {
            this.t3("file_size_unit");
        }
        if (string.equals("night_mode") || string.equals("ALL")) {
            this.t3("night_mode");
        }
        if (string.equals("music_player_engine") || string.equals("ALL")) {
            this.t3("music_player_engine");
        }
        if (string.equals("list_date_format") || string.equals("ALL")) {
            this.t3("list_date_format");
        }
        if (!string.equals("app_backup_storage") && !string.equals("ALL")) {
            return;
        }
        this.t3("app_backup_storage");
    }

    @Override
    public boolean A(androidx.fragment.app.e e8, String string, boolean bl) {
        if (!this.h3()) {
            return false;
        }
        ax.u3.B.d0(this.s0(), e8, string, bl);
        return true;
    }

    @Override
    public void D1() {
        super.D1();
        this.O2().l().unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
        if (this.m0) {
            Intent intent = new Intent("local.intent.action.SETTING_CHANGED");
            g.a().e(intent);
            this.m0 = false;
        }
    }

    @Override
    public void H1() {
        super.H1();
        this.s3();
        this.w3("ALL");
        this.r3();
        this.O2().l().registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
        ((Preference)this.o0.V0("show_drawer_always")).N0(false);
        ((Preference)this.o0.V0("show_history")).N0(false);
        if (((ax.n.c)this.f0()).getSupportActionBar() != null) {
            ((ax.n.c)this.f0()).getSupportActionBar().G(2131952303);
        }
    }

    @Override
    public void R(PreferenceScreen preferenceScreen) {
        super.R(preferenceScreen);
        if ("temporary_files_screen".equals(preferenceScreen.B())) {
            this.n3();
        }
        this.a3(preferenceScreen);
        this.u3();
    }

    @Override
    public void T2(Bundle object, String string) {
        this.b3(2132148241, string);
        object = this.P2();
        this.o0 = object;
        string = ((PreferenceGroup)object).V0("about_screen");
        if (string != null) {
            try {
                object = this.f0().getPackageManager().getPackageInfo((String)this.f0().getPackageName(), (int)0).versionName;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object = "";
            }
            ((Preference)((Object)string)).J0(this.N0(2131952690, object));
            ((Preference)((Object)string)).H0(new Preference.e(this){
                final n0 a;
                {
                    this.a = n02;
                }

                @Override
                public boolean a(Preference preference) {
                    androidx.fragment.app.t t8 = this.a.s0().o();
                    t8.s(2131362331, new m0(), preference.B());
                    t8.g(preference.B());
                    t8.i();
                    return true;
                }
            });
        }
        if ((object = this.o0.V0("payment_screen")) != null) {
            ((Preference)object).H0(new Preference.e(this){
                final n0 a;
                {
                    this.a = n02;
                }

                @Override
                public boolean a(Preference preference) {
                    if (this.a.f0() == null) {
                        return false;
                    }
                    preference = new Intent((Context)this.a.f0(), PaymentActivity.class);
                    this.a.F2((Intent)preference);
                    return true;
                }
            });
        }
        if ((object = this.o0.V0("defaults_screen")) != null) {
            ((Preference)object).H0(new Preference.e(this){
                final n0 a;
                {
                    this.a = n02;
                }

                @Override
                public boolean a(Preference preference) {
                    if (this.a.f0() == null) {
                        return false;
                    }
                    preference = new Intent((Context)this.a.f0(), DefaultsSettingsActivity.class);
                    this.a.F2((Intent)preference);
                    return true;
                }
            });
        }
        if (!Q.b2()) {
            ((Preference)this.o0.V0("file_size_unit")).N0(false);
        }
        ((Preference)this.o0.V0("show_add_to_favorite")).N0(false);
        object = this.o0.V0("root_access_mode");
        if (!r.g()) {
            ((Preference)object).N0(false);
        } else {
            ((Preference)object).N0(true);
        }
        object = this.o0.V0("show_dual_apps");
        if (j.F().i0()) {
            ((Preference)object).N0(true);
        } else {
            ((Preference)object).N0(false);
        }
        if (!Q.N0()) {
            ((Preference)this.o0.V0("use_internal_video_player")).N0(false);
        }
        if (J.G()) {
            ((Preference)this.o0.V0("detect_usb_attached")).N0(false);
        }
        this.r3();
        this.p3(this.b());
        this.s3();
    }

    public boolean h3() {
        return ax.u3.B.F(this, true);
    }

    @Override
    public void l(h h8, boolean bl) throws c {
        f f8 = this.f0();
        if (f8 == null) {
            return;
        }
        CommandService.M(f8, this, h8, bl, h8 instanceof ax.W2.B ^ true);
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        this.n0 = new ax.i.r(this, false){
            final n0 d;
            {
                this.d = n02;
                super(bl);
            }

            @Override
            public void d() {
                this.d.i3();
            }
        };
        this.n2().getOnBackPressedDispatcher().h(this, this.n0);
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        RecyclerView recyclerView = this.N2();
        if (!bl && recyclerView != null) {
            recyclerView.setPadding(0, 0, 0, b8.d);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences object, String string) {
        object = string;
        if (string == null) {
            ax.u3.b.f();
            object = "ALL";
        }
        this.m0 = true;
        this.w3((String)object);
        if ("night_mode".equals(object)) {
            z.q(this.f0());
            ax.n.f.N(ax.t3.j.i(this.b()));
            g.a().f("local.intent.action.THEME_CHANGED");
            ax.P.b.r(this.f0());
            return;
        }
        if ("detect_usb_attached".equals(object)) {
            boolean bl = ax.t3.j.b(this.b());
            ax.u3.B.c0(this.b(), UsbAttachActivity.class, bl);
            return;
        }
        if ("root_access_mode".equals(object)) {
            if (ax.t3.j.k(this.b()) && this.s0() != null) {
                n.k3(2131952582, 2131952583, 17039370, 0).c3(this.s0(), "dialog");
                return;
            }
        } else {
            if ("file_size_unit".equals(object)) {
                g.a().f("local.intent.action.FILE_SIZE_UNIT_CHANGED");
                return;
            }
            if ("show_dual_apps".equals(object)) {
                j.F().F0();
            }
        }
    }
}

