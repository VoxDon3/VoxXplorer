/*
 * Decompiled with CFR 0.152.
 */
package ax.w1;

import ax.S0.G;
import ax.q1.o;
import ax.w1.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class d
extends e {
    private long b = -9223372036854775807L;
    private long[] c = new long[0];
    private long[] d = new long[0];

    public d() {
        super(new o());
    }

    private static Boolean g(G g8) {
        int n8 = g8.M();
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        return bl;
    }

    private static Object h(G g8, int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 8) {
                            if (n8 != 10) {
                                if (n8 != 11) {
                                    return null;
                                }
                                return ax.w1.d.i(g8);
                            }
                            return ax.w1.d.m(g8);
                        }
                        return ax.w1.d.k(g8);
                    }
                    return ax.w1.d.l(g8);
                }
                return ax.w1.d.n(g8);
            }
            return ax.w1.d.g(g8);
        }
        return ax.w1.d.j(g8);
    }

    private static Date i(G g8) {
        Date date = new Date((long)ax.w1.d.j(g8).doubleValue());
        g8.c0(2);
        return date;
    }

    private static Double j(G g8) {
        return Double.longBitsToDouble(g8.F());
    }

    private static HashMap<String, Object> k(G g8) {
        int n8 = g8.Q();
        HashMap<String, Object> hashMap = new HashMap<String, Object>(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            String string = ax.w1.d.n(g8);
            Object object = ax.w1.d.h(g8, ax.w1.d.o(g8));
            if (object == null) continue;
            hashMap.put(string, object);
        }
        return hashMap;
    }

    private static HashMap<String, Object> l(G g8) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        while (true) {
            String string = ax.w1.d.n(g8);
            int n8 = ax.w1.d.o(g8);
            if (n8 == 9) {
                return hashMap;
            }
            Object object = ax.w1.d.h(g8, n8);
            if (object == null) continue;
            hashMap.put(string, object);
        }
    }

    private static ArrayList<Object> m(G g8) {
        int n8 = g8.Q();
        ArrayList<Object> arrayList = new ArrayList<Object>(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = ax.w1.d.h(g8, ax.w1.d.o(g8));
            if (object == null) continue;
            arrayList.add(object);
        }
        return arrayList;
    }

    private static String n(G g8) {
        int n8 = g8.U();
        int n9 = g8.g();
        g8.c0(n8);
        return new String(g8.f(), n9, n8);
    }

    private static int o(G g8) {
        return g8.M();
    }

    @Override
    protected boolean b(G g8) {
        return true;
    }

    @Override
    protected boolean c(G object, long l8) {
        double d8;
        if (ax.w1.d.o((G)object) != 2) {
            return false;
        }
        if (!"onMetaData".equals(ax.w1.d.n((G)object))) {
            return false;
        }
        if (((G)object).a() == 0) {
            return false;
        }
        if (ax.w1.d.o((G)object) != 8) {
            return false;
        }
        Object object2 = (object = ax.w1.d.k((G)object)).get("duration");
        if (object2 instanceof Double && (d8 = ((Double)object2).doubleValue()) > 0.0) {
            this.b = (long)(d8 * 1000000.0);
        }
        if ((object = object.get("keyframes")) instanceof Map) {
            object2 = (Map)object;
            object = object2.get("filepositions");
            object2 = object2.get("times");
            if (object instanceof List && object2 instanceof List) {
                object = (List)object;
                List list = (List)object2;
                int n8 = list.size();
                this.c = new long[n8];
                this.d = new long[n8];
                for (int i8 = 0; i8 < n8; ++i8) {
                    Object e8 = object.get(i8);
                    object2 = list.get(i8);
                    if (object2 instanceof Double && e8 instanceof Double) {
                        this.c[i8] = (long)((Double)object2 * 1000000.0);
                        this.d[i8] = ((Double)e8).longValue();
                        continue;
                    }
                    this.c = new long[0];
                    this.d = new long[0];
                    break;
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

