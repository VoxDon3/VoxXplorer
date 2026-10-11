package ax.Od;

import ax.Nd.j;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class c {
    private static final d a = new d();

    public static byte[] a(String str, int i, int i2) {
        try {
            return a.a(str, i, i2);
        } catch (Exception e) {
            throw new a("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.b(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new b("exception encoding Hex string: " + e.getMessage(), e);
        }
    }

    public static String d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static String e(byte[] bArr, int i, int i2) {
        return j.b(c(bArr, i, i2));
    }
}
