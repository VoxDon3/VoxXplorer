.class public final Lax/P0/M;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/Surface;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Z


# direct methods
.method public constructor <init>(Landroid/view/Surface;II)V
    .registers 5

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lax/P0/M;-><init>(Landroid/view/Surface;III)V

    return-void
.end method

.method public constructor <init>(Landroid/view/Surface;III)V
    .registers 11

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lax/P0/M;-><init>(Landroid/view/Surface;IIIZ)V

    return-void
.end method

.method public constructor <init>(Landroid/view/Surface;IIIZ)V
    .registers 8

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p4, :cond_14

    const/16 v0, 0x5a

    if-eq p4, v0, :cond_14

    const/16 v0, 0xb4

    if-eq p4, v0, :cond_14

    const/16 v0, 0x10e

    if-ne p4, v0, :cond_12

    goto :goto_14

    :cond_12
    const/4 v0, 0x0

    goto :goto_15

    :cond_14
    :goto_14
    const/4 v0, 0x1

    .line 4
    :goto_15
    const-string v1, "orientationDegrees must be 0, 90, 180, or 270"

    invoke-static {v0, v1}, Lax/S0/a;->b(ZLjava/lang/Object;)V

    .line 5
    iput-object p1, p0, Lax/P0/M;->a:Landroid/view/Surface;

    .line 6
    iput p2, p0, Lax/P0/M;->b:I

    .line 7
    iput p3, p0, Lax/P0/M;->c:I

    .line 8
    iput p4, p0, Lax/P0/M;->d:I

    .line 9
    iput-boolean p5, p0, Lax/P0/M;->e:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    instance-of v1, p1, Lax/P0/M;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_a

    .line 9
    .line 10
    return v2

    .line 11
    :cond_a
    check-cast p1, Lax/P0/M;

    .line 12
    .line 13
    iget v1, p0, Lax/P0/M;->b:I

    .line 14
    .line 15
    iget v3, p1, Lax/P0/M;->b:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_2f

    .line 18
    .line 19
    iget v1, p0, Lax/P0/M;->c:I

    .line 20
    .line 21
    iget v3, p1, Lax/P0/M;->c:I

    .line 22
    .line 23
    if-ne v1, v3, :cond_2f

    .line 24
    .line 25
    iget v1, p0, Lax/P0/M;->d:I

    .line 26
    .line 27
    iget v3, p1, Lax/P0/M;->d:I

    .line 28
    .line 29
    if-ne v1, v3, :cond_2f

    .line 30
    .line 31
    iget-boolean v1, p0, Lax/P0/M;->e:Z

    .line 32
    .line 33
    iget-boolean v3, p1, Lax/P0/M;->e:Z

    .line 34
    .line 35
    if-ne v1, v3, :cond_2f

    .line 36
    .line 37
    iget-object v1, p0, Lax/P0/M;->a:Landroid/view/Surface;

    .line 38
    .line 39
    iget-object p1, p1, Lax/P0/M;->a:Landroid/view/Surface;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2f

    .line 46
    .line 47
    return v0

    .line 48
    :cond_2f
    return v2
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public hashCode()I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/M;->a:Landroid/view/Surface;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lax/P0/M;->b:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget v1, p0, Lax/P0/M;->c:I

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    mul-int/lit8 v0, v0, 0x1f

    .line 18
    .line 19
    iget v1, p0, Lax/P0/M;->d:I

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    mul-int/lit8 v0, v0, 0x1f

    .line 23
    .line 24
    iget-boolean v1, p0, Lax/P0/M;->e:Z

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    return v0
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
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
