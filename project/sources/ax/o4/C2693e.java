package ax.o4;

/* renamed from: ax.o4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2693e {
    public static final C2693e c = new C2693e(null, null);
    public static final C2693e d = new C2693e(a.none, null);
    public static final C2693e e;
    public static final C2693e f;
    public static final C2693e g;
    public static final C2693e h;
    public static final C2693e i;
    public static final C2693e j;
    public static final C2693e k;
    private a a;
    private b b;

    /* renamed from: ax.o4.e$a */
    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    /* renamed from: ax.o4.e$b */
    public enum b {
        meet,
        slice
    }

    static {
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        e = new C2693e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        f = new C2693e(aVar2, bVar);
        g = new C2693e(a.xMaxYMax, bVar);
        h = new C2693e(a.xMidYMin, bVar);
        i = new C2693e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        j = new C2693e(aVar, bVar2);
        k = new C2693e(aVar2, bVar2);
    }

    C2693e(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public a a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2693e c2693e = (C2693e) obj;
        return this.a == c2693e.a && this.b == c2693e.b;
    }

    public String toString() {
        return this.a + " " + this.b;
    }
}
