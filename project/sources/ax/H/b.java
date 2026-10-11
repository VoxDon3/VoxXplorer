package ax.H;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0035, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0047, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0494 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b2  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [ax.H.e] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r4v44, types: [ax.H.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(ax.H.f r37, ax.E.d r38, int r39, int r40, ax.H.c r41) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.H.b.a(ax.H.f, ax.E.d, int, int, ax.H.c):void");
    }

    public static void b(f fVar, ax.E.d dVar, ArrayList<e> arrayList, int i) {
        int i2;
        c[] cVarArr;
        int i3;
        if (i == 0) {
            i2 = fVar.W0;
            cVarArr = fVar.Z0;
            i3 = 0;
        } else {
            i2 = fVar.X0;
            cVarArr = fVar.Y0;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            c cVar = cVarArr[i4];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.a)) {
                a(fVar, dVar, i, i3, cVar);
            }
        }
    }
}
