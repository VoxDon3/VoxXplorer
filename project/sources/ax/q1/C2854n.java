package ax.q1;

import android.net.Uri;
import ax.N1.t;
import ax.P0.C0908q;
import ax.P0.C0912v;
import ax.X1.C1141b;
import ax.X1.C1144e;
import ax.X1.C1147h;
import ax.X1.C1149j;
import ax.r1.C2940b;
import ax.r7.AbstractC2991z;
import ax.t1.C3096a;
import ax.u1.C3175a;
import ax.w1.C3325c;
import ax.x1.C3402a;
import ax.y1.C3497a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.q1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2854n implements InterfaceC2863x {
    private static final int[] s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final a t = new a(new a.InterfaceC0427a() { // from class: ax.q1.l
        @Override // ax.q1.C2854n.a.InterfaceC0427a
        public final Constructor a() {
            Constructor k;
            k = C2854n.k();
            return k;
        }
    });
    private static final a u = new a(new a.InterfaceC0427a() { // from class: ax.q1.m
        @Override // ax.q1.C2854n.a.InterfaceC0427a
        public final Constructor a() {
            Constructor l;
            l = C2854n.l();
            return l;
        }
    });
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int l;
    private AbstractC2991z<C0912v> m;
    private int q;
    private int r;
    private int k = 1;
    private int n = 112800;
    private t.a p = new ax.N1.h();
    private boolean o = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.q1.n$a */
    static final class a {
        private final InterfaceC0427a a;
        private final AtomicBoolean b = new AtomicBoolean(false);
        private Constructor<? extends r> c;

        /* renamed from: ax.q1.n$a$a, reason: collision with other inner class name */
        public interface InterfaceC0427a {
            Constructor<? extends r> a() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        public a(InterfaceC0427a interfaceC0427a) {
            this.a = interfaceC0427a;
        }

        private Constructor<? extends r> b() {
            synchronized (this.b) {
                if (this.b.get()) {
                    return this.c;
                }
                try {
                    return this.a.a();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                    return this.c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }

        public r a(Object... objArr) {
            Constructor<? extends r> b = b();
            if (b == null) {
                return null;
            }
            try {
                return b.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }
    }

    private void h(int i, List<r> list) {
        switch (i) {
            case 0:
                list.add(new C1141b());
                break;
            case 1:
                list.add(new C1144e());
                break;
            case 2:
                list.add(new C1147h(this.d | (this.b ? 1 : 0) | (this.c ? 2 : 0)));
                break;
            case 3:
                list.add(new C2940b(this.e | (this.b ? 1 : 0) | (this.c ? 2 : 0)));
                break;
            case 4:
                r a2 = t.a(Integer.valueOf(this.f));
                if (a2 == null) {
                    list.add(new ax.v1.d(this.f));
                    break;
                } else {
                    list.add(a2);
                    break;
                }
            case 5:
                list.add(new C3325c());
                break;
            case 6:
                list.add(new ax.I1.e(this.p, (this.o ? 0 : 2) | this.g));
                break;
            case 7:
                list.add(new ax.J1.f(this.j | (this.b ? 1 : 0) | (this.c ? 2 : 0)));
                break;
            case 8:
                list.add(new ax.K1.h(this.p, this.i | ax.K1.h.l(this.q) | (this.o ? 0 : 32)));
                list.add(new ax.K1.n(this.p, this.h | ax.K1.n.t(this.q) | (this.o ? 0 : 16)));
                break;
            case 9:
                list.add(new ax.L1.d());
                break;
            case 10:
                list.add(new ax.X1.C());
                break;
            case 11:
                if (this.m == null) {
                    this.m = AbstractC2991z.z();
                }
                list.add(new ax.X1.K(this.k, !this.o ? 1 : 0, this.p, new ax.S0.M(0L), new C1149j(this.l, this.m), this.n));
                break;
            case 12:
                list.add(new ax.Y1.b());
                break;
            case 14:
                list.add(new C3497a(this.r));
                break;
            case 15:
                r a3 = u.a(new Object[0]);
                if (a3 != null) {
                    list.add(a3);
                    break;
                }
                break;
            case 16:
                list.add(new ax.s1.b(1 ^ (this.o ? 1 : 0), this.p));
                break;
            case 17:
                list.add(new ax.M1.a());
                break;
            case 18:
                list.add(new ax.Z1.a());
                break;
            case 19:
                list.add(new C3175a());
                break;
            case 20:
                int i2 = this.h;
                if ((i2 & 2) == 0 && (i2 & 4) == 0) {
                    list.add(new C3402a());
                    break;
                }
                break;
            case 21:
                list.add(new C3096a());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends r> k() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(r.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends r> l() throws ClassNotFoundException, NoSuchMethodException {
        return ax.X0.e.class.asSubclass(r.class).getConstructor(null);
    }

    @Override // ax.q1.InterfaceC2863x
    public synchronized r[] c() {
        return e(Uri.EMPTY, new HashMap());
    }

    @Override // ax.q1.InterfaceC2863x
    public synchronized r[] e(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = s;
            arrayList = new ArrayList(iArr.length);
            int b = C0908q.b(map);
            if (b != -1) {
                h(b, arrayList);
            }
            int c = C0908q.c(uri);
            if (c != -1 && c != b) {
                h(c, arrayList);
            }
            for (int i : iArr) {
                if (i != b && i != c) {
                    h(i, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (r[]) arrayList.toArray(new r[0]);
    }

    @Override // ax.q1.InterfaceC2863x
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public synchronized C2854n b(int i) {
        this.q = i;
        return this;
    }

    @Override // ax.q1.InterfaceC2863x
    @Deprecated
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized C2854n d(boolean z) {
        this.o = z;
        return this;
    }

    public synchronized C2854n m(boolean z) {
        this.c = z;
        return this;
    }

    public synchronized C2854n n(int i) {
        this.r = i;
        return this;
    }

    @Override // ax.q1.InterfaceC2863x
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public synchronized C2854n a(t.a aVar) {
        this.p = aVar;
        return this;
    }
}
