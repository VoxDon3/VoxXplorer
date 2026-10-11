package ax.ba;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import ax.fa.InterfaceC2087a;
import ax.ja.InterfaceC2344a;

/* loaded from: classes3.dex */
public final class c {
    private final int a;
    private final int b;
    private final int c;
    private final Drawable d;
    private final Drawable e;
    private final Drawable f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final ax.ca.d j;
    private final BitmapFactory.Options k;
    private final int l;
    private final boolean m;
    private final Object n;
    private final InterfaceC2087a o;
    private final Handler p;
    private final boolean q;

    public static class b {
        private int a = 0;
        private int b = 0;
        private int c = 0;
        private Drawable d = null;
        private Drawable e = null;
        private Drawable f = null;
        private boolean g = false;
        private boolean h = false;
        private boolean i = false;
        private ax.ca.d j = ax.ca.d.IN_SAMPLE_POWER_OF_2;
        private BitmapFactory.Options k = new BitmapFactory.Options();
        private int l = 0;
        private boolean m = false;
        private Object n = null;
        private InterfaceC2087a o = C1726a.a();
        private Handler p = null;
        private boolean q = false;

        static /* synthetic */ InterfaceC2344a g(b bVar) {
            bVar.getClass();
            return null;
        }

        static /* synthetic */ InterfaceC2344a h(b bVar) {
            bVar.getClass();
            return null;
        }

        public b A(Handler handler) {
            this.p = handler;
            return this;
        }

        public b B(ax.ca.d dVar) {
            this.j = dVar;
            return this;
        }

        public b C(boolean z) {
            this.g = z;
            return this;
        }

        public b t(Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("bitmapConfig can't be null");
            }
            this.k.inPreferredConfig = config;
            return this;
        }

        public c u() {
            return new c(this);
        }

        public b v(boolean z) {
            this.h = z;
            return this;
        }

        public b w(boolean z) {
            this.i = z;
            return this;
        }

        public b x(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            c.o(cVar);
            c.p(cVar);
            this.o = cVar.o;
            this.p = cVar.p;
            this.q = cVar.q;
            return this;
        }

        public b y(boolean z) {
            this.m = z;
            return this;
        }

        public b z(InterfaceC2087a interfaceC2087a) {
            if (interfaceC2087a == null) {
                throw new IllegalArgumentException("displayer can't be null");
            }
            this.o = interfaceC2087a;
            return this;
        }
    }

    static /* synthetic */ InterfaceC2344a o(c cVar) {
        cVar.getClass();
        return null;
    }

    static /* synthetic */ InterfaceC2344a p(c cVar) {
        cVar.getClass();
        return null;
    }

    public static c t() {
        return new b().u();
    }

    public Drawable A(Resources resources) {
        int i = this.c;
        return i != 0 ? resources.getDrawable(i) : this.f;
    }

    public Drawable B(Resources resources) {
        int i = this.a;
        return i != 0 ? resources.getDrawable(i) : this.d;
    }

    public ax.ca.d C() {
        return this.j;
    }

    public InterfaceC2344a D() {
        return null;
    }

    public InterfaceC2344a E() {
        return null;
    }

    public boolean F() {
        return this.h;
    }

    public boolean G() {
        return this.i;
    }

    public boolean H() {
        return this.m;
    }

    public boolean I() {
        return this.g;
    }

    boolean J() {
        return this.q;
    }

    public boolean K() {
        return this.l > 0;
    }

    public boolean L() {
        return false;
    }

    public boolean M() {
        return false;
    }

    public boolean N() {
        return (this.e == null && this.b == 0) ? false : true;
    }

    public boolean O() {
        return (this.f == null && this.c == 0) ? false : true;
    }

    public boolean P() {
        return (this.d == null && this.a == 0) ? false : true;
    }

    public BitmapFactory.Options u() {
        return this.k;
    }

    public int v() {
        return this.l;
    }

    public InterfaceC2087a w() {
        return this.o;
    }

    public Object x() {
        return this.n;
    }

    public Handler y() {
        return this.p;
    }

    public Drawable z(Resources resources) {
        int i = this.b;
        return i != 0 ? resources.getDrawable(i) : this.e;
    }

    private c(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        b.g(bVar);
        b.h(bVar);
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
    }
}
