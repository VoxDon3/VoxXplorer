package ax.r8;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ax.r8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC2994c implements InterfaceC2995d {
    public static final EnumC2994c c0;
    public static final EnumC2994c d0;
    public static final EnumC2994c e0;
    public static final EnumC2994c f0;
    public static final EnumC2994c g0;
    public static final EnumC2994c h0;
    private static final /* synthetic */ EnumC2994c[] i0;
    public static final EnumC2994c q;

    /* renamed from: ax.r8.c$a */
    enum a extends EnumC2994c {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // ax.r8.InterfaceC2995d
        public String d(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        q = aVar;
        EnumC2994c enumC2994c = new EnumC2994c("UPPER_CAMEL_CASE", 1) { // from class: ax.r8.c.b
            {
                a aVar2 = null;
            }

            @Override // ax.r8.InterfaceC2995d
            public String d(Field field) {
                return EnumC2994c.j(field.getName());
            }
        };
        c0 = enumC2994c;
        EnumC2994c enumC2994c2 = new EnumC2994c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: ax.r8.c.c
            {
                a aVar2 = null;
            }

            @Override // ax.r8.InterfaceC2995d
            public String d(Field field) {
                return EnumC2994c.j(EnumC2994c.h(field.getName(), ' '));
            }
        };
        d0 = enumC2994c2;
        EnumC2994c enumC2994c3 = new EnumC2994c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: ax.r8.c.d
            {
                a aVar2 = null;
            }

            @Override // ax.r8.InterfaceC2995d
            public String d(Field field) {
                return EnumC2994c.h(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        e0 = enumC2994c3;
        EnumC2994c enumC2994c4 = new EnumC2994c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: ax.r8.c.e
            {
                a aVar2 = null;
            }

            @Override // ax.r8.InterfaceC2995d
            public String d(Field field) {
                return EnumC2994c.h(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f0 = enumC2994c4;
        EnumC2994c enumC2994c5 = new EnumC2994c("LOWER_CASE_WITH_DASHES", 5) { // from class: ax.r8.c.f
            {
                a aVar2 = null;
            }

            @Override // ax.r8.InterfaceC2995d
            public String d(Field field) {
                return EnumC2994c.h(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        g0 = enumC2994c5;
        EnumC2994c enumC2994c6 = new EnumC2994c("LOWER_CASE_WITH_DOTS", 6) { // from class: ax.r8.c.g
            {
                a aVar2 = null;
            }

            @Override // ax.r8.InterfaceC2995d
            public String d(Field field) {
                return EnumC2994c.h(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        h0 = enumC2994c6;
        i0 = new EnumC2994c[]{aVar, enumC2994c, enumC2994c2, enumC2994c3, enumC2994c4, enumC2994c5, enumC2994c6};
    }

    private EnumC2994c(String str, int i) {
    }

    static String h(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String j(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static EnumC2994c valueOf(String str) {
        return (EnumC2994c) Enum.valueOf(EnumC2994c.class, str);
    }

    public static EnumC2994c[] values() {
        return (EnumC2994c[]) i0.clone();
    }

    /* synthetic */ EnumC2994c(String str, int i, a aVar) {
        this(str, i);
    }
}
