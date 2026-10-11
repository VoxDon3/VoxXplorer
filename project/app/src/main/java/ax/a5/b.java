/*
 * Decompiled with CFR 0.152.
 */
package ax.a5;

import ax.T4.e;
import ax.b5.f;
import ax.f1.i;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

public final class b {
    protected final b a;
    protected final AtomicReference<b> b;
    protected final int c;
    protected final int d;
    protected boolean e;
    protected String[] f;
    protected a[] g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected boolean l;
    protected BitSet m;

    private b(int n8) {
        this.a = null;
        this.c = n8;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.k = 0;
        this.b = new AtomicReference<b>(ax.a5.b$b.a(64));
    }

    private b(b stringArray, int n8, int n9, b b8) {
        this.a = stringArray;
        this.c = n9;
        this.b = null;
        this.d = n8;
        this.e = e.a.d0.l(n8);
        stringArray = b8.c;
        this.f = stringArray;
        this.g = b8.d;
        this.h = b8.a;
        this.k = b8.b;
        n8 = stringArray.length;
        this.i = ax.a5.b.f(n8);
        this.j = n8 - 1;
        this.l = true;
    }

    private String a(char[] object, int n8, int n9, int n10, int n11) throws IOException {
        if (this.l) {
            this.i();
            this.l = false;
        } else if (this.h >= this.i) {
            this.q();
            n11 = this.d(this.h((char[])object, n8, n9));
        }
        Object object2 = new String((char[])object, n8, n9);
        object = object2;
        if (e.a.c0.l(this.d)) {
            object = ax.b5.f.c0.a((String)object2);
        }
        ++this.h;
        object2 = this.f;
        if (object2[n11] == null) {
            object2[n11] = object;
            return object;
        }
        n9 = n11 >> 1;
        object2 = new a((String)object, this.g[n9]);
        n8 = object2.c;
        if (n8 > 150) {
            this.c(n9, (a)object2, n11);
            return object;
        }
        this.g[n9] = object2;
        this.k = Math.max(n8, this.k);
        return object;
    }

    private String b(char[] cArray, int n8, int n9, a a8) {
        while (a8 != null) {
            String string = a8.a(cArray, n8, n9);
            if (string != null) {
                return string;
            }
            a8 = a8.b;
        }
        return null;
    }

    private void c(int n8, a a8, int n9) throws IOException {
        BitSet bitSet = this.m;
        if (bitSet == null) {
            this.m = bitSet = new BitSet();
            bitSet.set(n8);
        } else if (bitSet.get(n8)) {
            if (e.a.e0.l(this.d)) {
                this.e(150);
            }
            this.e = false;
        } else {
            this.m.set(n8);
        }
        this.f[n9] = a8.a;
        this.g[n8] = null;
        this.h -= a8.c;
        this.k = -1;
    }

    private static int f(int n8) {
        return n8 - (n8 >> 2);
    }

    private void i() {
        Object[] objectArray = this.f;
        this.f = Arrays.copyOf(objectArray, objectArray.length);
        objectArray = this.g;
        this.g = (a[])Arrays.copyOf(objectArray, objectArray.length);
    }

    public static b j() {
        long l8 = System.currentTimeMillis();
        return ax.a5.b.k((int)l8 + (int)(l8 >>> 32) | 1);
    }

    protected static b k(int n8) {
        return new b(n8);
    }

    private void p(b b8) {
        int n8 = b8.a;
        b b9 = this.b.get();
        if (n8 == b9.a) {
            return;
        }
        if (n8 > 12000) {
            b8 = ax.a5.b$b.a(64);
        }
        ax.f1.i.a(this.b, b9, b8);
    }

