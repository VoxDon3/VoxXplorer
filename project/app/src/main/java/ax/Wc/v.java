/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Wc.A;
import ax.Wc.C;
import ax.Wc.O;
import ax.Wc.Z0;
import ax.Wc.g;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentMap;

public class v
extends A {
    static final O d0 = new O(v.class, 6){

        @Override
        A d(t0 t02) {
            return v.D(t02.G(), false);
        }
    };
    private static final ConcurrentMap<b, v> e0 = new j.ConcurrentHashMap();
    private byte[] c0;
    private final String q;

    v(v object, String string) {
        if (C.I(string, 0)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((v)object).I());
            stringBuilder.append(".");
            stringBuilder.append(string);
            this.q = stringBuilder.toString();
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("string ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" not a valid OID branch");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public v(String string) {
        if (string != null) {
            if (v.M(string)) {
                this.q = string;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("string ");
            stringBuilder.append(string);
            stringBuilder.append(" not an OID");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new NullPointerException("'identifier' cannot be null");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    v(byte[] object, boolean bl) {
        Object var1_11;
        Object var2_12;
        Object object2 = object;
        StringBuffer stringBuffer = new StringBuffer();
        byte by = 1;
        Object var1_2 = null;
        long l8 = 0L;
        for (int i8 = 0; i8 != ((byte[])object2).length; ++i8) {
            BigInteger bigInteger;
            block17: {
                byte by2;
                block16: {
                    Object var1_6;
                    Object var1_3;
                    by2 = object2[i8];
                    if (l8 <= 0xFFFFFFFFFFFF80L) {
                        l8 += (long)(by2 & 0x7F);
                        if ((by2 & 0x80) == 0) {
                            by2 = by;
                            long l9 = l8;
                            if (by != 0) {
                                if (l8 < 40L) {
                                    stringBuffer.append('0');
                                } else if (l8 < 80L) {
                                    stringBuffer.append('1');
                                    l8 -= 40L;
                                } else {
                                    stringBuffer.append('2');
                                    l8 -= 80L;
                                }
                                by2 = 0;
                                l9 = l8;
                            }
                            stringBuffer.append('.');
                            stringBuffer.append(l9);
                            break block16;
                        } else {
                            l8 <<= 7;
                            continue;
                        }
                    }
                    bigInteger = var1_3;
                    if (var1_3 == null) {
                        bigInteger = BigInteger.valueOf(l8);
                    }
                    bigInteger = bigInteger.or(BigInteger.valueOf(by2 & 0x7F));
                    if ((by2 & 0x80) != 0) break block17;
                    by2 = by;
                    BigInteger bigInteger2 = bigInteger;
                    if (by != 0) {
                        stringBuffer.append('2');
                        BigInteger bigInteger3 = bigInteger.subtract(BigInteger.valueOf(80L));
                        by2 = 0;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(var1_6);
                    Object var1_7 = null;
                }
                l8 = 0L;
                by = by2;
                continue;
            }
            BigInteger bigInteger4 = bigInteger.shiftLeft(7);
        }
        this.q = stringBuffer.toString();
        Object object3 = object2;
        if (var2_12 != false) {
            byte[] byArray = a.d(object2);
        }
        this.c0 = var1_11;
    }

    static v D(byte[] byArray, boolean bl) {
        Object object = new b(byArray);
        v v8 = (v)e0.get(object);
        object = v8;
        if (v8 == null) {
            object = new v(byArray, bl);
        }
        return object;
    }

    private void E(ByteArrayOutputStream byteArrayOutputStream) {
        Z0 z02 = new Z0(this.q);
        int n8 = Integer.parseInt(z02.b()) * 40;
        String string = z02.b();
        if (string.length() <= 18) {
            C.J(byteArrayOutputStream, (long)n8 + Long.parseLong(string));
        } else {
            C.K(byteArrayOutputStream, new BigInteger(string).add(BigInteger.valueOf(n8)));
        }
        while (z02.a()) {
            string = z02.b();
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
    private byte[] G() {
        synchronized (this) {
            try {
                if (this.c0 != null) return this.c0;
                Object object = new ByteArrayOutputStream();
                this.E((ByteArrayOutputStream)object);
                this.c0 = ((ByteArrayOutputStream)object).toByteArray();
                return this.c0;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static v J(Object object) {
        if (object != null && !(object instanceof v)) {
            Object object2;
            if (object instanceof g) {
                object2 = ((g)object).g();
                if (object2 instanceof v) {
                    return (v)object2;
                }
            } else if (object instanceof byte[]) {
                try {
                    object = (v)d0.b((byte[])object);
                    return object;
                }
                catch (IOException iOException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("failed to construct object identifier from byte[]: ");
                    stringBuilder.append(iOException.getMessage());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("illegal object in getInstance: ");
            ((StringBuilder)object2).append(object.getClass().getName());
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        return (v)object;
    }

    private static boolean M(String string) {
        char c8;
        if (string.length() >= 3 && string.charAt(1) == '.' && (c8 = string.charAt(0)) >= '0' && c8 <= '2') {
            return C.I(string, 2);
        }
        return false;
    }

    public v C(String string) {
        return new v(this, string);
    }

    public String I() {
        return this.q;
    }

    public v K() {
        ConcurrentMap<b, v> concurrentMap = e0;
        b b8 = new b(this.G());
        v v8 = (v)concurrentMap.get(b8);
        if (v8 == null) {
            v8 = concurrentMap.putIfAbsent(b8, this);
            if (v8 == null) {
                return this;
            }
            return v8;
        }
        return v8;
    }

    @Override
    public int hashCode() {
        return this.q.hashCode();
    }

    @Override
    boolean r(A a8) {
        if (a8 == this) {
            return true;
        }
        if (!(a8 instanceof v)) {
            return false;
        }
        return this.q.equals(((v)a8).q);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 6, this.G());
    }

    @Override
    boolean t() {
        return false;
    }

    public String toString() {
        return this.I();
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, this.G().length);
    }

    private static class b {
        private final int a;
        private final byte[] b;

        b(byte[] byArray) {
            this.a = ax.Nd.a.l(byArray);
            this.b = byArray;
        }

        public boolean equals(Object object) {
            if (object instanceof b) {
                return ax.Nd.a.b(this.b, ((b)object).b);
            }
            return false;
        }

        public int hashCode() {
            return this.a;
        }
    }
}

