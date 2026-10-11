package ax.b6;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: ax.b6.a5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1510a5 {
    private Map<String, Callable<? extends AbstractC1619n>> a = new HashMap();

    public final InterfaceC1658s a(String str) {
        if (!this.a.containsKey(str)) {
            return InterfaceC1658s.f;
        }
        try {
            return this.a.get(str).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable<? extends AbstractC1619n> callable) {
        this.a.put(str, callable);
    }
}
