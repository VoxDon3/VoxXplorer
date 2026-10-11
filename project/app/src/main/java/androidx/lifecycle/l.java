/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import ax.G0.p;
import ax.Gb.g;
import ax.Tb.k;
import ax.Y.c;
import ax.sb.q;
import ax.tb.F;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class l {
    public static final a f = new a(null);
    private static final Class<? extends Object>[] g = new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    private final Map<String, Object> a;
    private final Map<String, a.c> b;
    private final Map<String, Object> c;
    private final Map<String, k<Object>> d;
    private final a.c e;

    public l() {
        this.a = new LinkedHashMap<String, Object>();
        this.b = new LinkedHashMap<String, a.c>();
        this.c = new LinkedHashMap<String, Object>();
        this.d = new LinkedHashMap<String, k<Object>>();
        this.e = new p(this);
    }

    public l(Map<String, ? extends Object> map) {
        ax.Gb.l.f(map, "initialState");
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap<String, a.c>();
        this.c = new LinkedHashMap<String, Object>();
        this.d = new LinkedHashMap<String, k<Object>>();
        this.e = new p(this);
        linkedHashMap.putAll(map);
    }

    public static /* synthetic */ Bundle a(l l8) {
        return l.d(l8);
    }

    private static final Bundle d(l l8) {
        ax.Gb.l.f(l8, "this$0");
        for (Map.Entry<String, a.c> object2 : F.p(l8.b).entrySet()) {
            l8.e(object2.getKey(), object2.getValue().a());
        }
        Object object = l8.a.keySet();
        ArrayList arrayList = new ArrayList(object.size());
        ArrayList<Object> arrayList2 = new ArrayList<Object>(arrayList.size());
        Iterator<String> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            arrayList.add(object);
            arrayList2.add(l8.a.get(object));
        }
        return ax.Y.c.a(q.a("keys", arrayList), q.a("values", arrayList2));
    }

    public final a.c c() {
        return this.e;
    }

    public final <T> void e(String object, T t8) {
        ax.Gb.l.f(object, "key");
        if (f.b(t8)) {
            ax.G0.l l8 = this.c.get(object);
            l8 = l8 instanceof ax.G0.l ? (ax.G0.l)l8 : null;
            if (l8 != null) {
                l8.n(t8);
            } else {
                this.a.put((String)object, t8);
            }
            object = this.d.get(object);
            if (object == null) {
                return;
            }
            object.setValue(t8);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Can't put value with type ");
        ax.Gb.l.c(t8);
        ((StringBuilder)object).append(t8.getClass());
        ((StringBuilder)object).append(" into saved state");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final l a(Bundle object, Bundle object2) {
            if (object == null) {
                if (object2 == null) {
                    return new l();
                }
                object = new HashMap();
                for (String string : object2.keySet()) {
                    ax.Gb.l.e(string, "key");
                    object.put(string, object2.get(string));
                }
                return new l((Map<String, ? extends Object>)object);
            }
            object2 = object.getParcelableArrayList("keys");
            object = object.getParcelableArrayList("values");
            if (object2 != null && object != null && ((ArrayList)object2).size() == ((ArrayList)object).size()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int n8 = ((ArrayList)object2).size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    Object e8 = ((ArrayList)object2).get(i8);
                    ax.Gb.l.d(e8, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String)e8, ((ArrayList)object).get(i8));
                }
                return new l(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }

        public final boolean b(Object object) {
            if (object == null) {
                return true;
            }
            for (Class clazz : g) {
                ax.Gb.l.c(clazz);
                if (!clazz.isInstance(object)) continue;
                return true;
            }
            return false;
        }
    }
}

