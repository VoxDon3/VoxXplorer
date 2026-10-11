/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import ax.Q.b;
import ax.i0.c;
import ax.m.f;
import java.io.FileNotFoundException;
import java.util.WeakHashMap;

class G
extends c
implements View.OnClickListener {
    private final SearchView l;
    private final SearchableInfo m;
    private final Context n;
    private final WeakHashMap<String, Drawable.ConstantState> o;
    private final int p;
    private boolean q = false;
    private int r = 1;
    private ColorStateList s;
    private int t = -1;
    private int u = -1;
    private int v = -1;
    private int w = -1;
    private int x = -1;
    private int y = -1;

    public G(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.l = searchView;
        this.m = searchableInfo;
        this.p = searchView.getSuggestionCommitIconResId();
        this.n = context;
        this.o = weakHashMap;
    }

    private void A(String string, Drawable drawable) {
        if (drawable != null) {
            this.o.put(string, drawable.getConstantState());
        }
    }

    private void B(Cursor object) {
        if ((object = object != null ? object.getExtras() : null) != null) {
            object.getBoolean("in_progress");
        }
    }

    private Drawable k(String string) {
        if ((string = this.o.get(string)) == null) {
            return null;
        }
        return string.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        TypedValue typedValue;
        if (this.s == null) {
            typedValue = new TypedValue();
            this.n.getTheme().resolveAttribute(ax.m.a.O, typedValue, true);
            this.s = this.n.getResources().getColorStateList(typedValue.resourceId);
        }
        typedValue = new SpannableString(charSequence);
        typedValue.setSpan((Object)new TextAppearanceSpan(null, 0, 0, this.s, null), 0, charSequence.length(), 33);
        return typedValue;
    }

    private Drawable m(ComponentName componentName) {
        Object object;
        PackageManager packageManager = this.n.getPackageManager();
        try {
            object = packageManager.getActivityInfo(componentName, 128);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.w((String)"SuggestionsAdapter", (String)((Object)((Object)nameNotFoundException)).toString());
            return null;
        }
        int n8 = object.getIconResource();
        if (n8 == 0) {
            return null;
        }
        object = packageManager.getDrawable(componentName.getPackageName(), n8, ((ActivityInfo)object).applicationInfo);
        if (object == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid icon resource ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" for ");
            ((StringBuilder)object).append(componentName.flattenToShortString());
            Log.w((String)"SuggestionsAdapter", (String)((StringBuilder)object).toString());
            return null;
        }
        return object;
    }

    private Drawable n(ComponentName object) {
        String string = object.flattenToShortString();
        boolean bl = this.o.containsKey(string);
        Object var3_4 = null;
        if (bl) {
            object = this.o.get(string);
            if (object == null) {
                return null;
            }
            return object.newDrawable(this.n.getResources());
        }
        Drawable drawable = this.m((ComponentName)object);
        object = drawable == null ? var3_4 : drawable.getConstantState();
        this.o.put(string, (Drawable.ConstantState)object);
        return drawable;
    }

    public static String o(Cursor cursor, String string) {
        return G.w(cursor, cursor.getColumnIndex(string));
    }

    private Drawable p() {
        Drawable drawable = this.n(this.m.getSearchActivity());
        if (drawable != null) {
            return drawable;
        }
        return this.n.getPackageManager().getDefaultActivityIcon();
    }

    /*
     * Exception decompiling
     */
    private Drawable q(Uri var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3 : 28->82)] java.io.FileNotFoundException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private Drawable s(String string) {
        StringBuilder stringBuilder;
        CharSequence charSequence = stringBuilder = null;
        if (string != null) {
            charSequence = stringBuilder;
            if (!string.isEmpty()) {
                if ("0".equals(string)) {
                    charSequence = stringBuilder;
                } else {
                    int n8;
                    block9: {
                        n8 = Integer.parseInt(string);
                        charSequence = new StringBuilder();
                        charSequence.append("android.resource://");
                        charSequence.append(this.n.getPackageName());
                        charSequence.append("/");
                        charSequence.append(n8);
                        charSequence = charSequence.toString();
                        stringBuilder = this.k((String)charSequence);
                        if (stringBuilder == null) break block9;
                        return stringBuilder;
                    }
                    try {
                        stringBuilder = ax.Q.b.e(this.n, n8);
                        this.A((String)charSequence, (Drawable)stringBuilder);
                        return stringBuilder;
                    }
                    catch (NumberFormatException numberFormatException) {
                    }
                    catch (Resources.NotFoundException notFoundException) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Icon resource not found: ");
                        stringBuilder2.append(string);
                        Log.w((String)"SuggestionsAdapter", (String)stringBuilder2.toString());
                        return null;
                    }
                    charSequence = this.k(string);
                    if (charSequence != null) {
                        return charSequence;
                    }
                    charSequence = this.q(Uri.parse((String)string));
                    this.A(string, (Drawable)charSequence);
                }
            }
        }
        return charSequence;
    }

    private Drawable t(Cursor cursor) {
        int n8 = this.w;
        if (n8 == -1) {
            return null;
        }
        if ((cursor = this.s(cursor.getString(n8))) != null) {
            return cursor;
        }
        return this.p();
    }

    private Drawable u(Cursor cursor) {
        int n8 = this.x;
        if (n8 == -1) {
            return null;
        }
        return this.s(cursor.getString(n8));
    }

    private static String w(Cursor object, int n8) {
        if (n8 == -1) {
            return null;
        }
        try {
            object = object.getString(n8);
            return object;
        }
        catch (Exception exception) {
            Log.e((String)"SuggestionsAdapter", (String)"unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)exception);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int n8) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(n8);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
    }

    @Override
    public void a(Cursor cursor) {
        block6: {
            if (this.q) {
                Log.w((String)"SuggestionsAdapter", (String)"Tried to change cursor after adapter was closed.");
                if (cursor != null) {
                    cursor.close();
                    return;
                }
            } else {
                super.a(cursor);
                if (cursor == null) break block6;
                try {
                    this.t = cursor.getColumnIndex("suggest_text_1");
                    this.u = cursor.getColumnIndex("suggest_text_2");
                    this.v = cursor.getColumnIndex("suggest_text_2_url");
                    this.w = cursor.getColumnIndex("suggest_icon_1");
                    this.x = cursor.getColumnIndex("suggest_icon_2");
                    this.y = cursor.getColumnIndex("suggest_flags");
                    return;
                }
                catch (Exception exception) {
                    Log.e((String)"SuggestionsAdapter", (String)"error changing cursor and caching columns", (Throwable)exception);
                }
            }
        }
    }

    @Override
    public CharSequence c(Cursor object) {
        if (object == null) {
            return null;
        }
        String string = G.o(object, "suggest_intent_query");
        if (string != null) {
            return string;
        }
        if (this.m.shouldRewriteQueryFromData() && (string = G.o(object, "suggest_intent_data")) != null) {
            return string;
        }
        if (this.m.shouldRewriteQueryFromText() && (object = G.o(object, "suggest_text_1")) != null) {
            return object;
        }
        return null;
    }

    @Override
    public Cursor d(CharSequence charSequence) {
        block4: {
            charSequence = charSequence == null ? "" : charSequence.toString();
            if (this.l.getVisibility() == 0 && this.l.getWindowVisibility() == 0) {
                charSequence = this.v(this.m, (String)charSequence, 50);
                if (charSequence == null) break block4;
                try {
                    charSequence.getCount();
                    return charSequence;
                }
                catch (RuntimeException runtimeException) {
                    Log.w((String)"SuggestionsAdapter", (String)"Search suggestions query threw an exception.", (Throwable)runtimeException);
                }
            }
        }
        return null;
    }

    @Override
    public void e(View object, Context object2, Cursor cursor) {
        int n8;
        object2 = (a)object.getTag();
        int n9 = this.y;
        n9 = n9 != -1 ? cursor.getInt(n9) : 0;
        if (object2.a != null) {
            object = G.w(cursor, this.t);
            this.z(object2.a, (CharSequence)object);
        }
        if (object2.b != null) {
            object = G.w(cursor, this.v);
            object = object != null ? this.l((CharSequence)object) : G.w(cursor, this.u);
            if (TextUtils.isEmpty((CharSequence)object)) {
                TextView textView = object2.a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    object2.a.setMaxLines(2);
                }
            } else {
                TextView textView = object2.a;
                if (textView != null) {
                    textView.setSingleLine(true);
                    object2.a.setMaxLines(1);
                }
            }
            this.z(object2.b, (CharSequence)object);
        }
        if ((object = object2.c) != null) {
            this.y((ImageView)object, this.t(cursor), 4);
        }
        if ((object = object2.d) != null) {
            this.y((ImageView)object, this.u(cursor), 8);
        }
        if ((n8 = this.r) != 2 && (n8 != 1 || (n9 & 1) == 0)) {
            object2.e.setVisibility(8);
            return;
        }
        object2.e.setVisibility(0);
        object2.e.setTag((Object)object2.a.getText());
        object2.e.setOnClickListener((View.OnClickListener)this);
    }

    @Override
    public View getDropDownView(int n8, View view, ViewGroup viewGroup) {
        try {
            view = super.getDropDownView(n8, view, viewGroup);
            return view;
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"SuggestionsAdapter", (String)"Search suggestions cursor threw exception.", (Throwable)runtimeException);
            viewGroup = this.g(this.n, this.b(), viewGroup);
            if (viewGroup != null) {
                ((a)viewGroup.getTag()).a.setText((CharSequence)((Object)runtimeException).toString());
            }
            return viewGroup;
        }
    }

    @Override
    public View getView(int n8, View view, ViewGroup viewGroup) {
        try {
            view = super.getView(n8, view, viewGroup);
            return view;
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"SuggestionsAdapter", (String)"Search suggestions cursor threw exception.", (Throwable)runtimeException);
            viewGroup = this.h(this.n, this.b(), viewGroup);
            if (viewGroup != null) {
                ((a)viewGroup.getTag()).a.setText((CharSequence)((Object)runtimeException).toString());
            }
            return viewGroup;
        }
    }

    @Override
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        context = super.h(context, cursor, viewGroup);
        context.setTag((Object)new a((View)context));
        ((ImageView)context.findViewById(ax.m.f.q)).setImageResource(this.p);
        return context;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.B(this.b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.B(this.b());
    }

    public void onClick(View object) {
        if ((object = object.getTag()) instanceof CharSequence) {
            this.l.M((CharSequence)object);
        }
    }

    Drawable r(Uri uri) throws FileNotFoundException {
        block10: {
            Object object;
            block11: {
                block12: {
                    Resources resources;
                    String string = uri.getAuthority();
                    if (TextUtils.isEmpty((CharSequence)string)) break block10;
                    try {
                        resources = this.n.getPackageManager().getResourcesForApplication(string);
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("No package found for authority: ");
                        stringBuilder.append(uri);
                        throw new FileNotFoundException(stringBuilder.toString());
                    }
                    object = uri.getPathSegments();
                    if (object == null) break block11;
                    int n8 = object.size();
                    if (n8 == 1) {
                        try {
                            n8 = Integer.parseInt((String)object.get(0));
                        }
                        catch (NumberFormatException numberFormatException) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Single path segment is not a resource ID: ");
                            stringBuilder.append(uri);
                            throw new FileNotFoundException(stringBuilder.toString());
                        }
                    }
                    if (n8 != 2) break block12;
                    n8 = resources.getIdentifier((String)object.get(1), (String)object.get(0), string);
                    if (n8 != 0) {
                        return resources.getDrawable(n8);
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("No resource found for: ");
                    ((StringBuilder)object).append(uri);
                    throw new FileNotFoundException(((StringBuilder)object).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("More than two path segments: ");
                ((StringBuilder)object).append(uri);
                throw new FileNotFoundException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("No path: ");
            ((StringBuilder)object).append(uri);
            throw new FileNotFoundException(((StringBuilder)object).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No authority: ");
        stringBuilder.append(uri);
        throw new FileNotFoundException(stringBuilder.toString());
    }

    Cursor v(SearchableInfo stringArray, String string, int n8) {
        Object var4_4 = null;
        if (stringArray == null) {
            return null;
        }
        String string2 = stringArray.getSuggestAuthority();
        if (string2 == null) {
            return null;
        }
        string2 = new Uri.Builder().scheme("content").authority(string2).query("").fragment("");
        String string3 = stringArray.getSuggestPath();
        if (string3 != null) {
            string2.appendEncodedPath(string3);
        }
        string2.appendPath("search_suggest_query");
        string3 = stringArray.getSuggestSelection();
        if (string3 != null) {
            stringArray = new String[]{string};
        } else {
            string2.appendPath(string);
            stringArray = var4_4;
        }
        if (n8 > 0) {
            string2.appendQueryParameter("limit", String.valueOf(n8));
        }
        string = string2.build();
        return this.n.getContentResolver().query((Uri)string, null, string3, stringArray, null);
    }

    public void x(int n8) {
        this.r = n8;
    }

    private static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView)view.findViewById(16908308);
            this.b = (TextView)view.findViewById(16908309);
            this.c = (ImageView)view.findViewById(16908295);
            this.d = (ImageView)view.findViewById(16908296);
            this.e = (ImageView)view.findViewById(ax.m.f.q);
        }
    }
}

