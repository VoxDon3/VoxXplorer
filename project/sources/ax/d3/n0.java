package ax.d3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import ax.W2.h;
import ax.a3.C1358n;
import ax.b3.C1488c;
import ax.c3.C1809B;
import ax.c3.C1831t;
import ax.c3.C1835x;
import ax.n.AbstractC2564f;
import ax.n.ActivityC2561c;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3189g;
import ax.u3.C3200r;
import com.voxdon.xplorer.activity.DefaultsSettingsActivity;
import com.voxdon.xplorer.activity.PaymentActivity;
import com.voxdon.xplorer.activity.UsbAttachActivity;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3587f;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class n0 extends androidx.preference.d implements InterfaceC1931s, SharedPreferences.OnSharedPreferenceChangeListener, Y {
    private boolean m0 = false;
    private ax.i.r n0;
    private PreferenceScreen o0;

    class a extends ax.i.r {
        a(boolean z) {
            super(z);
        }

        @Override // ax.i.r
        public void d() {
            n0.this.i3();
        }
    }

    class b implements Preference.e {
        b() {
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            androidx.fragment.app.t o = n0.this.s0().o();
            o.s(R.id.fragment_container, new m0(), preference.B());
            o.g(preference.B());
            o.i();
            return true;
        }
    }

    class c implements Preference.e {
        c() {
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            if (n0.this.f0() == null) {
                return false;
            }
            n0.this.F2(new Intent(n0.this.f0(), (Class<?>) PaymentActivity.class));
            return true;
        }
    }

    class d implements Preference.e {
        d() {
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            if (n0.this.f0() == null) {
                return false;
            }
            n0.this.F2(new Intent(n0.this.f0(), (Class<?>) DefaultsSettingsActivity.class));
            return true;
        }
    }

    class e implements C3587f.b {
        final /* synthetic */ PreferenceScreen a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ int c;

        class a implements Preference.e {
            a() {
            }

            @Override // androidx.preference.Preference.e
            public boolean a(Preference preference) {
                e eVar = e.this;
                n0.this.g3(eVar.a, eVar.b, eVar.c);
                return true;
            }
        }

        e(PreferenceScreen preferenceScreen, ArrayList arrayList, int i) {
            this.a = preferenceScreen;
            this.b = arrayList;
            this.c = i;
        }

        @Override // com.voxdon.xplorer.file.C3587f.b
        public void a(int i, int i2, long j, Map<String, C3587f.a> map) {
            PreferenceScreen preferenceScreen;
            Context b = n0.this.b();
            if (!n0.this.X0() || b == null || (preferenceScreen = this.a) == null) {
                return;
            }
            preferenceScreen.J0(C1809B.i(b, j));
            if (j == 0) {
                this.a.H0(null);
            } else {
                this.a.H0(new a());
            }
        }

        @Override // com.voxdon.xplorer.file.C3587f.b
        public void b(int i, int i2, long j) {
            PreferenceScreen preferenceScreen;
            Context b = n0.this.b();
            if (!n0.this.X0() || b == null || (preferenceScreen = this.a) == null) {
                return;
            }
            preferenceScreen.J0(C1809B.i(b, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g3(PreferenceScreen preferenceScreen, ArrayList<AbstractC3595n> arrayList, int i) {
        ax.W2.o.l(this, C1835x.e(ax.c3.K.e), arrayList, 1, false, false, i, R.string.title_delete_temporary_files, new f(preferenceScreen), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i3() {
        PreferenceScreen P2 = P2();
        if (P2 == null) {
            return false;
        }
        for (PreferenceGroup E = P2.E(); E != null; E = E.E()) {
            if (E instanceof PreferenceScreen) {
                a3((PreferenceScreen) E);
                u3();
                return true;
            }
        }
        return false;
    }

    private void j3(PreferenceScreen preferenceScreen, ArrayList<AbstractC3595n> arrayList, int i) {
        new C3587f(C3587f.c.DELETE, C1835x.e(ax.c3.K.e), arrayList, false, new e(preferenceScreen, arrayList, i)).i(new Void[0]);
    }

    private void k3() {
        ArrayList<AbstractC3595n> arrayList;
        if (b() == null) {
            return;
        }
        C3605y O0 = C3604x.O0(ax.Z2.a.k(b()));
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.o0.V0("clear_network_storage_cache");
        if (O0.n()) {
            ArrayList<AbstractC3595n> arrayList2 = new ArrayList<>();
            arrayList2.add(O0);
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        m3(preferenceScreen, arrayList, R.string.files_network_storage_cache);
    }

    private void l3() {
        ArrayList<AbstractC3595n> arrayList;
        if (b() == null) {
            return;
        }
        C3605y O0 = C3604x.O0(ax.Z2.a.n(b()));
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.o0.V0("clear_other_temporary_files");
        if (O0.n()) {
            ArrayList<AbstractC3595n> arrayList2 = new ArrayList<>();
            arrayList2.add(O0);
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        m3(preferenceScreen, arrayList, R.string.files_other_temporary);
    }

    private void m3(PreferenceScreen preferenceScreen, ArrayList<AbstractC3595n> arrayList, int i) {
        preferenceScreen.H0(null);
        if (arrayList == null || arrayList.isEmpty()) {
            q3(preferenceScreen);
        } else {
            j3(preferenceScreen, arrayList, i);
        }
    }

    private void n3() {
        k3();
        o3();
        l3();
    }

    private void o3() {
        ArrayList<AbstractC3595n> arrayList;
        if (b() == null) {
            return;
        }
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.o0.V0("clear_thumbnails");
        ArrayList<File> o = ax.Z2.a.o(b());
        if (o.isEmpty()) {
            arrayList = null;
        } else {
            ArrayList<AbstractC3595n> arrayList2 = new ArrayList<>();
            int size = o.size();
            int i = 0;
            while (i < size) {
                File file = o.get(i);
                i++;
                arrayList2.add(C3604x.O0(file));
            }
            arrayList = arrayList2;
        }
        m3(preferenceScreen, arrayList, R.string.files_thumbnails);
    }

    private void p3(Context context) {
        ListPreference listPreference = (ListPreference) this.o0.V0("list_date_format");
        if (listPreference != null) {
            long currentTimeMillis = System.currentTimeMillis();
            listPreference.g1(new String[]{C1831t.c(context, currentTimeMillis), C1831t.d(context, currentTimeMillis), C1831t.e(context, currentTimeMillis)});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q3(PreferenceScreen preferenceScreen) {
        preferenceScreen.J0(C1809B.i(b(), 0L));
    }

    private void r3() {
        Preference V0 = this.o0.V0("app_backup_storage");
        if (V0 != null) {
            V0.N0(ax.U2.d.T());
        }
    }

    private void s3() {
        Preference V0 = this.o0.V0("settings_payment");
        Preference V02 = this.o0.V0("payment_screen");
        ListPreference listPreference = (ListPreference) this.o0.V0("night_mode");
        if (!ax.t3.c.n().m() && !ax.t3.c.n().o()) {
            V0.N0(false);
            V02.N0(false);
            listPreference.N0(false);
        } else if (ax.t3.g.c() && b() != null) {
            if (ax.t3.g.e()) {
                V02.L0(R.string.title_premium);
            } else {
                V02.M0(N0(R.string.premium_expires_on, ax.t3.g.a(b())));
            }
        }
        if (!ax.t3.g.c()) {
            listPreference.N0(false);
            return;
        }
        listPreference.N0(true);
        if (ax.t3.j.i(b()) != 0) {
            listPreference.f1(R.array.night_mode_entries_no_auto);
            listPreference.h1(R.array.night_mode_values_no_auto);
        }
    }

    private void t3(String str) {
        ((ListPreference) this.o0.V0(str)).J0("%s");
    }

    private void u3() {
        PreferenceScreen P2 = P2();
        if (P2 != null) {
            if ("root".equals(P2.B())) {
                this.n0.j(false);
            } else {
                this.n0.j(true);
            }
        }
    }

    private void v3() {
        if (ax.t3.j.l(b()) > 100) {
            t3("storage_full_threshold");
        } else {
            ((ListPreference) this.o0.V0("storage_full_threshold")).J0(M0(R.string.storage_full_threshold_explanation));
        }
    }

    private void w3(String str) {
        if (str.equals("storage_full_threshold") || str.equals("ALL")) {
            v3();
        }
        if (str.equals("file_size_unit") || str.equals("ALL")) {
            t3("file_size_unit");
        }
        if (str.equals("night_mode") || str.equals("ALL")) {
            t3("night_mode");
        }
        if (str.equals("music_player_engine") || str.equals("ALL")) {
            t3("music_player_engine");
        }
        if (str.equals("list_date_format") || str.equals("ALL")) {
            t3("list_date_format");
        }
        if (str.equals("app_backup_storage") || str.equals("ALL")) {
            t3("app_backup_storage");
        }
    }

    @Override // ax.d3.InterfaceC1931s
    public boolean A(androidx.fragment.app.e eVar, String str, boolean z) {
        if (!h3()) {
            return false;
        }
        C3180B.d0(s0(), eVar, str, z);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void D1() {
        super.D1();
        O2().l().unregisterOnSharedPreferenceChangeListener(this);
        if (this.m0) {
            C3189g.a().e(new Intent("local.intent.action.SETTING_CHANGED"));
            this.m0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        s3();
        w3("ALL");
        r3();
        O2().l().registerOnSharedPreferenceChangeListener(this);
        this.o0.V0("show_drawer_always").N0(false);
        this.o0.V0("show_history").N0(false);
        if (((ActivityC2561c) f0()).getSupportActionBar() != null) {
            ((ActivityC2561c) f0()).getSupportActionBar().G(R.string.menu_settings);
        }
    }

    @Override // androidx.preference.d, androidx.preference.g.b
    public void R(PreferenceScreen preferenceScreen) {
        super.R(preferenceScreen);
        if ("temporary_files_screen".equals(preferenceScreen.B())) {
            n3();
        }
        a3(preferenceScreen);
        u3();
    }

    @Override // androidx.preference.d
    public void T2(Bundle bundle, String str) {
        String str2;
        b3(R.xml.settings, str);
        PreferenceScreen P2 = P2();
        this.o0 = P2;
        Preference V0 = P2.V0("about_screen");
        if (V0 != null) {
            try {
                str2 = f0().getPackageManager().getPackageInfo(f0().getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            V0.J0(N0(R.string.version_number, str2));
            V0.H0(new b());
        }
        Preference V02 = this.o0.V0("payment_screen");
        if (V02 != null) {
            V02.H0(new c());
        }
        Preference V03 = this.o0.V0("defaults_screen");
        if (V03 != null) {
            V03.H0(new d());
        }
        if (!ax.X2.Q.b2()) {
            this.o0.V0("file_size_unit").N0(false);
        }
        this.o0.V0("show_add_to_favorite").N0(false);
        Preference V04 = this.o0.V0("root_access_mode");
        if (C3200r.g()) {
            V04.N0(true);
        } else {
            V04.N0(false);
        }
        Preference V05 = this.o0.V0("show_dual_apps");
        if (ax.Z2.j.F().i0()) {
            V05.N0(true);
        } else {
            V05.N0(false);
        }
        if (!ax.X2.Q.N0()) {
            this.o0.V0("use_internal_video_player").N0(false);
        }
        if (ax.X2.J.G()) {
            this.o0.V0("detect_usb_attached").N0(false);
        }
        r3();
        p3(b());
        s3();
    }

    public boolean h3() {
        return C3180B.F(this, true);
    }

    @Override // ax.d3.InterfaceC1931s
    public void l(ax.W2.h hVar, boolean z) throws C1488c {
        androidx.fragment.app.f f0 = f0();
        if (f0 == null) {
            return;
        }
        CommandService.M(f0, this, hVar, z, !(hVar instanceof ax.W2.B));
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        this.n0 = new a(false);
        n2().getOnBackPressedDispatcher().h(this, this.n0);
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        RecyclerView N2 = N2();
        if (z || N2 == null) {
            return;
        }
        N2.setPadding(0, 0, 0, bVar.d);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            C3184b.f();
            str = "ALL";
        }
        this.m0 = true;
        w3(str);
        if ("night_mode".equals(str)) {
            ax.u3.z.q(f0());
            AbstractC2564f.N(ax.t3.j.i(b()));
            C3189g.a().f("local.intent.action.THEME_CHANGED");
            ax.P.b.r(f0());
            return;
        }
        if ("detect_usb_attached".equals(str)) {
            C3180B.c0(b(), UsbAttachActivity.class, ax.t3.j.b(b()));
            return;
        }
        if ("root_access_mode".equals(str)) {
            if (!ax.t3.j.k(b()) || s0() == null) {
                return;
            }
            C1358n.k3(R.string.setting_root_access_mode, R.string.setting_root_access_mode_summary, android.R.string.ok, 0).c3(s0(), "dialog");
            return;
        }
        if ("file_size_unit".equals(str)) {
            C3189g.a().f("local.intent.action.FILE_SIZE_UNIT_CHANGED");
        } else if ("show_dual_apps".equals(str)) {
            ax.Z2.j.F().F0();
        }
    }

    class f implements h.a {
        final /* synthetic */ PreferenceScreen a;

        f(PreferenceScreen preferenceScreen) {
            this.a = preferenceScreen;
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            if (!n0.this.X0() || n0.this.b() == null) {
                return;
            }
            n0.this.q3(this.a);
            this.a.H0(null);
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }
}
