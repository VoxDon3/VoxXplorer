package ax.wb;

import ax.Gb.l;
import ax.i.s;
import ax.wb.i;

/* loaded from: classes3.dex */
public interface f extends i.b {
    public static final b b0 = b.q;

    public static final class a {
        public static <E extends i.b> E a(f fVar, i.c<E> cVar) {
            l.f(cVar, "key");
            if (!(cVar instanceof AbstractC3381b)) {
                if (f.b0 != cVar) {
                    return null;
                }
                l.d(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            AbstractC3381b abstractC3381b = (AbstractC3381b) cVar;
            if (abstractC3381b.a(fVar.getKey())) {
                E e = (E) abstractC3381b.b(fVar);
                if (s.a(e)) {
                    return e;
                }
            }
            return null;
        }

        public static i b(f fVar, i.c<?> cVar) {
            l.f(cVar, "key");
            if (!(cVar instanceof AbstractC3381b)) {
                return f.b0 == cVar ? j.q : fVar;
            }
            AbstractC3381b abstractC3381b = (AbstractC3381b) cVar;
            return (!abstractC3381b.a(fVar.getKey()) || abstractC3381b.b(fVar) == null) ? fVar : j.q;
        }
    }

    public static final class b implements i.c<f> {
        static final /* synthetic */ b q = new b();

        private b() {
        }
    }

    <T> e<T> A(e<? super T> eVar);

    void s0(e<?> eVar);
}
