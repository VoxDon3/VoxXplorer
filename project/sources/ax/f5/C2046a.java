package ax.f5;

import android.util.Log;
import ax.e5.InterfaceC1979a;
import ax.g5.AbstractC2121a;
import ax.g5.C2122b;
import ax.g5.C2123c;
import ax.g5.C2124d;
import ax.g5.C2125e;
import ax.g5.f;
import ax.g5.g;
import ax.g5.h;
import ax.g5.i;
import ax.m5.InterfaceC2518b;
import com.github.mjdev.libaums.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: ax.f5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2046a implements InterfaceC1979a {
    private static final String i = "a";
    private InterfaceC2518b a;
    private int d;
    private int e;
    private i f = new i();
    private C2125e g = new C2125e();
    private C2122b h = new C2122b();
    private ByteBuffer b = ByteBuffer.allocate(31);
    private ByteBuffer c = ByteBuffer.allocate(13);

    public C2046a(InterfaceC2518b interfaceC2518b) {
        this.a = interfaceC2518b;
    }

    private boolean a(AbstractC2121a abstractC2121a, ByteBuffer byteBuffer) throws IOException {
        byte[] array = this.b.array();
        Arrays.fill(array, (byte) 0);
        this.b.clear();
        abstractC2121a.d(this.b);
        this.b.clear();
        if (this.a.b(this.b) != array.length) {
            throw new IOException("Writing all bytes on command " + abstractC2121a + " failed!");
        }
        int b = abstractC2121a.b();
        if (b > 0) {
            if (abstractC2121a.a() == AbstractC2121a.EnumC0314a.IN) {
                int i2 = 0;
                do {
                    i2 += this.a.a(byteBuffer);
                } while (i2 < b);
                if (i2 != b) {
                    throw new IOException("Unexpected command size (" + i2 + ") on response to " + abstractC2121a);
                }
            } else {
                int i3 = 0;
                do {
                    i3 += this.a.b(byteBuffer);
                } while (i3 < b);
                if (i3 != b) {
                    throw new IOException("Could not write all bytes: " + abstractC2121a);
                }
            }
        }
        this.c.clear();
        if (this.a.a(this.c) != 13) {
            throw new IOException("Unexpected command size while expecting csw");
        }
        this.c.clear();
        this.h.c(this.c);
        if (this.h.a() == 0) {
            if (this.h.b() == abstractC2121a.c()) {
                return this.h.a() == 0;
            }
            throw new IOException("wrong csw tag!");
        }
        throw new IOException("Unsuccessful Csw status: " + ((int) this.h.a()));
    }

    @Override // ax.e5.InterfaceC1979a
    public int d() {
        return this.d;
    }

    @Override // ax.e5.InterfaceC1979a
    public void e() throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(36);
        a(new C2123c((byte) allocate.array().length), allocate);
        allocate.clear();
        C2124d c = C2124d.c(allocate);
        String str = i;
        Log.d(str, "inquiry response: " + c);
        if (c.b() != 0 || c.a() != 0) {
            throw new IOException("unsupported PeripheralQualifier or PeripheralDeviceType");
        }
        if (!a(new h(), null)) {
            Log.w(str, "unit not ready!");
        }
        f fVar = new f();
        allocate.clear();
        a(fVar, allocate);
        allocate.clear();
        g c2 = g.c(allocate);
        this.d = c2.a();
        this.e = c2.b();
        Log.i(str, "Block size: " + this.d);
        Log.i(str, "Last block address: " + this.e);
        if (this.d == 0) {
            throw new b("Block size is zero");
        }
    }

    @Override // ax.e5.InterfaceC1979a
    public synchronized void i(long j, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() % this.d != 0) {
            throw new IllegalArgumentException("dest.remaining() must be multiple of blockSize!");
        }
        this.g.e((int) j, byteBuffer.remaining(), this.d);
        a(this.g, byteBuffer);
        byteBuffer.position(byteBuffer.limit());
    }

    @Override // ax.e5.InterfaceC1979a
    public synchronized void l(long j, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() % this.d != 0) {
            throw new IllegalArgumentException("src.remaining() must be multiple of blockSize!");
        }
        this.f.e((int) j, byteBuffer.remaining(), this.d);
        a(this.f, byteBuffer);
        byteBuffer.position(byteBuffer.limit());
    }
}
