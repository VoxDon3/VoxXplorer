package ax.W8;

import ax.Z8.a;

/* loaded from: classes3.dex */
class h {
    public static byte[] a = new byte[0];

    static byte[] a(String str) {
        return str != null ? ax.V8.b.h(str) : a;
    }

    static byte[] b(byte[] bArr) {
        return bArr != null ? bArr : a;
    }

    static int c(a.c cVar, byte[] bArr, int i) {
        if (bArr == null) {
            bArr = a;
        }
        cVar.s(bArr.length);
        cVar.s(bArr.length);
        cVar.u(i);
        return i + bArr.length;
    }
}
