/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import android.content.Context;
import androidx.work.a;
import ax.B2.i;
import ax.B2.s;
import ax.r2.a;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer
implements a<s> {
    private static final String a = i.i("WrkMgrInitializer");

    @Override
    public List<Class<? extends a<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    public s c(Context context) {
        i.e().a(a, "Initializing WorkManager with default configuration.");
        s.d(context, new a.b().a());
        return s.c(context);
    }
}

