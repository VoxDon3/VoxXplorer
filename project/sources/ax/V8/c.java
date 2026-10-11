package ax.V8;

import ax.Z8.a;
import ax.d9.g;
import java.util.Random;

/* loaded from: classes3.dex */
public class c {
    private Random a;
    private g b;

    public c(Random random, g gVar) {
        this.a = random;
        this.b = gVar;
    }

    public byte[] a(String str, String str2, String str3) {
        return b(str, str2, str3);
    }

    public byte[] b(String str, String str2, String str3) {
        return b.a(this.b, b.b(this.b, b.h(str)), b.h(str2.toUpperCase()), b.h(str3));
    }

    public a c(String str, String str2, char[] cArr, ax.W8.b bVar, long j, ax.W8.g gVar) {
        byte[] bArr = new byte[8];
        this.a.nextBytes(bArr);
        byte[] b = b(String.valueOf(cArr), str, str2);
        byte[] d = d(a(String.valueOf(cArr), str, str2), bVar.c(), bArr);
        byte[] e = e(b, bVar.c(), bArr, j, gVar);
        return new a(e, d, f(b, ax.Nd.a.f(e, 0, 16)));
    }

    public byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        a.c cVar = new a.c(ax.Z8.b.b);
        cVar.o(b.a(this.b, bArr, bArr2, bArr3));
        cVar.o(bArr3);
        return cVar.f();
    }

    public byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, long j, ax.W8.g gVar) {
        byte[] i = i(bArr3, j, gVar);
        byte[] h = h(bArr, bArr2, i);
        byte[] bArr4 = new byte[h.length + i.length];
        System.arraycopy(h, 0, bArr4, 0, h.length);
        System.arraycopy(i, 0, bArr4, h.length, i.length);
        return bArr4;
    }

    public byte[] f(byte[] bArr, byte[] bArr2) {
        return b.a(this.b, bArr, bArr2);
    }

    byte[] h(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return b.a(this.b, bArr, bArr2, bArr3);
    }

    byte[] i(byte[] bArr, long j, ax.W8.g gVar) {
        a.c cVar = new a.c(ax.Z8.b.b);
        cVar.j((byte) 1);
        cVar.j((byte) 1);
        cVar.s(0);
        cVar.u(0L);
        cVar.k(j);
        cVar.o(bArr);
        cVar.u(0L);
        if (gVar != null) {
            gVar.f(cVar);
        }
        cVar.u(0L);
        return cVar.f();
    }

    public byte[] g(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return bArr;
    }
}
