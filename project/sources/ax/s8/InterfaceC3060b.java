package ax.s8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ax.s8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC3060b {
    boolean nullSafe() default true;

    Class<?> value();
}
