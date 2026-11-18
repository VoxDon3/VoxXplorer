/*
 * Decompiled with CFR 0.152.
 */
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
import ax.X2.J;
import ax.ba.c;
import ax.ba.e;
import ax.c3.A;
import ax.c3.K;
import ax.c3.z;
import ax.ca.b;
import ax.ca.h;
import ax.r3.a;
import ax.r3.b;
import ax.u3.B;
import ax.u3.g;
import ax.u3.v;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

public class d {
    private static final Logger d = ax.Q2.g.a(d.class);
    private static float e;
    private static ax.ba.e f;
    private static c g;
    private static boolean h;
    private static Handler i;
    private static BroadcastReceiver j;
    private static final Object k;
    private Context a;
    private o b;
    private final HashMap<Integer, String> c;

    static {
        i = new Handler(Looper.getMainLooper());
        k = new Object();
    }

    public d(Context context, o o8) {
        this.a = context.getApplicationContext();
        this.b = o8;
        this.c = new HashMap();
        ax.r3.d.h(this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void A(Context context) {
        Object object = k;
        synchronized (object) {
            ax.r3.d.j();
            ax.r3.d.p(context.getApplicationContext());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void B(Context context, String string) {
        synchronized (d.class) {
            ax.ka.a.a(string, ax.r3.d.m(context).i());
            ax.ka.e.c(string, ax.r3.d.m(context).k());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void C(Context context, String string) {
        synchronized (d.class) {
            ((a)ax.r3.d.m(context).i()).h(string);
            ((ax.r3.f)ax.r3.d.m(context).k()).f(string);
            return;
        }
    }

    private void E(ImageView imageView, n n8) {
        imageView.setTag((Object)n8.Q());
    }

    private static void h(Context context) {
        if (e != B.s(context)) {
            ax.r3.d.A(context);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void i(Context context, K k8) {
        synchronized (d.class) {
            ((a)ax.r3.d.m(context).i()).g(k8);
            ((ax.r3.f)ax.r3.d.m(context).k()).e(k8);
            return;
        }
    }

    private static void j() {
        if (f != null) {
            ax.ba.d.j().e();
            f = null;
            g = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k(String string, ImageView object, ax.ia.a a8) {
        ax.ha.b b8 = new ax.ha.b((ImageView)object);
        object = this.c;
        synchronized (object) {
            this.c.put(b8.a(), string);
        }
        ax.r3.d.m(this.a).b(b8);
        ax.r3.d.m(this.a).g(string, b8, ax.r3.d.n(), a8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static File l(Context object, String string) {
        synchronized (d.class) {
            return ((a)ax.r3.d.m(object).i()).f(string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ax.ba.d m(Context object) {
        Object object2 = k;
        synchronized (object2) {
            ax.r3.d.p(object.getApplicationContext());
            return ax.ba.d.j();
        }
    }

    private static c n() {
        return g;
    }

    public static Bitmap o(Context context, ax.U2.f object) {
        object = ax.U2.d.K((ax.U2.f)object);
        return ((ax.r3.f)ax.r3.d.m(context).k()).d((String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void p(Context object) {
        Object object2 = k;
        synchronized (object2) {
            Throwable throwable2;
            block9: {
                block6: {
                    int n8;
                    int n9;
                    Object object3;
                    block8: {
                        block7: {
                            float f8;
                            try {
                                if (j == null) {
                                    object3 = new BroadcastReceiver(){

                                        public void onReceive(Context context, Intent intent) {
                                            ax.r3.d.A(context);
                                        }
                                    };
                                    j = object3;
                                    ax.u3.g.a().d("local.intent.action.MOUNT_CHANGED", j);
                                }
                                if (f != null) break block6;
                                e = f8 = B.s(object);
                            }
                            catch (Throwable throwable2) {}
                            n9 = (int)(128.0f * f8);
                            n8 = (int)(f8 * 64.0f);
                            if (ax.Q2.e.C(object) != null) break block7;
                            h = false;
                            object3 = object.getCacheDir();
                            break block8;
                            break block9;
                        }
                        h = true;
                        object3 = ax.Q2.e.C(object);
                    }
                    Object object4 = new StringBuilder();
                    ((StringBuilder)object4).append("thumbnail");
                    ((StringBuilder)object4).append(n9);
                    ((StringBuilder)object4).append("x");
                    ((StringBuilder)object4).append(n9);
                    File file = new File((File)object3, ((StringBuilder)object4).toString());
                    file.mkdirs();
                    Object object5 = new StringBuilder();
                    ((StringBuilder)object5).append("thumbnail");
                    ((StringBuilder)object5).append(n8);
                    ((StringBuilder)object5).append("x");
                    ((StringBuilder)object5).append(n8);
                    object3 = object4 = new File((File)object3, ((StringBuilder)object5).toString());
                    if (!((File)object4).exists()) {
                        object3 = null;
                    }
                    n8 = (int)((float)Runtime.getRuntime().maxMemory() * 0.1f);
                    object4 = new e.b((Context)object);
                    object4 = ((e.b)object4).B(n9, n9).w(n9, n9, null).C(v.d()).D(v.c());
                    object5 = new ax.r3.f(n8);
                    object4 = ((e.b)object4).A((ax.Z9.a)object5);
                    object5 = new a(file, (File)object3);
                    object4 = ((e.b)object4).v((ax.V9.a)object5);
                    object3 = new b((Context)object);
                    object3 = ((e.b)object4).y((ax.ga.b)object3);
                    object = new ax.r3.e(false);
                    f = ((e.b)object3).x((ax.ea.b)object).u(ax.ba.c.t()).t();
                    ax.ba.d.j().l(f);
                    object = J.z() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                    object3 = new c.b();
                    object3 = ((c.b)object3).C(false).v(true).w(h).y(true).B(ax.ca.d.d0).t((Bitmap.Config)object);
                    object = new f();
                    g = ((c.b)object3).z((ax.fa.a)object).A(i).u();
                }
                return;
            }
            throw throwable2;
        }
    }

    private static boolean q(Bitmap bitmap) {
        return bitmap != null && bitmap.getHeight() == 1 && bitmap.getWidth() == 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void r(String string, ax.ia.a a8) {
        HashMap<Integer, String> hashMap = this.c;
        synchronized (hashMap) {
            this.c.put(string.hashCode(), string);
        }
        ax.r3.d.m(this.a).n(string, ax.r3.d.n(), a8);
    }

    public void D(String string) {
        ax.r3.d.C(this.a, string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f() {
        ax.ba.d d8 = ax.r3.d.m(this.a);
        if (d8 == null) {
            return;
        }
        e e8 = new e(0);
        HashMap<Integer, String> hashMap = this.c;
        synchronized (hashMap) {
            try {
                Iterator<Map.Entry<Integer, String>> iterator = this.c.entrySet().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.c.clear();
                        return;
                    }
                    Object object = iterator.next();
                    int n8 = object.getKey();
                    object = object.getValue();
                    e8.b(n8);
                    d8.b(e8);
                    this.b.f((String)object);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void g(ImageView imageView) {
        ax.ba.d d8 = ax.r3.d.m(this.a);
        if (d8 == null) {
            return;
        }
        d8.a(imageView);
    }

    public void s(ax.U2.f object, ImageView imageView) {
        block3: {
            Bitmap bitmap;
            block4: {
                block2: {
                    ax.r3.d.m(this.a).a(imageView);
                    ax.U2.d.F(this.a);
                    object = ax.U2.d.K((ax.U2.f)object);
                    if (object == null) break block2;
                    bitmap = ((ax.r3.f)ax.r3.d.m(this.a).k()).d((String)object);
                    if (bitmap == null) break block3;
                    if (!ax.r3.d.q(bitmap)) break block4;
                }
                return;
            }
            imageView.setImageBitmap(bitmap);
            return;
        }
        this.k((String)object, imageView, null);
    }

    public void t(n object) {
        if ((object = this.b.H((n)object)) == null) {
            return;
        }
        this.w((String)object);
    }

    public void u(n n8, ImageView imageView, Runnable runnable2) {
        String string;
        if (ax.Q2.f.p0(n8.P()) && n8.G() == z.f0 && A.O(n8.A())) {
            string = m.S(n8);
            if (ax.r3.d.l(this.a, string) == null) {
                string = this.b.H(n8);
            }
        } else {
            string = this.b.H(n8);
        }
        if (string == null) {
            return;
        }
        this.k(string, imageView, new ax.ia.a(){
            final ImageView a;
            final n b;
            final Runnable c;
            final d d;
            {
                this.d = d8;
                this.a = imageView;
                this.b = n8;
                this.c = runnable2;
            }

            @Override
            public void a(String string, View view) {
            }

            @Override
            public void b(String string, View view, ax.ca.b b8) {
                if (b8 != null && b8.a() == b.a.c0) {
                    this.d.E(this.a, this.b);
                }
            }

            @Override
            public void c(String string, View view, Bitmap bitmap) {
                this.d.E(this.a, this.b);
                if (this.c != null && !ax.r3.d.q(bitmap)) {
                    this.c.run();
                }
            }

            @Override
            public void d(String string, View view) {
            }
        });
    }

    public void v(n object, androidx.appcompat.app.a a8, int n8) {
        if ((object = this.b.H((n)object)) == null) {
            return;
        }
        this.r((String)object, new ax.ia.a(){
            final int a;
            final androidx.appcompat.app.a b;
            final d c;
            {
                this.c = d8;
                this.a = n8;
                this.b = a8;
            }

            @Override
            public void a(String string, View view) {
            }

            @Override
            public void b(String string, View view, ax.ca.b b8) {
            }

            @Override
            public void c(String string, View view, Bitmap bitmap) {
                if (bitmap != null && bitmap.getHeight() != 1 && bitmap.getWidth() != 1) {
                    int n8 = this.a;
                    string = ThumbnailUtils.extractThumbnail((Bitmap)bitmap, (int)n8, (int)n8);
                    this.b.m((Drawable)new BitmapDrawable(this.c.a.getResources(), (Bitmap)string));
                }
            }

            @Override
            public void d(String string, View view) {
            }
        });
    }

    public void w(String string) {
        this.r(string, new ax.ia.a(this){
            final d a;
            {
                this.a = d8;
            }

            @Override
            public void a(String string, View view) {
            }

            @Override
            public void b(String string, View view, ax.ca.b b8) {
            }

            @Override
            public void c(String string, View view, Bitmap bitmap) {
            }

            @Override
            public void d(String string, View view) {
            }
        });
    }

    public void x(n n8, ImageView imageView, Runnable runnable2) {
        String string = this.b.H(n8);
        if (string != null && ax.r3.d.l(this.a, string) != null) {
            this.u(n8, imageView, runnable2);
        }
    }

    public boolean y(ax.U2.f f8, ImageView imageView) {
        if ((f8 = ax.r3.d.o(this.a, f8)) != null) {
            if (ax.r3.d.q((Bitmap)f8)) {
                return false;
            }
            imageView.setImageBitmap((Bitmap)f8);
            return true;
        }
        return false;
    }

    public boolean z(n n8, ImageView imageView, Runnable runnable2) {
        String string = this.b.H(n8);
        if (string == null) {
            return false;
        }
        string = ((ax.r3.f)ax.r3.d.m(this.a).k()).d(string);
        if (string != null) {
            if (ax.r3.d.q((Bitmap)string)) {
                return false;
            }
            imageView.setImageBitmap((Bitmap)string);
            this.E(imageView, n8);
            if (runnable2 != null) {
                runnable2.run();
            }
            return true;
        }
        return false;
    }

    private static class e
    implements ax.ha.a {
        private int a;

        private e(int n8) {
            this.a = n8;
        }

        @Override
        public int a() {
            return this.a;
        }

        public void b(int n8) {
            this.a = n8;
        }

        @Override
        public int f() {
            return 0;
        }

        @Override
        public boolean g(Drawable drawable) {
            return false;
        }

        @Override
        public View h() {
            return null;
        }

        @Override
        public int i() {
            return 0;
        }

        @Override
        public boolean j() {
            return false;
        }

        @Override
        public h k() {
            return null;
        }

        @Override
        public boolean l(Bitmap bitmap) {
            return false;
        }
    }

    static class f
    implements ax.fa.a {
        f() {
        }

        @Override
        public void a(Bitmap bitmap, ax.ha.a a8, ax.ca.f f8) {
            if (!ax.r3.d.q(bitmap)) {
                a8.l(bitmap);
                return;
            }
            d.severe("Bitmap not loaded");
        }
    }
}

