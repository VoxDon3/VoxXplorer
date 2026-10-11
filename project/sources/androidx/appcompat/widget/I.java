package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class I extends ContextWrapper {
    private static final Object c = new Object();
    private static ArrayList<WeakReference<I>> d;
    private final Resources a;
    private final Resources.Theme b;

    private I(Context context) {
        super(context);
        if (!N.d()) {
            this.a = new K(this, context.getResources());
            this.b = null;
            return;
        }
        N n = new N(this, context.getResources());
        this.a = n;
        Resources.Theme newTheme = n.newTheme();
        this.b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof I) || (context.getResources() instanceof K) || (context.getResources() instanceof N) || !N.d()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (c) {
            try {
                ArrayList<WeakReference<I>> arrayList = d;
                if (arrayList == null) {
                    d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<I> weakReference = d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            d.remove(size);
                        }
                    }
                    for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<I> weakReference2 = d.get(size2);
                        I i = weakReference2 != null ? weakReference2.get() : null;
                        if (i != null && i.getBaseContext() == context) {
                            return i;
                        }
                    }
                }
                I i2 = new I(context);
                d.add(new WeakReference<>(i2));
                return i2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
