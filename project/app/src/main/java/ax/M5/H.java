/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.Context;
import android.util.SparseIntArray;
import ax.J5.i;
import ax.K5.a;
import ax.M5.p;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class H {
    private final SparseIntArray a = new SparseIntArray();
    private i b;

    public H(i i8) {
        p.l(i8);
        this.b = i8;
    }

    public final int a(Context context, int n8) {
        return this.a.get(n8, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(Context context, a.f f8) {
        int n8;
        int n9;
        int n10;
        block4: {
            p.l(context);
            p.l(f8);
            boolean bl = f8.j();
            n10 = 0;
            if (!bl) {
                return 0;
            }
            n9 = f8.k();
            n8 = this.a(context, n9);
            if (n8 != -1) {
                return n8;
            }
            for (n8 = 0; n8 < this.a.size(); ++n8) {
                int n11 = this.a.keyAt(n8);
                if (n11 <= n9 || this.a.get(n11) != 0) continue;
                n8 = n10;
                break block4;
            }
            n8 = -1;
        }
        n10 = n8;
        if (n8 == -1) {
            n10 = this.b.h(context, n9);
        }
        this.a.put(n9, n10);
        return n10;
    }

    public final void c() {
        this.a.clear();
    }
}

