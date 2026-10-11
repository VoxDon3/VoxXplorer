package ax.c1;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import ax.N1.t;
import ax.P0.C;
import ax.P0.C0908q;
import ax.P0.C0912v;
import ax.P0.D;
import ax.S0.C0968a;
import ax.S0.M;
import ax.X1.C1141b;
import ax.X1.C1144e;
import ax.X1.C1147h;
import ax.X1.C1149j;
import ax.X1.K;
import ax.Z0.I1;
import ax.q1.InterfaceC2858s;
import ax.q1.r;
import ax.r7.AbstractC2991z;
import ax.u7.C3218f;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class c implements e {
    private static final int[] f = {8, 13, 11, 2, 0, 1, 7};
    private final int a;
    private t.a b;
    private boolean c;
    private int d;
    private final boolean e;

    public c() {
        this(0, true);
    }

    private static void f(int i, List<Integer> list) {
        if (C3218f.k(f, i) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    @SuppressLint({"SwitchIntDef"})
    private r h(int i, C0912v c0912v, List<C0912v> list, M m) {
        if (i == 0) {
            return new C1141b();
        }
        if (i == 1) {
            return new C1144e();
        }
        if (i == 2) {
            return new C1147h();
        }
        if (i == 7) {
            return new ax.J1.f(0, 0L);
        }
        if (i == 8) {
            return i(this.b, this.c, m, c0912v, list, this.d);
        }
        if (i == 11) {
            return j(this.a, this.e, c0912v, list, m, this.b, this.c);
        }
        if (i != 13) {
            return null;
        }
        return new k(c0912v.d, m, this.b, this.c);
    }

    private static ax.K1.h i(t.a aVar, boolean z, M m, C0912v c0912v, List<C0912v> list, int i) {
        int i2 = m(c0912v) ? 4 : 0;
        if (!z) {
            aVar = t.a.a;
            i2 |= 32;
        }
        t.a aVar2 = aVar;
        int l = i2 | ax.K1.h.l(i);
        if (list == null) {
            list = AbstractC2991z.z();
        }
        return new ax.K1.h(aVar2, l, m, null, list, null);
    }

    private static K j(int i, boolean z, C0912v c0912v, List<C0912v> list, M m, t.a aVar, boolean z2) {
        int i2;
        int i3 = i | 16;
        if (list != null) {
            i3 = i | 48;
        } else {
            list = z ? Collections.singletonList(new C0912v.b().y0("application/cea-608").P()) : Collections.EMPTY_LIST;
        }
        String str = c0912v.k;
        if (!TextUtils.isEmpty(str)) {
            if (!D.b(str, "audio/mp4a-latm")) {
                i3 |= 2;
            }
            if (!D.b(str, "video/avc")) {
                i3 |= 4;
            }
        }
        if (z2) {
            i2 = 0;
        } else {
            aVar = t.a.a;
            i2 = 1;
        }
        return new K(2, i2, aVar, m, new C1149j(i3, list), 112800);
    }

    private static boolean m(C0912v c0912v) {
        C c = c0912v.l;
        if (c == null) {
            return false;
        }
        for (int i = 0; i < c.e(); i++) {
            if (c.d(i) instanceof h) {
                return !((h) r2).c.isEmpty();
            }
        }
        return false;
    }

    private static boolean o(r rVar, InterfaceC2858s interfaceC2858s) throws IOException {
        try {
            boolean c = rVar.c(interfaceC2858s);
            interfaceC2858s.m();
            return c;
        } catch (EOFException unused) {
            interfaceC2858s.m();
            return false;
        } catch (Throwable th) {
            interfaceC2858s.m();
            throw th;
        }
    }

    @Override // ax.c1.e
    public C0912v d(C0912v c0912v) {
        String str;
        if (!this.c || !this.b.b(c0912v)) {
            return c0912v;
        }
        C0912v.b Y = c0912v.b().y0("application/x-media3-cues").Y(this.b.a(c0912v));
        StringBuilder sb = new StringBuilder();
        sb.append(c0912v.o);
        if (c0912v.k != null) {
            str = " " + c0912v.k;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        return Y.U(sb.toString()).C0(Long.MAX_VALUE).P();
    }

    @Override // ax.c1.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1804a e(Uri uri, C0912v c0912v, List<C0912v> list, M m, Map<String, List<String>> map, InterfaceC2858s interfaceC2858s, I1 i1) throws IOException {
        int a = C0908q.a(c0912v.o);
        int b = C0908q.b(map);
        int c = C0908q.c(uri);
        int[] iArr = f;
        ArrayList arrayList = new ArrayList(iArr.length);
        f(a, arrayList);
        f(b, arrayList);
        f(c, arrayList);
        for (int i : iArr) {
            f(i, arrayList);
        }
        interfaceC2858s.m();
        r rVar = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            r rVar2 = (r) C0968a.e(h(intValue, c0912v, list, m));
            if (o(rVar2, interfaceC2858s)) {
                return new C1804a(rVar2, c0912v, m, this.b, this.c);
            }
            if (rVar == null && (intValue == a || intValue == b || intValue == c || intValue == 11)) {
                rVar = rVar2;
            }
        }
        return new C1804a((r) C0968a.e(rVar), c0912v, m, this.b, this.c);
    }

    @Override // ax.c1.e
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c c(boolean z) {
        this.c = z;
        return this;
    }

    @Override // ax.c1.e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b(int i) {
        this.d = i;
        return this;
    }

    @Override // ax.c1.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public c a(t.a aVar) {
        this.b = aVar;
        return this;
    }

    public c(int i, boolean z) {
        this.a = i;
        this.e = z;
        this.b = new ax.N1.h();
    }
}
