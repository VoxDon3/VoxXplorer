.class public Lax/g4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private c0:F

.field private d0:Lax/P3/h;

.field private e0:Lax/J3/g;

.field private f0:Landroid/graphics/drawable/Drawable;

.field private g0:I

.field private h0:Landroid/graphics/drawable/Drawable;

.field private i0:I

.field private j0:Z

.field private k0:I

.field private l0:I

.field private m0:Lax/M3/h;

.field private n0:Z

.field private o0:Z

.field private p0:Landroid/graphics/drawable/Drawable;

.field private q:I

.field private q0:I

.field private r0:Lax/M3/j;

.field private s0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lax/M3/m<",
            "*>;>;"
        }
    .end annotation
.end field

.field private t0:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private u0:Z

.field private v0:Landroid/content/res/Resources$Theme;

.field private w0:Z

.field private x0:Z

.field private y0:Z

.field private z0:Z


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lax/g4/f;->c0:F

    .line 7
    .line 8
    sget-object v0, Lax/P3/h;->e:Lax/P3/h;

    .line 9
    .line 10
    iput-object v0, p0, Lax/g4/f;->d0:Lax/P3/h;

    .line 11
    .line 12
    sget-object v0, Lax/J3/g;->d0:Lax/J3/g;

    .line 13
    .line 14
    iput-object v0, p0, Lax/g4/f;->e0:Lax/J3/g;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lax/g4/f;->j0:Z

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Lax/g4/f;->k0:I

    .line 21
    .line 22
    iput v1, p0, Lax/g4/f;->l0:I

    .line 23
    .line 24
    invoke-static {}, Lax/j4/a;->c()Lax/j4/a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Lax/g4/f;->m0:Lax/M3/h;

    .line 29
    .line 30
    iput-boolean v0, p0, Lax/g4/f;->o0:Z

    .line 31
    .line 32
    new-instance v1, Lax/M3/j;

    .line 33
    .line 34
    invoke-direct {v1}, Lax/M3/j;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lax/g4/f;->r0:Lax/M3/j;

    .line 38
    .line 39
    new-instance v1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lax/g4/f;->s0:Ljava/util/Map;

    .line 45
    .line 46
    const-class v1, Ljava/lang/Object;

    .line 47
    .line 48
    iput-object v1, p0, Lax/g4/f;->t0:Ljava/lang/Class;

    .line 49
    .line 50
    iput-boolean v0, p0, Lax/g4/f;->z0:Z

    .line 51
    .line 52
    return-void
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

.method private J(I)Z
    .registers 3

    .line 1
    iget v0, p0, Lax/g4/f;->q:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Lax/g4/f;->K(II)Z

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

.method private static K(II)Z
    .registers 2

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_5
    const/4 p0, 0x0

    .line 7
    return p0
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

.method private S()Lax/g4/f;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->u0:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "You cannot modify locked RequestOptions, consider clone()"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static U(Lax/M3/h;)Lax/g4/f;
    .registers 2

    .line 1
    new-instance v0, Lax/g4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/g4/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lax/g4/f;->T(Lax/M3/h;)Lax/g4/f;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method public static h(Ljava/lang/Class;)Lax/g4/f;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lax/g4/f;"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/g4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/g4/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lax/g4/f;->f(Ljava/lang/Class;)Lax/g4/f;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method public static j(Lax/P3/h;)Lax/g4/f;
    .registers 2

    .line 1
    new-instance v0, Lax/g4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/g4/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lax/g4/f;->i(Lax/P3/h;)Lax/g4/f;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.method public final B()Lax/M3/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/f;->m0:Lax/M3/h;

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

.method public final C()F
    .registers 2

    .line 1
    iget v0, p0, Lax/g4/f;->c0:F

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

.method public final D()Landroid/content/res/Resources$Theme;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/f;->v0:Landroid/content/res/Resources$Theme;

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

.method public final E()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lax/M3/m<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/g4/f;->s0:Ljava/util/Map;

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

.method public final F()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->x0:Z

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

.method public final G()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->j0:Z

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

