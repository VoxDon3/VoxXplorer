package ax.kc;

import ax.cc.C1857d;
import java.util.Collection;
import java.util.Comparator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ax.kc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2423e {
    public static final Comparator<C2423e> f = new a();
    protected final Collection<Object> b;
    private final ax.hc.g c;
    private final C2424f d;
    private final UUID a = UUID.randomUUID();
    private final CopyOnWriteArrayList<Runnable> e = new CopyOnWriteArrayList<>();

    /* renamed from: ax.kc.e$a */
    static class a implements Comparator<C2423e> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2423e c2423e, C2423e c2423e2) {
            int compareTo = Integer.valueOf(c2423e2.c()).compareTo(Integer.valueOf(c2423e.c()));
            return compareTo == 0 ? c2423e2.a.compareTo(c2423e.a) : compareTo;
        }
    }

    C2423e(C2424f c2424f, ax.hc.g gVar, Collection<Object> collection) {
        this.d = c2424f;
        this.c = gVar;
        this.b = collection;
    }

    public Class[] b() {
        return this.d.a().d();
    }

    public int c() {
        return this.d.a().g();
    }

    public boolean d(Class<?> cls) {
        return this.d.a().h(cls);
    }

    public void e(C1857d c1857d, Object obj) {
        if (this.b.isEmpty()) {
            return;
        }
        this.c.a(c1857d, obj, this.b);
    }

    public void f(Object obj) {
        this.b.add(obj);
        for (Runnable runnable : (Runnable[]) this.e.toArray(new Runnable[0])) {
            runnable.run();
        }
    }
}
