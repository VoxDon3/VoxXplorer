/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import java.util.HashMap;
import java.util.Map;

public final class v {
    private final Map<String, String> a = new HashMap<String, String>();
    private Map<String, String> b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Map<String, String> a() {
        synchronized (this) {
            try {
                if (this.b != null) return this.b;
                Map<String, String> map = new Map<String, String>(this.a);
                this.b = java.util.DesugarCollections.unmodifiableMap(map);
                return this.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

