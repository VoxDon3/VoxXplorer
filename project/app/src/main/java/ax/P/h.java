/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import ax.B.k;
import ax.Gb.l;
import ax.c0.u;

public class h
extends Activity
implements ax.G0.h,
u.a {
    private final k<Class<? extends a>, a> extraDataMap = new k();
    private final g lifecycleRegistry = new g(this);

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean shouldSkipDump(String[] object) {
        if (object == null) return false;
        if (((Object)object).length == 0) {
            return false;
        }
        switch (object[0]) {
            default: {
                return false;
            }
            case "--autofill": {
                if (Build.VERSION.SDK_INT < 26) return false;
                return true;
            }
            case "--contentcapture": {
                if (Build.VERSION.SDK_INT < 29) return false;
                return true;
            }
            case "--list-dumpables": 
            case "--dump-dumpable": {
                if (Build.VERSION.SDK_INT < 33) return false;
                return true;
            }
            case "--translation": 
        }
        if (Build.VERSION.SDK_INT < 31) return false;
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        View view = this.getWindow().getDecorView();
        l.e(view, "window.decorView");
        if (u.d(view, keyEvent)) {
            return true;
        }
        return u.e(this, view, (Window.Callback)this, keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        View view = this.getWindow().getDecorView();
        l.e(view, "window.decorView");
        if (u.d(view, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends a> T getExtraData(Class<T> clazz) {
        l.f(clazz, "extraDataClass");
        return (T)this.extraDataMap.get(clazz);
    }

    @Override
    public d getLifecycle() {
        return this.lifecycleRegistry;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.k.b.c(this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        l.f(bundle, "outState");
        this.lifecycleRegistry.m(d.b.d0);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(a a8) {
        l.f(a8, "extraData");
        this.extraDataMap.put(a8.getClass(), a8);
    }

    protected final boolean shouldDumpInternalState(String[] stringArray) {
        return this.shouldSkipDump(stringArray) ^ true;
    }

    @Override
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public static class a {
    }
}

