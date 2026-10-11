/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import ax.G7.g;
import ax.J7.Z;
import ax.J7.i;
import ax.j6.j;
import ax.j6.k;
import ax.x7.f;
import java.util.concurrent.Executor;

public class x {
    private final SharedPreferences a;
    private final f b;
    private final Object c;
    k<Void> d;
    boolean e;
    private boolean f;
    private Boolean g;
    private final k<Void> h;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public x(f object) {
        Object object2;
        this.c = object2 = new Object();
        this.d = new k();
        this.e = false;
        this.f = false;
        this.h = new k();
        Context context = ((f)object).k();
        this.b = object;
        this.a = i.q(context);
        Boolean bl = this.b();
        object = bl;
        if (bl == null) {
            object = this.a(context);
        }
        this.g = object;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (!this.d()) break block4;
                        this.d.e(null);
                        this.e = true;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private Boolean a(Context object) {
        if ((object = x.g(object)) == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.TRUE.equals(object);
    }

    private Boolean b() {
        if (this.a.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            return this.a.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        return null;
    }

    private boolean e() {
        try {
            boolean bl = this.b.t();
            return bl;
        }
        catch (IllegalStateException illegalStateException) {
            return false;
        }
    }

    private void f(boolean bl) {
        String string = bl ? "ENABLED" : "DISABLED";
        String string2 = this.g == null ? "global Firebase setting" : (this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API");
        ax.G7.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", string, string2));
    }

    private static Boolean g(Context context) {
        block5: {
            boolean bl;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) break block5;
            context = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (context == null) break block5;
            packageManager = context.metaData;
            if (packageManager == null) break block5;
            try {
                if (!packageManager.containsKey("firebase_crashlytics_collection_enabled")) break block5;
                bl = context.metaData.getBoolean("firebase_crashlytics_collection_enabled");
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                ax.G7.g.f().e("Could not read data collection permission from manifest", nameNotFoundException);
            }
            return bl;
        }
        return null;
    }

    @SuppressLint(value={"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bl) {
        sharedPreferences = sharedPreferences.edit();
        if (bl != null) {
            sharedPreferences.putBoolean("firebase_crashlytics_collection_enabled", bl.booleanValue());
        } else {
            sharedPreferences.remove("firebase_crashlytics_collection_enabled");
        }
        sharedPreferences.apply();
    }

    public void c(boolean bl) {
        if (bl) {
            this.h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d() {
        synchronized (this) {
            Throwable throwable2;
            block3: {
                boolean bl;
                try {
                    Boolean bl2 = this.g;
                    bl = bl2 != null ? bl2.booleanValue() : this.e();
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                this.f(bl);
                return bl;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void h(Boolean var1_1) {
        synchronized (this) {
            block13: {
                block12: {
                    if (var1_1 == null) break block12;
                    try {
                        this.f = false;
                    }
                    catch (Throwable var1_2) {
                        break block13;
                    }
                }
                var2_3 = var1_1 != null ? var1_1 : this.a(this.b.k());
                this.g = var2_3;
                x.i(this.a, (Boolean)var1_1);
                var1_1 = this.c;
                synchronized (var1_1) {
                    block10: {
                        block9: {
                            try {
                                if (!this.d()) break block9;
                                if (!this.e) {
                                    this.d.e(null);
                                    this.e = true;
                                }
                                break block10;
                            }
                            catch (Throwable var2_4) {
                                ** break block11
                            }
                        }
                        if (this.e) {
                            var2_3 = new Object();
                            this.d = var2_3;
                            this.e = false;
                        }
                    }
                    return;
lbl-1000:
                    // 1 sources

                    {
                        throw var2_4;
                    }
                }
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j<Void> j() {
        Object object = this.c;
        synchronized (object) {
            return this.d.a();
        }
    }

    public j<Void> k(Executor executor) {
        return Z.j(executor, this.h.a(), this.j());
    }
}

