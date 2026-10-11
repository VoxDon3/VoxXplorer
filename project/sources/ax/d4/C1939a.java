package ax.d4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ax.d4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1939a implements h {
    private final Set<i> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    C1939a() {
    }

    @Override // ax.d4.h
    public void a(i iVar) {
        this.a.remove(iVar);
    }

    @Override // ax.d4.h
    public void b(i iVar) {
        this.a.add(iVar);
        if (this.c) {
            iVar.f();
        } else if (this.b) {
            iVar.b();
        } else {
            iVar.a();
        }
    }

    void c() {
        this.c = true;
        Iterator it = ax.k4.i.i(this.a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).f();
        }
    }

    void d() {
        this.b = true;
        Iterator it = ax.k4.i.i(this.a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).b();
        }
    }

    void e() {
        this.b = false;
        Iterator it = ax.k4.i.i(this.a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }
}
