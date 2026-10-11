package ax.h5;

import android.util.Log;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: ax.h5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2156f extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private static final String d0 = "f";
    private long c0 = 0;
    private InterfaceC2155e q;

    public C2156f(InterfaceC2155e interfaceC2155e) {
        if (interfaceC2155e.isDirectory()) {
            throw new UnsupportedOperationException("UsbFileInputStream cannot be created on directory!");
        }
        this.q = interfaceC2155e;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        Log.d(d0, "available");
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.c0 >= this.q.getLength()) {
            return -1;
        }
        ByteBuffer allocate = ByteBuffer.allocate(512);
        allocate.limit(1);
        this.q.i(this.c0, allocate);
        this.c0++;
        allocate.flip();
        return allocate.get();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long min = Math.min(j, this.q.getLength() - this.c0);
        this.c0 += min;
        return min;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (this.c0 >= this.q.getLength()) {
            return -1;
        }
        long min = Math.min(bArr.length, this.q.getLength() - this.c0);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = (int) min;
        wrap.limit(i);
        this.q.i(this.c0, wrap);
        this.c0 += min;
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.c0 >= this.q.getLength()) {
            return -1;
        }
        long min = Math.min(i2, this.q.getLength() - this.c0);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.position(i);
        int i3 = (int) min;
        wrap.limit(i + i3);
        this.q.i(this.c0, wrap);
        this.c0 += min;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
