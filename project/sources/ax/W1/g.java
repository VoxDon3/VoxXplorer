package ax.W1;

import android.text.TextUtils;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.P0.E;
import ax.S0.G;
import ax.S0.InterfaceC0979l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements t {
    private final G a = new G();
    private final b b = new b();

    private static int e(G g) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = g.g();
            String x = g.x();
            i = x == null ? 0 : "STYLE".equals(x) ? 2 : x.startsWith("NOTE") ? 1 : 3;
        }
        g.b0(i2);
        return i;
    }

    private static void f(G g) {
        while (!TextUtils.isEmpty(g.x())) {
        }
    }

    @Override // ax.N1.t
    public /* synthetic */ void a() {
        s.b(this);
    }

    @Override // ax.N1.t
    public /* synthetic */ k b(byte[] bArr, int i, int i2) {
        return s.a(this, bArr, i, i2);
    }

    @Override // ax.N1.t
    public void c(byte[] bArr, int i, int i2, t.b bVar, InterfaceC0979l<ax.N1.e> interfaceC0979l) {
        d n;
        this.a.Z(bArr, i2 + i);
        this.a.b0(i);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.a);
            while (!TextUtils.isEmpty(this.a.x())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int e = e(this.a);
                if (e == 0) {
                    ax.N1.i.c(new j(arrayList2), bVar, interfaceC0979l);
                    return;
                }
                if (e == 1) {
                    f(this.a);
                } else if (e == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.a.x();
                    arrayList.addAll(this.b.d(this.a));
                } else if (e == 3 && (n = e.n(this.a, arrayList)) != null) {
                    arrayList2.add(n);
                }
            }
        } catch (E e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // ax.N1.t
    public int d() {
        return 1;
    }
}
