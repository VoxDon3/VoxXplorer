package ax.U3;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ax.U3.m;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a<Data> implements m<Uri, Data> {
    private static final int c = 22;
    private final AssetManager a;
    private final InterfaceC0204a<Data> b;

    /* renamed from: ax.U3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0204a<Data> {
        ax.N3.b<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements n<Uri, ParcelFileDescriptor>, InterfaceC0204a<ParcelFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // ax.U3.a.InterfaceC0204a
        public ax.N3.b<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new ax.N3.f(assetManager, str);
        }

        @Override // ax.U3.n
        public m<Uri, ParcelFileDescriptor> b(q qVar) {
            return new a(this.a, this);
        }
    }

    public static class c implements n<Uri, InputStream>, InterfaceC0204a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // ax.U3.a.InterfaceC0204a
        public ax.N3.b<InputStream> a(AssetManager assetManager, String str) {
            return new ax.N3.k(assetManager, str);
        }

        @Override // ax.U3.n
        public m<Uri, InputStream> b(q qVar) {
            return new a(this.a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0204a<Data> interfaceC0204a) {
        this.a = assetManager;
        this.b = interfaceC0204a;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(Uri uri, int i, int i2, ax.M3.j jVar) {
        return new m.a<>(new ax.j4.b(uri), this.b.a(this.a, uri.toString().substring(c)));
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
