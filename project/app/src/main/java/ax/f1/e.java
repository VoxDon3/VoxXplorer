/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import ax.P0.D;
import ax.P0.v;
import ax.S0.N;
import ax.f1.a;
import ax.f1.c;
import ax.f1.d;
import ax.f1.d0;
import ax.f1.f;
import ax.f1.g;
import ax.f1.j;
import ax.f1.m;
import ax.f1.t;
import ax.f1.x;
import ax.f1.z;
import ax.q7.u;
import java.io.IOException;
import java.nio.ByteBuffer;

final class e
implements x {
    private final MediaCodec a;
    private final m b;
    private final z c;
    private final t d;
    private boolean e;
    private int f;

    private e(MediaCodec mediaCodec, HandlerThread handlerThread, z z8, t t8) {
        this.a = mediaCodec;
        this.b = new m(handlerThread);
        this.c = z8;
        this.d = t8;
        this.f = 0;
    }

    public static /* synthetic */ void r(e e8, x.d d8, MediaCodec mediaCodec, long l8, long l9) {
        e8.getClass();
        d8.a(e8, l8, l9);
    }

    private static String v(int n8) {
        return ax.f1.e.x(n8, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    private static String w(int n8) {
        return ax.f1.e.x(n8, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String x(int n8, String charSequence) {
        charSequence = new StringBuilder((String)charSequence);
        if (n8 == 1) {
            ((StringBuilder)charSequence).append("Audio");
        } else if (n8 == 2) {
            ((StringBuilder)charSequence).append("Video");
        } else {
            ((StringBuilder)charSequence).append("Unknown(");
            ((StringBuilder)charSequence).append(n8);
            ((StringBuilder)charSequence).append(")");
        }
        return ((StringBuilder)charSequence).toString();
    }

    private void y(MediaFormat object, Surface surface, MediaCrypto mediaCrypto, int n8) {
        this.b.h(this.a);
        N.a("configureCodec");
        this.a.configure((MediaFormat)object, surface, mediaCrypto, n8);
        N.b();
        this.c.start();
        N.a("startCodec");
        this.a.start();
        N.b();
        if (Build.VERSION.SDK_INT >= 35 && (object = this.d) != null) {
            ((t)object).b(this.a);
        }
        this.f = 1;
    }

    @Override
    public void a(Bundle bundle) {
        this.c.a(bundle);
    }

    @Override
    public void b(int n8, int n9, ax.V0.c c8, long l8, int n10) {
        this.c.b(n8, n9, c8, l8, n10);
    }

    @Override
    public void c(int n8, int n9, int n10, long l8, int n11) {
        this.c.c(n8, n9, n10, l8, n11);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d() {
        t t8;
        Throwable throwable4;
        block15: {
            t t9;
            int n8;
            Throwable throwable22;
            block14: {
                block11: {
                    t t10;
                    Throwable throwable32;
                    block13: {
                        t t11;
                        int n9;
                        block12: {
                            block10: {
                                try {
                                    if (this.f != 1) break block10;
                                    this.c.shutdown();
                                    this.b.q();
                                }
                                catch (Throwable throwable22) {
                                    break block11;
                                }
                            }
                            this.f = 2;
                            if (this.e) return;
                            try {
                                n9 = Build.VERSION.SDK_INT;
                                if (n9 < 30 || n9 >= 33) break block12;
                                this.a.stop();
                            }
                            catch (Throwable throwable32) {
                                break block13;
                            }
                        }
                        if (n9 >= 35 && (t11 = this.d) != null) {
                            t11.d(this.a);
                        }
                        this.a.release();
                        this.e = true;
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 35 && (t10 = this.d) != null) {
                        t10.d(this.a);
                    }
                    this.a.release();
                    this.e = true;
                    throw throwable32;
                }
                if (this.e) throw throwable22;
                try {
                    n8 = Build.VERSION.SDK_INT;
                    if (n8 < 30 || n8 >= 33) break block14;
                    this.a.stop();
                }
                catch (Throwable throwable4) {
                    break block15;
                }
            }
            if (n8 >= 35 && (t9 = this.d) != null) {
                t9.d(this.a);
            }
            this.a.release();
            this.e = true;
            throw throwable22;
        }
        if (Build.VERSION.SDK_INT >= 35 && (t8 = this.d) != null) {
            t8.d(this.a);
        }
        this.a.release();
        this.e = true;
        throw throwable4;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public MediaFormat f() {
        return this.b.g();
    }

    @Override
    public void flush() {
        this.c.flush();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    @Override
    public void g() {
        ax.f1.a.a(this.a);
    }

    @Override
    public boolean h(x.c c8) {
        this.b.p(c8);
        return true;
    }

    @Override
    public void i(int n8, long l8) {
        this.a.releaseOutputBuffer(n8, l8);
    }

    @Override
    public int j() {
        this.c.d();
        return this.b.c();
    }

    @Override
    public void k(x.d d8, Handler handler) {
        ax.f1.b.a(this.a, new d(this, d8), handler);
    }

    @Override
    public int l(MediaCodec.BufferInfo bufferInfo) {
        this.c.d();
        return this.b.d(bufferInfo);
    }

    @Override
    public void m(int n8, boolean bl) {
        this.a.releaseOutputBuffer(n8, bl);
    }

    @Override
    public void n(int n8) {
        this.a.setVideoScalingMode(n8);
    }

    @Override
    public ByteBuffer o(int n8) {
        return this.a.getInputBuffer(n8);
    }

    @Override
    public void p(Surface surface) {
        ax.f1.c.a(this.a, surface);
    }

    @Override
    public ByteBuffer q(int n8) {
        return this.a.getOutputBuffer(n8);
    }

    public static final class b
    implements x.b {
        private final u<HandlerThread> b;
        private final u<HandlerThread> c;
        private boolean d;

        public b(int n8) {
            this(new f(n8), new g(n8));
        }

        public b(u<HandlerThread> u8, u<HandlerThread> u9) {
            this.b = u8;
            this.c = u9;
            this.d = false;
        }

        public static /* synthetic */ HandlerThread b(int n8) {
            return new HandlerThread(ax.f1.e.w(n8));
        }

        public static /* synthetic */ HandlerThread c(int n8) {
            return new HandlerThread(ax.f1.e.v(n8));
        }

        private static boolean f(v v8) {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 < 34) {
                return false;
            }
            return n8 >= 35 || D.s(v8.o);
            {
            }
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public e d(x.a a8) throws IOException {
            RuntimeException var1_5;
            e e8;
            Object object;
            block7: {
                int n8;
                e e9;
                block10: {
                    int n9;
                    StringBuilder stringBuilder;
                    block9: {
                        block8: {
                            object = a8.a.a;
                            e8 = null;
                            try {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("createCodec:");
                                stringBuilder.append((String)object);
                                N.a(stringBuilder.toString());
                                stringBuilder = MediaCodec.createByCodecName((String)object);
                            }
                            catch (Exception exception) {
                                object = null;
                                break block7;
                            }
                            try {
                                if (!this.d || !ax.f1.e$b.f(a8.c)) break block8;
                                object = new d0((MediaCodec)stringBuilder);
                                n9 = 4;
                                break block9;
                            }
                            catch (Exception exception) {
                                object = stringBuilder;
                                break block7;
                            }
                        }
                        object = new j((MediaCodec)stringBuilder, this.c.get());
                        n9 = 0;
                    }
                    e9 = new e((MediaCodec)stringBuilder, this.b.get(), (z)object, a8.f);
                    try {
                        N.b();
                        object = a8.d;
                        n8 = n9;
                        if (object != null) break block10;
                        n8 = n9;
                        if (!a8.a.k) break block10;
                        n8 = n9;
                        if (Build.VERSION.SDK_INT < 35) break block10;
                        n8 = n9 | 8;
                    }
                    catch (Exception exception) {
                        e8 = e9;
                        object = stringBuilder;
                        break block7;
                    }
                }
                e9.y(a8.b, (Surface)object, a8.e, n8);
                return e9;
            }
            if (e8 == null) {
                if (object == null) throw var1_5;
                object.release();
                throw var1_5;
            }
            e8.d();
            throw var1_5;
        }

        public void e(boolean bl) {
            this.d = bl;
        }
    }
}

