/*
 * Decompiled with CFR 0.152.
 */
package ax.jc;

import ax.jc.d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.ANNOTATION_TYPE})
public @interface b {
    public Class<? extends d> value();
}

