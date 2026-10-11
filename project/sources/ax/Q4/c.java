package ax.Q4;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {
    protected ArrayList<MediaMetadataCompat> a = new ArrayList<>();
    protected boolean b;
    protected String c;

    private MediaMetadataCompat b(Uri uri, String str, String str2, int i) {
        String uri2 = uri.toString();
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
        bVar.d("android.media.metadata.MEDIA_ID", str).d("__SOURCE__", uri2).d("__SOURCE_FOLDER__", str2).c("__TRACK_COUNT__", i).d("android.media.metadata.ALBUM_ART_URI", uri2);
        return bVar.a();
    }

    public String a(Uri uri, Bundle bundle) {
        ArrayList<Pair<Uri, String>> c = a.b().c();
        int i = 0;
        if (bundle != null) {
            this.c = bundle.getString("PLAY_FOLDER_URI");
            this.b = bundle.getBoolean("PLAY_LOCAL_HTTP", false);
        }
        if (c == null) {
            c = new ArrayList<>(1);
            c.add(new Pair<>(uri, uri.toString()));
        }
        this.a.clear();
        int size = c.size();
        String str = null;
        while (i < size) {
            Pair<Uri, String> pair = c.get(i);
            i++;
            Pair<Uri, String> pair2 = pair;
            this.a.add(b((Uri) pair2.first, (String) pair2.second, this.c, c.size()));
            if (uri.equals(pair2.first)) {
                str = (String) pair2.second;
            }
        }
        return str == null ? uri.toString() : str;
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
