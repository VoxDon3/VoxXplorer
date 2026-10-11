package ax.Sc;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ax.Sc.g, still in use, count: 1, list:
  (r0v0 ax.Sc.g) from 0x01e7: SPUT (r0v0 ax.Sc.g) (LINE:488) ax.Sc.g.Q0 ax.Sc.g
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class g {
    ABOR,
    ACCT,
    ALLO,
    APPE,
    CDUP,
    CWD,
    DELE,
    EPRT,
    EPSV,
    FEAT,
    HELP,
    LIST,
    MDTM,
    MFMT,
    MKD,
    MLSD,
    MLST,
    MODE,
    NLST,
    NOOP,
    PASS,
    PASV,
    PORT,
    PWD,
    QUIT,
    REIN,
    REST,
    RETR,
    RMD,
    RNFR,
    RNTO,
    SITE,
    SIZE,
    SMNT,
    STAT,
    STOR,
    STOU,
    STRU,
    SYST,
    TYPE,
    USER;

    public static final g Q0;
    public static final g R0;
    public static final g S0;
    public static final g T0;
    public static final g U0;
    public static final g V0;
    public static final g W0;
    public static final g X0;
    public static final g Y0;
    public static final g Z0;
    public static final g a1;
    public static final g b1;
    public static final g c1;
    public static final g d1;
    public static final g e1;
    public static final g f1;
    public static final g g1;
    public static final g h1;
    public static final g i1;
    public static final g j1;
    public static final g k1;
    public static final g l1;
    public static final g m1;
    public static final g n1;
    public static final g o1;
    public static final g p1;
    public static final g q1;
    public static final g r1;
    public static final g s1;
    public static final g t1;
    public static final g u1;
    public static final g v1;
    public static final g w1;
    public static final g x1;

    static {
        g gVar = MDTM;
        Q0 = new g();
        R0 = new g();
        S0 = new g();
        T0 = new g();
        U0 = new g();
        V0 = new g();
        W0 = new g();
        X0 = new g();
        Y0 = new g();
        Z0 = new g();
        a1 = gVar;
        b1 = new g();
        c1 = new g();
        d1 = gVar;
        e1 = new g();
        f1 = new g();
        g1 = new g();
        h1 = new g();
        i1 = new g();
        j1 = new g();
        k1 = new g();
        l1 = new g();
        m1 = new g();
        n1 = new g();
        o1 = new g();
        p1 = new g();
        q1 = new g();
        r1 = new g();
        s1 = new g();
        t1 = new g();
        u1 = new g();
        v1 = new g();
        w1 = new g();
        x1 = new g();
    }

    private g() {
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) y1.clone();
    }

    public final String h() {
        return name();
    }
}
