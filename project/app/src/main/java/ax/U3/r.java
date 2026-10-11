/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import ax.M3.j;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.InputStream;

public class r<Data>
implements m<Integer, Data> {
    private final m<Uri, Data> a;
    private final Resources b;

    public r(Resources resources, m<Uri, Data> m8) {
        this.b = resources;
        this.a = m8;
    }

    private Uri d(Integer n8) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.resource://");
            stringBuilder.append(this.b.getResourcePackageName(n8.intValue()));
            stringBuilder.append('/');
            stringBuilder.append(this.b.getResourceTypeName(n8.intValue()));
            stringBuilder.append('/');
            stringBuilder.append(this.b.getResourceEntryName(n8.intValue()));
            stringBuilder = Uri.parse((String)stringBuilder.toString());
            return stringBuilder;
        }
        catch (Resources.NotFoundException notFoundException) {
            if (Log.isLoggable((String)"ResourceLoader", (int)5)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Received invalid resource id: ");
                stringBuilder.append(n8);
                Log.w((String)"ResourceLoader", (String)stringBuilder.toString(), (Throwable)notFoundException);
            }
            return null;
        }
    }

    public m.a<Data> c(Integer n8, int n9, int n10, j j8) {
        if ((n8 = this.d(n8)) == null) {
            return null;
        }
        return this.a.a((Uri)n8, n9, n10, j8);
    }

    public boolean e(Integer n8) {
        return true;
    }

    public static class a
    implements n<Integer, ParcelFileDescriptor> {
        private final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override
        public m<Integer, ParcelFileDescriptor> b(q q8) {
            return new r<ParcelFileDescriptor>(this.a, q8.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class b
    implements n<Integer, InputStream> {
        private final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override
        public m<Integer, InputStream> b(q q8) {
            return new r<InputStream>(this.a, q8.d(Uri.class, InputStream.class));
        }
    }
}

