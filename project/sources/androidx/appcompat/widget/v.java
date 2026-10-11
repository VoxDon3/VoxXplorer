package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import ax.b0.C1446g;

/* loaded from: classes.dex */
final class v {
    private TextView a;
    private TextClassifier b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    v(TextView textView) {
        this.a = (TextView) C1446g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.b;
        return textClassifier == null ? a.a(this.a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}
