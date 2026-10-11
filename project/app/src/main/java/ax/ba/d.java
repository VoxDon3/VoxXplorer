/*
 * Decompiled with CFR 0.152.
 */
package ax.ba;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import ax.ba.c;
import ax.ba.e;
import ax.ba.f;
import ax.ba.g;
import ax.ba.h;
import ax.ba.i;
import ax.ha.a;
import ax.ha.b;

public class d {
    public static final String d = "d";
    private static volatile d e;
    private e a;
    private f b;
    private ax.ia.a c = new ax.ia.c();

    protected d() {
    }

    private void c() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("ImageLoader must be init with configuration before using");
    }

    private static Handler d(c c8) {
        Handler handler = c8.y();
        if (c8.J()) {
            return null;
        }
        if (handler == null && Looper.myLooper() == Looper.getMainLooper()) {
            return new Handler();
        }
        return handler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d j() {
        if (e != null) return e;
        synchronized (d.class) {
            try {
                d d8;
                if (e != null) return e;
                e = d8 = new d();
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void a(ImageView imageView) {
        this.b.e(new b(imageView));
    }

    public void b(a a8) {
        this.b.e(a8);
    }

    public void e() {
        if (this.m()) {
            ax.ka.d.a("Destroy ImageLoader", new Object[0]);
            this.p();
            this.a.n.close();
            this.b = null;
            this.a = null;
            return;
        }
        ax.ka.d.f("Trying to destroy not-initialized ImageLoader", new Object[0]);
    }

    public void f(String object, a a8, c object2, ax.ca.e e8, ax.ia.a object3, ax.ia.b b8) {
        this.c();
        if (a8 != null) {
            ax.ia.a a9 = object3;
            if (object3 == null) {
                a9 = this.c;
            }
            object3 = object2;
            if (object2 == null) {
                object3 = this.a.q;
            }
            if (TextUtils.isEmpty((CharSequence)object)) {
                this.b.e(a8);
                a9.a((String)object, a8.h());
                if (((c)object3).N()) {
                    a8.g(((c)object3).z(this.a.a));
                } else {
                    a8.g(null);
                }
                a9.c((String)object, a8.h(), null);
                return;
            }
            object2 = e8;
            if (e8 == null) {
                object2 = ax.ka.b.e(a8, this.a.a());
            }
            String string = ax.ka.e.b((String)object, (ax.ca.e)object2);
            this.b.p(a8, string);
            a9.a((String)object, a8.h());
            e8 = this.a.m.i(string);
            if (e8 != null && !e8.isRecycled()) {
                ax.ka.d.a("Load image from memory cache [%s]", string);
                if (((c)object3).L()) {
                    object = new g((String)object, a8, (ax.ca.e)object2, string, (c)object3, a9, b8, this.b.i((String)object));
                    object = new i(this.b, (Bitmap)e8, (g)object, ax.ba.d.d((c)object3));
                    if (((c)object3).J()) {
                        ((i)object).run();
                        return;
                    }
                    this.b.s((i)object);
                    return;
                }
                ((c)object3).w().a((Bitmap)e8, a8, ax.ca.f.d0);
                a9.c((String)object, a8.h(), (Bitmap)e8);
                return;
            }
            if (((c)object3).P()) {
                a8.g(((c)object3).B(this.a.a));
            } else if (((c)object3).I()) {
                a8.g(null);
            }
            object = new g((String)object, a8, (ax.ca.e)object2, string, (c)object3, a9, b8, this.b.i((String)object));
            object = new h(this.b, (g)object, ax.ba.d.d((c)object3));
            if (((c)object3).J()) {
                ((h)object).run();
                return;
            }
            this.b.r((h)object);
            return;
        }
        throw new IllegalArgumentException("Wrong arguments were passed to displayImage() method (ImageView reference must not be null)");
    }

    public void g(String string, a a8, c c8, ax.ia.a a9) {
        this.h(string, a8, c8, a9, null);
    }

    public void h(String string, a a8, c c8, ax.ia.a a9, ax.ia.b b8) {
        this.f(string, a8, c8, null, a9, b8);
    }

    public ax.V9.a i() {
        this.c();
        return this.a.n;
    }

    public ax.Z9.a k() {
        this.c();
        return this.a.m;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(e object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                if (object != null) {
                    block5: {
                        block4: {
                            try {
                                f f8;
                                if (this.a != null) break block4;
                                ax.ka.d.a("Initialize ImageLoader with configuration", new Object[0]);
                                this.b = f8 = new f((e)object);
                                this.a = object;
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        ax.ka.d.f("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
                    }
                    return;
                }
                object = new IllegalArgumentException("ImageLoader configuration can not be initialized with null");
                throw object;
            }
            throw throwable2;
        }
    }

    public boolean m() {
        return this.a != null;
    }

    public void n(String string, c c8, ax.ia.a a8) {
        this.o(string, null, c8, a8, null);
    }

    public void o(String string, ax.ca.e object, c c8, ax.ia.a a8, ax.ia.b b8) {
        this.c();
        ax.ca.e e8 = object;
        if (object == null) {
            e8 = this.a.a();
        }
        object = c8;
        if (c8 == null) {
            object = this.a.q;
        }
        this.h(string, new ax.ha.c(string, e8, ax.ca.h.c0), (c)object, a8, b8);
    }

    public void p() {
        if (this.m()) {
            this.b.q();
            return;
        }
        ax.ka.d.f("Trying to stop not-initialized ImageLoader", new Object[0]);
    }
}

