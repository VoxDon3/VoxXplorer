/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.content.Context;
import ax.Z2.f;
import com.voxdon.xplorer.bookmark.Bookmark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class l {
    private Context a;
    private List<Bookmark> b;
    private List<f> c;
    private List<a> d;

    public l(Context context) {
        this.a = context;
        this.b = new ArrayList<Bookmark>();
        this.c = new ArrayList<f>();
        this.d = new ArrayList<a>();
    }

    private void b() {
        Iterator<a> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }

    public int a(Bookmark bookmark, f f8) {
        int n8;
        if (bookmark.v() == null || bookmark.v().length() == 0) {
            bookmark.F(bookmark.u().f(this.a));
        }
        if ((n8 = this.c(bookmark.s(), bookmark.t())) >= 0) {
            this.b();
            this.b.set(n8, bookmark);
            return n8;
        }
        if (this.b.size() >= 15) {
            List<Bookmark> list = this.b;
            list.remove(list.size() - 1);
        }
        this.b.add(bookmark);
        this.c.add(f8);
        this.b();
        return this.b.indexOf(bookmark);
    }

    public int c(ax.Q2.f f8, int n8) {
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            Bookmark bookmark = this.b.get(i8);
            if (bookmark.s() != f8 || bookmark.t() != n8) continue;
            return i8;
        }
        return -1;
    }

    public Bookmark d(int n8) {
        return this.b.get(n8);
    }

    public ArrayList<Bookmark> e() {
        return (ArrayList)this.b;
    }

    public f f(int n8) {
        return this.c.get(n8);
    }

    public ArrayList<f> g() {
        return (ArrayList)this.c;
    }

    public void h(ax.Q2.f f8, int n8) {
        int n9;
        block3: {
            for (n9 = 0; n9 < this.b.size(); ++n9) {
                Bookmark bookmark = this.b.get(n9);
                if (f8 != bookmark.s() || n8 != bookmark.t()) {
                    continue;
                }
                break block3;
            }
            n9 = -1;
        }
        if (n9 >= 0) {
            this.b.remove(n9);
            this.c.remove(n9);
            this.b();
        }
    }

    public void i(ArrayList<Bookmark> arrayList) {
        this.b = arrayList;
        this.b();
    }

    public void j(ArrayList<f> arrayList) {
        this.c = arrayList;
        this.b();
    }

    public void k(ax.Q2.f f8, int n8, String string) {
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            Bookmark bookmark = this.b.get(i8);
            if (f8 != bookmark.s() || n8 != bookmark.t()) continue;
            bookmark.G(string);
            break;
        }
        this.b();
    }

    public void l(ax.Q2.f f8, int n8) {
        this.b();
    }

    public static interface a {
        public void a();
    }
}

