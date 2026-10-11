/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import ax.M3.i;
import ax.M3.j;
import ax.M3.k;
import ax.P3.s;
import ax.Q3.d;
import ax.X3.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class o
implements k<ParcelFileDescriptor, Bitmap> {
    public static final i<Long> c = i.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new i.b<Long>(){
        private final ByteBuffer a = ByteBuffer.allocate(8);

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void b(byte[] object, Long l8, MessageDigest messageDigest) {
            messageDigest.update((byte[])object);
            object = this.a;
            synchronized (object) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l8).array());
                return;
            }
        }
    });
    public static final i<Integer> d = i.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", null, new i.b<Integer>(){
        private final ByteBuffer a = ByteBuffer.allocate(4);

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void b(byte[] object, Integer n8, MessageDigest messageDigest) {
            if (n8 == null) {
                return;
            }
            messageDigest.update((byte[])object);
            object = this.a;
            synchronized (object) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(n8).array());
                return;
            }
        }
    });
    private static final c e = new c();
    private final d a;
    private final c b;

    public o(d d8) {
        this(d8, e);
    }

    o(d d8, c c8) {
        this.a = d8;
        this.b = c8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public s<Bitmap> c(ParcelFileDescriptor object, int n8, int n9, j object2) throws IOException {
        Throwable throwable2;
        MediaMetadataRetriever mediaMetadataRetriever;
        block3: {
            long l8 = ((j)object2).c(c);
            if (l8 < 0L && l8 != -1L) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
                ((StringBuilder)object).append(l8);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            object2 = ((j)object2).c(d);
            mediaMetadataRetriever = this.b.a();
            try {
                mediaMetadataRetriever.setDataSource(object.getFileDescriptor());
                object2 = l8 == -1L ? mediaMetadataRetriever.getFrameAtTime() : (object2 == null ? mediaMetadataRetriever.getFrameAtTime(l8) : mediaMetadataRetriever.getFrameAtTime(l8, ((Integer)object2).intValue()));
            }
            catch (Throwable throwable2) {
                break block3;
            }
            mediaMetadataRetriever.release();
            object.close();
            return ax.X3.e.d((Bitmap)object2, this.a);
        }
        mediaMetadataRetriever.release();
        throw throwable2;
    }

    public boolean d(ParcelFileDescriptor parcelFileDescriptor, j j8) {
        j8 = this.b.a();
        try {
            j8.setDataSource(parcelFileDescriptor.getFileDescriptor());
            return true;
        }
        catch (RuntimeException runtimeException) {
            return false;
        }
        finally {
            j8.release();
        }
    }

    static class c {
        c() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }
}

