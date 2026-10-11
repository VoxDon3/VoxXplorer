/*
 * Decompiled with CFR 0.152.
 */
package ax.V2;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.widget.Toast;
import ax.Ha.c;
import ax.Q2.f;
import ax.Z2.s;
import ax.t3.j;
import ax.t3.k;
import com.alphainventor.filemanager.bookmark.Bookmark;
import com.alphainventor.filemanager.bookmark.BookmarkProvider;
import com.alphainventor.filemanager.file.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class d {
    static Comparator<Bookmark> h = new Comparator<Bookmark>(){

        public int a(Bookmark bookmark, Bookmark bookmark2) {
            if (bookmark.y() == -5L && bookmark2.y() != -5L) {
                return -1;
            }
            if (bookmark.y() == -5L && bookmark2.y() == -5L) {
                return 0;
            }
            if (bookmark.y() != -5L && bookmark2.y() == -5L) {
                return 1;
            }
            if (bookmark.y() > bookmark2.y()) {
                return -1;
            }
            if (bookmark.y() < bookmark2.y()) {
                return 1;
            }
            return 0;
        }
    };
    private Context a;
    private final List<Bookmark> b;
    private final List<Bookmark> c;
    private Set<f> d;
    private Set<f> e;
    private Set<f> f;
    private final List<b> g;

    public d(Context context) {
        this.a = context;
        this.b = java.util.DesugarCollections.synchronizedList(new ArrayList());
        this.c = java.util.DesugarCollections.synchronizedList(new LinkedList());
        this.g = java.util.DesugarCollections.synchronizedList(new ArrayList());
        this.k();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d() {
        List<b> list = this.g;
        synchronized (list) {
            try {
                Iterator<b> iterator = this.g.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    iterator.next().a();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private boolean e(Bookmark bookmark) {
        List<s> list = bookmark.s().J() == ax.Q2.f.G0 ? T.e(this.a) : T.c(this.a);
        list = list.iterator();
        while (list.hasNext()) {
            if (!((s)list.next()).e().equals(bookmark.u())) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int f(f f8, int n8) {
        List<Bookmark> list = this.b;
        synchronized (list) {
            Throwable throwable2;
            block6: {
                int n9 = 0;
                while (true) {
                    try {
                        if (n9 >= this.b.size()) break;
                        if (this.b.get(n9).B(f8, n8)) {
                            return n9;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    ++n9;
                }
                return -1;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int g(Bookmark bookmark) {
        List<Bookmark> list = this.b;
        synchronized (list) {
            Throwable throwable2;
            block6: {
                int n8 = 0;
                while (true) {
                    try {
                        if (n8 >= this.b.size()) break;
                        if (this.b.get(n8).C(bookmark)) {
                            return n8;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    ++n8;
                }
                return -1;
            }
            throw throwable2;
        }
    }

    private static boolean l(Bookmark bookmark) {
        return bookmark.y() > 0L && bookmark.y() < System.currentTimeMillis() - 259200000L;
    }

    private static boolean m(Bookmark bookmark, Bookmark bookmark2) {
        return bookmark.s() == bookmark2.s() && bookmark.x() != null && bookmark.x().equals(bookmark2.x());
    }

    private boolean n(Bookmark bookmark) {
        return ax.Q2.f.r0(bookmark.u(), false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void v() {
        List<Bookmark> list = this.b;
        synchronized (list) {
            Collections.sort(this.b, h);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(Bookmark list) {
        // MONITORENTER : this
        List<Bookmark> list2 = this.c;
        // MONITORENTER : list2
        Iterator<Bookmark> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            if (!ax.V2.d.m(iterator.next(), list)) continue;
            iterator.remove();
        }
        this.c.add(0, (Bookmark)((Object)list));
        if (this.c.size() >= 10) {
            list = this.c;
            list.remove(list.size() - 1);
        }
        this.d();
        // MONITOREXIT : this
    }

    public void b(b b8) {
        this.g.add(b8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(Bookmark bookmark) {
        synchronized (this) {
            if (bookmark != null) {
                Throwable throwable2;
                block14: {
                    Bookmark bookmark2;
                    int n8;
                    try {
                        if (!this.d.contains((Object)bookmark.s())) {
                            n8 = this.g(bookmark);
                            bookmark2 = n8 >= 0 ? this.b.get(n8) : null;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block14;
                    }
                    k.a a8 = j.c(this.a);
                    Object object = k.a.c0;
                    boolean bl = true;
                    boolean bl2 = false;
                    if (!(a8 != object && a8 != k.a.q ? this.f.contains((Object)bookmark.s()) : this.e.contains((Object)bookmark.s()))) {
                        bl = false;
                    }
                    if (bookmark2 != null && bookmark2.y() == -5L) {
                        bl = bl2;
                    }
                    if (bl) {
                        object = bookmark.u().e();
                        if (object != null && ((String)object).equals(bookmark.w())) {
                            this.r(bookmark);
                            return;
                        }
                        if (object == null && bookmark.w() == null) {
                            this.r(bookmark);
                            return;
                        }
                    }
                    bookmark = Bookmark.k(bookmark);
                    if (n8 >= 0) {
                        if (bookmark2 != null && bookmark2.y() == -5L) {
                            bookmark.H(-5L);
                        }
                        this.b.set(n8, bookmark);
                    } else {
                        this.b.add(bookmark);
                    }
                    this.v();
                    this.d();
                    return;
                }
                throw throwable2;
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<Bookmark> h(int var1_1, int var2_2, boolean var3_3) {
        block23: {
            var7_4 = new ArrayList<Bookmark>();
            var8_7 = this.b;
            synchronized (var8_7) {
                block18: {
                    try {
                        var5_8 = Math.min(this.b.size(), var1_1);
                        var4_9 = 0;
lbl7:
                        // 2 sources

                        while (var4_9 < var5_8) {
                            var9_10 = this.b.get(var4_9);
                            if (ax.V2.d.l((Bookmark)var9_10) || !this.n((Bookmark)var9_10)) break block18;
                            var7_4.add((Bookmark)var9_10);
                            break block18;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var7_5) {
                        ** break block22
                    }
                }
                ++var4_9;
                ** GOTO lbl7
lbl-1000:
                // 1 sources

                {
                    // MONITOREXIT @DISABLED, blocks:[1, 7] lbl18 : MonitorExitStatement: MONITOREXIT : var8_7
                    var8_7 = this.c;
                }
            }
            synchronized (var8_7) {
                block19: {
                    block21: {
                        block25: {
                            block20: {
                                try {
                                    var6_11 = Math.min(this.c.size(), var1_1);
                                    var4_9 = 0;
lbl25:
                                    // 2 sources

                                    while (var4_9 < var6_11) {
                                        var11_13 = this.c.get(var4_9);
                                        if (ax.V2.d.l(var11_13) || !this.n(var11_13)) break block19;
                                        var10_12 = var11_13.s();
                                        var9_10 = var7_4.iterator();
                                        var5_8 = 0;
lbl31:
                                        // 5 sources

                                        while (var9_10.hasNext()) {
                                            var12_14 = (Bookmark)var9_10.next();
                                            if (var12_14.s() != var10_12) continue;
                                            if (var3_3 && var12_14.z() == 4 && "/".equals(var12_14.x())) {
                                                var9_10.remove();
                                                continue;
                                            }
                                            break block20;
                                        }
                                        break block21;
                                    }
                                    break block23;
                                }
                                catch (Throwable var7_6) {
                                    ** break block24
                                }
                            }
                            if (!ax.V2.d.m(var12_14, var11_13)) break block25;
                            if (var12_14.y() > var11_13.y()) break block19;
                            var9_10.remove();
                            ** GOTO lbl31
                        }
                        ++var5_8;
                        ** GOTO lbl31
                    }
                    if (var5_8 < var2_2) {
                        var7_4.add(var11_13);
                    }
                }
                ++var4_9;
                ** GOTO lbl25
            }
        }
        Collections.sort(var7_4, ax.V2.d.h);
        while (true) {
            if (var7_4.size() <= var1_1) {
                return var7_4;
            }
            var7_4.remove(var7_4.remove(var1_1));
        }
lbl-1000:
        // 1 sources

        {
            throw var7_6;
        }
lbl-1000:
        // 1 sources

        {
            throw var7_5;
        }
    }

    public int i() {
        return this.h(10, 10, false).size();
    }

    public List<Bookmark> j() {
        return this.b;
    }

    void k() {
        this.d = new HashSet<f>(ax.Q2.f.C());
        HashSet<f> hashSet = new HashSet<f>();
        this.e = hashSet;
        hashSet.add(ax.Q2.f.o0);
        this.e.add(ax.Q2.f.p0);
        this.e.add(ax.Q2.f.t0);
        this.f = new HashSet<f>();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void o() {
        synchronized (this) {
            block18: {
                block20: {
                    block15: {
                        block16: {
                            block19: {
                                block17: {
                                    try {
                                        var4_1 = this.a.getSharedPreferences("last_visited", 0);
                                        var1_2 = var4_1.getBoolean("INITIALIZED", false);
                                        if (var1_2) break block15;
                                        var2_3 /* !! */  = this.a.getContentResolver().query(BookmarkProvider.b, BookmarkProvider.c, "type = 4", null, "_id");
                                        break block16;
                                    }
                                    catch (Throwable var2_4) {
                                        break block18;
                                    }
                                    catch (SecurityException var2_5) {
                                    }
                                    catch (SQLiteException var2_6) {
                                        break block17;
                                    }
                                    ax.Ha.c.h().f().d("LastVisited Load Security Error").g(var2_5.getMessage()).h();
                                    break block19;
                                }
                                if (var2_6 instanceof SQLiteFullException || var2_6.getCause() instanceof SQLiteFullException) {
                                    Toast.makeText((Context)this.a, (int)2131952460, (int)1).show();
                                }
                                ax.Ha.c.h().f().d("LastVisited Load Error").g(var2_6.getMessage()).h();
                            }
                            var2_3 /* !! */  = null;
                        }
                        if (var2_3 /* !! */  != null) {
                            var3_7 = new ArrayList();
                            while (var2_3 /* !! */ .moveToNext()) {
                                var3_7.add(Bookmark.e(var2_3 /* !! */ ));
                            }
                            var2_3 /* !! */ .close();
                            ax.V2.b.e(this.a);
                            var2_3 /* !! */  = var3_7;
                        } else {
                            var2_3 /* !! */  = null;
                        }
                        var4_1.edit().putBoolean("INITIALIZED", true).apply();
                        break block20;
                    }
                    var2_3 /* !! */  = null;
                }
                var3_7 = var2_3 /* !! */ ;
                if (var2_3 /* !! */  != null) ** GOTO lbl-1000
                var2_3 /* !! */  = var4_1.getString("LAST_VISITED_BOOKMARKS", null);
                if (var2_3 /* !! */  != null) ** GOTO lbl-1000
                return;
lbl-1000:
                // 1 sources

                {
                    var2_3 /* !! */  = Bookmark.p((String)var2_3 /* !! */ );
                    var3_7 = var2_3 /* !! */ ;
                    if (var2_3 /* !! */  != null) ** GOTO lbl-1000
                }
                return;
lbl-1000:
                // 2 sources

                {
                    this.b.clear();
                    var3_7 = var3_7.iterator();
                    while (var3_7.hasNext()) {
                        var2_3 /* !! */  = (Bookmark)var3_7.next();
                        if (!this.n((Bookmark)var2_3 /* !! */ ) || ax.V2.d.l((Bookmark)var2_3 /* !! */ ) || ax.Q2.f.n0(var2_3 /* !! */ .s()) && !this.e((Bookmark)var2_3 /* !! */ )) continue;
                        this.b.add((Bookmark)var2_3 /* !! */ );
                    }
                    if (this.c.size() != 0) ** GOTO lbl66
                    var2_3 /* !! */  = var4_1.getString("ACTION_HISTORY_BOOKMARKS", null);
                    if (var2_3 /* !! */  != null) ** GOTO lbl-1000
                }
                return;
lbl-1000:
                // 1 sources

                {
                    if ((var2_3 /* !! */  = Bookmark.p((String)var2_3 /* !! */ )) != null) ** GOTO lbl-1000
                }
                return;
lbl-1000:
                // 1 sources

                {
                    this.c.addAll((Collection<Bookmark>)var2_3 /* !! */ );
lbl66:
                    // 2 sources

                    this.d();
                    return;
                }
            }
            throw var2_4;
        }
    }

    public void p(Bookmark bookmark) {
        this.r(bookmark);
        this.q(bookmark);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean q(Bookmark bookmark) {
        List<Bookmark> list = this.c;
        synchronized (list) {
            try {
                Iterator<Bookmark> iterator = this.c.iterator();
                boolean bl = false;
                while (iterator.hasNext()) {
                    Bookmark bookmark2 = iterator.next();
                    if (bookmark2 == null || !bookmark2.D(bookmark)) continue;
                    iterator.remove();
                    bl = true;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl12 : MonitorExitStatement: MONITOREXIT : var3_3
                if (bl) {
                    this.d();
                }
                return bl;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public boolean r(Bookmark bookmark) {
        int n8 = this.g(bookmark);
        if (n8 >= 0) {
            this.b.remove(n8);
            this.d();
            return true;
        }
        return false;
    }

    public boolean s(f f8, int n8) {
        if ((n8 = this.f(f8, n8)) >= 0) {
            this.b.remove(n8);
            this.d();
            return true;
        }
        return false;
    }

    public void t(b b8) {
        this.g.remove(b8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void u() {
        List<Bookmark> list;
        SharedPreferences.Editor editor;
        try {
            editor = this.a.getSharedPreferences("last_visited", 0).edit();
            list = this.b;
            // MONITORENTER : list
        }
        catch (NoSuchFieldError noSuchFieldError) {
            ax.Ha.c.h().f().d("Bookmark gson error").l(noSuchFieldError).h();
            return;
        }
        String string = Bookmark.J(this.j());
        // MONITOREXIT : list
        editor.putString("LAST_VISITED_BOOKMARKS", string);
        list = this.c;
        // MONITORENTER : list
        string = Bookmark.J(this.c);
        // MONITOREXIT : list
        editor.putString("ACTION_HISTORY_BOOKMARKS", string);
        editor.apply();
    }

    public static interface b {
        public void a();
    }
}

