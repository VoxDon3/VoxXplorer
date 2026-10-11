package ax.Y0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.M0;
import ax.S0.C0987u;
import ax.a1.C1288f0;
import ax.a1.InterfaceC1276B;
import ax.a1.InterfaceC1309z;
import ax.e1.C1968a;
import ax.e1.C1972e;
import ax.e1.InterfaceC1969b;
import ax.f1.C2021o;
import ax.f1.InterfaceC2029x;
import ax.g1.C2104c;
import ax.g1.InterfaceC2103b;
import ax.k1.C2366i;
import ax.k1.InterfaceC2365h;
import ax.o1.C2672k;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* renamed from: ax.Y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1178d implements X {
    private final Context a;
    private final C2021o b;
    private boolean e;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean l;
    private int c = 0;
    private long d = 5000;
    private ax.f1.Q f = ax.f1.Q.a;
    private long k = -9223372036854775807L;

    public C1178d(Context context) {
        this.a = context;
        this.b = new C2021o(context);
    }

    @Override // ax.Y0.X
    public M0 a(M0 m0, Handler handler, ax.o1.P p, InterfaceC1309z interfaceC1309z, InterfaceC2365h interfaceC2365h, InterfaceC2103b interfaceC2103b) {
        if (m0.k() == 2) {
            return j(m0, this.a, this.c, this.f, this.e, handler, p, this.d);
        }
        return null;
    }

    @Override // ax.Y0.X
    public M0[] b(Handler handler, ax.o1.P p, InterfaceC1309z interfaceC1309z, InterfaceC2365h interfaceC2365h, InterfaceC2103b interfaceC2103b) {
        Handler handler2;
        ArrayList<M0> arrayList = new ArrayList<>();
        l(this.a, this.c, this.f, this.e, handler, p, this.d, arrayList);
        InterfaceC1276B d = d(this.a, this.g, this.h);
        if (d != null) {
            handler2 = handler;
            c(this.a, this.c, this.f, this.e, d, handler2, interfaceC1309z, arrayList);
        } else {
            handler2 = handler;
        }
        k(this.a, interfaceC2365h, handler2.getLooper(), this.c, arrayList);
        h(this.a, interfaceC2103b, handler2.getLooper(), this.c, arrayList);
        e(this.a, this.c, arrayList);
        f(this.a, arrayList);
        i(this.a, handler2, this.c, arrayList);
        return (M0[]) arrayList.toArray(new M0[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:14|15)|16|17|18|(2:19|20)|22|23|24|25|26|(5:28|29|30|31|32)|34|35|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:74|75|11|12|13|14|15|16|17|18|(2:19|20)|22|23|24|25|26|(5:28|29|30|31|32)|34|35|37) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void c(android.content.Context r21, int r22, ax.f1.Q r23, boolean r24, ax.a1.InterfaceC1276B r25, android.os.Handler r26, ax.a1.InterfaceC1309z r27, java.util.ArrayList<androidx.media3.exoplayer.M0> r28) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Y0.C1178d.c(android.content.Context, int, ax.f1.Q, boolean, ax.a1.B, android.os.Handler, ax.a1.z, java.util.ArrayList):void");
    }

    protected InterfaceC1276B d(Context context, boolean z, boolean z2) {
        return new C1288f0.g(context).o(z).n(z2).k();
    }

    protected void e(Context context, int i, ArrayList<M0> arrayList) {
        arrayList.add(new ax.p1.b());
    }

    protected void f(Context context, ArrayList<M0> arrayList) {
        g(arrayList);
    }

    @Deprecated
    protected void g(ArrayList<M0> arrayList) {
        arrayList.add(new C1972e(n(this.a), null));
    }

    protected void h(Context context, InterfaceC2103b interfaceC2103b, Looper looper, int i, ArrayList<M0> arrayList) {
        arrayList.add(new C2104c(interfaceC2103b, looper));
        arrayList.add(new C2104c(interfaceC2103b, looper));
    }

    protected M0 j(M0 m0, Context context, int i, ax.f1.Q q, boolean z, Handler handler, ax.o1.P p, long j) {
        if (!this.i || m0.getClass() != C2672k.class) {
            return null;
        }
        C2672k.d p2 = new C2672k.d(context).s(m()).x(q).r(j).t(z).u(handler).v(p).w(50).q(this.j).p(this.k);
        if (Build.VERSION.SDK_INT >= 34) {
            p2 = p2.o(this.l);
        }
        return p2.n();
    }

    protected void k(Context context, InterfaceC2365h interfaceC2365h, Looper looper, int i, ArrayList<M0> arrayList) {
        arrayList.add(new C2366i(interfaceC2365h, looper));
    }

    protected void l(Context context, int i, ax.f1.Q q, boolean z, Handler handler, ax.o1.P p, long j, ArrayList<M0> arrayList) {
        String str;
        int i2;
        char c;
        int i3;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        C2672k.d p2 = new C2672k.d(context).s(m()).x(q).r(j).t(z).u(handler).v(p).w(50).q(this.j).p(this.k);
        if (Build.VERSION.SDK_INT >= 34) {
            p2 = p2.o(this.l);
        }
        arrayList.add(p2.n());
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (M0) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, ax.o1.P.class, cls).newInstance(Long.valueOf(j), handler, p, 50));
                    str = "DefaultRenderersFactory";
                    try {
                        C0987u.f(str, "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i2;
                        i2 = size;
                        try {
                            c = 1;
                            try {
                                i3 = i2 + 1;
                            } catch (ClassNotFoundException unused2) {
                            }
                        } catch (ClassNotFoundException unused3) {
                            c = 1;
                        }
                        try {
                            arrayList.add(i2, (M0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, ax.o1.P.class, cls).newInstance(Long.valueOf(j), handler, p, 50));
                            C0987u.f(str, "Loaded Libgav1VideoRenderer.");
                        } catch (ClassNotFoundException unused4) {
                            i2 = i3;
                            i3 = i2;
                            Class<?> cls3 = Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer");
                            Class<?>[] clsArr = new Class[4];
                            clsArr[0] = cls2;
                            clsArr[c] = Handler.class;
                            clsArr[2] = ax.o1.P.class;
                            clsArr[3] = cls;
                            Constructor<?> constructor = cls3.getConstructor(clsArr);
                            Object[] objArr = new Object[4];
                            objArr[0] = Long.valueOf(j);
                            objArr[c] = handler;
                            objArr[2] = p;
                            objArr[3] = 50;
                            arrayList.add(i3, (M0) constructor.newInstance(objArr));
                            C0987u.f(str, "Loaded FfmpegVideoRenderer.");
                        }
                        Class<?> cls32 = Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer");
                        Class<?>[] clsArr2 = new Class[4];
                        clsArr2[0] = cls2;
                        clsArr2[c] = Handler.class;
                        clsArr2[2] = ax.o1.P.class;
                        clsArr2[3] = cls;
                        Constructor<?> constructor2 = cls32.getConstructor(clsArr2);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = Long.valueOf(j);
                        objArr2[c] = handler;
                        objArr2[2] = p;
                        objArr2[3] = 50;
                        arrayList.add(i3, (M0) constructor2.newInstance(objArr2));
                        C0987u.f(str, "Loaded FfmpegVideoRenderer.");
                    }
                } catch (ClassNotFoundException unused5) {
                    str = "DefaultRenderersFactory";
                }
            } catch (Exception e) {
                throw new IllegalStateException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused6) {
            str = "DefaultRenderersFactory";
        }
        try {
            c = 1;
            i3 = i2 + 1;
            arrayList.add(i2, (M0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, ax.o1.P.class, cls).newInstance(Long.valueOf(j), handler, p, 50));
            C0987u.f(str, "Loaded Libgav1VideoRenderer.");
            try {
                Class<?> cls322 = Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer");
                Class<?>[] clsArr22 = new Class[4];
                clsArr22[0] = cls2;
                clsArr22[c] = Handler.class;
                clsArr22[2] = ax.o1.P.class;
                clsArr22[3] = cls;
                Constructor<?> constructor22 = cls322.getConstructor(clsArr22);
                Object[] objArr22 = new Object[4];
                objArr22[0] = Long.valueOf(j);
                objArr22[c] = handler;
                objArr22[2] = p;
                objArr22[3] = 50;
                arrayList.add(i3, (M0) constructor22.newInstance(objArr22));
                C0987u.f(str, "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused7) {
            } catch (Exception e2) {
                throw new IllegalStateException("Error instantiating FFmpeg extension", e2);
            }
        } catch (Exception e3) {
            throw new IllegalStateException("Error instantiating AV1 extension", e3);
        }
    }

    protected InterfaceC2029x.b m() {
        return this.b;
    }

    protected InterfaceC1969b.a n(Context context) {
        return new C1968a.c(context);
    }

    public final C1178d o(boolean z) {
        this.e = z;
        return this;
    }

    public final C1178d p(int i) {
        this.c = i;
        return this;
    }

    protected void i(Context context, Handler handler, int i, ArrayList<M0> arrayList) {
    }
}
