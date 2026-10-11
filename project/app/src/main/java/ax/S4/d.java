/*
 * Decompiled with CFR 0.152.
 */
package ax.S4;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import ax.S4.b;
import ax.S4.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d {
    private static final String a = b.f(d.class);

    public static List<MediaSessionCompat.QueueItem> a(Iterable<MediaMetadataCompat> object, String ... stringArray) {
        ArrayList<MediaSessionCompat.QueueItem> arrayList = new ArrayList<MediaSessionCompat.QueueItem>();
        Iterator<MediaMetadataCompat> iterator = object.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            object = iterator.next();
            String string = c.a(((MediaMetadataCompat)object).e().f(), stringArray);
            arrayList.add(new MediaSessionCompat.QueueItem(new MediaMetadataCompat.b((MediaMetadataCompat)object).d("android.media.metadata.MEDIA_ID", string).a().e(), n8));
            ++n8;
        }
        return arrayList;
    }

    public static int b(Iterable<MediaSessionCompat.QueueItem> object, long l8) {
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            if (l8 == ((MediaSessionCompat.QueueItem)object.next()).d()) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    public static int c(Iterable<MediaSessionCompat.QueueItem> object, String string) {
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            if (string.equals(((MediaSessionCompat.QueueItem)object.next()).c().f())) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    public static List<MediaSessionCompat.QueueItem> d(String string, ax.Q4.b iterable) {
        String[] stringArray = c.c(string);
        if (stringArray.length != 2) {
            b.c(a, "Could not build a playing queue for this mediaId: ", string);
            return null;
        }
        String string2 = stringArray[0];
        String string3 = stringArray[1];
        String string4 = a;
        b.a(string4, "Creating playing queue for ", string2, ",  ", string3);
        iterable = string2.equals("__BY_SEARCH__") ? ((ax.Q4.b)((Object)iterable)).q(string3) : null;
        if (iterable == null) {
            b.c(string4, "Unrecognized category type: ", string2, " for media ", string);
            return null;
        }
        return d.a(iterable, stringArray[0], stringArray[1]);
    }

    public static boolean e(int n8, List<MediaSessionCompat.QueueItem> list) {
        return list != null && n8 >= 0 && n8 < list.size();
    }
}

