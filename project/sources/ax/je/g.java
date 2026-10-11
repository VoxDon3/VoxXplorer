package ax.je;

/* loaded from: classes3.dex */
public final class g implements f {
    private static final boolean[] d = {true, true, true, false, true, false, false, false};
    private static final int[] e = {0, 1, 2, 2, 3, 3, 3, 3};
    private final boolean a;
    private int b;
    private int c = 0;

    public g(boolean z, int i) {
        this.a = z;
        this.b = i + 5;
    }

    private static boolean b(byte b) {
        int i = b & 255;
        return i == 0 || i == 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x003c, code lost:
    
        if (b(r11[(r1 + 4) - ax.je.g.e[r0]]) != false) goto L17;
     */
    @Override // ax.je.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(byte[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.je.g.a(byte[], int, int):int");
    }
}
