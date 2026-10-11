/*
 * Decompiled with CFR 0.152.
 */
package ax.R4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import ax.P4.a;
import ax.P4.k;
import ax.S4.d;
import com.example.android.uamp.MusicService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class h {
    private static final String m = ax.S4.b.f(h.class);
    private static final String[] n = new String[]{"android.media.metadata.ART", "android.media.metadata.ALBUM_ART", "android.media.metadata.DISPLAY_ICON"};
    private ax.Q4.b a;
    private b b;
    private Resources c;
    private List<MediaSessionCompat.QueueItem> d;
    private List<MediaSessionCompat.QueueItem> e;
    private List<MediaSessionCompat.QueueItem> f;
    private int g;
    private int h;
    private Context i;
    private int j = -1;
    private int k;
    private String l;

    public h(Context context, ax.Q4.b b8, Resources resources, b b9) {
        this.i = context;
        this.a = b8;
        this.b = b9;
        this.c = resources;
        this.d = java.util.DesugarCollections.synchronizedList(new ArrayList());
        this.e = java.util.DesugarCollections.synchronizedList(new ArrayList());
        this.g = 0;
    }

    private void A(String string) {
        int n8;
        this.d = this.k == 1 ? this.e : this.f;
        List<MediaSessionCompat.QueueItem> list = this.d;
        this.j = list != null ? list.size() : -100;
        if (string != null) {
            this.h = n8 = ax.S4.d.c(this.d, string);
        } else {
            n8 = 0;
        }
        this.g = Math.max(n8, 0);
        this.b.c(this.l, this.d);
    }

    private MediaMetadataCompat e(String string, MediaMetadataCompat object) {
        ax.B.b<String> b8;
        block8: {
            ax.B.b<String> b9;
            block7: {
                Bundle bundle = ((MediaMetadataCompat)object).d();
                Iterator iterator = bundle.keySet().iterator();
                b9 = null;
                while (iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    b8 = bundle.get(string2);
                    if (!(b8 instanceof Bitmap) || !((Bitmap)b8).isRecycled()) continue;
                    b8 = b9;
                    if (b9 == null) {
                        b8 = new ax.B.b<String>();
                    }
                    b8.add(string2);
                    b9 = b8;
                }
                boolean bl = ((MediaMetadataCompat)object).g() instanceof MediaMetadata ? this.l((MediaMetadata)((MediaMetadataCompat)object).g()) : false;
                if (b9 != null && !b9.isEmpty()) break block7;
                b8 = object;
                if (!bl) break block8;
            }
            object = new MediaMetadataCompat.b((MediaMetadataCompat)object);
            if (b9 != null) {
                b9 = b9.iterator();
                while (b9.hasNext()) {
                    ((MediaMetadataCompat.b)object).b((String)b9.next(), null);
                }
            }
            b8 = ((MediaMetadataCompat.b)object).a();
            this.a.s(string, (MediaMetadataCompat)((Object)b8));
        }
        return b8;
    }

    private String k(MediaSessionCompat.QueueItem queueItem) {
        if (queueItem.c() != null && queueItem.c().f() != null) {
            return ax.S4.c.b(queueItem.c().f());
        }
        return null;
    }

    private boolean l(MediaMetadata mediaMetadata) {
        for (String string : n) {
            if (!mediaMetadata.containsKey(string) || (string = mediaMetadata.getBitmap(string)) == null || !string.isRecycled()) continue;
            return true;
        }
        return false;
    }

    private boolean m(Bitmap bitmap) {
        return bitmap != null && bitmap.getHeight() > 0 && bitmap.getWidth() > 0;
    }

    private void r(int n8) {
        if (n8 >= 0 && n8 < this.d.size()) {
            this.g = n8;
            this.b.b(n8);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int f() {
        if (this.j() == 0) {
            return 0;
        }
        int n8 = this.g;
        int n9 = this.h;
        if (n8 >= n9) {
            return n8 - n9 + 1;
        }
        n8 = this.d.size() + this.g;
        n9 = this.h;
        return n8 - n9 + 1;
    }

    public int g() {
        return this.g;
    }

    public String h() {
        MediaSessionCompat.QueueItem queueItem = this.i();
        if (queueItem == null) {
            return null;
        }
        return queueItem.c().f();
    }

    public MediaSessionCompat.QueueItem i() {
        if (!ax.S4.d.e(this.g, this.d)) {
            return null;
        }
        return this.d.get(this.g);
    }

    public int j() {
        List<MediaSessionCompat.QueueItem> list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public boolean n() {
        List<MediaSessionCompat.QueueItem> list = this.d;
        return list == null || list.size() == 0;
        {
        }
    }

    public boolean o(String objectArray) {
        objectArray = ax.S4.c.c((String)objectArray);
        MediaSessionCompat.QueueItem queueItem = this.i();
        if (queueItem == null) {
            return false;
        }
        return Arrays.equals(objectArray, ax.S4.c.c(queueItem.c().f()));
    }

    public void p() {
        MusicService.L(this.i);
    }

    protected void q(String string, List<MediaSessionCompat.QueueItem> list, String string2) {
        this.f = list;
        list = new ArrayList<MediaSessionCompat.QueueItem>(list);
        this.e = list;
        Collections.shuffle(list);
        this.l = string;
        this.A(string2);
    }

    public boolean s(long l8) {
        int n8 = ax.S4.d.b(this.d, l8);
        this.r(n8);
        return n8 >= 0;
    }

    public boolean t(String string) {
        int n8 = ax.S4.d.c(this.d, string);
        this.r(n8);
        return n8 >= 0;
    }

    public void u(String string) {
        this.q("musics", ax.S4.d.a(this.a.f(), new String[0]), string);
        this.y();
    }

    public void v(String string) {
        String string2 = m;
        boolean bl = false;
        ax.S4.b.a(string2, "setQueueFromMusic", string);
        if (this.o(string)) {
            bl = this.t(string);
        }
        if (!bl) {
            this.q("musics", ax.S4.d.d(string, this.a), string);
        }
        this.y();
    }

    public void w(int n8) {
        this.k = n8;
        this.A(this.h());
    }

    public boolean x(int n8) {
        int n9;
        int n10;
        int n11 = this.g + n8;
        if (this.j() == 0) {
            ax.Ha.b b8 = ax.Ha.c.i(this.i).n("MUSICPLAYER-QUEUESIZE0").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("mCurrentIndex=");
            stringBuilder.append(this.g);
            stringBuilder.append(",queueset=");
            stringBuilder.append(this.j);
            b8.g(stringBuilder.toString()).h();
            return false;
        }
        if (n8 >= 0 || (n10 = this.h) != (n9 = this.g)) {
            n9 = n11 < 0 ? this.d.size() - 1 : n11 % this.d.size();
        }
        if (!ax.S4.d.e(n9, this.d)) {
            ax.S4.b.c(m, "Cannot increment queue index by ", n8, ". Current=", this.g, " queue length=", this.d.size());
            return false;
        }
        this.g = n9;
        MusicService.N(this.i, this.a.d(), this.d.get(this.g).c().f(), 0);
        return true;
    }

    public void y() {
        Object object = this.i();
        if (object == null) {
            this.b.a();
            return;
        }
        Object object2 = this.a.e((String)(object = this.k((MediaSessionCompat.QueueItem)object)));
        if (object2 != null) {
            object2 = this.e((String)object, (MediaMetadataCompat)object2);
            if (!this.a.n((String)object)) {
                new c(this, (String)object).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
            object2 = this.e((String)object, (MediaMetadataCompat)object2);
            this.b.u((MediaMetadataCompat)object2);
            object2 = ax.P4.k.b((MediaMetadataCompat)object2);
            if (((MediaDescriptionCompat)object2).c() == null && ((MediaDescriptionCompat)object2).d() != null) {
                object2 = ((MediaDescriptionCompat)object2).d().toString();
                ax.P4.a.i().f(this.i.getApplicationContext(), (String)object2, new a.a(this, (String)object){
                    final String a;
                    final h b;
                    {
                        this.b = h8;
                        this.a = string;
                    }

                    @Override
                    public void c(String object, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
                        object = bitmap2;
                        if (!this.b.m(bitmap2)) {
                            object = null;
                        }
                        bitmap = bitmap3;
                        if (!this.b.m(bitmap3)) {
                            bitmap = null;
                        }
                        if (object != null || bitmap != null) {
                            this.b.a.u(this.a, (Bitmap)object, bitmap);
                            object = this.b.i();
                            if (object != null && this.a.equals(object = ax.S4.c.b(((MediaSessionCompat.QueueItem)object).c().f()))) {
                                try {
                                    this.b.b.u(this.b.a.e(this.a));
                                    return;
                                }
                                catch (RuntimeException runtimeException) {
                                    this.b.a.b(this.a);
                                    this.b.b.u(this.b.a.e(this.a));
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    this.b.a.b(this.a);
                                    this.b.b.u(this.b.a.e(this.a));
                                }
                            }
                        }
                    }
                });
            }
            return;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Invalid musicId ");
        ((StringBuilder)object2).append((String)object);
        throw new IllegalArgumentException(((StringBuilder)object2).toString());
    }

    public void z(String object, long l8) {
        Object object2;
        if ((object = ax.S4.c.b((String)object)) != null && (object2 = this.i()) != null && (object2 = this.k((MediaSessionCompat.QueueItem)object2)) != null && ((String)object).equals(object2) && (object = this.a.t((String)object2, l8)) != null) {
            this.b.u((MediaMetadataCompat)object);
        }
    }

    public static interface b {
        public void a();

        public void b(int var1);

        public void c(String var1, List<MediaSessionCompat.QueueItem> var2);

        public void u(MediaMetadataCompat var1);
    }

    private class c
    extends AsyncTask<Void, Integer, MediaMetadataCompat> {
        String a;
        final h b;

        c(h h8, String string) {
            this.b = h8;
            this.a = string;
        }

        protected MediaMetadataCompat a(Void ... voidArray) {
            return this.b.a.v(this.b.i, this.a);
        }

        protected void b(MediaMetadataCompat mediaMetadataCompat) {
            Object object;
            if (mediaMetadataCompat != null && (object = this.b.i()) != null && (object = ((MediaSessionCompat.QueueItem)object).c().f()) != null && (object = ax.S4.c.b((String)object)) != null && ((String)object).equals(this.a)) {
                this.b.b.u(mediaMetadataCompat);
            }
        }
    }
}

