.class public final Lax/P0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P0/y$e;,
        Lax/P0/y$h;,
        Lax/P0/y$g;,
        Lax/P0/y$i;,
        Lax/P0/y$c;,
        Lax/P0/y$d;,
        Lax/P0/y$j;,
        Lax/P0/y$k;,
        Lax/P0/y$b;,
        Lax/P0/y$f;
    }
.end annotation


# static fields
.field public static final i:Lax/P0/y;

.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lax/P0/y$h;

.field public final c:Lax/P0/y$h;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final d:Lax/P0/y$g;

.field public final e:Lax/P0/A;

.field public final f:Lax/P0/y$d;

.field public final g:Lax/P0/y$e;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final h:Lax/P0/y$i;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/P0/y$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/y$c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/P0/y$c;->a()Lax/P0/y;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lax/P0/y;->i:Lax/P0/y;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lax/P0/y;->j:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lax/P0/y;->k:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lax/P0/y;->l:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lax/P0/y;->m:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lax/P0/y;->n:Ljava/lang/String;

    .line 46
    .line 47
    const/4 v0, 0x5

    .line 48
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lax/P0/y;->o:Ljava/lang/String;

    .line 53
    .line 54
    return-void
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

.method private constructor <init>(Ljava/lang/String;Lax/P0/y$e;Lax/P0/y$h;Lax/P0/y$g;Lax/P0/A;Lax/P0/y$i;)V
    .registers 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/P0/y;->a:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lax/P0/y;->b:Lax/P0/y$h;

    .line 5
    iput-object p3, p0, Lax/P0/y;->c:Lax/P0/y$h;

    .line 6
    iput-object p4, p0, Lax/P0/y;->d:Lax/P0/y$g;

    .line 7
    iput-object p5, p0, Lax/P0/y;->e:Lax/P0/A;

    .line 8
    iput-object p2, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 9
    iput-object p2, p0, Lax/P0/y;->g:Lax/P0/y$e;

    .line 10
    iput-object p6, p0, Lax/P0/y;->h:Lax/P0/y$i;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lax/P0/y$e;Lax/P0/y$h;Lax/P0/y$g;Lax/P0/A;Lax/P0/y$i;Lax/P0/y$a;)V
    .registers 8

    .line 1
    invoke-direct/range {p0 .. p6}, Lax/P0/y;-><init>(Ljava/lang/String;Lax/P0/y$e;Lax/P0/y$h;Lax/P0/y$g;Lax/P0/A;Lax/P0/y$i;)V

    return-void
.end method

.method public static b(Landroid/net/Uri;)Lax/P0/y;
    .registers 2

    .line 1
    new-instance v0, Lax/P0/y$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/y$c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lax/P0/y$c;->f(Landroid/net/Uri;)Lax/P0/y$c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lax/P0/y$c;->a()Lax/P0/y;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static c(Ljava/lang/String;)Lax/P0/y;
    .registers 2

    .line 1
    new-instance v0, Lax/P0/y$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/P0/y$c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lax/P0/y$c;->g(Ljava/lang/String;)Lax/P0/y$c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lax/P0/y$c;->a()Lax/P0/y;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
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
.method public a()Lax/P0/y$c;
    .registers 3

    .line 1
    new-instance v0, Lax/P0/y$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lax/P0/y$c;-><init>(Lax/P0/y;Lax/P0/y$a;)V

    .line 5
    .line 6
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
    instance-of v1, p1, Lax/P0/y;

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
    check-cast p1, Lax/P0/y;

    .line 12
    .line 13
    iget-object v1, p0, Lax/P0/y;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lax/P0/y;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_49

    .line 22
    .line 23
    iget-object v1, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 24
    .line 25
    iget-object v3, p1, Lax/P0/y;->f:Lax/P0/y$d;

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Lax/P0/y$d;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_49

    .line 32
    .line 33
    iget-object v1, p0, Lax/P0/y;->b:Lax/P0/y$h;

    .line 34
    .line 35
    iget-object v3, p1, Lax/P0/y;->b:Lax/P0/y$h;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_49

    .line 42
    .line 43
    iget-object v1, p0, Lax/P0/y;->d:Lax/P0/y$g;

    .line 44
    .line 45
    iget-object v3, p1, Lax/P0/y;->d:Lax/P0/y$g;

    .line 46
    .line 47
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_49

    .line 52
    .line 53
    iget-object v1, p0, Lax/P0/y;->e:Lax/P0/A;

    .line 54
    .line 55
    iget-object v3, p1, Lax/P0/y;->e:Lax/P0/A;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_49

    .line 62
    .line 63
    iget-object v1, p0, Lax/P0/y;->h:Lax/P0/y$i;

    .line 64
    .line 65
    iget-object p1, p1, Lax/P0/y;->h:Lax/P0/y$i;

    .line 66
    .line 67
    invoke-static {v1, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_49

    .line 72
    .line 73
    return v0

    .line 74
    :cond_49
    return v2
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

.method public hashCode()I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/y;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lax/P0/y;->b:Lax/P0/y$h;

    .line 10
    .line 11
    if-eqz v1, :cond_11

    .line 12
    .line 13
    invoke-virtual {v1}, Lax/P0/y$h;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_12

    .line 18
    :cond_11
    const/4 v1, 0x0

    .line 19
    :goto_12
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Lax/P0/y;->d:Lax/P0/y$g;

    .line 23
    .line 24
    invoke-virtual {v1}, Lax/P0/y$g;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v0, v1

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget-object v1, p0, Lax/P0/y;->f:Lax/P0/y$d;

    .line 32
    .line 33
    invoke-virtual {v1}, Lax/P0/y$d;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Lax/P0/y;->e:Lax/P0/A;

    .line 41
    .line 42
    invoke-virtual {v1}, Lax/P0/A;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-object v1, p0, Lax/P0/y;->h:Lax/P0/y$i;

    .line 50
    .line 51
    invoke-virtual {v1}, Lax/P0/y$i;->hashCode()I

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
