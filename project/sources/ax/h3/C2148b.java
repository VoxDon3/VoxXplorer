package ax.h3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import ax.Z2.k;

/* renamed from: ax.h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2148b {
    private static C2148b h;
    private Context a;
    public String b;
    public String c;
    public int d;
    public long e;
    public k f;
    private BroadcastReceiver g = new a();

    /* renamed from: ax.h3.b$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String b;
            if (!"local.intent.action.LOCAL_PLAYLIST_SAVE".equals(intent.getAction())) {
                if ("local.intent.action.LOCAL_PLAYLIST_CLEAR".equals(intent.getAction())) {
                    C2148b.this.a();
                    return;
                }
                return;
            }
            String stringExtra = intent.getStringExtra("folder_uri");
            int intExtra = intent.getIntExtra("current_position", 0);
            String stringExtra2 = intent.getStringExtra("media_id");
            if (stringExtra2 == null || (b = ax.S4.c.b(stringExtra2)) == null || !k.f(Uri.parse(b))) {
                C2148b.this.a();
            } else {
                C2148b.this.h(stringExtra, b, intExtra);
            }
        }
    }

    private C2148b(Context context) {
        this.a = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("local.intent.action.LOCAL_PLAYLIST_SAVE");
        intentFilter.addAction("local.intent.action.LOCAL_PLAYLIST_CLEAR");
        ax.L0.a.b(context).c(this.g, intentFilter);
    }

    public static C2148b b(Context context) {
        if (h == null) {
            h = new C2148b(context);
        }
        return h;
    }

    private void i() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("music_playlist", 0).edit();
        edit.putString("folder_location_uri", this.b);
        edit.putString("media_location_uri", this.c);
        edit.putInt("media_position", this.d);
        edit.putLong("save_time_millis", this.e);
        edit.apply();
    }

    private void j(String str) {
        this.c = str;
        this.f = null;
    }

    public void a() {
        j(null);
        this.b = null;
        this.d = 0;
        this.e = 0L;
        this.a.getSharedPreferences("music_playlist", 0).edit().clear().apply();
    }

    public k c() {
        k kVar = this.f;
        if (kVar != null) {
            return kVar;
        }
        String str = this.c;
        if (str == null) {
            return null;
        }
        try {
            k a2 = k.a(Uri.parse(str));
            this.f = a2;
            return a2;
        } catch (Exception unused) {
            return null;
        }
    }

    public long d() {
        return this.e;
    }

    public boolean e() {
        return this.c != null;
    }

    public boolean f(long j) {
        if (!e()) {
            return true;
        }
        if (j == 0) {
            return false;
        }
        long d = d();
        return d == 0 || System.currentTimeMillis() - d > j;
    }

    public void g() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("music_playlist", 0);
        j(sharedPreferences.getString("media_location_uri", null));
        this.b = sharedPreferences.getString("folder_location_uri", null);
        this.d = sharedPreferences.getInt("media_position", 0);
        this.e = sharedPreferences.getLong("save_time_millis", 0L);
    }

    public void h(String str, String str2, int i) {
        j(str2);
        this.b = str;
        this.d = i;
        this.e = System.currentTimeMillis();
        i();
    }
}
