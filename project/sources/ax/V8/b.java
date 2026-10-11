package ax.V8;

import ax.d9.InterfaceC1951b;
import ax.d9.d;
import ax.d9.e;
import ax.d9.f;
import ax.d9.g;
import java.nio.charset.Charset;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class b {
    public static final Charset a = ax.Y8.b.c;

    public static byte[] a(g gVar, byte[] bArr, byte[]... bArr2) {
        try {
            d c = gVar.c("HMACT64");
            c.a(bArr);
            for (byte[] bArr3 : bArr2) {
                c.f(bArr3);
            }
            return c.g();
        } catch (f e) {
            throw new ax.T8.b(e);
        }
    }

    static byte[] b(g gVar, byte[] bArr) {
        try {
            e b = gVar.b("MD4");
            b.f(bArr);
            return b.c();
        } catch (f e) {
            throw new ax.T8.b(e);
        }
    }

    public static byte[] c(g gVar, byte[]... bArr) {
        try {
            e b = gVar.b("MD5");
            for (byte[] bArr2 : bArr) {
                b.f(bArr2);
            }
            return b.c();
        } catch (f e) {
            throw new ax.T8.b(e);
        }
    }

    public static String d(byte[] bArr) {
        return bArr != null ? new String(bArr, Charset.forName("Cp850")) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static byte[] e(String str) {
        return str != null ? str.getBytes(Charset.forName("Cp850")) : new byte[0];
    }

    public static byte[] f(g gVar, byte[] bArr, byte[] bArr2) throws ax.T8.b {
        byte[] bArr3 = new byte[bArr2.length];
        try {
            InterfaceC1951b a2 = gVar.a("RC4");
            a2.b(InterfaceC1951b.a.ENCRYPT, bArr);
            a2.c(bArr3, a2.a(bArr2, 0, bArr2.length, bArr3, 0));
            return bArr3;
        } catch (f e) {
            throw new ax.T8.b(e);
        }
    }

    public static String g(byte[] bArr) {
        return bArr != null ? new String(bArr, a) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static byte[] h(String str) {
        return str == null ? new byte[0] : str.getBytes(a);
    }
}
