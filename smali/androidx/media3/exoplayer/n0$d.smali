.class final Landroidx/media3/exoplayer/n0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Landroidx/media3/exoplayer/n0$d;",
        ">;"
    }
.end annotation


# instance fields
.field public c0:I

.field public d0:J

.field public e0:Ljava/lang/Object;

.field public final q:Landroidx/media3/exoplayer/K0;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/K0;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/n0$d;->q:Landroidx/media3/exoplayer/K0;

    .line 5
    .line 6
    return-void
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
    .line 22
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Landroidx/media3/exoplayer/n0$d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/n0$d;->d(Landroidx/media3/exoplayer/n0$d;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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
    .line 22
.end method

.method public d(Landroidx/media3/exoplayer/n0$d;)I
    .registers 7

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v3, 0x0

    .line 10
    :goto_9
    iget-object v4, p1, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 11
    .line 12
    if-nez v4, :cond_f

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    goto :goto_10

    .line 16
    :cond_f
    const/4 v4, 0x0

    .line 17
    :goto_10
    if-eq v3, v4, :cond_17

    .line 18
    .line 19
    if-eqz v0, :cond_16

    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    return p1

    .line 23
    :cond_16
    return v2

    .line 24
    :cond_17
    if-nez v0, :cond_1a

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1a
    iget v0, p0, Landroidx/media3/exoplayer/n0$d;->c0:I

    .line 28
    .line 29
    iget v1, p1, Landroidx/media3/exoplayer/n0$d;->c0:I

    .line 30
    .line 31
    sub-int/2addr v0, v1

    .line 32
    if-eqz v0, :cond_22

    .line 33
    .line 34
    return v0

    .line 35
    :cond_22
    iget-wide v0, p0, Landroidx/media3/exoplayer/n0$d;->d0:J

    .line 36
    .line 37
    iget-wide v2, p1, Landroidx/media3/exoplayer/n0$d;->d0:J

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1
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
.end method

.method public h(IJLjava/lang/Object;)V
    .registers 5

    .line 1
    iput p1, p0, Landroidx/media3/exoplayer/n0$d;->c0:I

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/media3/exoplayer/n0$d;->d0:J

    .line 4
    .line 5
    iput-object p4, p0, Landroidx/media3/exoplayer/n0$d;->e0:Ljava/lang/Object;

    .line 6
    .line 7
    return-void
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
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method
