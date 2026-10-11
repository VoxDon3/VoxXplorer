package ax.Wc;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ax.Wc.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1136y {
    private OutputStream a;

    C1136y(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static C1136y a(OutputStream outputStream) {
        return new C1136y(outputStream);
    }

    public static C1136y b(OutputStream outputStream, String str) {
        return str.equals("DER") ? new C1131v0(outputStream) : str.equals("DL") ? new L0(outputStream) : new C1136y(outputStream);
    }

    static int f(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    static int g(boolean z, int i) {
        return (z ? 1 : 0) + f(i) + i;
    }

    static int h(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    C1131v0 d() {
        return new C1131v0(this.a);
    }

    L0 e() {
        return new L0(this.a);
    }

    final void i(int i) throws IOException {
        this.a.write(i);
    }

    final void j(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
    }

    final void k(int i) throws IOException {
        if (i < 128) {
            i(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | 128);
                j(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    void l(InterfaceC1101g[] interfaceC1101gArr) throws IOException {
        for (InterfaceC1101g interfaceC1101g : interfaceC1101gArr) {
            interfaceC1101g.g().s(this, true);
        }
    }

    final void m(boolean z, int i, byte b) throws IOException {
        s(z, i);
        k(1);
        i(b);
    }

    final void n(boolean z, int i, byte b, byte[] bArr, int i2, int i3) throws IOException {
        s(z, i);
        k(i3 + 1);
        i(b);
        j(bArr, i2, i3);
    }

    final void o(boolean z, int i, byte[] bArr) throws IOException {
        s(z, i);
        k(bArr.length);
        j(bArr, 0, bArr.length);
    }

    final void p(boolean z, int i, byte[] bArr, int i2, int i3) throws IOException {
        s(z, i);
        k(i3);
        j(bArr, i2, i3);
    }

    final void q(boolean z, int i, byte[] bArr, int i2, int i3, byte b) throws IOException {
        s(z, i);
        k(i3 + 1);
        j(bArr, i2, i3);
        i(b);
    }

    final void r(boolean z, int i, InterfaceC1101g[] interfaceC1101gArr) throws IOException {
        s(z, i);
        i(128);
        l(interfaceC1101gArr);
        i(0);
        i(0);
    }

    final void s(boolean z, int i) throws IOException {
        if (z) {
            i(i);
        }
    }

    final void t(boolean z, int i, int i2) throws IOException {
        if (z) {
            if (i2 < 31) {
                i(i | i2);
                return;
            }
            byte[] bArr = new byte[6];
            int i3 = 5;
            bArr[5] = (byte) (i2 & 127);
            while (i2 > 127) {
                i2 >>>= 7;
                i3--;
                bArr[i3] = (byte) ((i2 & 127) | 128);
            }
            int i4 = i3 - 1;
            bArr[i4] = (byte) (31 | i);
            j(bArr, i4, 6 - i4);
        }
    }

    void u(A a, boolean z) throws IOException {
        a.s(this, z);
    }

    void v(A[] aArr) throws IOException {
        for (A a : aArr) {
            a.s(this, true);
        }
    }

    void c() throws IOException {
    }
}
