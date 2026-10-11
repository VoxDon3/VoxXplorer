package ax.Q4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public class b {
    private static final String g = ax.S4.b.f(b.class);
    private final ArrayList<d> a = new ArrayList<>();
    private final ConcurrentMap<String, d> b = new ConcurrentHashMap();
    private final ConcurrentMap<String, Long> c = new ConcurrentHashMap();
    private final Set<String> d = Collections.newSetFromMap(new ConcurrentHashMap());
    private volatile a e = a.NON_INITIALIZED;
    private String f;

    enum a {
        NON_INITIALIZED,
        INITIALIZING,
        INITIALIZED
    }

    public static String h(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf(":")) >= 0) {
            return str.substring(indexOf + 1);
        }
        return null;
    }

    public static String i(Uri uri) {
        String path = uri.getPath();
        if ("content".equals(uri.getScheme())) {
            try {
                return "/" + h(DocumentsContract.getDocumentId(uri));
            } catch (IllegalArgumentException unused) {
            }
        }
        return path;
    }

    public static boolean l(Uri uri) {
        return "file".equals(uri.getScheme()) || "content".equals(uri.getScheme());
    }

    public static boolean m(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("file://") || str.startsWith("content://");
    }

    public void a(c cVar) {
        try {
            if (this.e == a.NON_INITIALIZED) {
                this.e = a.INITIALIZING;
                this.f = cVar.c();
                Iterator<MediaMetadataCompat> e = cVar.e();
                while (e.hasNext()) {
                    MediaMetadataCompat next = e.next();
                    String i = next.i("android.media.metadata.MEDIA_ID");
                    d dVar = new d(i, next);
                    this.a.add(dVar);
                    this.b.put(i, dVar);
                }
                this.e = a.INITIALIZED;
            }
            if (this.e != a.INITIALIZED) {
                this.e = a.NON_INITIALIZED;
            }
        } catch (Throwable th) {
            if (this.e != a.INITIALIZED) {
                this.e = a.NON_INITIALIZED;
            }
            throw th;
        }
    }

    public synchronized void b(String str) {
        MediaMetadataCompat e = e(str);
        if (e == null) {
            return;
        }
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b(e);
        bVar.b("android.media.metadata.ALBUM_ART", null);
        bVar.b("android.media.metadata.DISPLAY_ICON", null);
        MediaMetadataCompat a2 = bVar.a();
        d g2 = g(str);
        if (g2 == null) {
            throw new IllegalStateException("Unexpected error: Inconsistent data structures in MusicProvider");
        }
        g2.a = a2;
    }

    public List<MediaBrowserCompat.MediaItem> c(String str, Resources resources) {
        return new ArrayList();
    }

    public String d() {
        return this.f;
    }

    public MediaMetadataCompat e(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str).a;
        }
        return null;
    }

    public Iterable<MediaMetadataCompat> f() {
        if (this.e != a.INITIALIZED) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        ArrayList<d> arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            d dVar = arrayList2.get(i);
            i++;
            arrayList.add(dVar.a);
        }
        return arrayList;
    }

    public d g(String str) {
        return this.b.get(str);
    }

    public boolean j() {
        return this.a.size() > 0;
    }

    public boolean k(String str) {
        return this.d.contains(str);
    }

    public synchronized boolean n(String str) {
        d g2 = g(str);
        if (g2 == null) {
            return false;
        }
        MediaMetadataCompat mediaMetadataCompat = g2.a;
        if (mediaMetadataCompat == null) {
            return false;
        }
        if (g2.c) {
            return true;
        }
        CharSequence j = mediaMetadataCompat.j("android.media.metadata.DISPLAY_TITLE");
        if (j == null) {
            return false;
        }
        return !TextUtils.isEmpty(j.toString());
    }

    public void o(c cVar) {
        this.e = a.NON_INITIALIZED;
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        a(cVar);
    }

    Iterable<MediaMetadataCompat> p(String str, String str2) {
        if (this.e != a.INITIALIZED) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = str2.toLowerCase(Locale.US);
        ArrayList<d> arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            d dVar = arrayList2.get(i);
            i++;
            d dVar2 = dVar;
            if (dVar2.a.i(str).toLowerCase(Locale.US).contains(lowerCase)) {
                arrayList.add(dVar2.a);
            }
        }
        return arrayList;
    }

    public Iterable<MediaMetadataCompat> q(String str) {
        return p("android.media.metadata.TITLE", str);
    }

    public void r(String str, boolean z) {
        if (z) {
            this.d.add(str);
        } else {
            this.d.remove(str);
        }
    }

    public synchronized void s(String str, MediaMetadataCompat mediaMetadataCompat) {
        d g2 = g(str);
        if (g2 == null) {
            return;
        }
        g2.a = mediaMetadataCompat;
    }

    public MediaMetadataCompat t(String str, long j) {
        synchronized (this) {
            try {
                d g2 = g(str);
                if (g2 != null && g2.a != null) {
                    this.c.put(str, Long.valueOf(j));
                    MediaMetadataCompat mediaMetadataCompat = g2.a;
                    if (mediaMetadataCompat.f("android.media.metadata.DURATION") == j) {
                        return null;
                    }
                    MediaMetadataCompat a2 = new MediaMetadataCompat.b(mediaMetadataCompat).c("android.media.metadata.DURATION", j).a();
                    g2.a = a2;
                    return a2;
                }
                return null;
            } finally {
            }
        }
    }

    public synchronized void u(String str, Bitmap bitmap, Bitmap bitmap2) {
        try {
            MediaMetadataCompat e = e(str);
            if (e == null) {
                return;
            }
            MediaMetadataCompat.b bVar = new MediaMetadataCompat.b(e);
            if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                bVar.b("android.media.metadata.ALBUM_ART", bitmap);
            }
            if (bitmap2 != null && bitmap2.getWidth() > 0 && bitmap2.getHeight() > 0) {
                bVar.b("android.media.metadata.DISPLAY_ICON", bitmap2);
            }
            MediaMetadataCompat a2 = bVar.a();
            d g2 = g(str);
            if (g2 == null) {
                throw new IllegalStateException("Unexpected error: Inconsistent data structures in MusicProvider");
            }
            g2.a = a2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public MediaMetadataCompat v(Context context, String str) {
        MediaMetadataCompat mediaMetadataCompat;
        MediaMetadataCompat a2;
        char c;
        String substring;
        d g2 = g(str);
        if (g2 == null || (mediaMetadataCompat = g2.a) == null) {
            return null;
        }
        g2.c = true;
        String charSequence = mediaMetadataCompat.j("__SOURCE__").toString();
        Uri parse = Uri.parse(charSequence);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                if (l(parse)) {
                    mediaMetadataRetriever.setDataSource(context, parse);
                } else {
                    mediaMetadataRetriever.setDataSource(charSequence, new HashMap());
                }
                String[] strArr = new String[2];
                MediaMetadataCompat.b bVar = new MediaMetadataCompat.b(mediaMetadataCompat);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(2);
                if (TextUtils.isEmpty(extractMetadata)) {
                    c = 0;
                } else {
                    bVar.d("android.media.metadata.ARTIST", extractMetadata);
                    strArr[0] = extractMetadata;
                    c = 1;
                }
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(1);
                if (!TextUtils.isEmpty(extractMetadata2)) {
                    bVar.d("android.media.metadata.ALBUM", extractMetadata2);
                    strArr[c] = extractMetadata2;
                }
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                if (!TextUtils.isEmpty(extractMetadata3)) {
                    try {
                        bVar.c("android.media.metadata.DURATION", Long.parseLong(extractMetadata3));
                    } catch (NumberFormatException unused) {
                    }
                }
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(6);
                if (!TextUtils.isEmpty(extractMetadata4)) {
                    bVar.d("android.media.metadata.GENRE", extractMetadata4);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(7);
                if (extractMetadata5 == null || extractMetadata5.trim().isEmpty()) {
                    String i = i(parse);
                    substring = i.substring(i.lastIndexOf(47) + 1);
                } else {
                    substring = extractMetadata5.trim();
                }
                bVar.d("android.media.metadata.TITLE", substring);
                bVar.d("android.media.metadata.DISPLAY_TITLE", substring);
                String str2 = strArr[0];
                if (str2 != null) {
                    bVar.d("android.media.metadata.DISPLAY_SUBTITLE", str2);
                }
                String str3 = strArr[1];
                if (str3 != null) {
                    bVar.d("android.media.metadata.DISPLAY_DESCRIPTION", str3);
                }
                a2 = bVar.a();
            } catch (RuntimeException unused2) {
                MediaMetadataCompat.b bVar2 = new MediaMetadataCompat.b(mediaMetadataCompat);
                String i2 = i(parse);
                bVar2.d("android.media.metadata.TITLE", i2.substring(i2.lastIndexOf(47) + 1));
                a2 = bVar2.a();
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused3) {
            }
            synchronized (this) {
                try {
                    d g3 = g(str);
                    if (g3 == null) {
                        return null;
                    }
                    Long l = this.c.get(str);
                    if (l != null && a2.f("android.media.metadata.DURATION") != l.longValue()) {
                        a2 = new MediaMetadataCompat.b(a2).c("android.media.metadata.DURATION", l.longValue()).a();
                    }
                    g3.a = a2;
                    return a2;
                } finally {
                }
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused4) {
            }
        }
    }
}
