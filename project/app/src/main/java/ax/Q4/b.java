/*
 * Decompiled with CFR 0.152.
 */
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
import ax.Q4.c;
import ax.Q4.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class b {
    private static final String g = ax.S4.b.f(b.class);
    private final ArrayList<d> a = new ArrayList();
    private final ConcurrentMap<String, d> b = new j.ConcurrentHashMap();
    private final ConcurrentMap<String, Long> c = new j.ConcurrentHashMap();
    private final Set<String> d = Collections.newSetFromMap(new j.ConcurrentHashMap());
    private volatile a e = ax.Q4.b$a.q;
    private String f;

    public static String h(String string) {
        if (string == null) {
            return null;
        }
        int n8 = string.indexOf(":");
        if (n8 < 0) {
            return null;
        }
        return string.substring(n8 + 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String i(Uri object) {
        String string = object.getPath();
        if (!"content".equals(object.getScheme())) return string;
        try {
            String string2 = DocumentsContract.getDocumentId((Uri)object);
            object = new StringBuilder();
            ((StringBuilder)object).append("/");
            ((StringBuilder)object).append(ax.Q4.b.h(string2));
            return ((StringBuilder)object).toString();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return string;
        }
    }

    public static boolean l(Uri uri) {
        return "file".equals(uri.getScheme()) || "content".equals(uri.getScheme());
        {
        }
    }

    public static boolean m(String string) {
        if (string == null) {
            return false;
        }
        return string.startsWith("file://") || string.startsWith("content://");
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(c object) {
        Throwable throwable2;
        block6: {
            block5: {
                try {
                    if (this.e != ax.Q4.b$a.q) break block5;
                    this.e = ax.Q4.b$a.c0;
                    this.f = ((c)object).c();
                    Iterator<MediaMetadataCompat> iterator = ((c)object).e();
                    while (iterator.hasNext()) {
                        object = iterator.next();
                        String string = ((MediaMetadataCompat)object).i("android.media.metadata.MEDIA_ID");
                        d d8 = new d(string, (MediaMetadataCompat)object);
                        this.a.add(d8);
                        this.b.put(string, d8);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.e = ax.Q4.b$a.d0;
            }
            if (this.e != ax.Q4.b$a.d0) {
                this.e = ax.Q4.b$a.q;
            }
            return;
        }
        if (this.e != ax.Q4.b$a.d0) {
            this.e = ax.Q4.b$a.q;
        }
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(String object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                MediaMetadataCompat mediaMetadataCompat;
                block5: {
                    try {
                        mediaMetadataCompat = this.e((String)object);
                        if (mediaMetadataCompat != null) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                MediaMetadataCompat.b b8 = new MediaMetadataCompat.b(mediaMetadataCompat);
                b8.b("android.media.metadata.ALBUM_ART", null);
                b8.b("android.media.metadata.DISPLAY_ICON", null);
                mediaMetadataCompat = b8.a();
                object = this.g((String)object);
                if (object != null) {
                    ((d)object).a = mediaMetadataCompat;
                    return;
                }
                object = new IllegalStateException("Unexpected error: Inconsistent data structures in MusicProvider");
                throw object;
            }
            throw throwable2;
        }
    }

    public List<MediaBrowserCompat.MediaItem> c(String string, Resources resources) {
        return new ArrayList<MediaBrowserCompat.MediaItem>();
    }

    public String d() {
        return this.f;
    }

    public MediaMetadataCompat e(String string) {
        if (this.b.containsKey(string)) {
            return ((d)this.b.get((Object)string)).a;
        }
        return null;
    }

    public Iterable<MediaMetadataCompat> f() {
        if (this.e != ax.Q4.b$a.d0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<MediaMetadataCompat> arrayList = new ArrayList<MediaMetadataCompat>(this.a.size());
        ArrayList<d> arrayList2 = this.a;
        int n8 = arrayList2.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            d d8 = arrayList2.get(i8);
            arrayList.add(d8.a);
        }
        return arrayList;
    }

    public d g(String string) {
        return (d)this.b.get(string);
    }

    public boolean j() {
        return this.a.size() > 0;
    }

    public boolean k(String string) {
        return this.d.contains(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean n(String object) {
        synchronized (this) {
            object = this.g((String)object);
            if (object == null) {
                return false;
            }
            MediaMetadataCompat mediaMetadataCompat = ((d)object).a;
            if (mediaMetadataCompat == null) {
                return false;
            }
            boolean bl = ((d)object).c;
            if (bl) {
                return true;
            }
            object = mediaMetadataCompat.j("android.media.metadata.DISPLAY_TITLE");
            if (object == null) {
                return false;
            }
            bl = TextUtils.isEmpty((CharSequence)object.toString());
            return !bl;
            {
            }
        }
    }

    public void o(c c8) {
        this.e = ax.Q4.b$a.q;
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.a(c8);
    }

    Iterable<MediaMetadataCompat> p(String string, String object) {
        if (this.e != ax.Q4.b$a.d0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<MediaMetadataCompat> arrayList = new ArrayList<MediaMetadataCompat>();
        String string2 = ((String)object).toLowerCase(Locale.US);
        object = this.a;
        int n8 = ((ArrayList)object).size();
        int n9 = 0;
        while (n9 < n8) {
            Object object2 = ((ArrayList)object).get(n9);
            int n10 = n9 + 1;
            object2 = (d)object2;
            n9 = n10;
            if (!((d)object2).a.i(string).toLowerCase(Locale.US).contains(string2)) continue;
            arrayList.add(((d)object2).a);
            n9 = n10;
        }
        return arrayList;
    }

    public Iterable<MediaMetadataCompat> q(String string) {
        return this.p("android.media.metadata.TITLE", string);
    }

    public void r(String string, boolean bl) {
        if (bl) {
            this.d.add(string);
            return;
        }
        this.d.remove(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void s(String object, MediaMetadataCompat mediaMetadataCompat) {
        synchronized (this) {
            object = this.g((String)object);
            if (object == null) {
                return;
            }
            ((d)object).a = mediaMetadataCompat;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MediaMetadataCompat t(String object, long l8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        d d8 = this.g((String)object);
                        if (d8 == null || d8.a == null) break block4;
                        this.c.put((String)object, l8);
                        object = d8.a;
                        if (((MediaMetadataCompat)object).f("android.media.metadata.DURATION") == l8) {
                            return null;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    MediaMetadataCompat.b b8 = new MediaMetadataCompat.b((MediaMetadataCompat)object);
                    d8.a = object = b8.c("android.media.metadata.DURATION", l8).a();
                    return object;
                }
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void u(String object, Bitmap object2, Bitmap bitmap) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                MediaMetadataCompat mediaMetadataCompat;
                block7: {
                    try {
                        mediaMetadataCompat = this.e((String)object);
                        if (mediaMetadataCompat != null) break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    return;
                }
                MediaMetadataCompat.b b8 = new MediaMetadataCompat.b(mediaMetadataCompat);
                if (object2 != null && object2.getWidth() > 0 && object2.getHeight() > 0) {
                    b8.b("android.media.metadata.ALBUM_ART", (Bitmap)object2);
                }
                if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    b8.b("android.media.metadata.DISPLAY_ICON", bitmap);
                }
                object2 = b8.a();
                if ((object = this.g((String)object)) != null) {
                    ((d)object).a = object2;
                    return;
                }
                object = new IllegalStateException("Unexpected error: Inconsistent data structures in MusicProvider");
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MediaMetadataCompat v(Context object, String object2) {
        Throwable throwable222;
        Object object3;
        d d8;
        block29: {
            boolean bl;
            int n8;
            d8 = this.g((String)object2);
            if (d8 == null) {
                return null;
            }
            object3 = d8.a;
            if (object3 == null) {
                return null;
            }
            d8.c = true;
            Object object4 = ((MediaMetadataCompat)object3).j("__SOURCE__").toString();
            Uri uri = Uri.parse((String)object4);
            d8 = new MediaMetadataRetriever();
            if (ax.Q4.b.l(uri)) {
                d8.setDataSource((Context)object, uri);
            } else {
                object = new HashMap();
                d8.setDataSource((String)object4, (Map)object);
            }
            String[] stringArray = new String[2];
            object4 = new MediaMetadataCompat.b((MediaMetadataCompat)object3);
            object = d8.extractMetadata(2);
            if (!TextUtils.isEmpty((CharSequence)object)) {
                ((MediaMetadataCompat.b)object4).d("android.media.metadata.ARTIST", (String)object);
                stringArray[0] = object;
                n8 = 1;
            } else {
                n8 = 0;
            }
            object = d8.extractMetadata(1);
            if (!TextUtils.isEmpty((CharSequence)object)) {
                ((MediaMetadataCompat.b)object4).d("android.media.metadata.ALBUM", (String)object);
                stringArray[n8] = object;
            }
            if (!(bl = TextUtils.isEmpty((CharSequence)(object = d8.extractMetadata(9))))) {
                try {
                    ((MediaMetadataCompat.b)object4).c("android.media.metadata.DURATION", Long.parseLong((String)object));
                }
                catch (NumberFormatException numberFormatException) {}
            }
            if (!TextUtils.isEmpty((CharSequence)(object = d8.extractMetadata(6)))) {
                ((MediaMetadataCompat.b)object4).d("android.media.metadata.GENRE", (String)object);
            }
            if ((object = d8.extractMetadata(7)) != null && !((String)object).trim().isEmpty()) {
                object = ((String)object).trim();
            } else {
                object = ax.Q4.b.i(uri);
                object = ((String)object).substring(((String)object).lastIndexOf(47) + 1);
            }
            ((MediaMetadataCompat.b)object4).d("android.media.metadata.TITLE", (String)object);
            ((MediaMetadataCompat.b)object4).d("android.media.metadata.DISPLAY_TITLE", (String)object);
            object = stringArray[0];
            if (object != null) {
                ((MediaMetadataCompat.b)object4).d("android.media.metadata.DISPLAY_SUBTITLE", (String)object);
            }
            if ((object = stringArray[1]) != null) {
                ((MediaMetadataCompat.b)object4).d("android.media.metadata.DISPLAY_DESCRIPTION", (String)object);
            }
            object = ((MediaMetadataCompat.b)object4).a();
            {
                catch (Throwable throwable222) {
                    break block29;
                }
                catch (RuntimeException runtimeException) {}
                {
                    object = new MediaMetadataCompat.b((MediaMetadataCompat)object3);
                    object3 = ax.Q4.b.i(uri);
                    ((MediaMetadataCompat.b)object).d("android.media.metadata.TITLE", ((String)object3).substring(((String)object3).lastIndexOf(47) + 1));
                    object = ((MediaMetadataCompat.b)object).a();
                }
            }
            try {
                d8.release();
            }
            catch (Exception exception) {}
        }
        try {
            d8.release();
        }
        catch (Exception exception) {
            throw throwable222;
        }
        throw throwable222;
        synchronized (this) {
            try {
                d8 = this.g((String)object2);
                if (d8 == null) {
                    return null;
                }
                object3 = (Long)this.c.get(object2);
                object2 = object;
                if (object3 != null) {
                    object2 = object;
                    if (((MediaMetadataCompat)object).f("android.media.metadata.DURATION") != ((Long)object3).longValue()) {
                        object2 = new MediaMetadataCompat.b((MediaMetadataCompat)object);
                        object2 = ((MediaMetadataCompat.b)object2).c("android.media.metadata.DURATION", (Long)object3).a();
                    }
                }
                d8.a = object2;
                return object2;
            }
            catch (Throwable throwable3) {}
            throw throwable3;
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = ax.Q4.b$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

