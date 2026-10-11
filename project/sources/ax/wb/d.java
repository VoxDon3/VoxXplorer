package ax.wb;

import ax.Fb.p;
import ax.Gb.l;
import ax.wb.i;
import java.io.Serializable;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class d implements i, Serializable {
    private final i.b c0;
    private final i q;

    public d(i iVar, i.b bVar) {
        l.f(iVar, "left");
        l.f(bVar, "element");
        this.q = iVar;
        this.c0 = bVar;
    }

    private final boolean d(i.b bVar) {
        return l.a(a(bVar.getKey()), bVar);
    }

    private final boolean f(d dVar) {
        while (d(dVar.c0)) {
            i iVar = dVar.q;
            if (!(iVar instanceof d)) {
                l.d(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return d((i.b) iVar);
            }
            dVar = (d) iVar;
        }
        return false;
    }

    private final int h() {
        int i = 2;
        d dVar = this;
        while (true) {
            i iVar = dVar.q;
            dVar = iVar instanceof d ? (d) iVar : null;
            if (dVar == null) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(String str, i.b bVar) {
        l.f(str, "acc");
        l.f(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    @Override // ax.wb.i
    public <E extends i.b> E a(i.c<E> cVar) {
        l.f(cVar, "key");
        d dVar = this;
        while (true) {
            E e = (E) dVar.c0.a(cVar);
            if (e != null) {
                return e;
            }
            i iVar = dVar.q;
            if (!(iVar instanceof d)) {
                return (E) iVar.a(cVar);
            }
            dVar = (d) iVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.h() == h() && dVar.f(this);
    }

    public int hashCode() {
        return this.q.hashCode() + this.c0.hashCode();
    }

    @Override // ax.wb.i
    public i m(i.c<?> cVar) {
        l.f(cVar, "key");
        if (this.c0.a(cVar) != null) {
            return this.q;
        }
        i m = this.q.m(cVar);
        return m == this.q ? this : m == j.q ? this.c0 : new d(m, this.c0);
    }

    @Override // ax.wb.i
    public i p(i iVar) {
        return i.a.b(this, iVar);
    }

    public String toString() {
        return '[' + ((String) v(HttpUrl.FRAGMENT_ENCODE_SET, new p() { // from class: ax.wb.c
            @Override // ax.Fb.p
            public final Object j(Object obj, Object obj2) {
                String i;
                i = d.i((String) obj, (i.b) obj2);
                return i;
            }
        })) + ']';
    }

    @Override // ax.wb.i
    public <R> R v(R r, p<? super R, ? super i.b, ? extends R> pVar) {
        l.f(pVar, "operation");
        return pVar.j((Object) this.q.v(r, pVar), this.c0);
    }
}
