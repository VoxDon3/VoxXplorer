package ax.j;

import android.content.Context;
import ax.Gb.l;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ax.j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2299a {
    private final Set<InterfaceC2300b> a = new CopyOnWriteArraySet();
    private volatile Context b;

    public final void a(InterfaceC2300b interfaceC2300b) {
        l.f(interfaceC2300b, "listener");
        Context context = this.b;
        if (context != null) {
            interfaceC2300b.a(context);
        }
        this.a.add(interfaceC2300b);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context) {
        l.f(context, "context");
        this.b = context;
        Iterator<InterfaceC2300b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    public final Context d() {
        return this.b;
    }

    public final void e(InterfaceC2300b interfaceC2300b) {
        l.f(interfaceC2300b, "listener");
        this.a.remove(interfaceC2300b);
    }
}
