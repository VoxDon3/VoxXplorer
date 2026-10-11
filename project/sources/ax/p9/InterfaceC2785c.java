package ax.p9;

import ax.Q8.q;
import ax.k9.e;
import ax.r9.C3016b;
import ax.s9.n;

/* renamed from: ax.p9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2785c {
    public static final InterfaceC2785c a = new a();

    /* renamed from: ax.p9.c$a */
    class a implements InterfaceC2785c {
        a() {
        }

        @Override // ax.p9.InterfaceC2785c
        public n a() {
            return n.a;
        }

        @Override // ax.p9.InterfaceC2785c
        public <T> T b(C3016b c3016b, e eVar, b<T> bVar) {
            return bVar.a(eVar);
        }

        @Override // ax.p9.InterfaceC2785c
        public <T> T c(C3016b c3016b, q qVar, e eVar, b<T> bVar) throws C2784b {
            return bVar.a(eVar);
        }
    }

    /* renamed from: ax.p9.c$b */
    public interface b<T> {
        T a(e eVar);
    }

    n a();

    <T> T b(C3016b c3016b, e eVar, b<T> bVar) throws C2784b;

    <T> T c(C3016b c3016b, q qVar, e eVar, b<T> bVar) throws C2784b;
}
