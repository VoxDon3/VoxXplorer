/*
 * Decompiled with CFR 0.152.
 */
package ax.Q4;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import ax.Q4.a;
import java.util.ArrayList;
import java.util.Iterator;

public class c {
    protected ArrayList<MediaMetadataCompat> a = new ArrayList();
    protected boolean b;
    protected String c;

    private MediaMetadataCompat b(Uri object, String string, String string2, int n8) {
        String string3 = object.toString();
        object = new MediaMetadataCompat.b();
        ((MediaMetadataCompat.b)object).d("android.media.metadata.MEDIA_ID", string).d("__SOURCE__", string3).d("__SOURCE_FOLDER__", string2).c("__TRACK_COUNT__", n8).d("android.media.metadata.ALBUM_ART_URI", string3);
        return ((MediaMetadataCompat.b)object).a();
    }

    public String a(Uri uri, Bundle object) {
        Object object2 = ax.Q4.a.b().c();
        int n8 = 0;
        if (object != null) {
            this.c = object.getString("PLAY_FOLDER_URI");
            this.b = object.getBoolean("PLAY_LOCAL_HTTP", false);
        }
        object = object2;
        if (object2 == null) {
            object = new ArrayList(1);
            ((ArrayList)object).add(new Pair((Object)uri, (Object)uri.toString()));
        }
        this.a.clear();
        int n9 = ((ArrayList)object).size();
        object2 = null;
        while (n8 < n9) {
            Object object3 = ((ArrayList)object).get(n8);
            int n10 = n8 + 1;
            Pair pair = (Pair)object3;
            object3 = this.b((Uri)pair.first, (String)pair.second, this.c, ((ArrayList)object).size());
            this.a.add((MediaMetadataCompat)object3);
            n8 = n10;
            if (!uri.equals(pair.first)) continue;
            object2 = (String)pair.second;
            n8 = n10;
        }
        if (object2 == null) {
            return uri.toString();
        }
        return object2;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.b;
    }

    public Iterator<MediaMetadataCompat> e() {
        return this.a.iterator();
    }
}

