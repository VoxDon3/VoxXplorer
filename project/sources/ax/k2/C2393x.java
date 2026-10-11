package ax.k2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ax.k2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2393x implements ax.o2.j, ax.o2.i, AutoCloseable {
    public static final a j0 = new a(null);
    public static final TreeMap<Integer, C2393x> k0 = new TreeMap<>();
    private volatile String c0;
    public final long[] d0;
    public final double[] e0;
    public final String[] f0;
    public final byte[][] g0;
    private final int[] h0;
    private int i0;
    private final int q;

    /* renamed from: ax.k2.x$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final C2393x a(String str, int i) {
            ax.Gb.l.f(str, "query");
            TreeMap<Integer, C2393x> treeMap = C2393x.k0;
            synchronized (treeMap) {
                Map.Entry<Integer, C2393x> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry == null) {
                    ax.sb.t tVar = ax.sb.t.a;
                    C2393x c2393x = new C2393x(i, null);
                    c2393x.e(str, i);
                    return c2393x;
                }
                treeMap.remove(ceilingEntry.getKey());
                C2393x value = ceilingEntry.getValue();
                value.e(str, i);
                ax.Gb.l.e(value, "sqliteQuery");
                return value;
            }
        }

        public final void b() {
            TreeMap<Integer, C2393x> treeMap = C2393x.k0;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            ax.Gb.l.e(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ C2393x(int i, ax.Gb.g gVar) {
        this(i);
    }

    public static final C2393x c(String str, int i) {
        return j0.a(str, i);
    }

    @Override // ax.o2.i
    public void D(int i, String str) {
        ax.Gb.l.f(str, "value");
        this.h0[i] = 4;
        this.f0[i] = str;
    }

    @Override // ax.o2.i
    public void N(int i, double d) {
        this.h0[i] = 3;
        this.e0[i] = d;
    }

    @Override // ax.o2.i
    public void X(int i, long j) {
        this.h0[i] = 2;
        this.d0[i] = j;
    }

    @Override // ax.o2.j
    public void a(ax.o2.i iVar) {
        ax.Gb.l.f(iVar, "statement");
        int d = d();
        if (1 > d) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.h0[i];
            if (i2 == 1) {
                iVar.t0(i);
            } else if (i2 == 2) {
                iVar.X(i, this.d0[i]);
            } else if (i2 == 3) {
                iVar.N(i, this.e0[i]);
            } else if (i2 == 4) {
                String str = this.f0[i];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                iVar.D(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.g0[i];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                iVar.e0(i, bArr);
            }
            if (i == d) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // ax.o2.j
    public String b() {
        String str = this.c0;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public int d() {
        return this.i0;
    }

    public final void e(String str, int i) {
        ax.Gb.l.f(str, "query");
        this.c0 = str;
        this.i0 = i;
    }

    @Override // ax.o2.i
    public void e0(int i, byte[] bArr) {
        ax.Gb.l.f(bArr, "value");
        this.h0[i] = 5;
        this.g0[i] = bArr;
    }

    public final void f() {
        TreeMap<Integer, C2393x> treeMap = k0;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.q), this);
            j0.b();
            ax.sb.t tVar = ax.sb.t.a;
        }
    }

    @Override // ax.o2.i
    public void t0(int i) {
        this.h0[i] = 1;
    }

    private C2393x(int i) {
        this.q = i;
        int i2 = i + 1;
        this.h0 = new int[i2];
        this.d0 = new long[i2];
        this.e0 = new double[i2];
        this.f0 = new String[i2];
        this.g0 = new byte[i2][];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
