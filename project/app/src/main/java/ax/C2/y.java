/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import ax.o2.h;

public final class y
implements h.c {
    public final Context a;

    public /* synthetic */ y(Context context) {
        this.a = context;
    }

    @Override
    public final h a(h.b b8) {
        return WorkDatabase.a.a(this.a, b8);
    }
}

