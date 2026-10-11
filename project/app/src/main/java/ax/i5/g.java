/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import ax.h5.d;
import ax.i5.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Calendar;

class g {
    private ByteBuffer a;
    private k b;

    private g() {
    }

    private g(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        this.b = k.c(byteBuffer);
        byteBuffer.clear();
    }

    static g D(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[32];
        if (byteBuffer.get(byteBuffer.position()) == 0) {
            return null;
        }
        byteBuffer.get(byArray);
        return new g(ByteBuffer.wrap(byArray));
    }

    private void I(int n8) {
        int n9 = this.j();
        this.a.put(11, (byte)(n8 | n9));
    }

    private void N(int n8, int n9) {
        this.a.put(n8, (byte)(n9 & 0xFF));
        this.a.put(n8 + 1, (byte)(n9 >>> 8 & 0xFF));
    }

    private void O(int n8, long l8) {
        this.a.put(n8, (byte)(l8 & 0xFFL));
        this.a.put(n8 + 1, (byte)(l8 >>> 8 & 0xFFL));
        this.a.put(n8 + 2, (byte)(l8 >>> 16 & 0xFFL));
        this.a.put(n8 + 3, (byte)(l8 >>> 24 & 0xFFL));
    }

    static g a(String object, int n8, byte by, int n9, boolean bl) {
        g g8 = new g();
        Object object2 = object;
        int n10 = n8;
        if (bl) {
            int n11 = ((String)object).length() - n8;
            object2 = object;
            n10 = n8;
            if (n11 < 13) {
                object2 = new StringBuilder(13);
                ((StringBuilder)object2).append((CharSequence)object, n8, ((String)object).length());
                ((StringBuilder)object2).append('\u0000');
                for (n8 = 0; n8 < 13 - n11; ++n8) {
                    ((StringBuilder)object2).append('\uffff');
                }
                object2 = ((StringBuilder)object2).toString();
                n10 = 0;
            }
        }
        object = ByteBuffer.allocate(32);
        ((ByteBuffer)object).order(ByteOrder.LITTLE_ENDIAN);
        n8 = n9;
        if (bl) {
            n8 = n9 + 64;
        }
        ((ByteBuffer)object).put(0, (byte)n8);
        ((ByteBuffer)object).putShort(1, (short)((String)object2).charAt(n10));
        ((ByteBuffer)object).putShort(3, (short)((String)object2).charAt(n10 + 1));
        ((ByteBuffer)object).putShort(5, (short)((String)object2).charAt(n10 + 2));
        ((ByteBuffer)object).putShort(7, (short)((String)object2).charAt(n10 + 3));
        ((ByteBuffer)object).putShort(9, (short)((String)object2).charAt(n10 + 4));
        ((ByteBuffer)object).put(11, (byte)15);
        ((ByteBuffer)object).put(12, (byte)0);
        ((ByteBuffer)object).put(13, by);
        ((ByteBuffer)object).putShort(14, (short)((String)object2).charAt(n10 + 5));
        ((ByteBuffer)object).putShort(16, (short)((String)object2).charAt(n10 + 6));
        ((ByteBuffer)object).putShort(18, (short)((String)object2).charAt(n10 + 7));
        ((ByteBuffer)object).putShort(20, (short)((String)object2).charAt(n10 + 8));
        ((ByteBuffer)object).putShort(22, (short)((String)object2).charAt(n10 + 9));
        ((ByteBuffer)object).putShort(24, (short)((String)object2).charAt(n10 + 10));
        ((ByteBuffer)object).putShort(26, (short)0);
        ((ByteBuffer)object).putShort(28, (short)((String)object2).charAt(n10 + 11));
        ((ByteBuffer)object).putShort(30, (short)((String)object2).charAt(n10 + 12));
        g8.a = object;
        return g8;
    }

    static g b() {
        g g8 = new g();
        g8.a = ByteBuffer.allocate(32);
        long l8 = System.currentTimeMillis();
        g8.F(l8);
        g8.J(l8);
        g8.K(l8);
        return g8;
    }

    static g c(String string) {
        g g8 = new g();
        ByteBuffer byteBuffer = ByteBuffer.allocate(32);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        System.arraycopy(string.getBytes(Charset.forName("ASCII")), 0, byteBuffer.array(), 0, string.length());
        g8.a = byteBuffer;
        g8.I(8);
        return g8;
    }

