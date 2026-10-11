package ax.U0;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v {
    private final Map<String, String> a = new HashMap();
    private Map<String, String> b;

    public synchronized Map<String, String> a() {
        try {
            if (this.b == null) {
                this.b = DesugarCollections.unmodifiableMap(new HashMap(this.a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
