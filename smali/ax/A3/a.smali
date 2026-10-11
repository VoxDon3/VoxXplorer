.class public Lax/A3/a;
.super Lax/c5/a;
.source "SourceFile"

# interfaces
.implements Lax/A3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/c5/a<",
        "Lax/A3/b$a;",
        ">;",
        "Lax/A3/b;"
    }
.end annotation


# instance fields
.field private o:Ljava/lang/String;

.field private p:Lax/A3/b$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1, p2}, Lax/c5/a;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lax/A3/a;->o:Ljava/lang/String;

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


# virtual methods
.method public bridge synthetic H()Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/A3/a;->L()Lax/A3/b$a;

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

.method public bridge synthetic I(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lax/A3/b$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/A3/a;->M(Lax/A3/b$a;)V

    .line 4
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

.method public K(Lax/A3/b$a;)V
    .registers 5

    .line 1
    invoke-virtual {p0}, Lax/K0/c;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_13

    .line 6
    .line 7
    if-eqz p1, :cond_36

    .line 8
    .line 9
    iget-object v0, p1, Lax/A3/b$a;->c:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lax/A3/a;->N(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p1, Lax/A3/b$a;->b:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lax/A3/a;->O(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    iget-object v0, p0, Lax/A3/a;->p:Lax/A3/b$a;

    .line 21
    .line 22
    iput-object p1, p0, Lax/A3/a;->p:Lax/A3/b$a;

    .line 23
    .line 24
    invoke-virtual {p0}, Lax/K0/c;->n()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_20

    .line 29
    .line 30
    invoke-super {p0, p1}, Lax/K0/c;->h(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_20
    if-eqz v0, :cond_2b

    .line 34
    .line 35
    iget-object v1, v0, Lax/A3/b$a;->c:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    iget-object v2, p1, Lax/A3/b$a;->c:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    if-eq v1, v2, :cond_2b

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lax/A3/a;->N(Landroid/graphics/Bitmap;)V

    .line 42
    .line 43
    .line 44
    :cond_2b
    if-eqz v0, :cond_36

    .line 45
    .line 46
    iget-object v0, v0, Lax/A3/b$a;->b:Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    iget-object p1, p1, Lax/A3/b$a;->b:Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    if-eq v0, p1, :cond_36

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lax/A3/a;->O(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_36
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public L()Lax/A3/b$a;
    .registers 5

    .line 1
    new-instance v0, Lax/A3/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/A3/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lax/K0/c;->j()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_35

    .line 11
    .line 12
    iget-object v2, p0, Lax/A3/a;->o:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v2, :cond_35

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    :try_start_14
    iget-object v3, p0, Lax/A3/a;->o:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v1, v3}, Lax/C3/b;->b(Landroid/content/ContentResolver;Landroid/net/Uri;)Lax/C3/b$d;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget v3, Lcom/android/ex/photo/f;->O:I

    .line 32
    .line 33
    invoke-static {v1, v3, v2}, Lax/C3/b;->c(Lax/C3/b$d;IZ)Lax/A3/b$a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, v0, Lax/A3/b$a;->c:Landroid/graphics/Bitmap;

    .line 38
    .line 39
    if-eqz v1, :cond_30

    .line 40
    .line 41
    const/16 v3, 0xa0

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Landroid/graphics/Bitmap;->setDensity(I)V
    :try_end_2d
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_14 .. :try_end_2d} :catch_2e

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :catch_2e
    move-exception v1

    .line 48
    goto :goto_31

    .line 49
    :cond_30
    return-object v0

    .line 50
    :goto_31
    iput v2, v0, Lax/A3/b$a;->e:I

    .line 51
    .line 52
    iput-object v1, v0, Lax/A3/b$a;->h:Ljava/lang/Throwable;

    .line 53
    .line 54
    :cond_35
    return-object v0
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

.method public M(Lax/A3/b$a;)V
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lax/c5/a;->I(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_f

    .line 5
    .line 6
    iget-object v0, p1, Lax/A3/b$a;->c:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lax/A3/a;->N(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lax/A3/b$a;->b:Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lax/A3/a;->O(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected N(Landroid/graphics/Bitmap;)V
    .registers 3

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_b

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 10
    .line 11
    .line 12
    :cond_b
    return-void
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

.method protected O(Landroid/graphics/drawable/Drawable;)V
    .registers 2

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

.method public b(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/A3/a;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-void
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

.method public bridge synthetic h(Ljava/lang/Object;)V
    .registers 2

    .line 1
    check-cast p1, Lax/A3/b$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/A3/a;->K(Lax/A3/b$a;)V

    .line 4
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

.method protected s()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/K0/c;->s()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/A3/a;->u()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/A3/a;->p:Lax/A3/b$a;

    .line 8
    .line 9
    if-eqz v0, :cond_19

    .line 10
    .line 11
    iget-object v0, v0, Lax/A3/b$a;->c:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lax/A3/a;->N(Landroid/graphics/Bitmap;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lax/A3/a;->p:Lax/A3/b$a;

    .line 17
    .line 18
    iget-object v0, v0, Lax/A3/b$a;->b:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lax/A3/a;->O(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lax/A3/a;->p:Lax/A3/b$a;

    .line 25
    .line 26
    :cond_19
    return-void
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

.method protected t()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/A3/a;->p:Lax/A3/b$a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lax/A3/a;->K(Lax/A3/b$a;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    invoke-virtual {p0}, Lax/K0/c;->A()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_13

    .line 13
    .line 14
    iget-object v0, p0, Lax/A3/a;->p:Lax/A3/b$a;

    .line 15
    .line 16
    if-nez v0, :cond_12

    .line 17
    .line 18
    goto :goto_13

    .line 19
    :cond_12
    return-void

    .line 20
    :cond_13
    :goto_13
    invoke-virtual {p0}, Lax/K0/c;->a()V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method protected u()V
    .registers 1

    .line 1
    invoke-virtual {p0}, Lax/K0/c;->d()Z

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
.end method
