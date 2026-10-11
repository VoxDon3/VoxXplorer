/*
 * Decompiled with CFR 0.152.
 */
package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.savedstate.a;
import ax.G0.h;
import ax.Gb.g;
import ax.Gb.l;
import ax.n2.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Recreator
implements f {
    public static final a c0 = new a(null);
    private final d q;

    public Recreator(d d8) {
        l.f(d8, "owner");
        this.q = d8;
    }

    private final void h(String string) {
        Constructor<a.a> constructor;
        Object object;
        try {
            object = Class.forName(string, false, Recreator.class.getClassLoader()).asSubclass(a.a.class);
            l.e(object, "{\n                Class.\u2026class.java)\n            }");
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class ");
            stringBuilder.append(string);
            stringBuilder.append(" wasn't found");
            throw new RuntimeException(stringBuilder.toString(), classNotFoundException);
        }
        try {
            constructor = ((Class)object).getDeclaredConstructor(null);
            ((AccessibleObject)constructor).setAccessible(true);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class ");
            stringBuilder.append(((Class)object).getSimpleName());
            stringBuilder.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalStateException(stringBuilder.toString(), noSuchMethodException);
        }
        try {
            object = constructor.newInstance(null);
            l.e(object, "{\n                constr\u2026wInstance()\n            }");
            object = (a.a)object;
            object.a(this.q);
            return;
        }
        catch (Exception exception) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed to instantiate ");
            ((StringBuilder)object).append(string);
            throw new RuntimeException(((StringBuilder)object).toString(), exception);
        }
    }

    @Override
    public void b(h object, d.a a8) {
        l.f(object, "source");
        l.f((Object)a8, "event");
        if (a8 == d.a.ON_CREATE) {
            object.getLifecycle().c(this);
            object = this.q.getSavedStateRegistry().b("androidx.savedstate.Restarter");
            if (object != null) {
                if ((object = object.getStringArrayList("classes_to_restore")) != null) {
                    int n8 = ((ArrayList)object).size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        a8 = ((ArrayList)object).get(i8);
                        this.h((String)((Object)a8));
                    }
                }
            } else {
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError((Object)"Next event must be ON_CREATE");
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b
    implements a.c {
        private final Set<String> a;

        public b(androidx.savedstate.a a8) {
            l.f(a8, "registry");
            this.a = new LinkedHashSet<String>();
            a8.h("androidx.savedstate.Restarter", this);
        }

        @Override
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<String>(this.a));
            return bundle;
        }

        public final void b(String string) {
            l.f(string, "className");
            this.a.add(string);
        }
    }
}

