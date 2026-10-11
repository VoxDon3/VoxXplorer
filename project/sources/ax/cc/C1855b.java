package ax.cc;

import ax.dc.InterfaceC1963c;
import ax.fc.C2092c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ax.cc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1855b {
    private InterfaceC1963c a;
    private Map<String, Object> b = new HashMap();

    public C1855b(InterfaceC1963c interfaceC1963c) {
        this.a = interfaceC1963c;
    }

    public C1855b a(String str, Object obj) {
        this.b.put(str, obj);
        return this;
    }

    public boolean b(String str) {
        return this.b.containsKey(str);
    }

    public <T> T c(String str) {
        if (b(str)) {
            return (T) this.b.get(str);
        }
        throw new C2092c("The property " + str + " is not available in this runtime");
    }

    public InterfaceC1963c d() {
        return this.a;
    }
}
