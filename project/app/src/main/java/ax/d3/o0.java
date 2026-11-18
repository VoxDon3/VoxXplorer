/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.e;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.d;
import ax.P2.a;
import ax.X2.Q;
import ax.a3.X;
import ax.t3.l;
import ax.u3.B;
import ax.u3.b;
import ax.u3.q;
import ax.w3.h;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.logging.Logger;

public class o0
extends d
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static final Logger n0 = Logger.getLogger("FileManager.SettingsVideoPlayerFragment");
    private PreferenceScreen m0;

    private void e3(ListPreference listPreference) {
        Cloneable cloneable;
        Object object;
        int n8;
        if (this.b() == null) {
            return;
        }
        Object object2 = this.b().getResources().getStringArray(2130903054);
        ArrayList<ax.b0.c<String, Object>> arrayList = new ArrayList<ax.b0.c<String, Object>>();
        int n9 = ((String[])object2).length;
        for (n8 = 0; n8 < n9; ++n8) {
            object = object2[n8];
            cloneable = ((String)object).indexOf("-") > 0 ? new Locale(((String)object).substring(0, 2), ((String)object).substring(3)) : new Locale((String)object);
            arrayList.add(new ax.b0.c<String, Object>(((Locale)cloneable).getDisplayName((Locale)cloneable), object));
        }
        Collections.sort(arrayList, new Comparator<ax.b0.c<String, String>>(this){
            final o0 q;
            {
                this.q = o02;
            }

            public int a(ax.b0.c<String, String> object, ax.b0.c<String, String> object2) {
                if (object != null) {
                    if (object2 != null) {
                        object = (String)((ax.b0.c)object).a;
                        object2 = (String)((ax.b0.c)object2).a;
                        return String.CASE_INSENSITIVE_ORDER.compare(object, object2);
                    }
                    return 1;
                }
                if (object2 != null) {
                    return -1;
                }
                return 0;
            }
        });
        object = new ArrayList();
        cloneable = new ArrayList();
        ((ArrayList)object).add(this.b().getString(2131952642));
        ((ArrayList)cloneable).add("default");
        for (n8 = 0; n8 < arrayList.size(); ++n8) {
            object2 = (ax.b0.c)arrayList.get(n8);
            ((ArrayList)object).add((String)object2.a);
            ((ArrayList)cloneable).add((String)object2.b);
        }
        listPreference.i1(((ArrayList)cloneable).toArray(new String[0]));
        listPreference.g1(((ArrayList)object).toArray(new String[0]));
        listPreference.j1(l.g(this.b()));
    }

    @Override
    public void D1() {
        super.D1();
        this.O2().l().unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }

    @Override
    public void H1() {
        super.H1();
        this.O2().l().registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }

    @Override
    public void R(PreferenceScreen preferenceScreen) {
        super.R(preferenceScreen);
        this.a3(preferenceScreen);
    }

    @Override
    public void T2(Bundle object, String string) {
        this.O2().s(l.e());
        this.b3(2132148243, string);
        object = this.P2();
        this.m0 = object;
        object = (ListPreference)((PreferenceGroup)object).V0("subtitle_language");
        if (object != null) {
            this.e3((ListPreference)object);
        }
        if ((object = this.m0.V0("subtitle_size")) != null) {
            ((Preference)object).H0(new Preference.e(this){
                final o0 a;
                {
                    this.a = o02;
                }

                @Override
                public boolean a(Preference object) {
                    object = X.i3(this.a);
                    B.d0(this.a.A0(), (e)object, "subtitle", true);
                    return true;
                }
            });
        }
        if ((object = this.m0.V0("use_custom_codec")) != null) {
            ((Preference)object).N0(false);
        }
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String string) {
        block10: {
            block9: {
                sharedPreferences = this.b();
                if (sharedPreferences == null) break block9;
                if ("use_custom_codec".equals(string)) {
                    if (l.p((Context)sharedPreferences)) {
                        if (Q.Y()) {
                            Q.l(28);
                        }
                        new c(this, (Context)sharedPreferences).i(new Void[0]);
                        return;
                    }
                    a.b();
                    if (a.s((Context)sharedPreferences)) {
                        a.n((Context)sharedPreferences);
                    }
                    if (this.f0() instanceof VideoPlayerActivity) {
                        ((VideoPlayerActivity)this.f0()).z3();
                        return;
                    }
                    b.f();
                    return;
                }
                if ("subtitle_language".equals(string) || "subtitles_on_default".equals(string)) break block10;
            }
            return;
        }
        if (this.f0() instanceof VideoPlayerActivity) {
            ((VideoPlayerActivity)this.f0()).Z3();
            return;
        }
        b.f();
    }

    class c
    extends q<Void, Integer, Boolean> {
        private Context h;
        final o0 i;

        c(o0 o02, Context context) {
            this.i = o02;
            super(q.e.e0);
            this.h = context;
        }

        protected Boolean w(Void ... voidArray) {
            return a.o(this.h, ax.w3.h.c());
        }

        protected void x(Boolean bl) {
            if (!bl.booleanValue() && !a.r(this.h)) {
                if (this.i.f0() != null) {
                    ((CheckBoxPreference)this.i.m0.V0("use_custom_codec")).U0(false);
                } else {
                    l.n(this.h, false);
                }
                Toast.makeText((Context)this.h, (int)2131951934, (int)1).show();
                return;
            }
            a.m(this.h);
            if (this.i.f0() instanceof VideoPlayerActivity) {
                ((VideoPlayerActivity)this.i.f0()).z3();
            }
        }
    }
}

