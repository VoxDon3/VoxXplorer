/*
 * Decompiled with CFR 0.152.
 */
package ax.yb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface f {
    public String c() default "";

    public String f() default "";

    public int[] l() default {};

    public String m() default "";

    public int v() default 1;
}

