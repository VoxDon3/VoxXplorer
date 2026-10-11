/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import ax.c0.d;
import ax.c0.d0;

final class t {
    static boolean a(View view, DragEvent object) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 < 31 && n8 >= 24 && object.getLocalState() == null && d0.E(view) != null) {
            Activity activity = t.c(view);
            if (activity == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Can't handle drop: no activity: view=");
                ((StringBuilder)object).append(view);
                Log.i((String)"ReceiveContent", (String)((StringBuilder)object).toString());
                return false;
            }
            if (object.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (object.getAction() == 3) {
                if (view instanceof TextView) {
                    return a.a((DragEvent)object, (TextView)view, activity);
                }
                return a.b((DragEvent)object, view, activity);
            }
        }
        return false;
    }

    static boolean b(TextView textView, int n8) {
        int n9 = Build.VERSION.SDK_INT;
        int n10 = 0;
        if (n9 < 31 && d0.E((View)textView) != null && (n8 == 0x1020022 || n8 == 16908337)) {
            Object object = (ClipboardManager)textView.getContext().getSystemService("clipboard");
            object = object == null ? null : object.getPrimaryClip();
            if (object != null && object.getItemCount() > 0) {
                object = new d.a((ClipData)object, 1);
                n8 = n8 == 0x1020022 ? n10 : 1;
                d0.b0((View)textView, ((d.a)object).c(n8).a());
            }
            return true;
        }
        return false;
    }

    static Activity c(View view) {
        view = view.getContext();
        while (view instanceof ContextWrapper) {
            if (view instanceof Activity) {
                return (Activity)view;
            }
            view = ((ContextWrapper)view).getBaseContext();
        }
        return null;
    }

    private static final class a {
        static boolean a(DragEvent dragEvent, TextView textView, Activity object) {
            object.requestDragAndDropPermissions(dragEvent);
            int n8 = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable)((Spannable)textView.getText()), (int)n8);
                object = new d.a(dragEvent.getClipData(), 3);
                d0.b0((View)textView, ((d.a)object).a());
                return true;
            }
            finally {
                textView.endBatchEdit();
            }
        }

        static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            d0.b0(view, new d.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }
}

