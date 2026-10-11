package ax.O8;

import ax.h9.C2171b;
import ax.h9.InterfaceC2172c;

/* loaded from: classes3.dex */
public class a implements InterfaceC2172c {
    private int a;
    private int b;

    @Override // ax.h9.InterfaceC2172c
    public int a() {
        return this.a;
    }

    @Override // ax.h9.InterfaceC2172c
    public void b(ax.Z8.a<?> aVar) {
        throw new UnsupportedOperationException("Receiving SMBv1 messages not supported in SMBJ");
    }

    @Override // ax.h9.InterfaceC2172c
    public int c() {
        return this.b;
    }

    public void d(int i) {
        this.b = i;
    }

    public void e(C2171b c2171b) {
        this.a = c2171b.V();
        c2171b.o(new byte[]{-1, 83, 77, 66});
        c2171b.j((byte) 114);
        c2171b.u(0L);
        c2171b.j((byte) 24);
        c2171b.s(51283);
        c2171b.s(0);
        c2171b.w(0L);
        c2171b.X();
        c2171b.s(0);
        c2171b.s(0);
        c2171b.s(0);
        c2171b.s(0);
    }
}
