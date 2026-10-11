/*
 * Decompiled with CFR 0.152.
 */
package ax.O3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import ax.J3.g;
import ax.N3.b;
import ax.O3.d;
import ax.O3.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class c
implements ax.N3.b<InputStream> {
    private final e c0;
    private InputStream d0;
    private final Uri q;

    c(Uri uri, e e8) {
        this.q = uri;
        this.c0 = e8;
    }

    private static c c(Context context, Uri uri, d d8) {
        ax.Q3.b b8 = ax.J3.c.c(context).e();
        return new c(uri, new e(ax.J3.c.c(context).j().d(), d8, b8, context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c.c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c.c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        InputStream inputStream = this.c0.b(this.q);
        int n8 = inputStream != null ? this.c0.a(this.q) : -1;
        if (n8 != -1) {
            return new ax.N3.e(inputStream, n8);
        }
        return inputStream;
    }

    @Override
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        InputStream inputStream = this.d0;
        if (inputStream == null) return;
        try {
            inputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    @Override
    public void cancel() {
    }

    @Override
    public ax.M3.a d() {
        return ax.M3.a.q;
    }

    @Override
    public void e(g object, b.a<? super InputStream> a8) {
        try {
            object = this.h();
            this.d0 = object;
            a8.f((InputStream)object);
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            if (Log.isLoggable((String)"MediaStoreThumbFetcher", (int)3)) {
                Log.d((String)"MediaStoreThumbFetcher", (String)"Failed to find thumbnail file", (Throwable)fileNotFoundException);
            }
            a8.c(fileNotFoundException);
            return;
        }
    }

    static class a
    implements d {
        private static final String[] b = new String[]{"_data"};
        private final ContentResolver a;

        a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override
        public Cursor a(Uri object) {
            object = object.getLastPathSegment();
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{object}, null);
        }
    }

    static class b
    implements d {
        private static final String[] b = new String[]{"_data"};
        private final ContentResolver a;

        b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override
        public Cursor a(Uri object) {
            object = object.getLastPathSegment();
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{object}, null);
        }
    }
}

