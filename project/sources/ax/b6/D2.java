package ax.b6;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Map;

/* loaded from: classes3.dex */
public final class D2 implements F2 {
    @Override // ax.b6.F2
    public final <T extends Map<String, String>> T a(ContentResolver contentResolver, String[] strArr, C2<T> c2) throws E2 {
        Cursor query = contentResolver.query(C1693w2.b, null, null, strArr, null);
        try {
            if (query == null) {
                throw new E2("Failed to connect to GservicesProvider");
            }
            T d = c2.d(query.getCount());
            while (query.moveToNext()) {
                d.put(query.getString(0), query.getString(1));
            }
            query.close();
            return d;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // ax.b6.F2
    public final String b(ContentResolver contentResolver, String str) throws E2 {
        Cursor query = contentResolver.query(C1693w2.a, null, null, new String[]{str}, null);
        try {
            if (query == null) {
                throw new E2("Failed to connect to GservicesProvider");
            }
            if (!query.moveToFirst()) {
                query.close();
                return null;
            }
            String string = query.getString(1);
            query.close();
            return string;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
