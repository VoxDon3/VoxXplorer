package ax.kc;

import ax.cc.C1855b;
import ax.fc.C2093d;
import ax.fc.InterfaceC2090a;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ax.kc.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2424f {
    private final ax.jc.g a;
    private final Collection<InterfaceC2090a> b;
    private final C1855b c;

    public C2424f(C1855b c1855b, ax.jc.g gVar, Collection<InterfaceC2090a> collection) {
        this.c = c1855b;
        this.a = gVar;
        this.b = collection;
    }

    public ax.jc.g a() {
        return this.a;
    }

    public C1855b b() {
        return this.c;
    }

    public final void c(C2093d c2093d) {
        Iterator<InterfaceC2090a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(c2093d);
        }
    }
}
