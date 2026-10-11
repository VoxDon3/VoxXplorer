package ax.i5;

import android.util.Log;
import ax.e5.InterfaceC1979a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class j {
    static int d = -1;
    private static int e = 0;
    private static int f = 484;
    private static int g = 508;
    private static int h = 488;
    private static int i = 492;
    private static int j = 1096897106;
    private static int k = 1631679090;
    private static int l = -1437270016;
    private static final String m = "j";
    private int a;
    private InterfaceC1979a b;
    private ByteBuffer c;

    private j(InterfaceC1979a interfaceC1979a, int i2) throws IOException {
        this.b = interfaceC1979a;
        this.a = i2;
        ByteBuffer allocate = ByteBuffer.allocate(512);
        this.c = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        interfaceC1979a.i(i2, this.c);
        this.c.clear();
        if (this.c.getInt(e) != j || this.c.getInt(f) != k || this.c.getInt(g) != l) {
            throw new com.github.mjdev.libaums.b("invalid fs info structure!");
        }
    }

    static j d(InterfaceC1979a interfaceC1979a, int i2) throws IOException {
        return new j(interfaceC1979a, i2);
    }

    void a(long j2) {
        long b = b();
        if (b != d) {
            e(b - j2);
        }
    }

    long b() {
        return this.c.getInt(h);
    }

    long c() {
        return this.c.getInt(i);
    }

    void e(long j2) {
        this.c.putInt(h, (int) j2);
    }

    void f(long j2) {
        this.c.putInt(i, (int) j2);
    }

    void g() throws IOException {
        Log.d(m, "writing to device");
        this.b.l(this.a, this.c);
        this.c.clear();
    }
}
