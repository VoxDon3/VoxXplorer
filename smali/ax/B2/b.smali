.class public final Lax/B2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/B2/b$b;,
        Lax/B2/b$a;
    }
.end annotation


# static fields
.field public static final i:Lax/B2/b$a;

.field public static final j:Lax/B2/b;


# instance fields
.field private final a:Lax/B2/j;

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:J

.field private final g:J

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lax/B2/b$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 15

    .line 1
    new-instance v0, Lax/B2/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/B2/b$a;-><init>(Lax/Gb/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/B2/b;->i:Lax/B2/b$a;

    .line 8
    .line 9
    new-instance v2, Lax/B2/b;

    .line 10
    .line 11
    const/16 v13, 0xff

    .line 12
    .line 13
    const/4 v14, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const-wide/16 v8, 0x0

    .line 20
    .line 21
    const-wide/16 v10, 0x0

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    invoke-direct/range {v2 .. v14}, Lax/B2/b;-><init>(Lax/B2/j;ZZZZJJLjava/util/Set;ILax/Gb/g;)V

    .line 25
    .line 26
    .line 27
    sput-object v2, Lax/B2/b;->j:Lax/B2/b;

    .line 28
    .line 29
    return-void
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

.method public constructor <init>()V
    .registers 14

    const/16 v11, 0xff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v12}, Lax/B2/b;-><init>(Lax/B2/j;ZZZZJJLjava/util/Set;ILax/Gb/g;)V

    return-void
.end method

