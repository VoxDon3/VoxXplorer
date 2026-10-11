package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.q;
import ax.G0.s;
import ax.n2.InterfaceC2576d;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends q.d implements q.b {
    private Application a;
    private final q.b b;
    private Bundle c;
    private d d;
    private androidx.savedstate.a e;

    @SuppressLint({"LambdaLast"})
    public n(Application application, InterfaceC2576d interfaceC2576d, Bundle bundle) {
        ax.Gb.l.f(interfaceC2576d, "owner");
        this.e = interfaceC2576d.getSavedStateRegistry();
        this.d = interfaceC2576d.getLifecycle();
        this.c = bundle;
        this.a = application;
        this.b = application != null ? q.a.e.a(application) : new q.a();
    }

    @Override // androidx.lifecycle.q.b
    public <T extends p> T a(Class<T> cls) {
        ax.Gb.l.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.q.b
    public <T extends p> T b(Class<T> cls, ax.I0.a aVar) {
        List list;
        Constructor c;
        List list2;
        ax.Gb.l.f(cls, "modelClass");
        ax.Gb.l.f(aVar, "extras");
        String str = (String) aVar.a(q.c.c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.a(m.a) == null || aVar.a(m.b) == null) {
            if (this.d != null) {
                return (T) d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) aVar.a(q.a.g);
        boolean isAssignableFrom = ax.G0.a.class.isAssignableFrom(cls);
        if (!isAssignableFrom || application == null) {
            list = s.b;
            c = s.c(cls, list);
        } else {
            list2 = s.a;
            c = s.c(cls, list2);
        }
        return c == null ? (T) this.b.b(cls, aVar) : (!isAssignableFrom || application == null) ? (T) s.d(cls, c, m.a(aVar)) : (T) s.d(cls, c, application, m.a(aVar));
    }

    @Override // androidx.lifecycle.q.d
    public void c(p pVar) {
        ax.Gb.l.f(pVar, "viewModel");
        if (this.d != null) {
            androidx.savedstate.a aVar = this.e;
            ax.Gb.l.c(aVar);
            d dVar = this.d;
            ax.Gb.l.c(dVar);
            LegacySavedStateHandleController.a(pVar, aVar, dVar);
        }
    }

    public final <T extends p> T d(String str, Class<T> cls) {
        List list;
        Constructor c;
        T t;
        Application application;
        List list2;
        ax.Gb.l.f(str, "key");
        ax.Gb.l.f(cls, "modelClass");
        d dVar = this.d;
        if (dVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = ax.G0.a.class.isAssignableFrom(cls);
        if (!isAssignableFrom || this.a == null) {
            list = s.b;
            c = s.c(cls, list);
        } else {
            list2 = s.a;
            c = s.c(cls, list2);
        }
        if (c == null) {
            return this.a != null ? (T) this.b.a(cls) : (T) q.c.a.a().a(cls);
        }
        androidx.savedstate.a aVar = this.e;
        ax.Gb.l.c(aVar);
        SavedStateHandleController b = LegacySavedStateHandleController.b(aVar, dVar, str, this.c);
        if (!isAssignableFrom || (application = this.a) == null) {
            t = (T) s.d(cls, c, b.i());
        } else {
            ax.Gb.l.c(application);
            t = (T) s.d(cls, c, application, b.i());
        }
        t.e("androidx.lifecycle.savedstate.vm.tag", b);
        return t;
    }
}
