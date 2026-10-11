/*
 * Decompiled with CFR 0.152.
 */
package ax.n4;

import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.f;
import ax.xc.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class i
implements f,
AutoCloseable {
    private boolean c0;
    private byte[] d0;
    e e0;
    private final MessageDigest q;

    public i(MessageDigest messageDigest) {
        this.q = messageDigest;
        messageDigest.reset();
        this.e0 = new e();
    }

    @Override
    public f G() throws IOException {
        return this;
    }

    @Override
    public f I0(h h8) throws IOException {
        this.q.update(h8.J());
        return this;
    }

    @Override
    public long M(C c8) throws IOException {
        return 0L;
    }

    @Override
    public f Q0(long l8) throws IOException {
        return null;
    }

    @Override
    public f R() throws IOException {
        return null;
    }

    public byte[] a() {
        return this.d0;
    }

    @Override
    public void close() throws IOException {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        this.d0 = this.q.digest();
        this.e0.close();
    }

    @Override
    public f f0(String string) throws IOException {
        return null;
    }

    @Override
    public void flush() throws IOException {
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public e k() {
        return this.e0;
    }

    @Override
    public f l0(long l8) throws IOException {
        return null;
    }

    @Override
    public D timeout() {
        return null;
    }

    @Override
    public int write(ByteBuffer byteBuffer) throws IOException {
        return 0;
    }

    @Override
    public f write(byte[] byArray) throws IOException {
        this.q.update(byArray);
        return this;
    }

    @Override
    public f write(byte[] byArray, int n8, int n9) throws IOException {
        this.q.update(byArray, n8, n9);
        return this;
    }

    @Override
    public void write(e e8, long l8) throws IOException {
    }

    @Override
    public f writeByte(int n8) throws IOException {
        return null;
    }

    @Override
    public f writeInt(int n8) throws IOException {
        return null;
    }

    @Override
    public f writeShort(int n8) throws IOException {
        return null;
    }
}

