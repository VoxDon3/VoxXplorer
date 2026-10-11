package ax.ec;

import ax.fc.InterfaceC2090a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ax.ec.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1996a implements d {
    private final Map<Object, Object> a = new HashMap();
    private final List<InterfaceC2090a> b = new ArrayList();

    @Override // ax.ec.d
    public <T extends InterfaceC1998c> T a(Class<T> cls) {
        return (T) this.a.get(cls);
    }

    @Override // ax.ec.d
    public Collection<InterfaceC2090a> b() {
        return DesugarCollections.unmodifiableCollection(this.b);
    }

    @Override // ax.ec.d
    public <T> T c(String str, T t) {
        return this.a.containsKey(str) ? (T) this.a.get(str) : t;
    }

    @Override // ax.ec.d
    public final C1996a d(InterfaceC2090a interfaceC2090a) {
        this.b.add(interfaceC2090a);
        return this;
    }

    public d e(InterfaceC1998c interfaceC1998c) {
        this.a.put(interfaceC1998c.getClass(), interfaceC1998c);
        return this;
    }
}
