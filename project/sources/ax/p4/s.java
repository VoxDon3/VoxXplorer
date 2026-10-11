package ax.p4;

import ax.v4.AbstractC3276c;
import ax.v4.C3277d;
import java.io.IOException;

/* loaded from: classes.dex */
public final class s {
    static final AbstractC3276c<s> c = new a();
    private final String a;
    private final String b;

    class a extends AbstractC3276c<s> {
        a() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public s a(ax.T4.j jVar) throws IOException, ax.T4.i {
            AbstractC3276c.h(jVar);
            String str = null;
            String str2 = null;
            while (jVar.j() == ax.T4.m.FIELD_NAME) {
                String g = jVar.g();
                jVar.H();
                if ("text".equals(g)) {
                    str = C3277d.f().a(jVar);
                } else if ("locale".equals(g)) {
                    str2 = C3277d.f().a(jVar);
                } else {
                    AbstractC3276c.o(jVar);
                }
            }
            if (str == null) {
                throw new ax.T4.i(jVar, "Required field \"text\" missing.");
            }
            if (str2 == null) {
                throw new ax.T4.i(jVar, "Required field \"locale\" missing.");
            }
            s sVar = new s(str, str2);
            AbstractC3276c.e(jVar);
            return sVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void k(s sVar, ax.T4.g gVar) throws IOException, ax.T4.f {
            throw new UnsupportedOperationException("Error wrapper serialization not supported.");
        }
    }

    public s(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("text");
        }
        if (str2 == null) {
            throw new NullPointerException("locale");
        }
        this.a = str;
        this.b = str2;
    }

    public String toString() {
        return this.a;
    }
}
