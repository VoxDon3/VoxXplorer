/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.cache;

import ax.xc.A;
import java.io.IOException;

public interface CacheRequest {
    public void abort();

    public A body() throws IOException;
}

