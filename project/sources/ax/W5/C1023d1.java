package ax.W5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.W5.d1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1023d1 extends LinkedHashMap {
    private static final C1023d1 c0;
    private boolean q;

    static {
        C1023d1 c1023d1 = new C1023d1();
        c0 = c1023d1;
        c1023d1.q = false;
    }

    private C1023d1() {
        this.q = true;
    }

    public static C1023d1 b() {
        return c0;
    }

    private static int j(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = O0.d;
        int length = bArr.length;
        int b = O0.b(length, bArr, 0, length);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    private final void k() {
        if (!this.q) {
            throw new UnsupportedOperationException();
        }
    }

    public final C1023d1 c() {
        return isEmpty() ? new C1023d1() : new C1023d1(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        k();
        super.clear();
    }

    public final void d() {
        this.q = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void f(C1023d1 c1023d1) {
        k();
        if (c1023d1.isEmpty()) {
            return;
        }
        putAll(c1023d1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += j(entry.getValue()) ^ j(entry.getKey());
        }
        return i;
    }

    public final boolean i() {
        return this.q;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        k();
        byte[] bArr = O0.d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        k();
        for (Object obj : map.keySet()) {
            byte[] bArr = O0.d;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        k();
        return super.remove(obj);
    }

    private C1023d1(Map map) {
        super(map);
        this.q = true;
    }
}
