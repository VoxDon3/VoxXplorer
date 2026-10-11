package ax.p4;

import ax.v4.AbstractC3276c;
import java.io.IOException;

/* renamed from: ax.p4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2765b<T> {
    private final T a;
    private s b;

    /* renamed from: ax.p4.b$a */
    static final class a<T> extends AbstractC3276c<C2765b<T>> {
        private AbstractC3276c<T> b;

        public a(AbstractC3276c<T> abstractC3276c) {
            this.b = abstractC3276c;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C2765b<T> a(ax.T4.j jVar) throws IOException, ax.T4.i {
            AbstractC3276c.h(jVar);
            T t = null;
            s sVar = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("error".equals(g)) {
                    t = this.b.a(jVar);
                } else if ("user_message".equals(g)) {
                    sVar = s.c.a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (t == null) {
                throw new ax.T4.i(jVar, "Required field \"error\" missing.");
            }
            C2765b<T> c2765b = new C2765b<>(t, sVar);
            AbstractC3276c.e(jVar);
            return c2765b;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(C2765b<T> c2765b, ax.T4.g gVar) throws IOException, ax.T4.f {
            throw new UnsupportedOperationException("Error wrapper serialization not supported.");
        }
    }

    public C2765b(T t, s sVar) {
        if (t == null) {
            throw new NullPointerException("error");
        }
        this.a = t;
        this.b = sVar;
    }

    public T a() {
        return this.a;
    }

    public s b() {
        return this.b;
    }
}
