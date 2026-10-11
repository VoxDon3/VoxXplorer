package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements f {
    private final l c0;
    private boolean d0;
    private final String q;

    public SavedStateHandleController(String str, l lVar) {
        ax.Gb.l.f(str, "key");
        ax.Gb.l.f(lVar, "handle");
        this.q = str;
        this.c0 = lVar;
    }

    @Override // androidx.lifecycle.f
    public void b(ax.G0.h hVar, d.a aVar) {
        ax.Gb.l.f(hVar, "source");
        ax.Gb.l.f(aVar, "event");
        if (aVar == d.a.ON_DESTROY) {
            this.d0 = false;
            hVar.getLifecycle().c(this);
        }
    }

    public final void h(androidx.savedstate.a aVar, d dVar) {
        ax.Gb.l.f(aVar, "registry");
        ax.Gb.l.f(dVar, "lifecycle");
        if (this.d0) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.d0 = true;
        dVar.a(this);
        aVar.h(this.q, this.c0.c());
    }

    public final l i() {
        return this.c0;
    }

    public final boolean j() {
        return this.d0;
    }
}
