package ax.Qb;

import ax.Vb.C1003j;
import ax.Vb.C1006m;
import ax.Vb.C1007n;
import ax.wb.AbstractC3380a;
import ax.wb.AbstractC3381b;
import ax.wb.f;
import ax.wb.i;

/* loaded from: classes3.dex */
public abstract class G extends AbstractC3380a implements ax.wb.f {
    public static final a c0 = new a(null);

    public static final class a extends AbstractC3381b<ax.wb.f, G> {

        /* renamed from: ax.Qb.G$a$a, reason: collision with other inner class name */
        static final class C0179a extends ax.Gb.m implements ax.Fb.l<i.b, G> {
            public static final C0179a q = new C0179a();

            C0179a() {
                super(1);
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(i.b bVar) {
                if (bVar instanceof G) {
                    return (G) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
            super(ax.wb.f.b0, C0179a.q);
        }
    }

    public G() {
        super(ax.wb.f.b0);
    }

    @Override // ax.wb.f
    public final <T> ax.wb.e<T> A(ax.wb.e<? super T> eVar) {
        return new C1003j(this, eVar);
    }

    public G Y0(int i) {
        C1007n.a(i);
        return new C1006m(this, i);
    }

    @Override // ax.wb.AbstractC3380a, ax.wb.i.b, ax.wb.i
    public <E extends i.b> E a(i.c<E> cVar) {
        return (E) f.a.a(this, cVar);
    }

    public abstract void b(ax.wb.i iVar, Runnable runnable);

    public boolean f(ax.wb.i iVar) {
        return true;
    }

    @Override // ax.wb.AbstractC3380a, ax.wb.i
    public ax.wb.i m(i.c<?> cVar) {
        return f.a.b(this, cVar);
    }

    @Override // ax.wb.f
    public final void s0(ax.wb.e<?> eVar) {
        ax.Gb.l.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C1003j) eVar).u();
    }

    public String toString() {
        return N.a(this) + '@' + N.b(this);
    }
}
