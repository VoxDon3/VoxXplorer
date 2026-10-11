/*
 * Decompiled with CFR 0.152.
 */
package ax.L3;

import android.graphics.Bitmap;
import android.util.Log;
import ax.L3.a;
import ax.L3.b;
import ax.L3.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

public class e
implements a {
    private static final String w = "e";
    private int[] a;
    private final int[] b = new int[256];
    private ByteBuffer c;
    private byte[] d;
    private byte[] e;
    private int f = 0;
    private int g = 0;
    private short[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private int[] l;
    private int m;
    private c n;
    private a.a o;
    private Bitmap p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;

    public e(a.a a8) {
        this.o = a8;
        this.n = new c();
    }

    public e(a.a a8, c c8, ByteBuffer byteBuffer, int n8) {
        this(a8);
        this.q(c8, byteBuffer, n8);
    }

    private int a(int n8, int n9, int n10) {
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        byte[] byArray;
        int n16;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        for (n16 = n8; n16 < this.s + n8 && n16 < (byArray = this.k).length && n16 < n9; ++n16) {
            n15 = byArray[n16];
            int n22 = this.a[n15 & 0xFF];
            n14 = n17;
            n13 = n18;
            n12 = n19;
            n11 = n20;
            n15 = n21;
            if (n22 != 0) {
                n14 = n17 + (n22 >> 24 & 0xFF);
                n13 = n18 + (n22 >> 16 & 0xFF);
                n12 = n19 + (n22 >> 8 & 0xFF);
                n11 = n20 + (n22 & 0xFF);
                n15 = n21 + 1;
            }
            n17 = n14;
            n18 = n13;
            n19 = n12;
            n20 = n11;
            n21 = n15;
        }
        n16 = n18;
        n15 = n17;
        for (n8 = n13 = n8 + n10; n8 < this.s + n13 && n8 < (byArray = this.k).length && n8 < n9; ++n8) {
            n10 = byArray[n8];
            n14 = this.a[n10 & 0xFF];
            n12 = n15;
            n11 = n16;
            n17 = n19;
            n18 = n20;
            n10 = n21;
            if (n14 != 0) {
                n12 = n15 + (n14 >> 24 & 0xFF);
                n11 = n16 + (n14 >> 16 & 0xFF);
                n17 = n19 + (n14 >> 8 & 0xFF);
                n18 = n20 + (n14 & 0xFF);
                n10 = n21 + 1;
            }
            n15 = n12;
            n16 = n11;
            n19 = n17;
            n20 = n18;
            n21 = n10;
        }
        if (n21 == 0) {
            return 0;
        }
        return n15 / n21 << 24 | n16 / n21 << 16 | n19 / n21 << 8 | n20 / n21;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void k(b object) {
        int n8;
        int n9;
        this.f = 0;
        this.g = 0;
        if (object != null) {
            this.c.position(((b)object).j);
        }
        if (object == null) {
            object = this.n;
            n9 = ((c)object).f;
            n8 = ((c)object).g;
        } else {
            n9 = ((b)object).c;
            n8 = ((b)object).d;
        }
        int n10 = n9 * n8;
        object = this.k;
        if (object == null || ((Object)object).length < n10) {
            this.k = this.o.e(n10);
        }
        if (this.h == null) {
            this.h = new short[4096];
        }
        if (this.i == null) {
            this.i = new byte[4096];
        }
        if (this.j == null) {
            this.j = new byte[4097];
        }
        n8 = this.o();
        int n11 = 1 << n8;
        int n12 = n11 + 2;
        int n13 = n8 + 1;
        int n14 = (1 << n13) - 1;
        for (n8 = 0; n8 < n11; ++n8) {
            this.h[n8] = 0;
            this.i[n8] = (byte)n8;
        }
        int n15 = -1;
        int n16 = n13;
        int n17 = n12;
        int n18 = n14;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        int n23 = 0;
        int n24 = 0;
        n8 = -1;
        n9 = 0;
        int n25 = 0;
        block1: while (true) {
            int n26;
            int n27;
            int n28;
            int n29;
            block23: {
                block20: {
                    block21: {
                        block22: {
                            if (n19 >= n10) break block20;
                            n29 = n20;
                            if (n20 != 0) break block21;
                            n29 = this.n();
                            if (n29 > 0) break block22;
                            this.r = 3;
                            break block20;
                        }
                        n21 = 0;
                    }
                    n23 += (this.d[n21] & 0xFF) << n22;
                    n20 = n22 + 8;
                    n28 = n21 + 1;
                    n27 = n29 + n15;
                    n21 = n17;
                    n22 = n9;
                    n17 = n8;
                    n29 = n20;
                    n20 = n19;
                    n8 = n21;
                    n9 = n16;
                    n16 = n13;
                    break block23;
                }
                n8 = n24;
                while (true) {
                    if (n8 >= n10) {
                        return;
                    }
                    this.k[n8] = 0;
                    ++n8;
                }
            }
            while (n29 >= n9) {
                block28: {
                    byte[] byArray;
                    block31: {
                        block29: {
                            block30: {
                                byte by;
                                block27: {
                                    block26: {
                                        block25: {
                                            block24: {
                                                n13 = n23 & n18;
                                                n23 >>= n9;
                                                n29 -= n9;
                                                if (n13 == n11) {
                                                    n9 = n16;
                                                    n8 = n12;
                                                    n18 = n14;
                                                    n15 = -1;
                                                    n17 = -1;
                                                    continue;
                                                }
                                                if (n13 <= n8) break block24;
                                                this.r = 3;
                                                break block25;
                                            }
                                            if (n13 != n11 + 1) break block26;
                                        }
                                        int n30 = n8;
                                        n8 = n17;
                                        n26 = n22;
                                        n15 = -1;
                                        n13 = n16;
                                        n19 = n20;
                                        n20 = n27;
                                        n21 = n28;
                                        n22 = n29;
                                        n17 = n30;
                                        n16 = n9;
                                        n9 = n26;
                                        continue block1;
                                    }
                                    if (n17 != -1) break block27;
                                    this.j[n25] = this.i[n13];
                                    n22 = n13;
                                    ++n25;
                                    break block28;
                                }
                                if (n13 >= n8) {
                                    this.j[n25] = (byte)n22;
                                    n22 = n17;
                                    ++n25;
                                } else {
                                    n22 = n13;
                                }
                                while (n22 >= n11) {
                                    this.j[n25] = this.i[n22];
                                    n22 = this.h[n22];
                                    ++n25;
                                }
                                object = this.i;
                                n15 = object[n22] & 0xFF;
                                byArray = this.j;
                                n21 = n25 + 1;
                                byArray[n25] = by = (byte)n15;
                                n22 = n8;
                                if (n8 >= 4096) break block29;
                                this.h[n8] = (short)n17;
                                object[n8] = by;
                                if ((++n8 & n18) != 0) break block30;
                                n22 = n8;
                                if (n8 >= 4096) break block29;
                                ++n9;
                                n18 += n8;
                                n17 = n21;
                                break block31;
                            }
                            n22 = n8;
                        }
                        n17 = n21;
                        n8 = n22;
                    }
                    while (n17 > 0) {
                        object = this.k;
                        byArray = this.j;
                        object[n24] = byArray[--n17];
                        ++n20;
                        ++n24;
                    }
                    n22 = n15;
                    n25 = n17;
                }
                n17 = n13;
                n15 = -1;
            }
            n26 = n22;
            n13 = n16;
            n16 = n9;
            n9 = n17;
            n19 = n20;
            n20 = n27;
            n21 = n28;
            n22 = n29;
            n17 = n8;
            n8 = n9;
            n9 = n26;
        }
    }

    private Bitmap m() {
        Bitmap.Config config = this.v ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        config = this.o.a(this.u, this.t, config);
        config.setHasAlpha(true);
        return config;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int n() {
        int n8 = this.o();
        if (n8 > 0) {
            Exception exception2;
            block8: {
                try {
                    if (this.d == null) {
                        this.d = this.o.e(255);
                    }
                    int n9 = this.f;
                    int n10 = this.g;
                    if ((n9 -= n10) >= n8) {
                        System.arraycopy(this.e, n10, this.d, 0, n8);
                        this.g += n8;
                        return n8;
                    }
                    if (this.c.remaining() + n9 >= n8) {
                        System.arraycopy(this.e, this.g, this.d, 0, n9);
                        this.g = this.f;
                        this.p();
                        n10 = n8 - n9;
                        System.arraycopy(this.e, 0, this.d, n9, n10);
                        this.g += n10;
                        return n8;
                    }
                }
                catch (Exception exception2) {
                    break block8;
                }
                this.r = 1;
                return n8;
            }
            Log.w((String)w, (String)"Error Reading Block", (Throwable)exception2);
            this.r = 1;
        }
        return n8;
    }

    private int o() {
        int n8;
        byte[] byArray;
        try {
            this.p();
            byArray = this.e;
            n8 = this.g;
            this.g = n8 + 1;
        }
        catch (Exception exception) {
            this.r = 1;
            return 0;
        }
        n8 = byArray[n8];
        return n8 & 0xFF;
    }

    private void p() {
        int n8;
        if (this.f > this.g) {
            return;
        }
        if (this.e == null) {
            this.e = this.o.e(16384);
        }
        this.g = 0;
        this.f = n8 = Math.min(this.c.remaining(), 16384);
        this.c.get(this.e, 0, n8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private Bitmap r(b b8, b object) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int[] nArray;
        block20: {
            block23: {
                block24: {
                    block22: {
                        block21: {
                            nArray = this.l;
                            n15 = 0;
                            if (object == null) {
                                Arrays.fill(nArray, 0);
                            }
                            if (object == null || (n14 = ((b)object).g) <= 0) break block20;
                            if (n14 == 2) break block21;
                            if (n14 == 3 && (object = this.p) != null) {
                                n14 = this.u;
                                object.getPixels(nArray, 0, n14, 0, 0, n14, this.t);
                            }
                            break block20;
                        }
                        if (b8.f) break block22;
                        c c8 = this.n;
                        n13 = n14 = c8.l;
                        if (b8.k == null) break block23;
                        n13 = n14;
                        if (c8.j != b8.h) break block23;
                        break block24;
                    }
                    if (this.m == 0) {
                        this.v = true;
                    }
                }
                n13 = 0;
            }
            n14 = ((b)object).d;
            n12 = this.s;
            n11 = n14 / n12;
            n14 = ((b)object).b / n12;
            n10 = ((b)object).c / n12;
            n12 = ((b)object).a / n12;
            n9 = this.u;
            for (n14 = n8 = n14 * n9 + n12; n14 < n11 * n9 + n8; n14 += this.u) {
                for (n12 = n14; n12 < n14 + n10; ++n12) {
                    nArray[n12] = n13;
                }
            }
        }
        object = nArray;
        this.k(b8);
        n13 = b8.d;
        n14 = this.s;
        n13 /= n14;
        int n16 = b8.b / n14;
        int n17 = b8.c / n14;
        int n18 = b8.a / n14;
        boolean bl = this.m == 0;
        n10 = 8;
        n12 = 0;
        n11 = 1;
        while (true) {
            Object var19_6;
            block29: {
                int n19;
                int n20;
                block30: {
                    block25: {
                        block28: {
                            block26: {
                                block19: {
                                    block27: {
                                        if (n15 >= n13) break block25;
                                        if (!b8.e) break block26;
                                        n8 = n10;
                                        n14 = n12;
                                        n9 = n11;
                                        if (n12 < n13) break block19;
                                        n9 = n11 + 1;
                                        if (n9 == 2) break block27;
                                        if (n9 != 3) {
                                            if (n9 != 4) {
                                                n8 = n10;
                                                n14 = n12;
                                                break block19;
                                            } else {
                                                n8 = 2;
                                                n14 = 1;
                                            }
                                            break block19;
                                        } else {
                                            n8 = 4;
                                            n14 = 2;
                                        }
                                        break block19;
                                    }
                                    n14 = 4;
                                    n8 = n10;
                                }
                                n10 = n14 + n8;
                                n12 = n14;
                                n11 = n9;
                                n14 = n10;
                                break block28;
                            }
                            n14 = n12;
                            n12 = n15;
                            n8 = n10;
                        }
                        n10 = n12 + n16;
                        Object object2 = object;
                        n12 = n13;
                        if (n10 >= this.t) break block29;
                        n9 = this.u;
                        n20 = n10 * n9;
                        n19 = n20 + n18;
                        n10 = n12 = n19 + n17;
                        if (n20 + n9 < n12) {
                            n10 = n20 + n9;
                        }
                        break block30;
                    }
                    if (this.q && ((n14 = b8.g) == 0 || n14 == 1)) {
                        if (this.p == null) {
                            this.p = this.m();
                        }
                        b8 = this.p;
                        n14 = this.u;
                        b8.setPixels((int[])object, 0, n14, 0, 0, n14, this.t);
                    }
                    b8 = this.m();
                    n14 = this.u;
                    b8.setPixels((int[])object, 0, n14, 0, 0, n14, this.t);
                    return b8;
                }
                int n21 = this.s;
                n20 = n15 * n21 * b8.c;
                n9 = n19;
                n12 = n20;
                while (true) {
                    int n22 = n12;
                    Object object3 = object;
                    n12 = n13;
                    if (n9 >= n10) break;
                    if (this.s == 1) {
                        n12 = this.k[n22];
                        n12 = this.a[n12 & 0xFF];
                    } else {
                        n12 = this.a(n22, (n10 - n19) * n21 + n20, b8.c);
                    }
                    if (n12 != 0) {
                        object[n9] = n12;
                    } else if (!this.v && bl) {
                        this.v = true;
                    }
                    n12 = n22 + this.s;
                    ++n9;
                }
            }
            ++n15;
            object = var19_6;
            n13 = n12;
            n10 = n8;
            n12 = n14;
        }
    }

    @Override
    public ByteBuffer b() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Bitmap c() {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                int n8;
                Object object;
                Object object2;
                block8: {
                    try {
                        if (this.n.c > 0 && this.m >= 0) break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    object2 = w;
                    if (Log.isLoggable((String)object2, (int)3)) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unable to decode frame, frameCount=");
                        ((StringBuilder)object).append(this.n.c);
                        ((StringBuilder)object).append(", framePointer=");
                        ((StringBuilder)object).append(this.m);
                        Log.d((String)object2, (String)((StringBuilder)object).toString());
                    }
                    this.r = 1;
                }
                if ((n8 = this.r) != 1 && n8 != 2) {
                    this.r = 0;
                    b b8 = this.n.e.get(this.m);
                    n8 = this.m - 1;
                    object = n8 >= 0 ? this.n.e.get(n8) : null;
                    object2 = b8.k;
                    if (object2 == null) {
                        object2 = this.n.a;
                    }
                    this.a = (int[])object2;
                    if (object2 == null) {
                        object = w;
                        if (Log.isLoggable((String)object, (int)3)) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("No valid color table found for frame #");
                            ((StringBuilder)object2).append(this.m);
                            Log.d((String)object, (String)((StringBuilder)object2).toString());
                        }
                        this.r = 1;
                        return null;
                    }
                    if (!b8.f) return this.r(b8, (b)object);
                    System.arraycopy(object2, 0, this.b, 0, ((Object)object2).length);
                    object2 = this.b;
                    this.a = (int[])object2;
                    object2[b8.h] = false;
                    return this.r(b8, (b)object);
                }
                object = w;
                if (!Log.isLoggable((String)object, (int)3)) return null;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Unable to decode frame, status=");
                ((StringBuilder)object2).append(this.r);
                Log.d((String)object, (String)((StringBuilder)object2).toString());
                return null;
            }
            throw throwable2;
        }
    }

    @Override
    public void clear() {
        this.n = null;
        Object object = this.k;
        if (object != null) {
            this.o.d((byte[])object);
        }
        if ((object = (Object)this.l) != null) {
            this.o.f((int[])object);
        }
        if ((object = (Object)this.p) != null) {
            this.o.c((Bitmap)object);
        }
        this.p = null;
        this.c = null;
        this.v = false;
        object = this.d;
        if (object != null) {
            this.o.d((byte[])object);
        }
        if ((object = this.e) != null) {
            this.o.d((byte[])object);
        }
    }

    @Override
    public void d() {
        this.m = (this.m + 1) % this.n.c;
    }

    @Override
    public int e() {
        return this.n.c;
    }

    @Override
    public int f() {
        int n8;
        if (this.n.c > 0 && (n8 = this.m) >= 0) {
            return this.l(n8);
        }
        return 0;
    }

    @Override
    public void g() {
        this.m = -1;
    }

    @Override
    public int h() {
        return this.m;
    }

    @Override
    public int i() {
        return this.c.limit() + this.k.length + this.l.length * 4;
    }

    @Override
    public int j() {
        int n8 = this.n.m;
        if (n8 == -1) {
            return 1;
        }
        if (n8 == 0) {
            return 0;
        }
        return n8 + 1;
    }

    public int l(int n8) {
        if (n8 >= 0) {
            c c8 = this.n;
            if (n8 < c8.c) {
                return c8.e.get((int)n8).i;
            }
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q(c object, ByteBuffer iterator, int n8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                if (n8 > 0) {
                    try {
                        n8 = Integer.highestOneBit(n8);
                        this.r = 0;
                        this.n = object;
                        this.v = false;
                        this.m = -1;
                        iterator = ((ByteBuffer)((Object)iterator)).asReadOnlyBuffer();
                        this.c = iterator;
                        ((ByteBuffer)((Object)iterator)).position(0);
                        this.c.order(ByteOrder.LITTLE_ENDIAN);
                        this.q = false;
                        iterator = ((c)object).e.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().g != 3) continue;
                            this.q = true;
                            break;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    this.s = n8;
                    int n9 = ((c)object).f;
                    this.u = n9 / n8;
                    int n10 = ((c)object).g;
                    this.t = n10 / n8;
                    this.k = this.o.e(n9 * n10);
                    this.l = this.o.b(this.u * this.t);
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Sample size must be >=0, not: ");
                ((StringBuilder)object).append(n8);
                iterator = new Iterator<b>(((StringBuilder)object).toString());
                throw iterator;
            }
            throw throwable2;
        }
    }
}

