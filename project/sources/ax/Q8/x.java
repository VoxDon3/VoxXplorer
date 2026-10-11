package ax.Q8;

import ax.Z8.a;
import ax.h9.C2171b;
import ax.h9.InterfaceC2172c;
import ax.k9.C2413a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class x implements InterfaceC2172c {
    public static final byte[] h = {-3, 83, 77, 66};
    private int a;
    private byte[] b;
    private byte[] c;
    private int d;
    private int e;
    private long f;
    private int g;

    public x(byte[] bArr, int i, long j) {
        this.b = new byte[16];
        this.c = bArr;
        this.d = i;
        this.f = j;
    }

    public static boolean i(byte[] bArr) {
        return Arrays.equals(h, bArr);
    }

    @Override // ax.h9.InterfaceC2172c
    public int a() {
        return this.a;
    }

    @Override // ax.h9.InterfaceC2172c
    public void b(ax.Z8.a<?> aVar) throws a.b {
        this.a = aVar.S();
        C2413a.b(aVar.G(4), h, "Could not find SMB2 Packet header");
        this.b = aVar.G(16);
        this.c = aVar.G(16);
        this.d = aVar.P();
        aVar.U(2);
        this.e = aVar.J();
        this.f = aVar.A();
        this.g = aVar.V();
    }

    @Override // ax.h9.InterfaceC2172c
    public int c() {
        return this.g;
    }

    public int d() {
        return this.e;
    }

    public byte[] e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public long g() {
        return this.f;
    }

    public byte[] h() {
        return this.b;
    }

    public void j(byte[] bArr) {
        this.b = bArr;
    }

    public void k(C2171b c2171b) {
        this.a = c2171b.S();
        c2171b.o(h);
        c2171b.o(this.b);
        c2171b.o(this.c);
        c2171b.W(16 - this.c.length);
        c2171b.u(this.d);
        c2171b.X();
        c2171b.s(1);
        c2171b.k(this.f);
    }

    public x() {
    }
}
