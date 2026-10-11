.class public Lax/Z2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lax/Z2/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public c0:I

.field public d0:Landroid/os/Bundle;

.field public e0:Z

.field public q:Lax/Q2/f;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/Z2/f$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/Z2/f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/Z2/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lax/Q2/f;

    iput-object v0, p0, Lax/Z2/f;->q:Lax/Q2/f;

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lax/Z2/f;->c0:I

    .line 9
    const-class v0, Landroid/os/Bundle;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    iput-object v0, p0, Lax/Z2/f;->d0:Landroid/os/Bundle;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_27

    goto :goto_28

    :cond_27
    const/4 v0, 0x0

    :goto_28
    iput-boolean v0, p0, Lax/Z2/f;->e0:Z

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lax/Z2/f$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/Z2/f;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Lax/c3/K;Z)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    move-result-object v0

    iput-object v0, p0, Lax/Z2/f;->q:Lax/Q2/f;

    .line 4
    invoke-virtual {p1}, Lax/c3/K;->b()I

    move-result p1

    iput p1, p0, Lax/Z2/f;->c0:I

    .line 5
    iput-boolean p2, p0, Lax/Z2/f;->e0:Z

    return-void
.end method

.method public constructor <init>(Lax/c3/K;ZLandroid/os/Bundle;)V
    .registers 4

    .line 11
    invoke-direct {p0, p1, p2}, Lax/Z2/f;-><init>(Lax/c3/K;Z)V

    .line 12
    iput-object p3, p0, Lax/Z2/f;->d0:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public a()Lax/Q2/f;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z2/f;->q:Lax/Q2/f;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b()I
    .registers 2

    .line 1
    iget v0, p0, Lax/Z2/f;->c0:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public c()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z2/f;->q:Lax/Q2/f;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public describeContents()I
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/Z2/f;->q:Lax/Q2/f;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lax/Z2/f;->c0:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lax/Z2/f;->d0:Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 14
    .line 15
    .line 16
    iget-boolean p2, p0, Lax/Z2/f;->e0:Z

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method
