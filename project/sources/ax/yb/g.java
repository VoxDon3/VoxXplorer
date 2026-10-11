package ax.yb;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class g {
    private static final void a(int i, int i2) {
        if (i2 <= i) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
    }

    private static final f b(AbstractC3520a abstractC3520a) {
        return (f) abstractC3520a.getClass().getAnnotation(f.class);
    }

    private static final int c(AbstractC3520a abstractC3520a) {
        try {
            Field declaredField = abstractC3520a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC3520a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(AbstractC3520a abstractC3520a) {
        String str;
        ax.Gb.l.f(abstractC3520a, "<this>");
        f b = b(abstractC3520a);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(abstractC3520a);
        int i = c < 0 ? -1 : b.l()[c];
        String b2 = i.a.b(abstractC3520a);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + '/' + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i);
    }
}
