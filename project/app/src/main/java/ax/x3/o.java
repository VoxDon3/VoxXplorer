/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class o
extends ArrayAdapter<a> {
    private static List<String> a = Arrays.asList("UTF-8", "UTF-16", "UTF-16BE", "UTF-16LE", "GBK", "EUC-KR", "EUC-JP", "Shift_JIS", "BIG5", "ISO-8859-1", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "WINDOWS-1250", "WINDOWS-1251", "WINDOWS-1252", "WINDOWS-1253", "WINDOWS-1254", "WINDOWS-1255", "WINDOWS-1256", "WINDOWS-1257", "WINDOWS-1258");

    public o(Context context) {
        super(context, 0, o.a(context));
    }

    public static List<a> a(Context context) {
        ArrayList<a> arrayList = new ArrayList<a>();
        for (String string : a) {
            try {
                arrayList.add(ax.x3.o$a.a(string));
            }
            catch (UnsupportedCharsetException unsupportedCharsetException) {}
        }
        arrayList.add(0, ax.x3.o$a.b(context));
        return arrayList;
    }

    public View getDropDownView(int n8, View view, ViewGroup viewGroup) {
        view = view == null ? (TextView)LayoutInflater.from((Context)this.getContext()).inflate(17367050, viewGroup, false) : (TextView)view;
        view.setText((CharSequence)((a)this.getItem((int)n8)).a);
        return view;
    }

    public View getView(int n8, View view, ViewGroup viewGroup) {
        view = view == null ? (TextView)LayoutInflater.from((Context)this.getContext()).inflate(2131558705, viewGroup, false) : (TextView)view;
        view.setText((CharSequence)((a)this.getItem((int)n8)).a);
        return view;
    }

    public static class a {
        String a;
        Charset b;

        a(Context context) {
            this.a = context.getString(2131951679);
            this.b = null;
        }

        a(String string) {
            this.a = string;
            this.b = Charset.forName(string);
        }

        public static a a(String string) {
            return new a(string);
        }

        public static a b(Context context) {
            return new a(context);
        }

        public String c() {
            Charset charset = this.b;
            if (charset == null) {
                return null;
            }
            return charset.name();
        }

        public final boolean equals(Object object) {
            if (!(object instanceof a)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            Charset charset = this.b;
            if (charset != null) {
                return charset.equals(((a)object).b);
            }
            return this.a.equals(((a)object).a);
        }
    }
}

