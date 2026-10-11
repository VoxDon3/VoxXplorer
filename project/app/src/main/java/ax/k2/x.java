/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import ax.Gb.g;
import ax.Gb.l;
import ax.o2.i;
import ax.o2.j;
import ax.sb.t;
import java.util.TreeMap;

public final class x
implements j,
i,
AutoCloseable {
    public static final a j0 = new a(null);
    public static final TreeMap<Integer, x> k0 = new TreeMap();
    private volatile String c0;
    public final long[] d0;
    public final double[] e0;
    public final String[] f0;
    public final byte[][] g0;
    private final int[] h0;
    private int i0;
    private final int q;

    private x(int n8) {
        this.q = n8++;
        this.h0 = new int[n8];
        this.d0 = new long[n8];
        this.e0 = new double[n8];
        this.f0 = new String[n8];
        this.g0 = new byte[n8][];
    }

    public /* synthetic */ x(int n8, g g8) {
        this(n8);
    }

    public static final x c(String string, int n8) {
        return j0.a(string, n8);
    }

    @Override
    public void D(int n8, String string) {
        l.f(string, "value");
        this.h0[n8] = 4;
        this.f0[n8] = string;
    }

    @Override
    public void N(int n8, double d8) {
        this.h0[n8] = 3;
        this.e0[n8] = d8;
    }

    @Override
    public void X(int n8, long l8) {
        this.h0[n8] = 2;
        this.d0[n8] = l8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(i i8) {
        l.f(i8, "statement");
        int n8 = this.d();
        if (1 > n8) return;
        int n9 = 1;
        while (true) {
            int n10;
            if ((n10 = this.h0[n9]) != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        Object object;
                        if (n10 != 4) {
                            if (n10 == 5) {
                                object = this.g0[n9];
                                if (object == null) throw new IllegalArgumentException("Required value was null.");
                                i8.e0(n9, (byte[])object);
                            }
                        } else {
                            object = this.f0[n9];
                            if (object == null) throw new IllegalArgumentException("Required value was null.");
                            i8.D(n9, (String)object);
                        }
                    } else {
                        i8.N(n9, this.e0[n9]);
                    }
                } else {
                    i8.X(n9, this.d0[n9]);
                }
            } else {
                i8.t0(n9);
            }
            if (n9 == n8) return;
            ++n9;
        }
    }

    @Override
    public String b() {
        String string = this.c0;
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override
    public void close() {
    }

    public int d() {
        return this.i0;
    }

    public final void e(String string, int n8) {
        l.f(string, "query");
        this.c0 = string;
        this.i0 = n8;
    }

    @Override
    public void e0(int n8, byte[] byArray) {
        l.f(byArray, "value");
        this.h0[n8] = 5;
        this.g0[n8] = byArray;
    }

    public final void f() {
        TreeMap<Integer, x> treeMap = k0;
        synchronized (treeMap) {
            treeMap.put(this.q, this);
            j0.b();
            t t8 = t.a;
            return;
        }
    }

    @Override
    public void t0(int n8) {
        this.h0[n8] = 1;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final x a(String string, int n8) {
            l.f(string, "query");
            Object object = k0;
            synchronized (object) {
                try {
                    Object object2 = ((TreeMap)object).ceilingEntry(n8);
                    if (object2 != null) {
                        ((TreeMap)object).remove(object2.getKey());
                        object2 = (x)object2.getValue();
                        ((x)object2).e(string, n8);
                        l.e(object2, "sqliteQuery");
                        return object2;
                    }
                    object2 = t.a;
                    // MONITOREXIT @DISABLED, blocks:[0, 1] lbl15 : MonitorExitStatement: MONITOREXIT : var3_4
                    object = new x(n8, null);
                    ((x)object).e(string, n8);
                    return object;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public final void b() {
            TreeMap<Integer, x> treeMap = k0;
            if (treeMap.size() > 15) {
                int n8 = treeMap.size() - 10;
                treeMap = treeMap.descendingKeySet().iterator();
                l.e(treeMap, "queryPool.descendingKeySet().iterator()");
                while (n8 > 0) {
                    treeMap.next();
                    treeMap.remove();
                    --n8;
                }
            }
        }
    }
}

