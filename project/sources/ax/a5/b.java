package ax.a5;

import ax.T4.e;
import ax.b5.f;
import ax.f1.C2015i;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b {
    protected final b a;
    protected final AtomicReference<C0253b> b;
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

    static final class a {
        public final String a;
        public final a b;
        public final int c;

        public a(String str, a aVar) {
            this.a = str;
            this.b = aVar;
            this.c = aVar != null ? 1 + aVar.c : 1;
        }

        public String a(char[] cArr, int i, int i2) {
            if (this.a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.a;
                }
            }
            return null;
        }
    }

    private b(int i) {
        this.a = null;
        this.c = i;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.k = 0;
        this.b = new AtomicReference<>(C0253b.a(64));
    }

    private String a(char[] cArr, int i, int i2, int i3, int i4) throws IOException {
        if (this.l) {
            i();
            this.l = false;
        } else if (this.h >= this.i) {
            q();
            i4 = d(h(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (e.a.INTERN_FIELD_NAMES.l(this.d)) {
            str = f.c0.a(str);
        }
        this.h++;
        String[] strArr = this.f;
        if (strArr[i4] == null) {
            strArr[i4] = str;
            return str;
        }
        int i5 = i4 >> 1;
        a aVar = new a(str, this.g[i5]);
        int i6 = aVar.c;
        if (i6 > 150) {
            c(i5, aVar, i4);
            return str;
        }
        this.g[i5] = aVar;
        this.k = Math.max(i6, this.k);
        return str;
    }

    private String b(char[] cArr, int i, int i2, a aVar) {
        while (aVar != null) {
            String a2 = aVar.a(cArr, i, i2);
            if (a2 != null) {
                return a2;
            }
            aVar = aVar.b;
        }
        return null;
    }

    private void c(int i, a aVar, int i2) throws IOException {
        BitSet bitSet = this.m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.m = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (e.a.FAIL_ON_SYMBOL_HASH_OVERFLOW.l(this.d)) {
                e(150);
            }
            this.e = false;
        } else {
            this.m.set(i);
        }
        this.f[i2] = aVar.a;
        this.g[i] = null;
        this.h -= aVar.c;
        this.k = -1;
    }

    private static int f(int i) {
        return i - (i >> 2);
    }

    private void i() {
        String[] strArr = this.f;
        this.f = (String[]) Arrays.copyOf(strArr, strArr.length);
        a[] aVarArr = this.g;
        this.g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    public static b j() {
        long currentTimeMillis = System.currentTimeMillis();
        return k((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static b k(int i) {
        return new b(i);
    }

    private void p(C0253b c0253b) {
        int i = c0253b.a;
        C0253b c0253b2 = this.b.get();
        if (i == c0253b2.a) {
            return;
        }
        if (i > 12000) {
            c0253b = C0253b.a(64);
        }
        C2015i.a(this.b, c0253b2, c0253b);
    }

    private void q() throws IOException {
        String[] strArr = this.f;
        int length = strArr.length;
        int i = length + length;
        if (i > 65536) {
            this.h = 0;
            this.e = false;
            this.f = new String[64];
            this.g = new a[32];
            this.j = 63;
            this.l = false;
            return;
        }
        a[] aVarArr = this.g;
        this.f = new String[i];
        this.g = new a[i >> 1];
        this.j = i - 1;
        this.i = f(i);
        int i2 = 0;
        int i3 = 0;
        for (String str : strArr) {
            if (str != null) {
                i2++;
                int d = d(g(str));
                String[] strArr2 = this.f;
                if (strArr2[d] == null) {
                    strArr2[d] = str;
                } else {
                    int i4 = d >> 1;
                    a aVar = new a(str, this.g[i4]);
                    this.g[i4] = aVar;
                    i3 = Math.max(i3, aVar.c);
                }
            }
        }
        int i5 = length >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            for (a aVar2 = aVarArr[i6]; aVar2 != null; aVar2 = aVar2.b) {
                i2++;
                String str2 = aVar2.a;
                int d2 = d(g(str2));
                String[] strArr3 = this.f;
                if (strArr3[d2] == null) {
                    strArr3[d2] = str2;
                } else {
                    int i7 = d2 >> 1;
                    a aVar3 = new a(str2, this.g[i7]);
                    this.g[i7] = aVar3;
                    i3 = Math.max(i3, aVar3.c);
                }
            }
        }
        this.k = i3;
        this.m = null;
        if (i2 != this.h) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.h), Integer.valueOf(i2)));
        }
    }

    public int d(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.j;
    }

    protected void e(int i) throws ax.V4.b {
        throw new ax.V4.b("Longest collision chain in symbol table (of size " + this.h + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    public int g(String str) {
        int length = str.length();
        int i = this.c;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public int h(char[] cArr, int i, int i2) {
        int i3 = this.c;
        int i4 = i2 + i;
        while (i < i4) {
            i3 = (i3 * 33) + cArr[i];
            i++;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public String l(char[] cArr, int i, int i2, int i3) throws IOException {
        if (i2 < 1) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!this.e) {
            return new String(cArr, i, i2);
        }
        int d = d(i3);
        String str = this.f[d];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            a aVar = this.g[d >> 1];
            if (aVar != null) {
                String a2 = aVar.a(cArr, i, i2);
                if (a2 != null) {
                    return a2;
                }
                String b = b(cArr, i, i2, aVar.b);
                if (b != null) {
                    return b;
                }
            }
        }
        return a(cArr, i, i2, i3, d);
    }

    public int m() {
        return this.c;
    }

    public b n(int i) {
        return new b(this, i, this.c, this.b.get());
    }

    public boolean o() {
        return !this.l;
    }

    public void r() {
        b bVar;
        if (o() && (bVar = this.a) != null && this.e) {
            bVar.p(new C0253b(this));
            this.l = true;
        }
    }

    /* renamed from: ax.a5.b$b, reason: collision with other inner class name */
    private static final class C0253b {
        final int a;
        final int b;
        final String[] c;
        final a[] d;

        public C0253b(int i, int i2, String[] strArr, a[] aVarArr) {
            this.a = i;
            this.b = i2;
            this.c = strArr;
            this.d = aVarArr;
        }

        public static C0253b a(int i) {
            return new C0253b(0, 0, new String[i], new a[i >> 1]);
        }

        public C0253b(b bVar) {
            this.a = bVar.h;
            this.b = bVar.k;
            this.c = bVar.f;
            this.d = bVar.g;
        }
    }

    private b(b bVar, int i, int i2, C0253b c0253b) {
        this.a = bVar;
        this.c = i2;
        this.b = null;
        this.d = i;
        this.e = e.a.CANONICALIZE_FIELD_NAMES.l(i);
        String[] strArr = c0253b.c;
        this.f = strArr;
        this.g = c0253b.d;
        this.h = c0253b.a;
        this.k = c0253b.b;
        int length = strArr.length;
        this.i = f(length);
        this.j = length - 1;
        this.l = true;
    }
}
