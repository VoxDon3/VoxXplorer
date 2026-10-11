package ax.u0;

import android.util.AndroidRuntimeException;
import android.view.View;
import ax.c0.C1760d0;
import ax.u0.AbstractC3170h;
import ax.u0.C3165c;
import java.util.ArrayList;

/* renamed from: ax.u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3170h<T extends AbstractC3170h<T>> implements C3165c.InterfaceC0466c {
    final Object d;
    final AbstractC3171i e;
    private float j;
    private C3165c m;
    public static final r n = new f("translationX");
    public static final r o = new g("translationY");
    public static final r p = new C0467h("translationZ");
    public static final r q = new i("scaleX");
    public static final r r = new j("scaleY");
    public static final r s = new k("rotation");
    public static final r t = new l("rotationX");
    public static final r u = new m("rotationY");
    public static final r v = new n("x");
    public static final r w = new a("y");
    public static final r x = new b("z");
    public static final r y = new c("alpha");
    public static final r z = new d("scrollX");
    public static final r A = new e("scrollY");
    float a = 0.0f;
    float b = Float.MAX_VALUE;
    boolean c = false;
    boolean f = false;
    float g = Float.MAX_VALUE;
    float h = -Float.MAX_VALUE;
    private long i = 0;
    private final ArrayList<p> k = new ArrayList<>();
    private final ArrayList<q> l = new ArrayList<>();

    /* renamed from: ax.u0.h$a */
    class a extends r {
        a(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: ax.u0.h$b */
    class b extends r {
        b(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return C1760d0.M(view);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            C1760d0.D0(view, f);
        }
    }

    /* renamed from: ax.u0.h$c */
    class c extends r {
        c(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: ax.u0.h$d */
    class d extends r {
        d(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: ax.u0.h$e */
    class e extends r {
        e(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: ax.u0.h$f */
    class f extends r {
        f(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: ax.u0.h$g */
    class g extends r {
        g(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: ax.u0.h$h, reason: collision with other inner class name */
    class C0467h extends r {
        C0467h(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return C1760d0.J(view);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            C1760d0.B0(view, f);
        }
    }

    /* renamed from: ax.u0.h$i */
    class i extends r {
        i(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: ax.u0.h$j */
    class j extends r {
        j(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: ax.u0.h$k */
    class k extends r {
        k(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: ax.u0.h$l */
    class l extends r {
        l(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: ax.u0.h$m */
    class m extends r {
        m(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: ax.u0.h$n */
    class n extends r {
        n(String str) {
            super(str, null);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: ax.u0.h$o */
    static class o {
        float a;
        float b;

        o() {
        }
    }

    /* renamed from: ax.u0.h$p */
    public interface p {
        void a(AbstractC3170h abstractC3170h, boolean z, float f, float f2);
    }

    /* renamed from: ax.u0.h$q */
    public interface q {
        void a(AbstractC3170h abstractC3170h, float f, float f2);
    }

    /* renamed from: ax.u0.h$r */
    public static abstract class r extends AbstractC3171i<View> {
        /* synthetic */ r(String str, f fVar) {
            this(str);
        }

        private r(String str) {
            super(str);
        }
    }

    <K> AbstractC3170h(K k2, AbstractC3171i<K> abstractC3171i) {
        this.d = k2;
        this.e = abstractC3171i;
        if (abstractC3171i == s || abstractC3171i == t || abstractC3171i == u) {
            this.j = 0.1f;
            return;
        }
        if (abstractC3171i == y) {
            this.j = 0.00390625f;
        } else if (abstractC3171i == q || abstractC3171i == r) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
    }

    private void b(boolean z2) {
        this.f = false;
        c().k(this);
        this.i = 0L;
        this.c = false;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.k.get(i2) != null) {
                this.k.get(i2).a(this, z2, this.b, this.a);
            }
        }
        g(this.k);
    }

    private float d() {
        return this.e.a(this.d);
    }

    private static <T> void g(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void k() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = d();
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        c().d(this, 0L);
    }

    @Override // ax.u0.C3165c.InterfaceC0466c
    public boolean a(long j2) {
        long j3 = this.i;
        if (j3 == 0) {
            this.i = j2;
            h(this.b);
            return false;
        }
        long j4 = j2 - j3;
        this.i = j2;
        float g2 = c().g();
        boolean l2 = l(g2 == 0.0f ? 2147483647L : (long) (j4 / g2));
        float min = Math.min(this.b, this.g);
        this.b = min;
        float max = Math.max(min, this.h);
        this.b = max;
        h(max);
        if (l2) {
            b(false);
        }
        return l2;
    }

    public C3165c c() {
        C3165c c3165c = this.m;
        return c3165c != null ? c3165c : C3165c.h();
    }

    float e() {
        return this.j * 0.75f;
    }

    public boolean f() {
        return this.f;
    }

    void h(float f2) {
        this.e.b(this.d, f2);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2) != null) {
                this.l.get(i2).a(this, this.b, this.a);
            }
        }
        g(this.l);
    }

    public T i(float f2) {
        this.b = f2;
        this.c = true;
        return this;
    }

    public void j() {
        if (!c().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            return;
        }
        k();
    }

    abstract boolean l(long j2);
}
