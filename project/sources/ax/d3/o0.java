package ax.d3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import ax.b0.C1442c;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class o0 extends androidx.preference.d implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static final Logger n0 = Logger.getLogger("FileManager.SettingsVideoPlayerFragment");
    private PreferenceScreen m0;

    class a implements Preference.e {
        a() {
        }

        @Override // androidx.preference.Preference.e
        public boolean a(Preference preference) {
            C3180B.d0(o0.this.A0(), ax.a3.X.i3(o0.this), "subtitle", true);
            return true;
        }
    }

    class b implements Comparator<C1442c<String, String>> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C1442c<String, String> c1442c, C1442c<String, String> c1442c2) {
            if (c1442c == null) {
                return c1442c2 != null ? -1 : 0;
            }
            if (c1442c2 != null) {
                return String.CASE_INSENSITIVE_ORDER.compare(c1442c.a, c1442c2.a);
            }
            return 1;
        }
    }

    class c extends AbstractC3199q<Void, Integer, Boolean> {
        private Context h;

        c(Context context) {
            super(AbstractC3199q.e.HIGH);
            this.h = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            return Boolean.valueOf(ax.P2.a.o(this.h, ax.w3.h.c()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (bool.booleanValue() || ax.P2.a.r(this.h)) {
                ax.P2.a.m(this.h);
                if (o0.this.f0() instanceof VideoPlayerActivity) {
                    ((VideoPlayerActivity) o0.this.f0()).z3();
                    return;
                }
                return;
            }
            if (o0.this.f0() != null) {
                ((CheckBoxPreference) o0.this.m0.V0("use_custom_codec")).U0(false);
            } else {
                ax.t3.l.n(this.h, false);
            }
            Toast.makeText(this.h, R.string.error_file_load, 1).show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e3(ListPreference listPreference) {
        if (b() == null) {
            return;
        }
        String[] stringArray = b().getResources().getStringArray(R.array.language_values);
        ArrayList arrayList = new ArrayList();
        for (String str : stringArray) {
            Locale locale = str.indexOf("-") > 0 ? new Locale(str.substring(0, 2), str.substring(3)) : new Locale(str);
            arrayList.add(new C1442c(locale.getDisplayName(locale), str));
        }
        Collections.sort(arrayList, new b());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList2.add(b().getString(R.string.system_language));
        arrayList3.add("default");
        for (int i = 0; i < arrayList.size(); i++) {
            C1442c c1442c = (C1442c) arrayList.get(i);
            arrayList2.add((String) c1442c.a);
            arrayList3.add((String) c1442c.b);
        }
        listPreference.i1((CharSequence[]) arrayList3.toArray(new String[0]));
        listPreference.g1((CharSequence[]) arrayList2.toArray(new String[0]));
        listPreference.j1(ax.t3.l.g(b()));
    }

    @Override // androidx.fragment.app.Fragment
    public void D1() {
        super.D1();
        O2().l().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        O2().l().registerOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.preference.d, androidx.preference.g.b
    public void R(PreferenceScreen preferenceScreen) {
        super.R(preferenceScreen);
        a3(preferenceScreen);
    }

    @Override // androidx.preference.d
    public void T2(Bundle bundle, String str) {
        O2().s(ax.t3.l.e());
        b3(R.xml.settings_video_player, str);
        PreferenceScreen P2 = P2();
        this.m0 = P2;
        ListPreference listPreference = (ListPreference) P2.V0("subtitle_language");
        if (listPreference != null) {
            e3(listPreference);
        }
        Preference V0 = this.m0.V0("subtitle_size");
        if (V0 != null) {
            V0.H0(new a());
        }
        Preference V02 = this.m0.V0("use_custom_codec");
        if (V02 != null) {
            V02.N0(false);
        }
    }

    @Override // androidx.preference.d, androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Context b2 = b();
        if (b2 == null) {
            return;
        }
        if (!"use_custom_codec".equals(str)) {
            if ("subtitle_language".equals(str) || "subtitles_on_default".equals(str)) {
                if (f0() instanceof VideoPlayerActivity) {
                    ((VideoPlayerActivity) f0()).Z3();
                    return;
                } else {
                    C3184b.f();
                    return;
                }
            }
            return;
        }
        if (ax.t3.l.p(b2)) {
            if (ax.X2.Q.Y()) {
                ax.X2.Q.l(28);
            }
            new c(b2).i(new Void[0]);
            return;
        }
        ax.P2.a.b();
        if (ax.P2.a.s(b2)) {
            ax.P2.a.n(b2);
        }
        if (f0() instanceof VideoPlayerActivity) {
            ((VideoPlayerActivity) f0()).z3();
        } else {
            C3184b.f();
        }
    }
}
