package ax.U3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import ax.N3.b;
import ax.U3.m;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class k implements m<Uri, File> {
    private final Context a;

    public static final class a implements n<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // ax.U3.n
        public m<Uri, File> b(q qVar) {
            return new k(this.a);
        }
    }

    k(Context context) {
        this.a = context;
    }

    @Override // ax.U3.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a<File> a(Uri uri, int i, int i2, ax.M3.j jVar) {
        return new m.a<>(new ax.j4.b(uri), new b(this.a, uri));
    }

    @Override // ax.U3.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return ax.O3.b.b(uri);
    }

    private static class b implements ax.N3.b<File> {
        private static final String[] d0 = {"_data"};
        private final Uri c0;
        private final Context q;

        b(Context context, Uri uri) {
            this.q = context;
            this.c0 = uri;
        }

        @Override // ax.N3.b
        public Class<File> a() {
            return File.class;
        }

        @Override // ax.N3.b
        public ax.M3.a d() {
            return ax.M3.a.LOCAL;
        }

        @Override // ax.N3.b
        public void e(ax.J3.g gVar, b.a<? super File> aVar) {
            Cursor query = this.q.getContentResolver().query(this.c0, d0, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                    query.close();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.f(new File(r0));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.c0));
        }

        @Override // ax.N3.b
        public void b() {
        }

        @Override // ax.N3.b
        public void cancel() {
        }
    }
}
