package ax.ma;

import ax.Lb.e;
import ax.tb.C3139o;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.ma.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2546c implements ax.Lb.b<Integer>, Iterable<Integer>, ax.Hb.a {
    public static final C2546c d0 = new C2546c();
    private static final List<Integer> e0 = C3139o.l(4, 5);
    private final /* synthetic */ e c0;
    private final /* synthetic */ e q;

    private C2546c() {
        e eVar;
        e eVar2;
        eVar = d.a;
        this.q = eVar;
        eVar2 = d.a;
        this.c0 = eVar2;
    }

    @Override // ax.Lb.b
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return this.c0.iterator();
    }

    public boolean k(int i) {
        return this.q.r(i);
    }

    public final List<Integer> l() {
        return e0;
    }

    @Override // ax.Lb.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer i() {
        return this.q.i();
    }

    @Override // ax.Lb.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer g() {
        return this.q.g();
    }

    public String toString() {
        e eVar;
        eVar = d.a;
        return eVar.toString();
    }
}
