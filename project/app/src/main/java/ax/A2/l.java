/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;

public final class l {
    public static final l a = new l();

    private l() {
    }

    public final Context a(Context context) {
        ax.Gb.l.f(context, "context");
        Object object = context;
        while (object instanceof ContextWrapper) {
            if (object instanceof Activity) {
                return object;
            }
            if (object instanceof InputMethodService) {
                return object;
            }
            ContextWrapper contextWrapper = (ContextWrapper)object;
            if (contextWrapper.getBaseContext() == null) {
                return object;
            }
            object = contextWrapper.getBaseContext();
            ax.Gb.l.e(object, "getBaseContext(...)");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Context ");
        ((StringBuilder)object).append(context);
        ((StringBuilder)object).append(" is not a UiContext");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }
}

