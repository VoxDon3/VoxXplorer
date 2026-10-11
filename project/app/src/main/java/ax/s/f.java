/*
 * Decompiled with CFR 0.152.
 */
package ax.s;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class f
implements Window.Callback {
    final Window.Callback a;

    public f(Window.Callback callback) {
        if (callback != null) {
            this.a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.a;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int n8, Menu menu) {
        return this.a.onCreatePanelMenu(n8, menu);
    }

    public View onCreatePanelView(int n8) {
        return this.a.onCreatePanelView(n8);
    }

    public void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int n8, MenuItem menuItem) {
        return this.a.onMenuItemSelected(n8, menuItem);
    }

    public boolean onMenuOpened(int n8, Menu menu) {
        return this.a.onMenuOpened(n8, menu);
    }

    public void onPanelClosed(int n8, Menu menu) {
        this.a.onPanelClosed(n8, menu);
    }

    public void onPointerCaptureChanged(boolean bl) {
        c.a(this.a, bl);
    }

    public boolean onPreparePanel(int n8, View view, Menu menu) {
        return this.a.onPreparePanel(n8, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int n8) {
        b.a(this.a, list, menu, n8);
    }

    public boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return ax.s.f$a.a(this.a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean bl) {
        this.a.onWindowFocusChanged(bl);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.a.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int n8) {
        return ax.s.f$a.b(this.a, callback, n8);
    }

    static class a {
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int n8) {
            return callback.onWindowStartingActionMode(callback2, n8);
        }
    }

    static class b {
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int n8) {
            callback.onProvideKeyboardShortcuts(list, menu, n8);
        }
    }

    static class c {
        static void a(Window.Callback callback, boolean bl) {
            callback.onPointerCaptureChanged(bl);
        }
    }
}

