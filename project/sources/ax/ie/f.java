package ax.ie;

import ax.be.C1735c;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class f extends e {
    private final byte[] f;
    private int g;

    public f(int i, C1735c c1735c) {
        this.f = c1735c.a(i, false);
        l();
    }

    @Override // ax.ie.e
    public int f() {
        try {
            super.f();
            return this.g;
        } catch (IOException unused) {
            throw new Error();
        }
    }

    @Override // ax.ie.e
    public int j() {
        return this.g + ((int) this.c) + 4;
    }

    @Override // ax.ie.e
    public void l() {
        super.l();
        this.g = 0;
    }

    @Override // ax.ie.e
    void n(int i) {
        byte[] bArr = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void o(C1735c c1735c) {
        c1735c.d(this.f);
    }

    public void p(OutputStream outputStream) throws IOException {
        outputStream.write(this.f, 0, this.g);
    }
}
