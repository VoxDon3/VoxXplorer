package ax.J5;

import android.os.RemoteException;
import android.util.Log;
import ax.M5.C0821p;
import ax.M5.T;
import ax.M5.w0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes3.dex */
abstract class A extends w0 {
    private final int e;

    protected A(byte[] bArr) {
        C0821p.a(bArr.length == 25);
        this.e = Arrays.hashCode(bArr);
    }

    protected static byte[] B(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    abstract byte[] a2();

    @Override // ax.M5.T
    public final int c() {
        return this.e;
    }

    @Override // ax.M5.T
    public final ax.T5.a e() {
        return ax.T5.b.a2(a2());
    }

    public final boolean equals(Object obj) {
        ax.T5.a e;
        if (obj != null && (obj instanceof T)) {
            try {
                T t = (T) obj;
                if (t.c() == this.e && (e = t.e()) != null) {
                    return Arrays.equals(a2(), (byte[]) ax.T5.b.B(e));
                }
                return false;
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}
