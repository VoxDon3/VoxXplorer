/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.net.Uri;
import ax.U0.k;
import ax.U0.z;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface g
extends ax.P0.k {
    public Uri b();

    public void close() throws IOException;

    public void d(z var1);

    public long f(k var1) throws IOException;

    public Map<String, List<String>> l();

    public static interface a {
        public g a();
    }
}

