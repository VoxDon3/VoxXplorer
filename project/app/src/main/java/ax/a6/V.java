/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ax.a6.C;
import ax.a6.D0;
import ax.a6.F0;
import ax.a6.P;
import ax.a6.S;
import ax.a6.U;
import ax.a6.j0;
import ax.a6.n;
import ax.a6.p;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

final class V
implements j0 {
    private final Application a;
    private final P b;
    private final Handler c;
    private final Executor d;
    private final D0 e;
    private final n f;
    private final C g;
    private final p h;

    V(Application application, P p8, Handler handler, Executor executor, D0 d02, n n8, C c8, p p9) {
        this.a = application;
        this.b = p8;
        this.c = handler;
        this.d = executor;
        this.e = d02;
        this.f = n8;
        this.g = c8;
        this.h = p9;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void c(V v8) {
        JSONObject jSONObject = new JSONObject();
        Application application = v8.a;
        try {
            Object var1_6;
            Object object;
            jSONObject.put("app_name", (Object)((Object)application.getPackageManager().getApplicationLabel(application.getApplicationInfo())).toString());
            Drawable drawable = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (drawable == null) {
                Object var1_3 = null;
            } else {
                Bitmap bitmap = Bitmap.createBitmap((int)drawable.getIntrinsicWidth(), (int)drawable.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
                object = new Canvas(bitmap);
                drawable.setBounds(0, 0, object.getWidth(), object.getHeight());
                drawable.draw((Canvas)object);
                object = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)object);
                String string = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString((byte[])((ByteArrayOutputStream)object).toByteArray(), (int)2)));
            }
            jSONObject.put("app_icon", (Object)var1_6);
            object = new JSONObject();
            p p8 = v8.h;
            for (String string : p8.b().keySet()) {
                object.put(string, p8.b().get(string));
            }
            jSONObject.put("stored_infos_map", object);
        }
        catch (JSONException jSONException) {}
        v8.g.d().d("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void g(JSONObject object) {
        Uri uri;
        if (TextUtils.isEmpty((CharSequence)(object = object.optString("url")))) {
            Log.d((String)"UserMessagingPlatform", (String)"Action[browser]: empty url.");
        }
        if ((uri = Uri.parse((String)object)).getScheme() == null) {
            Log.d((String)"UserMessagingPlatform", (String)"Action[browser]: empty scheme: ".concat(String.valueOf(object)));
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            this.b.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            Log.d((String)"UserMessagingPlatform", (String)"Action[browser]: can not open url: ".concat(String.valueOf(object)), (Throwable)activityNotFoundException);
            return;
        }
    }

    @Override
    public final Executor a() {
        Handler handler = this.c;
        j.Objects.requireNonNull((Object)handler);
        return new S(handler);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean b(String string, JSONObject jSONObject) {
        int n8 = string.hashCode();
        int n9 = -1;
        int n10 = 3;
        switch (n8) {
            default: {
                return false;
            }
            case 1671672458: {
                if (!string.equals("dismiss")) return false;
                n8 = 1;
                break;
            }
            case 150940456: {
                if (!string.equals("browser")) return false;
                n8 = 2;
                break;
            }
            case -278739366: {
                if (!string.equals("configure_app_assets")) return false;
                n8 = 3;
                break;
            }
            case -1370505102: {
                if (!string.equals("load_complete")) return false;
                n8 = 0;
            }
        }
        if (n8 == 0) {
            this.g.j();
            return true;
        }
        if (n8 != 1) {
            if (n8 == 2) {
                this.g(jSONObject);
                return true;
            }
            if (n8 != 3) {
                return false;
            }
            this.d();
            return true;
        }
        string = jSONObject.optString("status");
        switch (string.hashCode()) {
            default: {
                n8 = n9;
                break;
            }
            case 1725474845: {
                n8 = n9;
                if (!string.equals("CONSENT_SIGNAL_NOT_REQUIRED")) break;
                n8 = 5;
                break;
            }
            case 1666911234: {
                n8 = n9;
                if (!string.equals("non_personalized")) break;
                n8 = 2;
                break;
            }
            case 467888915: {
                n8 = n9;
                if (!string.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) break;
                n8 = 1;
                break;
            }
            case 429411856: {
                n8 = n9;
                if (!string.equals("CONSENT_SIGNAL_SUFFICIENT")) break;
                n8 = 4;
                break;
            }
            case -258041904: {
                n8 = n9;
                if (!string.equals("personalized")) break;
                n8 = 0;
                break;
            }
            case -954325659: {
                n8 = n9;
                if (!string.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) break;
                n8 = 3;
            }
        }
        n9 = n10;
        if (n8 != 0) {
            n9 = n10;
            if (n8 != 1) {
                n9 = n10;
                if (n8 != 2) {
                    n9 = n10;
                    if (n8 != 3) {
                        n9 = n10;
                        if (n8 != 4) {
                            if (n8 != 5) {
                                this.g.i(new F0(1, "We are getting something wrong with the webview."));
                                return true;
                            }
                            n9 = 1;
                        }
                    }
                }
            }
        }
        this.g.h(n9);
        return true;
    }

    public final void d() {
        U u8 = new U(this);
        this.d.execute(u8);
    }

    final void e(String string) {
        Log.d((String)"UserMessagingPlatform", (String)"Receive consent action: ".concat(String.valueOf(string)));
        Object object = Uri.parse((String)string);
        string = object.getQueryParameter("action");
        String string2 = object.getQueryParameter("args");
        object = this.f;
        this.e.a(string, string2, new j0[]{this, object});
    }

    final void f(int n8, String object, String string) {
        object = new F0(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", n8, string, object));
        this.g.k((F0)object);
    }
}

