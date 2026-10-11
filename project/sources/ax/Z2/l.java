package ax.Z2;

import android.content.Context;
import com.voxdon.xplorer.bookmark.Bookmark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class l {
    private Context a;
    private List<Bookmark> b = new ArrayList();
    private List<f> c = new ArrayList();
    private List<a> d = new ArrayList();

    public interface a {
        void a();
    }

    public l(Context context) {
        this.a = context;
    }

    private void b() {
        Iterator<a> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public int a(Bookmark bookmark, f fVar) {
        if (bookmark.v() == null || bookmark.v().length() == 0) {
            bookmark.F(bookmark.u().f(this.a));
        }
        int c = c(bookmark.s(), bookmark.t());
        if (c >= 0) {
            b();
            this.b.set(c, bookmark);
            return c;
        }
        if (this.b.size() >= 15) {
            this.b.remove(r0.size() - 1);
        }
        this.b.add(bookmark);
        this.c.add(fVar);
        b();
        return this.b.indexOf(bookmark);
    }

    public int c(ax.Q2.f fVar, int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            Bookmark bookmark = this.b.get(i2);
            if (bookmark.s() == fVar && bookmark.t() == i) {
                return i2;
            }
        }
        return -1;
    }

    public Bookmark d(int i) {
        return this.b.get(i);
    }

    public ArrayList<Bookmark> e() {
        return (ArrayList) this.b;
    }

    public f f(int i) {
        return this.c.get(i);
    }

    public ArrayList<f> g() {
        return (ArrayList) this.c;
    }

    public void h(ax.Q2.f fVar, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.b.size()) {
                i2 = -1;
                break;
            }
            Bookmark bookmark = this.b.get(i2);
            if (fVar == bookmark.s() && i == bookmark.t()) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            this.b.remove(i2);
            this.c.remove(i2);
            b();
        }
    }

    public void i(ArrayList<Bookmark> arrayList) {
        this.b = arrayList;
        b();
    }

    public void j(ArrayList<f> arrayList) {
        this.c = arrayList;
        b();
    }

    public void k(ax.Q2.f fVar, int i, String str) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.b.size()) {
                break;
            }
            Bookmark bookmark = this.b.get(i2);
            if (fVar == bookmark.s() && i == bookmark.t()) {
                bookmark.G(str);
                break;
            }
            i2++;
        }
        b();
    }

    public void l(ax.Q2.f fVar, int i) {
        b();
    }
}
