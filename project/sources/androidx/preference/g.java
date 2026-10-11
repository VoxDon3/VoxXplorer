package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import ax.b2.AbstractC1476d;

/* loaded from: classes.dex */
public class g {
    private final Context a;
    private SharedPreferences c;
    private SharedPreferences.Editor d;
    private boolean e;
    private String f;
    private int g;
    private PreferenceScreen i;
    private c j;
    private a k;
    private b l;
    private long b = 0;
    private int h = 0;

    public interface a {
        void O(Preference preference);
    }

    public interface b {
        void R(PreferenceScreen preferenceScreen);
    }

    public interface c {
        boolean U(Preference preference);
    }

    public static abstract class d {
    }

    public g(Context context) {
        this.a = context;
        s(d(context));
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(d(context), c());
    }

    private static int c() {
        return 0;
    }

    private static String d(Context context) {
        return context.getPackageName() + "_preferences";
    }

    private void n(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.d) != null) {
            editor.apply();
        }
        this.e = z;
    }

    public <T extends Preference> T a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.i;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.V0(charSequence);
    }

    SharedPreferences.Editor e() {
        if (!this.e) {
            return l().edit();
        }
        if (this.d == null) {
            this.d = l().edit();
        }
        return this.d;
    }

    long f() {
        long j;
        synchronized (this) {
            j = this.b;
            this.b = 1 + j;
        }
        return j;
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

    public AbstractC1476d j() {
        return null;
    }

    public PreferenceScreen k() {
        return this.i;
    }

    public SharedPreferences l() {
        j();
        if (this.c == null) {
            this.c = (this.h != 1 ? this.a : ax.Q.b.b(this.a)).getSharedPreferences(this.f, this.g);
        }
        return this.c;
    }

    public PreferenceScreen m(Context context, int i, PreferenceScreen preferenceScreen) {
        n(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new f(context, this).d(i, preferenceScreen);
        preferenceScreen2.a0(this);
        n(false);
        return preferenceScreen2;
    }

    public void o(a aVar) {
        this.k = aVar;
    }

    public void p(b bVar) {
        this.l = bVar;
    }

    public void q(c cVar) {
        this.j = cVar;
    }

    public boolean r(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.i;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.f0();
        }
        this.i = preferenceScreen;
        return true;
    }

    public void s(String str) {
        this.f = str;
        this.c = null;
    }

    boolean t() {
        return !this.e;
    }

    public void u(Preference preference) {
        a aVar = this.k;
        if (aVar != null) {
            aVar.O(preference);
        }
    }
}
