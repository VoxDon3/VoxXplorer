.class public Lax/c4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/c4/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lax/c4/d<",
        "Landroid/graphics/Bitmap;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;

.field private final b:Lax/Q3/d;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lax/Q3/d;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/content/res/Resources;

    .line 9
    .line 10
    iput-object p1, p0, Lax/c4/b;->a:Landroid/content/res/Resources;

    .line 11
    .line 12
    invoke-static {p2}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lax/Q3/d;

    .line 17
    .line 18
    iput-object p1, p0, Lax/c4/b;->b:Lax/Q3/d;

    .line 19
    .line 20
    return-void
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
.method public a(Lax/P3/s;)Lax/P3/s;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/P3/s<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lax/P3/s<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c4/b;->a:Landroid/content/res/Resources;

    .line 2
    .line 3
    iget-object v1, p0, Lax/c4/b;->b:Lax/Q3/d;

    .line 4
    .line 5
    invoke-interface {p1}, Lax/P3/s;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/graphics/Bitmap;

    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lax/X3/k;->e(Landroid/content/res/Resources;Lax/Q3/d;Landroid/graphics/Bitmap;)Lax/X3/k;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
