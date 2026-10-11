/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.X0;
import androidx.media3.exoplayer.m;
import androidx.media3.exoplayer.n;
import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.p;
import androidx.media3.exoplayer.q;
import androidx.media3.exoplayer.r;
import ax.S0.a;
import ax.S0.d0;
import ax.Y0.A;
import ax.Y0.B;
import ax.Y0.e;
import ax.Y0.f;
import ax.Y0.g;
import ax.Y0.h;
import ax.Y0.i;
import ax.Y0.j;
import ax.Y0.k;
import ax.Y0.s;
import ax.Y0.t;
import ax.Y0.u;
import ax.Y0.v;
import ax.Y0.w;
import ax.Y0.x;
import ax.Y0.y;
import ax.Y0.z;
import java.util.concurrent.Executor;

final class l
implements X0 {
    private final X0 a;

    public l() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 35) {
            this.a = new c();
            return;
        }
        if (n8 >= 23) {
            this.a = new b();
            return;
        }
        this.a = null;
    }

    @Override
    public boolean a() {
        X0 x02 = this.a;
        return x02 == null || x02.a();
        {
        }
    }

    @Override
    public void b(X0.a a8, Context context, Looper looper, Looper looper2, ax.S0.h h8) {
        X0 x02 = this.a;
        if (x02 != null) {
            x02.b(a8, context, looper, looper2, h8);
        }
    }

    @Override
    public void f() {
        X0 x02 = this.a;
        if (x02 != null) {
            x02.f();
        }
    }

    private static final class b
    implements X0 {
        private AudioManager a;
        private AudioDeviceCallback b;
        private ax.S0.f<Boolean> c;

        private b() {
        }

        public static /* synthetic */ void c(X0.a a8, Boolean bl, Boolean bl2) {
            a8.a(bl2);
        }

        public static /* synthetic */ void d(b b8, Context object) {
            AudioManager audioManager;
            ax.S0.a.e(b8.c);
            if (!d0.T0(object) || (audioManager = (AudioManager)object.getSystemService("audio")) == null) {
                return;
            }
            b8.a = audioManager;
            object = new AudioDeviceCallback(b8){
                final b a;
                {
                    this.a = b8;
                }

                public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArray) {
                    this.a.c.g(this.a.i());
                }

                public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArray) {
                    this.a.c.g(this.a.i());
                }
            };
            b8.b = object;
            e.a(audioManager, (AudioDeviceCallback)object, new Handler(ax.S0.a.e(Looper.myLooper())));
            b8.c.g(b8.i());
        }

        public static /* synthetic */ void e(b b8) {
            AudioManager audioManager = b8.a;
            if (audioManager != null) {
                g.a(audioManager, f.a(ax.S0.a.e(b8.b)));
            }
        }

        private boolean i() {
            for (AudioDeviceInfo audioDeviceInfo : h.a(ax.S0.a.i(this.a), 2)) {
                if (i.a(audioDeviceInfo) != 8 && i.a(audioDeviceInfo) != 5 && i.a(audioDeviceInfo) != 6 && i.a(audioDeviceInfo) != 11 && i.a(audioDeviceInfo) != 4 && i.a(audioDeviceInfo) != 3) {
                    int n8 = Build.VERSION.SDK_INT;
                    if (n8 >= 26 && i.a(audioDeviceInfo) == 22) {
                        return true;
                    }
                    if (n8 >= 28 && i.a(audioDeviceInfo) == 23) {
                        return true;
                    }
                    if (n8 >= 31 && (i.a(audioDeviceInfo) == 26 || i.a(audioDeviceInfo) == 27)) {
                        return true;
                    }
                    if (n8 < 33 || i.a(audioDeviceInfo) != 30) continue;
                    return true;
                }
                return true;
            }
            return false;
        }

        @Override
        public boolean a() {
            ax.S0.f<Boolean> f8 = this.c;
            if (f8 == null) {
                return true;
            }
            return f8.d();
        }

        @Override
        public void b(X0.a object, Context context, Looper looper, Looper looper2, ax.S0.h h8) {
            this.c = object = new ax.S0.f<Boolean>(Boolean.TRUE, looper2, looper, h8, new n((X0.a)object));
            ((ax.S0.f)object).e(new o(this, context));
        }

        @Override
        public void f() {
            ax.S0.a.e(this.c).e(new m(this));
        }
    }

    private static final class c
    implements X0 {
        private static final RouteDiscoveryPreference e;
        private MediaRouter2 a;
        private MediaRouter2.RouteCallback b;
        private MediaRouter2.ControllerCallback c;
        private ax.S0.f<Boolean> d;

        static {
            s.a();
            e = t.a(j.a(ax.r7.z.z(), false));
        }

        private c() {
        }

        public static /* synthetic */ void c(c c8) {
            z.a(x.a(ax.S0.a.e(c8.a)), y.a(ax.S0.a.e(c8.c)));
            c8.c = null;
            k.a(c8.a, A.a(ax.S0.a.e(c8.b)));
        }

        public static /* synthetic */ void d(X0.a a8, Boolean bl, Boolean bl2) {
            a8.a(bl2);
        }

        public static /* synthetic */ void e(c c8, Context object) {
            MediaRouter2.ControllerCallback controllerCallback;
            ax.S0.a.e(c8.d);
            c8.a = u.a(object);
            c8.b = new MediaRouter2.RouteCallback(c8){
                final c a;
                {
                    this.a = c8;
                }
            };
            object = c8.d;
            j.Objects.requireNonNull((Object)object);
            object = new B((ax.S0.f)object);
            v.a(c8.a, (Executor)object, c8.b, e);
            c8.c = controllerCallback = new MediaRouter2.ControllerCallback(c8){
                final c a;
                {
                    this.a = c8;
                }

                public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                    this.a.d.g(androidx.media3.exoplayer.l$c.k(this.a.a));
                }
            };
            w.a(c8.a, (Executor)object, controllerCallback);
            c8.d.g(androidx.media3.exoplayer.l$c.k(c8.a));
        }

        private static boolean j(MediaRoute2Info mediaRoute2Info, int n8, boolean bl) {
            int n9 = ax.Y0.r.a(mediaRoute2Info);
            if (n9 == 1) {
                return (n8 == 1 || n8 == 2) && bl;
            }
            return n9 == 0;
        }

        private static boolean k(MediaRouter2 object) {
            int n8 = ax.Y0.n.a(ax.Y0.m.a(ax.Y0.l.a(x.a(ax.S0.a.e(object)))));
            boolean bl = ax.Y0.o.a(ax.Y0.l.a((MediaRouter2)object));
            object = ax.Y0.p.a(ax.Y0.l.a((MediaRouter2)object)).iterator();
            while (object.hasNext()) {
                if (!androidx.media3.exoplayer.l$c.j(ax.Y0.q.a(object.next()), n8, bl)) continue;
                return true;
            }
            return false;
        }

        @Override
        public boolean a() {
            ax.S0.f<Boolean> f8 = this.d;
            if (f8 == null) {
                return true;
            }
            return f8.d();
        }

        @Override
        @SuppressLint(value={"ThreadSafe"})
        public void b(X0.a object, Context context, Looper looper, Looper looper2, ax.S0.h h8) {
            this.d = object = new ax.S0.f<Boolean>(Boolean.TRUE, looper2, looper, h8, new q((X0.a)object));
            ((ax.S0.f)object).e(new r(this, context));
        }

        @Override
        public void f() {
            ax.S0.a.i(this.d).e(new p(this));
        }
    }
}

