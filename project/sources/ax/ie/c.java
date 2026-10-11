package ax.ie;

import ax.be.C1735c;
import ax.be.C1741i;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class c extends b {
    private final byte[] c;
    private int d;

    public c(int i, C1735c c1735c) {
        byte[] a = c1735c.a(i - 5, false);
        this.c = a;
        this.d = a.length;
    }

    @Override // ax.ie.b
    public void f() throws IOException {
        int i = this.a;
        if (((-16777216) & i) == 0) {
            try {
                int i2 = this.b << 8;
                byte[] bArr = this.c;
                int i3 = this.d;
                this.d = i3 + 1;
                this.b = i2 | (bArr[i3] & 255);
                this.a = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C1741i();
            }
        }
    }

    public boolean g() {
        return this.d == this.c.length && this.b == 0;
    }

    public void h(DataInputStream dataInputStream, int i) throws IOException {
        if (i < 5) {
            throw new C1741i();
        }
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C1741i();
        }
        this.b = dataInputStream.readInt();
        this.a = -1;
        int i2 = i - 5;
        byte[] bArr = this.c;
        int length = bArr.length - i2;
        this.d = length;
        dataInputStream.readFully(bArr, length, i2);
    }

    public void i(C1735c c1735c) {
        c1735c.d(this.c);
    }
}
