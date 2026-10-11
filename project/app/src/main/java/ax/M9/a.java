/*
 * Decompiled with CFR 0.152.
 */
package ax.M9;

import ax.M9.f;
import ax.S9.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a
extends ax.P9.c {
    protected Map<String, Object> e = new HashMap<String, Object>();

    public a(String string, f f8, List<c> list) {
        super(string, f8, list);
    }

    protected <T> T q(String string) {
        return (T)this.e.get(string);
    }

    protected boolean r(String string) {
        return this.e.containsKey(string);
    }
}

