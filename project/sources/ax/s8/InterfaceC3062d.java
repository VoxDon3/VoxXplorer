package ax.s8;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ax.s8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC3062d {
    double value();
}
