/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import ax.J3.g;
import ax.M3.j;
import ax.N3.b;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;
import java.io.File;
import java.io.FileNotFoundException;

public final class k
implements m<Uri, File> {
    private final Context a;

    k(Context context) {
        this.a = context;
    }

    public m.a<File> c(Uri uri, int n8, int n9, j j8) {
        return new m.a<File>(new ax.j4.b(uri), new b(this.a, uri));
    }

    public boolean d(Uri uri) {
        return ax.O3.b.b(uri);
    }

    public static final class a
    implements n<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override
        public m<Uri, File> b(q q8) {
            return new k(this.a);
        }
    }

    private static class b
    implements ax.N3.b<File> {
        private static final String[] d0 = new String[]{"_data"};
        private final Uri c0;
        private final Context q;

        b(Context context, Uri uri) {
            this.q = context;
            this.c0 = uri;
        }

        @Override
        public Class<File> a() {
            return File.class;
        }

        @Override
        public void b() {
        }

        @Override
        public void cancel() {
        }

        @Override
        public ax.M3.a d() {
            return ax.M3.a.q;
        }

        @Override
        public void e(g object, b.a<? super File> a8) {
            block6: {
                Cursor cursor = this.q.getContentResolver().query(this.c0, d0, null, null, null);
                object = null;
                Object var3_5 = null;
                if (cursor != null) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            object = var3_5;
                            try {
                                if (!cursor.moveToFirst()) break block4;
                                object = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        cursor.close();
                        break block6;
                    }
                    cursor.close();
                    throw throwable2;
                }
            }
            if (TextUtils.isEmpty((CharSequence)object)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed to find file path for: ");
                ((StringBuilder)object).append(this.c0);
                a8.c(new FileNotFoundException(((StringBuilder)object).toString()));
                return;
            }
            a8.f(new File((String)object));
        }
    }
}

