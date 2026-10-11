/*
 * Decompiled with CFR 0.152.
 */
package ax.b4;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import ax.L3.a;
import ax.M3.f;
import ax.M3.g;
import ax.M3.i;
import ax.M3.j;
import ax.M3.k;
import ax.M3.m;
import ax.Q3.d;
import ax.b4.c;
import ax.b4.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

public class a
implements k<ByteBuffer, c> {
    private static final a g = new a();
    public static final i<Boolean> h = ax.M3.i.f("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.FALSE);
    private static final b i = new b();
    private final Context a;
    private final List<f> b;
    private final b c;
    private final d d;
    private final a e;
    private final ax.b4.b f;

    public a(Context context, List<f> list, d d8, ax.Q3.b b8) {
        this(context, list, d8, b8, i, g);
    }

    a(Context context, List<f> list, d d8, ax.Q3.b b8, b b9, a a8) {
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = d8;
        this.e = a8;
        this.f = new ax.b4.b(d8, b8);
        this.c = b9;
    }

    private e c(ByteBuffer object, int n8, int n9, ax.L3.d object2) {
        long l8 = ax.k4.d.b();
        if (((ax.L3.c)(object2 = ((ax.L3.d)object2).c())).b() > 0 && ((ax.L3.c)object2).c() == 0) {
            int n10 = ax.b4.a.e((ax.L3.c)object2, n8, n9);
            object2 = this.e.a(this.f, (ax.L3.c)object2, (ByteBuffer)object, n10);
            object2.d();
            Bitmap bitmap = object2.c();
            if (bitmap == null) {
                return null;
            }
            object = ax.W3.b.c();
            object = new c(this.a, (ax.L3.a)object2, this.d, (m<Bitmap>)object, n8, n9, bitmap);
            if (Log.isLoggable((String)"BufferGifDecoder", (int)2)) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Decoded GIF from stream in ");
                ((StringBuilder)object2).append(ax.k4.d.a(l8));
                Log.v((String)"BufferGifDecoder", (String)((StringBuilder)object2).toString());
            }
            return new e((c)object);
        }
        return null;
    }

    private static int e(ax.L3.c c8, int n8, int n9) {
        int n10 = Math.min(c8.a() / n9, c8.d() / n8);
        n10 = n10 == 0 ? 0 : Integer.highestOneBit(n10);
        n10 = Math.max(1, n10);
        if (Log.isLoggable((String)"BufferGifDecoder", (int)2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Downsampling GIF, sampleSize: ");
            stringBuilder.append(n10);
            stringBuilder.append(", target dimens: [");
            stringBuilder.append(n8);
            stringBuilder.append("x");
            stringBuilder.append(n9);
            stringBuilder.append("], actual dimens: [");
            stringBuilder.append(c8.d());
            stringBuilder.append("x");
            stringBuilder.append(c8.a());
            stringBuilder.append("]");
            Log.v((String)"BufferGifDecoder", (String)stringBuilder.toString());
        }
        return n10;
    }

    public e d(ByteBuffer object, int n8, int n9, j object2) {
        object2 = this.c.a((ByteBuffer)object);
        try {
            object = this.c((ByteBuffer)object, n8, n9, (ax.L3.d)object2);
            return object;
        }
        finally {
            this.c.b((ax.L3.d)object2);
        }
    }

    public boolean f(ByteBuffer byteBuffer, j j8) throws IOException {
        return j8.c(h) == false && ax.M3.g.c(this.b, byteBuffer) == f.a.c0;
    }

    static class a {
        a() {
        }

        public ax.L3.a a(a.a a8, ax.L3.c c8, ByteBuffer byteBuffer, int n8) {
            return new ax.L3.e(a8, c8, byteBuffer, n8);
        }
    }

    static class b {
        private final Queue<ax.L3.d> a = ax.k4.i.e(0);

        b() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public ax.L3.d a(ByteBuffer object) {
            synchronized (this) {
                try {
                    ax.L3.d d8;
                    ax.L3.d d9 = d8 = this.a.poll();
                    if (d8 != null) return d9.p((ByteBuffer)object);
                    d9 = new ax.L3.d();
                    return d9.p((ByteBuffer)object);
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void b(ax.L3.d d8) {
            synchronized (this) {
                d8.a();
                this.a.offer(d8);
                return;
            }
        }
    }
}

