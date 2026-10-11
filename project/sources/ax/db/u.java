package ax.db;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class u {
    private static final List<u> c = b();
    public static final u d = a.OK.d();
    public static final u e = a.CANCELLED.d();
    public static final u f = a.UNKNOWN.d();
    public static final u g = a.INVALID_ARGUMENT.d();
    public static final u h = a.DEADLINE_EXCEEDED.d();
    public static final u i = a.NOT_FOUND.d();
    public static final u j = a.ALREADY_EXISTS.d();
    public static final u k = a.PERMISSION_DENIED.d();
    public static final u l = a.UNAUTHENTICATED.d();
    public static final u m = a.RESOURCE_EXHAUSTED.d();
    public static final u n = a.FAILED_PRECONDITION.d();
    public static final u o = a.ABORTED.d();
    public static final u p = a.OUT_OF_RANGE.d();
    public static final u q = a.UNIMPLEMENTED.d();
    public static final u r = a.INTERNAL.d();
    public static final u s = a.UNAVAILABLE.d();
    public static final u t = a.DATA_LOSS.d();
    private final a a;
    private final String b;

    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        private final int q;

        a(int i) {
            this.q = i;
        }

        public u d() {
            return (u) u.c.get(this.q);
        }

        public int h() {
            return this.q;
        }
    }

    private u(a aVar, String str) {
        this.a = (a) ax.cb.b.b(aVar, "canonicalCode");
        this.b = str;
    }

    private static List<u> b() {
        TreeMap treeMap = new TreeMap();
        for (a aVar : a.values()) {
            u uVar = (u) treeMap.put(Integer.valueOf(aVar.h()), new u(aVar, null));
            if (uVar != null) {
                throw new IllegalStateException("Code value duplication between " + uVar.c().name() + " & " + aVar.name());
            }
        }
        return DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    public a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && ax.cb.b.d(this.b, uVar.b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return "Status{canonicalCode=" + this.a + ", description=" + this.b + "}";
    }
}
