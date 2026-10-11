package ax.xc;

import ax.tb.AbstractC3127c;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class s extends AbstractC3127c<h> implements RandomAccess {
    public static final a e0 = new a(null);
    private final h[] c0;
    private final int[] d0;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private final void a(long j, C3487e c3487e, int i, List<? extends h> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            long j2;
            int i7 = i;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (list.get(i8).G() < i7) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = list.get(i2);
            h hVar2 = list.get(i3 - 1);
            if (i7 == hVar.G()) {
                int intValue = list2.get(i2).intValue();
                int i9 = i2 + 1;
                h hVar3 = list.get(i9);
                i4 = i9;
                i5 = intValue;
                hVar = hVar3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (hVar.n(i7) == hVar2.n(i7)) {
                int min = Math.min(hVar.G(), hVar2.G());
                int i10 = 0;
                for (int i11 = i7; i11 < min && hVar.n(i11) == hVar2.n(i11); i11++) {
                    i10++;
                }
                long c = j + c(c3487e) + 2 + i10 + 1;
                c3487e.writeInt(-i10);
                c3487e.writeInt(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    c3487e.writeInt(hVar.n(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 != list.get(i4).G()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c3487e.writeInt(list2.get(i4).intValue());
                    return;
                } else {
                    C3487e c3487e2 = new C3487e();
                    c3487e.writeInt(((int) (c(c3487e2) + c)) * (-1));
                    a(c, c3487e2, i12, list, i4, i3, list2);
                    c3487e.M(c3487e2);
                    return;
                }
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (list.get(i14 - 1).n(i7) != list.get(i14).n(i7)) {
                    i13++;
                }
            }
            long c2 = j + c(c3487e) + 2 + (i13 * 2);
            c3487e.writeInt(i13);
            c3487e.writeInt(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                byte n = list.get(i15).n(i7);
                if (i15 == i4 || n != list.get(i15 - 1).n(i7)) {
                    c3487e.writeInt(n & 255);
                }
            }
            C3487e c3487e3 = new C3487e();
            while (i4 < i3) {
                byte n2 = list.get(i4).n(i7);
                int i16 = i4 + 1;
                int i17 = i16;
                while (true) {
                    if (i17 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (n2 != list.get(i17).n(i7)) {
                            i6 = i17;
                            break;
                        }
                        i17++;
                    }
                }
                if (i16 == i6 && i7 + 1 == list.get(i4).G()) {
                    c3487e.writeInt(list2.get(i4).intValue());
                    j2 = c2;
                } else {
                    c3487e.writeInt(((int) (c(c3487e3) + c2)) * (-1));
                    j2 = c2;
                    a(j2, c3487e3, i7 + 1, list, i4, i6, list2);
                }
                c2 = j2;
                i4 = i6;
            }
            c3487e.M(c3487e3);
        }

        static /* synthetic */ void b(a aVar, long j, C3487e c3487e, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                j = 0;
            }
            aVar.a(j, c3487e, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final long c(C3487e c3487e) {
            return c3487e.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final ax.xc.s d(ax.xc.h... r17) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.xc.s.a.d(ax.xc.h[]):ax.xc.s");
        }

        private a() {
        }
    }

    public /* synthetic */ s(h[] hVarArr, int[] iArr, ax.Gb.g gVar) {
        this(hVarArr, iArr);
    }

    @Override // ax.tb.AbstractC3126b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return k((h) obj);
        }
        return false;
    }

    @Override // ax.tb.AbstractC3126b
    public int g() {
        return this.c0.length;
    }

    @Override // ax.tb.AbstractC3127c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return q((h) obj);
        }
        return -1;
    }

    public /* bridge */ boolean k(h hVar) {
        return super.contains(hVar);
    }

    @Override // ax.tb.AbstractC3127c, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public h get(int i) {
        return this.c0[i];
    }

    @Override // ax.tb.AbstractC3127c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return r((h) obj);
        }
        return -1;
    }

    public final h[] n() {
        return this.c0;
    }

    public final int[] p() {
        return this.d0;
    }

    public /* bridge */ int q(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int r(h hVar) {
        return super.lastIndexOf(hVar);
    }

    private s(h[] hVarArr, int[] iArr) {
        this.c0 = hVarArr;
        this.d0 = iArr;
    }
}
