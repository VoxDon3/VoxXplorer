/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

final class e {
    public final a a;
    public final a b;
    public final int c;
    public final boolean d;

    public e(a a8, int n8) {
        this(a8, a8, n8);
    }

    public e(a a8, a a9, int n8) {
        this.a = a8;
        this.b = a9;
        this.c = n8;
        boolean bl = a8 == a9;
        this.d = bl;
    }

    public static e a(float f8, int n8, int n9, float f9, float f10, int n10) {
        boolean bl = f8 > 0.0f;
        ax.S0.a.a(bl);
        bl = n8 >= 1;
        ax.S0.a.a(bl);
        bl = n9 >= 1;
        ax.S0.a.a(bl);
        bl = f9 > 0.0f && f9 <= 180.0f;
        ax.S0.a.a(bl);
        bl = f10 > 0.0f && f10 <= 360.0f;
        ax.S0.a.a(bl);
        float f11 = (float)Math.toRadians(f9);
        float f12 = (float)Math.toRadians(f10);
        float f13 = f11 / (float)n8;
        float f14 = f12 / (float)n9;
        int n11 = n9 + 1;
        int n12 = (n11 * 2 + 2) * n8;
        float[] fArray = new float[n12 * 3];
        float[] fArray2 = new float[n12 * 2];
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        while (n13 < n8) {
            f10 = n13;
            f9 = f11 / 2.0f;
            f10 = f10 * f13 - f9;
            n12 = n13 + 1;
            f9 = (float)n12 * f13 - f9;
            for (int i8 = 0; i8 < n11; ++i8) {
                int n16;
                int n17 = n15;
                n15 = n14;
                n14 = n12;
                n12 = n17;
                for (n16 = 0; n16 < 2; ++n16) {
                    int n18;
                    block7: {
                        block6: {
                            float f15 = n16 == 0 ? f10 : f9;
                            float f16 = (float)i8 * f14;
                            float f17 = f12 / 2.0f;
                            double d8 = f8;
                            double d9 = f16 + (float)Math.PI - f17;
                            double d10 = Math.sin(d9);
                            double d11 = f15;
                            fArray[n15] = -((float)(d10 * d8 * Math.cos(d11)));
                            fArray[n15 + 1] = (float)(d8 * Math.sin(d11));
                            n17 = n15 + 3;
                            fArray[n15 + 2] = (float)(Math.cos(d9) * d8 * Math.cos(d11));
                            fArray2[n12] = f16 / f12;
                            n18 = n12 + 2;
                            fArray2[n12 + 1] = (float)(n13 + n16) * f13 / f11;
                            if (i8 == 0 && n16 == 0) break block6;
                            if (i8 != n9 || n16 != 1) break block7;
                        }
                        System.arraycopy(fArray, n15, fArray, n17, 3);
                        n15 += 6;
                        System.arraycopy(fArray2, n12, fArray2, n18, 2);
                        n12 += 4;
                        continue;
                    }
                    n12 = n18;
                    n15 = n17;
                }
                n16 = n12;
                n12 = n14;
                n14 = n15;
                n15 = n16;
            }
            n13 = n12;
        }
        return new e(new a(new b(0, fArray, fArray2, 1)), n10);
    }

    public static e b(int n8) {
        return e.a(50.0f, 36, 72, 180.0f, 360.0f, n8);
    }

    public static final class a {
        private final b[] a;

        public a(b ... bArray) {
            this.a = bArray;
        }

        public b a(int n8) {
            return this.a[n8];
        }

        public int b() {
            return this.a.length;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public b(int n8, float[] fArray, float[] fArray2, int n9) {
            this.a = n8;
            boolean bl = (long)fArray.length * 2L == (long)fArray2.length * 3L;
            ax.S0.a.a(bl);
            this.c = fArray;
            this.d = fArray2;
            this.b = n9;
        }

        public int a() {
            return this.c.length / 3;
        }
    }
}

