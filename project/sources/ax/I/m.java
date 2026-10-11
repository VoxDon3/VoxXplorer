package ax.I;

import java.util.ArrayList;

/* loaded from: classes.dex */
class m {
    public static int h;
    p c;
    p d;
    int f;
    int g;
    public int a = 0;
    public boolean b = false;
    ArrayList<p> e = new ArrayList<>();

    public m(p pVar, int i) {
        this.c = null;
        this.d = null;
        int i2 = h;
        this.f = i2;
        h = i2 + 1;
        this.c = pVar;
        this.d = pVar;
        this.g = i;
    }

    private long c(f fVar, long j) {
        p pVar = fVar.d;
        if (pVar instanceof k) {
            return j;
        }
        int size = fVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != pVar) {
                    j2 = Math.min(j2, c(fVar2, fVar2.f + j));
                }
            }
        }
        if (fVar != pVar.i) {
            return j2;
        }
        long j3 = j - pVar.j();
        return Math.min(Math.min(j2, c(pVar.h, j3)), j3 - pVar.h.f);
    }

    private long d(f fVar, long j) {
        p pVar = fVar.d;
        if (pVar instanceof k) {
            return j;
        }
        int size = fVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != pVar) {
                    j2 = Math.max(j2, d(fVar2, fVar2.f + j));
                }
            }
        }
        if (fVar != pVar.h) {
            return j2;
        }
        long j3 = j + pVar.j();
        return Math.max(Math.max(j2, d(pVar.i, j3)), j3 - pVar.i.f);
    }

    public void a(p pVar) {
        this.e.add(pVar);
        this.d = pVar;
    }

    public long b(ax.H.f fVar, int i) {
        long j;
        int i2;
        p pVar = this.c;
        if (pVar instanceof c) {
            if (((c) pVar).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i == 0 ? fVar.e : fVar.f).h;
        f fVar3 = (i == 0 ? fVar.e : fVar.f).i;
        boolean contains = pVar.h.l.contains(fVar2);
        boolean contains2 = this.c.i.l.contains(fVar3);
        long j2 = this.c.j();
        if (contains && contains2) {
            long d = d(this.c.h, 0L);
            long c = c(this.c.i, 0L);
            long j3 = d - j2;
            p pVar2 = this.c;
            int i3 = pVar2.i.f;
            if (j3 >= (-i3)) {
                j3 += i3;
            }
            int i4 = pVar2.h.f;
            long j4 = ((-c) - j2) - i4;
            if (j4 >= i4) {
                j4 -= i4;
            }
            float q = pVar2.b.q(i);
            float f = q > 0.0f ? (long) ((j4 / q) + (j3 / (1.0f - q))) : 0L;
            long j5 = ((long) ((f * q) + 0.5f)) + j2 + ((long) ((f * (1.0f - q)) + 0.5f));
            j = r13.h.f + j5;
            i2 = this.c.i.f;
        } else {
            if (contains) {
                return Math.max(d(this.c.h, r13.f), this.c.h.f + j2);
            }
            if (contains2) {
                return Math.max(-c(this.c.i, r13.f), (-this.c.i.f) + j2);
            }
            j = r13.h.f + this.c.j();
            i2 = this.c.i.f;
        }
        return j - i2;
    }
}
