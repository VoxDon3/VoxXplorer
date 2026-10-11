/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.appcompat.widget.K;
import androidx.appcompat.widget.N;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class I
extends ContextWrapper {
    private static final Object c = new Object();
    private static ArrayList<WeakReference<I>> d;
    private final Resources a;
    private final Resources.Theme b;

    private I(Context context) {
        super(context);
        if (N.d()) {
            N n8 = new N((Context)this, context.getResources());
            this.a = n8;
            n8 = n8.newTheme();
            this.b = n8;
            n8.setTo(context.getTheme());
            return;
        }
        this.a = new K((Context)this, context.getResources());
        this.b = null;
    }

    private static boolean a(Context context) {
        return !(context instanceof I) && !(context.getResources() instanceof K) && !(context.getResources() instanceof N) && N.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Context b(Context object) {
        if (!I.a((Context)object)) {
            return object;
        }
        Object object2 = c;
        synchronized (object2) {
            Object object3;
            block9: {
                int n8;
                try {
                    object3 = d;
                    if (object3 == null) {
                        object3 = new Object();
                        d = object3;
                        break block9;
                    }
                    for (n8 = object3.size() - 1; n8 >= 0; --n8) {
                        object3 = d.get(n8);
                        if (object3 != null && ((Reference)object3).get() != null) continue;
                        d.remove(n8);
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (n8 = d.size() - 1; n8 >= 0; --n8) {
                    object3 = d.get(n8);
                    object3 = object3 != null ? (I)((Object)((Reference)object3).get()) : null;
                    if (object3 == null || object3.getBaseContext() != object) continue;
                    return object3;
                }
            }
            object3 = new Object((Context)object);
            object = d;
            WeakReference<Object> weakReference = new WeakReference<Object>(object3);
            ((ArrayList)object).add(weakReference);
            return object3;
        }
    }

    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    public Resources getResources() {
        return this.a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme;
        Resources.Theme theme2 = theme = this.b;
        if (theme == null) {
            theme2 = super.getTheme();
        }
        return theme2;
    }

    public void setTheme(int n8) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(n8);
            return;
        }
        theme.applyStyle(n8, true);
    }
}

