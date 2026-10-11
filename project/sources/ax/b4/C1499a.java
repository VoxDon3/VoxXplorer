package ax.b4;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import ax.L3.a;
import ax.M3.f;
import ax.M3.j;
import ax.M3.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: ax.b4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1499a implements k<ByteBuffer, c> {
    private static final C0259a g = new C0259a();
    public static final ax.M3.i<Boolean> h = ax.M3.i.f("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.FALSE);
    private static final b i = new b();
    private final Context a;
    private final List<ax.M3.f> b;
    private final b c;
    private final ax.Q3.d d;
    private final C0259a e;
    private final ax.b4.b f;

    /* renamed from: ax.b4.a$a, reason: collision with other inner class name */
    static class C0259a {
        C0259a() {
        }

        public ax.L3.a a(a.InterfaceC0118a interfaceC0118a, ax.L3.c cVar, ByteBuffer byteBuffer, int i) {
            return new ax.L3.e(interfaceC0118a, cVar, byteBuffer, i);
        }
    }

    /* renamed from: ax.b4.a$b */
    static class b {
        private final Queue<ax.L3.d> a = ax.k4.i.e(0);

        b() {
        }

        public synchronized ax.L3.d a(ByteBuffer byteBuffer) {
            ax.L3.d poll;
            try {
                poll = this.a.poll();
                if (poll == null) {
                    poll = new ax.L3.d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return poll.p(byteBuffer);
        }

        public synchronized void b(ax.L3.d dVar) {
            dVar.a();
            this.a.offer(dVar);
        }
    }

    public C1499a(Context context, List<ax.M3.f> list, ax.Q3.d dVar, ax.Q3.b bVar) {
        this(context, list, dVar, bVar, i, g);
    }

    private e c(ByteBuffer byteBuffer, int i2, int i3, ax.L3.d dVar) {
        long b2 = ax.k4.d.b();
        ax.L3.c c = dVar.c();
        if (c.b() <= 0 || c.c() != 0) {
            return null;
        }
        ax.L3.a a = this.e.a(this.f, c, byteBuffer, e(c, i2, i3));
        a.d();
        Bitmap c2 = a.c();
        if (c2 == null) {
            return null;
        }
        c cVar = new c(this.a, a, this.d, ax.W3.b.c(), i2, i3, c2);
        if (Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + ax.k4.d.a(b2));
        }
        return new e(cVar);
    }

    private static int e(ax.L3.c cVar, int i2, int i3) {
        int min = Math.min(cVar.a() / i3, cVar.d() / i2);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i2 + "x" + i3 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    @Override // ax.M3.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a(ByteBuffer byteBuffer, int i2, int i3, j jVar) {
        ax.L3.d a = this.c.a(byteBuffer);
        try {
            return c(byteBuffer, i2, i3, a);
        } finally {
            this.c.b(a);
        }
    }

    @Override // ax.M3.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, j jVar) throws IOException {
        return !((Boolean) jVar.c(h)).booleanValue() && ax.M3.g.c(this.b, byteBuffer) == f.a.GIF;
    }

    C1499a(Context context, List<ax.M3.f> list, ax.Q3.d dVar, ax.Q3.b bVar, b bVar2, C0259a c0259a) {
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = dVar;
        this.e = c0259a;
        this.f = new ax.b4.b(dVar, bVar);
        this.c = bVar2;
    }
}
