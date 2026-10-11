/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.text.TextUtils;
import android.util.Log;
import ax.a6.j0;
import ax.a6.z;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class T
implements Runnable {
    public final String c0;
    public final j0[] d0;
    public final String q;

    public /* synthetic */ T(String string, String string2, j0[] j0Array) {
        this.q = string;
        this.c0 = string2;
        this.d0 = j0Array;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        String string = this.q;
        if (TextUtils.isEmpty((CharSequence)string)) {
            Log.d((String)"UserMessagingPlatform", (String)"Error on action: empty action name");
            return;
        }
        j0[] j0Array = this.c0;
        String string2 = string.toLowerCase();
        if (TextUtils.isEmpty((CharSequence)j0Array)) {
            string = new JSONObject();
        } else {
            try {
                string = new JSONObject((String)j0Array);
            }
            catch (JSONException jSONException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Action[");
                stringBuilder.append(string2);
                stringBuilder.append("]: failed to parse args: ");
                stringBuilder.append((String)j0Array);
                Log.d((String)"UserMessagingPlatform", (String)stringBuilder.toString());
                return;
            }
        }
        j0Array = this.d0;
        Object object = string.toString();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("Action[");
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("]: ");
        ((StringBuilder)object2).append((String)object);
        Log.d((String)"UserMessagingPlatform", (String)((StringBuilder)object2).toString());
        for (int i8 = 0; i8 < j0Array.length; ++i8) {
            ExecutionException executionException2222;
            block9: {
                object = j0Array[i8];
                object2 = new FutureTask(new z((j0)object, string2, (JSONObject)string));
                object.a().execute((Runnable)object2);
                try {
                    boolean bl = (Boolean)((FutureTask)object2).get();
                    if (bl) break;
                    continue;
                }
                catch (InterruptedException interruptedException) {
                }
                catch (ExecutionException executionException2222) {
                    break block9;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Thread interrupted for Action[");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append("]: ");
                Log.d((String)"UserMessagingPlatform", (String)((StringBuilder)object).toString(), (Throwable)interruptedException);
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Failed to run Action[");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("]: ");
            Log.d((String)"UserMessagingPlatform", (String)((StringBuilder)object).toString(), (Throwable)executionException2222.getCause());
        }
    }
}

