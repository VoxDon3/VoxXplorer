/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Wc.A;
import ax.Wc.O;
import ax.Wc.Z0;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

public class C
extends A {
    static final O d0 = new O(C.class, 13){

        @Override
        A d(t0 t02) {
            return C.C(t02.G(), false);
        }
    };
    private byte[] c0;
    private final String q;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private C(byte[] object, boolean bl) {
        Object object2 = object;
        StringBuffer stringBuffer = new StringBuffer();
        boolean bl2 = true;
        object = null;
        long l8 = 0L;
        for (int i8 = 0; i8 != ((Object)object2).length; ++i8) {
            block15: {
                block14: {
                    Object var9_9;
                    Object object3 = object2[i8];
                    if (l8 <= 0xFFFFFFFFFFFF80L) {
                        l8 += (long)(object3 & 0x7F);
                        if ((object3 & 0x80) == 0) {
                            if (bl2) {
                                bl2 = false;
                            } else {
                                stringBuffer.append('.');
                            }
                            stringBuffer.append(l8);
                            break block14;
                        } else {
                            l8 <<= 7;
                            continue;
                        }
                    }
                    Object object4 = object;
                    if (object == null) {
                        BigInteger bigInteger = BigInteger.valueOf(l8);
                    }
                    object = var9_9.or(BigInteger.valueOf(object3 & 0x7F));
                    if ((object3 & 0x80) != 0) break block15;
                    if (bl2) {
                        bl2 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(object);
                    object = null;
                }
                l8 = 0L;
                continue;
            }
            object = ((BigInteger)object).shiftLeft(7);
        }
        this.q = stringBuffer.toString();
        object = object2;
        if (bl) {
            object = a.d((byte[])object2);
        }
        this.c0 = (byte[])object;
    }

    static C C(byte[] byArray, boolean bl) {
        return new C(byArray, bl);
    }

    private void D(ByteArrayOutputStream byteArrayOutputStream) {
        Z0 z02 = new Z0(this.q);
        while (z02.a()) {
            String string = z02.b();
            if (string.length() <= 18) {
                C.J(byteArrayOutputStream, Long.parseLong(string));
                continue;
            }
            C.K(byteArrayOutputStream, new BigInteger(string));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private byte[] E() {
        synchronized (this) {
            try {
                if (this.c0 != null) return this.c0;
                Object object = new ByteArrayOutputStream();
                this.D((ByteArrayOutputStream)object);
                this.c0 = ((ByteArrayOutputStream)object).toByteArray();
                return this.c0;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    static boolean I(String string, int n8) {
        int n9;
        int n10 = string.length();
        int n11 = 0;
        while ((n9 = n10 - 1) >= n8) {
            block8: {
                block7: {
                    char c8;
                    block5: {
                        block6: {
                            c8 = string.charAt(n9);
                            if (c8 != '.') break block5;
                            if (n11 == 0 || n11 > 1 && string.charAt(n10) == '0') break block6;
                            n11 = 0;
                            break block7;
                        }
                        return false;
                    }
                    if ('0' > c8 || c8 > '9') break block8;
                    ++n11;
                }
                n10 = n9;
                continue;
            }
            return false;
        }
        return n11 != 0 && (n11 <= 1 || string.charAt(n10) != '0');
        {
        }
    }

    static void J(ByteArrayOutputStream byteArrayOutputStream, long l8) {
        byte[] byArray = new byte[9];
        byte by = (byte)((int)l8 & 0x7F);
        int n8 = 8;
        byArray[8] = by;
        while (l8 >= 128L) {
            byArray[--n8] = (byte)((int)(l8 >>= 7) | 0x80);
        }
        byteArrayOutputStream.write(byArray, n8, 9 - n8);
    }

    static void K(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int n8;
        int n9 = (bigInteger.bitLength() + 6) / 7;
        if (n9 == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] byArray = new byte[n9];
        for (int i8 = n8 = n9 - 1; i8 >= 0; --i8) {
            byArray[i8] = (byte)(bigInteger.intValue() | 0x80);
            bigInteger = bigInteger.shiftRight(7);
        }
        byArray[n8] = (byte)(byArray[n8] & 0x7F);
        byteArrayOutputStream.write(byArray, 0, n9);
    }

    public String G() {
        return this.q;
    }

    @Override
    public int hashCode() {
        return this.q.hashCode();
    }

    @Override
    boolean r(A a8) {
        if (this == a8) {
            return true;
        }
        if (!(a8 instanceof C)) {
            return false;
        }
        a8 = (C)a8;
        return this.q.equals(((C)a8).q);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 13, this.E());
    }

    @Override
    boolean t() {
        return false;
    }

    public String toString() {
        return this.G();
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, this.E().length);
    }
}