.method public final H()Z
    .registers 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/g4/f;->J(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public I()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->z0:Z

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

.method public final L()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->n0:Z

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

.method public final M()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/g4/f;->l0:I

    .line 2
    .line 3
    iget v1, p0, Lax/g4/f;->k0:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lax/k4/i;->r(II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

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

.method public N()Lax/g4/f;
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/g4/f;->u0:Z

    .line 3
    .line 4
    return-object p0
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

.method public O(Lax/M3/m;)Lax/g4/f;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/m<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lax/g4/f;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/g4/f;->O(Lax/M3/m;)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    const-class v0, Landroid/graphics/Bitmap;

    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lax/g4/f;->P(Ljava/lang/Class;Lax/M3/m;)Lax/g4/f;

    .line 17
    .line 18
    .line 19
    new-instance v0, Lax/X3/c;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lax/X3/c;-><init>(Lax/M3/m;)V

    .line 22
    .line 23
    .line 24
    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0}, Lax/g4/f;->P(Ljava/lang/Class;Lax/M3/m;)Lax/g4/f;

    .line 27
    .line 28
    .line 29
    new-instance v0, Lax/b4/f;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Lax/b4/f;-><init>(Lax/M3/m;)V

    .line 32
    .line 33
    .line 34
    const-class p1, Lax/b4/c;

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Lax/g4/f;->P(Ljava/lang/Class;Lax/M3/m;)Lax/g4/f;

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
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

.method public P(Ljava/lang/Class;Lax/M3/m;)Lax/g4/f;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lax/M3/m<",
            "TT;>;)",
            "Lax/g4/f;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lax/g4/f;->P(Ljava/lang/Class;Lax/M3/m;)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/g4/f;->s0:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lax/g4/f;->q:I

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    iput-boolean p2, p0, Lax/g4/f;->o0:Z

    .line 29
    .line 30
    const p2, 0x10800

    .line 31
    .line 32
    .line 33
    or-int/2addr p1, p2

    .line 34
    iput p1, p0, Lax/g4/f;->q:I

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput-boolean p1, p0, Lax/g4/f;->z0:Z

    .line 38
    .line 39
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
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
.end method

.method public Q(II)Lax/g4/f;
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lax/g4/f;->Q(II)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    iput p1, p0, Lax/g4/f;->l0:I

    .line 15
    .line 16
    iput p2, p0, Lax/g4/f;->k0:I

    .line 17
    .line 18
    iget p1, p0, Lax/g4/f;->q:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x200

    .line 21
    .line 22
    iput p1, p0, Lax/g4/f;->q:I

    .line 23
    .line 24
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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

.method public R(Lax/J3/g;)Lax/g4/f;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/g4/f;->R(Lax/J3/g;)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lax/J3/g;

    .line 19
    .line 20
    iput-object p1, p0, Lax/g4/f;->e0:Lax/J3/g;

    .line 21
    .line 22
    iget p1, p0, Lax/g4/f;->q:I

    .line 23
    .line 24
    or-int/lit8 p1, p1, 0x8

    .line 25
    .line 26
    iput p1, p0, Lax/g4/f;->q:I

    .line 27
    .line 28
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
.end method

.method public T(Lax/M3/h;)Lax/g4/f;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/g4/f;->T(Lax/M3/h;)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lax/M3/h;

    .line 19
    .line 20
    iput-object p1, p0, Lax/g4/f;->m0:Lax/M3/h;

    .line 21
    .line 22
    iget p1, p0, Lax/g4/f;->q:I

    .line 23
    .line 24
    or-int/lit16 p1, p1, 0x400

    .line 25
    .line 26
    iput p1, p0, Lax/g4/f;->q:I

    .line 27
    .line 28
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
.end method

.method public V(F)Lax/g4/f;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/g4/f;->V(F)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    const/4 v0, 0x0

    .line 15
    cmpg-float v0, p1, v0

    .line 16
    .line 17
    if-ltz v0, :cond_25

    .line 18
    .line 19
    const/high16 v0, 0x3f800000    # 1.0f

    .line 20
    .line 21
    cmpl-float v0, p1, v0

    .line 22
    .line 23
    if-gtz v0, :cond_25

    .line 24
    .line 25
    iput p1, p0, Lax/g4/f;->c0:F

    .line 26
    .line 27
    iget p1, p0, Lax/g4/f;->q:I

    .line 28
    .line 29
    or-int/lit8 p1, p1, 0x2

    .line 30
    .line 31
    iput p1, p0, Lax/g4/f;->q:I

    .line 32
    .line 33
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_25
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string v0, "sizeMultiplier must be between 0 and 1"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
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

.method public X(Z)Lax/g4/f;
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_e

    .line 5
    .line 6
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, v1}, Lax/g4/f;->X(Z)Lax/g4/f;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_e
    xor-int/2addr p1, v1

    .line 16
    iput-boolean p1, p0, Lax/g4/f;->j0:Z

    .line 17
    .line 18
    iget p1, p0, Lax/g4/f;->q:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x100

    .line 21
    .line 22
    iput p1, p0, Lax/g4/f;->q:I

    .line 23
    .line 24
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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
.end method

