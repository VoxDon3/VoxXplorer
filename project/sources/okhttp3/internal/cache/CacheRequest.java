package okhttp3.internal.cache;

import ax.xc.InterfaceC3482A;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface CacheRequest {
    void abort();

    InterfaceC3482A body() throws IOException;
}
