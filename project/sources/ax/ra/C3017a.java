package ax.ra;

import ax.oa.C2738a;
import java.io.IOException;
import java.util.EnumSet;

/* renamed from: ax.ra.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3017a extends C2738a {
    private final int i;
    private final int j;
    private final ax.oa.b k;
    private final ax.oa.b l;

    public C3017a(int i, int i2, ax.oa.b bVar, ax.oa.b bVar2) {
        p(ax.oa.d.BIND);
        q(EnumSet.of(ax.oa.e.FIRST_FRAGMENT, ax.oa.e.LAST_FRAGMENT));
        l((short) 72);
        this.i = i;
        this.j = i2;
        this.k = bVar;
        this.l = bVar2;
    }

    @Override // ax.oa.C2738a, ax.pa.b
    public void a(ax.pa.d dVar) throws IOException {
        super.a(dVar);
        dVar.e(this.i);
        dVar.e(this.j);
        dVar.c(0);
        dVar.b(1);
        dVar.b(0);
        dVar.e(0);
        dVar.e(0);
        dVar.b(1);
        dVar.b(0);
        dVar.a(this.k.p());
        dVar.e(this.k.h());
        dVar.e(this.k.j());
        dVar.a(this.l.p());
        dVar.e(this.l.h());
        dVar.e(this.l.j());
    }
}
