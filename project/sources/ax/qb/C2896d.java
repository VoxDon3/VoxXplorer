package ax.qb;

/* renamed from: ax.qb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2896d {
    private static final String a;
    private static final int b;
    private static final char[] c;
    public static final char[] d;

    static {
        String property = System.getProperty("line.separator");
        a = property;
        b = property.length();
        c = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[EDGE_INSN: B:18:0x0064->B:19:0x0064 BREAK  A[LOOP:1: B:9:0x0027->B:25:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:1: B:9:0x0027->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.io.PrintStream r11, byte[] r12, int r13, int r14) {
        /*
            if (r14 != 0) goto L3
            return
        L3:
            int r0 = r14 % 16
            int r1 = r14 / 16
            if (r0 != 0) goto La
            goto Lc
        La:
            int r1 = r1 + 1
        Lc:
            int r2 = ax.qb.C2896d.b
            int r2 = r2 + 74
            int r1 = r1 * r2
            char[] r1 = new char[r1]
            r2 = 16
            char[] r3 = new char[r2]
            r4 = 0
            r5 = 0
            r6 = 0
        L1b:
            r7 = 5
            b(r5, r1, r6, r7)
            int r7 = r6 + 5
            int r6 = r6 + 6
            r8 = 58
            r1[r7] = r8
        L27:
            r7 = 32
            if (r5 != r14) goto L39
            int r8 = 16 - r0
            char[] r9 = ax.qb.C2896d.c
            int r10 = r8 * 3
            java.lang.System.arraycopy(r9, r4, r1, r6, r10)
            int r6 = r6 + r10
            java.lang.System.arraycopy(r9, r4, r3, r0, r8)
            goto L64
        L39:
            int r8 = r6 + 1
            r1[r6] = r7
            int r9 = r13 + r5
            r9 = r12[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 2
            b(r9, r1, r8, r10)
            int r6 = r6 + 3
            if (r9 < 0) goto L58
            char r8 = (char) r9
            boolean r9 = java.lang.Character.isISOControl(r8)
            if (r9 == 0) goto L53
            goto L58
        L53:
            int r9 = r5 % 16
            r3[r9] = r8
            goto L5e
        L58:
            int r8 = r5 % 16
            r9 = 46
            r3[r8] = r9
        L5e:
            int r5 = r5 + 1
            int r8 = r5 % 16
            if (r8 != 0) goto L27
        L64:
            int r8 = r6 + 1
            r1[r6] = r7
            int r9 = r6 + 2
            r1[r8] = r7
            int r7 = r6 + 3
            r8 = 124(0x7c, float:1.74E-43)
            r1[r9] = r8
            java.lang.System.arraycopy(r3, r4, r1, r7, r2)
            int r7 = r6 + 19
            int r6 = r6 + 20
            r1[r7] = r8
            java.lang.String r7 = ax.qb.C2896d.a
            int r8 = ax.qb.C2896d.b
            r7.getChars(r4, r8, r1, r6)
            int r6 = r6 + r8
            if (r5 < r14) goto L1b
            r11.println(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.qb.C2896d.a(java.io.PrintStream, byte[], int, int):void");
    }

    public static void b(int i, char[] cArr, int i2, int i3) {
        while (i3 > 0) {
            int i4 = (i2 + i3) - 1;
            if (i4 < cArr.length) {
                cArr[i4] = d[i & 15];
            }
            if (i != 0) {
                i >>>= 4;
            }
            i3--;
        }
    }

    public static String c(int i, int i2) {
        char[] cArr = new char[i2];
        b(i, cArr, 0, i2);
        return new String(cArr);
    }

    public static String d(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2];
        int i3 = i2 % 2 == 0 ? i2 / 2 : (i2 / 2) + 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i4 + 1;
            char[] cArr2 = d;
            byte b2 = bArr[i5];
            cArr[i4] = cArr2[(b2 >> 4) & 15];
            if (i6 == i2) {
                break;
            }
            i4 += 2;
            cArr[i6] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }
}
