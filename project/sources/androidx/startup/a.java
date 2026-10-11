package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import ax.r2.C2942b;
import ax.r2.C2943c;
import ax.r2.InterfaceC2941a;
import ax.u2.C3177b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {
    private static volatile a d;
    private static final Object e = new Object();
    final Context c;
    final Set<Class<? extends InterfaceC2941a<?>>> b = new HashSet();
    final Map<Class<?>, Object> a = new HashMap();

    a(Context context) {
        this.c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends InterfaceC2941a<?>> cls, Set<Class<?>> set) {
        T t;
        if (C3177b.d()) {
            try {
                C3177b.a(cls.getSimpleName());
            } catch (Throwable th) {
                C3177b.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.a.containsKey(cls)) {
            t = (T) this.a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC2941a<?> newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends InterfaceC2941a<?>>> a = newInstance.a();
                if (!a.isEmpty()) {
                    for (Class<? extends InterfaceC2941a<?>> cls2 : a) {
                        if (!this.a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t = (T) newInstance.b(this.c);
                set.remove(cls);
                this.a.put(cls, t);
            } catch (Throwable th2) {
                throw new C2943c(th2);
            }
        }
        C3177b.b();
        return t;
    }

    public static a e(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    void a() {
        try {
            try {
                C3177b.a("Startup");
                b(this.c.getPackageManager().getProviderInfo(new ComponentName(this.c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new C2943c(e2);
            }
        } finally {
            C3177b.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(Bundle bundle) {
        String string = this.c.getString(C2942b.a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC2941a.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends InterfaceC2941a<?>>> it = this.b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new C2943c(e2);
            }
        }
    }

    <T> T c(Class<? extends InterfaceC2941a<?>> cls) {
        T t;
        synchronized (e) {
            try {
                t = (T) this.a.get(cls);
                if (t == null) {
                    t = (T) d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public <T> T f(Class<? extends InterfaceC2941a<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(Class<? extends InterfaceC2941a<?>> cls) {
        return this.b.contains(cls);
    }
}
