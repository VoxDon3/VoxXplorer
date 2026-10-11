/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import ax.b0.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat
extends CustomVersionedParcelable {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    PorterDuff.Mode h;
    public String i;
    public String j;

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
    }

    IconCompat(int n8) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
        this.a = n8;
    }

    public static IconCompat e(Icon icon) {
        return androidx.core.graphics.drawable.IconCompat$a.a(icon);
    }

    static Bitmap f(Bitmap bitmap, boolean bl) {
        int n8 = (int)((float)Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmap2 = Bitmap.createBitmap((int)n8, (int)n8, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint(3);
        float f8 = n8;
        float f9 = 0.5f * f8;
        float f10 = 0.9166667f * f9;
        if (bl) {
            float f11 = 0.010416667f * f8;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f8 * 0.020833334f, 0x3D000000);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 0x1E000000);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        tileMode = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float)(-(bitmap.getWidth() - n8)) / 2.0f, (float)(-(bitmap.getHeight() - n8)) / 2.0f);
        tileMode.setLocalMatrix(matrix);
        paint.setShader((Shader)tileMode);
        canvas.drawCircle(f9, f9, f10, paint);
        canvas.setBitmap(null);
        return bitmap2;
    }

    public static IconCompat g(Uri uri) {
        ax.b0.b.c(uri);
        return IconCompat.h(uri.toString());
    }

    public static IconCompat h(String string) {
        ax.b0.b.c(string);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.b = string;
        return iconCompat;
    }

    public static IconCompat i(Bitmap bitmap) {
        ax.b0.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat j(Uri uri) {
        ax.b0.b.c(uri);
        return IconCompat.k(uri.toString());
    }

    public static IconCompat k(String string) {
        ax.b0.b.c(string);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.b = string;
        return iconCompat;
    }

    public static IconCompat l(Context context, int n8) {
        ax.b0.b.c(context);
        return IconCompat.m(context.getResources(), context.getPackageName(), n8);
    }

    public static IconCompat m(Resources resources, String string, int n8) {
        ax.b0.b.c(string);
        if (n8 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = n8;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(n8);
                }
                catch (Resources.NotFoundException notFoundException) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = string;
            }
            iconCompat.j = string;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    static Resources q(Context context, String string) {
        PackageManager.NameNotFoundException nameNotFoundException2;
        block5: {
            block4: {
                ApplicationInfo applicationInfo;
                if ("android".equals(string)) {
                    return Resources.getSystem();
                }
                context = context.getPackageManager();
                try {
                    applicationInfo = context.getApplicationInfo(string, 8192);
                    if (applicationInfo == null) break block4;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException2) {}
                context = context.getResourcesForApplication(applicationInfo);
                return context;
                break block5;
            }
            return null;
        }
        Log.e((String)"IconCompat", (String)String.format("Unable to find pkg=%s for icon", string), (Throwable)nameNotFoundException2);
        return null;
    }

    private static String z(int n8) {
        switch (n8) {
            default: {
                return "UNKNOWN";
            }
            case 6: {
                return "URI_MASKABLE";
            }
            case 5: {
                return "BITMAP_MASKABLE";
            }
            case 4: {
                return "URI";
            }
            case 3: {
                return "DATA";
            }
            case 2: {
                return "RESOURCE";
            }
            case 1: 
        }
        return "BITMAP";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(Intent object, Drawable drawable, Context context) {
        int n8;
        block12: {
            block11: {
                PackageManager.NameNotFoundException nameNotFoundException2;
                block10: {
                    this.d(context);
                    n8 = this.a;
                    if (n8 == 1) break block11;
                    if (n8 != 2) {
                        if (n8 != 5) {
                            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                        }
                        context = IconCompat.f((Bitmap)this.b, true);
                        break block12;
                    } else {
                        try {
                            context = context.createPackageContext(this.p(), 0);
                            if (drawable == null) {
                                object.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", (Parcelable)Intent.ShortcutIconResource.fromContext((Context)context, (int)this.e));
                                return;
                            }
                        }
                        catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                            break block10;
                        }
                        Drawable drawable2 = ax.Q.b.e(context, this.e);
                        if (drawable2.getIntrinsicWidth() > 0 && drawable2.getIntrinsicHeight() > 0) {
                            context = Bitmap.createBitmap((int)drawable2.getIntrinsicWidth(), (int)drawable2.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
                        } else {
                            n8 = ((ActivityManager)context.getSystemService("activity")).getLauncherLargeIconSize();
                            context = Bitmap.createBitmap((int)n8, (int)n8, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                        }
                        drawable2.setBounds(0, 0, context.getWidth(), context.getHeight());
                        Canvas canvas = new Canvas((Bitmap)context);
                        drawable2.draw(canvas);
                    }
                    break block12;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Can't find package ");
                ((StringBuilder)object).append(this.b);
                throw new IllegalArgumentException(((StringBuilder)object).toString(), nameNotFoundException2);
            }
            Bitmap bitmap = (Bitmap)this.b;
            context = bitmap;
            if (drawable != null) {
                context = bitmap.copy(bitmap.getConfig(), true);
            }
        }
        if (drawable != null) {
            n8 = context.getWidth();
            int n9 = context.getHeight();
            drawable.setBounds(n8 / 2, n9 / 2, n8, n9);
            drawable.draw(new Canvas((Bitmap)context));
        }
        object.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)context);
    }

    public void d(Context object) {
        Object object2;
        if (this.a == 2 && (object2 = this.b) != null && ((String)(object2 = (String)object2)).contains(":")) {
            String string = ((String)object2).split(":", -1)[1];
            String string2 = string.split("/", -1)[0];
            String string3 = string.split("/", -1)[1];
            String string4 = ((String)object2).split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(string3)) {
                Log.i((String)"IconCompat", (String)"Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            string = this.p();
            int n8 = IconCompat.q((Context)object, string).getIdentifier(string3, string2, string4);
            if (this.e != n8) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Id has changed for ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" ");
                ((StringBuilder)object).append((String)object2);
                Log.i((String)"IconCompat", (String)((StringBuilder)object).toString());
                this.e = n8;
            }
        }
    }

    public Bitmap n() {
        int n8 = this.a;
        if (n8 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object object = this.b;
            if (object instanceof Bitmap) {
                return (Bitmap)object;
            }
            return null;
        }
        if (n8 == 1) {
            return (Bitmap)this.b;
        }
        if (n8 == 5) {
            return IconCompat.f((Bitmap)this.b, true);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("called getBitmap() on ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int o() {
        int n8 = this.a;
        if (n8 == -1 && Build.VERSION.SDK_INT >= 23) {
            return androidx.core.graphics.drawable.IconCompat$a.b(this.b);
        }
        if (n8 == 2) {
            return this.e;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("called getResId() on ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String p() {
        int n8 = this.a;
        if (n8 == -1 && Build.VERSION.SDK_INT >= 23) {
            return androidx.core.graphics.drawable.IconCompat$a.c(this.b);
        }
        if (n8 == 2) {
            String string = this.j;
            if (string != null && !TextUtils.isEmpty((CharSequence)string)) {
                return this.j;
            }
            return ((String)this.b).split(":", -1)[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("called getResPackage() on ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int r() {
        int n8;
        int n9 = n8 = this.a;
        if (n8 == -1) {
            n9 = n8;
            if (Build.VERSION.SDK_INT >= 23) {
                n9 = androidx.core.graphics.drawable.IconCompat$a.d(this.b);
            }
        }
        return n9;
    }

    public Uri s() {
        int n8 = this.a;
        if (n8 == -1 && Build.VERSION.SDK_INT >= 23) {
            return androidx.core.graphics.drawable.IconCompat$a.e(this.b);
        }
        if (n8 != 4 && n8 != 6) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("called getUri() on ");
            stringBuilder.append(this);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return Uri.parse((String)((String)this.b));
    }

    public InputStream t(Context object) {
        Uri uri = this.s();
        CharSequence charSequence = uri.getScheme();
        if (!"content".equals(charSequence) && !"file".equals(charSequence)) {
            try {
                object = new File((String)this.b);
                object = new FileInputStream((File)object);
                return object;
            }
            catch (FileNotFoundException fileNotFoundException) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Unable to load image from path: ");
                ((StringBuilder)charSequence).append(uri);
                Log.w((String)"IconCompat", (String)((StringBuilder)charSequence).toString(), (Throwable)fileNotFoundException);
            }
        } else {
            try {
                object = object.getContentResolver().openInputStream(uri);
                return object;
            }
            catch (Exception exception) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unable to load image from URI: ");
                ((StringBuilder)object).append(uri);
                Log.w((String)"IconCompat", (String)((StringBuilder)object).toString(), (Throwable)exception);
            }
        }
        return null;
    }

    public String toString() {
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder stringBuilder = new StringBuilder("Icon(typ=");
        stringBuilder.append(IconCompat.z(this.a));
        switch (this.a) {
            default: {
                break;
            }
            case 4: 
            case 6: {
                stringBuilder.append(" uri=");
                stringBuilder.append(this.b);
                break;
            }
            case 3: {
                stringBuilder.append(" len=");
                stringBuilder.append(this.e);
                if (this.f == 0) break;
                stringBuilder.append(" off=");
                stringBuilder.append(this.f);
                break;
            }
            case 2: {
                stringBuilder.append(" pkg=");
                stringBuilder.append(this.j);
                stringBuilder.append(" id=");
                stringBuilder.append(String.format("0x%08x", this.o()));
                break;
            }
            case 1: 
            case 5: {
                stringBuilder.append(" size=");
                stringBuilder.append(((Bitmap)this.b).getWidth());
                stringBuilder.append("x");
                stringBuilder.append(((Bitmap)this.b).getHeight());
            }
        }
        if (this.g != null) {
            stringBuilder.append(" tint=");
            stringBuilder.append(this.g);
        }
        if (this.h != k) {
            stringBuilder.append(" mode=");
            stringBuilder.append(this.h);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void u() {
        this.h = PorterDuff.Mode.valueOf((String)this.i);
        switch (this.a) {
            default: {
                return;
            }
            case 3: {
                this.b = this.c;
                return;
            }
            case 2: 
            case 4: 
            case 6: {
                String string = new String(this.c, Charset.forName("UTF-16"));
                this.b = string;
                if (this.a != 2 || this.j != null) return;
                this.j = string.split(":", -1)[0];
                return;
            }
            case 1: 
            case 5: {
                Parcelable parcelable = this.d;
                if (parcelable != null) {
                    this.b = parcelable;
                    return;
                }
                byte[] byArray = this.c;
                this.b = byArray;
                this.a = 3;
                this.e = 0;
                this.f = byArray.length;
                return;
            }
            case -1: 
        }
        Parcelable parcelable = this.d;
        if (parcelable == null) throw new IllegalArgumentException("Invalid icon");
        this.b = parcelable;
    }

    public void v(boolean bl) {
        this.i = this.h.name();
        switch (this.a) {
            default: {
                return;
            }
            case 4: 
            case 6: {
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 3: {
                this.c = (byte[])this.b;
                return;
            }
            case 2: {
                this.c = ((String)this.b).getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 1: 
            case 5: {
                if (bl) {
                    Bitmap bitmap = (Bitmap)this.b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, (OutputStream)byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.d = (Parcelable)this.b;
                return;
            }
            case -1: 
        }
        if (!bl) {
            this.d = (Parcelable)this.b;
            return;
        }
        throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
    }

    public Bundle w() {
        Bundle bundle = new Bundle();
        switch (this.a) {
            default: {
                throw new IllegalArgumentException("Invalid icon");
            }
            case 3: {
                bundle.putByteArray("obj", (byte[])this.b);
                break;
            }
            case 2: 
            case 4: 
            case 6: {
                bundle.putString("obj", (String)this.b);
                break;
            }
            case 1: 
            case 5: {
                bundle.putParcelable("obj", (Parcelable)((Bitmap)this.b));
                break;
            }
            case -1: {
                bundle.putParcelable("obj", (Parcelable)this.b);
            }
        }
        bundle.putInt("type", this.a);
        bundle.putInt("int1", this.e);
        bundle.putInt("int2", this.f);
        bundle.putString("string1", this.j);
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", (Parcelable)colorStateList);
        }
        if ((colorStateList = this.h) != k) {
            bundle.putString("tint_mode", colorStateList.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon x() {
        return this.y(null);
    }

    public Icon y(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return androidx.core.graphics.drawable.IconCompat$a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    static class a {
        static IconCompat a(Object object) {
            ax.b0.g.g(object);
            int n8 = androidx.core.graphics.drawable.IconCompat$a.d(object);
            if (n8 != 2) {
                if (n8 != 4) {
                    if (n8 != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.b = object;
                        return iconCompat;
                    }
                    return IconCompat.g(androidx.core.graphics.drawable.IconCompat$a.e(object));
                }
                return IconCompat.j(androidx.core.graphics.drawable.IconCompat$a.e(object));
            }
            return IconCompat.m(null, androidx.core.graphics.drawable.IconCompat$a.c(object), androidx.core.graphics.drawable.IconCompat$a.b(object));
        }

        static int b(Object object) {
            IllegalAccessException illegalAccessException2;
            block6: {
                InvocationTargetException invocationTargetException2;
                block5: {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return androidx.core.graphics.drawable.IconCompat$c.a(object);
                    }
                    try {
                        int n8 = (Integer)object.getClass().getMethod("getResId", null).invoke(object, null);
                        return n8;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block5;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block6;
                    }
                    Log.e((String)"IconCompat", (String)"Unable to get icon resource", (Throwable)noSuchMethodException);
                    return 0;
                }
                Log.e((String)"IconCompat", (String)"Unable to get icon resource", (Throwable)invocationTargetException2);
                return 0;
            }
            Log.e((String)"IconCompat", (String)"Unable to get icon resource", (Throwable)illegalAccessException2);
            return 0;
        }

        static String c(Object object) {
            IllegalAccessException illegalAccessException2;
            block6: {
                InvocationTargetException invocationTargetException2;
                block5: {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return androidx.core.graphics.drawable.IconCompat$c.b(object);
                    }
                    try {
                        object = (String)object.getClass().getMethod("getResPackage", null).invoke(object, null);
                        return object;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block5;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block6;
                    }
                    Log.e((String)"IconCompat", (String)"Unable to get icon package", (Throwable)noSuchMethodException);
                    return null;
                }
                Log.e((String)"IconCompat", (String)"Unable to get icon package", (Throwable)invocationTargetException2);
                return null;
            }
            Log.e((String)"IconCompat", (String)"Unable to get icon package", (Throwable)illegalAccessException2);
            return null;
        }

        static int d(Object object) {
            IllegalAccessException illegalAccessException2;
            block6: {
                InvocationTargetException invocationTargetException2;
                block5: {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return androidx.core.graphics.drawable.IconCompat$c.c(object);
                    }
                    try {
                        int n8 = (Integer)object.getClass().getMethod("getType", null).invoke(object, null);
                        return n8;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block5;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block6;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unable to get icon type ");
                    stringBuilder.append(object);
                    Log.e((String)"IconCompat", (String)stringBuilder.toString(), (Throwable)noSuchMethodException);
                    return -1;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to get icon type ");
                stringBuilder.append(object);
                Log.e((String)"IconCompat", (String)stringBuilder.toString(), (Throwable)invocationTargetException2);
                return -1;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to get icon type ");
            stringBuilder.append(object);
            Log.e((String)"IconCompat", (String)stringBuilder.toString(), (Throwable)illegalAccessException2);
            return -1;
        }

        static Uri e(Object object) {
            IllegalAccessException illegalAccessException2;
            block6: {
                InvocationTargetException invocationTargetException2;
                block5: {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return androidx.core.graphics.drawable.IconCompat$c.d(object);
                    }
                    try {
                        object = (Uri)object.getClass().getMethod("getUri", null).invoke(object, null);
                        return object;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block5;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block6;
                    }
                    Log.e((String)"IconCompat", (String)"Unable to get icon uri", (Throwable)noSuchMethodException);
                    return null;
                }
                Log.e((String)"IconCompat", (String)"Unable to get icon uri", (Throwable)invocationTargetException2);
                return null;
            }
            Log.e((String)"IconCompat", (String)"Unable to get icon uri", (Throwable)illegalAccessException2);
            return null;
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /*
         * Unable to fully structure code
         */
        static Icon g(IconCompat var0, Context var1_1) {
            switch (var0.a) {
                default: {
                    throw new IllegalArgumentException("Unknown type");
                }
                case 6: {
                    var2_2 = Build.VERSION.SDK_INT;
                    if (var2_2 < 30) ** GOTO lbl9
                    var1_1 = androidx.core.graphics.drawable.IconCompat$d.a(var0.s());
                    ** GOTO lbl39
lbl9:
                    // 1 sources

                    if (var1_1 == null) ** GOTO lbl19
                    if ((var1_1 = var0.t((Context)var1_1)) == null) ** GOTO lbl13
                    var1_1 = var2_2 >= 26 ? androidx.core.graphics.drawable.IconCompat$b.b(BitmapFactory.decodeStream((InputStream)var1_1)) : Icon.createWithBitmap((Bitmap)IconCompat.f(BitmapFactory.decodeStream((InputStream)var1_1), false));
                    ** GOTO lbl39
lbl13:
                    // 1 sources

                    var1_1 = new StringBuilder();
                    var1_1.append("Cannot load adaptive icon from uri: ");
                    var1_1.append(var0.s());
                    throw new IllegalStateException(var1_1.toString());
lbl19:
                    // 1 sources

                    var1_1 = new StringBuilder();
                    var1_1.append("Context is required to resolve the file uri of the icon: ");
                    var1_1.append(var0.s());
                    throw new IllegalArgumentException(var1_1.toString());
                }
                case 5: {
                    var1_1 = Build.VERSION.SDK_INT >= 26 ? androidx.core.graphics.drawable.IconCompat$b.b((Bitmap)var0.b) : Icon.createWithBitmap((Bitmap)IconCompat.f((Bitmap)var0.b, false));
                    ** GOTO lbl39
                }
                case 4: {
                    var1_1 = Icon.createWithContentUri((String)((String)var0.b));
                    ** GOTO lbl39
                }
                case 3: {
                    var1_1 = Icon.createWithData((byte[])((byte[])var0.b), (int)var0.e, (int)var0.f);
                    ** GOTO lbl39
                }
                case 2: {
                    var1_1 = Icon.createWithResource((String)var0.p(), (int)var0.e);
                    ** GOTO lbl39
                }
                case 1: {
                    var1_1 = Icon.createWithBitmap((Bitmap)((Bitmap)var0.b));
lbl39:
                    // 7 sources

                    var3_3 = var0.g;
                    if (var3_3 != null) {
                        var1_1.setTintList(var3_3);
                    }
                    if ((var0 = var0.h) != IconCompat.k) {
                        var1_1.setTintMode((PorterDuff.Mode)var0);
                    }
                    return var1_1;
                }
                case -1: 
            }
            return (Icon)var0.b;
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap((Bitmap)bitmap);
        }
    }

    static class c {
        static int a(Object object) {
            return ((Icon)object).getResId();
        }

        static String b(Object object) {
            return ((Icon)object).getResPackage();
        }

        static int c(Object object) {
            return ((Icon)object).getType();
        }

        static Uri d(Object object) {
            return ((Icon)object).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri((Uri)uri);
        }
    }
}

