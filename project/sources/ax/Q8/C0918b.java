package ax.Q8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.InterfaceC2172c;
import ax.k9.C2413a;
import java.util.Arrays;

/* renamed from: ax.Q8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0918b implements InterfaceC2172c {
    private static final byte[] f = {-4, 83, 77, 66};
    private int a;
    private int b;
    private A c;
    private int d;
    private int e;

    public static boolean d(byte[] bArr) {
        return Arrays.equals(f, bArr);
    }

    @Override // ax.h9.InterfaceC2172c
    public int a() {
        return this.a;
    }

    @Override // ax.h9.InterfaceC2172c
    public void b(ax.Z8.a<?> aVar) throws a.b {
        this.a = aVar.S();
        C2413a.b(aVar.G(4), f, "Could not find SMB2 Packet header");
        this.b = aVar.P();
        A a = (A) c.a.f(aVar.J(), A.class, null);
        this.c = a;
        C2413a.a((a == null || a == A.NONE) ? false : true, "The CompressionAlgorithm field of the SMB2_COMPRESSION_TRANSFORM_HEADER should contain a valid value.");
        aVar.U(2);
        this.d = aVar.P();
        this.e = aVar.V();
    }

    @Override // ax.h9.InterfaceC2172c
    public int c() {
        return this.e;
    }
}
