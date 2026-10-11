/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import ax.b0.g;

final class v {
    private TextView a;
    private TextClassifier b;

    v(TextView textView) {
        this.a = g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2 = textClassifier = this.b;
        if (textClassifier == null) {
            textClassifier2 = androidx.appcompat.widget.v$a.a(this.a);
        }
        return textClassifier2;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }

    private static final class a {
        static TextClassifier a(TextView textView) {
            if ((textView = (TextClassificationManager)textView.getContext().getSystemService(TextClassificationManager.class)) != null) {
                return textView.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }
}

