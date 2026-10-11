/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

import com.google.android.material.carousel.c;
import com.google.android.material.carousel.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class f {
    private final e a;
    private final List<e> b;
    private final List<e> c;
    private final float[] d;
    private final float[] e;
    private final float f;
    private final float g;

    private f(e e8, List<e> list, List<e> list2) {
        float f8;
        float f9;
        this.a = e8;
        this.b = java.util.DesugarCollections.unmodifiableList(list);
        this.c = java.util.DesugarCollections.unmodifiableList(list2);
        this.f = f9 = list.get((int)(list.size() - 1)).d().a - e8.d().a;
        this.g = f8 = e8.k().a - list2.get((int)(list2.size() - 1)).k().a;
        this.d = com.google.android.material.carousel.f.m(f9, list, true);
        this.e = com.google.android.material.carousel.f.m(f8, list2, false);
    }

    private e a(List<e> list, float f8, float[] fArray) {
        if ((fArray = com.google.android.material.carousel.f.o(list, f8, fArray))[0] >= 0.5f) {
            return list.get((int)fArray[2]);
        }
        return list.get((int)fArray[1]);
    }

    private static int b(e e8, float f8) {
        for (int i8 = e8.j(); i8 < e8.h().size(); ++i8) {
            if (f8 != e8.h().get((int)i8).c) continue;
            return i8;
        }
        return e8.h().size() - 1;
    }

    private static int c(e e8) {
        for (int i8 = 0; i8 < e8.h().size(); ++i8) {
            if (e8.h().get((int)i8).e) continue;
            return i8;
        }
        return -1;
    }

    private static int d(e e8, float f8) {
        for (int i8 = e8.c() - 1; i8 >= 0; --i8) {
            if (f8 != e8.h().get((int)i8).c) continue;
            return i8;
        }
        return 0;
    }

    private static int e(e e8) {
        for (int i8 = e8.h().size() - 1; i8 >= 0; --i8) {
            if (e8.h().get((int)i8).e) continue;
            return i8;
        }
        return -1;
    }

    static f f(ax.u6.a a8, e e8, float f8, float f9, float f10, c.a a9) {
        return new f(e8, com.google.android.material.carousel.f.p(a8, e8, f8, f9, a9), com.google.android.material.carousel.f.n(a8, e8, f8, f10, a9));
    }

    private static float[] m(float f8, List<e> list, boolean bl) {
        int n8 = list.size();
        float[] fArray = new float[n8];
        for (int i8 = 1; i8 < n8; ++i8) {
            int n9 = i8 - 1;
            e e8 = list.get(n9);
            e e9 = list.get(i8);
            float f9 = bl ? e9.d().a - e8.d().a : e8.k().a - e9.k().a;
            f9 /= f8;
            f9 = i8 == n8 - 1 ? 1.0f : fArray[n9] + f9;
            fArray[i8] = f9;
        }
        return fArray;
    }

    private static List<e> n(ax.u6.a object, e e8, float f8, float f9, c.a a8) {
        ArrayList<e> arrayList = new ArrayList<e>();
        arrayList.add(e8);
        int n8 = com.google.android.material.carousel.f.e(e8);
        int n9 = object.g() ? object.a() : object.b();
        if (!com.google.android.material.carousel.f.r((ax.u6.a)object, e8) && n8 != -1) {
            int n10 = n8 - e8.j();
            float f10 = e8.d().b - e8.d().d / 2.0f;
            if (n10 <= 0 && e8.i().f > 0.0f) {
                arrayList.add(com.google.android.material.carousel.f.x(e8, f10 - e8.i().f - f9, n9));
                return arrayList;
            }
            float f11 = 0.0f;
            for (int i8 = 0; i8 < n10; ++i8) {
                object = (e)arrayList.get(arrayList.size() - 1);
                int n11 = n8 - i8;
                n11 = ++n11 < e8.h().size() ? com.google.android.material.carousel.f.d((e)object, e8.h().get((int)n11).c) + 1 : 0;
                int n12 = e8.c();
                int n13 = e8.j();
                e e9 = com.google.android.material.carousel.f.t((e)object, n8, n11, f10 - (f11 += e8.h().get((int)n11).f), n12 + i8 + 1, n13 + i8 + 1, n9);
                object = e9;
                if (i8 == n10 - 1) {
                    object = e9;
                    if (f9 > 0.0f) {
                        object = com.google.android.material.carousel.f.u(e9, f9, n9, false, f8, a8);
                    }
                }
                arrayList.add((e)object);
            }
        } else if (f9 > 0.0f) {
            arrayList.add(com.google.android.material.carousel.f.u(e8, f9, n9, false, f8, a8));
        }
        return arrayList;
    }

    private static float[] o(List<e> list, float f8, float[] fArray) {
        int n8 = list.size();
        float f9 = fArray[0];
        for (int i8 = 1; i8 < n8; ++i8) {
            float f10 = fArray[i8];
            if (f8 <= f10) {
                return new float[]{ax.l6.a.b(0.0f, 1.0f, f9, f10, f8), i8 - 1, i8};
            }
            f9 = f10;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<e> p(ax.u6.a object, e e8, float f8, float f9, c.a a8) {
        ArrayList<e> arrayList = new ArrayList<e>();
        arrayList.add(e8);
        int n8 = com.google.android.material.carousel.f.c(e8);
        int n9 = object.g() ? object.a() : object.b();
        if (!com.google.android.material.carousel.f.q(e8) && n8 != -1) {
            int n10 = e8.c() - n8;
            float f10 = e8.d().b - e8.d().d / 2.0f;
            if (n10 <= 0 && e8.b().f > 0.0f) {
                arrayList.add(com.google.android.material.carousel.f.x(e8, f10 + e8.b().f + f9, n9));
                return arrayList;
            }
            float f11 = 0.0f;
            for (int i8 = 0; i8 < n10; ++i8) {
                object = (e)arrayList.get(arrayList.size() - 1);
                int n11 = n8 + i8;
                int n12 = e8.h().size() - 1;
                f11 += e8.h().get((int)n11).f;
                if (--n11 >= 0) {
                    n12 = com.google.android.material.carousel.f.b((e)object, e8.h().get((int)n11).c) - 1;
                }
                e e9 = com.google.android.material.carousel.f.t((e)object, n8, n12, f10 + f11, e8.c() - i8 - 1, e8.j() - i8 - 1, n9);
                object = e9;
                if (i8 == n10 - 1) {
                    object = e9;
                    if (f9 > 0.0f) {
                        object = com.google.android.material.carousel.f.u(e9, f9, n9, true, f8, a8);
                    }
                }
                arrayList.add((e)object);
            }
        } else if (f9 > 0.0f) {
            arrayList.add(com.google.android.material.carousel.f.u(e8, f9, n9, true, f8, a8));
        }
        return arrayList;
    }

    private static boolean q(e e8) {
        return e8.b().b - e8.b().d / 2.0f >= 0.0f && e8.b() == e8.e();
    }

    private static boolean r(ax.u6.a a8, e e8) {
        int n8 = a8.b();
        if (a8.g()) {
            n8 = a8.a();
        }
        return e8.i().b + e8.i().d / 2.0f <= (float)n8 && e8.i() == e8.l();
    }

    private static e s(List<e> list, float f8, float[] fArray) {
        fArray = com.google.android.material.carousel.f.o(list, f8, fArray);
        return com.google.android.material.carousel.e.o(list.get((int)fArray[1]), list.get((int)fArray[2]), fArray[0]);
    }

    private static e t(e object, int n8, int n9, float f8, int n10, int n11, int n12) {
        ArrayList<e.c> arrayList = new ArrayList<e.c>(((e)object).h());
        arrayList.add(n9, (e.c)arrayList.remove(n8));
        object = new e.b(((e)object).g(), n12);
        for (n8 = 0; n8 < arrayList.size(); ++n8) {
            e.c c8 = (e.c)arrayList.get(n8);
            float f9 = c8.d;
            float f10 = f9 / 2.0f;
            boolean bl = n8 >= n10 && n8 <= n11;
            ((e.b)object).e(f8 + f10, c8.c, f9, bl, c8.e, c8.f);
            f8 += c8.d;
        }
        return ((e.b)object).i();
    }

    private static e u(e e8, float f8, int n8, boolean bl, float f9, c.a a8) {
        if (com.google.android.material.carousel.f$a.a[a8.ordinal()] != 1) {
            return com.google.android.material.carousel.f.w(e8, f8, n8, bl);
        }
        return com.google.android.material.carousel.f.v(e8, f8, n8, bl, f9);
    }

    private static e v(e e8, float f8, int n8, boolean bl, float f9) {
        ArrayList<e.c> arrayList = new ArrayList<e.c>(e8.h());
        e.b b8 = new e.b(e8.g(), n8);
        float f10 = f8 / (float)e8.m();
        if (!bl) {
            f8 = 0.0f;
        }
        for (n8 = 0; n8 < arrayList.size(); ++n8) {
            e.c c8 = (e.c)arrayList.get(n8);
            if (c8.e) {
                b8.e(c8.b, c8.c, c8.d, false, true, c8.f);
                continue;
            }
            boolean bl2 = n8 >= e8.c() && n8 <= e8.j();
            float f11 = c8.d - f10;
            float f12 = com.google.android.material.carousel.c.b(f11, e8.g(), f9);
            float f13 = f11 / 2.0f + f8;
            float f14 = Math.abs(f13 - c8.b);
            float f15 = c8.f;
            float f16 = bl ? f14 : 0.0f;
            if (bl) {
                f14 = 0.0f;
            }
            b8.f(f13, f12, f11, bl2, false, f15, f16, f14);
            f8 += f11;
        }
        return b8.i();
    }

    private static e w(e e8, float f8, int n8, boolean bl) {
        ArrayList<e.c> arrayList = new ArrayList<e.c>(e8.h());
        e.b b8 = new e.b(e8.g(), n8);
        int n9 = bl ? 0 : arrayList.size() - 1;
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            e.c c8 = (e.c)arrayList.get(i8);
            if (c8.e && i8 == n9) {
                b8.e(c8.b, c8.c, c8.d, false, true, c8.f);
                continue;
            }
            float f9 = c8.b;
            f9 = bl ? (f9 += f8) : (f9 -= f8);
            float f10 = bl ? f8 : 0.0f;
            float f11 = bl ? 0.0f : f8;
            boolean bl2 = i8 >= e8.c() && i8 <= e8.j();
            float f12 = c8.c;
            float f13 = c8.d;
            boolean bl3 = c8.e;
            float f14 = bl ? Math.max(0.0f, f13 / 2.0f + f9 - (float)n8) : Math.min(0.0f, f9 - f13 / 2.0f);
            b8.f(f9, f12, f13, bl2, bl3, Math.abs(f14), f10, f11);
        }
        return b8.i();
    }

    private static e x(e e8, float f8, int n8) {
        return com.google.android.material.carousel.f.t(e8, 0, 0, f8, e8.c(), e8.j(), n8);
    }

    e g() {
        return this.a;
    }

    e h() {
        List<e> list = this.c;
        return list.get(list.size() - 1);
    }

    Map<Integer, e> i(int n8, int n9, int n10, boolean bl) {
        List<e> list;
        float f8;
        int n11;
        float f9 = this.a.g();
        HashMap<Integer, e> hashMap = new HashMap<Integer, e>();
        int n12 = 0;
        int n13 = 0;
        while (true) {
            int n14;
            block10: {
                block9: {
                    n14 = -1;
                    if (n12 >= n8) break;
                    n11 = bl ? n8 - n12 - 1 : n12;
                    f8 = n11;
                    if (!bl) {
                        n14 = 1;
                    }
                    if (f8 * f9 * (float)n14 > (float)n10 - this.g) break block9;
                    n14 = n13;
                    if (n12 < n8 - this.c.size()) break block10;
                }
                list = this.c;
                hashMap.put(n11, list.get(ax.W.a.b(n13, 0, list.size() - 1)));
                n14 = n13 + 1;
            }
            ++n12;
            n13 = n14;
        }
        n12 = 0;
        for (n10 = n8 - 1; n10 >= 0; --n10) {
            block12: {
                block11: {
                    n13 = bl ? n8 - n10 - 1 : n10;
                    f8 = n13;
                    if (f8 * f9 * (float)(n11 = bl ? -1 : 1) < (float)n9 + this.f) break block11;
                    n11 = n12;
                    if (n10 >= this.b.size()) break block12;
                }
                list = this.b;
                hashMap.put(n13, list.get(ax.W.a.b(n12, 0, list.size() - 1)));
                n11 = n12 + 1;
            }
            n12 = n11;
        }
        return hashMap;
    }

    public e j(float f8, float f9, float f10) {
        return this.k(f8, f9, f10, false);
    }

    e k(float f8, float f9, float f10, boolean bl) {
        block8: {
            float[] fArray;
            List<e> list;
            block7: {
                float f11;
                block6: {
                    f11 = this.f + f9;
                    float f12 = f10 - this.g;
                    float f13 = this.l().b().g;
                    float f14 = this.h().b().h;
                    float f15 = f11;
                    if (this.f == f13) {
                        f15 = f11 + f13;
                    }
                    f11 = f12;
                    if (this.g == f14) {
                        f11 = f12 - f14;
                    }
                    if (!(f8 < f15)) break block6;
                    f8 = ax.l6.a.b(1.0f, 0.0f, f9, f15, f8);
                    list = this.b;
                    fArray = this.d;
                    break block7;
                }
                if (!(f8 > f11)) break block8;
                f8 = ax.l6.a.b(0.0f, 1.0f, f11, f10, f8);
                list = this.c;
                fArray = this.e;
            }
            if (bl) {
                return this.a(list, f8, fArray);
            }
            return com.google.android.material.carousel.f.s(list, f8, fArray);
        }
        return this.a;
    }

    e l() {
        List<e> list = this.b;
        return list.get(list.size() - 1);
    }
}

