package ax.wb;

import ax.Fb.p;
import ax.Gb.l;
import ax.wb.f;
import ax.wb.i;

/* loaded from: classes3.dex */
public interface i {

    public static final class a {
        public static i b(i iVar, i iVar2) {
            l.f(iVar2, "context");
            return iVar2 == j.q ? iVar : (i) iVar2.v(iVar, new p() { // from class: ax.wb.h
                @Override // ax.Fb.p
                public final Object j(Object obj, Object obj2) {
                    i c;
                    c = i.a.c((i) obj, (i.b) obj2);
                    return c;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i c(i iVar, b bVar) {
            l.f(iVar, "acc");
            l.f(bVar, "element");
            i m = iVar.m(bVar.getKey());
            j jVar = j.q;
            if (m == jVar) {
                return bVar;
            }
            f.b bVar2 = f.b0;
            f fVar = (f) m.a(bVar2);
            if (fVar == null) {
                return new d(m, bVar);
            }
            i m2 = m.m(bVar2);
            return m2 == jVar ? new d(bVar, fVar) : new d(new d(m2, bVar), fVar);
        }
    }

    public interface b extends i {

        public static final class a {
            public static <R> R a(b bVar, R r, p<? super R, ? super b, ? extends R> pVar) {
                l.f(pVar, "operation");
                return pVar.j(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                l.f(cVar, "key");
                if (!l.a(bVar.getKey(), cVar)) {
                    return null;
                }
                l.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static i c(b bVar, c<?> cVar) {
                l.f(cVar, "key");
                return l.a(bVar.getKey(), cVar) ? j.q : bVar;
            }

            public static i d(b bVar, i iVar) {
                l.f(iVar, "context");
                return a.b(bVar, iVar);
            }
        }

        @Override // ax.wb.i
        <E extends b> E a(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <E extends b> E a(c<E> cVar);

    i m(c<?> cVar);

    i p(i iVar);

    <R> R v(R r, p<? super R, ? super b, ? extends R> pVar);
}
