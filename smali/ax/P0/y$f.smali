.class public final Lax/P0/y$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/P0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P0/y$f$a;
    }
.end annotation


# static fields
.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;

.field static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;


# instance fields
.field public final a:Ljava/util/UUID;

.field public final b:Ljava/util/UUID;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final c:Landroid/net/Uri;

.field public final d:Lax/r7/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/A<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final e:Lax/r7/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/A<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final j:Lax/r7/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/z<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final k:[B


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Lax/P0/y$f;->l:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lax/P0/y$f;->m:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lax/P0/y$f;->n:Ljava/lang/String;

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lax/P0/y$f;->o:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lax/P0/y$f;->p:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v0, 0x5

    .line 37
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lax/P0/y$f;->q:Ljava/lang/String;

    .line 42
    .line 43
    const/4 v0, 0x6

    .line 44
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, Lax/P0/y$f;->r:Ljava/lang/String;

    .line 49
    .line 50
    const/4 v0, 0x7

    .line 51
    invoke-static {v0}, Lax/S0/d0;->G0(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lax/P0/y$f;->s:Ljava/lang/String;

    .line 56
    .line 57
    return-void
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

.method private constructor <init>(Lax/P0/y$f$a;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/P0/y$f$a;->g(Lax/P0/y$f$a;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {p1}, Lax/P0/y$f$a;->e(Lax/P0/y$f$a;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_10

    goto :goto_12

    :cond_10
    const/4 v0, 0x0

    goto :goto_13

    :cond_12
    :goto_12
    const/4 v0, 0x1

    :goto_13
    invoke-static {v0}, Lax/S0/a;->g(Z)V

    .line 4
    invoke-static {p1}, Lax/P0/y$f$a;->f(Lax/P0/y$f$a;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    iput-object v0, p0, Lax/P0/y$f;->a:Ljava/util/UUID;

    .line 5
    iput-object v0, p0, Lax/P0/y$f;->b:Ljava/util/UUID;

    .line 6
    invoke-static {p1}, Lax/P0/y$f$a;->e(Lax/P0/y$f$a;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$f;->c:Landroid/net/Uri;

    .line 7
    invoke-static {p1}, Lax/P0/y$f$a;->h(Lax/P0/y$f$a;)Lax/r7/A;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$f;->d:Lax/r7/A;

    .line 8
    invoke-static {p1}, Lax/P0/y$f$a;->h(Lax/P0/y$f$a;)Lax/r7/A;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$f;->e:Lax/r7/A;

    .line 9
    invoke-static {p1}, Lax/P0/y$f$a;->a(Lax/P0/y$f$a;)Z

    move-result v0

    iput-boolean v0, p0, Lax/P0/y$f;->f:Z

    .line 10
    invoke-static {p1}, Lax/P0/y$f$a;->g(Lax/P0/y$f$a;)Z

    move-result v0

    iput-boolean v0, p0, Lax/P0/y$f;->h:Z

    .line 11
    invoke-static {p1}, Lax/P0/y$f$a;->b(Lax/P0/y$f$a;)Z

    move-result v0

    iput-boolean v0, p0, Lax/P0/y$f;->g:Z

    .line 12
    invoke-static {p1}, Lax/P0/y$f$a;->c(Lax/P0/y$f$a;)Lax/r7/z;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$f;->i:Lax/r7/z;

    .line 13
    invoke-static {p1}, Lax/P0/y$f$a;->c(Lax/P0/y$f$a;)Lax/r7/z;

    move-result-object v0

    iput-object v0, p0, Lax/P0/y$f;->j:Lax/r7/z;

    .line 14
    invoke-static {p1}, Lax/P0/y$f$a;->d(Lax/P0/y$f$a;)[B

    move-result-object v0

    if-eqz v0, :cond_68

    .line 15
    invoke-static {p1}, Lax/P0/y$f$a;->d(Lax/P0/y$f$a;)[B

    move-result-object v0

    invoke-static {p1}, Lax/P0/y$f$a;->d(Lax/P0/y$f$a;)[B

    move-result-object p1

    array-length p1, p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    goto :goto_69

    :cond_68
    const/4 p1, 0x0

    .line 16
    :goto_69
    iput-object p1, p0, Lax/P0/y$f;->k:[B

    return-void
.end method

.method synthetic constructor <init>(Lax/P0/y$f$a;Lax/P0/y$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/P0/y$f;-><init>(Lax/P0/y$f$a;)V

    return-void
.end method

.method static synthetic a(Lax/P0/y$f;)[B
    .registers 1

    .line 1
    iget-object p0, p0, Lax/P0/y$f;->k:[B

    .line 2
    .line 3
    return-object p0
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


# virtual methods
.method public b()Lax/P0/y$f$a;
    .registers 3

    .line 1
    new-instance v0, Lax/P0/y$f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lax/P0/y$f$a;-><init>(Lax/P0/y$f;Lax/P0/y$a;)V

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

.method public c()[B
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/y$f;->k:[B

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return-object v0
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
    instance-of v1, p1, Lax/P0/y$f;

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
    check-cast p1, Lax/P0/y$f;

    .line 12
    .line 13
    iget-object v1, p0, Lax/P0/y$f;->a:Ljava/util/UUID;

    .line 14
    .line 15
    iget-object v3, p1, Lax/P0/y$f;->a:Ljava/util/UUID;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_51

    .line 22
    .line 23
    iget-object v1, p0, Lax/P0/y$f;->c:Landroid/net/Uri;

    .line 24
    .line 25
    iget-object v3, p1, Lax/P0/y$f;->c:Landroid/net/Uri;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_51

    .line 32
    .line 33
    iget-object v1, p0, Lax/P0/y$f;->e:Lax/r7/A;

    .line 34
    .line 35
    iget-object v3, p1, Lax/P0/y$f;->e:Lax/r7/A;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_51

    .line 42
    .line 43
    iget-boolean v1, p0, Lax/P0/y$f;->f:Z

    .line 44
    .line 45
    iget-boolean v3, p1, Lax/P0/y$f;->f:Z

    .line 46
    .line 47
    if-ne v1, v3, :cond_51

    .line 48
    .line 49
    iget-boolean v1, p0, Lax/P0/y$f;->h:Z

    .line 50
    .line 51
    iget-boolean v3, p1, Lax/P0/y$f;->h:Z

    .line 52
    .line 53
    if-ne v1, v3, :cond_51

    .line 54
    .line 55
    iget-boolean v1, p0, Lax/P0/y$f;->g:Z

    .line 56
    .line 57
    iget-boolean v3, p1, Lax/P0/y$f;->g:Z

    .line 58
    .line 59
    if-ne v1, v3, :cond_51

    .line 60
    .line 61
    iget-object v1, p0, Lax/P0/y$f;->j:Lax/r7/z;

    .line 62
    .line 63
    iget-object v3, p1, Lax/P0/y$f;->j:Lax/r7/z;

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Lax/r7/z;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_51

    .line 70
    .line 71
    iget-object v1, p0, Lax/P0/y$f;->k:[B

    .line 72
    .line 73
    iget-object p1, p1, Lax/P0/y$f;->k:[B

    .line 74
    .line 75
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_51

    .line 80
    .line 81
    return v0

    .line 82
    :cond_51
    return v2
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
    iget-object v0, p0, Lax/P0/y$f;->a:Ljava/util/UUID;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lax/P0/y$f;->c:Landroid/net/Uri;

    .line 10
    .line 11
    if-eqz v1, :cond_11

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

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
    iget-object v1, p0, Lax/P0/y$f;->e:Lax/r7/A;

    .line 23
    .line 24
    invoke-virtual {v1}, Lax/r7/A;->hashCode()I

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
    iget-boolean v1, p0, Lax/P0/y$f;->f:Z

    .line 32
    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-boolean v1, p0, Lax/P0/y$f;->h:Z

    .line 37
    .line 38
    add-int/2addr v0, v1

    .line 39
    mul-int/lit8 v0, v0, 0x1f

    .line 40
    .line 41
    iget-boolean v1, p0, Lax/P0/y$f;->g:Z

    .line 42
    .line 43
    add-int/2addr v0, v1

    .line 44
    mul-int/lit8 v0, v0, 0x1f

    .line 45
    .line 46
    iget-object v1, p0, Lax/P0/y$f;->j:Lax/r7/z;

    .line 47
    .line 48
    invoke-virtual {v1}, Lax/r7/z;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v0, v1

    .line 53
    mul-int/lit8 v0, v0, 0x1f

    .line 54
    .line 55
    iget-object v1, p0, Lax/P0/y$f;->k:[B

    .line 56
    .line 57
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v0, v1

    .line 62
    return v0
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
