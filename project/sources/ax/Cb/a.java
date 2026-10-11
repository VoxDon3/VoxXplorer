package ax.Cb;

import ax.Jb.c;

/* loaded from: classes3.dex */
public class a extends ax.Bb.a {

    /* renamed from: ax.Cb.a$a, reason: collision with other inner class name */
    private static final class C0063a {
        public static final C0063a a = new C0063a();
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

        private C0063a() {
        }
    }

    private final boolean c(int i) {
        Integer num = C0063a.b;
        return num == null || num.intValue() >= i;
    }

    @Override // ax.Ab.a
    public c b() {
        return c(34) ? new ax.Kb.a() : super.b();
    }
}
