/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.b6;
import ax.b6.d;
import ax.b6.e;
import ax.b6.k;
import ax.b6.n;
import ax.b6.s;
import ax.b6.t;
import ax.b6.y2;
import java.util.Collections;
import java.util.TreeMap;

public final class b {
    private final TreeMap<Integer, t> a = new TreeMap();
    private final TreeMap<Integer, t> b = new TreeMap();

    private static int a(Z2 object, t t8, s s8) {
        if ((object = ((n)t8).a((Z2)object, Collections.singletonList(s8))) instanceof k) {
            return y2.i(object.f());
        }
        return -1;
    }

    public final void b(Z2 z22, d object) {
        b6 b62 = new b6((d)object);
        for (Integer n8 : this.a.keySet()) {
            e e8 = (e)((d)object).d().clone();
            int n9 = ax.b6.b.a(z22, this.a.get(n8), b62);
            if (n9 != 2 && n9 != -1) continue;
            ((d)object).e(e8);
        }
        for (Integer n8 : this.b.keySet()) {
            ax.b6.b.a(z22, this.b.get(n8), b62);
        }
    }

    public final void c(String serializable, int n8, t t8, String string) {
        block6: {
            block5: {
                block4: {
                    if (!"create".equals(string)) break block4;
                    serializable = this.b;
                    break block5;
                }
                if (!"edit".equals(string)) break block6;
                serializable = this.a;
            }
            int n9 = n8;
            if (((TreeMap)serializable).containsKey(n8)) {
                n9 = (Integer)((TreeMap)serializable).lastKey() + 1;
            }
            ((TreeMap)serializable).put(n9, t8);
            return;
        }
        serializable = new StringBuilder("Unknown callback type: ");
        ((StringBuilder)serializable).append(string);
        throw new IllegalStateException(((StringBuilder)serializable).toString());
    }
}