    private void q() throws IOException {
        String[] stringArray;
        int n8;
        int n9;
        Object object;
        int n10;
        Object object2 = this.f;
        int n11 = ((String[])object2).length;
        int n12 = n11 + n11;
        if (n12 > 65536) {
            this.h = 0;
            this.e = false;
            this.f = new String[64];
            this.g = new a[32];
            this.j = 63;
            this.l = false;
            return;
        }
        a[] aArray = this.g;
        this.f = new String[n12];
        this.g = new a[n12 >> 1];
        this.j = n12 - 1;
        this.i = ax.a5.b.f(n12);
        int n13 = 0;
        n12 = 0;
        for (n10 = 0; n10 < n11; ++n10) {
            object = object2[n10];
            n9 = n13;
            n8 = n12;
            if (object != null) {
                n9 = n13 + 1;
                stringArray = this.f;
                n13 = this.d(this.g((String)object));
                if (stringArray[n13] == null) {
                    stringArray[n13] = object;
                    n8 = n12;
                } else {
                    this.g[n13 >>= 1] = object = new a((String)object, this.g[n13]);
                    n8 = Math.max(n12, ((a)object).c);
                }
            }
            n13 = n9;
            n12 = n8;
        }
        n9 = 0;
        n10 = n12;
        n8 = n13;
        for (n12 = n9; n12 < n11 >> 1; ++n12) {
            object2 = aArray[n12];
            n13 = n10;
            n10 = n8;
            while (object2 != null) {
                ++n10;
                stringArray = this.f;
                object = object2.a;
                n8 = this.d(this.g((String)object));
                if (stringArray[n8] == null) {
                    stringArray[n8] = object;
                } else {
                    this.g[n8 >>= 1] = object = new a((String)object, this.g[n8]);
                    n13 = Math.max(n13, ((a)object).c);
                }
                object2 = object2.b;
            }
            n8 = n10;
            n10 = n13;
        }
        this.k = n10;
        this.m = null;
        if (n8 == this.h) {
            return;
        }
        throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", this.h, n8));
    }

    public int d(int n8) {
        n8 += n8 >>> 15;
        n8 ^= n8 << 7;
        return n8 + (n8 >>> 3) & this.j;
    }

    protected void e(int n8) throws ax.V4.b {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Longest collision chain in symbol table (of size ");
        stringBuilder.append(this.h);
        stringBuilder.append(") now exceeds maximum, ");
        stringBuilder.append(n8);
        stringBuilder.append(" -- suspect a DoS attack based on hash collisions");
        throw new ax.V4.b(stringBuilder.toString());
    }

    public int g(String string) {
        int n8 = string.length();
        int n9 = this.c;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 33 + string.charAt(i8);
        }
        if (n9 == 0) {
            return 1;
        }
        return n9;
    }

    public int h(char[] cArray, int n8, int n9) {
        int n10 = this.c;
        for (int i8 = n8; i8 < n9 + n8; ++i8) {
            n10 = n10 * 33 + cArray[i8];
        }
        if (n10 == 0) {
            return 1;
        }
        return n10;
    }

    public String l(char[] cArray, int n8, int n9, int n10) throws IOException {
        if (n9 < 1) {
            return "";
        }
        if (!this.e) {
            return new String(cArray, n8, n9);
        }
        int n11 = this.d(n10);
        String string = this.f[n11];
        if (string != null) {
            a a8;
            if (string.length() == n9) {
                int n12 = 0;
                while (string.charAt(n12) == cArray[n8 + n12]) {
                    int n13;
                    n12 = n13 = n12 + 1;
                    if (n13 != n9) continue;
                    return string;
                }
            }
            if ((a8 = this.g[n11 >> 1]) != null) {
                string = a8.a(cArray, n8, n9);
                if (string != null) {
                    return string;
                }
                string = this.b(cArray, n8, n9, a8.b);
                if (string != null) {
                    return string;
                }
            }
        }
        return this.a(cArray, n8, n9, n10, n11);
    }

    public int m() {
        return this.c;
    }

    public b n(int n8) {
        return new b(this, n8, this.c, this.b.get());
    }

    public boolean o() {
        return this.l ^ true;
    }

    public void r() {
        b b8;
        if (this.o() && (b8 = this.a) != null && this.e) {
            b8.p(new b(this));
            this.l = true;
        }
    }

    static final class a {
        public final String a;
        public final a b;
        public final int c;

        public a(String string, a a8) {
            this.a = string;
            this.b = a8;
            int n8 = 1;
            if (a8 != null) {
                n8 = 1 + a8.c;
            }
            this.c = n8;
        }

        public String a(char[] cArray, int n8, int n9) {
            int n10;
            if (this.a.length() != n9) {
                return null;
            }
            int n11 = 0;
            do {
                if (this.a.charAt(n11) != cArray[n8 + n11]) {
                    return null;
                }
                n11 = n10 = n11 + 1;
            } while (n10 < n9);
            return this.a;
        }
    }

    private static final class b {
        final int a;
        final int b;
        final String[] c;
        final a[] d;

        public b(int n8, int n9, String[] stringArray, a[] aArray) {
            this.a = n8;
            this.b = n9;
            this.c = stringArray;
            this.d = aArray;
        }

        public b(b b8) {
            this.a = b8.h;
            this.b = b8.k;
            this.c = b8.f;
            this.d = b8.g;
        }

        public static b a(int n8) {
            return new b(0, 0, new String[n8], new a[n8 >> 1]);
        }
    }
}

