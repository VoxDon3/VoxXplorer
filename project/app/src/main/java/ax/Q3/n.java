/*
 * Decompiled with CFR 0.152.
 */
package ax.Q3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import ax.Q3.g;
import ax.Q3.l;
import ax.Q3.m;
import ax.k4.i;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@TargetApi(value=19)
public class n
implements l {
    private static final Bitmap.Config[] d = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null};
    private static final Bitmap.Config[] e = new Bitmap.Config[]{Bitmap.Config.RGB_565};
    private static final Bitmap.Config[] f = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
    private static final Bitmap.Config[] g = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    private final c a = new c();
    private final g<b, Bitmap> b = new g();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap<Bitmap.Config, NavigableMap<Integer, Integer>>();

    private void f(Integer n8, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMap = this.j(bitmap.getConfig());
        Comparable<Integer> comparable = (Integer)navigableMap.get(n8);
        if (comparable != null) {
            if ((Integer)comparable == 1) {
                navigableMap.remove(n8);
                return;
            }
            navigableMap.put(n8, (Integer)comparable - 1);
            return;
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("Tried to decrement empty size, size: ");
        ((StringBuilder)comparable).append(n8);
        ((StringBuilder)comparable).append(", removed: ");
        ((StringBuilder)comparable).append(this.e(bitmap));
        ((StringBuilder)comparable).append(", this: ");
        ((StringBuilder)comparable).append(this);
        throw new NullPointerException(((StringBuilder)comparable).toString());
    }

    private b g(int n8, Bitmap.Config config) {
        b b8 = this.a.e(n8, config);
        for (Bitmap.Config config2 : n.i(config)) {
            Integer n9 = this.j(config2).ceilingKey(n8);
            if (n9 == null || n9 > n8 * 8) continue;
            if (n9 == n8 && !(config2 == null ? config != null : !config2.equals(config))) break;
            this.a.c(b8);
            return this.a.e(n9, config2);
        }
        return b8;
    }

    static String h(int n8, Bitmap.Config config) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(n8);
        stringBuilder.append("](");
        stringBuilder.append(config);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        int n8 = ax.Q3.n$a.a[config.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return new Bitmap.Config[]{config};
                    }
                    return g;
                }
                return f;
            }
            return e;
        }
        return d;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap;
        NavigableMap<Integer, Integer> navigableMap2 = navigableMap = this.c.get(config);
        if (navigableMap == null) {
            navigableMap2 = new TreeMap<Integer, Integer>();
            this.c.put(config, navigableMap2);
        }
        return navigableMap2;
    }

    @Override
    public String a(int n8, int n9, Bitmap.Config config) {
        return n.h(i.f(n8, n9, config), config);
    }

    @Override
    public int b(Bitmap bitmap) {
        return i.g(bitmap);
    }

    @Override
    public void c(Bitmap object) {
        int n8 = i.g((Bitmap)object);
        b b8 = this.a.e(n8, object.getConfig());
        this.b.d(b8, (Bitmap)object);
        object = this.j(object.getConfig());
        Integer n9 = (Integer)object.get(b8.b);
        int n10 = b8.b;
        n8 = 1;
        if (n9 != null) {
            n8 = 1 + n9;
        }
        object.put(n10, n8);
    }

    @Override
    public Bitmap d(int n8, int n9, Bitmap.Config object) {
        Bitmap bitmap = this.b.a((b)(object = this.g(i.f(n8, n9, object), (Bitmap.Config)object)));
        if (bitmap != null) {
            this.f(object.b, bitmap);
            object = bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
            bitmap.reconfigure(n8, n9, object);
        }
        return bitmap;
    }

    @Override
    public String e(Bitmap bitmap) {
        return n.h(i.g(bitmap), bitmap.getConfig());
    }

    @Override
    public Bitmap removeLast() {
        Bitmap bitmap = this.b.f();
        if (bitmap != null) {
            this.f(i.g(bitmap), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.c.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }

    static final class b
    implements m {
        private final c a;
        int b;
        private Bitmap.Config c;

        public b(c c8) {
            this.a = c8;
        }

        @Override
        public void a() {
            this.a.c(this);
        }

        public void b(int n8, Bitmap.Config config) {
            this.b = n8;
            this.c = config;
        }

        public boolean equals(Object object) {
            if (object instanceof b) {
                object = (b)object;
                if (this.b == ((b)object).b && i.c(this.c, ((b)object).c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int n8 = this.b;
            Bitmap.Config config = this.c;
            int n9 = config != null ? config.hashCode() : 0;
            return n8 * 31 + n9;
        }

        public String toString() {
            return n.h(this.b, this.c);
        }
    }

    static class c
    extends ax.Q3.c<b> {
        c() {
        }

        protected b d() {
            return new b(this);
        }

        public b e(int n8, Bitmap.Config config) {
            b b8 = (b)this.b();
            b8.b(n8, config);
            return b8;
        }
    }
}

