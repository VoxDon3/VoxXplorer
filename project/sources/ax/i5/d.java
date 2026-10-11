package ax.i5;

import android.util.Log;
import ax.e5.InterfaceC1979a;
import ax.h5.InterfaceC2152b;
import ax.h5.InterfaceC2155e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d implements InterfaceC2152b {
    private static final String e = "d";
    private c a;
    private C2270b b;
    private j c;
    private f d;

    private d(InterfaceC1979a interfaceC1979a, ByteBuffer byteBuffer) throws IOException {
        c m = c.m(byteBuffer);
        this.a = m;
        this.c = j.d(interfaceC1979a, m.f() * this.a.b());
        C2270b c2270b = new C2270b(interfaceC1979a, this.a, this.c);
        this.b = c2270b;
        this.d = f.m(interfaceC1979a, c2270b, this.a);
        Log.d(e, this.a.toString());
    }

    public static d f(InterfaceC1979a interfaceC1979a) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(512);
        interfaceC1979a.i(0L, allocate);
        allocate.flip();
        if (((char) allocate.get(82)) == 'F' && ((char) allocate.get(83)) == 'A' && ((char) allocate.get(84)) == 'T' && ((char) allocate.get(85)) == '3' && ((char) allocate.get(86)) == '2' && ((char) allocate.get(87)) == ' ' && ((char) allocate.get(88)) == ' ' && ((char) allocate.get(89)) == ' ') {
            return new d(interfaceC1979a, allocate);
        }
        return null;
    }

    @Override // ax.h5.InterfaceC2152b
    public int a() {
        return 2;
    }

    @Override // ax.h5.InterfaceC2152b
    public long b() {
        return this.a.j() * this.a.b();
    }

    @Override // ax.h5.InterfaceC2152b
    public long c() {
        return b() - e();
    }

    @Override // ax.h5.InterfaceC2152b
    public InterfaceC2155e d() {
        return this.d;
    }

    public long e() {
        return this.c.b() * this.a.a();
    }
}
