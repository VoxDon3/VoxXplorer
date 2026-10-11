/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.savedstate.a;
import ax.G0.h;
import ax.G0.v;
import java.util.Iterator;

public final class LegacySavedStateHandleController {
    public static final LegacySavedStateHandleController a = new LegacySavedStateHandleController();

    private LegacySavedStateHandleController() {
    }

    public static final void a(p object, androidx.savedstate.a a8, d d8) {
        ax.Gb.l.f(object, "viewModel");
        ax.Gb.l.f(a8, "registry");
        ax.Gb.l.f(d8, "lifecycle");
        object = (SavedStateHandleController)((p)object).c("androidx.lifecycle.savedstate.vm.tag");
        if (object != null && !((SavedStateHandleController)object).j()) {
            ((SavedStateHandleController)object).h(a8, d8);
            a.c(a8, d8);
        }
    }

    public static final SavedStateHandleController b(androidx.savedstate.a a8, d d8, String object, Bundle bundle) {
        ax.Gb.l.f(a8, "registry");
        ax.Gb.l.f(d8, "lifecycle");
        ax.Gb.l.c(object);
        Bundle bundle2 = a8.b((String)object);
        object = new SavedStateHandleController((String)object, l.f.a(bundle2, bundle));
        ((SavedStateHandleController)object).h(a8, d8);
        a.c(a8, d8);
        return object;
    }

    private final void c(androidx.savedstate.a a8, d d8) {
        d.b b8 = d8.b();
        if (b8 != d.b.c0 && !b8.h(d.b.e0)) {
            d8.a(new f(d8, a8){
                final androidx.savedstate.a c0;
                final d q;
                {
                    this.q = d8;
                    this.c0 = a8;
                }

                public void b(h h8, d.a a8) {
                    ax.Gb.l.f(h8, "source");
                    ax.Gb.l.f((Object)((Object)a8), "event");
                    if (a8 == d.a.ON_START) {
                        this.q.c(this);
                        this.c0.i(a.class);
                    }
                }
            });
            return;
        }
        a8.i(a.class);
    }

    public static final class a
    implements a.a {
        @Override
        public void a(ax.n2.d d8) {
            ax.Gb.l.f(d8, "owner");
            if (d8 instanceof v) {
                r r8 = ((v)((Object)d8)).getViewModelStore();
                androidx.savedstate.a a8 = d8.getSavedStateRegistry();
                Iterator<String> iterator = r8.c().iterator();
                while (iterator.hasNext()) {
                    p p8 = r8.b(iterator.next());
                    ax.Gb.l.c(p8);
                    LegacySavedStateHandleController.a(p8, a8, d8.getLifecycle());
                }
                if (!r8.c().isEmpty()) {
                    a8.i(a.class);
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }
}

