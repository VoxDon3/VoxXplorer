/*
 * Decompiled with CFR 0.152.
 */
package ax.h0;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import ax.c0.J;
import ax.c0.d;

public final class l
implements J {
    private static CharSequence b(Context object, ClipData.Item object2, int n8) {
        if ((n8 & 1) != 0) {
            object2 = object2.coerceToText(object);
            object = object2;
            if (object2 instanceof Spanned) {
                object = object2.toString();
            }
            return object;
        }
        return object2.coerceToStyledText(object);
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int n8 = Selection.getSelectionStart((CharSequence)editable);
        int n9 = Selection.getSelectionEnd((CharSequence)editable);
        int n10 = Math.max(0, Math.min(n8, n9));
        n8 = Math.max(0, Math.max(n8, n9));
        Selection.setSelection((Spannable)editable, (int)n8);
        editable.replace(n10, n8, charSequence);
    }

    @Override
    public d a(View view, d d8) {
        StringBuilder stringBuilder;
        if (Log.isLoggable((String)"ReceiveContent", (int)3)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("onReceive: ");
            stringBuilder.append(d8);
            Log.d((String)"ReceiveContent", (String)stringBuilder.toString());
        }
        if (d8.d() == 2) {
            return d8;
        }
        stringBuilder = d8.b();
        int n8 = d8.c();
        d8 = (TextView)view;
        view = (Editable)d8.getText();
        d8 = d8.getContext();
        boolean bl = false;
        for (int i8 = 0; i8 < stringBuilder.getItemCount(); ++i8) {
            CharSequence charSequence = l.b((Context)d8, stringBuilder.getItemAt(i8), n8);
            boolean bl2 = bl;
            if (charSequence != null) {
                if (!bl) {
                    l.c((Editable)view, charSequence);
                    bl2 = true;
                } else {
                    view.insert(Selection.getSelectionEnd((CharSequence)view), (CharSequence)"\n");
                    view.insert(Selection.getSelectionEnd((CharSequence)view), charSequence);
                    bl2 = bl;
                }
            }
            bl = bl2;
        }
        return null;
    }
}

