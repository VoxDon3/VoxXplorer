/*
 * Decompiled with CFR 0.152.
 */
package ax.g0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import ax.b0.b;
import ax.b0.g;
import ax.c0.d;
import ax.c0.d0;
import ax.g0.d;
import ax.g0.f;

@SuppressLint(value={"PrivateConstructorForUtilityClass"})
public final class e {
    public static /* synthetic */ boolean a(View view, f f8, int n8, Bundle bundle) {
        block3: {
            Bundle bundle2;
            block4: {
                bundle2 = bundle;
                if (Build.VERSION.SDK_INT < 25) break block4;
                bundle2 = bundle;
                if ((n8 & 1) == 0) break block4;
                try {
                    f8.d();
                }
                catch (Exception exception) {
                    Log.w((String)"InputConnectionCompat", (String)"Can't insert content from IME; requestPermission() failed", (Throwable)exception);
                    break block3;
                }
                bundle2 = (Parcelable)f8.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", (Parcelable)bundle2);
                bundle2 = bundle;
            }
            if (d0.b0(view, new d.a(new ClipData(f8.b(), new ClipData.Item(f8.a())), 2).d(f8.c()).b(bundle2).a()) == null) {
                return true;
            }
        }
        return false;
    }

    private static c b(View view) {
        g.g(view);
        return new d(view);
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return e.d(inputConnection, editorInfo, e.b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, c c8) {
        b.d(inputConnection, "inputConnection must be non-null");
        b.d(editorInfo, "editorInfo must be non-null");
        b.d(c8, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new InputConnectionWrapper(inputConnection, false, c8){
                final c a;
                {
                    this.a = c8;
                    super(inputConnection, bl);
                }

                public boolean commitContent(InputContentInfo inputContentInfo, int n8, Bundle bundle) {
                    if (this.a.a(f.f(inputContentInfo), n8, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, n8, bundle);
                }
            };
        }
        if (ax.g0.c.a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new InputConnectionWrapper(inputConnection, false, c8){
            final c a;
            {
                this.a = c8;
                super(inputConnection, bl);
            }

            public boolean performPrivateCommand(String string, Bundle bundle) {
                if (e.e(string, bundle, this.a)) {
                    return true;
                }
                return super.performPrivateCommand(string, bundle);
            }
        };
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean e(String string, Bundle object, c c8) {
        RuntimeException var1_4;
        block12: {
            Uri uri;
            ResultReceiver resultReceiver;
            int n8;
            int n9 = 0;
            if (object == null) {
                return false;
            }
            if (TextUtils.equals((CharSequence)"androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", (CharSequence)string)) {
                n8 = 0;
            } else {
                if (!TextUtils.equals((CharSequence)"android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", (CharSequence)string)) {
                    return false;
                }
                n8 = 1;
            }
            string = n8 != 0 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            try {
                resultReceiver = (ResultReceiver)object.getParcelable(string);
                string = n8 != 0 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
            catch (Throwable throwable) {
                string = null;
                break block12;
            }
            try {
                uri = (Uri)object.getParcelable(string);
                string = n8 != 0 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
            }
            catch (Throwable throwable) {
                string = resultReceiver;
                break block12;
            }
            ClipDescription clipDescription = (ClipDescription)object.getParcelable(string);
            string = n8 != 0 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
            Uri uri2 = (Uri)object.getParcelable(string);
            string = n8 != 0 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
            int n10 = object.getInt(string);
            string = n8 != 0 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
            string = (Bundle)object.getParcelable(string);
            n8 = n9;
            if (uri != null) {
                n8 = n9;
                if (clipDescription != null) {
                    object = new f(uri, clipDescription, uri2);
                    n8 = c8.a((f)object, n10, (Bundle)string) ? 1 : 0;
                }
            }
            if (resultReceiver != null) {
                resultReceiver.send(n8, null);
            }
            return n8 != 0;
        }
        if (string != null) {
            string.send(0, null);
        }
        throw var1_4;
    }

    public static interface c {
        public boolean a(f var1, int var2, Bundle var3);
    }
}

