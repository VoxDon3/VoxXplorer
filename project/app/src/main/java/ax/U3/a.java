/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ax.M3.j;
import ax.N3.f;
import ax.N3.k;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.InputStream;

public class a<Data>
implements m<Uri, Data> {
    private static final int c = 22;
    private final AssetManager a;
    private final a<Data> b;

    public a(AssetManager assetManager, a<Data> a8) {
        this.a = assetManager;
        this.b = a8;
    }

    public m.a<Data> c(Uri uri, int n8, int n9, j object) {
        object = uri.toString().substring(c);
        return new m.a<Data>(new ax.j4.b(uri), this.b.a(this.a, (String)object));
    }

    public boolean d(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public static interface a<Data> {
        public ax.N3.b<Data> a(AssetManager var1, String var2);
    }

    public static class b
    implements n<Uri, ParcelFileDescriptor>,
    a<ParcelFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override
        public ax.N3.b<ParcelFileDescriptor> a(AssetManager assetManager, String string) {
            return new f(assetManager, string);
        }

        @Override
        public m<Uri, ParcelFileDescriptor> b(q q8) {
            return new a<ParcelFileDescriptor>(this.a, this);
        }
    }

    public static class c
    implements n<Uri, InputStream>,
    a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override
        public ax.N3.b<InputStream> a(AssetManager assetManager, String string) {
            return new k(assetManager, string);
        }

        @Override
        public m<Uri, InputStream> b(q q8) {
            return new a<InputStream>(this.a, this);
        }
    }
}

