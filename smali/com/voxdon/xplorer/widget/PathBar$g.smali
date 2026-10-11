.class Lcom/voxdon/xplorer/widget/PathBar$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/widget/PathBar;->g(Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/voxdon/xplorer/widget/PathBar;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/widget/PathBar;Ljava/lang/String;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/PathBar$g;->b:Lcom/voxdon/xplorer/widget/PathBar;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/widget/PathBar$g;->a:Ljava/lang/String;

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
.method public onClick(Landroid/view/View;)V
    .registers 4

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/PathBar$g;->b:Lcom/voxdon/xplorer/widget/PathBar;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/PathBar;->b(Lcom/voxdon/xplorer/widget/PathBar;)Lcom/voxdon/xplorer/widget/PathBar$h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/PathBar$g;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lcom/voxdon/xplorer/widget/PathBar$h;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lax/Q2/a;->i()Lax/Q2/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "navigation"

    .line 17
    .line 18
    const-string v1, "open_folder_back"

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Lax/Q2/a;->m(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/PathBar$g;->b:Lcom/voxdon/xplorer/widget/PathBar;

    .line 25
    .line 26
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/PathBar;->a(Lcom/voxdon/xplorer/widget/PathBar;)Lax/c3/K;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "loc"

    .line 39
    .line 40
    invoke-virtual {p1, v1, v0}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v0, "by"

    .line 45
    .line 46
    const-string v1, "pathbar_directory"

    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, Lax/Q2/a$b;->c(Ljava/lang/String;Ljava/lang/String;)Lax/Q2/a$b;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Lax/Q2/a$b;->e()V

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
