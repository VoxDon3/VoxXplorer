package ax.Bb;

import ax.Gb.l;

/* loaded from: classes3.dex */
public class a extends ax.Ab.a {

    /* renamed from: ax.Bb.a$a, reason: collision with other inner class name */
    private static final class C0056a {
        public static final C0056a a = new C0056a();
        public static final Integer b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            b = num2;
        }

        private C0056a() {
        }
    }

    private final boolean c(int i) {
        Integer num = C0056a.b;
        return num == null || num.intValue() >= i;
    }

    @Override // ax.Ab.a
    public void a(Throwable th, Throwable th2) {
        l.f(th, "cause");
        l.f(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
