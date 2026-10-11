/*
 * Decompiled with CFR 0.152.
 */
package ax.u0;

import android.util.AndroidRuntimeException;
import android.view.View;
import ax.c0.d0;
import ax.u0.c;
import ax.u0.i;
import java.util.ArrayList;

public abstract class h<T extends h<T>>
implements c.c {
    public static final r A;
    public static final r n;
    public static final r o;
    public static final r p;
    public static final r q;
    public static final r r;
    public static final r s;
    public static final r t;
    public static final r u;
    public static final r v;
    public static final r w;
    public static final r x;
    public static final r y;
    public static final r z;
    float a = 0.0f;
    float b = Float.MAX_VALUE;
    boolean c = false;
    final Object d;
    final i e;
    boolean f = false;
    float g = Float.MAX_VALUE;
    float h = -Float.MAX_VALUE;
    private long i = 0L;
    private float j;
    private final ArrayList<p> k = new ArrayList();
    private final ArrayList<q> l = new ArrayList();
    private c m;

    static {
        n = new r("translationX"){

            public float c(View view) {
                return view.getTranslationX();
            }

            public void d(View view, float f8) {
                view.setTranslationX(f8);
            }
        };
        o = new r("translationY"){

            public float c(View view) {
                return view.getTranslationY();
            }

            public void d(View view, float f8) {
                view.setTranslationY(f8);
            }
        };
        p = new r("translationZ"){

            public float c(View view) {
                return d0.J(view);
            }

            public void d(View view, float f8) {
                d0.B0(view, f8);
            }
        };
        q = new r("scaleX"){

            public float c(View view) {
                return view.getScaleX();
            }

            public void d(View view, float f8) {
                view.setScaleX(f8);
            }
        };
        r = new r("scaleY"){

            public float c(View view) {
                return view.getScaleY();
            }

            public void d(View view, float f8) {
                view.setScaleY(f8);
            }
        };
        s = new r("rotation"){

            public float c(View view) {
                return view.getRotation();
            }

            public void d(View view, float f8) {
                view.setRotation(f8);
            }
        };
        t = new r("rotationX"){

            public float c(View view) {
                return view.getRotationX();
            }

            public void d(View view, float f8) {
                view.setRotationX(f8);
            }
        };
        u = new r("rotationY"){

            public float c(View view) {
                return view.getRotationY();
            }

            public void d(View view, float f8) {
                view.setRotationY(f8);
            }
        };
        v = new r("x"){

            public float c(View view) {
                return view.getX();
            }

            public void d(View view, float f8) {
                view.setX(f8);
            }
        };
        w = new r("y"){

            public float c(View view) {
                return view.getY();
            }

            public void d(View view, float f8) {
                view.setY(f8);
            }
        };
        x = new r("z"){

            public float c(View view) {
                return d0.M(view);
            }

            public void d(View view, float f8) {
                d0.D0(view, f8);
            }
        };
        y = new r("alpha"){

            public float c(View view) {
                return view.getAlpha();
            }

            public void d(View view, float f8) {
                view.setAlpha(f8);
            }
        };
        z = new r("scrollX"){

            public float c(View view) {
                return view.getScrollX();
            }

            public void d(View view, float f8) {
                view.setScrollX((int)f8);
            }
        };
        A = new r("scrollY"){

            public float c(View view) {
                return view.getScrollY();
            }

            public void d(View view, float f8) {
                view.setScrollY((int)f8);
            }
        };
    }

    <K> h(K k8, i<K> i8) {
        this.d = k8;
        this.e = i8;
        if (i8 != s && i8 != t && i8 != u) {
            if (i8 == y) {
                this.j = 0.00390625f;
                return;
            }
            if (i8 != q && i8 != r) {
                this.j = 1.0f;
                return;
            }
            this.j = 0.002f;
            return;
        }
        this.j = 0.1f;
    }

    private void b(boolean bl) {
        this.f = false;
        this.c().k(this);
        this.i = 0L;
        this.c = false;
        for (int i8 = 0; i8 < this.k.size(); ++i8) {
            if (this.k.get(i8) == null) continue;
            this.k.get(i8).a(this, bl, this.b, this.a);
        }
        ax.u0.h.g(this.k);
    }

    private float d() {
        return this.e.a(this.d);
    }

    private static <T> void g(ArrayList<T> arrayList) {
        for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
            if (arrayList.get(i8) != null) continue;
            arrayList.remove(i8);
        }
    }

    private void k() {
        if (!this.f) {
            float f8;
            this.f = true;
            if (!this.c) {
                this.b = this.d();
            }
            if (!((f8 = this.b) > this.g) && !(f8 < this.h)) {
                this.c().d(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    @Override
    public boolean a(long l8) {
        long l9 = this.i;
        if (l9 == 0L) {
            this.i = l8;
            this.h(this.b);
            return false;
        }
        this.i = l8;
        float f8 = this.c().g();
        l8 = f8 == 0.0f ? Integer.MAX_VALUE : (long)((float)(l8 - l9) / f8);
        boolean bl = this.l(l8);
        this.b = f8 = Math.min(this.b, this.g);
        this.b = f8 = Math.max(f8, this.h);
        this.h(f8);
        if (bl) {
            this.b(false);
        }
        return bl;
    }

    public c c() {
        c c8 = this.m;
        if (c8 != null) {
            return c8;
        }
        return ax.u0.c.h();
    }

    float e() {
        return this.j * 0.75f;
    }

    public boolean f() {
        return this.f;
    }

    void h(float f8) {
        this.e.b(this.d, f8);
        for (int i8 = 0; i8 < this.l.size(); ++i8) {
            if (this.l.get(i8) == null) continue;
            this.l.get(i8).a(this, this.b, this.a);
        }
        ax.u0.h.g(this.l);
    }

    public T i(float f8) {
        this.b = f8;
        this.c = true;
        return (T)this;
    }

    public void j() {
        if (this.c().j()) {
            if (!this.f) {
                this.k();
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
    }

    abstract boolean l(long var1);

    static class o {
        float a;
        float b;

        o() {
        }
    }

    public static interface p {
        public void a(h var1, boolean var2, float var3, float var4);
    }

    public static interface q {
        public void a(h var1, float var2, float var3);
    }

    public static abstract class r
    extends i<View> {
        private r(String string) {
            super(string);
        }
    }
}