    private static long d(int n8, int n9) {
        Calendar calendar = Calendar.getInstance(d.b());
        calendar.set(1, (n8 >> 9) + 1980);
        calendar.set(2, (n8 >> 5 & 0xF) - 1);
        calendar.set(5, n8 & 0x1F);
        calendar.set(11, n9 >> 11);
        calendar.set(12, n9 >> 5 & 0x3F);
        calendar.set(13, (n9 & 0x1F) * 2);
        return calendar.getTimeInMillis();
    }

    private static int e(long l8) {
        Calendar calendar = Calendar.getInstance(d.b());
        calendar.setTimeInMillis(l8);
        return (calendar.get(1) - 1980 << 9) + (calendar.get(2) + 1 << 5) + calendar.get(5);
    }

    private static int f(long l8) {
        Calendar calendar = Calendar.getInstance(d.b());
        calendar.setTimeInMillis(l8);
        return (calendar.get(11) << 11) + (calendar.get(12) << 5) + calendar.get(13) / 2;
    }

    private int j() {
        return this.a.get(11);
    }

    private int o(int n8) {
        byte by = this.a.get(n8);
        return (this.a.get(n8 + 1) & 0xFF) << 8 | by & 0xFF;
    }

    private long p(int n8) {
        return (long)(this.a.get(n8) & 0xFF) | ((long)(this.a.get(n8 + 1) & 0xFF) << 8 | ((long)(this.a.get(n8 + 2) & 0xFF) << 16 | (long)(this.a.get(n8 + 3) & 0xFF) << 24));
    }

    private int q(int n8) {
        return this.a.get(n8) & 0xFF;
    }

    private boolean u(int n8) {
        return (n8 & this.j()) != 0;
    }

    boolean A() {
        return this.u(4);
    }

    boolean B() {
        return this.u(8);
    }

    boolean C() {
        if (this.w()) {
            return false;
        }
        return (this.j() & 0x18) == 8;
    }

    void E(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a.array());
    }

    void F(long l8) {
        this.N(16, g.e(l8));
        this.N(14, g.f(l8));
    }

    void G() {
        this.I(16);
    }

    void H(long l8) {
        this.O(28, l8);
    }

    void J(long l8) {
        this.N(18, g.e(l8));
    }

    void K(long l8) {
        this.N(24, g.e(l8));
        this.N(22, g.f(l8));
    }

    void L(k k8) {
        this.b = k8;
        k8.d(this.a);
        this.a.clear();
    }

    void M(long l8) {
        this.N(20, (int)(l8 >> 16 & 0xFFFFL));
        this.N(26, (int)(l8 & 0xFFFFL));
    }

    void g(StringBuilder stringBuilder) {
        int n8;
        char c8 = (char)this.a.getShort(1);
        char c9 = (char)this.a.getShort(3);
        char c10 = (char)this.a.getShort(5);
        char c11 = (char)this.a.getShort(7);
        char c12 = (char)this.a.getShort(9);
        char c13 = (char)this.a.getShort(14);
        char c14 = (char)this.a.getShort(16);
        char c15 = (char)this.a.getShort(18);
        char c16 = (char)this.a.getShort(20);
        char c17 = (char)this.a.getShort(22);
        char c18 = (char)this.a.getShort(24);
        char c19 = (char)this.a.getShort(28);
        char c20 = (char)this.a.getShort(30);
        char[] cArray = new char[]{c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20};
        for (n8 = 0; n8 < 13 && cArray[n8] != '\u0000'; ++n8) {
        }
        stringBuilder.append(cArray, 0, n8);
    }

    long h() {
        return g.d(this.o(16), this.o(14));
    }

    long i() {
        return this.p(28);
    }

    long k() {
        return g.d(this.o(18), 0);
    }

    long l() {
        return g.d(this.o(24), this.o(22));
    }

    k m() {
        if (this.a.get(0) == 0) {
            return null;
        }
        return this.b;
    }

    long n() {
        return (long)this.o(20) << 16 | (long)this.o(26);
    }

    String r() {
        byte by;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < 11 && (by = this.a.get(i8)) != 0; ++i8) {
            stringBuilder.append((char)by);
        }
        return stringBuilder.toString();
    }

    boolean s() {
        boolean bl = false;
        if (this.q(0) == 229) {
            bl = true;
        }
        return bl;
    }

    boolean t() {
        return (this.j() & 0x18) == 16;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[FatDirectoryEntry shortName=");
        stringBuilder.append(this.b.b());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    boolean v() {
        return this.u(2);
    }

    boolean w() {
        return this.v() && this.B() && this.x() && this.A();
    }

    boolean x() {
        return this.u(1);
    }

    boolean y() {
        return (this.a.get(12) & 0x10) != 0;
    }

    boolean z() {
        return (this.a.get(12) & 8) != 0;
    }
}

