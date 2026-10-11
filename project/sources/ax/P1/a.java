package ax.P1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.C0987u;
import ax.S0.F;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import ax.r7.AbstractC2991z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements t {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint a;
    private final Paint b;
    private final Canvas c;
    private final b d;
    private final C0167a e;
    private final h f;
    private Bitmap g;

    /* renamed from: ax.P1.a$a, reason: collision with other inner class name */
    private static final class C0167a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public C0167a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    private static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    private static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray<e> d;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    private static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    private static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray<g> k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<g> sparseArray) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    private static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<C0167a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<C0167a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public b h;
        public d i;

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public a(List<byte[]> list) {
        G g2 = new G(list.get(0));
        int U = g2.U();
        int U2 = g2.U();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new C0167a(0, f(), g(), h());
        this.f = new h(U, U2);
    }

    private static byte[] e(int i2, int i3, F f2) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) f2.h(i3);
        }
        return bArr;
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = i(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = i(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = i(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = i(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = i(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = i(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = i(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int i(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[LOOP:0: B:2:0x0002->B:13:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int j(ax.S0.F r9, int[] r10, byte[] r11, int r12, int r13, android.graphics.Paint r14, android.graphics.Canvas r15) {
        /*
            r6 = 0
            r0 = 0
        L2:
            r1 = 2
            int r2 = r9.h(r1)
            r3 = 1
            if (r2 == 0) goto Ld
            r7 = r0
        Lb:
            r8 = 1
            goto L5a
        Ld:
            boolean r2 = r9.g()
            r4 = 3
            if (r2 == 0) goto L21
            int r2 = r9.h(r4)
            int r2 = r2 + r4
            int r1 = r9.h(r1)
        L1d:
            r7 = r0
            r8 = r2
            r2 = r1
            goto L5a
        L21:
            boolean r2 = r9.g()
            if (r2 == 0) goto L2a
            r7 = r0
            r2 = 0
            goto Lb
        L2a:
            int r2 = r9.h(r1)
            if (r2 == 0) goto L57
            if (r2 == r3) goto L53
            if (r2 == r1) goto L47
            if (r2 == r4) goto L3a
            r7 = r0
            r2 = 0
        L38:
            r8 = 0
            goto L5a
        L3a:
            r2 = 8
            int r2 = r9.h(r2)
            int r2 = r2 + 29
            int r1 = r9.h(r1)
            goto L1d
        L47:
            r2 = 4
            int r2 = r9.h(r2)
            int r2 = r2 + 12
            int r1 = r9.h(r1)
            goto L1d
        L53:
            r7 = r0
            r2 = 0
            r8 = 2
            goto L5a
        L57:
            r2 = 0
            r7 = 1
            goto L38
        L5a:
            if (r8 == 0) goto L74
            if (r14 == 0) goto L74
            if (r11 == 0) goto L62
            r2 = r11[r2]
        L62:
            r0 = r10[r2]
            r14.setColor(r0)
            float r1 = (float) r12
            float r2 = (float) r13
            int r0 = r12 + r8
            float r0 = (float) r0
            int r3 = r3 + r13
            float r4 = (float) r3
            r5 = r14
            r3 = r0
            r0 = r15
            r0.drawRect(r1, r2, r3, r4, r5)
        L74:
            int r12 = r12 + r8
            if (r7 == 0) goto L78
            return r12
        L78:
            r0 = r7
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.P1.a.j(ax.S0.F, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085 A[LOOP:0: B:2:0x0002->B:13:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int k(ax.S0.F r9, int[] r10, byte[] r11, int r12, int r13, android.graphics.Paint r14, android.graphics.Canvas r15) {
        /*
            r6 = 0
            r0 = 0
        L2:
            r1 = 4
            int r2 = r9.h(r1)
            r3 = 1
            if (r2 == 0) goto Le
            r7 = r0
        Lb:
            r8 = 1
            goto L67
        Le:
            boolean r2 = r9.g()
            r4 = 3
            if (r2 != 0) goto L25
            int r1 = r9.h(r4)
            if (r1 == 0) goto L21
            int r1 = r1 + 2
            r7 = r0
            r8 = r1
            r2 = 0
            goto L67
        L21:
            r2 = 0
            r7 = 1
        L23:
            r8 = 0
            goto L67
        L25:
            boolean r2 = r9.g()
            r7 = 2
            if (r2 != 0) goto L39
            int r2 = r9.h(r7)
            int r2 = r2 + r1
            int r1 = r9.h(r1)
        L35:
            r7 = r0
            r8 = r2
            r2 = r1
            goto L67
        L39:
            int r2 = r9.h(r7)
            if (r2 == 0) goto L64
            if (r2 == r3) goto L60
            if (r2 == r7) goto L55
            if (r2 == r4) goto L48
            r7 = r0
            r2 = 0
            goto L23
        L48:
            r2 = 8
            int r2 = r9.h(r2)
            int r2 = r2 + 25
            int r1 = r9.h(r1)
            goto L35
        L55:
            int r2 = r9.h(r1)
            int r2 = r2 + 9
            int r1 = r9.h(r1)
            goto L35
        L60:
            r7 = r0
            r2 = 0
            r8 = 2
            goto L67
        L64:
            r7 = r0
            r2 = 0
            goto Lb
        L67:
            if (r8 == 0) goto L81
            if (r14 == 0) goto L81
            if (r11 == 0) goto L6f
            r2 = r11[r2]
        L6f:
            r0 = r10[r2]
            r14.setColor(r0)
            float r1 = (float) r12
            float r2 = (float) r13
            int r0 = r12 + r8
            float r0 = (float) r0
            int r3 = r3 + r13
            float r4 = (float) r3
            r5 = r14
            r3 = r0
            r0 = r15
            r0.drawRect(r1, r2, r3, r4, r5)
        L81:
            int r12 = r12 + r8
            if (r7 == 0) goto L85
            return r12
        L85:
            r0 = r7
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.P1.a.k(ax.S0.F, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static int l(F f2, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int h2;
        boolean z2 = false;
        while (true) {
            int h3 = f2.h(8);
            if (h3 != 0) {
                z = z2;
                h2 = 1;
            } else if (f2.g()) {
                z = z2;
                h2 = f2.h(7);
                h3 = f2.h(8);
            } else {
                int h4 = f2.h(7);
                if (h4 != 0) {
                    z = z2;
                    h2 = h4;
                    h3 = 0;
                } else {
                    h3 = 0;
                    z = true;
                    h2 = 0;
                }
            }
            if (h2 != 0 && paint != null) {
                if (bArr != null) {
                    h3 = bArr[h3];
                }
                paint.setColor(iArr[h3]);
                canvas.drawRect(i2, i3, i2 + h2, 1 + i3, paint);
            }
            i2 += h2;
            if (z) {
                return i2;
            }
            z2 = z;
        }
    }

    private static void m(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        F f2 = new F(bArr);
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        int i5 = i3;
        int i6 = i4;
        byte[] bArr7 = null;
        while (f2.b() != 0) {
            int h2 = f2.h(8);
            if (h2 != 240) {
                switch (h2) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                                paint2 = paint3;
                                i5 = j(f2, iArr2, bArr2, i5, i6, paint2, canvas2);
                                f2.c();
                                break;
                            } else {
                                bArr3 = bArr6 == null ? h : bArr6;
                            }
                        } else {
                            bArr3 = bArr7 == null ? i : bArr7;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        i5 = j(f2, iArr2, bArr2, i5, i6, paint2, canvas2);
                        f2.c();
                    case 17:
                        iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        if (i2 == 3) {
                            bArr4 = bArr5 == null ? j : bArr5;
                        } else {
                            bArr4 = null;
                        }
                        paint2 = paint4;
                        i5 = k(f2, iArr2, bArr4, i5, i6, paint2, canvas2);
                        f2.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i5 = l(f2, iArr2, null, i5, i6, paint2, canvas2);
                        break;
                    default:
                        switch (h2) {
                            case 32:
                                bArr6 = e(4, 4, f2);
                                break;
                            case 33:
                                bArr7 = e(4, 8, f2);
                                break;
                            case 34:
                                bArr5 = e(16, 8, f2);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i6 += 2;
                i5 = i3;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void n(c cVar, C0167a c0167a, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? c0167a.d : i2 == 2 ? c0167a.c : c0167a.b;
        m(cVar.c, iArr, i2, i3, i4, paint, canvas);
        m(cVar.d, iArr, i2, i3, i4 + 1, paint, canvas);
    }

    private ax.N1.e o(F f2) {
        SparseArray<e> sparseArray;
        int i2;
        while (f2.b() >= 48 && f2.h(8) == 15) {
            u(f2, this.f);
        }
        h hVar = this.f;
        d dVar = hVar.i;
        if (dVar == null) {
            return new ax.N1.e(AbstractC2991z.z(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null || bVar.a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.d;
        int i3 = 0;
        while (i3 < sparseArray2.size()) {
            this.c.save();
            e valueAt = sparseArray2.valueAt(i3);
            f fVar = this.f.c.get(sparseArray2.keyAt(i3));
            int i4 = valueAt.a + bVar.c;
            int i5 = valueAt.b + bVar.e;
            this.c.clipRect(i4, i5, Math.min(fVar.c + i4, bVar.d), Math.min(fVar.d + i5, bVar.f));
            C0167a c0167a = this.f.d.get(fVar.g);
            if (c0167a == null && (c0167a = this.f.f.get(fVar.g)) == null) {
                c0167a = this.e;
            }
            C0167a c0167a2 = c0167a;
            SparseArray<g> sparseArray3 = fVar.k;
            int i6 = 0;
            while (i6 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i6);
                g valueAt2 = sparseArray3.valueAt(i6);
                c cVar = this.f.e.get(keyAt);
                if (cVar == null) {
                    cVar = this.f.g.get(keyAt);
                }
                if (cVar != null) {
                    sparseArray = sparseArray2;
                    i2 = i6;
                    n(cVar, c0167a2, fVar.f, valueAt2.c + i4, valueAt2.d + i5, cVar.b ? null : this.a, this.c);
                } else {
                    sparseArray = sparseArray2;
                    i2 = i6;
                }
                i6 = i2 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray<e> sparseArray4 = sparseArray2;
            if (fVar.b) {
                int i7 = fVar.f;
                this.b.setColor(i7 == 3 ? c0167a2.d[fVar.h] : i7 == 2 ? c0167a2.c[fVar.i] : c0167a2.b[fVar.j]);
                this.c.drawRect(i4, i5, fVar.c + i4, fVar.d + i5, this.b);
            }
            arrayList.add(new a.b().f(Bitmap.createBitmap(this.g, i4, i5, fVar.c, fVar.d)).k(i4 / bVar.a).l(0).h(i5 / bVar.b, 0).i(0).n(fVar.c / bVar.a).g(fVar.d / bVar.b).a());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
            i3++;
            sparseArray2 = sparseArray4;
        }
        return new ax.N1.e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C0167a p(F f2, int i2) {
        int h2;
        int i3;
        int h3;
        int i4;
        int i5;
        int i6 = 8;
        int h4 = f2.h(8);
        f2.r(8);
        int i7 = 2;
        int i8 = i2 - 2;
        int[] f3 = f();
        int[] g2 = g();
        int[] h5 = h();
        while (i8 > 0) {
            int h6 = f2.h(i6);
            int h7 = f2.h(i6);
            int[] iArr = (h7 & 128) != 0 ? f3 : (h7 & 64) != 0 ? g2 : h5;
            if ((h7 & 1) != 0) {
                i4 = f2.h(i6);
                i5 = f2.h(i6);
                h2 = f2.h(i6);
                h3 = f2.h(i6);
                i3 = i8 - 6;
            } else {
                int h8 = f2.h(6) << i7;
                int h9 = f2.h(4) << 4;
                h2 = f2.h(4) << 4;
                i3 = i8 - 4;
                h3 = f2.h(i7) << 6;
                i4 = h8;
                i5 = h9;
            }
            if (i4 == 0) {
                i5 = 0;
                h2 = 0;
                h3 = 255;
            }
            double d2 = i4;
            double d3 = i5 - 128;
            double d4 = h2 - 128;
            iArr[h6] = i((byte) (255 - (h3 & 255)), d0.p((int) (d2 + (1.402d * d3)), 0, 255), d0.p((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), d0.p((int) (d2 + (d4 * 1.772d)), 0, 255));
            i8 = i3;
            h4 = h4;
            i6 = 8;
            i7 = 2;
        }
        return new C0167a(h4, f3, g2, h5);
    }

    private static b q(F f2) {
        int i2;
        int i3;
        int i4;
        int i5;
        f2.r(4);
        boolean g2 = f2.g();
        f2.r(3);
        int h2 = f2.h(16);
        int h3 = f2.h(16);
        if (g2) {
            int h4 = f2.h(16);
            int h5 = f2.h(16);
            int h6 = f2.h(16);
            i3 = f2.h(16);
            i2 = h5;
            i5 = h6;
            i4 = h4;
        } else {
            i2 = h2;
            i3 = h3;
            i4 = 0;
            i5 = 0;
        }
        return new b(h2, h3, i4, i2, i5, i3);
    }

    private static c r(F f2) {
        byte[] bArr;
        int h2 = f2.h(16);
        f2.r(4);
        int h3 = f2.h(2);
        boolean g2 = f2.g();
        f2.r(1);
        byte[] bArr2 = d0.f;
        if (h3 == 1) {
            f2.r(f2.h(8) * 16);
        } else if (h3 == 0) {
            int h4 = f2.h(16);
            int h5 = f2.h(16);
            if (h4 > 0) {
                bArr2 = new byte[h4];
                f2.k(bArr2, 0, h4);
            }
            if (h5 > 0) {
                bArr = new byte[h5];
                f2.k(bArr, 0, h5);
                return new c(h2, g2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h2, g2, bArr2, bArr);
    }

    private static d s(F f2, int i2) {
        int h2 = f2.h(8);
        int h3 = f2.h(4);
        int h4 = f2.h(2);
        f2.r(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int h5 = f2.h(8);
            f2.r(8);
            i3 -= 6;
            sparseArray.put(h5, new e(f2.h(16), f2.h(16)));
        }
        return new d(h2, h3, h4, sparseArray);
    }

    private static f t(F f2, int i2) {
        int i3;
        int i4;
        int h2 = f2.h(8);
        int i5 = 4;
        f2.r(4);
        boolean g2 = f2.g();
        f2.r(3);
        int i6 = 16;
        int h3 = f2.h(16);
        int h4 = f2.h(16);
        int h5 = f2.h(3);
        int h6 = f2.h(3);
        int i7 = 2;
        f2.r(2);
        int h7 = f2.h(8);
        int h8 = f2.h(8);
        int h9 = f2.h(4);
        int h10 = f2.h(2);
        f2.r(2);
        int i8 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i8 > 0) {
            int h11 = f2.h(i6);
            int h12 = f2.h(i7);
            int h13 = f2.h(i7);
            int h14 = f2.h(12);
            f2.r(i5);
            int h15 = f2.h(12);
            int i9 = i8 - 6;
            if (h12 != 1 && h12 != 2) {
                i8 = i9;
                i4 = 0;
                i3 = 0;
                sparseArray.put(h11, new g(h12, h13, h14, h15, i4, i3));
                i5 = 4;
                i6 = 16;
                i7 = 2;
            }
            i8 -= 8;
            i4 = f2.h(8);
            i3 = f2.h(8);
            sparseArray.put(h11, new g(h12, h13, h14, h15, i4, i3));
            i5 = 4;
            i6 = 16;
            i7 = 2;
        }
        return new f(h2, g2, h3, h4, h5, h6, h7, h8, h9, h10, sparseArray);
    }

    private static void u(F f2, h hVar) {
        f fVar;
        int h2 = f2.h(8);
        int h3 = f2.h(16);
        int h4 = f2.h(16);
        int d2 = f2.d() + h4;
        if (h4 * 8 > f2.b()) {
            C0987u.h("DvbParser", "Data field length exceeds limit");
            f2.r(f2.b());
            return;
        }
        switch (h2) {
            case 16:
                if (h3 == hVar.a) {
                    d dVar = hVar.i;
                    d s = s(f2, h4);
                    if (s.c == 0) {
                        if (dVar != null && dVar.b != s.b) {
                            hVar.i = s;
                            break;
                        }
                    } else {
                        hVar.i = s;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.i;
                if (h3 == hVar.a && dVar2 != null) {
                    f t = t(f2, h4);
                    if (dVar2.c == 0 && (fVar = hVar.c.get(t.a)) != null) {
                        t.a(fVar);
                    }
                    hVar.c.put(t.a, t);
                    break;
                }
                break;
            case 18:
                if (h3 != hVar.a) {
                    if (h3 == hVar.b) {
                        C0167a p = p(f2, h4);
                        hVar.f.put(p.a, p);
                        break;
                    }
                } else {
                    C0167a p2 = p(f2, h4);
                    hVar.d.put(p2.a, p2);
                    break;
                }
                break;
            case 19:
                if (h3 != hVar.a) {
                    if (h3 == hVar.b) {
                        c r = r(f2);
                        hVar.g.put(r.a, r);
                        break;
                    }
                } else {
                    c r2 = r(f2);
                    hVar.e.put(r2.a, r2);
                    break;
                }
                break;
            case 20:
                if (h3 == hVar.a) {
                    hVar.h = q(f2);
                    break;
                }
                break;
        }
        f2.s(d2 - f2.d());
    }

    @Override // ax.N1.t
    public void a() {
        this.f.a();
    }

    @Override // ax.N1.t
    public /* synthetic */ k b(byte[] bArr, int i2, int i3) {
        return s.a(this, bArr, i2, i3);
    }

    @Override // ax.N1.t
    public void c(byte[] bArr, int i2, int i3, t.b bVar, InterfaceC0979l<ax.N1.e> interfaceC0979l) {
        F f2 = new F(bArr, i3 + i2);
        f2.p(i2);
        interfaceC0979l.accept(o(f2));
    }

    @Override // ax.N1.t
    public int d() {
        return 2;
    }
}
