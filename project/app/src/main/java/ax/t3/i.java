/*
 * Decompiled with CFR 0.152.
 */
package ax.t3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import ax.g3.c;
import ax.x3.D;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class i {
    private Context a;
    private AdapterView.OnItemClickListener b;
    private ArrayList<String> c = new ArrayList();
    private D d;
    private String e;

    public i(Context context, String string) {
        this.a = context;
        this.e = string;
    }

    private void h() {
        SharedPreferences.Editor editor = this.a.getSharedPreferences("search_history", 0).edit();
        String string = new JSONArray(this.c).toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("history_");
        stringBuilder.append(this.e);
        editor.putString(stringBuilder.toString(), string);
        editor.apply();
    }

    public void d(String object) {
        this.c.remove(object);
        if (TextUtils.isEmpty((CharSequence)object)) {
            return;
        }
        this.c.add(0, (String)object);
        if (this.c.size() > 5) {
            this.c.remove(5);
        }
        if ((object = this.d) != null) {
            ((RecyclerView.h)object).r();
        }
        this.h();
    }

    public String e(int n8) {
        return this.c.get(n8);
    }

    public D f() {
        if (this.d == null) {
            D d8;
            this.d = d8 = new D(this.a, this.c);
            d8.S(new c(this){
                final i c;
                {
                    this.c = i8;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public void a(View view) {
                    try {
                        int n8 = (Integer)view.getTag();
                        this.c.c.remove(n8);
                        this.c.d.r();
                        this.c.h();
                        return;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        return;
                    }
                }
            });
            this.d.R(this.b);
        }
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g() {
        this.c.clear();
        Context context = this.a;
        int i8 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("search_history", 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("history_");
        stringBuilder.append(this.e);
        String string = sharedPreferences.getString(stringBuilder.toString(), null);
        if (string == null) return;
        try {
            stringBuilder = new JSONArray(string);
            while (i8 < stringBuilder.length()) {
                this.c.add(stringBuilder.getString(i8));
                ++i8;
            }
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    public void i(AdapterView.OnItemClickListener onItemClickListener) {
        this.b = onItemClickListener;
    }
}

