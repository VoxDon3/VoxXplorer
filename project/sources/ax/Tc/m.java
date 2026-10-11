package ax.Tc;

/* loaded from: classes3.dex */
public class m extends b {
    public m(ax.Sc.f fVar) {
        super("(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+((\\S+\\s*)+)?");
        f(fVar);
    }

    private boolean k(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:3|(1:64)(1:7)|8|(2:9|10)|11|(2:13|(1:34)(1:17))(10:35|(2:37|(1:42)(1:41))(3:43|(1:(1:49))(2:50|(2:52|(1:59)(1:60))(1:61))|48)|19|20|21|22|(1:24)|(1:28)|29|30)|18|19|20|21|22|(0)|(2:26|28)|29|30) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    @Override // ax.Sc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.Sc.i c(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Tc.m.c(java.lang.String):ax.Sc.i");
    }

    @Override // ax.Tc.b
    protected ax.Sc.f i() {
        return new ax.Sc.f("OS/400", "yy/MM/dd HH:mm:ss", null);
    }
}
