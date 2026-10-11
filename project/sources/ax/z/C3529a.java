package ax.z;

import android.os.Bundle;

/* renamed from: ax.z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3529a {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    /* renamed from: ax.z.a$a, reason: collision with other inner class name */
    public static final class C0504a {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;

        public C3529a a() {
            return new C3529a(this.a, this.b, this.c, this.d);
        }
    }

    C3529a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