.method public Y(Lax/M3/m;)Lax/g4/f;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/m<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lax/g4/f;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/g4/f;->Y(Lax/M3/m;)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    invoke-virtual {p0, p1}, Lax/g4/f;->O(Lax/M3/m;)Lax/g4/f;

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lax/g4/f;->n0:Z

    .line 19
    .line 20
    iget p1, p0, Lax/g4/f;->q:I

    .line 21
    .line 22
    const/high16 v0, 0x20000

    .line 23
    .line 24
    or-int/2addr p1, v0

    .line 25
    iput p1, p0, Lax/g4/f;->q:I

    .line 26
    .line 27
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
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
.end method

.method public b(Lax/g4/f;)Lax/g4/f;
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/g4/f;->b(Lax/g4/f;)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    iget v0, p1, Lax/g4/f;->q:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1a

    .line 22
    .line 23
    iget v0, p1, Lax/g4/f;->c0:F

    .line 24
    .line 25
    iput v0, p0, Lax/g4/f;->c0:F

    .line 26
    .line 27
    :cond_1a
    iget v0, p1, Lax/g4/f;->q:I

    .line 28
    .line 29
    const/high16 v1, 0x40000

    .line 30
    .line 31
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_28

    .line 36
    .line 37
    iget-boolean v0, p1, Lax/g4/f;->x0:Z

    .line 38
    .line 39
    iput-boolean v0, p0, Lax/g4/f;->x0:Z

    .line 40
    .line 41
    :cond_28
    iget v0, p1, Lax/g4/f;->q:I

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_35

    .line 49
    .line 50
    iget-object v0, p1, Lax/g4/f;->d0:Lax/P3/h;

    .line 51
    .line 52
    iput-object v0, p0, Lax/g4/f;->d0:Lax/P3/h;

    .line 53
    .line 54
    :cond_35
    iget v0, p1, Lax/g4/f;->q:I

    .line 55
    .line 56
    const/16 v1, 0x8

    .line 57
    .line 58
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_43

    .line 63
    .line 64
    iget-object v0, p1, Lax/g4/f;->e0:Lax/J3/g;

    .line 65
    .line 66
    iput-object v0, p0, Lax/g4/f;->e0:Lax/J3/g;

    .line 67
    .line 68
    :cond_43
    iget v0, p1, Lax/g4/f;->q:I

    .line 69
    .line 70
    const/16 v1, 0x10

    .line 71
    .line 72
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_51

    .line 77
    .line 78
    iget-object v0, p1, Lax/g4/f;->f0:Landroid/graphics/drawable/Drawable;

    .line 79
    .line 80
    iput-object v0, p0, Lax/g4/f;->f0:Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    :cond_51
    iget v0, p1, Lax/g4/f;->q:I

    .line 83
    .line 84
    const/16 v1, 0x20

    .line 85
    .line 86
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_5f

    .line 91
    .line 92
    iget v0, p1, Lax/g4/f;->g0:I

    .line 93
    .line 94
    iput v0, p0, Lax/g4/f;->g0:I

    .line 95
    .line 96
    :cond_5f
    iget v0, p1, Lax/g4/f;->q:I

    .line 97
    .line 98
    const/16 v1, 0x40

    .line 99
    .line 100
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6d

    .line 105
    .line 106
    iget-object v0, p1, Lax/g4/f;->h0:Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    iput-object v0, p0, Lax/g4/f;->h0:Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    :cond_6d
    iget v0, p1, Lax/g4/f;->q:I

    .line 111
    .line 112
    const/16 v1, 0x80

    .line 113
    .line 114
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_7b

    .line 119
    .line 120
    iget v0, p1, Lax/g4/f;->i0:I

    .line 121
    .line 122
    iput v0, p0, Lax/g4/f;->i0:I

    .line 123
    .line 124
    :cond_7b
    iget v0, p1, Lax/g4/f;->q:I

    .line 125
    .line 126
    const/16 v1, 0x100

    .line 127
    .line 128
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_89

    .line 133
    .line 134
    iget-boolean v0, p1, Lax/g4/f;->j0:Z

    .line 135
    .line 136
    iput-boolean v0, p0, Lax/g4/f;->j0:Z

    .line 137
    .line 138
    :cond_89
    iget v0, p1, Lax/g4/f;->q:I

    .line 139
    .line 140
    const/16 v1, 0x200

    .line 141
    .line 142
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_9b

    .line 147
    .line 148
    iget v0, p1, Lax/g4/f;->l0:I

    .line 149
    .line 150
    iput v0, p0, Lax/g4/f;->l0:I

    .line 151
    .line 152
    iget v0, p1, Lax/g4/f;->k0:I

    .line 153
    .line 154
    iput v0, p0, Lax/g4/f;->k0:I

    .line 155
    .line 156
    :cond_9b
    iget v0, p1, Lax/g4/f;->q:I

    .line 157
    .line 158
    const/16 v1, 0x400

    .line 159
    .line 160
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_a9

    .line 165
    .line 166
    iget-object v0, p1, Lax/g4/f;->m0:Lax/M3/h;

    .line 167
    .line 168
    iput-object v0, p0, Lax/g4/f;->m0:Lax/M3/h;

    .line 169
    .line 170
    :cond_a9
    iget v0, p1, Lax/g4/f;->q:I

    .line 171
    .line 172
    const/16 v1, 0x1000

    .line 173
    .line 174
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_b7

    .line 179
    .line 180
    iget-object v0, p1, Lax/g4/f;->t0:Ljava/lang/Class;

    .line 181
    .line 182
    iput-object v0, p0, Lax/g4/f;->t0:Ljava/lang/Class;

    .line 183
    .line 184
    :cond_b7
    iget v0, p1, Lax/g4/f;->q:I

    .line 185
    .line 186
    const/16 v1, 0x2000

    .line 187
    .line 188
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_c5

    .line 193
    .line 194
    iget-object v0, p1, Lax/g4/f;->p0:Landroid/graphics/drawable/Drawable;

    .line 195
    .line 196
    iput-object v0, p0, Lax/g4/f;->p0:Landroid/graphics/drawable/Drawable;

    .line 197
    .line 198
    :cond_c5
    iget v0, p1, Lax/g4/f;->q:I

    .line 199
    .line 200
    const/16 v1, 0x4000

    .line 201
    .line 202
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_d3

    .line 207
    .line 208
    iget v0, p1, Lax/g4/f;->q0:I

    .line 209
    .line 210
    iput v0, p0, Lax/g4/f;->q0:I

    .line 211
    .line 212
    :cond_d3
    iget v0, p1, Lax/g4/f;->q:I

    .line 213
    .line 214
    const v1, 0x8000

    .line 215
    .line 216
    .line 217
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_e2

    .line 222
    .line 223
    iget-object v0, p1, Lax/g4/f;->v0:Landroid/content/res/Resources$Theme;

    .line 224
    .line 225
    iput-object v0, p0, Lax/g4/f;->v0:Landroid/content/res/Resources$Theme;

    .line 226
    .line 227
    :cond_e2
    iget v0, p1, Lax/g4/f;->q:I

    .line 228
    .line 229
    const/high16 v1, 0x10000

    .line 230
    .line 231
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_f0

    .line 236
    .line 237
    iget-boolean v0, p1, Lax/g4/f;->o0:Z

    .line 238
    .line 239
    iput-boolean v0, p0, Lax/g4/f;->o0:Z

    .line 240
    .line 241
    :cond_f0
    iget v0, p1, Lax/g4/f;->q:I

    .line 242
    .line 243
    const/high16 v1, 0x20000

    .line 244
    .line 245
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_fe

    .line 250
    .line 251
    iget-boolean v0, p1, Lax/g4/f;->n0:Z

    .line 252
    .line 253
    iput-boolean v0, p0, Lax/g4/f;->n0:Z

    .line 254
    .line 255
    :cond_fe
    iget v0, p1, Lax/g4/f;->q:I

    .line 256
    .line 257
    const/16 v1, 0x800

    .line 258
    .line 259
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_113

    .line 264
    .line 265
    iget-object v0, p0, Lax/g4/f;->s0:Ljava/util/Map;

    .line 266
    .line 267
    iget-object v1, p1, Lax/g4/f;->s0:Ljava/util/Map;

    .line 268
    .line 269
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 270
    .line 271
    .line 272
    iget-boolean v0, p1, Lax/g4/f;->z0:Z

    .line 273
    .line 274
    iput-boolean v0, p0, Lax/g4/f;->z0:Z

    .line 275
    .line 276
    :cond_113
    iget v0, p1, Lax/g4/f;->q:I

    .line 277
    .line 278
    const/high16 v1, 0x80000

    .line 279
    .line 280
    invoke-static {v0, v1}, Lax/g4/f;->K(II)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_121

    .line 285
    .line 286
    iget-boolean v0, p1, Lax/g4/f;->y0:Z

    .line 287
    .line 288
    iput-boolean v0, p0, Lax/g4/f;->y0:Z

    .line 289
    .line 290
    :cond_121
    iget-boolean v0, p0, Lax/g4/f;->o0:Z

    .line 291
    .line 292
    if-nez v0, :cond_138

    .line 293
    .line 294
    iget-object v0, p0, Lax/g4/f;->s0:Ljava/util/Map;

    .line 295
    .line 296
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 297
    .line 298
    .line 299
    iget v0, p0, Lax/g4/f;->q:I

    .line 300
    .line 301
    const/4 v1, 0x0

    .line 302
    iput-boolean v1, p0, Lax/g4/f;->n0:Z

    .line 303
    .line 304
    const v1, -0x20801

    .line 305
    .line 306
    .line 307
    and-int/2addr v0, v1

    .line 308
    iput v0, p0, Lax/g4/f;->q:I

    .line 309
    .line 310
    const/4 v0, 0x1

    .line 311
    iput-boolean v0, p0, Lax/g4/f;->z0:Z

    .line 312
    .line 313
    :cond_138
    iget v0, p0, Lax/g4/f;->q:I

    .line 314
    .line 315
    iget v1, p1, Lax/g4/f;->q:I

    .line 316
    .line 317
    or-int/2addr v0, v1

    .line 318
    iput v0, p0, Lax/g4/f;->q:I

    .line 319
    .line 320
    iget-object v0, p0, Lax/g4/f;->r0:Lax/M3/j;

    .line 321
    .line 322
    iget-object p1, p1, Lax/g4/f;->r0:Lax/M3/j;

    .line 323
    .line 324
    invoke-virtual {v0, p1}, Lax/M3/j;->d(Lax/M3/j;)V

    .line 325
    .line 326
    .line 327
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    return-object p1
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public c()Lax/g4/f;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->u0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_11

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    goto :goto_11

    .line 10
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "You cannot auto lock an already locked options object, try clone() first"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :cond_11
    :goto_11
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Lax/g4/f;->N()Lax/g4/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

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

