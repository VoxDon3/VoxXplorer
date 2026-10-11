/*
 * Decompiled with CFR 0.152.
 */
package ax.Q;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import ax.Y.d;
import ax.Y.r;

public final class a {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] stringArray, String string, String[] stringArray2, String string2, CancellationSignal cancellationSignal) {
        try {
            contentResolver = contentResolver.query(uri, stringArray, string, stringArray2, string2, cancellationSignal);
            return contentResolver;
        }
        catch (Exception exception) {
            if (exception instanceof OperationCanceledException) {
                throw new r();
            }
            throw exception;
        }
    }

    @Deprecated
    public static Cursor b(ContentResolver contentResolver, Uri uri, String[] stringArray, String string, String[] stringArray2, String string2, d d8) {
        d8 = d8 != null ? (CancellationSignal)d8.b() : null;
        return a.a(contentResolver, uri, stringArray, string, stringArray2, string2, (CancellationSignal)d8);
    }
}

