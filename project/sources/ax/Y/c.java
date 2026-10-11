package ax.Y;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import ax.sb.C3081m;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c {
    public static final Bundle a(C3081m<String, ? extends Object>... c3081mArr) {
        Bundle bundle = new Bundle(c3081mArr.length);
        for (C3081m<String, ? extends Object> c3081m : c3081mArr) {
            String a = c3081m.a();
            Object b = c3081m.b();
            if (b == null) {
                bundle.putString(a, null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(a, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(a, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(a, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(a, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(a, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(a, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(a, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(a, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(a, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(a, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(a, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(a, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(a, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(a, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(a, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(a, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(a, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(a, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(a, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                ax.Gb.l.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    ax.Gb.l.d(b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(a, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    ax.Gb.l.d(b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(a, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    ax.Gb.l.d(b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(a, (CharSequence[]) b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a + '\"');
                    }
                    bundle.putSerializable(a, (Serializable) b);
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(a, (Serializable) b);
            } else if (b instanceof IBinder) {
                bundle.putBinder(a, (IBinder) b);
            } else if (b instanceof Size) {
                a.a(bundle, a, (Size) b);
            } else {
                if (!(b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
                }
                a.b(bundle, a, (SizeF) b);
            }
        }
        return bundle;
    }
}
