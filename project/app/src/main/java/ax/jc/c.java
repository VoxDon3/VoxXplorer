/*
 * Decompiled with CFR 0.152.
 */
package ax.jc;

import ax.hc.i;
import ax.jc.b;
import ax.jc.e;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface c {
    public String condition() default "";

    public e delivery() default e.q;

    public boolean enabled() default true;

    public b[] filters() default {};

    public Class<? extends ax.hc.e> invocation() default i.class;

    public int priority() default 0;

    public boolean rejectSubtypes() default false;
}

