package ax.he;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
abstract class a {
    final int a;
    final int[] b = new int[4];
    final g c = new g();
    final short[][] d;
    final short[] e;
    final short[] f;
    final short[] g;
    final short[] h;
    final short[][] i;
    final short[][] j;
    final short[][] k;
    final short[] l;

    /* renamed from: ax.he.a$a, reason: collision with other inner class name */
    abstract class AbstractC0326a {
        final short[] a = new short[2];
        final short[][] b;
        final short[][] c;
        final short[] d;

        AbstractC0326a() {
            Class cls = Short.TYPE;
            this.b = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
            this.c = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
            this.d = new short[256];
        }

        void a() {
            ax.ie.a.a(this.a);
            int i = 0;
            while (true) {
                short[][] sArr = this.b;
                if (i >= sArr.length) {
                    break;
                }
                ax.ie.a.a(sArr[i]);
                i++;
            }
            for (int i2 = 0; i2 < this.b.length; i2++) {
                ax.ie.a.a(this.c[i2]);
            }
            ax.ie.a.a(this.d);
        }
    }

    abstract class b {
        private final int a;
        private final int b;

        /* renamed from: ax.he.a$b$a, reason: collision with other inner class name */
        abstract class AbstractC0327a {
            final short[] a = new short[768];

            AbstractC0327a() {
            }

            void a() {
                ax.ie.a.a(this.a);
            }
        }

        b(int i, int i2) {
            this.a = i;
            this.b = (1 << i2) - 1;
        }

        final int a(int i, int i2) {
            int i3 = this.a;
            return (i >> (8 - i3)) + ((i2 & this.b) << i3);
        }
    }

    a(int i) {
        Class cls = Short.TYPE;
        this.d = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.e = new short[12];
        this.f = new short[12];
        this.g = new short[12];
        this.h = new short[12];
        this.i = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.j = (short[][]) Array.newInstance((Class<?>) cls, 4, 64);
        this.k = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.l = new short[16];
        this.a = (1 << i) - 1;
    }

    static final int a(int i) {
        if (i < 6) {
            return i - 2;
        }
        return 3;
    }

    void b() {
        int[] iArr = this.b;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.c.c();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.d;
            if (i2 >= sArr.length) {
                break;
            }
            ax.ie.a.a(sArr[i2]);
            i2++;
        }
        ax.ie.a.a(this.e);
        ax.ie.a.a(this.f);
        ax.ie.a.a(this.g);
        ax.ie.a.a(this.h);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.i;
            if (i3 >= sArr2.length) {
                break;
            }
            ax.ie.a.a(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.j;
            if (i4 >= sArr3.length) {
                break;
            }
            ax.ie.a.a(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.k;
            if (i >= sArr4.length) {
                ax.ie.a.a(this.l);
                return;
            } else {
                ax.ie.a.a(sArr4[i]);
                i++;
            }
        }
    }
}
