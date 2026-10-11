/*
 * Decompiled with CFR 0.152.
 */
package ax.ec;

import ax.ec.c;
import ax.ec.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a
implements d {
    private final Map<Object, Object> a = new HashMap<Object, Object>();
    private final List<ax.fc.a> b = new ArrayList<ax.fc.a>();

    @Override
    public <T extends c> T a(Class<T> clazz) {
        return (T)((c)this.a.get(clazz));
    }

    @Override
    public Collection<ax.fc.a> b() {
        return java.util.DesugarCollections.unmodifiableCollection(this.b);
    }

    @Override
    public <T> T c(String string, T t8) {
        if (this.a.containsKey(string)) {
            return (T)this.a.get(string);
        }
        return t8;
    }

    @Override
    public final a d(ax.fc.a a8) {
        this.b.add(a8);
        return this;
    }

    public d e(c c8) {
        this.a.put(c8.getClass(), c8);
        return this;
    }
}

