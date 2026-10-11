package ax.a5;

import ax.T4.e;
import ax.b5.f;
import ax.f1.C2015i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* renamed from: ax.a5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1370a {
    protected final C1370a a;
    protected final AtomicReference<C0252a> b;
    protected final int c;
    protected final boolean d;
    protected final boolean e;
    protected int[] f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected String[] l;
    protected int m;
    protected int n;
    protected boolean o;

    private C1370a(int i, int i2) {
        this.a = null;
        this.k = 0;
        this.o = true;
        this.c = i2;
        this.d = false;
        this.e = true;
        int i3 = 16;
        if (i < 16) {
            i = 16;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this.b = new AtomicReference<>(C0252a.a(i));
    }

    private void C(C0252a c0252a) {
        int i = c0252a.b;
        C0252a c0252a2 = this.b.get();
        if (i == c0252a2.b) {
            return;
        }
        if (i > 6000) {
            c0252a = C0252a.a(64);
        }
        C2015i.a(this.b, c0252a2, c0252a);
    }

    private void D(boolean z) {
        this.k = 0;
        this.m = l();
        this.n = this.g << 3;
        if (z) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.l, (Object) null);
        }
    }

    private void F() throws ax.V4.b {
        this.o = false;
        int[] iArr = this.f;
        String[] strArr = this.l;
        int i = this.g;
        int i2 = this.k;
        int i3 = i + i;
        int i4 = this.m;
        if (i3 > 65536) {
            D(true);
            return;
        }
        this.f = new int[iArr.length + (i << 3)];
        this.g = i3;
        int i5 = i3 << 2;
        this.h = i5;
        this.i = i5 + (i5 >> 1);
        this.j = c(i3);
        this.l = new String[strArr.length << 1];
        D(false);
        int[] iArr2 = new int[16];
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i8 != 0) {
                i6++;
                String str = strArr[i7 >> 2];
                if (i8 == 1) {
                    iArr2[0] = iArr[i7];
                    p(str, iArr2, 1);
                } else if (i8 == 2) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    p(str, iArr2, 2);
                } else if (i8 != 3) {
                    if (i8 > iArr2.length) {
                        iArr2 = new int[i8];
                    }
                    System.arraycopy(iArr, iArr[i7 + 1], iArr2, 0, i8);
                    p(str, iArr2, i8);
                } else {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    iArr2[2] = iArr[i7 + 2];
                    p(str, iArr2, 3);
                }
            }
        }
        if (i6 == i2) {
            return;
        }
        throw new IllegalStateException("Internal error: Failed rehash(), old count=" + i2 + ", copyCount=" + i6);
    }

    private int a(int[] iArr, int i) {
        int i2 = this.n;
        int i3 = i2 + i;
        int[] iArr2 = this.f;
        if (i3 > iArr2.length) {
            this.f = Arrays.copyOf(this.f, this.f.length + Math.max(i3 - iArr2.length, Math.min(4096, this.g)));
        }
        System.arraycopy(iArr, 0, this.f, i2, i);
        this.n += i;
        return i2;
    }

    private final int b(int i) {
        return (i & (this.g - 1)) << 2;
    }

    static int c(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    private boolean d() {
        if (this.k <= (this.g >> 1)) {
            return false;
        }
        int l = (this.m - l()) >> 2;
        int i = this.k;
        return l > ((i + 1) >> 7) || ((double) i) > ((double) this.g) * 0.8d;
    }

    private int e(int i) throws ax.V4.b {
        int b = b(i);
        int[] iArr = this.f;
        if (iArr[b + 3] == 0) {
            return b;
        }
        if (d()) {
            return k(i);
        }
        int i2 = this.h + ((b >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.i;
        int i4 = this.j;
        int i5 = i3 + ((b >> (i4 + 2)) << i4);
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            if (iArr[i5 + 3] == 0) {
                return i5;
            }
            i5 += 4;
        }
        int i7 = this.m;
        int i8 = i7 + 4;
        this.m = i8;
        if (i8 < (this.g << 3)) {
            return i7;
        }
        if (this.e) {
            j();
        }
        return k(i);
    }

    private String f(int i, int i2) {
        int i3 = this.i;
        int i4 = this.j;
        int i5 = i3 + ((i >> (i4 + 2)) << i4);
        int[] iArr = this.f;
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            int i7 = iArr[i5 + 3];
            if (i2 == iArr[i5] && 1 == i7) {
                return this.l[i5 >> 2];
            }
            if (i7 == 0) {
                return null;
            }
            i5 += 4;
        }
        for (int l = l(); l < this.m; l += 4) {
            if (i2 == iArr[l] && 1 == iArr[l + 3]) {
                return this.l[l >> 2];
            }
        }
        return null;
    }

    private String g(int i, int i2, int i3) {
        int i4 = this.i;
        int i5 = this.j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr = this.f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr[i6 + 3];
            if (i2 == iArr[i6] && i3 == iArr[i6 + 1] && 2 == i8) {
                return this.l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int l = l(); l < this.m; l += 4) {
            if (i2 == iArr[l] && i3 == iArr[l + 1] && 2 == iArr[l + 3]) {
                return this.l[l >> 2];
            }
        }
        return null;
    }

    private String h(int i, int i2, int i3, int i4) {
        int i5 = this.i;
        int i6 = this.j;
        int i7 = i5 + ((i >> (i6 + 2)) << i6);
        int[] iArr = this.f;
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            int i9 = iArr[i7 + 3];
            if (i2 == iArr[i7] && i3 == iArr[i7 + 1] && i4 == iArr[i7 + 2] && 3 == i9) {
                return this.l[i7 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
            i7 += 4;
        }
        for (int l = l(); l < this.m; l += 4) {
            if (i2 == iArr[l] && i3 == iArr[l + 1] && i4 == iArr[l + 2] && 3 == iArr[l + 3]) {
                return this.l[l >> 2];
            }
        }
        return null;
    }

    private String i(int i, int i2, int[] iArr, int i3) {
        int i4 = this.i;
        int i5 = this.j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr2 = this.f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr2[i6 + 3];
            if (i2 == iArr2[i6] && i3 == i8 && m(iArr, i3, iArr2[i6 + 1])) {
                return this.l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int l = l(); l < this.m; l += 4) {
            if (i2 == iArr2[l] && i3 == iArr2[l + 3] && m(iArr, i3, iArr2[l + 1])) {
                return this.l[l >> 2];
            }
        }
        return null;
    }

    private int k(int i) throws ax.V4.b {
        F();
        int b = b(i);
        int[] iArr = this.f;
        if (iArr[b + 3] == 0) {
            return b;
        }
        int i2 = this.h + ((b >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.i;
        int i4 = this.j;
        int i5 = i3 + ((b >> (i4 + 2)) << i4);
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            if (iArr[i5 + 3] == 0) {
                return i5;
            }
            i5 += 4;
        }
        int i7 = this.m;
        this.m = i7 + 4;
        return i7;
    }

    private final int l() {
        int i = this.g;
        return (i << 3) - i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m(int[] r8, int r9, int r10) {
        /*
            r7 = this;
            int[] r0 = r7.f
            r1 = 1
            r2 = 0
            switch(r9) {
                case 4: goto L42;
                case 5: goto L34;
                case 6: goto L26;
                case 7: goto L18;
                case 8: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r8 = r7.n(r8, r9, r10)
            return r8
        Lc:
            r9 = r8[r2]
            int r3 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L15
            return r2
        L15:
            r10 = r3
            r9 = 1
            goto L19
        L18:
            r9 = 0
        L19:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L24
            return r2
        L24:
            r10 = r4
            goto L27
        L26:
            r3 = 0
        L27:
            int r9 = r3 + 1
            r3 = r8[r3]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r3 == r10) goto L32
            return r2
        L32:
            r10 = r4
            goto L35
        L34:
            r9 = 0
        L35:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L40
            return r2
        L40:
            r10 = r4
            goto L43
        L42:
            r3 = 0
        L43:
            int r9 = r3 + 1
            r4 = r8[r3]
            int r5 = r10 + 1
            r6 = r0[r10]
            if (r4 == r6) goto L4e
            return r2
        L4e:
            int r4 = r3 + 2
            r9 = r8[r9]
            int r6 = r10 + 2
            r5 = r0[r5]
            if (r9 == r5) goto L59
            return r2
        L59:
            int r3 = r3 + 3
            r9 = r8[r4]
            int r10 = r10 + 3
            r4 = r0[r6]
            if (r9 == r4) goto L64
            return r2
        L64:
            r8 = r8[r3]
            r9 = r0[r10]
            if (r8 == r9) goto L6b
            return r2
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.a5.C1370a.m(int[], int, int):boolean");
    }

    private boolean n(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            if (iArr[i3] != this.f[i2]) {
                return false;
            }
            if (i4 >= i) {
                return true;
            }
            i3 = i4;
            i2 = i5;
        }
    }

    private void o() {
        if (this.o) {
            if (this.a == null) {
                if (this.k != 0) {
                    throw new IllegalStateException("Internal error: Cannot add names to Placeholder symbol table");
                }
                throw new IllegalStateException("Internal error: Cannot add names to Root symbol table");
            }
            int[] iArr = this.f;
            this.f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.l;
            this.l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.o = false;
        }
    }

    public static C1370a u() {
        long currentTimeMillis = System.currentTimeMillis();
        return v((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static C1370a v(int i) {
        return new C1370a(64, i);
    }

    public C1370a A(int i) {
        return new C1370a(this, this.c, this.b.get(), e.a.INTERN_FIELD_NAMES.l(i), e.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.l(i));
    }

    public boolean B() {
        return !this.o;
    }

    public int E() {
        int i = this.h;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public void G() {
        if (this.a == null || !B()) {
            return;
        }
        this.a.C(new C0252a(this));
        this.o = true;
    }

    public int H() {
        int i = this.i;
        int i2 = 0;
        for (int i3 = this.h + 3; i3 < i; i3 += 4) {
            if (this.f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int I() {
        return (this.m - l()) >> 2;
    }

    public int J() {
        int i = this.i + 3;
        int i2 = this.g + i;
        int i3 = 0;
        while (i < i2) {
            if (this.f[i] != 0) {
                i3++;
            }
            i += 4;
        }
        return i3;
    }

    public int K() {
        int i = this.g << 3;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    protected void j() throws ax.V4.b {
        if (this.g <= 1024) {
            return;
        }
        throw new ax.V4.b("Spill-over slots in symbol table with " + this.k + " entries, hash area of " + this.g + " slots is now full (all " + (this.g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    public String p(String str, int[] iArr, int i) throws ax.V4.b {
        int e;
        o();
        if (this.d) {
            str = f.c0.a(str);
        }
        if (i == 1) {
            e = e(q(iArr[0]));
            int[] iArr2 = this.f;
            iArr2[e] = iArr[0];
            iArr2[e + 3] = 1;
        } else if (i == 2) {
            e = e(r(iArr[0], iArr[1]));
            int[] iArr3 = this.f;
            iArr3[e] = iArr[0];
            iArr3[e + 1] = iArr[1];
            iArr3[e + 3] = 2;
        } else if (i != 3) {
            int t = t(iArr, i);
            e = e(t);
            this.f[e] = t;
            int a = a(iArr, i);
            int[] iArr4 = this.f;
            iArr4[e + 1] = a;
            iArr4[e + 3] = i;
        } else {
            int e2 = e(s(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this.f;
            iArr5[e2] = iArr[0];
            iArr5[e2 + 1] = iArr[1];
            iArr5[e2 + 2] = iArr[2];
            iArr5[e2 + 3] = 3;
            e = e2;
        }
        this.l[e >> 2] = str;
        this.k++;
        return str;
    }

    public int q(int i) {
        int i2 = i ^ this.c;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        return i4 + (i4 >>> 12);
    }

    public int r(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = ((i3 ^ (i3 >>> 9)) + (i2 * 33)) ^ this.c;
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    public int s(int i, int i2, int i3) {
        int i4 = i ^ this.c;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public int t(int[] iArr, int i) {
        if (i < 4) {
            throw new IllegalArgumentException("qlen is too short, needs to be at least 4");
        }
        int i2 = iArr[0] ^ this.c;
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i5 = i4 + (i4 >>> 4);
        for (int i6 = 3; i6 < i; i6++) {
            int i7 = iArr[i6];
            i5 += i7 ^ (i7 >> 21);
        }
        int i8 = i5 * 65599;
        int i9 = i8 + (i8 >>> 19);
        return (i9 << 5) ^ i9;
    }

    public String toString() {
        int E = E();
        int H = H();
        int J = J();
        int I = I();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", C1370a.class.getName(), Integer.valueOf(this.k), Integer.valueOf(this.g), Integer.valueOf(E), Integer.valueOf(H), Integer.valueOf(J), Integer.valueOf(I), Integer.valueOf(E + H + J + I), Integer.valueOf(K()));
    }

    public String w(int i) {
        int b = b(q(i));
        int[] iArr = this.f;
        int i2 = iArr[b + 3];
        if (i2 == 1) {
            if (iArr[b] == i) {
                return this.l[b >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        int i3 = this.h + ((b >> 3) << 2);
        int i4 = iArr[i3 + 3];
        if (i4 == 1) {
            if (iArr[i3] == i) {
                return this.l[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        return f(b, i);
    }

    public String x(int i, int i2) {
        int b = b(r(i, i2));
        int[] iArr = this.f;
        int i3 = iArr[b + 3];
        if (i3 == 2) {
            if (i == iArr[b] && i2 == iArr[b + 1]) {
                return this.l[b >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.h + ((b >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.l[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return g(b, i, i2);
    }

    public String y(int i, int i2, int i3) {
        int b = b(s(i, i2, i3));
        int[] iArr = this.f;
        int i4 = iArr[b + 3];
        if (i4 == 3) {
            if (i == iArr[b] && iArr[b + 1] == i2 && iArr[b + 2] == i3) {
                return this.l[b >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.h + ((b >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return h(b, i, i2, i3);
    }

    public String z(int[] iArr, int i) {
        if (i < 4) {
            return i != 1 ? i != 2 ? i != 3 ? HttpUrl.FRAGMENT_ENCODE_SET : y(iArr[0], iArr[1], iArr[2]) : x(iArr[0], iArr[1]) : w(iArr[0]);
        }
        int t = t(iArr, i);
        int b = b(t);
        int[] iArr2 = this.f;
        int i2 = iArr2[b + 3];
        if (t == iArr2[b] && i2 == i && m(iArr, i, iArr2[b + 1])) {
            return this.l[b >> 2];
        }
        if (i2 == 0) {
            return null;
        }
        int i3 = this.h + ((b >> 3) << 2);
        return (t == iArr2[i3] && iArr2[i3 + 3] == i && m(iArr, i, iArr2[i3 + 1])) ? this.l[i3 >> 2] : i(b, t, iArr, i);
    }

    /* renamed from: ax.a5.a$a, reason: collision with other inner class name */
    private static final class C0252a {
        public final int a;
        public final int b;
        public final int c;
        public final int[] d;
        public final String[] e;
        public final int f;
        public final int g;

        public C0252a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = iArr;
            this.e = strArr;
            this.f = i4;
            this.g = i5;
        }

        public static C0252a a(int i) {
            int i2 = i << 3;
            return new C0252a(i, 0, C1370a.c(i), new int[i2], new String[i << 1], i2 - i, i2);
        }

        public C0252a(C1370a c1370a) {
            this.a = c1370a.g;
            this.b = c1370a.k;
            this.c = c1370a.j;
            this.d = c1370a.f;
            this.e = c1370a.l;
            this.f = c1370a.m;
            this.g = c1370a.n;
        }
    }

    private C1370a(C1370a c1370a, int i, C0252a c0252a, boolean z, boolean z2) {
        this.a = c1370a;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.b = null;
        this.k = c0252a.b;
        int i2 = c0252a.a;
        this.g = i2;
        int i3 = i2 << 2;
        this.h = i3;
        this.i = i3 + (i3 >> 1);
        this.j = c0252a.c;
        this.f = c0252a.d;
        this.l = c0252a.e;
        this.m = c0252a.f;
        this.n = c0252a.g;
        this.o = true;
    }
}
