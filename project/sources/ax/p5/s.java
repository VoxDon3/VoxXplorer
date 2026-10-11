package ax.p5;

import ax.n5.AbstractC2581c;
import ax.n5.C2580b;

/* loaded from: classes.dex */
final class s<T> implements ax.n5.h<T> {
    private final p a;
    private final String b;
    private final C2580b c;
    private final ax.n5.g<T, byte[]> d;
    private final t e;

    s(p pVar, String str, C2580b c2580b, ax.n5.g<T, byte[]> gVar, t tVar) {
        this.a = pVar;
        this.b = str;
        this.c = c2580b;
        this.d = gVar;
        this.e = tVar;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // ax.n5.h
    public void a(AbstractC2581c<T> abstractC2581c) {
        b(abstractC2581c, new ax.n5.j() { // from class: ax.p5.r
            @Override // ax.n5.j
            public final void a(Exception exc) {
                s.c(exc);
            }
        });
    }

    @Override // ax.n5.h
    public void b(AbstractC2581c<T> abstractC2581c, ax.n5.j jVar) {
        this.e.a(o.a().e(this.a).c(abstractC2581c).f(this.b).d(this.d).b(this.c).a(), jVar);
    }

    p d() {
        return this.a;
    }
}
