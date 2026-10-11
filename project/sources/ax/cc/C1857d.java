package ax.cc;

import ax.dc.C1961a;
import ax.dc.C1962b;
import ax.fc.C2093d;
import ax.kc.C2423e;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ax.cc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1857d implements InterfaceC1856c {
    private final Collection<C2423e> a;
    private final Object b;
    private volatile b c;
    private final C1855b e;
    private volatile boolean d = false;
    private C2093d f = null;

    /* renamed from: ax.cc.d$a */
    public static class a {
        public C1857d a(C1855b c1855b, Collection<C2423e> collection, Object obj) {
            return new C1857d(c1855b, collection, obj, b.Initial);
        }
    }

    /* renamed from: ax.cc.d$b */
    private enum b {
        Initial,
        Scheduled,
        Running,
        Finished
    }

    protected C1857d(C1855b c1855b, Collection<C2423e> collection, Object obj, b bVar) {
        this.c = b.Initial;
        this.e = c1855b;
        this.a = collection;
        this.b = obj;
        this.c = bVar;
    }

    @Override // ax.cc.InterfaceC1856c
    public Object a() {
        return this.b;
    }

    public boolean b() {
        return C1961a.class.equals(this.b.getClass());
    }

    public boolean c() {
        return C1962b.class.equals(this.b.getClass());
    }

    public void d() {
        this.d = true;
    }

    public void e(C2093d c2093d) {
        this.f = c2093d;
    }

    @Override // ax.cc.InterfaceC1856c
    public void execute() {
        this.c = b.Running;
        Iterator<C2423e> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().e(this, this.b);
        }
        this.c = b.Finished;
        if (this.d) {
            return;
        }
        if (!c() && !b()) {
            this.e.d().a(new C1962b(this.b));
        } else {
            if (b()) {
                return;
            }
            this.e.d().a(new C1961a(this.b));
        }
    }
}
