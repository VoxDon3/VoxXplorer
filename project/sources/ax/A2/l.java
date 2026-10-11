package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;

/* loaded from: classes.dex */
public final class l {
    public static final l a = new l();

    private l() {
    }

    public final Context a(Context context) {
        ax.Gb.l.f(context, "context");
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (context2 instanceof Activity) {
                return context2;
            }
            if (context2 instanceof InputMethodService) {
                return context2;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                return context2;
            }
            context2 = contextWrapper.getBaseContext();
            ax.Gb.l.e(context2, "getBaseContext(...)");
        }
        throw new IllegalArgumentException("Context " + context + " is not a UiContext");
    }
}
