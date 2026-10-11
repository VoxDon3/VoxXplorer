package ax.p4;

/* renamed from: ax.p4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2769f extends C2773j {
    private final s c0;

    public C2769f(String str, s sVar, String str2) {
        super(str, str2);
        this.c0 = sVar;
    }

    protected static String a(String str, s sVar, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception in ");
        sb.append(str);
        if (obj != null) {
            sb.append(": ");
            sb.append(obj);
        }
        if (sVar != null) {
            sb.append(" (user message: ");
            sb.append(sVar);
            sb.append(")");
        }
        return sb.toString();
    }

    public s b() {
        return this.c0;
    }
}
