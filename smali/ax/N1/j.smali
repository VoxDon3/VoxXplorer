.class public abstract Lax/N1/j;
.super Lax/V0/j;
.source "SourceFile"

# interfaces
.implements Lax/N1/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/V0/j<",
        "Lax/N1/p;",
        "Lax/N1/q;",
        "Lax/N1/m;",
        ">;",
        "Lax/N1/l;"
    }
.end annotation


# instance fields
.field private final o:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .registers 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Lax/N1/p;

    .line 3
    .line 4
    new-array v0, v0, [Lax/N1/q;

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lax/V0/j;-><init>([Lax/V0/i;[Landroidx/media3/decoder/a;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lax/N1/j;->o:Ljava/lang/String;

    .line 10
    .line 11
    const/16 p1, 0x400

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lax/V0/j;->x(I)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic y(Lax/N1/j;Landroidx/media3/decoder/a;)V
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/V0/j;->u(Landroidx/media3/decoder/a;)V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method protected final A()Lax/N1/q;
    .registers 2

    .line 1
    new-instance v0, Lax/N1/j$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lax/N1/j$a;-><init>(Lax/N1/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method protected final B(Ljava/lang/Throwable;)Lax/N1/m;
    .registers 4

    .line 1
    new-instance v0, Lax/N1/m;

    .line 2
    .line 3
    const-string v1, "Unexpected decode error"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lax/N1/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method protected abstract C([BIZ)Lax/N1/k;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/N1/m;
        }
    .end annotation
.end method

.method protected final D(Lax/N1/p;Lax/N1/q;Z)Lax/N1/m;
    .registers 12

    .line 1
    :try_start_0
    iget-object v0, p1, Lax/V0/i;->e0:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0, v1, v0, p3}, Lax/N1/j;->C([BIZ)Lax/N1/k;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-wide v3, p1, Lax/V0/i;->g0:J

    .line 22
    .line 23
    iget-wide v6, p1, Lax/N1/p;->k0:J

    .line 24
    .line 25
    move-object v2, p2

    .line 26
    invoke-virtual/range {v2 .. v7}, Lax/N1/q;->C(JLax/N1/k;J)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-boolean p1, v2, Landroidx/media3/decoder/a;->e0:Z
    :try_end_1f
    .catch Lax/N1/m; {:try_start_0 .. :try_end_1f} :catch_21

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return-object p1

    .line 34
    :catch_21
    move-exception v0

    .line 35
    move-object p1, v0

    .line 36
    return-object p1
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

.method public e(J)V
    .registers 3

    .line 1
    return-void
    .line 2
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
    .line 22
.end method

.method public final getName()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/N1/j;->o:Ljava/lang/String;

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

.method protected bridge synthetic j()Lax/V0/i;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/N1/j;->z()Lax/N1/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method protected bridge synthetic k()Landroidx/media3/decoder/a;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/N1/j;->A()Lax/N1/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method protected bridge synthetic l(Ljava/lang/Throwable;)Lax/V0/h;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/N1/j;->B(Ljava/lang/Throwable;)Lax/N1/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
    .line 22
.end method

.method protected bridge synthetic m(Lax/V0/i;Landroidx/media3/decoder/a;Z)Lax/V0/h;
    .registers 4

    .line 1
    check-cast p1, Lax/N1/p;

    .line 2
    .line 3
    check-cast p2, Lax/N1/q;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lax/N1/j;->D(Lax/N1/p;Lax/N1/q;Z)Lax/N1/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method protected final z()Lax/N1/p;
    .registers 2

    .line 1
    new-instance v0, Lax/N1/p;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/N1/p;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
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
