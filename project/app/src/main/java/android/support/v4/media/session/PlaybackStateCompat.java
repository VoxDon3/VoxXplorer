/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import ax.g.f;
import ax.g.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint(value={"BanParcelableUsage"})
public final class PlaybackStateCompat
implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>(){

        public PlaybackStateCompat a(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public PlaybackStateCompat[] b(int n8) {
            return new PlaybackStateCompat[n8];
        }
    };
    final long c0;
    final long d0;
    final float e0;
    final long f0;
    final int g0;
    final CharSequence h0;
    final long i0;
    List<CustomAction> j0;
    final long k0;
    final Bundle l0;
    private PlaybackState m0;
    final int q;

    PlaybackStateCompat(int n8, long l8, long l9, float f8, long l10, int n9, CharSequence charSequence, long l11, List<CustomAction> list, long l12, Bundle bundle) {
        this.q = n8;
        this.c0 = l8;
        this.d0 = l9;
        this.e0 = f8;
        this.f0 = l10;
        this.g0 = n9;
        this.h0 = charSequence;
        this.i0 = l11;
        this.j0 = new ArrayList<CustomAction>(list);
        this.k0 = l12;
        this.l0 = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.q = parcel.readInt();
        this.c0 = parcel.readLong();
        this.e0 = parcel.readFloat();
        this.i0 = parcel.readLong();
        this.d0 = parcel.readLong();
        this.f0 = parcel.readLong();
        this.h0 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j0 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.k0 = parcel.readLong();
        this.l0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.g0 = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object object) {
        Bundle bundle = null;
        if (object != null) {
            PlaybackState playbackState = (PlaybackState)object;
            List<PlaybackState.CustomAction> list = b.j(playbackState);
            if (list != null) {
                object = new ArrayList<CustomAction>(list.size());
                list = list.iterator();
                while (list.hasNext()) {
                    object.add(CustomAction.a(list.next()));
                }
            } else {
                object = null;
            }
            if (Build.VERSION.SDK_INT >= 22) {
                bundle = c.a(playbackState);
                MediaSessionCompat.a(bundle);
            }
            object = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), (List<CustomAction>)object, b.h(playbackState), bundle);
            ((PlaybackStateCompat)object).m0 = playbackState;
            return object;
        }
        return null;
    }

    public long b() {
        return this.f0;
    }

    public CharSequence c() {
        return this.h0;
    }

    public Bundle d() {
        return this.l0;
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.i0;
    }

    public float f() {
        return this.e0;
    }

    public Object g() {
        if (this.m0 == null) {
            PlaybackState.Builder builder = b.d();
            b.x(builder, this.q, this.c0, this.e0, this.i0);
            b.u(builder, this.d0);
            b.s(builder, this.f0);
            b.v(builder, this.h0);
            Iterator<CustomAction> iterator = this.j0.iterator();
            while (iterator.hasNext()) {
                b.a(builder, (PlaybackState.CustomAction)iterator.next().b());
            }
            b.t(builder, this.k0);
            if (Build.VERSION.SDK_INT >= 22) {
                c.b(builder, this.l0);
            }
            this.m0 = b.c(builder);
        }
        return this.m0;
    }

    public long i() {
        return this.c0;
    }

    public int j() {
        return this.q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.q);
        stringBuilder.append(", position=");
        stringBuilder.append(this.c0);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.d0);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.e0);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.i0);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.f0);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.g0);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.h0);
        stringBuilder.append(", custom actions=");
        stringBuilder.append(this.j0);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.k0);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeInt(this.q);
        parcel.writeLong(this.c0);
        parcel.writeFloat(this.e0);
        parcel.writeLong(this.i0);
        parcel.writeLong(this.d0);
        parcel.writeLong(this.f0);
        TextUtils.writeToParcel((CharSequence)this.h0, (Parcel)parcel, (int)n8);
        parcel.writeTypedList(this.j0);
        parcel.writeLong(this.k0);
        parcel.writeBundle(this.l0);
        parcel.writeInt(this.g0);
    }

    public static final class CustomAction
    implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>(){

            public CustomAction a(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public CustomAction[] b(int n8) {
                return new CustomAction[n8];
            }
        };
        private final CharSequence c0;
        private final int d0;
        private final Bundle e0;
        private PlaybackState.CustomAction f0;
        private final String q;

        CustomAction(Parcel parcel) {
            this.q = parcel.readString();
            this.c0 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d0 = parcel.readInt();
            this.e0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String string, CharSequence charSequence, int n8, Bundle bundle) {
            this.q = string;
            this.c0 = charSequence;
            this.d0 = n8;
            this.e0 = bundle;
        }

        public static CustomAction a(Object object) {
            if (object != null) {
                object = (PlaybackState.CustomAction)object;
                Object object2 = b.l((PlaybackState.CustomAction)object);
                MediaSessionCompat.a(object2);
                object2 = new CustomAction(b.f((PlaybackState.CustomAction)object), b.o((PlaybackState.CustomAction)object), b.m((PlaybackState.CustomAction)object), (Bundle)object2);
                object2.f0 = object;
                return object2;
            }
            return null;
        }

        public Object b() {
            PlaybackState.CustomAction customAction;
            PlaybackState.CustomAction customAction2 = customAction = this.f0;
            if (customAction == null) {
                customAction2 = b.e(this.q, this.c0, this.d0);
                b.w((PlaybackState.CustomAction.Builder)customAction2, this.e0);
                customAction2 = b.b((PlaybackState.CustomAction.Builder)customAction2);
            }
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Action:mName='");
            stringBuilder.append((Object)this.c0);
            stringBuilder.append(", mIcon=");
            stringBuilder.append(this.d0);
            stringBuilder.append(", mExtras=");
            stringBuilder.append(this.e0);
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeString(this.q);
            TextUtils.writeToParcel((CharSequence)this.c0, (Parcel)parcel, (int)n8);
            parcel.writeInt(this.d0);
            parcel.writeBundle(this.e0);
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String string, CharSequence charSequence, int n8) {
            return new PlaybackState.CustomAction.Builder(string, charSequence, n8);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long l8) {
            builder.setActions(l8);
        }

        static void t(PlaybackState.Builder builder, long l8) {
            builder.setActiveQueueItemId(l8);
        }

        static void u(PlaybackState.Builder builder, long l8) {
            builder.setBufferedPosition(l8);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int n8, long l8, float f8, long l9) {
            builder.setState(n8, l8, f8, l9);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return g.a(playbackState);
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            f.a(builder, bundle);
        }
    }

    public static final class d {
        private final List<CustomAction> a;
        private int b;
        private long c;
        private long d;
        private float e;
        private long f;
        private int g;
        private CharSequence h;
        private long i;
        private long j;
        private Bundle k;

        public d() {
            this.a = new ArrayList<CustomAction>();
            this.j = -1L;
        }

        public d(PlaybackStateCompat playbackStateCompat) {
            ArrayList<CustomAction> arrayList = new ArrayList<CustomAction>();
            this.a = arrayList;
            this.j = -1L;
            this.b = playbackStateCompat.q;
            this.c = playbackStateCompat.c0;
            this.e = playbackStateCompat.e0;
            this.i = playbackStateCompat.i0;
            this.d = playbackStateCompat.d0;
            this.f = playbackStateCompat.f0;
            this.g = playbackStateCompat.g0;
            this.h = playbackStateCompat.h0;
            List<CustomAction> list = playbackStateCompat.j0;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.j = playbackStateCompat.k0;
            this.k = playbackStateCompat.l0;
        }

        public PlaybackStateCompat a() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }

        public d b(long l8) {
            this.f = l8;
            return this;
        }

        public d c(long l8) {
            this.j = l8;
            return this;
        }

        @Deprecated
        public d d(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public d e(Bundle bundle) {
            this.k = bundle;
            return this;
        }

        public d f(int n8, long l8, float f8, long l9) {
            this.b = n8;
            this.c = l8;
            this.i = l9;
            this.e = f8;
            return this;
        }
    }
}

