package ax.I;

import ax.H.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i {
    public static o a(ax.H.e eVar, int i, ArrayList<o> arrayList, o oVar) {
        int s1;
        int i2 = i == 0 ? eVar.I0 : eVar.J0;
        if (i2 != -1 && (oVar == null || i2 != oVar.b)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i3);
                if (oVar2.c() == i2) {
                    if (oVar != null) {
                        oVar.g(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof ax.H.j) && (s1 = ((ax.H.j) eVar).s1(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i4);
                    if (oVar3.c() == s1) {
                        oVar = oVar3;
                        break;
                    }
                    i4++;
                }
            }
            if (oVar == null) {
                oVar = new o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof ax.H.h) {
                ax.H.h hVar = (ax.H.h) eVar;
                hVar.r1().c(hVar.s1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i == 0) {
                eVar.I0 = oVar.c();
                eVar.O.c(i, arrayList, oVar);
                eVar.Q.c(i, arrayList, oVar);
            } else {
                eVar.J0 = oVar.c();
                eVar.P.c(i, arrayList, oVar);
                eVar.S.c(i, arrayList, oVar);
                eVar.R.c(i, arrayList, oVar);
            }
            eVar.V.c(i, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = arrayList.get(i2);
            if (i == oVar.b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0387 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0383  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(ax.H.f r17, ax.I.b.InterfaceC0089b r18) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.I.i.c(ax.H.f, ax.I.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
