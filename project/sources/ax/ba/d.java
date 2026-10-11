package ax.ba;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import ax.ha.C2176b;
import ax.ha.C2177c;
import ax.ha.InterfaceC2175a;
import ax.ia.C2295c;
import ax.ia.InterfaceC2293a;
import ax.ia.InterfaceC2294b;
import ax.ka.C2417b;

/* loaded from: classes3.dex */
public class d {
    public static final String d = "d";
    private static volatile d e;
    private e a;
    private f b;
    private InterfaceC2293a c = new C2295c();

    protected d() {
    }

    private void c() {
        if (this.a == null) {
            throw new IllegalStateException("ImageLoader must be init with configuration before using");
        }
    }

    private static Handler d(c cVar) {
        Handler y = cVar.y();
        if (cVar.J()) {
            return null;
        }
        return (y == null && Looper.myLooper() == Looper.getMainLooper()) ? new Handler() : y;
    }

    public static d j() {
        if (e == null) {
            synchronized (d.class) {
                try {
                    if (e == null) {
                        e = new d();
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public void a(ImageView imageView) {
        this.b.e(new C2176b(imageView));
    }

    public void b(InterfaceC2175a interfaceC2175a) {
        this.b.e(interfaceC2175a);
    }

    public void e() {
        if (!m()) {
            ax.ka.d.f("Trying to destroy not-initialized ImageLoader", new Object[0]);
            return;
        }
        ax.ka.d.a("Destroy ImageLoader", new Object[0]);
        p();
        this.a.n.close();
        this.b = null;
        this.a = null;
    }

    public void f(String str, InterfaceC2175a interfaceC2175a, c cVar, ax.ca.e eVar, InterfaceC2293a interfaceC2293a, InterfaceC2294b interfaceC2294b) {
        c();
        if (interfaceC2175a == null) {
            throw new IllegalArgumentException("Wrong arguments were passed to displayImage() method (ImageView reference must not be null)");
        }
        if (interfaceC2293a == null) {
            interfaceC2293a = this.c;
        }
        InterfaceC2293a interfaceC2293a2 = interfaceC2293a;
        if (cVar == null) {
            cVar = this.a.q;
        }
        c cVar2 = cVar;
        if (TextUtils.isEmpty(str)) {
            this.b.e(interfaceC2175a);
            interfaceC2293a2.a(str, interfaceC2175a.h());
            if (cVar2.N()) {
                interfaceC2175a.g(cVar2.z(this.a.a));
            } else {
                interfaceC2175a.g(null);
            }
            interfaceC2293a2.c(str, interfaceC2175a.h(), null);
            return;
        }
        if (eVar == null) {
            eVar = C2417b.e(interfaceC2175a, this.a.a());
        }
        ax.ca.e eVar2 = eVar;
        String b = ax.ka.e.b(str, eVar2);
        this.b.p(interfaceC2175a, b);
        interfaceC2293a2.a(str, interfaceC2175a.h());
        Bitmap i = this.a.m.i(b);
        if (i == null || i.isRecycled()) {
            if (cVar2.P()) {
                interfaceC2175a.g(cVar2.B(this.a.a));
            } else if (cVar2.I()) {
                interfaceC2175a.g(null);
            }
            h hVar = new h(this.b, new g(str, interfaceC2175a, eVar2, b, cVar2, interfaceC2293a2, interfaceC2294b, this.b.i(str)), d(cVar2));
            if (cVar2.J()) {
                hVar.run();
                return;
            } else {
                this.b.r(hVar);
                return;
            }
        }
        ax.ka.d.a("Load image from memory cache [%s]", b);
        if (!cVar2.L()) {
            cVar2.w().a(i, interfaceC2175a, ax.ca.f.MEMORY_CACHE);
            interfaceC2293a2.c(str, interfaceC2175a.h(), i);
            return;
        }
        i iVar = new i(this.b, i, new g(str, interfaceC2175a, eVar2, b, cVar2, interfaceC2293a2, interfaceC2294b, this.b.i(str)), d(cVar2));
        if (cVar2.J()) {
            iVar.run();
        } else {
            this.b.s(iVar);
        }
    }

    public void g(String str, InterfaceC2175a interfaceC2175a, c cVar, InterfaceC2293a interfaceC2293a) {
        h(str, interfaceC2175a, cVar, interfaceC2293a, null);
    }

    public void h(String str, InterfaceC2175a interfaceC2175a, c cVar, InterfaceC2293a interfaceC2293a, InterfaceC2294b interfaceC2294b) {
        f(str, interfaceC2175a, cVar, null, interfaceC2293a, interfaceC2294b);
    }

    public ax.V9.a i() {
        c();
        return this.a.n;
    }

    public ax.Z9.a k() {
        c();
        return this.a.m;
    }

    public synchronized void l(e eVar) {
        try {
            if (eVar == null) {
                throw new IllegalArgumentException("ImageLoader configuration can not be initialized with null");
            }
            if (this.a == null) {
                ax.ka.d.a("Initialize ImageLoader with configuration", new Object[0]);
                this.b = new f(eVar);
                this.a = eVar;
            } else {
                ax.ka.d.f("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean m() {
        return this.a != null;
    }

    public void n(String str, c cVar, InterfaceC2293a interfaceC2293a) {
        o(str, null, cVar, interfaceC2293a, null);
    }

    public void o(String str, ax.ca.e eVar, c cVar, InterfaceC2293a interfaceC2293a, InterfaceC2294b interfaceC2294b) {
        c();
        if (eVar == null) {
            eVar = this.a.a();
        }
        if (cVar == null) {
            cVar = this.a.q;
        }
        h(str, new C2177c(str, eVar, ax.ca.h.CROP), cVar, interfaceC2293a, interfaceC2294b);
    }

    public void p() {
        if (m()) {
            this.b.q();
        } else {
            ax.ka.d.f("Trying to stop not-initialized ImageLoader", new Object[0]);
        }
    }
}