.method public constructor <init>(Lax/B2/b;)V
    .registers 14

    const-string v0, "other"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-boolean v3, p1, Lax/B2/b;->b:Z

    .line 15
    iget-boolean v4, p1, Lax/B2/b;->c:Z

    .line 16
    iget-object v2, p1, Lax/B2/b;->a:Lax/B2/j;

    .line 17
    iget-boolean v5, p1, Lax/B2/b;->d:Z

    .line 18
    iget-boolean v6, p1, Lax/B2/b;->e:Z

    .line 19
    iget-object v11, p1, Lax/B2/b;->h:Ljava/util/Set;

    .line 20
    iget-wide v7, p1, Lax/B2/b;->f:J

    .line 21
    iget-wide v9, p1, Lax/B2/b;->g:J

    move-object v1, p0

    .line 22
    invoke-direct/range {v1 .. v11}, Lax/B2/b;-><init>(Lax/B2/j;ZZZZJJLjava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Lax/B2/j;ZZZZJJLjava/util/Set;)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/B2/j;",
            "ZZZZJJ",
            "Ljava/util/Set<",
            "Lax/B2/b$b;",
            ">;)V"
        }
    .end annotation

    const-string v0, "requiredNetworkType"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentUriTriggers"

    invoke-static {p10, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/B2/b;->a:Lax/B2/j;

    .line 4
    iput-boolean p2, p0, Lax/B2/b;->b:Z

    .line 5
    iput-boolean p3, p0, Lax/B2/b;->c:Z

    .line 6
    iput-boolean p4, p0, Lax/B2/b;->d:Z

    .line 7
    iput-boolean p5, p0, Lax/B2/b;->e:Z

    .line 8
    iput-wide p6, p0, Lax/B2/b;->f:J

    .line 9
    iput-wide p8, p0, Lax/B2/b;->g:J

    .line 10
    iput-object p10, p0, Lax/B2/b;->h:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lax/B2/j;ZZZZJJLjava/util/Set;ILax/Gb/g;)V
    .registers 15

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_6

    .line 11
    sget-object p1, Lax/B2/j;->q:Lax/B2/j;

    :cond_6
    and-int/lit8 p12, p11, 0x2

    const/4 v0, 0x0

    if-eqz p12, :cond_c

    const/4 p2, 0x0

    :cond_c
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_11

    const/4 p3, 0x0

    :cond_11
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_16

    const/4 p4, 0x0

    :cond_16
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_1b

    const/4 p5, 0x0

    :cond_1b
    and-int/lit8 p12, p11, 0x20

    const-wide/16 v0, -0x1

    if-eqz p12, :cond_22

    move-wide p6, v0

    :cond_22
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_27

    move-wide p8, v0

    :cond_27
    and-int/lit16 p11, p11, 0x80

    if-eqz p11, :cond_2f

    .line 12
    invoke-static {}, Lax/tb/L;->d()Ljava/util/Set;

    move-result-object p10

    :cond_2f
    move-object p12, p10

    move-wide p10, p8

    move-wide p8, p6

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 13
    invoke-direct/range {p2 .. p12}, Lax/B2/b;-><init>(Lax/B2/j;ZZZZJJLjava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final a()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/B2/b;->g:J

    .line 2
    .line 3
    return-wide v0
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

.method public final b()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/B2/b;->f:J

    .line 2
    .line 3
    return-wide v0
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

.method public final c()Ljava/util/Set;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lax/B2/b$b;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/B2/b;->h:Ljava/util/Set;

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

.method public final d()Lax/B2/j;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/B2/b;->a:Lax/B2/j;

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

.method public final e()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/B2/b;->h:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
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

.method public equals(Ljava/lang/Object;)Z
    .registers 8

    .line 1
    if-ne p0, p1, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_4
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_54

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Lax/B2/b;

    .line 13
    .line 14
    invoke-static {v2, v1}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_14

    .line 19
    .line 20
    goto :goto_54

    .line 21
    :cond_14
    check-cast p1, Lax/B2/b;

    .line 22
    .line 23
    iget-boolean v1, p0, Lax/B2/b;->b:Z

    .line 24
    .line 25
    iget-boolean v2, p1, Lax/B2/b;->b:Z

    .line 26
    .line 27
    if-eq v1, v2, :cond_1d

    .line 28
    .line 29
    return v0

    .line 30
    :cond_1d
    iget-boolean v1, p0, Lax/B2/b;->c:Z

    .line 31
    .line 32
    iget-boolean v2, p1, Lax/B2/b;->c:Z

    .line 33
    .line 34
    if-eq v1, v2, :cond_24

    .line 35
    .line 36
    return v0

    .line 37
    :cond_24
    iget-boolean v1, p0, Lax/B2/b;->d:Z

    .line 38
    .line 39
    iget-boolean v2, p1, Lax/B2/b;->d:Z

    .line 40
    .line 41
    if-eq v1, v2, :cond_2b

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2b
    iget-boolean v1, p0, Lax/B2/b;->e:Z

    .line 45
    .line 46
    iget-boolean v2, p1, Lax/B2/b;->e:Z

    .line 47
    .line 48
    if-eq v1, v2, :cond_32

    .line 49
    .line 50
    return v0

    .line 51
    :cond_32
    iget-wide v1, p0, Lax/B2/b;->f:J

    .line 52
    .line 53
    iget-wide v3, p1, Lax/B2/b;->f:J

    .line 54
    .line 55
    cmp-long v5, v1, v3

    .line 56
    .line 57
    if-eqz v5, :cond_3b

    .line 58
    .line 59
    return v0

    .line 60
    :cond_3b
    iget-wide v1, p0, Lax/B2/b;->g:J

    .line 61
    .line 62
    iget-wide v3, p1, Lax/B2/b;->g:J

    .line 63
    .line 64
    cmp-long v5, v1, v3

    .line 65
    .line 66
    if-eqz v5, :cond_44

    .line 67
    .line 68
    return v0

    .line 69
    :cond_44
    iget-object v1, p0, Lax/B2/b;->a:Lax/B2/j;

    .line 70
    .line 71
    iget-object v2, p1, Lax/B2/b;->a:Lax/B2/j;

    .line 72
    .line 73
    if-eq v1, v2, :cond_4b

    .line 74
    .line 75
    return v0

    .line 76
    :cond_4b
    iget-object v0, p0, Lax/B2/b;->h:Ljava/util/Set;

    .line 77
    .line 78
    iget-object p1, p1, Lax/B2/b;->h:Ljava/util/Set;

    .line 79
    .line 80
    invoke-static {v0, p1}, Lax/Gb/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    return p1

    .line 85
    :cond_54
    :goto_54
    return v0
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public final f()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/B2/b;->d:Z

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

.method public final g()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/B2/b;->b:Z

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

.method public final h()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/B2/b;->c:Z

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

.method public hashCode()I
    .registers 7

    .line 1
    iget-object v0, p0, Lax/B2/b;->a:Lax/B2/j;

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
    iget-boolean v1, p0, Lax/B2/b;->b:Z

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-boolean v1, p0, Lax/B2/b;->c:Z

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    mul-int/lit8 v0, v0, 0x1f

    .line 18
    .line 19
    iget-boolean v1, p0, Lax/B2/b;->d:Z

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    mul-int/lit8 v0, v0, 0x1f

    .line 23
    .line 24
    iget-boolean v1, p0, Lax/B2/b;->e:Z

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-wide v1, p0, Lax/B2/b;->f:J

    .line 30
    .line 31
    const/16 v3, 0x20

    .line 32
    .line 33
    ushr-long v4, v1, v3

    .line 34
    .line 35
    xor-long/2addr v1, v4

    .line 36
    long-to-int v2, v1

    .line 37
    add-int/2addr v0, v2

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-wide v1, p0, Lax/B2/b;->g:J

    .line 41
    .line 42
    ushr-long v3, v1, v3

    .line 43
    .line 44
    xor-long/2addr v1, v3

    .line 45
    long-to-int v2, v1

    .line 46
    add-int/2addr v0, v2

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, Lax/B2/b;->h:Ljava/util/Set;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v0, v1

    .line 56
    return v0
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

.method public final i()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/B2/b;->e:Z

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
