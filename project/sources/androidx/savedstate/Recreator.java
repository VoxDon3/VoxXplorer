package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.savedstate.a;
import ax.G0.h;
import ax.Gb.g;
import ax.Gb.l;
import ax.n2.InterfaceC2576d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class Recreator implements f {
    public static final a c0 = new a(null);
    private final InterfaceC2576d q;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements a.c {
        private final Set<String> a;

        public b(androidx.savedstate.a aVar) {
            l.f(aVar, "registry");
            this.a = new LinkedHashSet();
            aVar.h("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }

        public final void b(String str) {
            l.f(str, "className");
            this.a.add(str);
        }
    }

    public Recreator(InterfaceC2576d interfaceC2576d) {
        l.f(interfaceC2576d, "owner");
        this.q = interfaceC2576d;
    }

    private final void h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0043a.class);
            l.e(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    l.e(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0043a) newInstance).a(this.q);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.f
    public void b(h hVar, d.a aVar) {
        l.f(hVar, "source");
        l.f(aVar, "event");
        if (aVar != d.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        hVar.getLifecycle().c(this);
        Bundle b2 = this.q.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (b2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            h(str);
        }
    }
}
