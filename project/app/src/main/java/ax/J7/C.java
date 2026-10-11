/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import ax.G7.g;
import ax.J7.B;
import ax.J7.D;
import ax.J7.E;
import ax.J7.Z;
import ax.J7.i;
import ax.J7.x;
import ax.b8.e;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public class C
implements D {
    private static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    private static final String h = Pattern.quote("/");
    private final E a;
    private final Context b;
    private final String c;
    private final e d;
    private final x e;
    private D.a f;

    public C(Context context, String string, e e8, x x8) {
        if (context != null) {
            if (string != null) {
                this.b = context;
                this.c = string;
                this.d = e8;
                this.e = x8;
                this.a = new E();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String b(String string, SharedPreferences sharedPreferences) {
        synchronized (this) {
            String string2 = C.e(UUID.randomUUID().toString());
            g g8 = ax.G7.g.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Created new Crashlytics installation ID: ");
            stringBuilder.append(string2);
            stringBuilder.append(" for FID: ");
            stringBuilder.append(string);
            g8.i(stringBuilder.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", string2).putString("firebase.installation.id", string).apply();
            return string2;
        }
    }

    static String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SYN_");
        stringBuilder.append(UUID.randomUUID().toString());
        return stringBuilder.toString();
    }

    private static String e(String string) {
        return g.matcher(string).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String string) {
        return string != null && string.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String string) {
        return string.replaceAll(h, "");
    }

    private boolean n() {
        D.a a8 = this.f;
        return a8 == null || a8.e() == null && this.e.d();
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public D.a a() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    if (!this.n()) {
                        return this.f;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                ax.G7.g.f().i("Determining Crashlytics installation ID...");
                SharedPreferences sharedPreferences = i.q(this.b);
                CharSequence charSequence = sharedPreferences.getString("firebase.installation.id", null);
                Object object = ax.G7.g.f();
                Object object2 = new StringBuilder();
                ((StringBuilder)object2).append("Cached Firebase Installation ID: ");
                ((StringBuilder)object2).append((String)charSequence);
                ((g)object).i(((StringBuilder)object2).toString());
                if (this.e.d()) {
                    object2 = this.d(false);
                    object = ax.G7.g.f();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Fetched Firebase Installation ID: ");
                    stringBuilder.append(((B)object2).b());
                    ((g)object).i(stringBuilder.toString());
                    object = object2;
                    if (((B)object2).b() == null) {
                        object = charSequence == null ? C.c() : charSequence;
                        object = object2 = new B((String)object, null);
                    }
                    this.f = j.Objects.equals((Object)((B)object).b(), (Object)charSequence) ? D.a.a(this.l(sharedPreferences), (B)object) : D.a.a(this.b(((B)object).b(), sharedPreferences), (B)object);
                } else {
                    this.f = C.k((String)charSequence) ? D.a.b(this.l(sharedPreferences)) : D.a.b(this.b(C.c(), sharedPreferences));
                }
                object = ax.G7.g.f();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Install IDs: ");
                ((StringBuilder)charSequence).append(this.f);
                ((g)object).i(((StringBuilder)charSequence).toString());
                return this.f;
            }
            throw throwable2;
        }
    }

    public B d(boolean bl) {
        String string;
        String string2;
        block5: {
            string2 = null;
            if (bl) {
                try {
                    string = Z.f(this.d.b(false)).b();
                    break block5;
                }
                catch (Exception exception) {
                    ax.G7.g.f().l("Error getting Firebase authentication token.", exception);
                }
            }
            string = null;
        }
        try {
            String string3;
            string2 = string3 = Z.f(this.d.a());
        }
        catch (Exception exception) {
            ax.G7.g.f().l("Error getting Firebase installation id.", exception);
        }
        return new B(string2, string);
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", this.m(Build.MANUFACTURER), this.m(Build.MODEL));
    }

    public String i() {
        return this.m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return this.m(Build.VERSION.RELEASE);
    }
}

