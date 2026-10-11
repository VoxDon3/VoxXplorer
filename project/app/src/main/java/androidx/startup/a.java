/*
 * Decompiled with CFR 0.152.
 */
package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import ax.r2.c;
import ax.u2.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class a {
    private static volatile a d;
    private static final Object e;
    final Map<Class<?>, Object> a;
    final Set<Class<? extends ax.r2.a<?>>> b;
    final Context c;

    static {
        e = new Object();
    }

    a(Context context) {
        this.c = context.getApplicationContext();
        this.b = new HashSet();
        this.a = new HashMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private <T> T d(Class<? extends ax.r2.a<?>> var1_1, Set<Class<?>> var2_3) {
        block8: {
            block10: {
                block9: {
                    if (ax.u2.b.d()) {
                        try {
                            ax.u2.b.a(var1_1.getSimpleName());
                        }
                        catch (Throwable var1_2) {
                            break block8;
                        }
                    }
                    if (var2_3.contains(var1_1)) ** GOTO lbl-1000
                    if (this.a.containsKey(var1_1)) ** GOTO lbl35
                    var2_3.add(var1_1);
                    try {
                        var3_5 /* !! */  = (ax.r2.a)var1_1.getDeclaredConstructor(null).newInstance(null);
                        var4_6 = var3_5 /* !! */ .a();
                        if (var4_6.isEmpty()) break block9;
                        var5_7 = var4_6.iterator();
                        while (var5_7.hasNext()) {
                            var4_6 = var5_7.next();
                            if (this.a.containsKey(var4_6)) continue;
                            this.d((Class<? extends ax.r2.a<?>>)var4_6, (Set<Class<?>>)var2_3);
                        }
                    }
                    catch (Throwable var2_4) {
                        ** GOTO lbl-1000
                    }
                }
                var3_5 /* !! */  = var3_5 /* !! */ .b(this.c);
                var2_3.remove(var1_1);
                this.a.put((Class<?>)var1_1, var3_5 /* !! */ );
                var1_1 = var3_5 /* !! */ ;
                break block10;
lbl-1000:
                // 1 sources

                {
                    var1_1 = new c(var2_4);
                    throw var1_1;
lbl35:
                    // 1 sources

                    var1_1 = this.a.get(var1_1);
                }
            }
            ax.u2.b.b();
            return (T)var1_1;
lbl-1000:
            // 1 sources

            {
                var1_1 = String.format("Cannot initialize %s. Cycle detected.", new Object[]{var1_1.getName()});
                var2_3 = new IllegalStateException((String)var1_1);
                throw var2_3;
            }
        }
        ax.u2.b.b();
        throw var1_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a e(Context context) {
        if (d != null) return d;
        Object object = e;
        synchronized (object) {
            try {
                a a8;
                if (d != null) return d;
                d = a8 = new a(context);
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a() {
        Throwable throwable2222222;
        block4: {
            ax.u2.b.a("Startup");
            ComponentName componentName = new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName());
            this.b(this.c.getPackageManager().getProviderInfo((ComponentName)componentName, (int)128).metaData);
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                {
                    c c8 = new c(nameNotFoundException);
                    throw c8;
                }
            }
            ax.u2.b.b();
            return;
        }
        ax.u2.b.b();
        throw throwable2222222;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void b(Bundle object) {
        HashSet hashSet;
        String string = this.c.getString(ax.r2.b.a);
        if (object == null) return;
        try {
            hashSet = new HashSet();
            for (Object object2 : object.keySet()) {
                if (!string.equals(object.getString((String)object2, null)) || !ax.r2.a.class.isAssignableFrom((Class<?>)(object2 = Class.forName((String)object2)))) continue;
                this.b.add((Class<ax.r2.a<?>>)object2);
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new c(classNotFoundException);
        }
        object = this.b.iterator();
        while (object.hasNext()) {
            this.d((Class)object.next(), hashSet);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    <T> T c(Class<? extends ax.r2.a<?>> clazz) {
        Object object = e;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                HashSet<Class<Object>> hashSet;
                block3: {
                    try {
                        HashSet<Class<?>> hashSet2;
                        hashSet = hashSet2 = this.a.get(clazz);
                        if (hashSet2 != null) break block3;
                        hashSet = new HashSet<Class<Object>>();
                        hashSet = this.d(clazz, hashSet);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return (T)hashSet;
            }
            throw throwable2;
        }
    }

    public <T> T f(Class<? extends ax.r2.a<T>> clazz) {
        return this.c(clazz);
    }

    public boolean g(Class<? extends ax.r2.a<?>> clazz) {
        return this.b.contains(clazz);
    }
}

