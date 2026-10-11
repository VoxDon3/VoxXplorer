package ax.pa;

import ax.s7.C3057d;
import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class f {
    private final C3057d a;
    private final DataOutput b;

    public f(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Invalid OutputStream: null");
        }
        C3057d c3057d = new C3057d(outputStream);
        this.a = c3057d;
        this.b = new ax.s7.f(c3057d);
    }

    public void a(byte[] bArr) throws IOException {
        this.b.write(bArr);
    }

    public void b(int i) throws IOException {
        this.b.writeByte(i);
    }

    public void c(int i) throws IOException {
        this.b.writeInt(i);
    }

    public void d(long j) throws IOException {
        c((int) j);
    }

    public void e(int i) throws IOException {
        this.b.writeShort(i);
    }
}
