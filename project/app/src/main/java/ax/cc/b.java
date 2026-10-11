/*
 * Decompiled with CFR 0.152.
 */
package ax.cc;

import ax.fc.c;
import java.util.HashMap;
import java.util.Map;

public class b {
    private ax.dc.c a;
    private Map<String, Object> b = new HashMap<String, Object>();

    public b(ax.dc.c c8) {
        this.a = c8;
    }

    public b a(String string, Object object) {
        this.b.put(string, object);
        return this;
    }

    public boolean b(String string) {
        return this.b.containsKey(string);
    }

    public <T> T c(String string) {
        if (this.b(string)) {
            return (T)this.b.get(string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The property ");
        stringBuilder.append(string);
        stringBuilder.append(" is not available in this runtime");
        throw new c(stringBuilder.toString());
    }

    public ax.dc.c d() {
        return this.a;
    }
}

