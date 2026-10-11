package ax.J7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import ax.x7.C3471f;
import java.util.concurrent.Executor;

/* renamed from: ax.J7.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0778x {
    private final SharedPreferences a;
    private final C3471f b;
    private final Object c;
    C2328k<Void> d;
    boolean e;
    private boolean f;
    private Boolean g;
    private final C2328k<Void> h;

    public C0778x(C3471f c3471f) {
        Object obj = new Object();
        this.c = obj;
        this.d = new C2328k<>();
        this.e = false;
        this.f = false;
        this.h = new C2328k<>();
        Context k = c3471f.k();
        this.b = c3471f;
        this.a = C0764i.q(k);
        Boolean b = b();
        this.g = b == null ? a(k) : b;
        synchronized (obj) {
            try {
                if (d()) {
                    this.d.e(null);
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean g = g(context);
        if (g == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g));
    }

    private Boolean b() {
        if (!this.a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f = false;
        return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z) {
        ax.G7.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z ? "ENABLED" : "DISABLED", this.g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            ax.G7.g.f().e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public void c(boolean z) {
        if (!z) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.h.e(null);
    }

    public synchronized boolean d() {
        boolean booleanValue;
        try {
            Boolean bool = this.g;
            booleanValue = bool != null ? bool.booleanValue() : e();
            f(booleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return booleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = bool != null ? bool : a(this.b.k());
        i(this.a, bool);
        synchronized (this.c) {
            try {
                if (d()) {
                    if (!this.e) {
                        this.d.e(null);
                        this.e = true;
                    }
                } else if (this.e) {
                    this.d = new C2328k<>();
                    this.e = false;
                }
            } finally {
            }
        }
    }

    public AbstractC2327j<Void> j() {
        AbstractC2327j<Void> a;
        synchronized (this.c) {
            a = this.d.a();
        }
        return a;
    }

    public AbstractC2327j<Void> k(Executor executor) {
        return Z.j(executor, this.h.a(), j());
    }
}
