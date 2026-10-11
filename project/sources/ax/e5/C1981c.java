package ax.e5;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ax.e5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1981c implements InterfaceC1979a {
    private InterfaceC1979a a;
    private int b;
    private int c;

    public C1981c(InterfaceC1979a interfaceC1979a, int i) {
        this.a = interfaceC1979a;
        this.c = interfaceC1979a.d();
        this.b = i;
    }

    @Override // ax.e5.InterfaceC1979a
    public int d() {
        return this.a.d();
    }

    @Override // ax.e5.InterfaceC1979a
    public void e() throws IOException {
        this.a.e();
    }

    @Override // ax.e5.InterfaceC1979a
    public void i(long j, ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2;
        int i = this.c;
        long j2 = (j / i) + this.b;
        if (j % i != 0) {
            ByteBuffer allocate = ByteBuffer.allocate(i);
            this.a.i(j2, allocate);
            allocate.clear();
            allocate.position((int) (j % this.c));
            allocate.limit(allocate.position() + Math.min(byteBuffer.remaining(), allocate.remaining()));
            byteBuffer.put(allocate);
            j2++;
        }
        if (byteBuffer.remaining() > 0) {
            int remaining = byteBuffer.remaining();
            int i2 = this.c;
            if (remaining % i2 != 0) {
                int remaining2 = (i2 - (byteBuffer.remaining() % this.c)) + byteBuffer.remaining();
                byteBuffer2 = ByteBuffer.allocate(remaining2);
                byteBuffer2.limit(remaining2);
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.a.i(j2, byteBuffer2);
            if (byteBuffer.remaining() % this.c != 0) {
                System.arraycopy(byteBuffer2.array(), 0, byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            }
            byteBuffer.position(byteBuffer.limit());
        }
    }

    @Override // ax.e5.InterfaceC1979a
    public void l(long j, ByteBuffer byteBuffer) throws IOException {
        int i = this.c;
        long j2 = (j / i) + this.b;
        if (j % i != 0) {
            ByteBuffer allocate = ByteBuffer.allocate(i);
            this.a.i(j2, allocate);
            allocate.clear();
            allocate.position((int) (j % this.c));
            int min = Math.min(allocate.remaining(), byteBuffer.remaining());
            allocate.put(byteBuffer.array(), byteBuffer.position(), min);
            byteBuffer.position(byteBuffer.position() + min);
            allocate.clear();
            this.a.l(j2, allocate);
            j2++;
        }
        if (byteBuffer.remaining() > 0) {
            int remaining = byteBuffer.remaining();
            int i2 = this.c;
            if (remaining % i2 != 0) {
                int remaining2 = (i2 - (byteBuffer.remaining() % this.c)) + byteBuffer.remaining();
                ByteBuffer allocate2 = ByteBuffer.allocate(remaining2);
                allocate2.limit(remaining2);
                System.arraycopy(byteBuffer.array(), byteBuffer.position(), allocate2.array(), 0, byteBuffer.remaining());
                byteBuffer.position(byteBuffer.limit());
                byteBuffer = allocate2;
            }
            this.a.l(j2, byteBuffer);
        }
    }

    public C1981c(InterfaceC1979a interfaceC1979a) {
        this(interfaceC1979a, 0);
    }
}
