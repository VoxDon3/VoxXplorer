/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.lifecycle.d;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import androidx.savedstate.a;
import ax.G0.r;
import ax.G0.v;
import ax.Gb.w;
import ax.I0.a;
import ax.I0.c;

public final class m {
    public static final a.b<ax.n2.d> a = new a.b<ax.n2.d>(){};
    public static final a.b<v> b = new a.b<v>(){};
    public static final a.b<Bundle> c = new a.b<Bundle>(){};

    public static final l a(a object) {
        ax.Gb.l.f(object, "<this>");
        ax.n2.d d8 = ((a)object).a(a);
        if (d8 != null) {
            v v8 = ((a)object).a(b);
            if (v8 != null) {
                Bundle bundle = ((a)object).a(c);
                if ((object = ((a)object).a(q.c.c)) != null) {
                    return m.b(d8, v8, (String)object, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    private static final l b(ax.n2.d object, v object2, String string, Bundle bundle) {
        object = m.d((ax.n2.d)object);
        l l8 = ((r)(object2 = m.e((v)object2))).f().get(string);
        if (l8 == null) {
            object = l.f.a(((ax.G0.q)object).b(string), bundle);
            ((r)object2).f().put(string, (l)object);
            return object;
        }
        return l8;
    }

    public static final <T extends ax.n2.d & v> void c(T t8) {
        ax.Gb.l.f(t8, "<this>");
        Object object = t8.getLifecycle().b();
        if (object != d.b.c0 && object != d.b.d0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t8.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            object = new ax.G0.q(t8.getSavedStateRegistry(), t8);
            t8.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", (a.c)object);
            t8.getLifecycle().a(new SavedStateHandleAttacher((ax.G0.q)object));
        }
    }

    public static final ax.G0.q d(ax.n2.d object) {
        ax.Gb.l.f(object, "<this>");
        object = object.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        object = object instanceof ax.G0.q ? (ax.G0.q)object : null;
        if (object != null) {
            return object;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final r e(v v8) {
        ax.Gb.l.f(v8, "<this>");
        c c8 = new c();
        d d8 = d.q;
        c8.a(w.b(r.class), d8);
        return new q(v8, c8.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", r.class);
    }
}

