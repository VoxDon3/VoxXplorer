/*
 * Decompiled with CFR 0.152.
 */
package ax.uc;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

public final class b
implements ThreadFactory {
    public final String a;
    public final boolean b;

    public /* synthetic */ b(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }

    @Override
    public final Thread newThread(Runnable runnable2) {
        return Util.b(this.a, this.b, runnable2);
    }
}

