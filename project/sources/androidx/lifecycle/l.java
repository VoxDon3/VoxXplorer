package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import ax.tb.C3115F;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class l {
    public static final a f = new a(null);
    private static final Class<? extends Object>[] g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    private final Map<String, Object> a;
    private final Map<String, a.c> b;
    private final Map<String, Object> c;
    private final Map<String, ax.Tb.k<Object>> d;
    private final a.c e;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final l a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new l();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    ax.Gb.l.e(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new l(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                ax.Gb.l.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new l(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : l.g) {
                ax.Gb.l.c(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public l(Map<String, ? extends Object> map) {
        ax.Gb.l.f(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a.c() { // from class: ax.G0.p
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d;
                d = androidx.lifecycle.l.d(androidx.lifecycle.l.this);
                return d;
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(l lVar) {
        ax.Gb.l.f(lVar, "this$0");
        for (Map.Entry entry : C3115F.p(lVar.b).entrySet()) {
            lVar.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = lVar.a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(lVar.a.get(str));
        }
        return ax.Y.c.a(ax.sb.q.a("keys", arrayList), ax.sb.q.a("values", arrayList2));
    }

    public final a.c c() {
        return this.e;
    }

    public final <T> void e(String str, T t) {
        ax.Gb.l.f(str, "key");
        if (!f.b(t)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            ax.Gb.l.c(t);
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj = this.c.get(str);
        ax.G0.l lVar = obj instanceof ax.G0.l ? (ax.G0.l) obj : null;
        if (lVar != null) {
            lVar.n(t);
        } else {
            this.a.put(str, t);
        }
        ax.Tb.k<Object> kVar = this.d.get(str);
        if (kVar == null) {
            return;
        }
        kVar.setValue(t);
    }

    public l() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a.c() { // from class: ax.G0.p
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle d;
                d = androidx.lifecycle.l.d(androidx.lifecycle.l.this);
                return d;
            }
        };
    }
}
