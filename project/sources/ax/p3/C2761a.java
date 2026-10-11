package ax.p3;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* renamed from: ax.p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2761a implements Parcelable {
    public static final Parcelable.Creator<C2761a> CREATOR = new C0415a();
    public String c0;
    public boolean d0 = false;
    public boolean e0 = false;
    public boolean f0 = false;
    public boolean g0 = false;
    public boolean h0 = false;
    public long i0 = 0;
    public long j0 = 0;
    public String q;

    /* renamed from: ax.p3.a$a, reason: collision with other inner class name */
    class C0415a implements Parcelable.Creator<C2761a> {
        C0415a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2761a createFromParcel(Parcel parcel) {
            C2761a c2761a = new C2761a();
            c2761a.a(parcel);
            return c2761a;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2761a[] newArray(int i) {
            return new C2761a[i];
        }
    }

    public final void a(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        int readInt = parcel.readInt();
        try {
            if (readInt < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (parcel.dataPosition() - dataPosition < readInt) {
                this.q = parcel.readString();
                if (parcel.dataPosition() - dataPosition < readInt) {
                    this.c0 = parcel.readString();
                    if (parcel.dataPosition() - dataPosition < readInt) {
                        this.d0 = parcel.readInt() != 0;
                        if (parcel.dataPosition() - dataPosition < readInt) {
                            this.e0 = parcel.readInt() != 0;
                            if (parcel.dataPosition() - dataPosition < readInt) {
                                this.f0 = parcel.readInt() != 0;
                                if (parcel.dataPosition() - dataPosition < readInt) {
                                    this.g0 = parcel.readInt() != 0;
                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                        this.h0 = parcel.readInt() != 0;
                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                            this.i0 = parcel.readLong();
                                            if (parcel.dataPosition() - dataPosition < readInt) {
                                                this.j0 = parcel.readLong();
                                                if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                }
                                            } else if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                        } else if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
            } else if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(dataPosition + readInt);
        } catch (Throwable th) {
            if (dataPosition > SubsamplingScaleImageView.TILE_SIZE_AUTO - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(dataPosition + readInt);
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.q);
        parcel.writeString(this.c0);
        parcel.writeInt(this.d0 ? 1 : 0);
        parcel.writeInt(this.e0 ? 1 : 0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0 ? 1 : 0);
        parcel.writeInt(this.h0 ? 1 : 0);
        parcel.writeLong(this.i0);
        parcel.writeLong(this.j0);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
