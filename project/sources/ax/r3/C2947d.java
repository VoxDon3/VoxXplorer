package ax.r3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import ax.Q2.g;
import ax.X2.J;
import ax.ba.c;
import ax.ba.e;
import ax.c3.C1808A;
import ax.c3.EnumC1837z;
import ax.c3.K;
import ax.ca.b;
import ax.ca.h;
import ax.fa.InterfaceC2087a;
import ax.ha.C2176b;
import ax.ha.InterfaceC2175a;
import ax.ia.InterfaceC2293a;
import ax.ka.C2416a;
import ax.u3.C3180B;
import ax.u3.C3189g;
import ax.u3.C3204v;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: ax.r3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2947d {
    private static float e;
    private static ax.ba.e f;
    private static ax.ba.c g;
    private static boolean h;
    private static BroadcastReceiver j;
    private Context a;
    private C3596o b;
    private final HashMap<Integer, String> c = new HashMap<>();
    private static final Logger d = g.a(C2947d.class);
    private static Handler i = new Handler(Looper.getMainLooper());
    private static final Object k = new Object();

    /* renamed from: ax.r3.d$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C2947d.A(context);
        }
    }

    /* renamed from: ax.r3.d$e */
    private static class e implements InterfaceC2175a {
        private int a;

        /* synthetic */ e(int i, a aVar) {
            this(i);
        }

        @Override // ax.ha.InterfaceC2175a
        public int a() {
            return this.a;
        }

        public void b(int i) {
            this.a = i;
        }

        @Override // ax.ha.InterfaceC2175a
        public int f() {
            return 0;
        }

        @Override // ax.ha.InterfaceC2175a
        public boolean g(Drawable drawable) {
            return false;
        }

        @Override // ax.ha.InterfaceC2175a
        public View h() {
            return null;
        }

        @Override // ax.ha.InterfaceC2175a
        public int i() {
            return 0;
        }

        @Override // ax.ha.InterfaceC2175a
        public boolean j() {
            return false;
        }

        @Override // ax.ha.InterfaceC2175a
        public h k() {
            return null;
        }

        @Override // ax.ha.InterfaceC2175a
        public boolean l(Bitmap bitmap) {
            return false;
        }

        private e(int i) {
            this.a = i;
        }
    }

    /* renamed from: ax.r3.d$f */
    static class f implements InterfaceC2087a {
        f() {
        }

        @Override // ax.fa.InterfaceC2087a
        public void a(Bitmap bitmap, InterfaceC2175a interfaceC2175a, ax.ca.f fVar) {
            if (C2947d.q(bitmap)) {
                C2947d.d.severe("Bitmap not loaded");
            } else {
                interfaceC2175a.l(bitmap);
            }
        }
    }

    public C2947d(Context context, C3596o c3596o) {
        this.a = context.getApplicationContext();
        this.b = c3596o;
        h(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(Context context) {
        synchronized (k) {
            j();
            p(context.getApplicationContext());
        }
    }

    public static synchronized void B(Context context, String str) {
        synchronized (C2947d.class) {
            C2416a.a(str, m(context).i());
            ax.ka.e.c(str, m(context).k());
        }
    }

    public static synchronized void C(Context context, String str) {
        synchronized (C2947d.class) {
            ((C2944a) m(context).i()).h(str);
            ((C2949f) m(context).k()).f(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(ImageView imageView, AbstractC3595n abstractC3595n) {
        imageView.setTag(abstractC3595n.Q());
    }

    private static void h(Context context) {
        if (e != C3180B.s(context)) {
            A(context);
        }
    }

    public static synchronized void i(Context context, K k2) {
        synchronized (C2947d.class) {
            ((C2944a) m(context).i()).g(k2);
            ((C2949f) m(context).k()).e(k2);
        }
    }

    private static void j() {
        if (f != null) {
            ax.ba.d.j().e();
            f = null;
            g = null;
        }
    }

    private void k(String str, ImageView imageView, InterfaceC2293a interfaceC2293a) {
        C2176b c2176b = new C2176b(imageView);
        synchronized (this.c) {
            this.c.put(Integer.valueOf(c2176b.a()), str);
        }
        m(this.a).b(c2176b);
        m(this.a).g(str, c2176b, n(), interfaceC2293a);
    }

    public static synchronized File l(Context context, String str) {
        File f2;
        synchronized (C2947d.class) {
            f2 = ((C2944a) m(context).i()).f(str);
        }
        return f2;
    }

    private static ax.ba.d m(Context context) {
        ax.ba.d j2;
        synchronized (k) {
            p(context.getApplicationContext());
            j2 = ax.ba.d.j();
        }
        return j2;
    }

    private static ax.ba.c n() {
        return g;
    }

    public static Bitmap o(Context context, ax.U2.f fVar) {
        return ((C2949f) m(context).k()).d(ax.U2.d.K(fVar));
    }

    private static void p(Context context) {
        File C;
        synchronized (k) {
            try {
                if (j == null) {
                    j = new a();
                    C3189g.a().d("local.intent.action.MOUNT_CHANGED", j);
                }
                if (f == null) {
                    float s = C3180B.s(context);
                    e = s;
                    int i2 = (int) (128.0f * s);
                    int i3 = (int) (s * 64.0f);
                    if (ax.Q2.e.C(context) == null) {
                        h = false;
                        C = context.getCacheDir();
                    } else {
                        h = true;
                        C = ax.Q2.e.C(context);
                    }
                    File file = new File(C, "thumbnail" + i2 + "x" + i2);
                    file.mkdirs();
                    File file2 = new File(C, "thumbnail" + i3 + "x" + i3);
                    if (!file2.exists()) {
                        file2 = null;
                    }
                    f = new e.b(context).B(i2, i2).w(i2, i2, null).C(C3204v.d()).D(C3204v.c()).A(new C2949f((int) (Runtime.getRuntime().maxMemory() * 0.1f))).v(new C2944a(file, file2)).y(new C2945b(context)).x(new C2948e(false)).u(ax.ba.c.t()).t();
                    ax.ba.d.j().l(f);
                    g = new c.b().C(false).v(true).w(h).y(true).B(ax.ca.d.IN_SAMPLE_POWER_OF_2).t(J.z() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565).z(new f()).A(i).u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Bitmap bitmap) {
        return bitmap != null && bitmap.getHeight() == 1 && bitmap.getWidth() == 1;
    }

    private void r(String str, InterfaceC2293a interfaceC2293a) {
        synchronized (this.c) {
            this.c.put(Integer.valueOf(str.hashCode()), str);
        }
        m(this.a).n(str, n(), interfaceC2293a);
    }

    public void D(String str) {
        C(this.a, str);
    }

    public void f() {
        ax.ba.d m = m(this.a);
        if (m == null) {
            return;
        }
        e eVar = new e(0, null);
        synchronized (this.c) {
            try {
                for (Map.Entry<Integer, String> entry : this.c.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    String value = entry.getValue();
                    eVar.b(intValue);
                    m.b(eVar);
                    this.b.f(value);
                }
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(ImageView imageView) {
        ax.ba.d m = m(this.a);
        if (m == null) {
            return;
        }
        m.a(imageView);
    }

    public void s(ax.U2.f fVar, ImageView imageView) {
        m(this.a).a(imageView);
        ax.U2.d.F(this.a);
        String K = ax.U2.d.K(fVar);
        if (K == null) {
            return;
        }
        Bitmap d2 = ((C2949f) m(this.a).k()).d(K);
        if (d2 == null) {
            k(K, imageView, null);
        } else {
            if (q(d2)) {
                return;
            }
            imageView.setImageBitmap(d2);
        }
    }

    public void t(AbstractC3595n abstractC3595n) {
        String H = this.b.H(abstractC3595n);
        if (H == null) {
            return;
        }
        w(H);
    }

    public void u(AbstractC3595n abstractC3595n, ImageView imageView, Runnable runnable) {
        String H;
        if (ax.Q2.f.p0(abstractC3595n.P()) && abstractC3595n.G() == EnumC1837z.IMAGE && C1808A.O(abstractC3595n.A())) {
            H = AbstractC3594m.S(abstractC3595n);
            if (l(this.a, H) == null) {
                H = this.b.H(abstractC3595n);
            }
        } else {
            H = this.b.H(abstractC3595n);
        }
        if (H == null) {
            return;
        }
        k(H, imageView, new C0435d(imageView, abstractC3595n, runnable));
    }

    public void v(AbstractC3595n abstractC3595n, androidx.appcompat.app.a aVar, int i2) {
        String H = this.b.H(abstractC3595n);
        if (H == null) {
            return;
        }
        r(H, new c(i2, aVar));
    }

    public void w(String str) {
        r(str, new b());
    }

    public void x(AbstractC3595n abstractC3595n, ImageView imageView, Runnable runnable) {
        String H = this.b.H(abstractC3595n);
        if (H == null || l(this.a, H) == null) {
            return;
        }
        u(abstractC3595n, imageView, runnable);
    }

    public boolean y(ax.U2.f fVar, ImageView imageView) {
        Bitmap o = o(this.a, fVar);
        if (o == null || q(o)) {
            return false;
        }
        imageView.setImageBitmap(o);
        return true;
    }

    public boolean z(AbstractC3595n abstractC3595n, ImageView imageView, Runnable runnable) {
        Bitmap d2;
        String H = this.b.H(abstractC3595n);
        if (H == null || (d2 = ((C2949f) m(this.a).k()).d(H)) == null || q(d2)) {
            return false;
        }
        imageView.setImageBitmap(d2);
        E(imageView, abstractC3595n);
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    /* renamed from: ax.r3.d$b */
    class b implements InterfaceC2293a {
        b() {
        }

        @Override // ax.ia.InterfaceC2293a
        public void a(String str, View view) {
        }

        @Override // ax.ia.InterfaceC2293a
        public void d(String str, View view) {
        }

        @Override // ax.ia.InterfaceC2293a
        public void b(String str, View view, ax.ca.b bVar) {
        }

        @Override // ax.ia.InterfaceC2293a
        public void c(String str, View view, Bitmap bitmap) {
        }
    }

    /* renamed from: ax.r3.d$c */
    class c implements InterfaceC2293a {
        final /* synthetic */ int a;
        final /* synthetic */ androidx.appcompat.app.a b;

        c(int i, androidx.appcompat.app.a aVar) {
            this.a = i;
            this.b = aVar;
        }

        @Override // ax.ia.InterfaceC2293a
        public void c(String str, View view, Bitmap bitmap) {
            if (bitmap == null || bitmap.getHeight() == 1 || bitmap.getWidth() == 1) {
                return;
            }
            int i = this.a;
            this.b.m(new BitmapDrawable(C2947d.this.a.getResources(), ThumbnailUtils.extractThumbnail(bitmap, i, i)));
        }

        @Override // ax.ia.InterfaceC2293a
        public void a(String str, View view) {
        }

        @Override // ax.ia.InterfaceC2293a
        public void d(String str, View view) {
        }

        @Override // ax.ia.InterfaceC2293a
        public void b(String str, View view, ax.ca.b bVar) {
        }
    }

    /* renamed from: ax.r3.d$d, reason: collision with other inner class name */
    class C0435d implements InterfaceC2293a {
        final /* synthetic */ ImageView a;
        final /* synthetic */ AbstractC3595n b;
        final /* synthetic */ Runnable c;

        C0435d(ImageView imageView, AbstractC3595n abstractC3595n, Runnable runnable) {
            this.a = imageView;
            this.b = abstractC3595n;
            this.c = runnable;
        }

        @Override // ax.ia.InterfaceC2293a
        public void b(String str, View view, ax.ca.b bVar) {
            if (bVar == null || bVar.a() != b.a.DECODING_ERROR) {
                return;
            }
            C2947d.this.E(this.a, this.b);
        }

        @Override // ax.ia.InterfaceC2293a
        public void c(String str, View view, Bitmap bitmap) {
            C2947d.this.E(this.a, this.b);
            if (this.c == null || C2947d.q(bitmap)) {
                return;
            }
            this.c.run();
        }

        @Override // ax.ia.InterfaceC2293a
        public void a(String str, View view) {
        }

        @Override // ax.ia.InterfaceC2293a
        public void d(String str, View view) {
        }
    }
}
