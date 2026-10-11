package ax.J3;

import android.widget.ImageView;
import ax.g4.C2117f;
import ax.g4.C2119h;
import ax.g4.C2120i;
import ax.g4.InterfaceC2113b;
import ax.g4.InterfaceC2114c;
import ax.g4.InterfaceFutureC2112a;
import ax.g4.RunnableC2115d;
import java.io.File;

/* loaded from: classes.dex */
public class i<TranscodeType> implements Cloneable {
    protected static final C2117f o0 = new C2117f().i(ax.P3.h.c).R(g.LOW).X(true);
    private final j c0;
    private final Class<TranscodeType> d0;
    private final C2117f e0;
    private final c f0;
    protected C2117f g0;
    private k<?, ? super TranscodeType> h0;
    private Object i0;
    private i<TranscodeType> j0;
    private Float k0;
    private boolean l0 = true;
    private boolean m0;
    private boolean n0;
    private final e q;

    class a implements Runnable {
        final /* synthetic */ RunnableC2115d q;

        a(RunnableC2115d runnableC2115d) {
            this.q = runnableC2115d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.q.isCancelled()) {
                return;
            }
            i.this.j(this.q);
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[g.values().length];
            b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected i(c cVar, j jVar, Class<TranscodeType> cls) {
        this.f0 = cVar;
        this.c0 = jVar;
        this.q = cVar.i();
        this.d0 = cls;
        C2117f p = jVar.p();
        this.e0 = p;
        this.h0 = jVar.q(cls);
        this.g0 = p;
    }

    private InterfaceC2113b c(ax.h4.e<TranscodeType> eVar) {
        return d(eVar, null, this.h0, this.g0.y(), this.g0.v(), this.g0.t());
    }

    private InterfaceC2113b d(ax.h4.e<TranscodeType> eVar, C2120i c2120i, k<?, ? super TranscodeType> kVar, g gVar, int i, int i2) {
        i<TranscodeType> iVar = this.j0;
        if (iVar == null) {
            if (this.k0 == null) {
                return n(eVar, this.g0, c2120i, kVar, gVar, i, i2);
            }
            C2120i c2120i2 = new C2120i(c2120i);
            c2120i2.m(n(eVar, this.g0, c2120i2, kVar, gVar, i, i2), n(eVar, this.g0.clone().V(this.k0.floatValue()), c2120i2, kVar, i(gVar), i, i2));
            return c2120i2;
        }
        if (this.n0) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        k<?, ? super TranscodeType> kVar2 = iVar.l0 ? kVar : iVar.h0;
        g y = iVar.g0.H() ? this.j0.g0.y() : i(gVar);
        int v = this.j0.g0.v();
        int t = this.j0.g0.t();
        if (ax.k4.i.r(i, i2) && !this.j0.g0.M()) {
            v = this.g0.v();
            t = this.g0.t();
        }
        int i3 = t;
        C2120i c2120i3 = new C2120i(c2120i);
        InterfaceC2113b n = n(eVar, this.g0, c2120i3, kVar, gVar, i, i2);
        this.n0 = true;
        InterfaceC2113b d = this.j0.d(eVar, c2120i3, kVar2, y, v, i3);
        this.n0 = false;
        c2120i3.m(n, d);
        return c2120i3;
    }

    private g i(g gVar) {
        int i = b.b[gVar.ordinal()];
        if (i == 1) {
            return g.NORMAL;
        }
        if (i == 2) {
            return g.HIGH;
        }
        if (i == 3 || i == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + this.g0.y());
    }

    private i<TranscodeType> m(Object obj) {
        this.i0 = obj;
        this.m0 = true;
        return this;
    }

    private InterfaceC2113b n(ax.h4.e<TranscodeType> eVar, C2117f c2117f, InterfaceC2114c interfaceC2114c, k<?, ? super TranscodeType> kVar, g gVar, int i, int i2) {
        c2117f.N();
        e eVar2 = this.q;
        return C2119h.x(eVar2, this.i0, this.d0, c2117f, i, i2, gVar, eVar, null, interfaceC2114c, eVar2.c(), kVar.c());
    }

    public i<TranscodeType> b(C2117f c2117f) {
        ax.k4.h.d(c2117f);
        this.g0 = h().b(c2117f);
        return this;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> clone() {
        try {
            i<TranscodeType> iVar = (i) super.clone();
            iVar.g0 = iVar.g0.clone();
            iVar.h0 = (k<?, ? super TranscodeType>) iVar.h0.clone();
            return iVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    protected C2117f h() {
        C2117f c2117f = this.e0;
        C2117f c2117f2 = this.g0;
        return c2117f == c2117f2 ? c2117f2.clone() : c2117f2;
    }

    public <Y extends ax.h4.e<TranscodeType>> Y j(Y y) {
        ax.k4.i.b();
        ax.k4.h.d(y);
        if (!this.m0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        this.g0.N();
        InterfaceC2113b c = c(y);
        InterfaceC2113b k = y.k();
        if (c.d(k) && (((InterfaceC2113b) ax.k4.h.d(k)).i() || ((InterfaceC2113b) ax.k4.h.d(k)).isRunning())) {
            c.recycle();
            if (!((InterfaceC2113b) ax.k4.h.d(k)).isRunning()) {
                k.h();
            }
            return y;
        }
        this.c0.o(y);
        y.e(c);
        this.c0.u(y, c);
        return y;
    }

    public i<TranscodeType> k(File file) {
        return m(file);
    }

    public i<TranscodeType> l(Object obj) {
        return m(obj);
    }

    public InterfaceFutureC2112a<TranscodeType> o() {
        return r(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public InterfaceFutureC2112a<TranscodeType> r(int i, int i2) {
        RunnableC2115d runnableC2115d = new RunnableC2115d(this.q.e(), i, i2);
        if (ax.k4.i.o()) {
            this.q.e().post(new a(runnableC2115d));
            return runnableC2115d;
        }
        j(runnableC2115d);
        return runnableC2115d;
    }
}
