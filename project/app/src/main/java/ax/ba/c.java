/*
 * Decompiled with CFR 0.152.
 */
package ax.ba;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import ax.ba.a;
import ax.ca.d;

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
    private final d j;
    private final BitmapFactory.Options k;
    private final int l;
    private final boolean m;
    private final Object n;
    private final ax.fa.a o;
    private final Handler p;
    private final boolean q;

    private c(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
        this.d = b8.d;
        this.e = b8.e;
        this.f = b8.f;
        this.g = b8.g;
        this.h = b8.h;
        this.i = b8.i;
        this.j = b8.j;
        this.k = b8.k;
        this.l = b8.l;
        this.m = b8.m;
        this.n = b8.n;
        ax.ba.c$b.g(b8);
        ax.ba.c$b.h(b8);
        this.o = b8.o;
        this.p = b8.p;
        this.q = b8.q;
    }

    static /* synthetic */ ax.ja.a o(c c8) {
        c8.getClass();
        return null;
    }

    static /* synthetic */ ax.ja.a p(c c8) {
        c8.getClass();
        return null;
    }

    public static c t() {
        return new b().u();
    }

    public Drawable A(Resources resources) {
        int n8 = this.c;
        if (n8 != 0) {
            return resources.getDrawable(n8);
        }
        return this.f;
    }

    public Drawable B(Resources resources) {
        int n8 = this.a;
        if (n8 != 0) {
            return resources.getDrawable(n8);
        }
        return this.d;
    }

    public d C() {
        return this.j;
    }

    public ax.ja.a D() {
        return null;
    }

    public ax.ja.a E() {
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
        return this.e != null || this.b != 0;
        {
        }
    }

    public boolean O() {
        return this.f != null || this.c != 0;
        {
        }
    }

    public boolean P() {
        return this.d != null || this.a != 0;
        {
        }
    }

    public BitmapFactory.Options u() {
        return this.k;
    }

    public int v() {
        return this.l;
    }

    public ax.fa.a w() {
        return this.o;
    }

    public Object x() {
        return this.n;
    }

    public Handler y() {
        return this.p;
    }

    public Drawable z(Resources resources) {
        int n8 = this.b;
        if (n8 != 0) {
            return resources.getDrawable(n8);
        }
        return this.e;
    }

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
        private d j = ax.ca.d.d0;
        private BitmapFactory.Options k = new BitmapFactory.Options();
        private int l = 0;
        private boolean m = false;
        private Object n = null;
        private ax.fa.a o = ax.ba.a.a();
        private Handler p = null;
        private boolean q = false;

        static /* synthetic */ ax.ja.a g(b b8) {
            b8.getClass();
            return null;
        }

        static /* synthetic */ ax.ja.a h(b b8) {
            b8.getClass();
            return null;
        }

        public b A(Handler handler) {
            this.p = handler;
            return this;
        }

        public b B(d d8) {
            this.j = d8;
            return this;
        }

        public b C(boolean bl) {
            this.g = bl;
            return this;
        }

        public b t(Bitmap.Config config) {
            if (config != null) {
                this.k.inPreferredConfig = config;
                return this;
            }
            throw new IllegalArgumentException("bitmapConfig can't be null");
        }

        public c u() {
            return new c(this);
        }

        public b v(boolean bl) {
            this.h = bl;
            return this;
        }

        public b w(boolean bl) {
            this.i = bl;
            return this;
        }

        public b x(c c8) {
            this.a = c8.a;
            this.b = c8.b;
            this.c = c8.c;
            this.d = c8.d;
            this.e = c8.e;
            this.f = c8.f;
            this.g = c8.g;
            this.h = c8.h;
            this.i = c8.i;
            this.j = c8.j;
            this.k = c8.k;
            this.l = c8.l;
            this.m = c8.m;
            this.n = c8.n;
            ax.ba.c.o(c8);
            ax.ba.c.p(c8);
            this.o = c8.o;
            this.p = c8.p;
            this.q = c8.q;
            return this;
        }

        public b y(boolean bl) {
            this.m = bl;
            return this;
        }

        public b z(ax.fa.a a8) {
            if (a8 != null) {
                this.o = a8;
                return this;
            }
            throw new IllegalArgumentException("displayer can't be null");
        }
    }
}

