/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.decoder.ffmpeg.b;
import androidx.media3.exoplayer.M0;
import ax.S0.u;
import ax.X0.f;
import ax.Y0.X;
import ax.a1.B;
import ax.a1.C0;
import ax.a1.f0;
import ax.a1.z;
import ax.e1.a;
import ax.e1.b;
import ax.e1.e;
import ax.f1.Q;
import ax.f1.o;
import ax.f1.x;
import ax.g1.c;
import ax.k1.h;
import ax.k1.i;
import ax.o1.P;
import ax.o1.k;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class d
implements X {
    private final Context a;
    private final o b;
    private int c;
    private long d;
    private boolean e;
    private Q f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private boolean l;

    public d(Context context) {
        this.a = context;
        this.b = new o(context);
        this.c = 0;
        this.d = 5000L;
        this.f = Q.a;
        this.k = -9223372036854775807L;
    }

    @Override
    public M0 a(M0 m02, Handler handler, P p8, z z8, h h8, ax.g1.b b8) {
        if (m02.k() == 2) {
            return this.j(m02, this.a, this.c, this.f, this.e, handler, p8, this.d);
        }
        return null;
    }

    @Override
    public M0[] b(Handler handler, P object, z z8, h h8, ax.g1.b b8) {
        ArrayList<M0> arrayList = new ArrayList<M0>();
        this.l(this.a, this.c, this.f, this.e, handler, (P)object, this.d, arrayList);
        object = this.d(this.a, this.g, this.h);
        if (object != null) {
            this.c(this.a, this.c, this.f, this.e, (B)object, handler, z8, arrayList);
        }
        this.k(this.a, h8, handler.getLooper(), this.c, arrayList);
        this.h(this.a, b8, handler.getLooper(), this.c, arrayList);
        this.e(this.a, this.c, arrayList);
        this.f(this.a, arrayList);
        this.i(this.a, handler, this.c, arrayList);
        return arrayList.toArray(new M0[0]);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void c(Context object, int n8, Q object2, boolean bl, B b8, Handler handler, z z8, ArrayList<M0> arrayList) {
        int n9;
        Handler var5_25;
        Handler var7_27;
        Handler var6_26;
        Object var8_28;
        block41: {
            int n10;
            block40: {
                block39: {
                    M0 m02;
                    block38: {
                        block37: {
                            block36: {
                                block35: {
                                    int n11;
                                    Handler var4_24;
                                    var8_28.add(new C0((Context)object, this.m(), (Q)((Object)m02), (boolean)var4_24, (Handler)var6_26, (z)var7_27, (B)var5_25));
                                    if (n10 == 0) {
                                        return;
                                    }
                                    n9 = n11 = var8_28.size();
                                    if (n10 == 2) {
                                        n9 = n11 - 1;
                                    }
                                    try {
                                        try {
                                            m02 = (M0)f.class.getConstructor(Context.class, Handler.class, z.class, B.class).newInstance(object, var6_26, var7_27, var5_25);
                                            n10 = n9 + 1;
                                        }
                                        catch (ClassNotFoundException classNotFoundException) {
                                            break block35;
                                        }
                                        try {
                                            var8_28.add(n9, m02);
                                            u.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                                            break block36;
                                        }
                                        catch (ClassNotFoundException classNotFoundException) {
                                            n9 = n10;
                                        }
                                    }
                                    catch (Exception exception) {
                                        throw new IllegalStateException("Error instantiating MIDI extension", exception);
                                    }
                                }
                                n10 = n9;
                            }
                            try {
                                try {
                                    m02 = (M0)Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, z.class, B.class).newInstance(var6_26, var7_27, var5_25);
                                    n9 = n10 + 1;
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    break block37;
                                }
                                try {
                                    var8_28.add(n10, m02);
                                    u.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                                    n10 = n9;
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    n10 = n9;
                                }
                            }
                            catch (Exception exception) {
                                throw new IllegalStateException("Error instantiating Opus extension", exception);
                            }
                        }
                        try {
                            try {
                                m02 = (M0)Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, z.class, B.class).newInstance(var6_26, var7_27, var5_25);
                                n9 = n10 + 1;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                break block38;
                            }
                            try {
                                var8_28.add(n10, m02);
                                u.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                                n10 = n9;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                n10 = n9;
                            }
                        }
                        catch (Exception exception) {
                            throw new IllegalStateException("Error instantiating FLAC extension", exception);
                        }
                    }
                    try {
                        try {
                            n9 = androidx.media3.decoder.ffmpeg.b.W0;
                            m02 = (M0)b.class.getConstructor(Handler.class, z.class, B.class).newInstance(var6_26, var7_27, var5_25);
                            n9 = n10 + 1;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            break block39;
                        }
                        try {
                            var8_28.add(n10, m02);
                            u.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            n10 = n9;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            n10 = n9;
                        }
                    }
                    catch (Exception exception) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", exception);
                    }
                }
                try {
                    M0 m03;
                    try {
                        m03 = (M0)Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, z.class, B.class).newInstance(object, var6_26, var7_27, var5_25);
                        n9 = n10 + 1;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        break block40;
                    }
                    try {
                        var8_28.add(n10, m03);
                        u.f("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                        break block41;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        n10 = n9;
                    }
                }
                catch (Exception exception) {
                    throw new IllegalStateException("Error instantiating IAMF extension", exception);
                }
            }
            n9 = n10;
        }
        try {
            var8_28.add(n9, (M0)Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, z.class, B.class).newInstance(var6_26, var7_27, var5_25));
            u.f("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
            return;
        }
        catch (Exception exception) {
            throw new IllegalStateException("Error instantiating MPEG-H extension", exception);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return;
        }
    }

    protected B d(Context context, boolean bl, boolean bl2) {
        return new f0.g(context).o(bl).n(bl2).k();
    }

    protected void e(Context context, int n8, ArrayList<M0> arrayList) {
        arrayList.add(new ax.p1.b());
    }

    protected void f(Context context, ArrayList<M0> arrayList) {
        this.g(arrayList);
    }

    @Deprecated
    protected void g(ArrayList<M0> arrayList) {
        arrayList.add(new e(this.n(this.a), null));
    }

    protected void h(Context context, ax.g1.b b8, Looper looper, int n8, ArrayList<M0> arrayList) {
        arrayList.add(new c(b8, looper));
        arrayList.add(new c(b8, looper));
    }

    protected void i(Context context, Handler handler, int n8, ArrayList<M0> arrayList) {
    }

    protected M0 j(M0 object, Context object2, int n8, Q q8, boolean bl, Handler handler, P p8, long l8) {
        if (this.i && object.getClass() == k.class) {
            object = object2 = new k.d((Context)object2).s(this.m()).x(q8).r(l8).t(bl).u(handler).v(p8).w(50).q(this.j).p(this.k);
            if (Build.VERSION.SDK_INT >= 34) {
                object = ((k.d)object2).o(this.l);
            }
            return ((k.d)object).n();
        }
        return null;
    }

    protected void k(Context context, h h8, Looper looper, int n8, ArrayList<M0> arrayList) {
        arrayList.add(new i(h8, looper));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void l(Context object, int n8, Q object2, boolean bl, Handler handler, P p8, long l8, ArrayList<M0> arrayList) {
        Integer n9;
        Class<Long> clazz;
        Class<Integer> clazz2;
        block25: {
            int n10;
            block22: {
                block24: {
                    block23: {
                        int n11;
                        clazz2 = Integer.TYPE;
                        clazz = Long.TYPE;
                        object = new k.d((Context)object).s(this.m()).x((Q)object2).r(l8).t(bl).u(handler).v(p8);
                        n9 = 50;
                        object = object2 = ((k.d)object).w(50).q(this.j).p(this.k);
                        if (Build.VERSION.SDK_INT >= 34) {
                            object = ((k.d)object2).o(this.l);
                        }
                        arrayList.add(((k.d)object).n());
                        if (n8 == 0) {
                            return;
                        }
                        n10 = n11 = arrayList.size();
                        if (n8 == 2) {
                            n10 = n11 - 1;
                        }
                        try {
                            try {
                                object = (M0)Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(clazz, Handler.class, P.class, clazz2).newInstance(l8, handler, p8, n9);
                                n8 = n10 + 1;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                break block24;
                            }
                            try {
                                arrayList.add(n10, (M0)object);
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                break block23;
                            }
                            try {
                                u.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                                break block22;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                            }
                        }
                        catch (Exception exception) {
                            throw new IllegalStateException("Error instantiating VP9 extension", exception);
                        }
                    }
                    n10 = n8;
                }
                n8 = n10;
            }
            try {
                try {
                    object = Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(clazz, Handler.class, P.class, clazz2);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    break block25;
                }
                try {
                    object = (M0)((Constructor)object).newInstance(l8, handler, p8, n9);
                    n10 = n8 + 1;
                }
                catch (ClassNotFoundException classNotFoundException) {
                }
                try {
                    arrayList.add(n8, (M0)object);
                    u.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    n8 = n10;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    n8 = n10;
                }
            }
            catch (Exception exception) {
                throw new IllegalStateException("Error instantiating AV1 extension", exception);
            }
        }
        try {
            arrayList.add(n8, (M0)Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(clazz, Handler.class, P.class, clazz2).newInstance(l8, handler, p8, n9));
            u.f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            return;
        }
        catch (Exception exception) {
            throw new IllegalStateException("Error instantiating FFmpeg extension", exception);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return;
        }
    }

    protected x.b m() {
        return this.b;
    }

    protected b.a n(Context context) {
        return new a.c(context);
    }

    public final d o(boolean bl) {
        this.e = bl;
        return this;
    }

    public final d p(int n8) {
        this.c = n8;
        return this;
    }
}

