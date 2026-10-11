/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.n;
import ax.b6.s;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class a5 {
    private Map<String, Callable<? extends n>> a = new HashMap<String, Callable<? extends n>>();

    public final s a(String string) {
        if (this.a.containsKey(string)) {
            Object object = this.a.get(string);
            try {
                object = object.call();
                return object;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder("Failed to create API implementation: ");
                stringBuilder.append(string);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return s.f;
    }

    public final void b(String string, Callable<? extends n> callable) {
        this.a.put(string, callable);
    }
}

