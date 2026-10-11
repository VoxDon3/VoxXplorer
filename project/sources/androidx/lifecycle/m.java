package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import androidx.savedstate.a;
import ax.G0.v;
import ax.Gb.w;
import ax.I0.a;
import ax.n2.InterfaceC2576d;

/* loaded from: classes.dex */
public final class m {
    public static final a.b<InterfaceC2576d> a = new b();
    public static final a.b<v> b = new c();
    public static final a.b<Bundle> c = new a();

    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    public static final class b implements a.b<InterfaceC2576d> {
        b() {
        }
    }

    public static final class c implements a.b<v> {
        c() {
        }
    }

    static final class d extends ax.Gb.m implements ax.Fb.l<ax.I0.a, ax.G0.r> {
        public static final d q = new d();

        d() {
            super(1);
        }

        @Override // ax.Fb.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ax.G0.r invoke(ax.I0.a aVar) {
            ax.Gb.l.f(aVar, "$this$initializer");
            return new ax.G0.r();
        }
    }

    public static final l a(ax.I0.a aVar) {
        ax.Gb.l.f(aVar, "<this>");
        InterfaceC2576d interfaceC2576d = (InterfaceC2576d) aVar.a(a);
        if (interfaceC2576d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        v vVar = (v) aVar.a(b);
        if (vVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(c);
        String str = (String) aVar.a(q.c.c);
        if (str != null) {
            return b(interfaceC2576d, vVar, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final l b(InterfaceC2576d interfaceC2576d, v vVar, String str, Bundle bundle) {
        ax.G0.q d2 = d(interfaceC2576d);
        ax.G0.r e = e(vVar);
        l lVar = e.f().get(str);
        if (lVar != null) {
            return lVar;
        }
        l a2 = l.f.a(d2.b(str), bundle);
        e.f().put(str, a2);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends InterfaceC2576d & v> void c(T t) {
        ax.Gb.l.f(t, "<this>");
        d.b b2 = t.getLifecycle().b();
        if (b2 != d.b.INITIALIZED && b2 != d.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            ax.G0.q qVar = new ax.G0.q(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", qVar);
            t.getLifecycle().a(new SavedStateHandleAttacher(qVar));
        }
    }

    public static final ax.G0.q d(InterfaceC2576d interfaceC2576d) {
        ax.Gb.l.f(interfaceC2576d, "<this>");
        a.c c2 = interfaceC2576d.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        ax.G0.q qVar = c2 instanceof ax.G0.q ? (ax.G0.q) c2 : null;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final ax.G0.r e(v vVar) {
        ax.Gb.l.f(vVar, "<this>");
        ax.I0.c cVar = new ax.I0.c();
        cVar.a(w.b(ax.G0.r.class), d.q);
        return (ax.G0.r) new q(vVar, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", ax.G0.r.class);
    }
}
