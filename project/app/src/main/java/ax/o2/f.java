/*
 * Decompiled with CFR 0.152.
 */
package ax.o2;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import ax.Gb.l;
import java.util.List;

public final class f {
    public static final f a = new f();

    private f() {
    }

    public static final List<Uri> a(Cursor object) {
        l.f(object, "cursor");
        object = object.getNotificationUris();
        l.c(object);
        return object;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List<? extends Uri> list) {
        l.f(cursor, "cursor");
        l.f(contentResolver, "cr");
        l.f(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}

