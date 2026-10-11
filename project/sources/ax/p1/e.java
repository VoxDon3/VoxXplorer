package ax.p1;

import ax.S0.C0968a;

/* loaded from: classes.dex */
final class e {
    public final a a;
    public final a b;
    public final int c;
    public final boolean d;

    public static final class a {
        private final b[] a;

        public a(b... bVarArr) {
            this.a = bVarArr;
        }

        public b a(int i) {
            return this.a[i];
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

        public b(int i, float[] fArr, float[] fArr2, int i2) {
            this.a = i;
            C0968a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }

        public int a() {
            return this.c.length / 3;
        }
    }

    public e(a aVar, int i) {
        this(aVar, aVar, i);
    }

    public static e a(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        int i5 = i;
        C0968a.a(f > 0.0f);
        C0968a.a(i5 >= 1);
        C0968a.a(i2 >= 1);
        C0968a.a(f2 > 0.0f && f2 <= 180.0f);
        C0968a.a(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f4 = radians / i5;
        float f5 = radians2 / i2;
        int i6 = i2 + 1;
        int i7 = ((i6 * 2) + 2) * i5;
        float[] fArr = new float[i7 * 3];
        float[] fArr2 = new float[i7 * 2];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i5; i10 = i4) {
            float f6 = radians / 2.0f;
            float f7 = (i10 * f4) - f6;
            i4 = i10 + 1;
            float f8 = (i4 * f4) - f6;
            int i11 = 0;
            while (i11 < i6) {
                float f9 = radians;
                float f10 = radians2;
                int i12 = i9;
                int i13 = 0;
                while (i13 < 2) {
                    float f11 = i13 == 0 ? f7 : f8;
                    int i14 = i4;
                    float f12 = i11 * f5;
                    float f13 = f7;
                    float f14 = f8;
                    double d = f;
                    double d2 = (f12 + 3.1415927f) - (f10 / 2.0f);
                    double d3 = f11;
                    fArr[i8] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    fArr[i8 + 1] = (float) (d * Math.sin(d3));
                    int i15 = i8 + 3;
                    fArr[i8 + 2] = (float) (Math.cos(d2) * d * Math.cos(d3));
                    fArr2[i12] = f12 / f10;
                    int i16 = i12 + 2;
                    fArr2[i12 + 1] = ((i10 + i13) * f4) / f9;
                    if ((i11 == 0 && i13 == 0) || (i11 == i2 && i13 == 1)) {
                        System.arraycopy(fArr, i8, fArr, i15, 3);
                        i8 += 6;
                        System.arraycopy(fArr2, i12, fArr2, i16, 2);
                        i12 += 4;
                    } else {
                        i12 = i16;
                        i8 = i15;
                    }
                    i13++;
                    i4 = i14;
                    f7 = f13;
                    f8 = f14;
                }
                i11++;
                radians = f9;
                radians2 = f10;
                i9 = i12;
                f7 = f7;
                f8 = f8;
            }
            i5 = i;
        }
        return new e(new a(new b(0, fArr, fArr2, 1)), i3);
    }

    public static e b(int i) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public e(a aVar, a aVar2, int i) {
        this.a = aVar;
        this.b = aVar2;
        this.c = i;
        this.d = aVar == aVar2;
    }
}
