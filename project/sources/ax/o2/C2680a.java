package ax.o2;

import android.annotation.SuppressLint;
import ax.Gb.l;

/* renamed from: ax.o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2680a implements j {
    public static final C0392a d0 = new C0392a(null);
    private final Object[] c0;
    private final String q;

    /* renamed from: ax.o2.a$a, reason: collision with other inner class name */
    public static final class C0392a {
        public /* synthetic */ C0392a(ax.Gb.g gVar) {
            this();
        }

        private final void a(i iVar, int i, Object obj) {
            if (obj == null) {
                iVar.t0(i);
                return;
            }
            if (obj instanceof byte[]) {
                iVar.e0(i, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                iVar.N(i, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                iVar.N(i, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                iVar.X(i, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                iVar.X(i, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                iVar.X(i, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                iVar.X(i, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                iVar.D(i, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                iVar.X(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void b(i iVar, Object[] objArr) {
            l.f(iVar, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                a(iVar, i, obj);
            }
        }

        private C0392a() {
        }
    }

    public C2680a(String str, Object[] objArr) {
        l.f(str, "query");
        this.q = str;
        this.c0 = objArr;
    }

    @Override // ax.o2.j
    public void a(i iVar) {
        l.f(iVar, "statement");
        d0.b(iVar, this.c0);
    }

    @Override // ax.o2.j
    public String b() {
        return this.q;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2680a(String str) {
        this(str, null);
        l.f(str, "query");
    }
}
