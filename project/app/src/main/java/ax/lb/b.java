/*
 * Decompiled with CFR 0.152.
 */
package ax.lb;

import ax.lb.f;
import ax.pb.h;
import ax.pb.j0;

public class b
extends f.a {
    public b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\\\\");
        stringBuilder.append(string);
        super(stringBuilder.toString(), 1, new f.e(), -1, 0, 0);
        this.b = 0;
        this.c = 3;
    }

    public h[] j() {
        f.e e8 = (f.e)this.k;
        h[] hArray = new a[e8.b];
        for (int i8 = 0; i8 < e8.b; ++i8) {
            hArray[i8] = new a(this, e8.c[i8]);
        }
        return hArray;
    }

    class a
    extends j0 {
        final b d;

        a(b b8, f.c c8) {
            this.d = b8;
            this.a = c8.b;
            this.b = c8.c;
            this.c = c8.d;
        }
    }
}

