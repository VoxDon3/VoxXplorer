package ax.X3;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import ax.M3.i;
import ax.P3.s;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class o implements ax.M3.k<ParcelFileDescriptor, Bitmap> {
    public static final ax.M3.i<Long> c = ax.M3.i.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final ax.M3.i<Integer> d = ax.M3.i.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", null, new b());
    private static final c e = new c();
    private final ax.Q3.d a;
    private final c b;

    static class a implements i.b<Long> {
        private final ByteBuffer a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // ax.M3.i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l.longValue()).array());
            }
        }
    }

    static class b implements i.b<Integer> {
        private final ByteBuffer a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // ax.M3.i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
        }
    }

    static class c {
        c() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    public o(ax.Q3.d dVar) {
        this(dVar, e);
    }

    @Override // ax.M3.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, ax.M3.j jVar) throws IOException {
        long longValue = ((Long) jVar.c(c)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) jVar.c(d);
        MediaMetadataRetriever a2 = this.b.a();
        try {
            a2.setDataSource(parcelFileDescriptor.getFileDescriptor());
            Bitmap frameAtTime = longValue == -1 ? a2.getFrameAtTime() : num == null ? a2.getFrameAtTime(longValue) : a2.getFrameAtTime(longValue, num.intValue());
            a2.release();
            parcelFileDescriptor.close();
            return e.d(frameAtTime, this.a);
        } catch (Throwable th) {
            a2.release();
            throw th;
        }
    }

    @Override // ax.M3.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, ax.M3.j jVar) {
        MediaMetadataRetriever a2 = this.b.a();
        try {
            a2.setDataSource(parcelFileDescriptor.getFileDescriptor());
            a2.release();
            return true;
        } catch (RuntimeException unused) {
            a2.release();
            return false;
        } catch (Throwable th) {
            a2.release();
            throw th;
        }
    }

    o(ax.Q3.d dVar, c cVar) {
        this.a = dVar;
        this.b = cVar;
    }
}
