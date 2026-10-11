/*
 * Decompiled with CFR 0.152.
 */
package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.savedstate.Recreator;
import ax.G0.h;
import ax.Gb.g;
import ax.Gb.l;
import java.util.Map;

@SuppressLint(value={"RestrictedApi"})
public final class a {
    private static final b g = new b(null);
    private final ax.w.b<String, c> a = new ax.w.b();
    private boolean b;
    private Bundle c;
    private boolean d;
    private Recreator.b e;
    private boolean f = true;

    public static /* synthetic */ void a(a a8, h h8, d.a a9) {
        androidx.savedstate.a.d(a8, h8, a9);
    }

    private static final void d(a a8, h h8, d.a a9) {
        l.f(a8, "this$0");
        l.f(h8, "<anonymous parameter 0>");
        l.f((Object)a9, "event");
        if (a9 == d.a.ON_START) {
            a8.f = true;
            return;
        }
        if (a9 == d.a.ON_STOP) {
            a8.f = false;
        }
    }

    public final Bundle b(String string) {
        l.f(string, "key");
        if (this.d) {
            Object object = this.c;
            if (object != null) {
                object = object != null ? object.getBundle(string) : null;
                Bundle bundle = this.c;
                if (bundle != null) {
                    bundle.remove(string);
                }
                if ((string = this.c) != null && !string.isEmpty()) {
                    return object;
                }
                this.c = null;
                return object;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final c c(String string) {
        l.f(string, "key");
        for (Map.Entry<String, c> entry : this.a) {
            l.e(entry, "components");
            String string2 = entry.getKey();
            c object = entry.getValue();
            if (!l.a(string2, string)) continue;
            return object;
        }
        return null;
    }

    public final void e(d d8) {
        l.f(d8, "lifecycle");
        if (!this.b) {
            d8.a(new ax.n2.b(this));
            this.b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }

    public final void f(Bundle object) {
        if (this.b) {
            if (!this.d) {
                object = object != null ? object.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                this.c = object;
                this.d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
    }

    public final void g(Bundle bundle) {
        l.f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Object object = this.c;
        if (object != null) {
            bundle2.putAll((Bundle)object);
        }
        object = this.a.h();
        l.e(object, "this.components.iteratorWithAdditions()");
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            bundle2.putBundle((String)entry.getKey(), ((c)entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String string, c c8) {
        l.f(string, "key");
        l.f(c8, "provider");
        if (this.a.l(string, c8) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public final void i(Class<? extends a> object) {
        l.f(object, "clazz");
        if (this.f) {
            block4: {
                Object object2 = this.e;
                Recreator.b b8 = object2;
                if (object2 == null) {
                    b8 = new Recreator.b(this);
                }
                this.e = b8;
                try {
                    ((Class)object).getDeclaredConstructor(null);
                    b8 = this.e;
                    if (b8 == null) break block4;
                    object = ((Class)object).getName();
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Class ");
                    ((StringBuilder)object2).append(((Class)object).getSimpleName());
                    ((StringBuilder)object2).append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalArgumentException(((StringBuilder)object2).toString(), noSuchMethodException);
                }
                l.e(object, "clazz.name");
                b8.b((String)object);
            }
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public static interface a {
        public void a(ax.n2.d var1);
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }

    public static interface c {
        public Bundle a();
    }
}

