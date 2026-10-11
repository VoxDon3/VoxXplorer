.class public Lax/b4/e;
.super Lax/Z3/a;
.source "SourceFile"

# interfaces
.implements Lax/P3/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/Z3/a<",
        "Lax/b4/c;",
        ">;",
        "Lax/P3/p;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lax/b4/c;)V
    .registers 2

    .line 1
    invoke-direct {p0, p1}, Lax/Z3/a;-><init>(Landroid/graphics/drawable/Drawable;)V

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
.end method


# virtual methods
.method public a()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z3/a;->q:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    check-cast v0, Lax/b4/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/c;->d()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 10
    .line 11
    .line 12
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
.end method

.method public b()Ljava/lang/Class;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lax/b4/c;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lax/b4/c;

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

.method public getSize()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z3/a;->q:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    check-cast v0, Lax/b4/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/c;->h()I

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

.method public recycle()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z3/a;->q:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    check-cast v0, Lax/b4/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/b4/c;->stop()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/Z3/a;->q:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    check-cast v0, Lax/b4/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/b4/c;->i()V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
