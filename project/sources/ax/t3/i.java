package ax.t3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import ax.x3.C3408D;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class i {
    private Context a;
    private AdapterView.OnItemClickListener b;
    private ArrayList<String> c = new ArrayList<>();
    private C3408D d;
    private String e;

    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            try {
                i.this.c.remove(((Integer) view.getTag()).intValue());
                i.this.d.r();
                i.this.h();
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    public i(Context context, String str) {
        this.a = context;
        this.e = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("search_history", 0).edit();
        edit.putString("history_" + this.e, new JSONArray((Collection) this.c).toString());
        edit.apply();
    }

    public void d(String str) {
        this.c.remove(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.add(0, str);
        if (this.c.size() > 5) {
            this.c.remove(5);
        }
        C3408D c3408d = this.d;
        if (c3408d != null) {
            c3408d.r();
        }
        h();
    }

    public String e(int i) {
        return this.c.get(i);
    }

    public C3408D f() {
        if (this.d == null) {
            C3408D c3408d = new C3408D(this.a, this.c);
            this.d = c3408d;
            c3408d.S(new a());
            this.d.R(this.b);
        }
        return this.d;
    }

    public void g() {
        this.c.clear();
        String string = this.a.getSharedPreferences("search_history", 0).getString("history_" + this.e, null);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.c.add(jSONArray.getString(i));
                }
            } catch (JSONException unused) {
            }
        }
    }

    public void i(AdapterView.OnItemClickListener onItemClickListener) {
        this.b = onItemClickListener;
    }
}
