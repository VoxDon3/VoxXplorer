package com.google.android.material.carousel;

import ax.l6.C2472a;
import ax.u6.InterfaceC3212a;
import com.google.android.material.carousel.c;
import com.google.android.material.carousel.e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class f {
    private final e a;
    private final List<e> b;
    private final List<e> c;
    private final float[] d;
    private final float[] e;
    private final float f;
    private final float g;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.a.values().length];
            a = iArr;
            try {
                iArr[c.a.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private f(e eVar, List<e> list, List<e> list2) {
        this.a = eVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        float f = list.get(list.size() - 1).d().a - eVar.d().a;
        this.f = f;
        float f2 = eVar.k().a - list2.get(list2.size() - 1).k().a;
        this.g = f2;
        this.d = m(f, list, true);
        this.e = m(f2, list2, false);
    }

    private e a(List<e> list, float f, float[] fArr) {
        float[] o = o(list, f, fArr);
        return o[0] >= 0.5f ? list.get((int) o[2]) : list.get((int) o[1]);
    }

    private static int b(e eVar, float f) {
        for (int j = eVar.j(); j < eVar.h().size(); j++) {
            if (f == eVar.h().get(j).c) {
                return j;
            }
        }
        return eVar.h().size() - 1;
    }

    private static int c(e eVar) {
        for (int i = 0; i < eVar.h().size(); i++) {
            if (!eVar.h().get(i).e) {
                return i;
            }
        }
        return -1;
    }

    private static int d(e eVar, float f) {
        for (int c = eVar.c() - 1; c >= 0; c--) {
            if (f == eVar.h().get(c).c) {
                return c;
            }
        }
        return 0;
    }

    private static int e(e eVar) {
        for (int size = eVar.h().size() - 1; size >= 0; size--) {
            if (!eVar.h().get(size).e) {
                return size;
            }
        }
        return -1;
    }

    static f f(InterfaceC3212a interfaceC3212a, e eVar, float f, float f2, float f3, c.a aVar) {
        return new f(eVar, p(interfaceC3212a, eVar, f, f2, aVar), n(interfaceC3212a, eVar, f, f3, aVar));
    }

    private static float[] m(float f, List<e> list, boolean z) {
        int size = list.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            e eVar = list.get(i2);
            e eVar2 = list.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? eVar2.d().a - eVar.d().a : eVar.k().a - eVar2.k().a) / f);
            i++;
        }
        return fArr;
    }

    private static List<e> n(InterfaceC3212a interfaceC3212a, e eVar, float f, float f2, c.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int e = e(eVar);
        int a2 = interfaceC3212a.g() ? interfaceC3212a.a() : interfaceC3212a.b();
        if (!r(interfaceC3212a, eVar) && e != -1) {
            int j = e - eVar.j();
            float f3 = eVar.d().b - (eVar.d().d / 2.0f);
            if (j <= 0 && eVar.i().f > 0.0f) {
                arrayList.add(x(eVar, (f3 - eVar.i().f) - f2, a2));
                return arrayList;
            }
            int i = 0;
            float f4 = 0.0f;
            while (i < j) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int i2 = e - i;
                float f5 = f4 + eVar.h().get(i2).f;
                int i3 = i2 + 1;
                int i4 = a2;
                e t = t(eVar2, e, i3 < eVar.h().size() ? d(eVar2, eVar.h().get(i3).c) + 1 : 0, f3 - f5, eVar.c() + i + 1, eVar.j() + i + 1, i4);
                if (i == j - 1 && f2 > 0.0f) {
                    t = u(t, f2, i4, false, f, aVar);
                    i4 = i4;
                }
                arrayList.add(t);
                i++;
                a2 = i4;
                f4 = f5;
            }
        } else if (f2 > 0.0f) {
            arrayList.add(u(eVar, f2, a2, false, f, aVar));
        }
        return arrayList;
    }

    private static float[] o(List<e> list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{C2472a.b(0.0f, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<e> p(InterfaceC3212a interfaceC3212a, e eVar, float f, float f2, c.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int c = c(eVar);
        int a2 = interfaceC3212a.g() ? interfaceC3212a.a() : interfaceC3212a.b();
        if (!q(eVar) && c != -1) {
            int c2 = eVar.c() - c;
            float f3 = eVar.d().b - (eVar.d().d / 2.0f);
            if (c2 <= 0 && eVar.b().f > 0.0f) {
                arrayList.add(x(eVar, f3 + eVar.b().f + f2, a2));
                return arrayList;
            }
            float f4 = 0.0f;
            for (int i = 0; i < c2; i++) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int i2 = c + i;
                int size = eVar.h().size() - 1;
                f4 += eVar.h().get(i2).f;
                int i3 = i2 - 1;
                if (i3 >= 0) {
                    size = b(eVar2, eVar.h().get(i3).c) - 1;
                }
                int i4 = a2;
                e t = t(eVar2, c, size, f3 + f4, (eVar.c() - i) - 1, (eVar.j() - i) - 1, i4);
                a2 = i4;
                if (i == c2 - 1 && f2 > 0.0f) {
                    t = u(t, f2, a2, true, f, aVar);
                }
                arrayList.add(t);
            }
        } else if (f2 > 0.0f) {
            arrayList.add(u(eVar, f2, a2, true, f, aVar));
        }
        return arrayList;
    }

    private static boolean q(e eVar) {
        return eVar.b().b - (eVar.b().d / 2.0f) >= 0.0f && eVar.b() == eVar.e();
    }

    private static boolean r(InterfaceC3212a interfaceC3212a, e eVar) {
        int b = interfaceC3212a.b();
        if (interfaceC3212a.g()) {
            b = interfaceC3212a.a();
        }
        return eVar.i().b + (eVar.i().d / 2.0f) <= ((float) b) && eVar.i() == eVar.l();
    }

    private static e s(List<e> list, float f, float[] fArr) {
        float[] o = o(list, f, fArr);
        return e.o(list.get((int) o[1]), list.get((int) o[2]), o[0]);
    }

    private static e t(e eVar, int i, int i2, float f, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(eVar.h());
        arrayList.add(i2, (e.c) arrayList.remove(i));
        e.b bVar = new e.b(eVar.g(), i5);
        int i6 = 0;
        while (i6 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i6);
            float f2 = cVar.d;
            bVar.e(f + (f2 / 2.0f), cVar.c, f2, i6 >= i3 && i6 <= i4, cVar.e, cVar.f);
            f += cVar.d;
            i6++;
        }
        return bVar.i();
    }

    private static e u(e eVar, float f, int i, boolean z, float f2, c.a aVar) {
        return a.a[aVar.ordinal()] != 1 ? w(eVar, f, i, z) : v(eVar, f, i, z, f2);
    }

    private static e v(e eVar, float f, int i, boolean z, float f2) {
        ArrayList arrayList = new ArrayList(eVar.h());
        e.b bVar = new e.b(eVar.g(), i);
        float m = f / eVar.m();
        float f3 = z ? f : 0.0f;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i2);
            if (cVar.e) {
                bVar.e(cVar.b, cVar.c, cVar.d, false, true, cVar.f);
            } else {
                boolean z2 = i2 >= eVar.c() && i2 <= eVar.j();
                float f4 = cVar.d - m;
                float b = c.b(f4, eVar.g(), f2);
                float f5 = (f4 / 2.0f) + f3;
                float abs = Math.abs(f5 - cVar.b);
                bVar.f(f5, b, f4, z2, false, cVar.f, z ? abs : 0.0f, z ? 0.0f : abs);
                f3 += f4;
            }
            i2++;
        }
        return bVar.i();
    }

    private static e w(e eVar, float f, int i, boolean z) {
        ArrayList arrayList = new ArrayList(eVar.h());
        e.b bVar = new e.b(eVar.g(), i);
        int size = z ? 0 : arrayList.size() - 1;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i2);
            if (cVar.e && i2 == size) {
                bVar.e(cVar.b, cVar.c, cVar.d, false, true, cVar.f);
            } else {
                float f2 = cVar.b;
                float f3 = z ? f2 + f : f2 - f;
                float f4 = z ? f : 0.0f;
                float f5 = z ? 0.0f : f;
                boolean z2 = i2 >= eVar.c() && i2 <= eVar.j();
                float f6 = f3;
                float f7 = cVar.c;
                float f8 = cVar.d;
                bVar.f(f6, f7, f8, z2, cVar.e, Math.abs(z ? Math.max(0.0f, ((f8 / 2.0f) + f6) - i) : Math.min(0.0f, f6 - (f8 / 2.0f))), f4, f5);
            }
            i2++;
        }
        return bVar.i();
    }

    private static e x(e eVar, float f, int i) {
        return t(eVar, 0, 0, f, eVar.c(), eVar.j(), i);
    }

    e g() {
        return this.a;
    }

    e h() {
        return this.c.get(r0.size() - 1);
    }

    Map<Integer, e> i(int i, int i2, int i3, boolean z) {
        float g = this.a.g();
        HashMap hashMap = new HashMap();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= i) {
                break;
            }
            int i6 = z ? (i - i4) - 1 : i4;
            if (i6 * g * (z ? -1 : 1) > i3 - this.g || i4 >= i - this.c.size()) {
                Integer valueOf = Integer.valueOf(i6);
                List<e> list = this.c;
                hashMap.put(valueOf, list.get(ax.W.a.b(i5, 0, list.size() - 1)));
                i5++;
            }
            i4++;
        }
        int i7 = 0;
        for (int i8 = i - 1; i8 >= 0; i8--) {
            int i9 = z ? (i - i8) - 1 : i8;
            if (i9 * g * (z ? -1 : 1) < i2 + this.f || i8 < this.b.size()) {
                Integer valueOf2 = Integer.valueOf(i9);
                List<e> list2 = this.b;
                hashMap.put(valueOf2, list2.get(ax.W.a.b(i7, 0, list2.size() - 1)));
                i7++;
            }
        }
        return hashMap;
    }

    public e j(float f, float f2, float f3) {
        return k(f, f2, f3, false);
    }

    e k(float f, float f2, float f3, boolean z) {
        float b;
        List<e> list;
        float[] fArr;
        float f4 = this.f + f2;
        float f5 = f3 - this.g;
        float f6 = l().b().g;
        float f7 = h().b().h;
        if (this.f == f6) {
            f4 += f6;
        }
        if (this.g == f7) {
            f5 -= f7;
        }
        if (f < f4) {
            b = C2472a.b(1.0f, 0.0f, f2, f4, f);
            list = this.b;
            fArr = this.d;
        } else {
            if (f <= f5) {
                return this.a;
            }
            b = C2472a.b(0.0f, 1.0f, f5, f3, f);
            list = this.c;
            fArr = this.e;
        }
        return z ? a(list, b, fArr) : s(list, b, fArr);
    }

    e l() {
        return this.b.get(r0.size() - 1);
    }
}
