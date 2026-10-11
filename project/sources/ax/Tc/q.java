package ax.Tc;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class q extends b {
    public static final ax.Sc.f f = new ax.Sc.f("UNIX", "yyyy-MM-dd HH:mm", null);
    final boolean e;

    public q() {
        this(null);
    }

    @Override // ax.Sc.k, ax.Sc.j
    public List<String> b(List<String> list) {
        Collection.EL.removeIf(list, new Predicate() { // from class: ax.Tc.p
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean matches;
                matches = ((String) obj).matches("^total \\d+$");
                return matches;
            }
        });
        return list;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:3|(1:5)|6|7|(1:9)(1:52)|10|(14:12|(11:14|17|(3:19|(2:26|27)(2:23|24)|25)|28|29|(2:44|45)|31|32|33|(2:35|(1:37)(1:40))(1:41)|38)|50|16|17|(0)|28|29|(0)|31|32|33|(0)(0)|38)|51|16|17|(0)|28|29|(0)|31|32|33|(0)(0)|38) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ax.Sc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.Sc.i c(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Tc.q.c(java.lang.String):ax.Sc.i");
    }

    @Override // ax.Tc.b
    protected ax.Sc.f i() {
        return new ax.Sc.f("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    public q(ax.Sc.f fVar) {
        this(fVar, false);
    }

    public q(ax.Sc.f fVar, boolean z) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)");
        f(fVar);
        this.e = z;
    }
}
