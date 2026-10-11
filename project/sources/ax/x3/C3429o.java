package ax.x3;

import android.R;
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
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.x3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3429o extends ArrayAdapter<a> {
    private static List<String> a = Arrays.asList("UTF-8", "UTF-16", "UTF-16BE", "UTF-16LE", "GBK", "EUC-KR", "EUC-JP", "Shift_JIS", "BIG5", "ISO-8859-1", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "WINDOWS-1250", "WINDOWS-1251", "WINDOWS-1252", "WINDOWS-1253", "WINDOWS-1254", "WINDOWS-1255", "WINDOWS-1256", "WINDOWS-1257", "WINDOWS-1258");

    public C3429o(Context context) {
        super(context, 0, a(context));
    }

    public static List<a> a(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(a.a(it.next()));
            } catch (UnsupportedCharsetException unused) {
            }
        }
        arrayList.add(0, a.b(context));
        return arrayList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = view == null ? (TextView) LayoutInflater.from(getContext()).inflate(R.layout.simple_dropdown_item_1line, viewGroup, false) : (TextView) view;
        textView.setText(((a) getItem(i)).a);
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = view == null ? (TextView) LayoutInflater.from(getContext()).inflate(com.voxdon.xplorer.R.layout.view_charset_encoding, viewGroup, false) : (TextView) view;
        textView.setText(((a) getItem(i)).a);
        return textView;
    }

    /* renamed from: ax.x3.o$a */
    public static class a {
        String a;
        Charset b;

        a(String str) {
            this.a = str;
            this.b = Charset.forName(str);
        }

        public static a a(String str) {
            return new a(str);
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

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Charset charset = this.b;
            return charset != null ? charset.equals(((a) obj).b) : this.a.equals(((a) obj).a);
        }

        a(Context context) {
            this.a = context.getString(com.voxdon.xplorer.R.string.automatic);
            this.b = null;
        }
    }
}
