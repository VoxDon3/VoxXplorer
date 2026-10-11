package ax.d4;

import ax.g4.InterfaceC2113b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class n {
    private final Set<InterfaceC2113b> a = Collections.newSetFromMap(new WeakHashMap());
    private final List<InterfaceC2113b> b = new ArrayList();
    private boolean c;

    public boolean a(InterfaceC2113b interfaceC2113b) {
        if (interfaceC2113b == null) {
            return false;
        }
        boolean z = this.b.remove(interfaceC2113b) || this.a.remove(interfaceC2113b);
        if (z) {
            interfaceC2113b.clear();
            interfaceC2113b.recycle();
        }
        return z;
    }

    public void b() {
        Iterator it = ax.k4.i.i(this.a).iterator();
        while (it.hasNext()) {
            a((InterfaceC2113b) it.next());
        }
        this.b.clear();
    }

    public void c() {
        this.c = true;
        for (InterfaceC2113b interfaceC2113b : ax.k4.i.i(this.a)) {
            if (interfaceC2113b.isRunning()) {
                interfaceC2113b.f();
                this.b.add(interfaceC2113b);
            }
        }
    }

    public void d() {
        for (InterfaceC2113b interfaceC2113b : ax.k4.i.i(this.a)) {
            if (!interfaceC2113b.i() && !interfaceC2113b.isCancelled()) {
                interfaceC2113b.f();
                if (this.c) {
                    this.b.add(interfaceC2113b);
                } else {
                    interfaceC2113b.h();
                }
            }
        }
    }

    public void e() {
        this.c = false;
        for (InterfaceC2113b interfaceC2113b : ax.k4.i.i(this.a)) {
            if (!interfaceC2113b.i() && !interfaceC2113b.isCancelled() && !interfaceC2113b.isRunning()) {
                interfaceC2113b.h();
            }
        }
        this.b.clear();
    }

    public void f(InterfaceC2113b interfaceC2113b) {
        this.a.add(interfaceC2113b);
        if (this.c) {
            this.b.add(interfaceC2113b);
        } else {
            interfaceC2113b.h();
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.c + "}";
    }
}
