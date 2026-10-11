package ax.V2;

import android.content.Context;
import android.content.SharedPreferences;
import ax.Z2.s;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.T;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class d {
    static Comparator<Bookmark> h = new a();
    private Context a;
    private Set<ax.Q2.f> d;
    private Set<ax.Q2.f> e;
    private Set<ax.Q2.f> f;
    private final List<Bookmark> b = DesugarCollections.synchronizedList(new ArrayList());
    private final List<Bookmark> c = DesugarCollections.synchronizedList(new LinkedList());
    private final List<b> g = DesugarCollections.synchronizedList(new ArrayList());

    class a implements Comparator<Bookmark> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Bookmark bookmark, Bookmark bookmark2) {
            if (bookmark.y() == -5 && bookmark2.y() != -5) {
                return -1;
            }
            if (bookmark.y() == -5 && bookmark2.y() == -5) {
                return 0;
            }
            if (bookmark.y() != -5 && bookmark2.y() == -5) {
                return 1;
            }
            if (bookmark.y() > bookmark2.y()) {
                return -1;
            }
            return bookmark.y() < bookmark2.y() ? 1 : 0;
        }
    }

    public interface b {
        void a();
    }

    public d(Context context) {
        this.a = context;
        k();
    }

    private void d() {
        synchronized (this.g) {
            try {
                Iterator<b> it = this.g.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean e(Bookmark bookmark) {
        Iterator<s> it = (bookmark.s().J() == ax.Q2.f.G0 ? T.e(this.a) : T.c(this.a)).iterator();
        while (it.hasNext()) {
            if (it.next().e().equals(bookmark.u())) {
                return true;
            }
        }
        return false;
    }

    private int f(ax.Q2.f fVar, int i) {
        synchronized (this.b) {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                try {
                    if (this.b.get(i2).B(fVar, i)) {
                        return i2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return -1;
        }
    }

    private int g(Bookmark bookmark) {
        synchronized (this.b) {
            for (int i = 0; i < this.b.size(); i++) {
                try {
                    if (this.b.get(i).C(bookmark)) {
                        return i;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return -1;
        }
    }

    private static boolean l(Bookmark bookmark) {
        return bookmark.y() > 0 && bookmark.y() < System.currentTimeMillis() - 259200000;
    }

    private static boolean m(Bookmark bookmark, Bookmark bookmark2) {
        return bookmark.s() == bookmark2.s() && bookmark.x() != null && bookmark.x().equals(bookmark2.x());
    }

    private boolean n(Bookmark bookmark) {
        return ax.Q2.f.r0(bookmark.u(), false);
    }

    private void v() {
        synchronized (this.b) {
            Collections.sort(this.b, h);
        }
    }

    public synchronized void a(Bookmark bookmark) {
        try {
            synchronized (this.c) {
                try {
                    Iterator<Bookmark> it = this.c.iterator();
                    while (it.hasNext()) {
                        if (m(it.next(), bookmark)) {
                            it.remove();
                        }
                    }
                } finally {
                }
            }
            this.c.add(0, bookmark);
            if (this.c.size() >= 10) {
                this.c.remove(r4.size() - 1);
            }
            d();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b(b bVar) {
        this.g.add(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0003, B:10:0x0011, B:12:0x0017, B:13:0x0024, B:15:0x0030, B:18:0x0035, B:23:0x0054, B:27:0x0060, B:29:0x006a, B:31:0x0074, B:35:0x007b, B:37:0x0081, B:40:0x0086, B:43:0x008e, B:45:0x0096, B:46:0x0099, B:47:0x00a4, B:50:0x009f, B:53:0x0042), top: B:6:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0003, B:10:0x0011, B:12:0x0017, B:13:0x0024, B:15:0x0030, B:18:0x0035, B:23:0x0054, B:27:0x0060, B:29:0x006a, B:31:0x0074, B:35:0x007b, B:37:0x0081, B:40:0x0086, B:43:0x008e, B:45:0x0096, B:46:0x0099, B:47:0x00a4, B:50:0x009f, B:53:0x0042), top: B:6:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x0003, B:10:0x0011, B:12:0x0017, B:13:0x0024, B:15:0x0030, B:18:0x0035, B:23:0x0054, B:27:0x0060, B:29:0x006a, B:31:0x0074, B:35:0x007b, B:37:0x0081, B:40:0x0086, B:43:0x008e, B:45:0x0096, B:46:0x0099, B:47:0x00a4, B:50:0x009f, B:53:0x0042), top: B:6:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void c(com.voxdon.xplorer.bookmark.Bookmark r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            if (r10 == 0) goto Lae
            java.util.Set<ax.Q2.f> r0 = r9.d     // Catch: java.lang.Throwable -> L20
            ax.Q2.f r1 = r10.s()     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L11
            goto Lae
        L11:
            int r0 = r9.g(r10)     // Catch: java.lang.Throwable -> L20
            if (r0 < 0) goto L23
            java.util.List<com.voxdon.xplorer.bookmark.Bookmark> r1 = r9.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L20
            com.voxdon.xplorer.bookmark.Bookmark r1 = (com.voxdon.xplorer.bookmark.Bookmark) r1     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r10 = move-exception
            goto Lac
        L23:
            r1 = 0
        L24:
            android.content.Context r2 = r9.a     // Catch: java.lang.Throwable -> L20
            ax.t3.k$a r2 = ax.t3.j.c(r2)     // Catch: java.lang.Throwable -> L20
            ax.t3.k$a r3 = ax.t3.k.a.DRAWER_ALWAYS     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L42
            ax.t3.k$a r3 = ax.t3.k.a.DRAWER_ONLY_HOME     // Catch: java.lang.Throwable -> L20
            if (r2 != r3) goto L35
            goto L42
        L35:
            java.util.Set<ax.Q2.f> r2 = r9.f     // Catch: java.lang.Throwable -> L20
            ax.Q2.f r3 = r10.s()     // Catch: java.lang.Throwable -> L20
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L4f
            goto L50
        L42:
            java.util.Set<ax.Q2.f> r2 = r9.e     // Catch: java.lang.Throwable -> L20
            ax.Q2.f r3 = r10.s()     // Catch: java.lang.Throwable -> L20
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L4f
            goto L50
        L4f:
            r4 = 0
        L50:
            r2 = -5
            if (r1 == 0) goto L5d
            long r6 = r1.y()     // Catch: java.lang.Throwable -> L20
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L5d
            goto L5e
        L5d:
            r5 = r4
        L5e:
            if (r5 == 0) goto L86
            ax.c3.K r4 = r10.u()     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = r4.e()     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L79
            java.lang.String r5 = r10.w()     // Catch: java.lang.Throwable -> L20
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L79
            r9.r(r10)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r9)
            return
        L79:
            if (r4 != 0) goto L86
            java.lang.String r4 = r10.w()     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L86
            r9.r(r10)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r9)
            return
        L86:
            com.voxdon.xplorer.bookmark.Bookmark r10 = com.voxdon.xplorer.bookmark.Bookmark.k(r10)     // Catch: java.lang.Throwable -> L20
            if (r0 < 0) goto L9f
            if (r1 == 0) goto L99
            long r4 = r1.y()     // Catch: java.lang.Throwable -> L20
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L99
            r10.H(r2)     // Catch: java.lang.Throwable -> L20
        L99:
            java.util.List<com.voxdon.xplorer.bookmark.Bookmark> r1 = r9.b     // Catch: java.lang.Throwable -> L20
            r1.set(r0, r10)     // Catch: java.lang.Throwable -> L20
            goto La4
        L9f:
            java.util.List<com.voxdon.xplorer.bookmark.Bookmark> r0 = r9.b     // Catch: java.lang.Throwable -> L20
            r0.add(r10)     // Catch: java.lang.Throwable -> L20
        La4:
            r9.v()     // Catch: java.lang.Throwable -> L20
            r9.d()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r9)
            return
        Lac:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L20
            throw r10
        Lae:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.V2.d.c(com.voxdon.xplorer.bookmark.Bookmark):void");
    }

    public List<Bookmark> h(int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            try {
                int min = Math.min(this.b.size(), i);
                for (int i3 = 0; i3 < min; i3++) {
                    Bookmark bookmark = this.b.get(i3);
                    if (!l(bookmark) && n(bookmark)) {
                        arrayList.add(bookmark);
                    }
                }
            } finally {
            }
        }
        synchronized (this.c) {
            try {
                int min2 = Math.min(this.c.size(), i);
                for (int i4 = 0; i4 < min2; i4++) {
                    Bookmark bookmark2 = this.c.get(i4);
                    if (!l(bookmark2) && n(bookmark2)) {
                        ax.Q2.f s = bookmark2.s();
                        Iterator it = arrayList.iterator();
                        int i5 = 0;
                        while (it.hasNext()) {
                            Bookmark bookmark3 = (Bookmark) it.next();
                            if (bookmark3.s() == s) {
                                if (z && bookmark3.z() == 4 && "/".equals(bookmark3.x())) {
                                    it.remove();
                                } else if (!m(bookmark3, bookmark2)) {
                                    i5++;
                                } else if (bookmark3.y() <= bookmark2.y()) {
                                    it.remove();
                                }
                            }
                        }
                        if (i5 < i2) {
                            arrayList.add(bookmark2);
                        }
                    }
                }
            } finally {
            }
        }
        Collections.sort(arrayList, h);
        while (arrayList.size() > i) {
            arrayList.remove(arrayList.remove(i));
        }
        return arrayList;
    }

    public int i() {
        return h(10, 10, false).size();
    }

    public List<Bookmark> j() {
        return this.b;
    }

    void k() {
        this.d = new HashSet(ax.Q2.f.C());
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        hashSet.add(ax.Q2.f.o0);
        this.e.add(ax.Q2.f.p0);
        this.e.add(ax.Q2.f.t0);
        this.f = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007d A[Catch: all -> 0x0028, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0014, B:10:0x007d, B:11:0x0082, B:13:0x0088, B:15:0x0090, B:16:0x009a, B:18:0x00ab, B:23:0x00b5, B:27:0x00bd, B:28:0x00c6, B:30:0x00cc, B:33:0x00d9, B:36:0x00e0, B:38:0x00ea, B:41:0x00f1, B:55:0x00f7, B:57:0x00ff, B:61:0x0109, B:65:0x0111, B:66:0x0116, B:73:0x002f, B:76:0x0049, B:78:0x004d, B:80:0x0061, B:81:0x0055), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0014, B:10:0x007d, B:11:0x0082, B:13:0x0088, B:15:0x0090, B:16:0x009a, B:18:0x00ab, B:23:0x00b5, B:27:0x00bd, B:28:0x00c6, B:30:0x00cc, B:33:0x00d9, B:36:0x00e0, B:38:0x00ea, B:41:0x00f1, B:55:0x00f7, B:57:0x00ff, B:61:0x0109, B:65:0x0111, B:66:0x0116, B:73:0x002f, B:76:0x0049, B:78:0x004d, B:80:0x0061, B:81:0x0055), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc A[Catch: all -> 0x0028, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0014, B:10:0x007d, B:11:0x0082, B:13:0x0088, B:15:0x0090, B:16:0x009a, B:18:0x00ab, B:23:0x00b5, B:27:0x00bd, B:28:0x00c6, B:30:0x00cc, B:33:0x00d9, B:36:0x00e0, B:38:0x00ea, B:41:0x00f1, B:55:0x00f7, B:57:0x00ff, B:61:0x0109, B:65:0x0111, B:66:0x0116, B:73:0x002f, B:76:0x0049, B:78:0x004d, B:80:0x0061, B:81:0x0055), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0014, B:10:0x007d, B:11:0x0082, B:13:0x0088, B:15:0x0090, B:16:0x009a, B:18:0x00ab, B:23:0x00b5, B:27:0x00bd, B:28:0x00c6, B:30:0x00cc, B:33:0x00d9, B:36:0x00e0, B:38:0x00ea, B:41:0x00f1, B:55:0x00f7, B:57:0x00ff, B:61:0x0109, B:65:0x0111, B:66:0x0116, B:73:0x002f, B:76:0x0049, B:78:0x004d, B:80:0x0061, B:81:0x0055), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void o() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.V2.d.o():void");
    }

    public void p(Bookmark bookmark) {
        r(bookmark);
        q(bookmark);
    }

    public boolean q(Bookmark bookmark) {
        boolean z;
        synchronized (this.c) {
            try {
                Iterator<Bookmark> it = this.c.iterator();
                z = false;
                while (it.hasNext()) {
                    Bookmark next = it.next();
                    if (next != null && next.D(bookmark)) {
                        it.remove();
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            d();
        }
        return z;
    }

    public boolean r(Bookmark bookmark) {
        int g = g(bookmark);
        if (g < 0) {
            return false;
        }
        this.b.remove(g);
        d();
        return true;
    }

    public boolean s(ax.Q2.f fVar, int i) {
        int f = f(fVar, i);
        if (f < 0) {
            return false;
        }
        this.b.remove(f);
        d();
        return true;
    }

    public void t(b bVar) {
        this.g.remove(bVar);
    }

    public void u() {
        String J;
        String J2;
        try {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("last_visited", 0).edit();
            synchronized (this.b) {
                J = Bookmark.J(j());
            }
            edit.putString("LAST_VISITED_BOOKMARKS", J);
            synchronized (this.c) {
                J2 = Bookmark.J(this.c);
            }
            edit.putString("ACTION_HISTORY_BOOKMARKS", J2);
            edit.apply();
        } catch (NoSuchFieldError e) {
            ax.Ha.c.h().f().d("Bookmark gson error").l(e).h();
        }
    }
}
