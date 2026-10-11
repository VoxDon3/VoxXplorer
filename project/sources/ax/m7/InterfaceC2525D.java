package ax.m7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ax.m7.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC2525D {
    String value() default "##default";
}
