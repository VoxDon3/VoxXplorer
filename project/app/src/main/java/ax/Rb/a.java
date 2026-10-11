/*
 * Decompiled with CFR 0.152.
 */
package ax.Rb;

import android.os.Looper;
import ax.Qb.D0;
import ax.Rb.c;
import ax.Rb.e;
import ax.Vb.t;
import java.util.List;

public final class a
implements t {
    @Override
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override
    public D0 b(List<? extends t> looper) {
        looper = Looper.getMainLooper();
        if (looper != null) {
            return new c(e.a(looper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override
    public int c() {
        return 0x3FFFFFFF;
    }
}

