package ax.i5;

import ax.h5.C2154d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Calendar;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
class g {
    private ByteBuffer a;
    private k b;

    private g() {
    }

    static g D(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[32];
        if (byteBuffer.get(byteBuffer.position()) == 0) {
            return null;
        }
        byteBuffer.get(bArr);
        return new g(ByteBuffer.wrap(bArr));
    }

    private void I(int i) {
        this.a.put(11, (byte) (i | j()));
    }

    private void N(int i, int i2) {
        this.a.put(i, (byte) (i2 & 255));
        this.a.put(i + 1, (byte) ((i2 >>> 8) & 255));
    }

    private void O(int i, long j) {
        this.a.put(i, (byte) (j & 255));
        this.a.put(i + 1, (byte) ((j >>> 8) & 255));
        this.a.put(i + 2, (byte) ((j >>> 16) & 255));
        this.a.put(i + 3, (byte) ((j >>> 24) & 255));
    }

    static g a(String str, int i, byte b, int i2, boolean z) {
        int length;
        g gVar = new g();
        if (z && (length = str.length() - i) < 13) {
            StringBuilder sb = new StringBuilder(13);
            sb.append((CharSequence) str, i, str.length());
            sb.append((char) 0);
            for (int i3 = 0; i3 < 13 - length; i3++) {
                sb.append((char) 65535);
            }
            str = sb.toString();
            i = 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(32);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (z) {
            i2 += 64;
        }
        allocate.put(0, (byte) i2);
        allocate.putShort(1, (short) str.charAt(i));
        allocate.putShort(3, (short) str.charAt(i + 1));
        allocate.putShort(5, (short) str.charAt(i + 2));
        allocate.putShort(7, (short) str.charAt(i + 3));
        allocate.putShort(9, (short) str.charAt(i + 4));
        allocate.put(11, (byte) 15);
        allocate.put(12, (byte) 0);
        allocate.put(13, b);
        allocate.putShort(14, (short) str.charAt(i + 5));
        allocate.putShort(16, (short) str.charAt(i + 6));
        allocate.putShort(18, (short) str.charAt(i + 7));
        allocate.putShort(20, (short) str.charAt(i + 8));
        allocate.putShort(22, (short) str.charAt(i + 9));
        allocate.putShort(24, (short) str.charAt(i + 10));
        allocate.putShort(26, (short) 0);
        allocate.putShort(28, (short) str.charAt(i + 11));
        allocate.putShort(30, (short) str.charAt(i + 12));
        gVar.a = allocate;
        return gVar;
    }

    static g b() {
        g gVar = new g();
        gVar.a = ByteBuffer.allocate(32);
        long currentTimeMillis = System.currentTimeMillis();
        gVar.F(currentTimeMillis);
        gVar.J(currentTimeMillis);
        gVar.K(currentTimeMillis);
        return gVar;
    }

    static g c(String str) {
        g gVar = new g();
        ByteBuffer allocate = ByteBuffer.allocate(32);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        System.arraycopy(str.getBytes(Charset.forName("ASCII")), 0, allocate.array(), 0, str.length());
        gVar.a = allocate;
        gVar.I(8);
        return gVar;
    }

    private static long d(int i, int i2) {
        Calendar calendar = Calendar.getInstance(C2154d.b());
        calendar.set(1, (i >> 9) + 1980);
        calendar.set(2, ((i >> 5) & 15) - 1);
        calendar.set(5, i & 31);
        calendar.set(11, i2 >> 11);
        calendar.set(12, (i2 >> 5) & 63);
        calendar.set(13, (i2 & 31) * 2);
        return calendar.getTimeInMillis();
    }

    private static int e(long j) {
        Calendar calendar = Calendar.getInstance(C2154d.b());
        calendar.setTimeInMillis(j);
        return ((calendar.get(1) - 1980) << 9) + ((calendar.get(2) + 1) << 5) + calendar.get(5);
    }

    private static int f(long j) {
        Calendar calendar = Calendar.getInstance(C2154d.b());
        calendar.setTimeInMillis(j);
        return (calendar.get(11) << 11) + (calendar.get(12) << 5) + (calendar.get(13) / 2);
    }

    private int j() {
        return this.a.get(11);
    }

    private int o(int i) {
        return ((this.a.get(i + 1) & 255) << 8) | (this.a.get(i) & 255);
    }

    private long p(int i) {
        return (this.a.get(i) & 255) | ((this.a.get(i + 1) & 255) << 8) | ((this.a.get(i + 2) & 255) << 16) | ((this.a.get(i + 3) & 255) << 24);
    }

    private int q(int i) {
        return this.a.get(i) & 255;
    }

    private boolean u(int i) {
        return (i & j()) != 0;
    }

    boolean A() {
        return u(4);
    }

    boolean B() {
        return u(8);
    }

    boolean C() {
        return !w() && (j() & 24) == 8;
    }

    void E(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a.array());
    }

    void F(long j) {
        N(16, e(j));
        N(14, f(j));
    }

    void G() {
        I(16);
    }

    void H(long j) {
        O(28, j);
    }

    void J(long j) {
        N(18, e(j));
    }

    void K(long j) {
        N(24, e(j));
        N(22, f(j));
    }

    void L(k kVar) {
        this.b = kVar;
        kVar.d(this.a);
        this.a.clear();
    }

    void M(long j) {
        N(20, (int) ((j >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        N(26, (int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    void g(StringBuilder sb) {
        char[] cArr = {(char) this.a.getShort(1), (char) this.a.getShort(3), (char) this.a.getShort(5), (char) this.a.getShort(7), (char) this.a.getShort(9), (char) this.a.getShort(14), (char) this.a.getShort(16), (char) this.a.getShort(18), (char) this.a.getShort(20), (char) this.a.getShort(22), (char) this.a.getShort(24), (char) this.a.getShort(28), (char) this.a.getShort(30)};
        int i = 0;
        while (i < 13 && cArr[i] != 0) {
            i++;
        }
        sb.append(cArr, 0, i);
    }

    long h() {
        return d(o(16), o(14));
    }

    long i() {
        return p(28);
    }

    long k() {
        return d(o(18), 0);
    }

    long l() {
        return d(o(24), o(22));
    }

    k m() {
        if (this.a.get(0) == 0) {
            return null;
        }
        return this.b;
    }

    long n() {
        return (o(20) << 16) | o(26);
    }

    String r() {
        byte b;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 11 && (b = this.a.get(i)) != 0; i++) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    boolean s() {
        return q(0) == 229;
    }

    boolean t() {
        return (j() & 24) == 16;
    }

    public String toString() {
        return "[FatDirectoryEntry shortName=" + this.b.b() + "]";
    }

    boolean v() {
        return u(2);
    }

    boolean w() {
        return v() && B() && x() && A();
    }

    boolean x() {
        return u(1);
    }

    boolean y() {
        return (this.a.get(12) & 16) != 0;
    }

    boolean z() {
        return (this.a.get(12) & 8) != 0;
    }

    private g(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        this.b = k.c(byteBuffer);
        byteBuffer.clear();
    }
}
