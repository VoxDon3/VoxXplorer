package ax.q1;

import ax.E1.h;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class H {
    private final ax.S0.G a = new ax.S0.G(10);

    public ax.P0.C a(InterfaceC2858s interfaceC2858s, h.a aVar) throws IOException {
        ax.P0.C c = null;
        int i = 0;
        while (true) {
            try {
                interfaceC2858s.p(this.a.f(), 0, 10);
                this.a.b0(0);
                if (this.a.P() != 4801587) {
                    break;
                }
                this.a.c0(3);
                int L = this.a.L();
                int i2 = L + 10;
                if (c == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.f(), 0, bArr, 0, 10);
                    interfaceC2858s.p(bArr, 10, L);
                    c = new ax.E1.h(aVar).e(bArr, i2);
                } else {
                    interfaceC2858s.j(L);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC2858s.m();
        interfaceC2858s.j(i);
        return c;
    }
}
