package ax.W2;

import ax.W2.h;
import java.util.List;

/* renamed from: ax.W2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1009a extends h {
    private List<ax.U2.f> d;
    private boolean e;

    public static C1009a m() {
        return new C1009a();
    }

    @Override // ax.W2.h
    protected j b() {
        C1010b c1010b = new C1010b(f(), this.d, this.e);
        k();
        return c1010b;
    }

    public void k() {
        this.d = null;
        this.e = false;
    }

    public void l(List<ax.U2.f> list, boolean z, h.a aVar) {
        this.d = list;
        this.e = z;
        i(aVar);
        j(h.c.FILLED);
    }
}
