package ax.jc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ax.jc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC2347a {
    Class[] messages();
}
