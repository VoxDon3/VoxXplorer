package ax.w1;

import ax.S0.G;
import ax.q1.C2855o;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ax.w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3326d extends AbstractC3327e {
    private long b;
    private long[] c;
    private long[] d;

    public C3326d() {
        super(new C2855o());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    private static Boolean g(G g) {
        return Boolean.valueOf(g.M() == 1);
    }

    private static Object h(G g, int i) {
        if (i == 0) {
            return j(g);
        }
        if (i == 1) {
            return g(g);
        }
        if (i == 2) {
            return n(g);
        }
        if (i == 3) {
            return l(g);
        }
        if (i == 8) {
            return k(g);
        }
        if (i == 10) {
            return m(g);
        }
        if (i != 11) {
            return null;
        }
        return i(g);
    }

    private static Date i(G g) {
        Date date = new Date((long) j(g).doubleValue());
        g.c0(2);
        return date;
    }

    private static Double j(G g) {
        return Double.valueOf(Double.longBitsToDouble(g.F()));
    }

    private static HashMap<String, Object> k(G g) {
        int Q = g.Q();
        HashMap<String, Object> hashMap = new HashMap<>(Q);
        for (int i = 0; i < Q; i++) {
            String n = n(g);
            Object h = h(g, o(g));
            if (h != null) {
                hashMap.put(n, h);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> l(G g) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n = n(g);
            int o = o(g);
            if (o == 9) {
                return hashMap;
            }
            Object h = h(g, o);
            if (h != null) {
                hashMap.put(n, h);
            }
        }
    }

    private static ArrayList<Object> m(G g) {
        int Q = g.Q();
        ArrayList<Object> arrayList = new ArrayList<>(Q);
        for (int i = 0; i < Q; i++) {
            Object h = h(g, o(g));
            if (h != null) {
                arrayList.add(h);
            }
        }
        return arrayList;
    }

    private static String n(G g) {
        int U = g.U();
        int g2 = g.g();
        g.c0(U);
        return new String(g.f(), g2, U);
    }

    private static int o(G g) {
        return g.M();
    }

    @Override // ax.w1.AbstractC3327e
    protected boolean b(G g) {
        return true;
    }

    @Override // ax.w1.AbstractC3327e
    protected boolean c(G g, long j) {
        if (o(g) != 2 || !"onMetaData".equals(n(g)) || g.a() == 0 || o(g) != 8) {
            return false;
        }
        HashMap<String, Object> k = k(g);
        Object obj = k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                    this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.b;
    }

    public long[] e() {
        return this.d;
    }

    public long[] f() {
        return this.c;
    }
}
