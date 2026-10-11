package ax.n2;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.savedstate.Recreator;
import ax.Gb.g;
import ax.Gb.l;

/* renamed from: ax.n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2575c {
    public static final a d = new a(null);
    private final InterfaceC2576d a;
    private final androidx.savedstate.a b;
    private boolean c;

    /* renamed from: ax.n2.c$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final C2575c a(InterfaceC2576d interfaceC2576d) {
            l.f(interfaceC2576d, "owner");
            return new C2575c(interfaceC2576d, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C2575c(InterfaceC2576d interfaceC2576d, g gVar) {
        this(interfaceC2576d);
    }

    public static final C2575c a(InterfaceC2576d interfaceC2576d) {
        return d.a(interfaceC2576d);
    }

    public final androidx.savedstate.a b() {
        return this.b;
    }

    public final void c() {
        androidx.lifecycle.d lifecycle = this.a.getLifecycle();
        if (lifecycle.b() != d.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(this.a));
        this.b.e(lifecycle);
        this.c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.c) {
            c();
        }
        androidx.lifecycle.d lifecycle = this.a.getLifecycle();
        if (!lifecycle.b().h(d.b.STARTED)) {
            this.b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        l.f(bundle, "outBundle");
        this.b.g(bundle);
    }

    private C2575c(InterfaceC2576d interfaceC2576d) {
        this.a = interfaceC2576d;
        this.b = new androidx.savedstate.a();
    }
}
