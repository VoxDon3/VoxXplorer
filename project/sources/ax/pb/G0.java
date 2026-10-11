package ax.pb;

import java.io.IOException;

/* loaded from: classes3.dex */
class G0 extends C2802e0 {
    private String n0;
    private C2806g0 o0;
    private byte[] p0;
    private boolean q0;

    G0(C2806g0 c2806g0) throws IOException {
        super(c2806g0, false, (c2806g0.G0 & (-65281)) | 32);
        this.p0 = new byte[1];
        this.o0 = c2806g0;
        this.q0 = (c2806g0.G0 & 1536) == 1536;
        this.n0 = c2806g0.p0;
    }

    @Override // ax.pb.C2802e0, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.o0.d();
    }

    @Override // ax.pb.C2802e0, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.p0;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // ax.pb.C2802e0, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // ax.pb.C2802e0, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 0) {
            i2 = 0;
        }
        C2806g0 c2806g0 = this.o0;
        int i3 = c2806g0.G0;
        if ((i3 & 256) == 256) {
            c2806g0.Y(new D0(this.n0), new E0());
            this.o0.Y(new x0(this.n0, bArr, i, i2), new y0(this.o0));
        } else if ((i3 & 512) == 512) {
            c();
            B0 b0 = new B0(this.o0.q0, bArr, i, i2);
            if (this.q0) {
                b0.U0 = 1024;
            }
            this.o0.Y(b0, new C0(this.o0));
        }
    }
}
