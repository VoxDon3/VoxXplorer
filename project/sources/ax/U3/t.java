package ax.U3;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ax.U3.m;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
public class t<Data> implements m<String, Data> {
    private final m<Uri, Data> a;

    public static class a implements n<String, ParcelFileDescriptor> {
        @Override // ax.U3.n
        public m<String, ParcelFileDescriptor> b(q qVar) {
            return new t(qVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class b implements n<String, InputStream> {
        @Override // ax.U3.n
        public m<String, InputStream> b(q qVar) {
            return new t(qVar.d(Uri.class, InputStream.class));
        }
    }

    public t(m<Uri, Data> mVar) {
        this.a = mVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("/")) {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<Data> a(String str, int i, int i2, ax.M3.j jVar) {
        Uri e = e(str);
        if (e == null) {
            return null;
        }
        return this.a.a(e, i, i2, jVar);
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(String str) {
        return true;
    }
}
