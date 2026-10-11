/*
 * Decompiled with CFR 0.152.
 */
package ax.a5;

import ax.T4.e;
import ax.V4.b;
import ax.b5.f;
import ax.f1.i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class a {
    protected final a a;
    protected final AtomicReference<a> b;
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

    private a(int n8, int n9) {
        this.a = null;
        this.k = 0;
        this.o = true;
        this.c = n9;
        this.d = false;
        this.e = true;
        int n10 = 16;
        if (n8 < 16) {
            n9 = 16;
        } else {
            n9 = n8;
            if ((n8 - 1 & n8) != 0) {
                for (n9 = n10; n9 < n8; n9 += n9) {
                }
            }
        }
        this.b = new AtomicReference<a>(ax.a5.a$a.a(n9));
    }

    private a(a a8, int n8, a a9, boolean bl, boolean bl2) {
        this.a = a8;
        this.c = n8;
        this.d = bl;
        this.e = bl2;
        this.b = null;
        this.k = a9.b;
        this.g = n8 = a9.a;
        this.h = n8 <<= 2;
        this.i = n8 + (n8 >> 1);
        this.j = a9.c;
        this.f = a9.d;
        this.l = a9.e;
        this.m = a9.f;
        this.n = a9.g;
        this.o = true;
    }

    private void C(a a8) {
        int n8 = a8.b;
        a a9 = this.b.get();
        if (n8 == a9.b) {
            return;
        }
        if (n8 > 6000) {
            a8 = ax.a5.a$a.a(64);
        }
        ax.f1.i.a(this.b, a9, a8);
    }

    private void D(boolean bl) {
        this.k = 0;
        this.m = this.l();
        this.n = this.g << 3;
        if (bl) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.l, null);
        }
    }

    private void F() throws b {
        Object object;
        this.o = false;
        int[] nArray = this.f;
        String[] stringArray = this.l;
        int n8 = this.g;
        int n9 = this.k;
        int n10 = n8 + n8;
        int n11 = this.m;
        if (n10 > 65536) {
            this.D(true);
            return;
        }
        this.f = new int[nArray.length + (n8 << 3)];
        this.g = n10;
        this.h = n8 = n10 << 2;
        this.i = n8 + (n8 >> 1);
        this.j = ax.a5.a.c(n10);
        this.l = new String[stringArray.length << 1];
        this.D(false);
        Object object2 = new int[16];
        n8 = 0;
        for (n10 = 0; n10 < n11; n10 += 4) {
            int n12 = nArray[n10 + 3];
            if (n12 == 0) {
                object = object2;
            } else {
                ++n8;
                String string = stringArray[n10 >> 2];
                if (n12 != 1) {
                    if (n12 != 2) {
                        if (n12 != 3) {
                            object = object2;
                            if (n12 > ((int[])object2).length) {
                                object = new int[n12];
                            }
                            System.arraycopy(nArray, nArray[n10 + 1], object, 0, n12);
                            this.p(string, (int[])object, n12);
                        } else {
                            object2[0] = nArray[n10];
                            object2[1] = nArray[n10 + 1];
                            object2[2] = nArray[n10 + 2];
                            this.p(string, (int[])object2, 3);
                            object = object2;
                        }
                    } else {
                        object2[0] = nArray[n10];
                        object2[1] = nArray[n10 + 1];
                        this.p(string, (int[])object2, 2);
                        object = object2;
                    }
                } else {
                    object2[0] = nArray[n10];
                    this.p(string, (int[])object2, 1);
                    object = object2;
                }
            }
            object2 = object;
        }
        if (n8 == n9) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Internal error: Failed rehash(), old count=");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(", copyCount=");
        ((StringBuilder)object).append(n8);
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private int a(int[] nArray, int n8) {
        int n9 = this.n;
        int n10 = n9 + n8;
        int[] nArray2 = this.f;
        if (n10 > nArray2.length) {
            int n11 = nArray2.length;
            int n12 = Math.min(4096, this.g);
            int n13 = this.f.length;
            n12 = Math.max(n10 - n11, n12);
            this.f = Arrays.copyOf(this.f, n13 + n12);
        }
        System.arraycopy(nArray, 0, this.f, n9, n8);
        this.n += n8;
        return n9;
    }

    private final int b(int n8) {
        return (n8 & this.g - 1) << 2;
    }

    static int c(int n8) {
        if ((n8 >>= 2) < 64) {
            return 4;
        }
        if (n8 <= 256) {
            return 5;
        }
        if (n8 <= 1024) {
            return 6;
        }
        return 7;
    }

    private boolean d() {
        int n8;
        int n9;
        int n10;
        return this.k > this.g >> 1 && ((n10 = this.m) - (n9 = this.l()) >> 2 > (n8 = this.k) + 1 >> 7 || (double)n8 > (double)this.g * 0.8);
    }

    private int e(int n8) throws b {
        int[] nArray = this.f;
        int n9 = this.b(n8);
        if (nArray[n9 + 3] == 0) {
            return n9;
        }
        if (this.d()) {
            return this.k(n8);
        }
        int n10 = this.h + (n9 >> 3 << 2);
        if (nArray[n10 + 3] == 0) {
            return n10;
        }
        n10 = this.i;
        int n11 = this.j;
        n10 += n9 >> n11 + 2 << n11;
        for (n9 = n10; n9 < (1 << n11) + n10; n9 += 4) {
            if (nArray[n9 + 3] != 0) continue;
            return n9;
        }
        n9 = this.m;
        this.m = n10 = n9 + 4;
        if (n10 >= this.g << 3) {
            if (this.e) {
                this.j();
            }
            return this.k(n8);
        }
        return n9;
    }

    private String f(int n8, int n9) {
        int n10 = this.i;
        int n11 = this.j;
        n10 += n8 >> n11 + 2 << n11;
        int[] nArray = this.f;
        for (n8 = n10; n8 < (1 << n11) + n10; n8 += 4) {
            int n12 = nArray[n8 + 3];
            if (n9 == nArray[n8] && 1 == n12) {
                return this.l[n8 >> 2];
            }
            if (n12 != 0) continue;
            return null;
        }
        for (n8 = this.l(); n8 < this.m; n8 += 4) {
            if (n9 != nArray[n8] || 1 != nArray[n8 + 3]) continue;
            return this.l[n8 >> 2];
        }
        return null;
    }

    private String g(int n8, int n9, int n10) {
        int n11 = this.i;
        int n12 = this.j;
        n11 += n8 >> n12 + 2 << n12;
        int[] nArray = this.f;
        for (n8 = n11; n8 < (1 << n12) + n11; n8 += 4) {
            int n13 = nArray[n8 + 3];
            if (n9 == nArray[n8] && n10 == nArray[n8 + 1] && 2 == n13) {
                return this.l[n8 >> 2];
            }
            if (n13 != 0) continue;
            return null;
        }
        for (n8 = this.l(); n8 < this.m; n8 += 4) {
            if (n9 != nArray[n8] || n10 != nArray[n8 + 1] || 2 != nArray[n8 + 3]) continue;
            return this.l[n8 >> 2];
        }
        return null;
    }

    private String h(int n8, int n9, int n10, int n11) {
        int n12 = this.i;
        int n13 = this.j;
        n12 += n8 >> n13 + 2 << n13;
        int[] nArray = this.f;
        for (n8 = n12; n8 < (1 << n13) + n12; n8 += 4) {
            int n14 = nArray[n8 + 3];
            if (n9 == nArray[n8] && n10 == nArray[n8 + 1] && n11 == nArray[n8 + 2] && 3 == n14) {
                return this.l[n8 >> 2];
            }
            if (n14 != 0) continue;
            return null;
        }
        for (n8 = this.l(); n8 < this.m; n8 += 4) {
            if (n9 != nArray[n8] || n10 != nArray[n8 + 1] || n11 != nArray[n8 + 2] || 3 != nArray[n8 + 3]) continue;
            return this.l[n8 >> 2];
        }
        return null;
    }

    private String i(int n8, int n9, int[] nArray, int n10) {
        int n11 = this.i;
        int n12 = this.j;
        n11 += n8 >> n12 + 2 << n12;
        int[] nArray2 = this.f;
        for (n8 = n11; n8 < (1 << n12) + n11; n8 += 4) {
            int n13 = nArray2[n8 + 3];
            if (n9 == nArray2[n8] && n10 == n13 && this.m(nArray, n10, nArray2[n8 + 1])) {
                return this.l[n8 >> 2];
            }
            if (n13 != 0) continue;
            return null;
        }
        for (n8 = this.l(); n8 < this.m; n8 += 4) {
            if (n9 != nArray2[n8] || n10 != nArray2[n8 + 3] || !this.m(nArray, n10, nArray2[n8 + 1])) continue;
            return this.l[n8 >> 2];
        }
        return null;
    }

    private int k(int n8) throws b {
        this.F();
        n8 = this.b(n8);
        int[] nArray = this.f;
        if (nArray[n8 + 3] == 0) {
            return n8;
        }
        int n9 = this.h + (n8 >> 3 << 2);
        if (nArray[n9 + 3] == 0) {
            return n9;
        }
        n9 = this.i;
        int n10 = this.j;
        n9 += n8 >> n10 + 2 << n10;
        for (n8 = n9; n8 < (1 << n10) + n9; n8 += 4) {
            if (nArray[n8 + 3] != 0) continue;
            return n8;
        }
        n8 = this.m;
        this.m = n8 + 4;
        return n8;
    }

    private final int l() {
        int n8 = this.g;
        return (n8 << 3) - n8;
    }

    /*
     * Unable to fully structure code
     */
    private boolean m(int[] var1_1, int var2_2, int var3_3) {
        block14: {
            var5_4 = this.f;
            switch (var2_2) {
                default: {
                    return this.n(var1_1, var2_2, var3_3);
                }
                case 8: {
                    if (var1_1[0] != var5_4[var3_3]) {
                        return false;
                    }
                    ++var3_3;
                    var2_2 = 1;
                    ** GOTO lbl13
                }
                case 7: {
                    var2_2 = 0;
lbl13:
                    // 2 sources

                    var4_5 = var2_2 + 1;
                    if (var1_1[var2_2] != var5_4[var3_3]) {
                        return false;
                    }
                    ++var3_3;
                    var2_2 = var4_5;
                    ** GOTO lbl21
                }
                case 6: {
                    var2_2 = 0;
lbl21:
                    // 2 sources

                    var4_5 = var2_2 + 1;
                    if (var1_1[var2_2] != var5_4[var3_3]) {
                        return false;
                    }
                    ++var3_3;
                    var2_2 = var4_5;
                    ** GOTO lbl29
                }
                case 5: {
                    var2_2 = 0;
lbl29:
                    // 2 sources

                    var4_5 = var2_2 + 1;
                    if (var1_1[var2_2] != var5_4[var3_3]) {
                        return false;
                    }
                    ++var3_3;
                    var2_2 = var4_5;
                    break block14;
                }
                case 4: 
            }
            var2_2 = 0;
        }
        if (var1_1[var2_2] != var5_4[var3_3]) {
            return false;
        }
        if (var1_1[var2_2 + 1] != var5_4[var3_3 + 1]) {
            return false;
        }
        if (var1_1[var2_2 + 2] != var5_4[var3_3 + 2]) {
            return false;
        }
        return var1_1[var2_2 + 3] == var5_4[var3_3 + 3];
    }

    private boolean n(int[] nArray, int n8, int n9) {
        int n10 = 0;
        while (true) {
            int n11 = n10 + 1;
            if (nArray[n10] != this.f[n9]) {
                return false;
            }
            if (n11 >= n8) {
                return true;
            }
            n10 = n11;
            ++n9;
        }
    }

    private void o() {
        if (this.o) {
            if (this.a == null) {
                if (this.k == 0) {
                    throw new IllegalStateException("Internal error: Cannot add names to Root symbol table");
                }
                throw new IllegalStateException("Internal error: Cannot add names to Placeholder symbol table");
            }
            Object[] objectArray = this.f;
            this.f = Arrays.copyOf(objectArray, objectArray.length);
            objectArray = this.l;
            this.l = (String[])Arrays.copyOf(objectArray, objectArray.length);
            this.o = false;
        }
    }

    public static a u() {
        long l8 = System.currentTimeMillis();
        return ax.a5.a.v((int)l8 + (int)(l8 >>> 32) | 1);
    }

    protected static a v(int n8) {
        return new a(64, n8);
    }

    public a A(int n8) {
        return new a(this, this.c, this.b.get(), e.a.c0.l(n8), e.a.e0.l(n8));
    }

    public boolean B() {
        return this.o ^ true;
    }

    public int E() {
        int n8 = this.h;
        int n9 = 0;
        for (int i8 = 3; i8 < n8; i8 += 4) {
            int n10 = n9;
            if (this.f[i8] != 0) {
                n10 = n9 + 1;
            }
            n9 = n10;
        }
        return n9;
    }

    public void G() {
        if (this.a != null && this.B()) {
            this.a.C(new a(this));
            this.o = true;
        }
    }

    public int H() {
        int n8 = this.i;
        int n9 = 0;
        for (int i8 = this.h + 3; i8 < n8; i8 += 4) {
            int n10 = n9;
            if (this.f[i8] != 0) {
                n10 = n9 + 1;
            }
            n9 = n10;
        }
        return n9;
    }

    public int I() {
        return this.m - this.l() >> 2;
    }

    public int J() {
        int n8 = this.i + 3;
        int n9 = this.g;
        int n10 = 0;
        for (int i8 = n8; i8 < n9 + n8; i8 += 4) {
            int n11 = n10;
            if (this.f[i8] != 0) {
                n11 = n10 + 1;
            }
            n10 = n11;
        }
        return n10;
    }

    public int K() {
        int n8 = this.g;
        int n9 = 0;
        for (int i8 = 3; i8 < n8 << 3; i8 += 4) {
            int n10 = n9;
            if (this.f[i8] != 0) {
                n10 = n9 + 1;
            }
            n9 = n10;
        }
        return n9;
    }

    protected void j() throws b {
        if (this.g <= 1024) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Spill-over slots in symbol table with ");
        stringBuilder.append(this.k);
        stringBuilder.append(" entries, hash area of ");
        stringBuilder.append(this.g);
        stringBuilder.append(" slots is now full (all ");
        stringBuilder.append(this.g >> 3);
        stringBuilder.append(" slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
        throw new b(stringBuilder.toString());
    }

    public String p(String object, int[] nArray, int n8) throws b {
        this.o();
        String string = object;
        if (this.d) {
            string = ax.b5.f.c0.a((String)object);
        }
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    int n9 = this.t(nArray, n8);
                    int n10 = this.e(n9);
                    this.f[n10] = n9;
                    n9 = this.a(nArray, n8);
                    object = this.f;
                    object[n10 + 1] = n9;
                    object[n10 + 3] = n8;
                    n8 = n10;
                } else {
                    n8 = this.e(this.s(nArray[0], nArray[1], nArray[2]));
                    object = this.f;
                    object[n8] = nArray[0];
                    object[n8 + 1] = nArray[1];
                    object[n8 + 2] = nArray[2];
                    object[n8 + 3] = 3;
                }
            } else {
                n8 = this.e(this.r(nArray[0], nArray[1]));
                object = this.f;
                object[n8] = nArray[0];
                object[n8 + 1] = nArray[1];
                object[n8 + 3] = 2;
            }
        } else {
            n8 = this.e(this.q(nArray[0]));
            object = this.f;
            object[n8] = nArray[0];
            object[n8 + 3] = true;
        }
        this.l[n8 >> 2] = string;
        ++this.k;
        return string;
    }

    public int q(int n8) {
        n8 ^= this.c;
        n8 += n8 >>> 16;
        n8 ^= n8 << 3;
        return n8 + (n8 >>> 12);
    }

    public int r(int n8, int n9) {
        n8 += n8 >>> 15;
        n8 = (n8 ^ n8 >>> 9) + n9 * 33 ^ this.c;
        n8 += n8 >>> 16;
        n8 ^= n8 >>> 4;
        return n8 + (n8 << 3);
    }

    public int s(int n8, int n9, int n10) {
        n8 ^= this.c;
        n8 = ((n8 + (n8 >>> 9)) * 31 + n9) * 33;
        n8 = n8 + (n8 >>> 15) ^ n10;
        n8 += n8 >>> 4;
        n8 += n8 >>> 15;
        return n8 ^ n8 << 9;
    }

    public int t(int[] nArray, int n8) {
        if (n8 >= 4) {
            int n9 = nArray[0] ^ this.c;
            n9 = n9 + (n9 >>> 9) + nArray[1];
            n9 = (n9 + (n9 >>> 15)) * 33 ^ nArray[2];
            int n10 = n9 + (n9 >>> 4);
            for (n9 = 3; n9 < n8; ++n9) {
                int n11 = nArray[n9];
                n10 += n11 ^ n11 >> 21;
            }
            n8 = n10 * 65599;
            n8 += n8 >>> 19;
            return n8 << 5 ^ n8;
        }
        throw new IllegalArgumentException("qlen is too short, needs to be at least 4");
    }

    public String toString() {
        int n8 = this.E();
        int n9 = this.H();
        int n10 = this.J();
        int n11 = this.I();
        int n12 = this.K();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", a.class.getName(), this.k, this.g, n8, n9, n10, n11, n8 + n9 + n10 + n11, n12);
    }

    public String w(int n8) {
        int n9;
        int[] nArray = this.f;
        int n10 = this.b(this.q(n8));
        int n11 = nArray[n10 + 3];
        if (n11 == 1) {
            if (nArray[n10] == n8) {
                return this.l[n10 >> 2];
            }
        } else if (n11 == 0) {
            return null;
        }
        if ((n9 = nArray[(n11 = this.h + (n10 >> 3 << 2)) + 3]) == 1) {
            if (nArray[n11] == n8) {
                return this.l[n11 >> 2];
            }
        } else if (n9 == 0) {
            return null;
        }
        return this.f(n10, n8);
    }

    public String x(int n8, int n9) {
        int n10;
        int[] nArray = this.f;
        int n11 = this.b(this.r(n8, n9));
        int n12 = nArray[n11 + 3];
        if (n12 == 2) {
            if (n8 == nArray[n11] && n9 == nArray[n11 + 1]) {
                return this.l[n11 >> 2];
            }
        } else if (n12 == 0) {
            return null;
        }
        if ((n10 = nArray[(n12 = this.h + (n11 >> 3 << 2)) + 3]) == 2) {
            if (n8 == nArray[n12] && n9 == nArray[n12 + 1]) {
                return this.l[n12 >> 2];
            }
        } else if (n10 == 0) {
            return null;
        }
        return this.g(n11, n8, n9);
    }

    public String y(int n8, int n9, int n10) {
        int n11;
        int[] nArray = this.f;
        int n12 = this.b(this.s(n8, n9, n10));
        int n13 = nArray[n12 + 3];
        if (n13 == 3) {
            if (n8 == nArray[n12] && nArray[n12 + 1] == n9 && nArray[n12 + 2] == n10) {
                return this.l[n12 >> 2];
            }
        } else if (n13 == 0) {
            return null;
        }
        if ((n11 = nArray[(n13 = this.h + (n12 >> 3 << 2)) + 3]) == 3) {
            if (n8 == nArray[n13] && nArray[n13 + 1] == n9 && nArray[n13 + 2] == n10) {
                return this.l[n13 >> 2];
            }
        } else if (n11 == 0) {
            return null;
        }
        return this.h(n12, n8, n9, n10);
    }

    public String z(int[] nArray, int n8) {
        if (n8 < 4) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return "";
                    }
                    return this.y(nArray[0], nArray[1], nArray[2]);
                }
                return this.x(nArray[0], nArray[1]);
            }
            return this.w(nArray[0]);
        }
        int n9 = this.t(nArray, n8);
        int n10 = this.b(n9);
        int[] nArray2 = this.f;
        int n11 = nArray2[n10 + 3];
        if (n9 == nArray2[n10] && n11 == n8 && this.m(nArray, n8, nArray2[n10 + 1])) {
            return this.l[n10 >> 2];
        }
        if (n11 == 0) {
            return null;
        }
        n11 = this.h + (n10 >> 3 << 2);
        int n12 = nArray2[n11 + 3];
        if (n9 == nArray2[n11] && n12 == n8 && this.m(nArray, n8, nArray2[n11 + 1])) {
            return this.l[n11 >> 2];
        }
        return this.i(n10, n9, nArray, n8);
    }

    private static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int[] d;
        public final String[] e;
        public final int f;
        public final int g;

        public a(int n8, int n9, int n10, int[] nArray, String[] stringArray, int n11, int n12) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = nArray;
            this.e = stringArray;
            this.f = n11;
            this.g = n12;
        }

        public a(a a8) {
            this.a = a8.g;
            this.b = a8.k;
            this.c = a8.j;
            this.d = a8.f;
            this.e = a8.l;
            this.f = a8.m;
            this.g = a8.n;
        }

        public static a a(int n8) {
            int n9 = n8 << 3;
            return new a(n8, 0, ax.a5.a.c(n8), new int[n9], new String[n8 << 1], n9 - n8, n9);
        }
    }
}

