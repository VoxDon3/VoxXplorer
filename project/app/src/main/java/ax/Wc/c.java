/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.G;
import ax.Wc.H0;
import ax.Wc.J;
import ax.Wc.O;
import ax.Wc.d;
import ax.Wc.g;
import ax.Wc.k0;
import ax.Wc.t0;
import ax.Wc.w;
import ax.Wc.z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class c
extends A
implements G,
d {
    static final O c0 = new O(c.class, 3){

        @Override
        A c(D d8) {
            return d8.K();
        }

        @Override
        A d(t0 t02) {
            return c.C(t02.G());
        }
    };
    private static final char[] d0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] q;

    c(byte[] byArray, int n8) {
        if (byArray != null) {
            if (byArray.length == 0 && n8 != 0) {
                throw new IllegalArgumentException("zero length data with non-zero pad bits");
            }
            if (n8 <= 7 && n8 >= 0) {
                this.q = a.p(byArray, (byte)n8);
                return;
            }
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        throw new NullPointerException("'data' cannot be null");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    c(byte[] byArray, boolean bl) {
        if (bl) {
            if (byArray == null) throw new NullPointerException("'contents' cannot be null");
            if (byArray.length < 1) throw new IllegalArgumentException("'contents' cannot be empty");
            int n8 = byArray[0] & 0xFF;
            if (n8 > 0) {
                if (byArray.length < 2) throw new IllegalArgumentException("zero length data with non-zero pad bits");
                if (n8 > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.q = byArray;
    }

    static c C(byte[] byArray) {
        int n8 = byArray.length;
        if (n8 >= 1) {
            int n9 = byArray[0] & 0xFF;
            if (n9 > 0) {
                if (n9 <= 7 && n8 >= 2) {
                    if ((n8 = byArray[n8 - 1]) != (byte)(255 << n9 & n8)) {
                        return new H0(byArray, false);
                    }
                } else {
                    throw new IllegalArgumentException("invalid pad bits detected");
                }
            }
            return new k0(byArray, false);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    protected static byte[] E(int n8) {
        int n9;
        int n10 = 0;
        if (n8 == 0) {
            return new byte[0];
        }
        int n11 = 4;
        for (n9 = 3; n9 >= 1 && (255 << n9 * 8 & n8) == 0; --n9) {
            --n11;
        }
        byte[] byArray = new byte[n11];
        for (n9 = n10; n9 < n11; ++n9) {
            byArray[n9] = (byte)(n8 >> n9 * 8 & 0xFF);
        }
        return byArray;
    }

    public static c G(J j8, boolean bl) {
        return (c)c0.e(j8, bl);
    }

    public static c I(Object object) {
        if (object != null && !(object instanceof c)) {
            Object object2;
            if (object instanceof g) {
                object2 = ((g)object).g();
                if (object2 instanceof c) {
                    return (c)object2;
                }
            } else if (object instanceof byte[]) {
                try {
                    object = (c)c0.b((byte[])object);
                    return object;
                }
                catch (IOException iOException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("failed to construct BIT STRING from byte[]: ");
                    stringBuilder.append(iOException.getMessage());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("illegal object in getInstance: ");
            ((StringBuilder)object2).append(object.getClass().getName());
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        return (c)object;
    }

    protected static int J(int n8) {
        int n9;
        block5: {
            for (n9 = 3; n9 >= 0; --n9) {
                if (n9 != 0) {
                    int n10 = n8 >> n9 * 8;
                    if (n10 == 0) continue;
                    n8 = n10 & 0xFF;
                } else {
                    if (n8 == 0) continue;
                    n8 &= 0xFF;
                }
                break block5;
            }
            n8 = 0;
        }
        if (n8 == 0) {
            return 0;
        }
        n9 = 1;
        while (((n8 <<= 1) & 0xFF) != 0) {
            ++n9;
        }
        return 8 - n9;
    }

    @Override
    A A() {
        return new k0(this.q, false);
    }

    @Override
    A B() {
        return new H0(this.q, false);
    }

    public byte[] D() {
        byte[] byArray = this.q;
        if (byArray.length == 1) {
            return w.d0;
        }
        byte by = byArray[0];
        byArray = a.f(byArray, 1, byArray.length);
        int n8 = byArray.length - 1;
        byte by2 = byArray[n8];
        byArray[n8] = (byte)((byte)(255 << (by & 0xFF)) & by2);
        return byArray;
    }

    @Override
    public String h() {
        StringBuffer stringBuffer;
        byte[] byArray;
        try {
            byArray = this.p();
            stringBuffer = new StringBuffer(byArray.length * 2 + 1);
            stringBuffer.append('#');
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Internal error encoding BitString: ");
            stringBuilder.append(iOException.getMessage());
            throw new z(stringBuilder.toString(), iOException);
        }
        for (int i8 = 0; i8 != byArray.length; ++i8) {
            byte by = byArray[i8];
            char[] cArray = d0;
            stringBuffer.append(cArray[by >>> 4 & 0xF]);
            stringBuffer.append(cArray[by & 0xF]);
        }
        return stringBuffer.toString();
    }

    @Override
    public int hashCode() {
        byte[] byArray = this.q;
        if (byArray.length < 2) {
            return 1;
        }
        byte by = byArray[0];
        int n8 = byArray.length - 1;
        by = (byte)(255 << (by & 0xFF) & byArray[n8]);
        return a.m(byArray, 0, n8) * 257 ^ by;
    }

    @Override
    public InputStream i() throws IOException {
        byte[] byArray = this.q;
        return new ByteArrayInputStream(byArray, 1, byArray.length - 1);
    }

    @Override
    public int k() {
        return this.q[0] & 0xFF;
    }

    @Override
    public A l() {
        return this.g();
    }

    @Override
    boolean r(A object) {
        if (!(object instanceof c)) {
            return false;
        }
        Object object2 = (c)object;
        object2 = ((c)object2).q;
        object = this.q;
        Object object3 = ((Object)object).length;
        if (((Object)object2).length != object3) {
            return false;
        }
        if (object3 == 1) {
            return true;
        }
        int n8 = object3 - 1;
        for (object3 = 0; object3 < n8; ++object3) {
            if (object[object3] == object2[object3]) continue;
            return false;
        }
        Object object4 = object[0];
        object3 = object[n8];
        return (byte)(object3 & (object4 = (Object)(255 << (object4 & 0xFF)))) == (byte)(object2[n8] & object4);
    }

    public String toString() {
        return this.h();
    }
}

