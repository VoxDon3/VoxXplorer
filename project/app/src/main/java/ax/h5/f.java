/*
 * Decompiled with CFR 0.152.
 */
package ax.h5;

import android.util.Log;
import ax.h5.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class f
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private static final String d0 = "f";
    private long c0 = 0L;
    private e q;

    public f(e e8) {
        if (!e8.isDirectory()) {
            this.q = e8;
            return;
        }
        throw new UnsupportedOperationException("UsbFileInputStream cannot be created on directory!");
    }

    @Override
    public int available() throws IOException {
        Log.d((String)d0, (String)"available");
        return 0;
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public int read() throws IOException {
        if (this.c0 >= this.q.getLength()) {
            return -1;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        byteBuffer.limit(1);
        this.q.i(this.c0, byteBuffer);
        ++this.c0;
        byteBuffer.flip();
        return byteBuffer.get();
    }

    @Override
    public int read(byte[] object) throws IOException {
        if (this.c0 >= this.q.getLength()) {
            return -1;
        }
        long l8 = this.q.getLength();
        l8 = Math.min((long)((byte[])object).length, l8 - this.c0);
        object = ByteBuffer.wrap((byte[])object);
        int n8 = (int)l8;
        ((ByteBuffer)object).limit(n8);
        this.q.i(this.c0, (ByteBuffer)object);
        this.c0 += l8;
        return n8;
    }

    @Override
    public int read(byte[] object, int n8, int n9) throws IOException {
        if (this.c0 >= this.q.getLength()) {
            return -1;
        }
        long l8 = this.q.getLength();
        l8 = Math.min((long)n9, l8 - this.c0);
        object = ByteBuffer.wrap((byte[])object);
        ((ByteBuffer)object).position(n8);
        n9 = (int)l8;
        ((ByteBuffer)object).limit(n8 + n9);
        this.q.i(this.c0, (ByteBuffer)object);
        this.c0 += l8;
        return n9;
    }

    @Override
    public long skip(long l8) throws IOException {
        l8 = Math.min(l8, this.q.getLength() - this.c0);
        this.c0 += l8;
        return l8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

