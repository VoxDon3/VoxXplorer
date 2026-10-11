package ax.a6;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class D0 {
    private final Executor a;

    D0(Executor executor) {
        this.a = executor;
    }

    public final void a(final String str, final String str2, final InterfaceC1406j0... interfaceC1406j0Arr) {
        this.a.execute(new Runnable() { // from class: ax.a6.T
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                if (TextUtils.isEmpty(str3)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String str4 = str2;
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str4);
                        return;
                    }
                }
                InterfaceC1406j0[] interfaceC1406j0Arr2 = interfaceC1406j0Arr;
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                for (final InterfaceC1406j0 interfaceC1406j0 : interfaceC1406j0Arr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: ax.a6.z
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(InterfaceC1406j0.this.b(lowerCase, jSONObject));
                        }
                    });
                    interfaceC1406j0.a().execute(futureTask);
                    try {
                    } catch (InterruptedException e) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e);
                    } catch (ExecutionException e2) {
                        Log.d("UserMessagingPlatform", "Failed to run Action[" + lowerCase + "]: ", e2.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
