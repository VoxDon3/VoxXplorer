package ax.gb;

import ax.db.s;

/* renamed from: ax.gb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2134a {
    private static final b a = new b();

    /* renamed from: ax.gb.a$b */
    private static final class b extends AbstractC2134a {
        @Override // ax.gb.AbstractC2134a
        public <C> void a(s sVar, C c, c<C> cVar) {
            ax.cb.b.b(sVar, "spanContext");
            ax.cb.b.b(c, "carrier");
            ax.cb.b.b(cVar, "setter");
        }

        private b() {
        }
    }

    /* renamed from: ax.gb.a$c */
    public static abstract class c<C> {
        public abstract void a(C c, String str, String str2);
    }

    public abstract <C> void a(s sVar, C c2, c<C> cVar);
}
