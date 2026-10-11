package ax.H;

import ax.E.i;
import ax.I.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    private int b;
    private boolean c;
    public final e d;
    public final b e;
    public d f;
    ax.E.i i;
    private HashSet<d> a = null;
    public int g = 0;
    int h = Integer.MIN_VALUE;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.d = eVar;
        this.e = bVar;
    }

    public boolean a(d dVar, int i) {
        return b(dVar, i, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z && !p(dVar)) {
            return false;
        }
        this.f = dVar;
        if (dVar.a == null) {
            dVar.a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public void c(int i, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                ax.I.i.a(it.next().d, i, arrayList, oVar);
            }
        }
    }

    public HashSet<d> d() {
        return this.a;
    }

    public int e() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.d.V() == 8) {
            return 0;
        }
        return (this.h == Integer.MIN_VALUE || (dVar = this.f) == null || dVar.d.V() != 8) ? this.g : this.h;
    }

    public final d g() {
        switch (a.a[this.e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.d.Q;
            case 3:
                return this.d.O;
            case 4:
                return this.d.R;
            case 5:
                return this.d.P;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public e h() {
        return this.d;
    }

    public ax.E.i i() {
        return this.i;
    }

    public d j() {
        return this.f;
    }

    public b k() {
        return this.e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<d> hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        b k = dVar.k();
        b bVar = this.e;
        if (k == bVar) {
            return bVar != b.BASELINE || (dVar.h().Z() && h().Z());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (k == b.BASELINE || k == b.CENTER_X || k == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = k == b.LEFT || k == b.RIGHT;
                return dVar.h() instanceof h ? z || k == b.CENTER_X : z;
            case 4:
            case 5:
                boolean z2 = k == b.TOP || k == b.BOTTOM;
                return dVar.h() instanceof h ? z2 || k == b.CENTER_Y : z2;
            case 6:
                return (k == b.LEFT || k == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public void q() {
        HashSet<d> hashSet;
        d dVar = this.f;
        if (dVar != null && (hashSet = dVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public void r() {
        this.c = false;
        this.b = 0;
    }

    public void s(ax.E.c cVar) {
        ax.E.i iVar = this.i;
        if (iVar == null) {
            this.i = new ax.E.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.n();
        }
    }

    public void t(int i) {
        this.b = i;
        this.c = true;
    }

    public String toString() {
        return this.d.t() + ":" + this.e.toString();
    }

    public void u(int i) {
        if (o()) {
            this.h = i;
        }
    }
}
