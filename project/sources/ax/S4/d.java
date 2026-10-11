package ax.S4;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    private static final String a = b.f(d.class);

    public static List<MediaSessionCompat.QueueItem> a(Iterable<MediaMetadataCompat> iterable, String... strArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (MediaMetadataCompat mediaMetadataCompat : iterable) {
            arrayList.add(new MediaSessionCompat.QueueItem(new MediaMetadataCompat.b(mediaMetadataCompat).d("android.media.metadata.MEDIA_ID", c.a(mediaMetadataCompat.e().f(), strArr)).a().e(), i));
            i++;
        }
        return arrayList;
    }

    public static int b(Iterable<MediaSessionCompat.QueueItem> iterable, long j) {
        Iterator<MediaSessionCompat.QueueItem> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (j == it.next().d()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int c(Iterable<MediaSessionCompat.QueueItem> iterable, String str) {
        Iterator<MediaSessionCompat.QueueItem> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(it.next().c().f())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List<MediaSessionCompat.QueueItem> d(String str, ax.Q4.b bVar) {
        String[] c = c.c(str);
        if (c.length != 2) {
            b.c(a, "Could not build a playing queue for this mediaId: ", str);
            return null;
        }
        String str2 = c[0];
        String str3 = c[1];
        String str4 = a;
        b.a(str4, "Creating playing queue for ", str2, ",  ", str3);
        Iterable<MediaMetadataCompat> q = str2.equals("__BY_SEARCH__") ? bVar.q(str3) : null;
        if (q != null) {
            return a(q, c[0], c[1]);
        }
        b.c(str4, "Unrecognized category type: ", str2, " for media ", str);
        return null;
    }

    public static boolean e(int i, List<MediaSessionCompat.QueueItem> list) {
        return list != null && i >= 0 && i < list.size();
    }
}
