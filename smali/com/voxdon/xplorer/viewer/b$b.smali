.class Lcom/voxdon/xplorer/viewer/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/z3/a$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/viewer/b;->d1(Lax/z3/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/z3/a;

.field final synthetic b:Lcom/voxdon/xplorer/viewer/b;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/b;Lax/z3/a;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/b$b;->b:Lcom/voxdon/xplorer/viewer/b;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/viewer/b$b;->a:Lax/z3/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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


# virtual methods
.method public a(Z)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/b$b;->b:Lcom/voxdon/xplorer/viewer/b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/b$b;->a:Lax/z3/a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/ex/photo/f;->y(Landroidx/fragment/app/Fragment;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_11

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/b$b;->b:Lcom/voxdon/xplorer/viewer/b;

    .line 12
    .line 13
    xor-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/viewer/b;->H0(Lcom/voxdon/xplorer/viewer/b;Z)V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method
