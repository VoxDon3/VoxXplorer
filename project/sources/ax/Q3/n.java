package ax.Q3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import okhttp3.HttpUrl;

@TargetApi(19)
/* loaded from: classes.dex */
public class n implements l {
    private static final Bitmap.Config[] d = {Bitmap.Config.ARGB_8888, null};
    private static final Bitmap.Config[] e = {Bitmap.Config.RGB_565};
    private static final Bitmap.Config[] f = {Bitmap.Config.ARGB_4444};
    private static final Bitmap.Config[] g = {Bitmap.Config.ALPHA_8};
    private final c a = new c();
    private final g<b, Bitmap> b = new g<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements m {
        private final c a;
        int b;
        private Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // ax.Q3.m
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.b = i;
            this.c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && ax.k4.i.c(this.c, bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.h(this.b, this.c);
        }
    }

    static class c extends ax.Q3.c<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.Q3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b b = b();
            b.b(i, config);
            return b;
        }
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j = j(bitmap.getConfig());
        Integer num2 = j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j.remove(num);
                return;
            } else {
                j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    private b g(int i, Bitmap.Config config) {
        b e2 = this.a.e(i, config);
        Bitmap.Config[] i2 = i(config);
        int length = i2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            Bitmap.Config config2 = i2[i3];
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i3++;
            } else if (ceilingKey.intValue() != i || (config2 != null ? !config2.equals(config) : config != null)) {
                this.a.c(e2);
                return this.a.e(ceilingKey.intValue(), config2);
            }
        }
        return e2;
    }

    static String h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        int i = a.a[config.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new Bitmap.Config[]{config} : g : f : e : d;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(config, treeMap);
        return treeMap;
    }

    @Override // ax.Q3.l
    public String a(int i, int i2, Bitmap.Config config) {
        return h(ax.k4.i.f(i, i2, config), config);
    }

    @Override // ax.Q3.l
    public int b(Bitmap bitmap) {
        return ax.k4.i.g(bitmap);
    }

    @Override // ax.Q3.l
    public void c(Bitmap bitmap) {
        b e2 = this.a.e(ax.k4.i.g(bitmap), bitmap.getConfig());
        this.b.d(e2, bitmap);
        NavigableMap<Integer, Integer> j = j(bitmap.getConfig());
        Integer num = j.get(Integer.valueOf(e2.b));
        j.put(Integer.valueOf(e2.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // ax.Q3.l
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        b g2 = g(ax.k4.i.f(i, i2, config), config);
        Bitmap a2 = this.b.a(g2);
        if (a2 != null) {
            f(Integer.valueOf(g2.b), a2);
            a2.reconfigure(i, i2, a2.getConfig() != null ? a2.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return a2;
    }

    @Override // ax.Q3.l
    public String e(Bitmap bitmap) {
        return h(ax.k4.i.g(bitmap), bitmap.getConfig());
    }

    @Override // ax.Q3.l
    public Bitmap removeLast() {
        Bitmap f2 = this.b.f();
        if (f2 != null) {
            f(Integer.valueOf(ax.k4.i.g(f2)), f2);
        }
        return f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), HttpUrl.FRAGMENT_ENCODE_SET);
        }
        sb.append(")}");
        return sb.toString();
    }
}
