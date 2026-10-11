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
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class V implements InterfaceC1406j0 {
    private final Application a;
    private final C1386P b;
    private final Handler c;
    private final Executor d;
    private final D0 e;
    private final C1413n f;
    private final C1373C g;
    private final C1417p h;

    V(Application application, C1386P c1386p, Handler handler, Executor executor, D0 d0, C1413n c1413n, C1373C c1373c, C1417p c1417p) {
        this.a = application;
        this.b = c1386p;
        this.c = handler;
        this.d = executor;
        this.e = d0;
        this.f = c1413n;
        this.g = c1373c;
        this.h = c1417p;
    }

    public static /* synthetic */ void c(V v) {
        String concat;
        JSONObject jSONObject = new JSONObject();
        Application application = v.a;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                concat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", concat);
            JSONObject jSONObject2 = new JSONObject();
            C1417p c1417p = v.h;
            for (String str : c1417p.b().keySet()) {
                jSONObject2.put(str, c1417p.b().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        v.g.d().d("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    private final void g(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
        }
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(optString)));
        }
        try {
            this.b.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(optString)), e);
        }
    }

    @Override // ax.a6.InterfaceC1406j0
    public final Executor a() {
        final Handler handler = this.c;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: ax.a6.S
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ax.a6.InterfaceC1406j0
    public final boolean b(String str, JSONObject jSONObject) {
        char c;
        char c2 = 65535;
        int i = 3;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.g.j();
            return true;
        }
        if (c != 1) {
            if (c == 2) {
                g(jSONObject);
                return true;
            }
            if (c != 3) {
                return false;
            }
            d();
            return true;
        }
        String optString = jSONObject.optString("status");
        switch (optString.hashCode()) {
            case -954325659:
                if (optString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    c2 = 3;
                    break;
                }
                break;
            case -258041904:
                if (optString.equals("personalized")) {
                    c2 = 0;
                    break;
                }
                break;
            case 429411856:
                if (optString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    c2 = 4;
                    break;
                }
                break;
            case 467888915:
                if (optString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1666911234:
                if (optString.equals("non_personalized")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1725474845:
                if (optString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 != 0 && c2 != 1 && c2 != 2 && c2 != 3 && c2 != 4) {
            if (c2 != 5) {
                this.g.i(new F0(1, "We are getting something wrong with the webview."));
                return true;
            }
            i = 1;
        }
        this.g.h(i);
        return true;
    }

    public final void d() {
        this.d.execute(new Runnable() { // from class: ax.a6.U
            @Override // java.lang.Runnable
            public final void run() {
                V.c(V.this);
            }
        });
    }

    final void e(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        this.e.a(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.f);
    }

    final void f(int i, String str, String str2) {
        this.g.k(new F0(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }
}
