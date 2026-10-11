package ax.pb;

import ax.qb.C2897e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
class F0 extends C2800d0 {
    private byte[] h0;
    private int i0;
    private int j0;
    private int k0;
    private boolean l0;
    Object m0;

    F0(C2806g0 c2806g0) throws C2794a0, MalformedURLException, UnknownHostException {
        super(c2806g0, (c2806g0.G0 & (-65281)) | 32);
        this.h0 = new byte[4096];
        this.l0 = (c2806g0.G0 & 1536) != 1536;
        this.m0 = new Object();
    }

    @Override // ax.pb.C2800d0, java.io.InputStream
    public int available() throws IOException {
        C2799d c2799d = C2796b0.D0;
        if (C2897e.c0 < 3) {
            return 0;
        }
        C2796b0.A0.println("Named Pipe available() does not apply to TRANSACT Named Pipes");
        return 0;
    }

    int c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.h0;
        int length = bArr2.length;
        int i3 = this.k0;
        if (i2 > length - i3) {
            int length2 = bArr2.length * 2;
            if (i2 > length2 - i3) {
                length2 = i2 + i3;
            }
            byte[] bArr3 = new byte[length2];
            this.h0 = bArr3;
            int length3 = bArr2.length;
            int i4 = this.i0;
            int i5 = length3 - i4;
            if (i3 > i5) {
                System.arraycopy(bArr2, i4, bArr3, 0, i5);
                System.arraycopy(bArr2, 0, this.h0, i5, this.k0 - i5);
            } else {
                System.arraycopy(bArr2, i4, bArr3, 0, i3);
            }
            this.i0 = 0;
            this.j0 = this.k0;
        }
        byte[] bArr4 = this.h0;
        int length4 = bArr4.length;
        int i6 = this.j0;
        int i7 = length4 - i6;
        if (i2 > i7) {
            System.arraycopy(bArr, i, bArr4, i6, i7);
            System.arraycopy(bArr, i + i7, this.h0, 0, i2 - i7);
        } else {
            System.arraycopy(bArr, i, bArr4, i6, i2);
        }
        this.j0 = (this.j0 + i2) % this.h0.length;
        this.k0 += i2;
        return i2;
    }

    @Override // ax.pb.C2800d0, java.io.InputStream
    public int read() throws IOException {
        int i;
        synchronized (this.m0) {
            while (this.k0 == 0) {
                try {
                    this.m0.wait();
                } catch (InterruptedException e) {
                    throw new IOException(e.getMessage());
                }
            }
            byte[] bArr = this.h0;
            int i2 = this.i0;
            i = bArr[i2] & 255;
            this.i0 = (i2 + 1) % bArr.length;
        }
        return i;
    }

    @Override // ax.pb.C2800d0, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // ax.pb.C2800d0, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i2 <= 0) {
            return 0;
        }
        synchronized (this.m0) {
            while (true) {
                try {
                    i3 = this.k0;
                    if (i3 != 0) {
                        break;
                    }
                    this.m0.wait();
                } catch (InterruptedException e) {
                    throw new IOException(e.getMessage());
                }
            }
            byte[] bArr2 = this.h0;
            int length = bArr2.length;
            int i4 = this.i0;
            int i5 = length - i4;
            if (i2 > i3) {
                i2 = i3;
            }
            if (i3 > i5 && i2 > i5) {
                System.arraycopy(bArr2, i4, bArr, i, i5);
                System.arraycopy(this.h0, 0, bArr, i + i5, i2 - i5);
            } else {
                System.arraycopy(bArr2, i4, bArr, i, i2);
            }
            this.k0 -= i2;
            this.i0 = (this.i0 + i2) % this.h0.length;
        }
        return i2;
    }
}
