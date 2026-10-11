/*
 * Decompiled with CFR 0.152.
 */
package ax.W1;

import android.text.TextUtils;
import ax.N1.i;
import ax.N1.k;
import ax.N1.s;
import ax.N1.t;
import ax.P0.E;
import ax.S0.G;
import ax.S0.l;
import ax.W1.b;
import ax.W1.c;
import ax.W1.d;
import ax.W1.e;
import ax.W1.h;
import ax.W1.j;
import java.util.ArrayList;
import java.util.List;

public final class g
implements t {
    private final G a = new G();
    private final b b = new b();

    private static int e(G g8) {
        int n8 = -1;
        int n9 = 0;
        while (n8 == -1) {
            n9 = g8.g();
            String string = g8.x();
            if (string == null) {
                n8 = 0;
                continue;
            }
            if ("STYLE".equals(string)) {
                n8 = 2;
                continue;
            }
            if (string.startsWith("NOTE")) {
                n8 = 1;
                continue;
            }
            n8 = 3;
        }
        g8.b0(n9);
        return n8;
    }

    private static void f(G g8) {
        while (!TextUtils.isEmpty((CharSequence)g8.x())) {
        }
    }

    @Override
    public /* synthetic */ void a() {
        s.b(this);
    }

    @Override
    public /* synthetic */ k b(byte[] byArray, int n8, int n9) {
        return s.a(this, byArray, n8, n9);
    }

    @Override
    public void c(byte[] object, int n8, int n9, t.b b8, l<ax.N1.e> l8) {
        this.a.Z((byte[])object, n9 + n8);
        this.a.b0(n8);
        object = new ArrayList();
        try {
            h.e(this.a);
        }
        catch (E e8) {
            throw new IllegalArgumentException(e8);
        }
        while (!TextUtils.isEmpty((CharSequence)this.a.x())) {
        }
        ArrayList<d> arrayList = new ArrayList<d>();
        while ((n8 = g.e(this.a)) != 0) {
            d d8;
            if (n8 == 1) {
                g.f(this.a);
                continue;
            }
            if (n8 == 2) {
                if (arrayList.isEmpty()) {
                    this.a.x();
                    object.addAll(this.b.d(this.a));
                    continue;
                }
                throw new IllegalArgumentException("A style block was found after the first cue.");
            }
            if (n8 != 3 || (d8 = e.n(this.a, (List<c>)object)) == null) continue;
            arrayList.add(d8);
        }
        i.c(new j(arrayList), b8, l8);
        return;
    }

    @Override
    public int d() {
        return 1;
    }
}

