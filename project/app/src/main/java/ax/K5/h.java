/*
 * Decompiled with CFR 0.152.
 */
package ax.K5;

import ax.K5.l;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

public abstract class h<R extends l> {
    public abstract void a(a var1);

    @ResultIgnorabilityUnspecified
    public abstract R b(long var1, TimeUnit var3);

    public static interface a {
        public void a(Status var1);
    }
}

