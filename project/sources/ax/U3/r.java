package ax.U3;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import ax.U3.m;
import java.io.InputStream;

/* loaded from: classes.dex */
public class r<Data> implements m<Integer, Data> {
    private final m<Uri, Data> a;
    private final Resources b;

    public static class a implements n<Integer, ParcelFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // ax.U3.n
        public m<Integer, ParcelFileDescriptor> b(q qVar) {
            return new r(this.a, qVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class b implements n<Integer, InputStream> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // ax.U3.n
        public m<Integer, InputStream> b(q qVar) {
            return new r(this.a, qVar.d(Uri.class, InputStream.class));
        }
    }

    public r(Resources resources, m<Uri, Data> mVar) {
        this.b = resources;
        this.a = mVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + '/' + this.b.getResourceTypeName(num.intValue()) + '/' + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(Integer num, int i, int i2, ax.M3.j jVar) {
        Uri d = d(num);
        if (d == null) {
            return null;
        }
        return this.a.a(d, i, i2, jVar);
    }

    @Override // ax.U3.m
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
