package ax.za;

import ax.c9.e;
import ax.k9.C2415c;
import ax.r9.C3016b;
import ax.s9.i;
import ax.s9.m;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedList;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ax.za.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3562c {
    public static final EnumC3562c e0;
    public static final EnumC3562c f0;
    public static final EnumC3562c g0;
    public static final EnumC3562c h0;
    public static final EnumC3562c i0;
    public static final EnumC3562c j0;
    private static final /* synthetic */ EnumC3562c[] k0;
    private final ax.oa.b c0;
    private final ax.oa.b d0;
    private final String q;

    /* renamed from: ax.za.c$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ax.K8.a.values().length];
            a = iArr;
            try {
                iArr[ax.K8.a.STATUS_PIPE_NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        ax.oa.b bVar = ax.oa.b.WINREG_V1_0;
        ax.oa.b bVar2 = ax.oa.b.NDR_32BIT_V2;
        e0 = new EnumC3562c("WINREG", 0, "winreg", bVar, bVar2);
        ax.oa.b bVar3 = ax.oa.b.SRVSVC_V3_0;
        f0 = new EnumC3562c("SRVSVC", 1, "srvsvc", bVar3, bVar2);
        g0 = new EnumC3562c("LSASVC", 2, "lsarpc", ax.oa.b.LSASVC_V0_0, bVar2);
        h0 = new EnumC3562c("SAMSVC", 3, "samr", ax.oa.b.SAMSVC_V1_0, bVar2);
        i0 = new EnumC3562c("BROWSER_SRVSVC", 4, "browser", bVar3, bVar2);
        j0 = new EnumC3562c("SVCCTL", 5, "svcctl", ax.oa.b.SVCCTL_V2_0, bVar2);
        k0 = d();
    }

    private EnumC3562c(String str, int i, String str2, ax.oa.b bVar, ax.oa.b bVar2) {
        this.q = str2;
        this.c0 = bVar;
        this.d0 = bVar2;
    }

    private static /* synthetic */ EnumC3562c[] d() {
        return new EnumC3562c[]{e0, f0, g0, h0, i0, j0};
    }

    private ax.Ca.a j(C3016b c3016b, i iVar) throws IOException {
        LinkedList linkedList = new LinkedList();
        for (int i = -1; i < 1; i++) {
            try {
                return l(c3016b, iVar);
            } catch (ax.Ba.a e) {
                linkedList.offer(e);
                if (a.a[e.a().ordinal()] != 1) {
                    throw ((ax.Ba.a) linkedList.poll());
                }
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException();
                    interruptedIOException.addSuppressed(e2);
                    throw interruptedIOException;
                }
            }
        }
        if (!linkedList.isEmpty()) {
            throw ((ax.Ba.a) linkedList.poll());
        }
        throw new C2415c("Unknown error when opening pipe: " + iVar.f().toString());
    }

    private ax.Ca.a l(C3016b c3016b, i iVar) throws IOException {
        return new ax.Ca.a(c3016b, iVar, this.q);
    }

    public static EnumC3562c valueOf(String str) {
        return (EnumC3562c) Enum.valueOf(EnumC3562c.class, str);
    }

    public static EnumC3562c[] values() {
        return (EnumC3562c[]) k0.clone();
    }

    public AbstractC3560a h(C3016b c3016b) throws IOException {
        m b = c3016b.b("IPC$");
        if (!(b instanceof i)) {
            throw new e(String.format("%s not a named pipe.", this.q));
        }
        C3561b c3561b = new C3561b(j(c3016b, (i) b));
        c3561b.c(this.c0, this.d0);
        return c3561b;
    }
}
