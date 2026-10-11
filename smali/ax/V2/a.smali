.class public Lax/V2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/V2/a$a;
    }
.end annotation


# static fields
.field private static b:Lax/V2/a;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lax/V2/a;->a:Landroid/content/Context;

    .line 9
    .line 10
    return-void
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

.method public static b(Landroid/content/Context;)Lax/V2/a;
    .registers 2

    .line 1
    sget-object v0, Lax/V2/a;->b:Lax/V2/a;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/V2/a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lax/V2/a;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lax/V2/a;->b:Lax/V2/a;

    .line 11
    .line 12
    :cond_b
    sget-object p0, Lax/V2/a;->b:Lax/V2/a;

    .line 13
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
.method public a(Lcom/voxdon/xplorer/bookmark/Bookmark;)V
    .registers 4

    .line 1
    new-instance v0, Lax/V2/a$a;

    .line 2
    .line 3
    iget-object v1, p0, Lax/V2/a;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lax/V2/a$a;-><init>(Landroid/content/Context;Lcom/voxdon/xplorer/bookmark/Bookmark;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    new-array p1, p1, [Ljava/lang/Void;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 12
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
.end method
