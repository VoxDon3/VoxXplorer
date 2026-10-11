package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.d;
import androidx.savedstate.a;
import ax.G0.v;
import ax.n2.InterfaceC2576d;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {
    public static final LegacySavedStateHandleController a = new LegacySavedStateHandleController();

    public static final class a implements a.InterfaceC0043a {
        @Override // androidx.savedstate.a.InterfaceC0043a
        public void a(InterfaceC2576d interfaceC2576d) {
            ax.Gb.l.f(interfaceC2576d, "owner");
            if (!(interfaceC2576d instanceof v)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            r viewModelStore = ((v) interfaceC2576d).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = interfaceC2576d.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                p b = viewModelStore.b(it.next());
                ax.Gb.l.c(b);
                LegacySavedStateHandleController.a(b, savedStateRegistry, interfaceC2576d.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(p pVar, androidx.savedstate.a aVar, d dVar) {
        ax.Gb.l.f(pVar, "viewModel");
        ax.Gb.l.f(aVar, "registry");
        ax.Gb.l.f(dVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) pVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.h(aVar, dVar);
        a.c(aVar, dVar);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, d dVar, String str, Bundle bundle) {
        ax.Gb.l.f(aVar, "registry");
        ax.Gb.l.f(dVar, "lifecycle");
        ax.Gb.l.c(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, l.f.a(aVar.b(str), bundle));
        savedStateHandleController.h(aVar, dVar);
        a.c(aVar, dVar);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final d dVar) {
        d.b b = dVar.b();
        if (b == d.b.INITIALIZED || b.h(d.b.STARTED)) {
            aVar.i(a.class);
        } else {
            dVar.a(new f() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.f
                public void b(ax.G0.h hVar, d.a aVar2) {
                    ax.Gb.l.f(hVar, "source");
                    ax.Gb.l.f(aVar2, "event");
                    if (aVar2 == d.a.ON_START) {
                        d.this.c(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
