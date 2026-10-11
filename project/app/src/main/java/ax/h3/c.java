/*
 * Decompiled with CFR 0.152.
 */
package ax.h3;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import ax.Q2.f;
import ax.Z2.k;
import ax.b3.j;
import ax.c3.B;
import ax.c3.x;
import ax.d3.E;
import ax.d3.n;
import ax.t3.e;
import ax.u3.q;
import com.alphainventor.filemanager.file.c;
import com.alphainventor.filemanager.file.o;
import com.example.android.uamp.MusicService;
import java.util.List;
import java.util.logging.Logger;

public class c {
    private static final Logger a = Logger.getLogger("FileManager.MusicPlayerControl");
    private static b b;

    static /* synthetic */ b c(b b8) {
        b = b8;
        return b8;
    }

    public static void d(n n8, long l8) {
        if (n8.v3() != null && n8.v3().f0() == null && !MusicService.H()) {
            c.f(n8.v3(), l8);
        }
    }

    private static void e(Context object, com.alphainventor.filemanager.activity.b b8, o o8, ax.h3.b b9, k k8) {
        if (q.n(b)) {
            return;
        }
        object = new b((Context)object, b8, o8, b9, k8);
        b = object;
        ((q)object).i(new Void[0]);
    }

    private static void f(com.alphainventor.filemanager.activity.b b8, long l8) {
        o o8;
        k k8;
        ax.h3.b b9;
        block3: {
            block4: {
                block2: {
                    b9 = ax.h3.b.b((Context)b8);
                    b9.g();
                    if (!b9.e() || b9.f(l8) || (k8 = b9.c()) == null) break block2;
                    o8 = x.e(k8.d());
                    if (o8.a()) break block3;
                    if (o8.S() != f.X0) break block4;
                }
                return;
            }
            o8.h(new c.a(){
                final Context a;
                final com.alphainventor.filemanager.activity.b b;
                final o c;
                final ax.h3.b d;
                final k e;
                {
                    this.a = context;
                    this.b = b8;
                    this.c = o8;
                    this.d = b9;
                    this.e = k8;
                }

                @Override
                public void B() {
                }

                @Override
                public void T(boolean bl, Object object) {
                    if (bl) {
                        c.e(this.a, this.b, this.c, this.d, this.e);
                    }
                }
            });
            return;
        }
        c.e((Context)b8, b8, o8, b9, k8);
    }

    private static class b
    extends q<Void, Integer, List<com.alphainventor.filemanager.file.n>> {
        private o h;
        private k i;
        private ax.h3.b j;
        private com.alphainventor.filemanager.file.n k;
        private Context l;
        private com.alphainventor.filemanager.activity.b m;

        b(Context context, com.alphainventor.filemanager.activity.b b8, o o8, ax.h3.b b9, k k8) {
            super(q.e.d0);
            this.h = o8;
            this.j = b9;
            this.i = k8;
            this.l = context;
            this.m = b8;
        }

        @Override
        protected void o() {
            c.c(null);
        }

        @Override
        protected void r() {
            this.h.n0();
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected List<com.alphainventor.filemanager.file.n> x(Void ... object) {
            RuntimeException var1_4;
            block4: {
                try {
                    object = this.h.z(this.i.e());
                    this.k = object;
                    if (!object.n()) {
                        this.k = null;
                        return null;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    break block4;
                }
                catch (j j8) {
                    break block4;
                }
                object = this.j.b;
                if (object == null) return null;
                Object object2 = this.h.z((object = ax.Z2.k.a(Uri.parse((String)object))).e());
                if (!object2.n()) return null;
                List<com.alphainventor.filemanager.file.n> list = this.h.f0((com.alphainventor.filemanager.file.n)object2);
                object = list;
                if (list == null) return object;
                object = this.h.S();
                int n8 = this.h.y();
                list = B.h(list, null, e.h(this.l, (f)((Object)object), n8, ((com.alphainventor.filemanager.file.n)object2).E(), false), B.P((com.alphainventor.filemanager.file.n)object2));
                object2 = E.F7(this.l, (f)((Object)object), n8, ((com.alphainventor.filemanager.file.n)object2).E(), false);
                object = list;
                if (object2 == null) return object;
                return ax.c3.q.g(list, ax.c3.q.c((String)object2));
            }
            var1_4.printStackTrace();
            return null;
        }

        protected void y(List<com.alphainventor.filemanager.file.n> list) {
            if (this.k != null) {
                Object object;
                Object object2 = a;
                Object object3 = new StringBuilder();
                ((StringBuilder)object3).append("media file info : ");
                ((StringBuilder)object3).append(this.k.E());
                ((StringBuilder)object3).append(",size=");
                if (list != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("");
                    ((StringBuilder)object).append(list.size());
                    object = ((StringBuilder)object).toString();
                } else {
                    object = "0";
                }
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append(",position:");
                ((StringBuilder)object3).append(this.j.d);
                ((Logger)object2).fine(((StringBuilder)object3).toString());
                object3 = this.m;
                object = this.k;
                object2 = this.j;
                ((com.alphainventor.filemanager.activity.b)object3).A0((com.alphainventor.filemanager.file.n)object, ((ax.h3.b)object2).b, list, ((ax.h3.b)object2).d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this){
                final b q;
                {
                    this.q = b8;
                }

                @Override
                public void run() {
                    this.q.h.k0(false);
                }
            }, 1500L);
            c.c(null);
        }
    }
}

