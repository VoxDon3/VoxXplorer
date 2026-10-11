package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.savedstate.Recreator;
import ax.G0.h;
import ax.Gb.g;
import ax.Gb.l;
import ax.n2.InterfaceC2576d;
import java.util.Iterator;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {
    private static final b g = new b(null);
    private boolean b;
    private Bundle c;
    private boolean d;
    private Recreator.b e;
    private final ax.w.b<String, c> a = new ax.w.b<>();
    private boolean f = true;

    /* renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0043a {
        void a(InterfaceC2576d interfaceC2576d);
    }

    private static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, h hVar, d.a aVar2) {
        l.f(aVar, "this$0");
        l.f(hVar, "<anonymous parameter 0>");
        l.f(aVar2, "event");
        if (aVar2 == d.a.ON_START) {
            aVar.f = true;
        } else if (aVar2 == d.a.ON_STOP) {
            aVar.f = false;
        }
    }

    public final Bundle b(String str) {
        l.f(str, "key");
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.c = null;
        return bundle2;
    }

    public final c c(String str) {
        l.f(str, "key");
        Iterator<Map.Entry<String, c>> it = this.a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            l.e(next, "components");
            String key = next.getKey();
            c value = next.getValue();
            if (l.a(key, str)) {
                return value;
            }
        }
        return null;
    }

    public final void e(d dVar) {
        l.f(dVar, "lifecycle");
        if (this.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        dVar.a(new f() { // from class: ax.n2.b
            @Override // androidx.lifecycle.f
            public final void b(h hVar, d.a aVar) {
                androidx.savedstate.a.d(androidx.savedstate.a.this, hVar, aVar);
            }
        });
        this.b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.d = true;
    }

    public final void g(Bundle bundle) {
        l.f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        ax.w.b<String, c>.d h = this.a.h();
        l.e(h, "this.components.iteratorWithAdditions()");
        while (h.hasNext()) {
            Map.Entry next = h.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        l.f(str, "key");
        l.f(cVar, "provider");
        if (this.a.l(str, cVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class<? extends InterfaceC0043a> cls) {
        l.f(cls, "clazz");
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.b bVar = this.e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.e = bVar;
        try {
            cls.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.e;
            if (bVar2 != null) {
                String name = cls.getName();
                l.e(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
