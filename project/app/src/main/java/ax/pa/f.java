/*
 * Decompiled with CFR 0.152.
 */
package ax.pa;

import ax.s7.d;
import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

public class f {
    private final d a;
    private final DataOutput b;

    public f(OutputStream outputStream) {
        if (outputStream != null) {
            outputStream = new d(outputStream);
            this.a = outputStream;
            this.b = new ax.s7.f(outputStream);
            return;
        }
        throw new IllegalArgumentException("Invalid OutputStream: null");
    }

    public void a(byte[] byArray) throws IOException {
        this.b.write(byArray);
    }

    public void b(int n8) throws IOException {
        this.b.writeByte(n8);
    }

    public void c(int n8) throws IOException {
        this.b.writeInt(n8);
    }

    public void d(long l8) throws IOException {
        this.c((int)l8);
    }

    public void e(int n8) throws IOException {
        this.b.writeShort(n8);
    }
}

