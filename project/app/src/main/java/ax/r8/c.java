/*
 * Decompiled with CFR 0.152.
 */
package ax.r8;

import ax.r8.d;
import java.lang.reflect.Field;
import java.util.Locale;

public abstract class c
extends Enum<c>
implements d {
    public static final /* enum */ c c0;
    public static final /* enum */ c d0;
    public static final /* enum */ c e0;
    public static final /* enum */ c f0;
    public static final /* enum */ c g0;
    public static final /* enum */ c h0;
    private static final c[] i0;
    public static final /* enum */ c q;

    static {
        c c8;
        c c9;
        c c10;
        c c11;
        c c12;
        c c13;
        c c14;
        q = c14 = new c(){

            @Override
            public String d(Field field) {
                return field.getName();
            }
        };
        c0 = c13 = new c(){

            @Override
            public String d(Field field) {
                return c.j(field.getName());
            }
        };
        d0 = c12 = new c(){

            @Override
            public String d(Field field) {
                return c.j(c.h(field.getName(), ' '));
            }
        };
        e0 = c11 = new c(){

            @Override
            public String d(Field field) {
                return c.h(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f0 = c10 = new c(){

            @Override
            public String d(Field field) {
                return c.h(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        g0 = c9 = new c(){

            @Override
            public String d(Field field) {
                return c.h(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        h0 = c8 = new c(){

            @Override
            public String d(Field field) {
                return c.h(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        i0 = new c[]{c14, c13, c12, c11, c10, c9, c8};
    }

    static String h(String string, char c8) {
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = string.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            char c9 = string.charAt(i8);
            if (Character.isUpperCase(c9) && stringBuilder.length() != 0) {
                stringBuilder.append(c8);
            }
            stringBuilder.append(c9);
        }
        return stringBuilder.toString();
    }

    static String j(String string) {
        int n8 = string.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            char c8 = string.charAt(i8);
            if (!Character.isLetter(c8)) continue;
            if (Character.isUpperCase(c8)) break;
            c8 = Character.toUpperCase(c8);
            if (i8 == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c8);
                stringBuilder.append(string.substring(1));
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string.substring(0, i8));
            stringBuilder.append(c8);
            stringBuilder.append(string.substring(i8 + 1));
            return stringBuilder.toString();
        }
        return string;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return (c[])i0.clone();
    }
}

