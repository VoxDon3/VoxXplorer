package ax.O3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import ax.J3.g;
import ax.N3.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements ax.N3.b<InputStream> {
    private final e c0;
    private InputStream d0;
    private final Uri q;

    static class a implements d {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // ax.O3.d
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {
        private static final String[] b = {"_data"};
        private final ContentResolver a;

        b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // ax.O3.d
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.q = uri;
        this.c0 = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(ax.J3.c.c(context).j().d(), dVar, ax.J3.c.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        InputStream b2 = this.c0.b(this.q);
        int a2 = b2 != null ? this.c0.a(this.q) : -1;
        return a2 != -1 ? new ax.N3.e(b2, a2) : b2;
    }

    @Override // ax.N3.b
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // ax.N3.b
    public void b() {
        InputStream inputStream = this.d0;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // ax.N3.b
    public ax.M3.a d() {
        return ax.M3.a.LOCAL;
    }

    @Override // ax.N3.b
    public void e(g gVar, b.a<? super InputStream> aVar) {
        try {
            InputStream h = h();
            this.d0 = h;
            aVar.f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.c(e);
        }
    }

    @Override // ax.N3.b
    public void cancel() {
    }
}
