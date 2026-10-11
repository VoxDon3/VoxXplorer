package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.C0609l;
import androidx.media3.exoplayer.X0;
import ax.S0.C0968a;
import ax.S0.C0973f;
import ax.S0.InterfaceC0975h;
import ax.Y0.C1180f;
import ax.Y0.C1184j;
import ax.Y0.C1191q;
import ax.Y0.C1192s;
import ax.Y0.C1197x;
import ax.Y0.C1198y;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.media3.exoplayer.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0609l implements X0 {
    private final X0 a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.l$b */
    static final class b implements X0 {
        private AudioManager a;
        private AudioDeviceCallback b;
        private C0973f<Boolean> c;

        /* renamed from: androidx.media3.exoplayer.l$b$a */
        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.c.g(Boolean.valueOf(b.this.i()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.c.g(Boolean.valueOf(b.this.i()));
            }
        }

        private b() {
        }

        public static /* synthetic */ void d(b bVar, Context context) {
            AudioManager audioManager;
            C0968a.e(bVar.c);
            if (ax.S0.d0.T0(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                bVar.a = audioManager;
                a aVar = bVar.new a();
                bVar.b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) C0968a.e(Looper.myLooper())));
                bVar.c.g(Boolean.valueOf(bVar.i()));
            }
        }

        public static /* synthetic */ void e(b bVar) {
            AudioManager audioManager = bVar.a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback(C1180f.a(C0968a.e(bVar.b)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i() {
            AudioDeviceInfo[] devices;
            int type;
            int type2;
            int type3;
            int type4;
            int type5;
            int type6;
            int type7;
            int type8;
            int type9;
            int type10;
            int type11;
            devices = ((AudioManager) C0968a.i(this.a)).getDevices(2);
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                type = audioDeviceInfo.getType();
                if (type != 8) {
                    type2 = audioDeviceInfo.getType();
                    if (type2 != 5) {
                        type3 = audioDeviceInfo.getType();
                        if (type3 != 6) {
                            type4 = audioDeviceInfo.getType();
                            if (type4 != 11) {
                                type5 = audioDeviceInfo.getType();
                                if (type5 != 4) {
                                    type6 = audioDeviceInfo.getType();
                                    if (type6 != 3) {
                                        int i = Build.VERSION.SDK_INT;
                                        if (i >= 26) {
                                            type11 = audioDeviceInfo.getType();
                                            if (type11 == 22) {
                                                return true;
                                            }
                                        }
                                        if (i >= 28) {
                                            type10 = audioDeviceInfo.getType();
                                            if (type10 == 23) {
                                                return true;
                                            }
                                        }
                                        if (i >= 31) {
                                            type8 = audioDeviceInfo.getType();
                                            if (type8 != 26) {
                                                type9 = audioDeviceInfo.getType();
                                                if (type9 == 27) {
                                                }
                                            }
                                            return true;
                                        }
                                        if (i >= 33) {
                                            type7 = audioDeviceInfo.getType();
                                            if (type7 == 30) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.X0
        public boolean a() {
            C0973f<Boolean> c0973f = this.c;
            if (c0973f == null) {
                return true;
            }
            return c0973f.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.X0
        public void b(final X0.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC0975h interfaceC0975h) {
            C0973f<Boolean> c0973f = new C0973f<>(Boolean.TRUE, looper2, looper, interfaceC0975h, new C0973f.a() { // from class: androidx.media3.exoplayer.n
                @Override // ax.S0.C0973f.a
                public final void a(Object obj, Object obj2) {
                    X0.a.this.a(((Boolean) obj2).booleanValue());
                }
            });
            this.c = c0973f;
            c0973f.e(new Runnable() { // from class: androidx.media3.exoplayer.o
                @Override // java.lang.Runnable
                public final void run() {
                    C0609l.b.d(C0609l.b.this, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.X0
        public void f() {
            ((C0973f) C0968a.e(this.c)).e(new Runnable() { // from class: androidx.media3.exoplayer.m
                @Override // java.lang.Runnable
                public final void run() {
                    C0609l.b.e(C0609l.b.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.l$c */
    static final class c implements X0 {
        private static final RouteDiscoveryPreference e;
        private MediaRouter2 a;
        private MediaRouter2.RouteCallback b;
        private MediaRouter2.ControllerCallback c;
        private C0973f<Boolean> d;

        /* renamed from: androidx.media3.exoplayer.l$c$a */
        class a extends MediaRouter2.RouteCallback {
            a() {
            }
        }

        /* renamed from: androidx.media3.exoplayer.l$c$b */
        class b extends MediaRouter2.ControllerCallback {
            b() {
            }

            @Override // android.media.MediaRouter2.ControllerCallback
            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.d.g(Boolean.valueOf(c.k(c.this.a)));
            }
        }

        static {
            RouteDiscoveryPreference build;
            C1192s.a();
            build = C1184j.a(AbstractC2991z.z(), false).build();
            e = build;
        }

        private c() {
        }

        public static /* synthetic */ void c(c cVar) {
            C1197x.a(C0968a.e(cVar.a)).unregisterControllerCallback(C1198y.a(C0968a.e(cVar.c)));
            cVar.c = null;
            cVar.a.unregisterRouteCallback(ax.Y0.A.a(C0968a.e(cVar.b)));
        }

        public static /* synthetic */ void e(c cVar, Context context) {
            MediaRouter2 mediaRouter2;
            C0968a.e(cVar.d);
            mediaRouter2 = MediaRouter2.getInstance(context);
            cVar.a = mediaRouter2;
            cVar.b = cVar.new a();
            final C0973f<Boolean> c0973f = cVar.d;
            Objects.requireNonNull(c0973f);
            Executor executor = new Executor() { // from class: ax.Y0.B
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    C0973f.this.e(runnable);
                }
            };
            cVar.a.registerRouteCallback(executor, cVar.b, e);
            b bVar = cVar.new b();
            cVar.c = bVar;
            cVar.a.registerControllerCallback(executor, bVar);
            cVar.d.g(Boolean.valueOf(k(cVar.a)));
        }

        private static boolean j(MediaRoute2Info mediaRoute2Info, int i, boolean z) {
            int suitabilityStatus;
            suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            return suitabilityStatus == 1 ? (i == 1 || i == 2) && z : suitabilityStatus == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean k(MediaRouter2 mediaRouter2) {
            MediaRouter2.RoutingController systemController;
            RoutingSessionInfo routingSessionInfo;
            int transferReason;
            MediaRouter2.RoutingController systemController2;
            boolean wasTransferInitiatedBySelf;
            MediaRouter2.RoutingController systemController3;
            List selectedRoutes;
            systemController = C1197x.a(C0968a.e(mediaRouter2)).getSystemController();
            routingSessionInfo = systemController.getRoutingSessionInfo();
            transferReason = routingSessionInfo.getTransferReason();
            systemController2 = mediaRouter2.getSystemController();
            wasTransferInitiatedBySelf = systemController2.wasTransferInitiatedBySelf();
            systemController3 = mediaRouter2.getSystemController();
            selectedRoutes = systemController3.getSelectedRoutes();
            Iterator it = selectedRoutes.iterator();
            while (it.hasNext()) {
                if (j(C1191q.a(it.next()), transferReason, wasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.X0
        public boolean a() {
            C0973f<Boolean> c0973f = this.d;
            if (c0973f == null) {
                return true;
            }
            return c0973f.d().booleanValue();
        }

        @Override // androidx.media3.exoplayer.X0
        @SuppressLint({"ThreadSafe"})
        public void b(final X0.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC0975h interfaceC0975h) {
            C0973f<Boolean> c0973f = new C0973f<>(Boolean.TRUE, looper2, looper, interfaceC0975h, new C0973f.a() { // from class: androidx.media3.exoplayer.q
                @Override // ax.S0.C0973f.a
                public final void a(Object obj, Object obj2) {
                    X0.a.this.a(((Boolean) obj2).booleanValue());
                }
            });
            this.d = c0973f;
            c0973f.e(new Runnable() { // from class: androidx.media3.exoplayer.r
                @Override // java.lang.Runnable
                public final void run() {
                    C0609l.c.e(C0609l.c.this, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.X0
        public void f() {
            ((C0973f) C0968a.i(this.d)).e(new Runnable() { // from class: androidx.media3.exoplayer.p
                @Override // java.lang.Runnable
                public final void run() {
                    C0609l.c.c(C0609l.c.this);
                }
            });
        }
    }

    public C0609l() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new c();
        } else if (i >= 23) {
            this.a = new b();
        } else {
            this.a = null;
        }
    }

    @Override // androidx.media3.exoplayer.X0
    public boolean a() {
        X0 x0 = this.a;
        return x0 == null || x0.a();
    }

    @Override // androidx.media3.exoplayer.X0
    public void b(X0.a aVar, Context context, Looper looper, Looper looper2, InterfaceC0975h interfaceC0975h) {
        X0 x0 = this.a;
        if (x0 != null) {
            x0.b(aVar, context, looper, looper2, interfaceC0975h);
        }
    }

    @Override // androidx.media3.exoplayer.X0
    public void f() {
        X0 x0 = this.a;
        if (x0 != null) {
            x0.f();
        }
    }
}
