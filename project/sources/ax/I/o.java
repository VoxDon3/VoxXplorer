package ax.I;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o {
    static int g;
    int b;
    int d;
    ArrayList<ax.H.e> a = new ArrayList<>();
    boolean c = false;
    ArrayList<a> e = null;
    private int f = -1;

    class a {
        WeakReference<ax.H.e> a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        public a(ax.H.e eVar, ax.E.d dVar, int i) {
            this.a = new WeakReference<>(eVar);
            this.b = dVar.x(eVar.O);
            this.c = dVar.x(eVar.P);
            this.d = dVar.x(eVar.Q);
            this.e = dVar.x(eVar.R);
            this.f = dVar.x(eVar.S);
            this.g = i;
        }
    }

    public o(int i) {
        int i2 = g;
        g = i2 + 1;
        this.b = i2;
        this.d = i;
    }

    private String e() {
        int i = this.d;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    private int j(ax.E.d dVar, ArrayList<ax.H.e> arrayList, int i) {
        int x;
        int x2;
        ax.H.f fVar = (ax.H.f) arrayList.get(0).K();
        dVar.D();
        fVar.g(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).g(dVar, false);
        }
        if (i == 0 && fVar.W0 > 0) {
            ax.H.b.b(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.X0 > 0) {
            ax.H.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new a(arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            x = dVar.x(fVar.O);
            x2 = dVar.x(fVar.Q);
            dVar.D();
        } else {
            x = dVar.x(fVar.P);
            x2 = dVar.x(fVar.R);
            dVar.D();
        }
        return x2 - x;
    }

    public boolean a(ax.H.e eVar) {
        if (this.a.contains(eVar)) {
            return false;
        }
        this.a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.a.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = arrayList.get(i);
                if (this.f == oVar.b) {
                    g(this.d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public int f(ax.E.d dVar, int i) {
        if (this.a.size() == 0) {
            return 0;
        }
        return j(dVar, this.a, i);
    }

    public void g(int i, o oVar) {
        ArrayList<ax.H.e> arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            ax.H.e eVar = arrayList.get(i2);
            i2++;
            ax.H.e eVar2 = eVar;
            oVar.a(eVar2);
            if (i == 0) {
                eVar2.I0 = oVar.c();
            } else {
                eVar2.J0 = oVar.c();
            }
        }
        this.f = oVar.b;
    }

    public void h(boolean z) {
        this.c = z;
    }

    public void i(int i) {
        this.d = i;
    }

    public String toString() {
        String str = e() + " [" + this.b + "] <";
        ArrayList<ax.H.e> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ax.H.e eVar = arrayList.get(i);
            i++;
            str = str + " " + eVar.t();
        }
        return str + " >";
    }
}
