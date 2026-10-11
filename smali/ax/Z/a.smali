.class Lax/Z/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lax/Z/k$c;

.field private final b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lax/Z/k$c;Landroid/os/Handler;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/Z/a;->a:Lax/Z/k$c;

    .line 5
    .line 6
    iput-object p2, p0, Lax/Z/a;->b:Landroid/os/Handler;

    .line 7
    .line 8
    return-void
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

.method private a(I)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z/a;->a:Lax/Z/k$c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/Z/a;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v2, Lax/Z/a$b;

    .line 6
    .line 7
    invoke-direct {v2, p0, v0, p1}, Lax/Z/a$b;-><init>(Lax/Z/a;Lax/Z/k$c;I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
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

.method private c(Landroid/graphics/Typeface;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/Z/a;->a:Lax/Z/k$c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/Z/a;->b:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v2, Lax/Z/a$a;

    .line 6
    .line 7
    invoke-direct {v2, p0, v0, p1}, Lax/Z/a$a;-><init>(Lax/Z/a;Lax/Z/k$c;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
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
.method b(Lax/Z/j$e;)V
    .registers 3

    .line 1
    invoke-virtual {p1}, Lax/Z/j$e;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    iget-object p1, p1, Lax/Z/j$e;->a:Landroid/graphics/Typeface;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lax/Z/a;->c(Landroid/graphics/Typeface;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    iget p1, p1, Lax/Z/j$e;->b:I

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lax/Z/a;->a(I)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method
