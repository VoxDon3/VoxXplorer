/*
 * Decompiled with CFR 0.152.
 */
package ax.P1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.SparseArray;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.R0.a;
import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.l;
import ax.S0.u;
import ax.r7.z;
import java.util.ArrayList;
import java.util.List;

public final class a
implements t {
    private static final byte[] h = new byte[]{0, 7, 8, 15};
    private static final byte[] i = new byte[]{0, 119, -120, -1};
    private static final byte[] j = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint a;
    private final Paint b;
    private final Canvas c;
    private final b d;
    private final a e;
    private final h f;
    private Bitmap g;

    public a(List<byte[]> object) {
        object = new G(object.get(0));
        int n8 = ((G)object).U();
        int n9 = ((G)object).U();
        object = new Paint();
        this.a = object;
        object.setStyle(Paint.Style.FILL_AND_STROKE);
        object.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC));
        object.setPathEffect(null);
        object = new Paint();
        this.b = object;
        object.setStyle(Paint.Style.FILL);
        object.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        object.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, ax.P1.a.f(), ax.P1.a.g(), ax.P1.a.h());
        this.f = new h(n8, n9);
    }

    private static byte[] e(int n8, int n9, F f8) {
        byte[] byArray = new byte[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            byArray[i8] = (byte)f8.h(n9);
        }
        return byArray;
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] nArray = new int[16];
        nArray[0] = 0;
        for (int i8 = 1; i8 < 16; ++i8) {
            int n8;
            int n9;
            int n10;
            if (i8 < 8) {
                n10 = (i8 & 1) != 0 ? 255 : 0;
                n9 = (i8 & 2) != 0 ? 255 : 0;
                n8 = (i8 & 4) != 0 ? 255 : 0;
                nArray[i8] = ax.P1.a.i(255, n10, n9, n8);
                continue;
            }
            n8 = 127;
            n10 = (i8 & 1) != 0 ? 127 : 0;
            n9 = (i8 & 2) != 0 ? 127 : 0;
            if ((i8 & 4) == 0) {
                n8 = 0;
            }
            nArray[i8] = ax.P1.a.i(255, n10, n9, n8);
        }
        return nArray;
    }

    private static int[] h() {
        int[] nArray = new int[256];
        nArray[0] = 0;
        for (int i8 = 0; i8 < 256; ++i8) {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13 = 255;
            if (i8 < 8) {
                n12 = (i8 & 1) != 0 ? 255 : 0;
                n11 = (i8 & 2) != 0 ? 255 : 0;
                if ((i8 & 4) == 0) {
                    n13 = 0;
                }
                nArray[i8] = ax.P1.a.i(63, n12, n11, n13);
                continue;
            }
            n13 = i8 & 0x88;
            n11 = 170;
            n12 = 85;
            if (n13 != 0) {
                if (n13 != 8) {
                    n11 = 43;
                    if (n13 != 128) {
                        if (n13 != 136) continue;
                        n13 = (i8 & 1) != 0 ? 43 : 0;
                        n10 = (i8 & 0x10) != 0 ? 85 : 0;
                        n9 = (i8 & 2) != 0 ? 43 : 0;
                        n8 = (i8 & 0x20) != 0 ? 85 : 0;
                        if ((i8 & 4) == 0) {
                            n11 = 0;
                        }
                        if ((i8 & 0x40) == 0) {
                            n12 = 0;
                        }
                        nArray[i8] = ax.P1.a.i(255, n13 + n10, n9 + n8, n11 + n12);
                        continue;
                    }
                    n13 = (i8 & 1) != 0 ? 43 : 0;
                    n10 = (i8 & 0x10) != 0 ? 85 : 0;
                    n9 = (i8 & 2) != 0 ? 43 : 0;
                    n8 = (i8 & 0x20) != 0 ? 85 : 0;
                    if ((i8 & 4) == 0) {
                        n11 = 0;
                    }
                    if ((i8 & 0x40) == 0) {
                        n12 = 0;
                    }
                    nArray[i8] = ax.P1.a.i(255, n13 + 127 + n10, n9 + 127 + n8, n11 + 127 + n12);
                    continue;
                }
                n13 = (i8 & 1) != 0 ? 85 : 0;
                n10 = (i8 & 0x10) != 0 ? 170 : 0;
                n9 = (i8 & 2) != 0 ? 85 : 0;
                n8 = (i8 & 0x20) != 0 ? 170 : 0;
                if ((i8 & 4) == 0) {
                    n12 = 0;
                }
                if ((i8 & 0x40) == 0) {
                    n11 = 0;
                }
                nArray[i8] = ax.P1.a.i(127, n13 + n10, n9 + n8, n12 + n11);
                continue;
            }
            n13 = (i8 & 1) != 0 ? 85 : 0;
            n10 = (i8 & 0x10) != 0 ? 170 : 0;
            n9 = (i8 & 2) != 0 ? 85 : 0;
            n8 = (i8 & 0x20) != 0 ? 170 : 0;
            if ((i8 & 4) == 0) {
                n12 = 0;
            }
            if ((i8 & 0x40) == 0) {
                n11 = 0;
            }
            nArray[i8] = ax.P1.a.i(255, n13 + n10, n9 + n8, n12 + n11);
        }
        return nArray;
    }

    private static int i(int n8, int n9, int n10, int n11) {
        return n8 << 24 | n9 << 16 | n10 << 8 | n11;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int j(F f8, int[] nArray, byte[] byArray, int n8, int n9, Paint paint, Canvas canvas) {
        int n10 = 0;
        int n11 = n8;
        n8 = n10;
        while (true) {
            int n12;
            int n13;
            block8: {
                block13: {
                    block9: {
                        block10: {
                            block6: {
                                block11: {
                                    block12: {
                                        block7: {
                                            block4: {
                                                block5: {
                                                    if ((n10 = f8.h(2)) != 0) break block4;
                                                    if (!f8.g()) break block5;
                                                    n13 = f8.h(3) + 3;
                                                    n10 = f8.h(2);
                                                    break block6;
                                                }
                                                if (!f8.g()) break block7;
                                                n10 = 0;
                                            }
                                            n13 = n8;
                                            n12 = 1;
                                            n8 = n10;
                                            n10 = n13;
                                            n13 = n12;
                                            break block8;
                                        }
                                        n10 = f8.h(2);
                                        if (n10 == 0) break block9;
                                        if (n10 == 1) break block10;
                                        if (n10 == 2) break block11;
                                        if (n10 == 3) break block12;
                                        n10 = n8;
                                        break block13;
                                    }
                                    n13 = f8.h(8) + 29;
                                    n10 = f8.h(2);
                                    break block6;
                                }
                                n13 = f8.h(4) + 12;
                                n10 = f8.h(2);
                            }
                            n12 = n8;
                            n8 = n10;
                            n10 = n12;
                            break block8;
                        }
                        n10 = n8;
                        n8 = 0;
                        n13 = 2;
                        break block8;
                    }
                    n10 = 1;
                }
                n8 = 0;
                n13 = 0;
            }
            if (n13 != 0 && paint != null) {
                n12 = n8;
                if (byArray != null) {
                    n12 = byArray[n8];
                }
                paint.setColor(nArray[n12]);
                canvas.drawRect((float)n11, (float)n9, (float)(n11 + n13), (float)(1 + n9), paint);
            }
            n11 += n13;
            if (n10 != 0) {
                return n11;
            }
            n8 = n10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int k(F f8, int[] nArray, byte[] byArray, int n8, int n9, Paint paint, Canvas canvas) {
        int n10 = 0;
        int n11 = n8;
        n8 = n10;
        while (true) {
            int n12;
            int n13;
            block7: {
                block4: {
                    block11: {
                        block12: {
                            block10: {
                                block13: {
                                    block14: {
                                        block8: {
                                            block9: {
                                                block5: {
                                                    block6: {
                                                        if ((n10 = f8.h(4)) != 0) break block4;
                                                        if (f8.g()) break block5;
                                                        n13 = f8.h(3);
                                                        if (n13 == 0) break block6;
                                                        n10 = n8;
                                                        n13 += 2;
                                                        n8 = 0;
                                                        break block7;
                                                    }
                                                    n10 = 1;
                                                    break block8;
                                                }
                                                if (f8.g()) break block9;
                                                n13 = f8.h(2) + 4;
                                                n10 = f8.h(4);
                                                break block10;
                                            }
                                            n10 = f8.h(2);
                                            if (n10 == 0) break block11;
                                            if (n10 == 1) break block12;
                                            if (n10 == 2) break block13;
                                            if (n10 == 3) break block14;
                                            n10 = n8;
                                        }
                                        n8 = 0;
                                        n13 = 0;
                                        break block7;
                                    }
                                    n13 = f8.h(8) + 25;
                                    n10 = f8.h(4);
                                    break block10;
                                }
                                n13 = f8.h(4) + 9;
                                n10 = f8.h(4);
                            }
                            n12 = n8;
                            n8 = n10;
                            n10 = n12;
                            break block7;
                        }
                        n10 = n8;
                        n8 = 0;
                        n13 = 2;
                        break block7;
                    }
                    n10 = 0;
                }
                n13 = n8;
                n12 = 1;
                n8 = n10;
                n10 = n13;
                n13 = n12;
            }
            if (n13 != 0 && paint != null) {
                n12 = n8;
                if (byArray != null) {
                    n12 = byArray[n8];
                }
                paint.setColor(nArray[n12]);
                canvas.drawRect((float)n11, (float)n9, (float)(n11 + n13), (float)(1 + n9), paint);
            }
            n11 += n13;
            if (n10 != 0) {
                return n11;
            }
            n8 = n10;
        }
    }

    private static int l(F f8, int[] nArray, byte[] byArray, int n8, int n9, Paint paint, Canvas canvas) {
        int n10 = 0;
        int n11 = n8;
        n8 = n10;
        do {
            int n12;
            if ((n10 = f8.h(8)) != 0) {
                n12 = 1;
            } else if (!f8.g()) {
                n12 = f8.h(7);
                if (n12 != 0) {
                    n10 = 0;
                } else {
                    n10 = 0;
                    n8 = 1;
                    n12 = 0;
                }
            } else {
                n12 = f8.h(7);
                n10 = f8.h(8);
            }
            if (n12 != 0 && paint != null) {
                int n13 = n10;
                if (byArray != null) {
                    n13 = byArray[n10];
                }
                paint.setColor(nArray[n13]);
                canvas.drawRect((float)n11, (float)n9, (float)(n11 + n12), (float)(1 + n9), paint);
            }
            n11 += n12;
        } while (n8 == 0);
        return n11;
    }

    private static void m(byte[] object, int[] objectArray, int n8, int n9, int n10, Paint object2, Canvas object3) {
        F f8 = new F((byte[])object);
        Object var12_8 = null;
        object = null;
        int n11 = n9;
        Object[] objectArray2 = object;
        Canvas canvas = object3;
        Paint paint = object2;
        object2 = objectArray2;
        objectArray2 = objectArray;
        objectArray = object;
        object3 = var12_8;
        int n12 = n10;
        n10 = n11;
        while (f8.b() != 0) {
            n11 = f8.h(8);
            if (n11 != 240) {
                block0 : switch (n11) {
                    default: {
                        switch (n11) {
                            default: {
                                break block0;
                            }
                            case 34: {
                                object3 = ax.P1.a.e(16, 8, f8);
                                break block0;
                            }
                            case 33: {
                                object2 = ax.P1.a.e(4, 8, f8);
                                break block0;
                            }
                            case 32: 
                        }
                        objectArray = ax.P1.a.e(4, 4, f8);
                        break;
                    }
                    case 18: {
                        n10 = ax.P1.a.l(f8, objectArray2, null, n10, n12, paint, canvas);
                        break;
                    }
                    case 17: {
                        object = n8 == 3 ? (object3 == null ? j : (Object)object3) : null;
                        n10 = ax.P1.a.k(f8, objectArray2, object, n10, n12, paint, canvas);
                        f8.c();
                        break;
                    }
                    case 16: {
                        object = n8 == 3 ? (object2 == null ? i : (Object)object2) : (Object)(n8 == 2 ? (objectArray == null ? h : (Object)objectArray) : null);
                        n10 = ax.P1.a.j(f8, objectArray2, object, n10, n12, paint, canvas);
                        f8.c();
                        break;
                    }
                }
                continue;
            }
            n12 += 2;
            n10 = n9;
        }
    }

    private static void n(c c8, a object, int n8, int n9, int n10, Paint paint, Canvas canvas) {
        object = n8 == 3 ? (Object)((a)object).d : (n8 == 2 ? (Object)((a)object).c : (Object)((a)object).b);
        ax.P1.a.m(c8.c, (int[])object, n8, n9, n10, paint, canvas);
        ax.P1.a.m(c8.d, (int[])object, n8, n9, n10 + 1, paint, canvas);
    }

    private ax.N1.e o(F object) {
        while (((F)object).b() >= 48 && ((F)object).h(8) == 15) {
            ax.P1.a.u((F)object, this.f);
        }
        SparseArray<e> sparseArray = this.f;
        object = sparseArray.i;
        if (object == null) {
            return new ax.N1.e(z.<ax.R0.a>z(), -9223372036854775807L, -9223372036854775807L);
        }
        b b8 = sparseArray.h;
        if (b8 == null) {
            b8 = this.d;
        }
        sparseArray = this.g;
        if (sparseArray == null || b8.a + 1 != sparseArray.getWidth() || b8.b + 1 != this.g.getHeight()) {
            sparseArray = Bitmap.createBitmap((int)(b8.a + 1), (int)(b8.b + 1), (Bitmap.Config)Bitmap.Config.ARGB_8888);
            this.g = sparseArray;
            this.c.setBitmap((Bitmap)sparseArray);
        }
        ArrayList<ax.R0.a> arrayList = new ArrayList<ax.R0.a>();
        sparseArray = ((d)object).d;
        for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
            Object object2;
            this.c.save();
            object = (e)sparseArray.valueAt(i8);
            int n8 = sparseArray.keyAt(i8);
            f f8 = (f)this.f.c.get(n8);
            int n9 = ((e)object).a + b8.c;
            int n10 = ((e)object).b + b8.e;
            int n11 = Math.min(f8.c + n9, b8.d);
            n8 = Math.min(f8.d + n10, b8.f);
            this.c.clipRect(n9, n10, n11, n8);
            object = object2 = (a)this.f.d.get(f8.g);
            if (object2 == null) {
                object = object2 = (a)this.f.f.get(f8.g);
                if (object2 == null) {
                    object = this.e;
                }
            }
            SparseArray<g> sparseArray2 = f8.k;
            for (n8 = 0; n8 < sparseArray2.size(); ++n8) {
                n11 = sparseArray2.keyAt(n8);
                g g8 = (g)sparseArray2.valueAt(n8);
                c c8 = (c)this.f.e.get(n11);
                object2 = c8;
                if (c8 == null) {
                    object2 = (c)this.f.g.get(n11);
                }
                if (object2 == null) continue;
                c8 = ((c)object2).b ? null : this.a;
                ax.P1.a.n((c)object2, (a)object, f8.f, g8.c + n9, g8.d + n10, (Paint)c8, this.c);
            }
            if (f8.b) {
                n8 = f8.f;
                n8 = n8 == 3 ? ((a)object).d[f8.h] : (n8 == 2 ? ((a)object).c[f8.i] : ((a)object).b[f8.j]);
                this.b.setColor(n8);
                this.c.drawRect((float)n9, (float)n10, (float)(f8.c + n9), (float)(f8.d + n10), this.b);
            }
            arrayList.add(new a.b().f(Bitmap.createBitmap((Bitmap)this.g, (int)n9, (int)n10, (int)f8.c, (int)f8.d)).k((float)n9 / (float)b8.a).l(0).h((float)n10 / (float)b8.b, 0).i(0).n((float)f8.c / (float)b8.a).g((float)f8.d / (float)b8.b).a());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
        }
        return new ax.N1.e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static a p(F f8, int n8) {
        int n9 = f8.h(8);
        f8.r(8);
        n8 -= 2;
        int[] nArray = ax.P1.a.f();
        int[] nArray2 = ax.P1.a.g();
        int[] nArray3 = ax.P1.a.h();
        while (n8 > 0) {
            int n10;
            int n11;
            int n12;
            int n13 = f8.h(8);
            int n14 = f8.h(8);
            int[] nArray4 = (n14 & 0x80) != 0 ? nArray : ((n14 & 0x40) != 0 ? nArray2 : nArray3);
            if ((n14 & 1) != 0) {
                n12 = f8.h(8);
                n11 = f8.h(8);
                n10 = f8.h(8);
                n14 = f8.h(8);
                n8 -= 6;
            } else {
                n12 = f8.h(6);
                n11 = f8.h(4);
                n10 = f8.h(4) << 4;
                n14 = f8.h(2);
                n8 -= 4;
                n14 <<= 6;
                n12 <<= 2;
                n11 <<= 4;
            }
            if (n12 == 0) {
                n11 = 0;
                n10 = 0;
                n14 = 255;
            }
            n14 = (byte)(255 - (n14 & 0xFF));
            double d8 = n12;
            double d9 = n11 - 128;
            n11 = (int)(d8 + 1.402 * d9);
            double d10 = n10 - 128;
            n10 = (int)(d8 - 0.34414 * d10 - d9 * 0.71414);
            n12 = (int)(d8 + d10 * 1.772);
            nArray4[n13] = ax.P1.a.i(n14, d0.p(n11, 0, 255), d0.p(n10, 0, 255), d0.p(n12, 0, 255));
        }
        return new a(n9, nArray, nArray2, nArray3);
    }

    private static b q(F f8) {
        int n8;
        int n9;
        int n10;
        int n11;
        f8.r(4);
        boolean bl = f8.g();
        f8.r(3);
        int n12 = f8.h(16);
        int n13 = f8.h(16);
        if (bl) {
            n11 = f8.h(16);
            n10 = f8.h(16);
            n9 = f8.h(16);
            int n14 = f8.h(16);
            n8 = n10;
            n10 = n14;
        } else {
            n8 = n12;
            n10 = n13;
            n11 = 0;
            n9 = 0;
        }
        return new b(n12, n13, n11, n8, n9, n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static c r(F object) {
        byte[] byArray;
        int n8 = ((F)object).h(16);
        ((F)object).r(4);
        int n9 = ((F)object).h(2);
        boolean bl = ((F)object).g();
        ((F)object).r(1);
        byte[] byArray2 = d0.f;
        if (n9 == 1) {
            ((F)object).r(((F)object).h(8) * 16);
            byArray = byArray2;
        } else {
            byArray = byArray2;
            if (n9 == 0) {
                n9 = ((F)object).h(16);
                int n10 = ((F)object).h(16);
                if (n9 > 0) {
                    byArray2 = new byte[n9];
                    ((F)object).k(byArray2, 0, n9);
                }
                byArray = byArray2;
                if (n10 > 0) {
                    byArray = new byte[n10];
                    ((F)object).k(byArray, 0, n10);
                    object = byArray;
                    byArray = byArray2;
                    return new c(n8, bl, byArray, (byte[])object);
                }
            }
        }
        object = byArray;
        return new c(n8, bl, byArray, (byte[])object);
    }

    private static d s(F f8, int n8) {
        int n9 = f8.h(8);
        int n10 = f8.h(4);
        int n11 = f8.h(2);
        f8.r(2);
        n8 -= 2;
        SparseArray sparseArray = new SparseArray();
        while (n8 > 0) {
            int n12 = f8.h(8);
            f8.r(8);
            int n13 = f8.h(16);
            int n14 = f8.h(16);
            n8 -= 6;
            sparseArray.put(n12, (Object)new e(n13, n14));
        }
        return new d(n9, n10, n11, (SparseArray<e>)sparseArray);
    }

    private static f t(F f8, int n8) {
        int n9 = f8.h(8);
        f8.r(4);
        boolean bl = f8.g();
        f8.r(3);
        int n10 = f8.h(16);
        int n11 = f8.h(16);
        int n12 = f8.h(3);
        int n13 = f8.h(3);
        f8.r(2);
        int n14 = f8.h(8);
        int n15 = f8.h(8);
        int n16 = f8.h(4);
        int n17 = f8.h(2);
        f8.r(2);
        n8 -= 10;
        SparseArray sparseArray = new SparseArray();
        while (n8 > 0) {
            int n18;
            int n19;
            int n20 = f8.h(16);
            int n21 = f8.h(2);
            int n22 = f8.h(2);
            int n23 = f8.h(12);
            f8.r(4);
            int n24 = f8.h(12);
            if (n21 != 1 && n21 != 2) {
                n8 -= 6;
                n19 = 0;
                n18 = 0;
            } else {
                n19 = f8.h(8);
                n18 = f8.h(8);
                int n25 = n8 - 8;
                n19 = n8 = n19;
                n8 = n25;
            }
            sparseArray.put(n20, (Object)new g(n21, n22, n23, n24, n19, n18));
        }
        return new f(n9, bl, n10, n11, n12, n13, n14, n15, n16, n17, (SparseArray<g>)sparseArray);
    }

    private static void u(F f8, h h8) {
        int n8 = f8.h(8);
        int n9 = f8.h(16);
        int n10 = f8.h(16);
        int n11 = f8.d();
        if (n10 * 8 > f8.b()) {
            u.h("DvbParser", "Data field length exceeds limit");
            f8.r(f8.b());
            return;
        }
        switch (n8) {
            default: {
                break;
            }
            case 20: {
                if (n9 != h8.a) break;
                h8.h = ax.P1.a.q(f8);
                break;
            }
            case 19: {
                if (n9 == h8.a) {
                    c c8 = ax.P1.a.r(f8);
                    h8.e.put(c8.a, (Object)c8);
                    break;
                }
                if (n9 != h8.b) break;
                c c9 = ax.P1.a.r(f8);
                h8.g.put(c9.a, (Object)c9);
                break;
            }
            case 18: {
                if (n9 == h8.a) {
                    a a8 = ax.P1.a.p(f8, n10);
                    h8.d.put(a8.a, (Object)a8);
                    break;
                }
                if (n9 != h8.b) break;
                a a9 = ax.P1.a.p(f8, n10);
                h8.f.put(a9.a, (Object)a9);
                break;
            }
            case 17: {
                Object object = h8.i;
                if (n9 != h8.a || object == null) break;
                f f9 = ax.P1.a.t(f8, n10);
                if (((d)object).c == 0 && (object = (f)h8.c.get(f9.a)) != null) {
                    f9.a((f)object);
                }
                h8.c.put(f9.a, (Object)f9);
                break;
            }
            case 16: {
                if (n9 != h8.a) break;
                d d8 = h8.i;
                d d9 = ax.P1.a.s(f8, n10);
                if (d9.c != 0) {
                    h8.i = d9;
                    h8.c.clear();
                    h8.d.clear();
                    h8.e.clear();
                    break;
                }
                if (d8 == null || d8.b == d9.b) break;
                h8.i = d9;
            }
        }
        f8.s(n11 + n10 - f8.d());
    }

    @Override
    public void a() {
        this.f.a();
    }

    @Override
    public /* synthetic */ k b(byte[] byArray, int n8, int n9) {
        return s.a(this, byArray, n8, n9);
    }

    @Override
    public void c(byte[] object, int n8, int n9, t.b b8, l<ax.N1.e> l8) {
        object = new F((byte[])object, n9 + n8);
        ((F)object).p(n8);
        l8.accept(this.o((F)object));
    }

    @Override
    public int d() {
        return 2;
    }

    private static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int n8, int[] nArray, int[] nArray2, int[] nArray3) {
            this.a = n8;
            this.b = nArray;
            this.c = nArray2;
            this.d = nArray3;
        }
    }

    private static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int n8, int n9, int n10, int n11, int n12, int n13) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
        }
    }

    private static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int n8, boolean bl, byte[] byArray, byte[] byArray2) {
            this.a = n8;
            this.b = bl;
            this.c = byArray;
            this.d = byArray2;
        }
    }

    private static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray<e> d;

        public d(int n8, int n9, int n10, SparseArray<e> sparseArray) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = sparseArray;
        }
    }

    private static final class e {
        public final int a;
        public final int b;

        public e(int n8, int n9) {
            this.a = n8;
            this.b = n9;
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

        public f(int n8, boolean bl, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, SparseArray<g> sparseArray) {
            this.a = n8;
            this.b = bl;
            this.c = n9;
            this.d = n10;
            this.e = n11;
            this.f = n12;
            this.g = n13;
            this.h = n14;
            this.i = n15;
            this.j = n16;
            this.k = sparseArray;
        }

        public void a(f sparseArray) {
            sparseArray = sparseArray.k;
            for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
                this.k.put(sparseArray.keyAt(i8), (Object)((g)sparseArray.valueAt(i8)));
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

        public g(int n8, int n9, int n10, int n11, int n12, int n13) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
        }
    }

    private static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c;
        public final SparseArray<a> d;
        public final SparseArray<c> e;
        public final SparseArray<a> f;
        public final SparseArray<c> g;
        public b h;
        public d i;

        public h(int n8, int n9) {
            this.a = n8;
            this.b = n9;
            this.c = new SparseArray();
            this.d = new SparseArray();
            this.e = new SparseArray();
            this.f = new SparseArray();
            this.g = new SparseArray();
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
}

