/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.f;

public class g {
    private final Context a;
    private long b = 0L;
    private SharedPreferences c;
    private SharedPreferences.Editor d;
    private boolean e;
    private String f;
    private int g;
    private int h = 0;
    private PreferenceScreen i;
    private c j;
    private a k;
    private b l;

    public g(Context context) {
        this.a = context;
        this.s(androidx.preference.g.d(context));
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(androidx.preference.g.d(context), androidx.preference.g.c());
    }

    private static int c() {
        return 0;
    }

    private static String d(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append("_preferences");
        return stringBuilder.toString();
    }

    private void n(boolean bl) {
        SharedPreferences.Editor editor;
        if (!bl && (editor = this.d) != null) {
            editor.apply();
        }
        this.e = bl;
    }

    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.i;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.V0(charSequence);
    }

    SharedPreferences.Editor e() {
        if (this.e) {
            if (this.d == null) {
                this.d = this.l().edit();
            }
            return this.d;
        }
        return this.l().edit();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    long f() {
        synchronized (this) {
            long l8 = this.b;
            this.b = 1L + l8;
            return l8;
        }
    }

    public b g() {
        return this.l;
    }

    public c h() {
        return this.j;
    }

    public d i() {
        return null;
    }

    public ax.b2.d j() {
        return null;
    }

    public PreferenceScreen k() {
        return this.i;
    }

    public SharedPreferences l() {
        this.j();
        if (this.c == null) {
            Context context = this.h != 1 ? this.a : ax.Q.b.b(this.a);
            this.c = context.getSharedPreferences(this.f, this.g);
        }
        return this.c;
    }

    public PreferenceScreen m(Context object, int n8, PreferenceScreen preferenceScreen) {
        this.n(true);
        object = (PreferenceScreen)new f((Context)object, this).d(n8, preferenceScreen);
        ((Preference)object).a0(this);
        this.n(false);
        return object;
    }

    public void o(a a8) {
        this.k = a8;
    }

    public void p(b b8) {
        this.l = b8;
    }

    public void q(c c8) {
        this.j = c8;
    }

    public boolean r(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.i;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.f0();
            }
            this.i = preferenceScreen;
            return true;
        }
        return false;
    }

    public void s(String string) {
        this.f = string;
        this.c = null;
    }

    boolean t() {
        return this.e ^ true;
    }

    public void u(Preference preference) {
        a a8 = this.k;
        if (a8 != null) {
            a8.O(preference);
        }
    }

    public static interface a {
        public void O(Preference var1);
    }

    public static interface b {
        public void R(PreferenceScreen var1);
    }

    public static interface c {
        public boolean U(Preference var1);
    }

    public static abstract class d {
    }
}

