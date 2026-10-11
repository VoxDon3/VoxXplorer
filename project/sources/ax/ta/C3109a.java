package ax.ta;

import ax.sa.EnumC3068a;
import ax.ua.AbstractC3226c;
import ax.ua.C3225b;
import ax.va.AbstractC3293b;
import ax.va.AbstractC3294c;
import ax.wa.AbstractC3378b;
import ax.wa.d;
import ax.wa.e;
import ax.wa.f;
import ax.ya.AbstractC3519a;
import ax.za.AbstractC3560a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.ta.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3109a extends AbstractC3519a {

    /* renamed from: ax.ta.a$a, reason: collision with other inner class name */
    private class C0464a extends b<d, C3225b> {
        C0464a(long j) {
            super(j);
        }

        @Override // ax.ta.C3109a.b
        AbstractC3293b<? extends AbstractC3378b<? extends f<d>>> c(long j, Long l) {
            return new AbstractC3293b.a(j, l);
        }

        @Override // ax.ta.C3109a.b
        String d() {
            return "NetrShareEnum[1]";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.ta.C3109a.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3225b b(d dVar) {
            return C3109a.this.h(dVar);
        }
    }

    /* renamed from: ax.ta.a$b */
    private abstract class b<S extends e, N extends AbstractC3226c> {
        private final long a;
        private final List<N> b = new ArrayList();

        b(long j) {
            this.a = j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        b<S, N> a() throws IOException {
            f f;
            e[] f2;
            ax.Qc.b bVar = new ax.Qc.b();
            while (true) {
                AbstractC3294c abstractC3294c = (AbstractC3294c) C3109a.this.b(c(this.a, bVar.j()), d(), EnumC3068a.ERROR_MORE_DATA, EnumC3068a.ERROR_SUCCESS);
                AbstractC3378b g = abstractC3294c.g();
                if (g != null && (f = g.f()) != null && (f2 = f.f()) != null) {
                    for (e eVar : f2) {
                        this.b.add(b(eVar));
                    }
                }
                if (EnumC3068a.ERROR_SUCCESS.l(abstractC3294c.b())) {
                    return this;
                }
                Long f3 = abstractC3294c.f();
                if (f3 == null) {
                    throw new ax.c9.e("NetrShareEnum resume handle null.");
                }
                if (f3.longValue() == bVar.j().longValue()) {
                    throw new ax.c9.e("NetrShareEnum resume handle not updated.");
                }
                bVar.d(f3);
            }
        }

        abstract N b(S s);

        abstract AbstractC3293b<? extends AbstractC3378b<? extends f<S>>> c(long j, Long l);

        abstract String d();

        List<N> e() {
            return this.b;
        }
    }

    public C3109a(AbstractC3560a abstractC3560a) {
        super(abstractC3560a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3225b h(d dVar) {
        if (dVar == null) {
            return null;
        }
        return new C3225b(c(dVar.d()), dVar.f(), c(dVar.e()));
    }

    public List<C3225b> g() throws IOException {
        return new C0464a(-1L).a().e();
    }
}
