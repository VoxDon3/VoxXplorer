/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ax.M3.j;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.File;
import java.io.InputStream;

public class t<Data>
implements m<String, Data> {
    private final m<Uri, Data> a;

    public t(m<Uri, Data> m8) {
        this.a = m8;
    }

    private static Uri e(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return null;
        }
        if (string.startsWith("/")) {
            return t.f(string);
        }
        Uri uri = Uri.parse((String)string);
        if (uri.getScheme() == null) {
            return t.f(string);
        }
        return uri;
    }

    private static Uri f(String string) {
        return Uri.fromFile((File)new File(string));
    }

    public m.a<Data> c(String string, int n8, int n9, j j8) {
        if ((string = t.e(string)) == null) {
            return null;
        }
        return this.a.a((Uri)string, n8, n9, j8);
    }

    public boolean d(String string) {
        return true;
    }

    public static class a
    implements n<String, ParcelFileDescriptor> {
        @Override
        public m<String, ParcelFileDescriptor> b(q q8) {
            return new t<ParcelFileDescriptor>(q8.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class b
    implements n<String, InputStream> {
        @Override
        public m<String, InputStream> b(q q8) {
            return new t<InputStream>(q8.d(Uri.class, InputStream.class));
        }
    }
}

