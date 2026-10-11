package ax.Sa;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public class c {
    public static OkHttpClient a() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.connectTimeout(30000L, timeUnit).readTimeout(30000L, timeUnit).writeTimeout(30000L, timeUnit).followSslRedirects(true).followRedirects(true).build();
    }

    public static OkHttpClient b() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builder.connectTimeout(30000L, timeUnit).readTimeout(300000L, timeUnit).writeTimeout(300000L, timeUnit).followSslRedirects(true).followRedirects(true).build();
    }
}
