package ax.U3;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ax.U3.m;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class v<Data> implements m<Uri, Data> {
    private static final Set<String> b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final b<Data> a;

    public static class a implements n<Uri, ParcelFileDescriptor>, b<ParcelFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // ax.U3.v.b
        public ax.N3.b<ParcelFileDescriptor> a(Uri uri) {
            return new ax.N3.g(this.a, uri);
        }

        @Override // ax.U3.n
        public m<Uri, ParcelFileDescriptor> b(q qVar) {
            return new v(this);
        }
    }

    public interface b<Data> {
        ax.N3.b<Data> a(Uri uri);
    }

    public static class c implements n<Uri, InputStream>, b<InputStream> {
        private final ContentResolver a;

        public c(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // ax.U3.v.b
        public ax.N3.b<InputStream> a(Uri uri) {
            return new ax.N3.l(this.a, uri);
        }

        @Override // ax.U3.n
        public m<Uri, InputStream> b(q qVar) {
            return new v(this);
        }
    }

    public v(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(Uri uri, int i, int i2, ax.M3.j jVar) {
        return new m.a<>(new ax.j4.b(uri), this.a.a(uri));
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
