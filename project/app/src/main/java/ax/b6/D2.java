/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.ContentResolver;
import ax.b6.C2;
import ax.b6.E2;
import ax.b6.F2;
import ax.b6.w2;
import java.util.Map;

public final class D2
implements F2 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final <T extends Map<String, String>> T a(ContentResolver contentResolver, String[] object, C2<T> c22) throws E2 {
        if ((contentResolver = contentResolver.query(w2.b, null, null, (String[])object, null)) != null) {
            object = c22.d(contentResolver.getCount());
            while (contentResolver.moveToNext()) {
                object.put(contentResolver.getString(0), contentResolver.getString(1));
            }
            contentResolver.close();
            return (T)object;
        }
        try {
            object = new E2("Failed to connect to GservicesProvider");
            throw object;
        }
        catch (Throwable throwable) {}
        if (contentResolver == null) throw throwable;
        try {
            contentResolver.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
        }
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String b(ContentResolver contentResolver, String object) throws E2 {
        if ((contentResolver = contentResolver.query(w2.a, null, null, new String[]{object}, null)) != null) {
            block6: {
                if (!contentResolver.moveToFirst()) break block6;
                object = contentResolver.getString(1);
                contentResolver.close();
                return object;
            }
            contentResolver.close();
            return null;
        }
        try {
            object = new E2("Failed to connect to GservicesProvider");
            throw object;
        }
        catch (Throwable throwable) {}
        if (contentResolver == null) throw throwable;
        try {
            contentResolver.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
        }
        throw throwable;
    }
}

