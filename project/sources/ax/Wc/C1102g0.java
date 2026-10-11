package ax.Wc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.Wc.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1102g0 extends InputStream implements InputStreamRetargetInterface {
    private final boolean c0;
    private boolean d0 = true;
    private int e0 = 0;
    private InterfaceC1095d f0;
    private InputStream g0;
    private final F q;

    C1102g0(F f, boolean z) {
        this.q = f;
        this.c0 = z;
    }

    private InterfaceC1095d a() throws IOException {
        InterfaceC1101g g = this.q.g();
        if (g == null) {
            if (!this.c0 || this.e0 == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.e0);
        }
        if (g instanceof InterfaceC1095d) {
            if (this.e0 == 0) {
                return (InterfaceC1095d) g;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + g.getClass());
    }

    int b() {
        return this.e0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.g0 == null) {
            if (!this.d0) {
                return -1;
            }
            InterfaceC1095d a = a();
            this.f0 = a;
            if (a == null) {
                return -1;
            }
            this.d0 = false;
            this.g0 = a.i();
        }
        while (true) {
            int read = this.g0.read();
            if (read >= 0) {
                return read;
            }
            this.e0 = this.f0.k();
            InterfaceC1095d a2 = a();
            this.f0 = a2;
            if (a2 == null) {
                this.g0 = null;
                return -1;
            }
            this.g0 = a2.i();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.g0 == null) {
            if (!this.d0) {
                return -1;
            }
            InterfaceC1095d a = a();
            this.f0 = a;
            if (a == null) {
                return -1;
            }
            this.d0 = false;
            this.g0 = a.i();
        }
        while (true) {
            int read = this.g0.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.e0 = this.f0.k();
                InterfaceC1095d a2 = a();
                this.f0 = a2;
                if (a2 == null) {
                    this.g0 = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.g0 = a2.i();
            }
        }
    }
}
