.class final Lax/i1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/U0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i1/x$a;
    }
.end annotation


# instance fields
.field private final a:Lax/U0/g;

.field private final b:I

.field private final c:Lax/i1/x$a;

.field private final d:[B

.field private e:I


# direct methods
.method public constructor <init>(Lax/U0/g;ILax/i1/x$a;)V
    .registers 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-lez p2, :cond_8

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_9

    .line 9
    :cond_8
    const/4 v1, 0x0

    .line 10
    :goto_9
    invoke-static {v1}, Lax/S0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lax/i1/x;->a:Lax/U0/g;

    .line 14
    .line 15
    iput p2, p0, Lax/i1/x;->b:I

    .line 16
    .line 17
    iput-object p3, p0, Lax/i1/x;->c:Lax/i1/x$a;

    .line 18
    .line 19
    new-array p1, v0, [B

    .line 20
    .line 21
    iput-object p1, p0, Lax/i1/x;->d:[B

    .line 22
    .line 23
    iput p2, p0, Lax/i1/x;->e:I

    .line 24
    .line 25
    return-void
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

.method private q()Z
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i1/x;->a:Lax/U0/g;

    .line 2
    .line 3
    iget-object v1, p0, Lax/i1/x;->d:[B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-interface {v0, v1, v2, v3}, Lax/P0/k;->c([BII)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_e

    .line 13
    .line 14
    return v2

    .line 15
    :cond_e
    iget-object v0, p0, Lax/i1/x;->d:[B

    .line 16
    .line 17
    aget-byte v0, v0, v2

    .line 18
    .line 19
    and-int/lit16 v0, v0, 0xff

    .line 20
    .line 21
    shl-int/lit8 v0, v0, 0x4

    .line 22
    .line 23
    if-nez v0, :cond_19

    .line 24
    .line 25
    return v3

    .line 26
    :cond_19
    new-array v4, v0, [B

    .line 27
    .line 28
    move v5, v0

    .line 29
    const/4 v6, 0x0

    .line 30
    :goto_1d
    if-lez v5, :cond_2b

    .line 31
    .line 32
    iget-object v7, p0, Lax/i1/x;->a:Lax/U0/g;

    .line 33
    .line 34
    invoke-interface {v7, v4, v6, v5}, Lax/P0/k;->c([BII)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-ne v7, v1, :cond_28

    .line 39
    .line 40
    return v2

    .line 41
    :cond_28
    add-int/2addr v6, v7

    .line 42
    sub-int/2addr v5, v7

    .line 43
    goto :goto_1d

    .line 44
    :cond_2b
    :goto_2b
    if-lez v0, :cond_36

    .line 45
    .line 46
    add-int/lit8 v1, v0, -0x1

    .line 47
    .line 48
    aget-byte v1, v4, v1

    .line 49
    .line 50
    if-nez v1, :cond_36

    .line 51
    .line 52
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    goto :goto_2b

    .line 55
    :cond_36
    if-lez v0, :cond_42

    .line 56
    .line 57
    iget-object v1, p0, Lax/i1/x;->c:Lax/i1/x$a;

    .line 58
    .line 59
    new-instance v2, Lax/S0/G;

    .line 60
    .line 61
    invoke-direct {v2, v4, v0}, Lax/S0/G;-><init>([BI)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v1, v2}, Lax/i1/x$a;->b(Lax/S0/G;)V

    .line 65
    .line 66
    .line 67
    :cond_42
    return v3
    .line 68
.end method


# virtual methods
.method public b()Landroid/net/Uri;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i1/x;->a:Lax/U0/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/U0/g;->b()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public c([BII)I
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/i1/x;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_11

    .line 5
    .line 6
    invoke-direct {p0}, Lax/i1/x;->q()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_10

    .line 11
    .line 12
    iget v0, p0, Lax/i1/x;->b:I

    .line 13
    .line 14
    iput v0, p0, Lax/i1/x;->e:I

    .line 15
    .line 16
    goto :goto_11

    .line 17
    :cond_10
    return v1

    .line 18
    :cond_11
    :goto_11
    iget-object v0, p0, Lax/i1/x;->a:Lax/U0/g;

    .line 19
    .line 20
    iget v2, p0, Lax/i1/x;->e:I

    .line 21
    .line 22
    invoke-static {v2, p3}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-interface {v0, p1, p2, p3}, Lax/P0/k;->c([BII)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eq p1, v1, :cond_24

    .line 31
    .line 32
    iget p2, p0, Lax/i1/x;->e:I

    .line 33
    .line 34
    sub-int/2addr p2, p1

    .line 35
    iput p2, p0, Lax/i1/x;->e:I

    .line 36
    .line 37
    :cond_24
    return p1
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

.method public close()V
    .registers 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
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

.method public d(Lax/U0/z;)V
    .registers 3

    .line 1
    invoke-static {p1}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lax/i1/x;->a:Lax/U0/g;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lax/U0/g;->d(Lax/U0/z;)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public f(Lax/U0/k;)J
    .registers 2

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
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

.method public l()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/i1/x;->a:Lax/U0/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lax/U0/g;->l()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
