package ax.l7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ax.l7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC2479g {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: ax.l7.g$a */
    public @interface a {
        String key();

        Class<?> ref();
    }

    a[] typeDefinitions();
}
