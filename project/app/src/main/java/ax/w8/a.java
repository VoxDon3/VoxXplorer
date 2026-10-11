/*
 * Decompiled with CFR 0.152.
 */
package ax.w8;

import ax.r8.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class a {
    private static String a(Constructor<?> classArray) {
        StringBuilder stringBuilder = new StringBuilder(classArray.getDeclaringClass().getName());
        stringBuilder.append('#');
        stringBuilder.append(classArray.getDeclaringClass().getSimpleName());
        stringBuilder.append('(');
        classArray = classArray.getParameterTypes();
        for (int i8 = 0; i8 < classArray.length; ++i8) {
            if (i8 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(classArray[i8].getSimpleName());
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static RuntimeException b(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static void c(Field field) throws j {
        try {
            ((AccessibleObject)field).setAccessible(true);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed making field '");
            stringBuilder.append(field.getDeclaringClass().getName());
            stringBuilder.append("#");
            stringBuilder.append(field.getName());
            stringBuilder.append("' accessible; either change its visibility or write a custom TypeAdapter for its declaring type");
            throw new j(stringBuilder.toString(), exception);
        }
    }

    public static String d(Constructor<?> constructor) {
        try {
            ((AccessibleObject)constructor).setAccessible(true);
            return null;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed making constructor '");
            stringBuilder.append(a.a(constructor));
            stringBuilder.append("' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
            stringBuilder.append(exception.getMessage());
            return stringBuilder.toString();
        }
    }
}

