package ax.Wc;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentMap;

/* renamed from: ax.Wc.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1130v extends A {
    static final O d0 = new a(C1130v.class, 6);
    private static final ConcurrentMap<b, C1130v> e0 = new ConcurrentHashMap();
    private byte[] c0;
    private final String q;

    /* renamed from: ax.Wc.v$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return C1130v.D(c1127t0.G(), false);
        }
    }

    /* renamed from: ax.Wc.v$b */
    private static class b {
        private final int a;
        private final byte[] b;

        b(byte[] bArr) {
            this.a = ax.Nd.a.l(bArr);
            this.b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return ax.Nd.a.b(this.b, ((b) obj).b);
            }
            return false;
        }

        public int hashCode() {
            return this.a;
        }
    }

    C1130v(C1130v c1130v, String str) {
        if (!C.I(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.q = c1130v.I() + "." + str;
    }

    static C1130v D(byte[] bArr, boolean z) {
        C1130v c1130v = e0.get(new b(bArr));
        return c1130v == null ? new C1130v(bArr, z) : c1130v;
    }

    private void E(ByteArrayOutputStream byteArrayOutputStream) {
        Z0 z0 = new Z0(this.q);
        int parseInt = Integer.parseInt(z0.b()) * 40;
        String b2 = z0.b();
        if (b2.length() <= 18) {
            C.J(byteArrayOutputStream, parseInt + Long.parseLong(b2));
        } else {
            C.K(byteArrayOutputStream, new BigInteger(b2).add(BigInteger.valueOf(parseInt)));
        }
        while (z0.a()) {
            String b3 = z0.b();
            if (b3.length() <= 18) {
                C.J(byteArrayOutputStream, Long.parseLong(b3));
            } else {
                C.K(byteArrayOutputStream, new BigInteger(b3));
            }
        }
    }

    private synchronized byte[] G() {
        try {
            if (this.c0 == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                E(byteArrayOutputStream);
                this.c0 = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c0;
    }

    public static C1130v J(Object obj) {
        if (obj == null || (obj instanceof C1130v)) {
            return (C1130v) obj;
        }
        if (obj instanceof InterfaceC1101g) {
            A g = ((InterfaceC1101g) obj).g();
            if (g instanceof C1130v) {
                return (C1130v) g;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (C1130v) d0.b((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    private static boolean M(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return C.I(str, 2);
    }

    public C1130v C(String str) {
        return new C1130v(this, str);
    }

    public String I() {
        return this.q;
    }

    public C1130v K() {
        b bVar = new b(G());
        ConcurrentMap<b, C1130v> concurrentMap = e0;
        C1130v c1130v = concurrentMap.get(bVar);
        if (c1130v != null) {
            return c1130v;
        }
        C1130v putIfAbsent = concurrentMap.putIfAbsent(bVar, this);
        return putIfAbsent == null ? this : putIfAbsent;
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return this.q.hashCode();
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        if (a2 == this) {
            return true;
        }
        if (a2 instanceof C1130v) {
            return this.q.equals(((C1130v) a2).q);
        }
        return false;
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.o(z, 6, G());
    }

    @Override // ax.Wc.A
    boolean t() {
        return false;
    }

    public String toString() {
        return I();
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, G().length);
    }

    public C1130v(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (M(str)) {
            this.q = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    C1130v(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr2.length; i++) {
            byte b2 = bArr2[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b2 & Byte.MAX_VALUE);
                if ((b2 & 128) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(b2 & Byte.MAX_VALUE));
                if ((b2 & 128) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.q = stringBuffer.toString();
        this.c0 = z ? ax.Nd.a.d(bArr2) : bArr2;
    }
}