.method public d()Lax/g4/f;
    .registers 4

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lax/g4/f;

    .line 6
    .line 7
    new-instance v1, Lax/M3/j;

    .line 8
    .line 9
    invoke-direct {v1}, Lax/M3/j;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lax/g4/f;->r0:Lax/M3/j;

    .line 13
    .line 14
    iget-object v2, p0, Lax/g4/f;->r0:Lax/M3/j;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lax/M3/j;->d(Lax/M3/j;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Lax/g4/f;->s0:Ljava/util/Map;

    .line 25
    .line 26
    iget-object v2, p0, Lax/g4/f;->s0:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, v0, Lax/g4/f;->u0:Z

    .line 33
    .line 34
    iput-boolean v1, v0, Lax/g4/f;->w0:Z
    :try_end_23
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_23} :catch_24

    .line 35
    .line 36
    return-object v0

    .line 37
    :catch_24
    move-exception v0

    .line 38
    new-instance v1, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    throw v1
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

.method public equals(Ljava/lang/Object;)Z
    .registers 5

    .line 1
    instance-of v0, p1, Lax/g4/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_af

    .line 5
    .line 6
    check-cast p1, Lax/g4/f;

    .line 7
    .line 8
    iget v0, p1, Lax/g4/f;->c0:F

    .line 9
    .line 10
    iget v2, p0, Lax/g4/f;->c0:F

    .line 11
    .line 12
    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_af

    .line 17
    .line 18
    iget v0, p0, Lax/g4/f;->g0:I

    .line 19
    .line 20
    iget v2, p1, Lax/g4/f;->g0:I

    .line 21
    .line 22
    if-ne v0, v2, :cond_af

    .line 23
    .line 24
    iget-object v0, p0, Lax/g4/f;->f0:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    iget-object v2, p1, Lax/g4/f;->f0:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    invoke-static {v0, v2}, Lax/k4/i;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_af

    .line 33
    .line 34
    iget v0, p0, Lax/g4/f;->i0:I

    .line 35
    .line 36
    iget v2, p1, Lax/g4/f;->i0:I

    .line 37
    .line 38
    if-ne v0, v2, :cond_af

    .line 39
    .line 40
    iget-object v0, p0, Lax/g4/f;->h0:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    iget-object v2, p1, Lax/g4/f;->h0:Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    invoke-static {v0, v2}, Lax/k4/i;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_af

    .line 49
    .line 50
    iget v0, p0, Lax/g4/f;->q0:I

    .line 51
    .line 52
    iget v2, p1, Lax/g4/f;->q0:I

    .line 53
    .line 54
    if-ne v0, v2, :cond_af

    .line 55
    .line 56
    iget-object v0, p0, Lax/g4/f;->p0:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    iget-object v2, p1, Lax/g4/f;->p0:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-static {v0, v2}, Lax/k4/i;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_af

    .line 65
    .line 66
    iget-boolean v0, p0, Lax/g4/f;->j0:Z

    .line 67
    .line 68
    iget-boolean v2, p1, Lax/g4/f;->j0:Z

    .line 69
    .line 70
    if-ne v0, v2, :cond_af

    .line 71
    .line 72
    iget v0, p0, Lax/g4/f;->k0:I

    .line 73
    .line 74
    iget v2, p1, Lax/g4/f;->k0:I

    .line 75
    .line 76
    if-ne v0, v2, :cond_af

    .line 77
    .line 78
    iget v0, p0, Lax/g4/f;->l0:I

    .line 79
    .line 80
    iget v2, p1, Lax/g4/f;->l0:I

    .line 81
    .line 82
    if-ne v0, v2, :cond_af

    .line 83
    .line 84
    iget-boolean v0, p0, Lax/g4/f;->n0:Z

    .line 85
    .line 86
    iget-boolean v2, p1, Lax/g4/f;->n0:Z

    .line 87
    .line 88
    if-ne v0, v2, :cond_af

    .line 89
    .line 90
    iget-boolean v0, p0, Lax/g4/f;->o0:Z

    .line 91
    .line 92
    iget-boolean v2, p1, Lax/g4/f;->o0:Z

    .line 93
    .line 94
    if-ne v0, v2, :cond_af

    .line 95
    .line 96
    iget-boolean v0, p0, Lax/g4/f;->x0:Z

    .line 97
    .line 98
    iget-boolean v2, p1, Lax/g4/f;->x0:Z

    .line 99
    .line 100
    if-ne v0, v2, :cond_af

    .line 101
    .line 102
    iget-boolean v0, p0, Lax/g4/f;->y0:Z

    .line 103
    .line 104
    iget-boolean v2, p1, Lax/g4/f;->y0:Z

    .line 105
    .line 106
    if-ne v0, v2, :cond_af

    .line 107
    .line 108
    iget-object v0, p0, Lax/g4/f;->d0:Lax/P3/h;

    .line 109
    .line 110
    iget-object v2, p1, Lax/g4/f;->d0:Lax/P3/h;

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_af

    .line 117
    .line 118
    iget-object v0, p0, Lax/g4/f;->e0:Lax/J3/g;

    .line 119
    .line 120
    iget-object v2, p1, Lax/g4/f;->e0:Lax/J3/g;

    .line 121
    .line 122
    if-ne v0, v2, :cond_af

    .line 123
    .line 124
    iget-object v0, p0, Lax/g4/f;->r0:Lax/M3/j;

    .line 125
    .line 126
    iget-object v2, p1, Lax/g4/f;->r0:Lax/M3/j;

    .line 127
    .line 128
    invoke-virtual {v0, v2}, Lax/M3/j;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_af

    .line 133
    .line 134
    iget-object v0, p0, Lax/g4/f;->s0:Ljava/util/Map;

    .line 135
    .line 136
    iget-object v2, p1, Lax/g4/f;->s0:Ljava/util/Map;

    .line 137
    .line 138
    invoke-interface {v0, v2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_af

    .line 143
    .line 144
    iget-object v0, p0, Lax/g4/f;->t0:Ljava/lang/Class;

    .line 145
    .line 146
    iget-object v2, p1, Lax/g4/f;->t0:Ljava/lang/Class;

    .line 147
    .line 148
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_af

    .line 153
    .line 154
    iget-object v0, p0, Lax/g4/f;->m0:Lax/M3/h;

    .line 155
    .line 156
    iget-object v2, p1, Lax/g4/f;->m0:Lax/M3/h;

    .line 157
    .line 158
    invoke-static {v0, v2}, Lax/k4/i;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_af

    .line 163
    .line 164
    iget-object v0, p0, Lax/g4/f;->v0:Landroid/content/res/Resources$Theme;

    .line 165
    .line 166
    iget-object p1, p1, Lax/g4/f;->v0:Landroid/content/res/Resources$Theme;

    .line 167
    .line 168
    invoke-static {v0, p1}, Lax/k4/i;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_af

    .line 173
    .line 174
    const/4 p1, 0x1

    .line 175
    return p1

    .line 176
    :cond_af
    return v1
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public f(Ljava/lang/Class;)Lax/g4/f;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lax/g4/f;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/g4/f;->f(Ljava/lang/Class;)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Class;

    .line 19
    .line 20
    iput-object p1, p0, Lax/g4/f;->t0:Ljava/lang/Class;

    .line 21
    .line 22
    iget p1, p0, Lax/g4/f;->q:I

    .line 23
    .line 24
    or-int/lit16 p1, p1, 0x1000

    .line 25
    .line 26
    iput p1, p0, Lax/g4/f;->q:I

    .line 27
    .line 28
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
.end method

.method public hashCode()I
    .registers 3

    .line 1
    iget v0, p0, Lax/g4/f;->c0:F

    .line 2
    .line 3
    invoke-static {v0}, Lax/k4/i;->j(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lax/g4/f;->g0:I

    .line 8
    .line 9
    invoke-static {v1, v0}, Lax/k4/i;->l(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lax/g4/f;->f0:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget v1, p0, Lax/g4/f;->i0:I

    .line 20
    .line 21
    invoke-static {v1, v0}, Lax/k4/i;->l(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v1, p0, Lax/g4/f;->h0:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v1, p0, Lax/g4/f;->q0:I

    .line 32
    .line 33
    invoke-static {v1, v0}, Lax/k4/i;->l(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lax/g4/f;->p0:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-boolean v1, p0, Lax/g4/f;->j0:Z

    .line 44
    .line 45
    invoke-static {v1, v0}, Lax/k4/i;->n(ZI)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v1, p0, Lax/g4/f;->k0:I

    .line 50
    .line 51
    invoke-static {v1, v0}, Lax/k4/i;->l(II)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget v1, p0, Lax/g4/f;->l0:I

    .line 56
    .line 57
    invoke-static {v1, v0}, Lax/k4/i;->l(II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-boolean v1, p0, Lax/g4/f;->n0:Z

    .line 62
    .line 63
    invoke-static {v1, v0}, Lax/k4/i;->n(ZI)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget-boolean v1, p0, Lax/g4/f;->o0:Z

    .line 68
    .line 69
    invoke-static {v1, v0}, Lax/k4/i;->n(ZI)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-boolean v1, p0, Lax/g4/f;->x0:Z

    .line 74
    .line 75
    invoke-static {v1, v0}, Lax/k4/i;->n(ZI)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-boolean v1, p0, Lax/g4/f;->y0:Z

    .line 80
    .line 81
    invoke-static {v1, v0}, Lax/k4/i;->n(ZI)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p0, Lax/g4/f;->d0:Lax/P3/h;

    .line 86
    .line 87
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v1, p0, Lax/g4/f;->e0:Lax/J3/g;

    .line 92
    .line 93
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget-object v1, p0, Lax/g4/f;->r0:Lax/M3/j;

    .line 98
    .line 99
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget-object v1, p0, Lax/g4/f;->s0:Ljava/util/Map;

    .line 104
    .line 105
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-object v1, p0, Lax/g4/f;->t0:Ljava/lang/Class;

    .line 110
    .line 111
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v1, p0, Lax/g4/f;->m0:Lax/M3/h;

    .line 116
    .line 117
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iget-object v1, p0, Lax/g4/f;->v0:Landroid/content/res/Resources$Theme;

    .line 122
    .line 123
    invoke-static {v1, v0}, Lax/k4/i;->m(Ljava/lang/Object;I)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    return v0
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
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public i(Lax/P3/h;)Lax/g4/f;
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->w0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/g4/f;->d()Lax/g4/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lax/g4/f;->i(Lax/P3/h;)Lax/g4/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_d
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lax/P3/h;

    .line 19
    .line 20
    iput-object p1, p0, Lax/g4/f;->d0:Lax/P3/h;

    .line 21
    .line 22
    iget p1, p0, Lax/g4/f;->q:I

    .line 23
    .line 24
    or-int/lit8 p1, p1, 0x4

    .line 25
    .line 26
    iput p1, p0, Lax/g4/f;->q:I

    .line 27
    .line 28
    invoke-direct {p0}, Lax/g4/f;->S()Lax/g4/f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
.end method

.method public final k()Lax/P3/h;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/f;->d0:Lax/P3/h;

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

.method public final l()I
    .registers 2

    .line 1
    iget v0, p0, Lax/g4/f;->g0:I

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

.method public final m()Landroid/graphics/drawable/Drawable;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/f;->f0:Landroid/graphics/drawable/Drawable;

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

.method public final n()Landroid/graphics/drawable/Drawable;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/f;->p0:Landroid/graphics/drawable/Drawable;

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

.method public final o()I
    .registers 2

    .line 1
    iget v0, p0, Lax/g4/f;->q0:I

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

.method public final r()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/g4/f;->y0:Z

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

.method public final s()Lax/M3/j;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/f;->r0:Lax/M3/j;

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

.method public final t()I
    .registers 2

    .line 1
    iget v0, p0, Lax/g4/f;->k0:I

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

.method public final v()I
    .registers 2

    .line 1
    iget v0, p0, Lax/g4/f;->l0:I

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

.method public final w()Landroid/graphics/drawable/Drawable;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/f;->h0:Landroid/graphics/drawable/Drawable;

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

.method public final x()I
    .registers 2

    .line 1
    iget v0, p0, Lax/g4/f;->i0:I

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

.method public final y()Lax/J3/g;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/g4/f;->e0:Lax/J3/g;

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

.method public final z()Ljava/lang/Class;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/g4/f;->t0:Ljava/lang/Class;

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
