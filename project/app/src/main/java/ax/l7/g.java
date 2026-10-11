/*
 * Decompiled with CFR 0.152.
 */
package ax.l7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface g {
    public a[] typeDefinitions();

    @Retention(value=RetentionPolicy.RUNTIME)
    @Target(value={ElementType.FIELD})
    public static @interface a {
        public String key();

        public Class<?> ref();
    }
}

