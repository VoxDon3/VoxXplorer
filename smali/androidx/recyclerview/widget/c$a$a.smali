.class public final Landroidx/recyclerview/widget/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Landroidx/recyclerview/widget/c$a$b;


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/recyclerview/widget/c$a;->c:Landroidx/recyclerview/widget/c$a;

    .line 5
    .line 6
    iget-boolean v1, v0, Landroidx/recyclerview/widget/c$a;->a:Z

    .line 7
    .line 8
    iput-boolean v1, p0, Landroidx/recyclerview/widget/c$a$a;->a:Z

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/recyclerview/widget/c$a;->b:Landroidx/recyclerview/widget/c$a$b;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/recyclerview/widget/c$a$a;->b:Landroidx/recyclerview/widget/c$a$b;

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
.end method


# virtual methods
.method public a()Landroidx/recyclerview/widget/c$a;
    .registers 4

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/c$a;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/recyclerview/widget/c$a$a;->a:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/recyclerview/widget/c$a$a;->b:Landroidx/recyclerview/widget/c$a$b;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/c$a;-><init>(ZLandroidx/recyclerview/widget/c$a$b;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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

.method public b(Z)Landroidx/recyclerview/widget/c$a$a;
    .registers 2

    .line 1
    iput-boolean p1, p0, Landroidx/recyclerview/widget/c$a$a;->a:Z

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

.method public c(Landroidx/recyclerview/widget/c$a$b;)Landroidx/recyclerview/widget/c$a$a;
    .registers 2

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/c$a$a;->b:Landroidx/recyclerview/widget/c$a$b;

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
