/*
 * Decompiled with CFR 0.152.
 */
package ax.h3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import ax.L0.a;
import ax.S4.c;
import ax.Z2.k;

public class b {
    private static b h;
    private Context a;
    public String b;
    public String c;
    public int d;
    public long e;
    public k f;
    private BroadcastReceiver g = new BroadcastReceiver(this){
        final b a;
        {
            this.a = b8;
        }

        public void onReceive(Context object, Intent object2) {
            if ("local.intent.action.LOCAL_PLAYLIST_SAVE".equals(object2.getAction())) {
                object = object2.getStringExtra("folder_uri");
                int n8 = object2.getIntExtra("current_position", 0);
                if ((object2 = object2.getStringExtra("media_id")) != null && (object2 = ax.S4.c.b((String)object2)) != null && k.f(Uri.parse((String)object2))) {
                    this.a.h((String)object, (String)object2, n8);
                    return;
                }
                this.a.a();
                return;
            }
            if ("local.intent.action.LOCAL_PLAYLIST_CLEAR".equals(object2.getAction())) {
                this.a.a();
            }
        }
    };

    private b(Context context) {
        this.a = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("local.intent.action.LOCAL_PLAYLIST_SAVE");
        intentFilter.addAction("local.intent.action.LOCAL_PLAYLIST_CLEAR");
        ax.L0.a.b(context).c(this.g, intentFilter);
    }

    public static b b(Context context) {
        if (h == null) {
            h = new b(context);
        }
        return h;
    }

    private void i() {
        SharedPreferences.Editor editor = this.a.getSharedPreferences("music_playlist", 0).edit();
        editor.putString("folder_location_uri", this.b);
        editor.putString("media_location_uri", this.c);
        editor.putInt("media_position", this.d);
        editor.putLong("save_time_millis", this.e);
        editor.apply();
    }

    private void j(String string) {
        this.c = string;
        this.f = null;
    }

    public void a() {
        this.j(null);
        this.b = null;
        this.d = 0;
        this.e = 0L;
        this.a.getSharedPreferences("music_playlist", 0).edit().clear().apply();
    }

    public k c() {
        Object object = this.f;
        if (object != null) {
            return object;
        }
        object = this.c;
        if (object == null) {
            return null;
        }
        try {
            this.f = object = k.a(Uri.parse((String)object));
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public long d() {
        return this.e;
    }

    public boolean e() {
        return this.c != null;
    }

    public boolean f(long l8) {
        if (!this.e()) {
            return true;
        }
        if (l8 == 0L) {
            return false;
        }
        long l9 = this.d();
        if (l9 == 0L) {
            return true;
        }
        return System.currentTimeMillis() - l9 > l8;
    }

    public void g() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("music_playlist", 0);
        this.j(sharedPreferences.getString("media_location_uri", null));
        this.b = sharedPreferences.getString("folder_location_uri", null);
        this.d = sharedPreferences.getInt("media_position", 0);
        this.e = sharedPreferences.getLong("save_time_millis", 0L);
    }

    public void h(String string, String string2, int n8) {
        this.j(string2);
        this.b = string;
        this.d = n8;
        this.e = System.currentTimeMillis();
        this.i();
    }
}

