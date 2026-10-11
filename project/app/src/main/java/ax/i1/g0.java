/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import java.util.Arrays;
import java.util.Random;

public interface g0 {
    public g0 a(int var1, int var2);

    public int b();

    public int c(int var1);

    public int d(int var1);

    public g0 e(int var1, int var2);

    public int f();

    public g0 g();

    public int getLength();

    public static class a
    implements g0 {
        private final Random a;
        private final int[] b;
        private final int[] c;

        public a(int n8) {
            this(n8, new Random());
        }

        private a(int n8, Random random) {
            this(ax.i1.g0$a.h(n8, random), random);
        }

        private a(int[] nArray, Random random) {
            this.b = nArray;
            this.a = random;
            this.c = new int[nArray.length];
            for (int i8 = 0; i8 < nArray.length; ++i8) {
                this.c[nArray[i8]] = i8;
            }
        }

        private static int[] h(int n8, Random random) {
            int[] nArray = new int[n8];
            int n9 = 0;
            while (n9 < n8) {
                int n10 = n9 + 1;
                int n11 = random.nextInt(n10);
                nArray[n9] = nArray[n11];
                nArray[n11] = n9;
                n9 = n10;
            }
            return nArray;
        }

        @Override
        public g0 a(int n8, int n9) {
            int[] nArray;
            int n10 = n9 - n8;
            int[] nArray2 = new int[this.b.length - n10];
            int n11 = 0;
            for (int i8 = 0; i8 < (nArray = this.b).length; ++i8) {
                int n12 = nArray[i8];
                if (n12 >= n8 && n12 < n9) {
                    ++n11;
                    continue;
                }
                int n13 = n12;
                if (n12 >= n8) {
                    n13 = n12 - n10;
                }
                nArray2[i8 - n11] = n13;
            }
            return new a(nArray2, new Random(this.a.nextLong()));
        }

        @Override
        public int b() {
            int[] nArray = this.b;
            if (nArray.length > 0) {
                return nArray[0];
            }
            return -1;
        }

        @Override
        public int c(int n8) {
            if ((n8 = this.c[n8] - 1) >= 0) {
                return this.b[n8];
            }
            return -1;
        }

        @Override
        public int d(int n8) {
            int[] nArray = this.b;
            if ((n8 = this.c[n8] + 1) < nArray.length) {
                return nArray[n8];
            }
            return -1;
        }

        @Override
        public g0 e(int n8, int n9) {
            Object object;
            int n10;
            Object object2;
            int[] nArray = new int[n9];
            int[] nArray2 = new int[n9];
            int n11 = 0;
            int n12 = 0;
            while (n12 < n9) {
                nArray[n12] = this.a.nextInt(this.b.length + 1);
                object2 = this.a;
                n10 = n12 + 1;
                object = ((Random)object2).nextInt(n10);
                nArray2[n12] = nArray2[object];
                nArray2[object] = n12 + n8;
                n12 = n10;
            }
            Arrays.sort(nArray);
            int[] nArray3 = new int[this.b.length + n9];
            n10 = 0;
            n12 = 0;
            while (n11 < ((Object)(object2 = (Object)this.b)).length + n9) {
                if (n10 < n9 && n12 == nArray[n10]) {
                    nArray3[n11] = nArray2[n10];
                    ++n10;
                } else {
                    nArray3[n11] = object = (Object)object2[n12];
                    if (object >= n8) {
                        nArray3[n11] = object + n9;
                    }
                    ++n12;
                }
                ++n11;
            }
            return new a(nArray3, new Random(this.a.nextLong()));
        }

        @Override
        public int f() {
            int[] nArray = this.b;
            if (nArray.length > 0) {
                return nArray[nArray.length - 1];
            }
            return -1;
        }

        @Override
        public g0 g() {
            return new a(0, new Random(this.a.nextLong()));
        }

        @Override
        public int getLength() {
            return this.b.length;
        }
    }
}

