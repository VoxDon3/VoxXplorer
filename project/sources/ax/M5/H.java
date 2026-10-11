package ax.M5;

import android.content.Context;
import android.util.SparseIntArray;
import ax.J5.C0748i;
import ax.K5.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class H {
    private final SparseIntArray a = new SparseIntArray();
    private C0748i b;

    public H(C0748i c0748i) {
        C0821p.l(c0748i);
        this.b = c0748i;
    }

    public final int a(Context context, int i) {
        return this.a.get(i, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(Context context, a.f fVar) {
        C0821p.l(context);
        C0821p.l(fVar);
        int i = 0;
        if (!fVar.j()) {
            return 0;
        }
        int k = fVar.k();
        int a = a(context, k);
        if (a != -1) {
            return a;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.a.size()) {
                i = -1;
                break;
            }
            int keyAt = this.a.keyAt(i2);
            if (keyAt > k && this.a.get(keyAt) == 0) {
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.b.h(context, k);
        }
        this.a.put(k, i);
        return i;
    }

    public final void c() {
        this.a.clear();
    }
}
