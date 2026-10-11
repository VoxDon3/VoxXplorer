/*
 * Decompiled with CFR 0.152.
 */
package ax.s8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE, ElementType.FIELD})
public @interface b {
    public boolean nullSafe() default true;

    public Class<?> value();
}

