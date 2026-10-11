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
import com.example.android.uamp.MusicService;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h {
    private static final String m = ax.S4.b.f(h.class);
    private static final String[] n = {"android.media.metadata.ART", "android.media.metadata.ALBUM_ART", "android.media.metadata.DISPLAY_ICON"};
    private ax.Q4.b a;
    private b b;
    private Resources c;
    private List<MediaSessionCompat.QueueItem> f;
    private int h;
    private Context i;
    private int k;
    private String l;
    private int j = -1;
    private List<MediaSessionCompat.QueueItem> d = DesugarCollections.synchronizedList(new ArrayList());
    private List<MediaSessionCompat.QueueItem> e = DesugarCollections.synchronizedList(new ArrayList());
    private int g = 0;

    class a extends a.AbstractC0170a {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // ax.P4.a.AbstractC0170a
        public void c(String str, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
            if (!h.this.m(bitmap2)) {
                bitmap2 = null;
            }
            if (!h.this.m(bitmap3)) {
                bitmap3 = null;
            }
            if (bitmap2 == null && bitmap3 == null) {
                return;
            }
            h.this.a.u(this.a, bitmap2, bitmap3);
            MediaSessionCompat.QueueItem i = h.this.i();
            if (i == null) {
                return;
            }
            if (this.a.equals(ax.S4.c.b(i.c().f()))) {
                try {
                    h.this.b.u(h.this.a.e(this.a));
                } catch (IllegalArgumentException unused) {
                    h.this.a.b(this.a);
                    h.this.b.u(h.this.a.e(this.a));
                } catch (RuntimeException unused2) {
                    h.this.a.b(this.a);
                    h.this.b.u(h.this.a.e(this.a));
                }
            }
        }
    }

    public interface b {
        void a();

        void b(int i);

        void c(String str, List<MediaSessionCompat.QueueItem> list);

        void u(MediaMetadataCompat mediaMetadataCompat);
    }

    private class c extends AsyncTask<Void, Integer, MediaMetadataCompat> {
        String a;

        c(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat doInBackground(Void... voidArr) {
            return h.this.a.v(h.this.i, this.a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(MediaMetadataCompat mediaMetadataCompat) {
            MediaSessionCompat.QueueItem i;
            String f;
            String b;
            if (mediaMetadataCompat == null || (i = h.this.i()) == null || (f = i.c().f()) == null || (b = ax.S4.c.b(f)) == null || !b.equals(this.a)) {
                return;
            }
            h.this.b.u(mediaMetadataCompat);
        }
    }

    public h(Context context, ax.Q4.b bVar, Resources resources, b bVar2) {
        this.i = context;
        this.a = bVar;
        this.b = bVar2;
        this.c = resources;
    }

    private void A(String str) {
        int i;
        if (this.k == 1) {
            this.d = this.e;
        } else {
            this.d = this.f;
        }
        List<MediaSessionCompat.QueueItem> list = this.d;
        if (list != null) {
            this.j = list.size();
        } else {
            this.j = -100;
        }
        if (str != null) {
            i = ax.S4.d.c(this.d, str);
            this.h = i;
        } else {
            i = 0;
        }
        this.g = Math.max(i, 0);
        this.b.c(this.l, this.d);
    }

    private MediaMetadataCompat e(String str, MediaMetadataCompat mediaMetadataCompat) {
        Bundle d = mediaMetadataCompat.d();
        ax.B.b bVar = null;
        for (String str2 : d.keySet()) {
            Object obj = d.get(str2);
            if ((obj instanceof Bitmap) && ((Bitmap) obj).isRecycled()) {
                if (bVar == null) {
                    bVar = new ax.B.b();
                }
                bVar.add(str2);
            }
        }
        boolean l = mediaMetadataCompat.g() instanceof MediaMetadata ? l((MediaMetadata) mediaMetadataCompat.g()) : false;
        if ((bVar == null || bVar.isEmpty()) && !l) {
            return mediaMetadataCompat;
        }
        MediaMetadataCompat.b bVar2 = new MediaMetadataCompat.b(mediaMetadataCompat);
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                bVar2.b((String) it.next(), null);
            }
        }
        MediaMetadataCompat a2 = bVar2.a();
        this.a.s(str, a2);
        return a2;
    }

    private String k(MediaSessionCompat.QueueItem queueItem) {
        if (queueItem.c() == null || queueItem.c().f() == null) {
            return null;
        }
        return ax.S4.c.b(queueItem.c().f());
    }

    private boolean l(MediaMetadata mediaMetadata) {
        Bitmap bitmap;
        for (String str : n) {
            if (mediaMetadata.containsKey(str) && (bitmap = mediaMetadata.getBitmap(str)) != null && bitmap.isRecycled()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(Bitmap bitmap) {
        return bitmap != null && bitmap.getHeight() > 0 && bitmap.getWidth() > 0;
    }

    private void r(int i) {
        if (i < 0 || i >= this.d.size()) {
            return;
        }
        this.g = i;
        this.b.b(i);
    }

    public int f() {
        if (j() == 0) {
            return 0;
        }
        int i = this.g;
        int i2 = this.h;
        if (i < i2) {
            i = this.d.size() + this.g;
            i2 = this.h;
        }
        return (i - i2) + 1;
    }

    public int g() {
        return this.g;
    }

    public String h() {
        MediaSessionCompat.QueueItem i = i();
        if (i == null) {
            return null;
        }
        return i.c().f();
    }

    public MediaSessionCompat.QueueItem i() {
        if (ax.S4.d.e(this.g, this.d)) {
            return this.d.get(this.g);
        }
        return null;
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
    }

    public boolean o(String str) {
        String[] c2 = ax.S4.c.c(str);
        MediaSessionCompat.QueueItem i = i();
        if (i == null) {
            return false;
        }
        return Arrays.equals(c2, ax.S4.c.c(i.c().f()));
    }

    public void p() {
        MusicService.L(this.i);
    }

    protected void q(String str, List<MediaSessionCompat.QueueItem> list, String str2) {
        this.f = list;
        ArrayList arrayList = new ArrayList(list);
        this.e = arrayList;
        Collections.shuffle(arrayList);
        this.l = str;
        A(str2);
    }

    public boolean s(long j) {
        int b2 = ax.S4.d.b(this.d, j);
        r(b2);
        return b2 >= 0;
    }

    public boolean t(String str) {
        int c2 = ax.S4.d.c(this.d, str);
        r(c2);
        return c2 >= 0;
    }

    public void u(String str) {
        q("musics", ax.S4.d.a(this.a.f(), new String[0]), str);
        y();
    }

    public void v(String str) {
        ax.S4.b.a(m, "setQueueFromMusic", str);
        if (!(o(str) ? t(str) : false)) {
            q("musics", ax.S4.d.d(str, this.a), str);
        }
        y();
    }

    public void w(int i) {
        this.k = i;
        A(h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r2 == r4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(int r8) {
        /*
            r7 = this;
            r0 = 1
            int r1 = r7.g
            int r1 = r1 + r8
            int r2 = r7.j()
            r3 = 0
            if (r2 != 0) goto L40
            android.content.Context r8 = r7.i
            ax.Ha.b r8 = ax.Ha.c.i(r8)
            java.lang.String r0 = "MUSICPLAYER-QUEUESIZE0"
            ax.Ha.b r8 = r8.n(r0)
            ax.Ha.b r8 = r8.j()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mCurrentIndex="
            r0.append(r1)
            int r1 = r7.g
            r0.append(r1)
            java.lang.String r1 = ",queueset="
            r0.append(r1)
            int r1 = r7.j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            ax.Ha.b r8 = r8.g(r0)
            r8.h()
            return r3
        L40:
            if (r8 >= 0) goto L49
            int r2 = r7.h
            int r4 = r7.g
            if (r2 != r4) goto L49
            goto L5c
        L49:
            if (r1 >= 0) goto L54
            java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r7.d
            int r1 = r1.size()
            int r4 = r1 + (-1)
            goto L5c
        L54:
            java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r2 = r7.d
            int r2 = r2.size()
            int r4 = r1 % r2
        L5c:
            java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r7.d
            boolean r1 = ax.S4.d.e(r4, r1)
            if (r1 != 0) goto L97
            java.lang.String r1 = ax.R4.h.m
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r2 = r7.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r4 = r7.d
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "Cannot increment queue index by "
            r5[r3] = r6
            r5[r0] = r8
            java.lang.String r8 = ". Current="
            r0 = 2
            r5[r0] = r8
            r8 = 3
            r5[r8] = r2
            java.lang.String r8 = " queue length="
            r0 = 4
            r5[r0] = r8
            r8 = 5
            r5[r8] = r4
            ax.S4.b.c(r1, r5)
            return r3
        L97:
            r7.g = r4
            android.content.Context r8 = r7.i
            ax.Q4.b r1 = r7.a
            java.lang.String r1 = r1.d()
            java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r2 = r7.d
            int r4 = r7.g
            java.lang.Object r2 = r2.get(r4)
            android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r2
            android.support.v4.media.MediaDescriptionCompat r2 = r2.c()
            java.lang.String r2 = r2.f()
            com.example.android.uamp.MusicService.N(r8, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.R4.h.x(int):boolean");
    }

    public void y() {
        MediaSessionCompat.QueueItem i = i();
        if (i == null) {
            this.b.a();
            return;
        }
        String k = k(i);
        MediaMetadataCompat e = this.a.e(k);
        if (e == null) {
            throw new IllegalArgumentException("Invalid musicId " + k);
        }
        MediaMetadataCompat e2 = e(k, e);
        if (!this.a.n(k)) {
            new c(k).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        MediaMetadataCompat e3 = e(k, e2);
        this.b.u(e3);
        MediaDescriptionCompat b2 = k.b(e3);
        if (b2.c() != null || b2.d() == null) {
            return;
        }
        ax.P4.a.i().f(this.i.getApplicationContext(), b2.d().toString(), new a(k));
    }

    public void z(String str, long j) {
        MediaSessionCompat.QueueItem i;
        String k;
        MediaMetadataCompat t;
        String b2 = ax.S4.c.b(str);
        if (b2 == null || (i = i()) == null || (k = k(i)) == null || !b2.equals(k) || (t = this.a.t(k, j)) == null) {
            return;
        }
        this.b.u(t);
    }
}
