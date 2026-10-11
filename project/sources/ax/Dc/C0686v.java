package ax.Dc;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: ax.Dc.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0686v extends ax.Ic.a {
    private final boolean[] n0;

    public C0686v(InputStream inputStream) throws IOException {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
        L(9);
        A(13);
        this.n0 = new boolean[q()];
        for (int i = 0; i < 256; i++) {
            this.n0[i] = true;
        }
        d0(m() + 1);
    }

    private void o0() {
        boolean[] zArr = new boolean[8192];
        int i = 0;
        while (true) {
            boolean[] zArr2 = this.n0;
            if (i >= zArr2.length) {
                break;
            }
            if (zArr2[i] && p(i) != -1) {
                zArr[p(i)] = true;
            }
            i++;
        }
        for (int m = m() + 1; m < 8192; m++) {
            if (!zArr[m]) {
                this.n0[m] = false;
                W(m, -1);
            }
        }
    }

    @Override // ax.Ic.a
    protected int d(int i, byte b) throws IOException {
        int u = u();
        while (u < 8192 && this.n0[u]) {
            u++;
        }
        d0(u);
        int e = e(i, b, 8192);
        if (e >= 0) {
            this.n0[e] = true;
        }
        return e;
    }

    @Override // ax.Ic.a
    protected int g() throws IOException {
        int H = H();
        if (H < 0) {
            return -1;
        }
        boolean z = false;
        if (H != m()) {
            if (!this.n0[H]) {
                H = f();
                z = true;
            }
            return j(H, z);
        }
        int H2 = H();
        if (H2 < 0) {
            throw new IOException("Unexpected EOF;");
        }
        if (H2 == 1) {
            if (o() >= 13) {
                throw new IOException("Attempt to increase code size beyond maximum");
            }
            v();
        } else {
            if (H2 != 2) {
                throw new IOException("Invalid clear code subcode " + H2);
            }
            o0();
            d0(m() + 1);
        }
        return 0;
    }
}
