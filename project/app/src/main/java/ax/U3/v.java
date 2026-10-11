/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ax.M3.j;
import ax.N3.g;
import ax.N3.l;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class v<Data>
implements m<Uri, Data> {
    private static final Set<String> b = java.util.DesugarCollections.unmodifiableSet(new HashSet<String>(Arrays.asList("file", "android.resource", "content")));
    private final b<Data> a;

    public v(b<Data> b8) {
        this.a = b8;
    }

    public m.a<Data> c(Uri uri, int n8, int n9, j j8) {
        return new m.a<Data>(new ax.j4.b(uri), this.a.a(uri));
    }

    public boolean d(Uri uri) {
        return b.contains(uri.getScheme());
    }

    public static class a
    implements n<Uri, ParcelFileDescriptor>,
    b<ParcelFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override
        public ax.N3.b<ParcelFileDescriptor> a(Uri uri) {
            return new g(this.a, uri);
        }

        @Override
        public m<Uri, ParcelFileDescriptor> b(q q8) {
            return new v<ParcelFileDescriptor>(this);
        }
    }

    public static interface b<Data> {
        public ax.N3.b<Data> a(Uri var1);
    }

    public static class c
    implements n<Uri, InputStream>,
    b<InputStream> {
        private final ContentResolver a;

        public c(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override
        public ax.N3.b<InputStream> a(Uri uri) {
            return new l(this.a, uri);
        }

        @Override
        public m<Uri, InputStream> b(q q8) {
            return new v<InputStream>(this);
        }
    }
}

