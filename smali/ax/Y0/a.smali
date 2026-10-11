.class public abstract Lax/Y0/a;
.super Lax/P0/N;
.source "SourceFile"


# instance fields
.field private final e:I

.field private final f:Lax/i1/g0;

.field private final g:Z


# direct methods
.method public constructor <init>(ZLax/i1/g0;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Lax/P0/N;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lax/Y0/a;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lax/Y0/a;->f:Lax/i1/g0;

    .line 7
    .line 8
    invoke-interface {p2}, Lax/i1/g0;->getLength()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lax/Y0/a;->e:I

    .line 13
    .line 14
    return-void
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

.method private B(IZ)I
    .registers 3

    .line 1
    if-eqz p2, :cond_9

    .line 2
    .line 3
    iget-object p2, p0, Lax/Y0/a;->f:Lax/i1/g0;

    .line 4
    .line 5
    invoke-interface {p2, p1}, Lax/i1/g0;->d(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_9
    iget p2, p0, Lax/Y0/a;->e:I

    .line 11
    .line 12
    add-int/lit8 p2, p2, -0x1

    .line 13
    .line 14
    if-ge p1, p2, :cond_12

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    return p1

    .line 19
    :cond_12
    const/4 p1, -0x1

    .line 20
    return p1
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

.method private C(IZ)I
    .registers 3

    .line 1
    if-eqz p2, :cond_9

    .line 2
    .line 3
    iget-object p2, p0, Lax/Y0/a;->f:Lax/i1/g0;

    .line 4
    .line 5
    invoke-interface {p2, p1}, Lax/i1/g0;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_9
    if-lez p1, :cond_e

    .line 11
    .line 12
    add-int/lit8 p1, p1, -0x1

    .line 13
    .line 14
    return p1

    .line 15
    :cond_e
    const/4 p1, -0x1

    .line 16
    return p1
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

.method public static v(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 1

    .line 1
    check-cast p0, Landroid/util/Pair;

    .line 2
    .line 3
    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 4
    .line 5
    return-object p0
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

.method public static w(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 1

    .line 1
    check-cast p0, Landroid/util/Pair;

    .line 2
    .line 3
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 4
    .line 5
    return-object p0
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

.method public static y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.method protected abstract A(I)I
.end method

.method protected abstract D(I)Lax/P0/N;
.end method

.method public a(Z)I
    .registers 5

    .line 1
    iget v0, p0, Lax/Y0/a;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-boolean v0, p0, Lax/Y0/a;->g:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    :cond_c
    if-eqz p1, :cond_14

    .line 14
    .line 15
    iget-object v0, p0, Lax/Y0/a;->f:Lax/i1/g0;

    .line 16
    .line 17
    invoke-interface {v0}, Lax/i1/g0;->b()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    :cond_14
    invoke-virtual {p0, v2}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_25

    .line 30
    .line 31
    invoke-direct {p0, v2, p1}, Lax/Y0/a;->B(IZ)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ne v2, v1, :cond_14

    .line 36
    .line 37
    return v1

    .line 38
    :cond_25
    invoke-virtual {p0, v2}, Lax/Y0/a;->A(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0, v2}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1, p1}, Lax/P0/N;->a(Z)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    add-int/2addr v0, p1

    .line 51
    return v0
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

.method public final b(Ljava/lang/Object;)I
    .registers 5

    .line 1
    instance-of v0, p1, Landroid/util/Pair;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    invoke-static {p1}, Lax/Y0/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p1}, Lax/Y0/a;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, v0}, Lax/Y0/a;->s(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne v0, v1, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    invoke-virtual {p0, v0}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, p1}, Lax/P0/N;->b(Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-ne p1, v1, :cond_20

    .line 31
    .line 32
    return v1

    .line 33
    :cond_20
    invoke-virtual {p0, v0}, Lax/Y0/a;->z(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, p1

    .line 38
    return v0
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

.method public c(Z)I
    .registers 5

    .line 1
    iget v0, p0, Lax/Y0/a;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-boolean v2, p0, Lax/Y0/a;->g:Z

    .line 8
    .line 9
    if-eqz v2, :cond_b

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    :cond_b
    if-eqz p1, :cond_14

    .line 13
    .line 14
    iget-object v0, p0, Lax/Y0/a;->f:Lax/i1/g0;

    .line 15
    .line 16
    invoke-interface {v0}, Lax/i1/g0;->f()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_16

    .line 21
    :cond_14
    add-int/lit8 v0, v0, -0x1

    .line 22
    .line 23
    :cond_16
    :goto_16
    invoke-virtual {p0, v0}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Lax/P0/N;->q()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_27

    .line 32
    .line 33
    invoke-direct {p0, v0, p1}, Lax/Y0/a;->C(IZ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ne v0, v1, :cond_16

    .line 38
    .line 39
    return v1

    .line 40
    :cond_27
    invoke-virtual {p0, v0}, Lax/Y0/a;->A(I)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p0, v0}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Lax/P0/N;->c(Z)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    add-int/2addr v1, p1

    .line 53
    return v1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public e(IIZ)I
    .registers 9

    .line 1
    iget-boolean v0, p0, Lax/Y0/a;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    if-ne p2, p3, :cond_a

    .line 9
    .line 10
    const/4 p2, 0x2

    .line 11
    :cond_a
    const/4 p3, 0x0

    .line 12
    :cond_b
    invoke-virtual {p0, p1}, Lax/Y0/a;->u(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v0}, Lax/Y0/a;->A(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {p0, v0}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    sub-int/2addr p1, v3

    .line 25
    if-ne p2, v2, :cond_1b

    .line 26
    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    move v1, p2

    .line 29
    :goto_1c
    invoke-virtual {v4, p1, v1, p3}, Lax/P0/N;->e(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v1, -0x1

    .line 34
    if-eq p1, v1, :cond_25

    .line 35
    .line 36
    add-int/2addr v3, p1

    .line 37
    return v3

    .line 38
    :cond_25
    invoke-direct {p0, v0, p3}, Lax/Y0/a;->B(IZ)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    :goto_29
    if-eq p1, v1, :cond_3a

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3a

    .line 53
    .line 54
    invoke-direct {p0, p1, p3}, Lax/Y0/a;->B(IZ)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    goto :goto_29

    .line 59
    :cond_3a
    if-eq p1, v1, :cond_4a

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lax/Y0/a;->A(I)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-virtual {p0, p1}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1, p3}, Lax/P0/N;->a(Z)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    add-int/2addr p2, p1

    .line 74
    return p2

    .line 75
    :cond_4a
    if-ne p2, v2, :cond_51

    .line 76
    .line 77
    invoke-virtual {p0, p3}, Lax/Y0/a;->a(Z)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    return p1

    .line 82
    :cond_51
    return v1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public final g(ILax/P0/N$b;Z)Lax/P0/N$b;
    .registers 8

    .line 1
    invoke-virtual {p0, p1}, Lax/Y0/a;->t(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lax/Y0/a;->A(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0}, Lax/Y0/a;->z(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0, v0}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sub-int/2addr p1, v2

    .line 18
    invoke-virtual {v3, p1, p2, p3}, Lax/P0/N;->g(ILax/P0/N$b;Z)Lax/P0/N$b;

    .line 19
    .line 20
    .line 21
    iget p1, p2, Lax/P0/N$b;->c:I

    .line 22
    .line 23
    add-int/2addr p1, v1

    .line 24
    iput p1, p2, Lax/P0/N$b;->c:I

    .line 25
    .line 26
    if-eqz p3, :cond_2b

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lax/Y0/a;->x(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p3, p2, Lax/P0/N$b;->b:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {p3}, Lax/S0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-static {p1, p3}, Lax/Y0/a;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p2, Lax/P0/N$b;->b:Ljava/lang/Object;

    .line 43
    .line 44
    :cond_2b
    return-object p2
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

.method public final h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;
    .registers 6

    .line 1
    invoke-static {p1}, Lax/Y0/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lax/Y0/a;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0, v0}, Lax/Y0/a;->s(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lax/Y0/a;->A(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p0, v0}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0, v1, p2}, Lax/P0/N;->h(Ljava/lang/Object;Lax/P0/N$b;)Lax/P0/N$b;

    .line 22
    .line 23
    .line 24
    iget v0, p2, Lax/P0/N$b;->c:I

    .line 25
    .line 26
    add-int/2addr v0, v2

    .line 27
    iput v0, p2, Lax/P0/N$b;->c:I

    .line 28
    .line 29
    iput-object p1, p2, Lax/P0/N$b;->b:Ljava/lang/Object;

    .line 30
    .line 31
    return-object p2
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

.method public l(IIZ)I
    .registers 9

    .line 1
    iget-boolean v0, p0, Lax/Y0/a;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    if-ne p2, p3, :cond_a

    .line 9
    .line 10
    const/4 p2, 0x2

    .line 11
    :cond_a
    const/4 p3, 0x0

    .line 12
    :cond_b
    invoke-virtual {p0, p1}, Lax/Y0/a;->u(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v0}, Lax/Y0/a;->A(I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {p0, v0}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    sub-int/2addr p1, v3

    .line 25
    if-ne p2, v2, :cond_1b

    .line 26
    .line 27
    goto :goto_1c

    .line 28
    :cond_1b
    move v1, p2

    .line 29
    :goto_1c
    invoke-virtual {v4, p1, v1, p3}, Lax/P0/N;->l(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v1, -0x1

    .line 34
    if-eq p1, v1, :cond_25

    .line 35
    .line 36
    add-int/2addr v3, p1

    .line 37
    return v3

    .line 38
    :cond_25
    invoke-direct {p0, v0, p3}, Lax/Y0/a;->C(IZ)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    :goto_29
    if-eq p1, v1, :cond_3a

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lax/P0/N;->q()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3a

    .line 53
    .line 54
    invoke-direct {p0, p1, p3}, Lax/Y0/a;->C(IZ)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    goto :goto_29

    .line 59
    :cond_3a
    if-eq p1, v1, :cond_4a

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lax/Y0/a;->A(I)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-virtual {p0, p1}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1, p3}, Lax/P0/N;->c(Z)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    add-int/2addr p2, p1

    .line 74
    return p2

    .line 75
    :cond_4a
    if-ne p2, v2, :cond_51

    .line 76
    .line 77
    invoke-virtual {p0, p3}, Lax/Y0/a;->c(Z)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    return p1

    .line 82
    :cond_51
    return v1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public final m(I)Ljava/lang/Object;
    .registers 5

    .line 1
    invoke-virtual {p0, p1}, Lax/Y0/a;->t(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lax/Y0/a;->z(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sub-int/2addr p1, v1

    .line 14
    invoke-virtual {v2, p1}, Lax/P0/N;->m(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, v0}, Lax/Y0/a;->x(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0, p1}, Lax/Y0/a;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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
.end method

.method public final o(ILax/P0/N$c;J)Lax/P0/N$c;
    .registers 9

    .line 1
    invoke-virtual {p0, p1}, Lax/Y0/a;->u(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Lax/Y0/a;->A(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0}, Lax/Y0/a;->z(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0, v0}, Lax/Y0/a;->D(I)Lax/P0/N;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sub-int/2addr p1, v1

    .line 18
    invoke-virtual {v3, p1, p2, p3, p4}, Lax/P0/N;->o(ILax/P0/N$c;J)Lax/P0/N$c;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lax/Y0/a;->x(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object p3, Lax/P0/N$c;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object p4, p2, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {p3, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-eqz p3, :cond_23

    .line 34
    .line 35
    goto :goto_29

    .line 36
    :cond_23
    iget-object p3, p2, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {p1, p3}, Lax/Y0/a;->y(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_29
    iput-object p1, p2, Lax/P0/N$c;->a:Ljava/lang/Object;

    .line 43
    .line 44
    iget p1, p2, Lax/P0/N$c;->n:I

    .line 45
    .line 46
    add-int/2addr p1, v2

    .line 47
    iput p1, p2, Lax/P0/N$c;->n:I

    .line 48
    .line 49
    iget p1, p2, Lax/P0/N$c;->o:I

    .line 50
    .line 51
    add-int/2addr p1, v2

    .line 52
    iput p1, p2, Lax/P0/N$c;->o:I

    .line 53
    .line 54
    return-object p2
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

.method protected abstract s(Ljava/lang/Object;)I
.end method

.method protected abstract t(I)I
.end method

.method protected abstract u(I)I
.end method

.method protected abstract x(I)Ljava/lang/Object;
.end method

.method protected abstract z(I)I
.end method
