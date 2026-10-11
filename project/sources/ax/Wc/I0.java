package ax.Wc;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class I0 implements InterfaceC1095d {
    private int c0 = 0;
    private final T0 q;

    I0(T0 t0) {
        this.q = t0;
    }

    private InputStream a(boolean z) throws IOException {
        int c = this.q.c();
        if (c < 1) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int read = this.q.read();
        this.c0 = read;
        if (read > 0) {
            if (c < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (read > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
            if (z) {
                throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.c0);
            }
        }
        return this.q;
    }

    @Override // ax.Wc.InterfaceC1101g
    public A g() {
        try {
            return l();
        } catch (IOException e) {
            throw new C1138z("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }

    @Override // ax.Wc.InterfaceC1095d
    public InputStream i() throws IOException {
        return a(false);
    }

    @Override // ax.Wc.InterfaceC1095d
    public int k() {
        return this.c0;
    }

    @Override // ax.Wc.U0
    public A l() throws IOException {
        return AbstractC1093c.C(this.q.e());
    }
}
