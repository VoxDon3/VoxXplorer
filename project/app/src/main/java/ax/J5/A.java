/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.os.RemoteException;
import android.util.Log;
import ax.M5.T;
import ax.M5.p;
import ax.M5.w0;
import ax.T5.a;
import ax.T5.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class A
extends w0 {
    private final int e;

    protected A(byte[] byArray) {
        boolean bl = byArray.length == 25;
        p.a(bl);
        this.e = Arrays.hashCode(byArray);
    }

    protected static byte[] B(String object) {
        try {
            object = ((String)object).getBytes("ISO-8859-1");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)unsupportedEncodingException);
        }
    }

    abstract byte[] a2();

    @Override
    public final int c() {
        return this.e;
    }

    @Override
    public final a e() {
        return b.a2(this.a2());
    }

    public final boolean equals(Object object) {
        if (object != null && object instanceof T) {
            block6: {
                block5: {
                    object = (T)object;
                    if (object.c() == this.e) break block5;
                    return false;
                }
                object = object.e();
                if (object != null) break block6;
                return false;
            }
            try {
                object = (byte[])b.B((a)object);
                boolean bl = Arrays.equals(this.a2(), (byte[])object);
                return bl;
            }
            catch (RemoteException remoteException) {
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)remoteException);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}

