.class Lax/c0/e1$d;
.super Lax/c0/e1$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/c0/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field final a:Lax/c0/e1;

.field final b:Landroid/view/WindowInsetsController;

.field final c:Lax/c0/P;

.field private final d:Lax/B/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/B/k<",
            "Ljava/lang/Object;",
            "Landroid/view/WindowInsetsController$OnControllableInsetsChangedListener;",
            ">;"
        }
    .end annotation
.end field

.field protected e:Landroid/view/Window;


# direct methods
.method constructor <init>(Landroid/view/Window;Lax/c0/e1;Lax/c0/P;)V
    .registers 5

    .line 1
    invoke-static {p1}, Lax/c0/f1;->a(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Lax/c0/e1$d;-><init>(Landroid/view/WindowInsetsController;Lax/c0/e1;Lax/c0/P;)V

    .line 2
    iput-object p1, p0, Lax/c0/e1$d;->e:Landroid/view/Window;

    return-void
.end method

.method constructor <init>(Landroid/view/WindowInsetsController;Lax/c0/e1;Lax/c0/P;)V
    .registers 5

    .line 3
    invoke-direct {p0}, Lax/c0/e1$e;-><init>()V

    .line 4
    new-instance v0, Lax/B/k;

    invoke-direct {v0}, Lax/B/k;-><init>()V

    iput-object v0, p0, Lax/c0/e1$d;->d:Lax/B/k;

    .line 5
    iput-object p1, p0, Lax/c0/e1$d;->b:Landroid/view/WindowInsetsController;

    .line 6
    iput-object p2, p0, Lax/c0/e1$d;->a:Lax/c0/e1;

    .line 7
    iput-object p3, p0, Lax/c0/e1$d;->c:Lax/c0/P;

    return-void
.end method


# virtual methods
.method a(I)V
    .registers 3

    .line 1
    and-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lax/c0/e1$d;->c:Lax/c0/P;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/c0/P;->a()V

    .line 8
    .line 9
    .line 10
    :cond_9
    iget-object v0, p0, Lax/c0/e1$d;->b:Landroid/view/WindowInsetsController;

    .line 11
    .line 12
    and-int/lit8 p1, p1, -0x9

    .line 13
    .line 14
    invoke-static {v0, p1}, Lax/c0/W;->a(Landroid/view/WindowInsetsController;I)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/c0/e1$d;->b:Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, v1}, Lax/c0/g1;->a(Landroid/view/WindowInsetsController;II)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lax/c0/e1$d;->b:Landroid/view/WindowInsetsController;

    .line 8
    .line 9
    invoke-static {v0}, Lax/c0/h1;->a(Landroid/view/WindowInsetsController;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v0, v0, 0x8

    .line 14
    .line 15
    if-eqz v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    return v1
    .line 20
    .line 21
.end method

.method public c(Z)V
    .registers 4

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-eqz p1, :cond_11

    .line 4
    .line 5
    iget-object p1, p0, Lax/c0/e1$d;->e:Landroid/view/Window;

    .line 6
    .line 7
    if-eqz p1, :cond_b

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lax/c0/e1$d;->f(I)V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object p1, p0, Lax/c0/e1$d;->b:Landroid/view/WindowInsetsController;

    .line 13
    .line 14
    invoke-static {p1, v0, v0}, Lax/c0/g1;->a(Landroid/view/WindowInsetsController;II)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    iget-object p1, p0, Lax/c0/e1$d;->e:Landroid/view/Window;

    .line 19
    .line 20
    if-eqz p1, :cond_18

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lax/c0/e1$d;->g(I)V

    .line 23
    .line 24
    .line 25
    :cond_18
    iget-object p1, p0, Lax/c0/e1$d;->b:Landroid/view/WindowInsetsController;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {p1, v1, v0}, Lax/c0/g1;->a(Landroid/view/WindowInsetsController;II)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public d(Z)V
    .registers 4

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-eqz p1, :cond_13

    .line 6
    .line 7
    iget-object p1, p0, Lax/c0/e1$d;->e:Landroid/view/Window;

    .line 8
    .line 9
    if-eqz p1, :cond_d

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lax/c0/e1$d;->f(I)V

    .line 12
    .line 13
    .line 14
    :cond_d
    iget-object p1, p0, Lax/c0/e1$d;->b:Landroid/view/WindowInsetsController;

    .line 15
    .line 16
    invoke-static {p1, v1, v1}, Lax/c0/g1;->a(Landroid/view/WindowInsetsController;II)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_13
    iget-object p1, p0, Lax/c0/e1$d;->e:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz p1, :cond_1a

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lax/c0/e1$d;->g(I)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    iget-object p1, p0, Lax/c0/e1$d;->b:Landroid/view/WindowInsetsController;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p1, v0, v1}, Lax/c0/g1;->a(Landroid/view/WindowInsetsController;II)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method e(I)V
    .registers 3

    .line 1
    and-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lax/c0/e1$d;->c:Lax/c0/P;

    .line 6
    .line 7
    invoke-virtual {v0}, Lax/c0/P;->b()V

    .line 8
    .line 9
    .line 10
    :cond_9
    iget-object v0, p0, Lax/c0/e1$d;->b:Landroid/view/WindowInsetsController;

    .line 11
    .line 12
    and-int/lit8 p1, p1, -0x9

    .line 13
    .line 14
    invoke-static {v0, p1}, Lax/c0/T;->a(Landroid/view/WindowInsetsController;I)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected f(I)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c0/e1$d;->e:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    or-int/2addr p1, v1

    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

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
    .line 22
.end method

.method protected g(I)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/c0/e1$d;->e:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    not-int p1, p1

    .line 12
    and-int/2addr p1, v1

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

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
