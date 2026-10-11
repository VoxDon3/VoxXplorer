package ax.k2;

import ax.o2.h;

/* renamed from: ax.k2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2374e implements h.c {
    private final h.c a;
    private final C2372c b;

    public C2374e(h.c cVar, C2372c c2372c) {
        ax.Gb.l.f(cVar, "delegate");
        ax.Gb.l.f(c2372c, "autoCloser");
        this.a = cVar;
        this.b = c2372c;
    }

    @Override // ax.o2.h.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2373d a(h.b bVar) {
        ax.Gb.l.f(bVar, "configuration");
        return new C2373d(this.a.a(bVar), this.b);
    }
}
