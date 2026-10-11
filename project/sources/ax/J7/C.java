package ax.J7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import ax.J7.D;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class C implements D {
    private static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    private static final String h = Pattern.quote("/");
    private final E a;
    private final Context b;
    private final String c;
    private final ax.b8.e d;
    private final C0778x e;
    private D.a f;

    public C(Context context, String str, ax.b8.e eVar, C0778x c0778x) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = eVar;
        this.e = c0778x;
        this.a = new E();
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = e(UUID.randomUUID().toString());
        ax.G7.g.f().i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return g.matcher(str).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET).toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(h, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private boolean n() {
        D.a aVar = this.f;
        if (aVar != null) {
            return aVar.e() == null && this.e.d();
        }
        return true;
    }

    @Override // ax.J7.D
    public synchronized D.a a() {
        if (!n()) {
            return this.f;
        }
        ax.G7.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences q = C0764i.q(this.b);
        String string = q.getString("firebase.installation.id", null);
        ax.G7.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.e.d()) {
            B d = d(false);
            ax.G7.g.f().i("Fetched Firebase Installation ID: " + d.b());
            if (d.b() == null) {
                d = new B(string == null ? c() : string, null);
            }
            if (Objects.equals(d.b(), string)) {
                this.f = D.a.a(l(q), d);
            } else {
                this.f = D.a.a(b(d.b(), q), d);
            }
        } else if (k(string)) {
            this.f = D.a.b(l(q));
        } else {
            this.f = D.a.b(b(c(), q));
        }
        ax.G7.g.f().i("Install IDs: " + this.f);
        return this.f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        ax.G7.g.f().l("Error getting Firebase installation id.", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.J7.B d(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L1f
            ax.b8.e r5 = r4.d     // Catch: java.lang.Exception -> L15
            r1 = 0
            ax.j6.j r5 = r5.b(r1)     // Catch: java.lang.Exception -> L15
            java.lang.Object r5 = ax.J7.Z.f(r5)     // Catch: java.lang.Exception -> L15
            com.google.firebase.installations.g r5 = (com.google.firebase.installations.g) r5     // Catch: java.lang.Exception -> L15
            java.lang.String r5 = r5.b()     // Catch: java.lang.Exception -> L15
            goto L20
        L15:
            r5 = move-exception
            ax.G7.g r1 = ax.G7.g.f()
            java.lang.String r2 = "Error getting Firebase authentication token."
            r1.l(r2, r5)
        L1f:
            r5 = r0
        L20:
            ax.b8.e r1 = r4.d     // Catch: java.lang.Exception -> L2e
            ax.j6.j r1 = r1.a()     // Catch: java.lang.Exception -> L2e
            java.lang.Object r1 = ax.J7.Z.f(r1)     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2e
            r0 = r1
            goto L38
        L2e:
            r1 = move-exception
            ax.G7.g r2 = ax.G7.g.f()
            java.lang.String r3 = "Error getting Firebase installation id."
            r2.l(r3, r1)
        L38:
            ax.J7.B r1 = new ax.J7.B
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.J7.C.d(boolean):ax.J7.B");
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
