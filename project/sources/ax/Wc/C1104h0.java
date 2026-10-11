package ax.Wc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.Wc.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1104h0 extends InputStream implements InputStreamRetargetInterface {
    private boolean c0 = true;
    private InputStream d0;
    private final F q;

    C1104h0(F f) {
        this.q = f;
    }

    private InterfaceC1134x a() throws IOException {
        InterfaceC1101g g = this.q.g();
        if (g == null) {
            return null;
        }
        if (g instanceof InterfaceC1134x) {
            return (InterfaceC1134x) g;
        }
        throw new IOException("unknown object encountered: " + g.getClass());
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InterfaceC1134x a;
        if (this.d0 == null) {
            if (!this.c0 || (a = a()) == null) {
                return -1;
            }
            this.c0 = false;
            this.d0 = a.e();
        }
        while (true) {
            int read = this.d0.read();
            if (read >= 0) {
                return read;
            }
            InterfaceC1134x a2 = a();
            if (a2 == null) {
                this.d0 = null;
                return -1;
            }
            this.d0 = a2.e();
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC1134x a;
        int i3 = 0;
        if (this.d0 == null) {
            if (!this.c0 || (a = a()) == null) {
                return -1;
            }
            this.c0 = false;
            this.d0 = a.e();
        }
        while (true) {
            int read = this.d0.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                InterfaceC1134x a2 = a();
                if (a2 == null) {
                    this.d0 = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.d0 = a2.e();
            }
        }
    }
}
