/*
 * Decompiled with CFR 0.152.
 */
package ax.he;

import ax.he.g;
import java.lang.reflect.Array;

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

    a(int n8) {
        Class<Short> clazz = Short.TYPE;
        this.d = (short[][])Array.newInstance(clazz, 12, 16);
        this.e = new short[12];
        this.f = new short[12];
        this.g = new short[12];
        this.h = new short[12];
        this.i = (short[][])Array.newInstance(clazz, 12, 16);
        this.j = (short[][])Array.newInstance(clazz, 4, 64);
        this.k = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.l = new short[16];
        this.a = (1 << n8) - 1;
    }

    static final int a(int n8) {
        if (n8 < 6) {
            return n8 - 2;
        }
        return 3;
    }

    void b() {
        int n8;
        Object object = this.b;
        int n9 = 0;
        object[0] = 0;
        object[1] = 0;
        object[2] = 0;
        object[3] = 0;
        this.c.c();
        for (n8 = 0; n8 < ((int[])(object = (Object)this.d)).length; ++n8) {
            ax.ie.a.a((short[])object[n8]);
        }
        ax.ie.a.a(this.e);
        ax.ie.a.a(this.f);
        ax.ie.a.a(this.g);
        ax.ie.a.a(this.h);
        for (n8 = 0; n8 < ((int[])(object = (Object)this.i)).length; ++n8) {
            ax.ie.a.a((short[])object[n8]);
        }
        n8 = 0;
        while (true) {
            object = this.j;
            if (n8 >= ((int[])object).length) break;
            ax.ie.a.a((short[])object[n8]);
            ++n8;
        }
        for (int i8 = n9; i8 < ((int[])(object = (Object)this.k)).length; ++i8) {
            ax.ie.a.a((short[])object[i8]);
        }
        ax.ie.a.a(this.l);
    }

    abstract class a {
        final short[] a;
        final short[][] b;
        final short[][] c;
        final short[] d;
        final a e;

        a(a object) {
            this.e = object;
            this.a = new short[2];
            object = Short.TYPE;
            this.b = (short[][])Array.newInstance(object, new int[]{16, 8});
            this.c = (short[][])Array.newInstance(object, new int[]{16, 8});
            this.d = new short[256];
        }

        void a() {
            ax.ie.a.a(this.a);
            int n8 = 0;
            int n9 = 0;
            while (true) {
                short[][] sArray = this.b;
                if (n9 >= sArray.length) break;
                ax.ie.a.a(sArray[n9]);
                ++n9;
            }
            for (int i8 = n8; i8 < this.b.length; ++i8) {
                ax.ie.a.a(this.c[i8]);
            }
            ax.ie.a.a(this.d);
        }
    }

    abstract class b {
        private final int a;
        private final int b;
        final ax.he.a c;

        b(ax.he.a a8, int n8, int n9) {
            this.c = a8;
            this.a = n8;
            this.b = (1 << n9) - 1;
        }

        final int a(int n8, int n9) {
            int n10 = this.a;
            return (n8 >> 8 - n10) + ((n9 & this.b) << n10);
        }

        abstract class a {
            final short[] a;
            final b b;

            a(b b8) {
                this.b = b8;
                this.a = new short[768];
            }

            void a() {
                ax.ie.a.a(this.a);
            }
        }
    }
}

